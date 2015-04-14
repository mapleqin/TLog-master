/*******************************************************************************
 * Copyright 2013-2014 Toaker TLog-master
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.toaker.common.tlog;

import android.util.Log;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Default implementation of {@link LoggingDelegate}.
 */
public class TLogDefaultLoggingDelegate implements LoggingDelegate {

  public static final TLogDefaultLoggingDelegate sInstance = new TLogDefaultLoggingDelegate();

  private String mApplicationTag = "unknown";
  private int mMinimumLoggingLevel = Log.WARN;

  public static TLogDefaultLoggingDelegate getInstance() {
    return sInstance;
  }

  private TLogDefaultLoggingDelegate() {
  }

  /**
   * Sets an application tag that is used for checking if a log line is loggable and also
   * to prefix to all log lines.
   *
   * @param tag the tag
   */
  public void setApplicationTag(String tag) {
    mApplicationTag = tag;
  }


  @Override
  public void setMinimumLoggingLevel(int level) {
    mMinimumLoggingLevel = level;
  }

  @Override
  public int getMinimumLoggingLevel() {
    return mMinimumLoggingLevel;
  }

  @Override
  public boolean isLoggable(int level) {
    return mMinimumLoggingLevel <= level;
  }

  @Override
  public boolean isLoggable(String tag, int level) {
    try {
      return mMinimumLoggingLevel <= level && Log.isLoggable(tag, level);
    } catch (IllegalArgumentException e) {
      // isLoggable yields an IllegalArgumentException if tag.length() > 23.  we could
      // hard-code this constant in here, but if the SDK changes the length, we're in for a
      // real treat.  thus, we catch the exception.
      //
      // We're making an educated guess as to a reasonably policy for when the exception
      // happens, which is to log.
      return true;
    }
  }

  @Override
  public void v(String tag, String msg) {
    println(Log.VERBOSE, tag, msg);
  }

  @Override
  public void v(String tag, String msg, Throwable tr) {
    println(Log.VERBOSE, tag, msg, tr);
  }

  @Override
  public void d(String tag, String msg) {
    println(Log.DEBUG, tag, msg);
  }

  @Override
  public void d(String tag, String msg, Throwable tr) {
    println(Log.DEBUG, tag, msg, tr);
  }

  @Override
  public void i(String tag, String msg) {
    println(Log.INFO, tag, msg);
  }

  @Override
  public void i(String tag, String msg, Throwable tr) {
    println(Log.INFO, tag, msg, tr);
  }

  @Override
  public void w(String tag, String msg) {
    println(Log.WARN, tag, msg);
  }

  @Override
  public void w(String tag, String msg, Throwable tr) {
    println(Log.WARN, tag, msg, tr);
  }

  @Override
  public void e(String tag, String msg) {
    println(Log.ERROR, tag, msg);
  }

  @Override
  public void e(String tag, String msg, Throwable tr) {
    println(Log.ERROR, tag, msg, tr);
  }

  /**
   * <p> Note: this gets forwarded to {@code android.util.Log.e} as {@code android.util.Log.wtf}
   * might crash the app.
   */
  @Override
  public void wtf(String tag, String msg) {
    println(Log.ERROR, tag, msg);
  }

  /**
   * <p> Note: this gets forwarded to {@code android.util.Log.e} as {@code android.util.Log.wtf}
   * might crash the app.
   */
  @Override
  public void wtf(String tag, String msg, Throwable tr) {
    println(Log.ERROR, tag, msg, tr);
  }

  @Override
  public void log(int priority, String tag, String msg) {
    println(priority, tag, msg);
  }

  private void println(int priority, String tag, String msg) {
    Log.println(priority, prefixTag(tag), msg);
  }

  private void println(int priority, String tag, String msg, Throwable tr) {
    Log.println(priority, prefixTag(tag), getMsg(msg, tr));
  }

  private String prefixTag(String tag) {
    if (mApplicationTag != null) {
      return mApplicationTag + ":" + tag;
    } else {
      return tag;
    }
  }

  private static String getMsg(String msg, Throwable tr) {
    return msg + '\n' + getStackTraceString(tr);
  }

  private static String getStackTraceString(Throwable tr) {
    if (tr == null) {
      return "";
    }
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    tr.printStackTrace(pw);
    return sw.toString();
  }
}
