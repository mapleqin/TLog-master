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

/**
 *
 * author soulwolf
 * Create by 2015/4/14 13:29
 */
public final class TLog {

    public static final int VERBOSE = Log.VERBOSE;

    public static final int DEBUG = Log.DEBUG;

    public static final int INFO = Log.INFO;

    public static final int WARN = Log.WARN;

    public static final int ERROR = Log.ERROR;

    public static final int ASSERT = Log.ASSERT;


    public static void v(String tag, String msg) {
        Log.v(tag, msg);
    }

    public static void v(String tag, String msg, Object arg1) {
        Log.v(tag, formatString(msg, arg1));
    }

    public static void v(String tag, String msg, Object arg1, Object arg2) {
        Log.v(tag, formatString(msg, arg1, arg2));
    }

    public static void v(String tag, String msg, Object arg1, Object arg2, Object arg3) {
        Log.v(tag, formatString(msg, arg1, arg2, arg3));
    }

    public static void v(String tag, String msg, Object arg1, Object arg2, Object arg3, Object arg4) {
        Log.v(tag, formatString(msg, arg1, arg2, arg3, arg4));
    }

    public static void v(Class<?> cls, String msg) {
        Log.v(getTag(cls), msg);
    }

    public static void v(Class<?> cls, String msg, Object arg1) {
        Log.v(getTag(cls), formatString(msg, arg1));
    }

    public static void v(Class<?> cls, String msg, Object arg1, Object arg2) {
        Log.v(getTag(cls), formatString(msg, arg1, arg2));
    }

    public static void v(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3) {
        v(cls, formatString(msg, arg1, arg2, arg3));
    }

    public static void v(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3,
                         Object arg4) {
        Log.v(getTag(cls), formatString(msg, arg1, arg2, arg3, arg4));
    }

    public static void v(String tag, String msg, Object... args) {
        Log.v(tag, formatString(msg, args));
    }

    public static void v(String tag, Throwable tr, String msg, Object... args) {
        Log.v(tag, formatString(msg, args), tr);
    }

    public static void v(Class<?> cls, String msg, Object... args) {
        Log.v(getTag(cls), formatString(msg, args));
    }

    public static void v(Class<?> cls, Throwable tr, String msg, Object... args) {
        Log.v(getTag(cls), formatString(msg, args), tr);
    }

    public static void v(String tag, String msg, Throwable tr) {
        Log.v(tag, msg, tr);
    }

    public static void v(Class<?> cls, String msg, Throwable tr) {
        Log.v(getTag(cls), msg, tr);
    }

    public static void d(String tag, String msg) {
        Log.d(tag, msg);
    }

    public static void d(String tag, String msg, Object arg1) {
        Log.d(tag, formatString(msg, arg1));
    }

    public static void d(String tag, String msg, Object arg1, Object arg2) {
        Log.d(tag, formatString(msg, arg1, arg2));
    }

    public static void d(String tag, String msg, Object arg1, Object arg2, Object arg3) {

        Log.d(tag, formatString(msg, arg1, arg2, arg3));
    }

    public static void d(String tag, String msg, Object arg1, Object arg2, Object arg3, Object arg4) {

        Log.d(tag, formatString(msg, arg1, arg2, arg3, arg4));
    }

    public static void d(Class<?> cls, String msg) {

        Log.d(getTag(cls), msg);
    }

    public static void d(Class<?> cls, String msg, Object arg1) {

        Log.d(getTag(cls), formatString(msg, arg1));
    }

    public static void d(Class<?> cls, String msg, Object arg1, Object arg2) {

        Log.d(getTag(cls), formatString(msg, arg1, arg2));
    }

    public static void d(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3) {

        Log.d(getTag(cls), formatString(msg, arg1, arg2, arg3));
    }

    public static void d(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3,
                         Object arg4) {

        Log.d(getTag(cls), formatString(msg, arg1, arg2, arg3, arg4));
    }

    public static void d(String tag, String msg, Object... args) {

        d(tag, formatString(msg, args));
    }

    public static void d(String tag, Throwable tr, String msg, Object... args) {

        d(tag, formatString(msg, args), tr);
    }

    public static void d(Class<?> cls, String msg, Object... args) {

        Log.d(getTag(cls), formatString(msg, args));
    }

    public static void d(Class<?> cls, Throwable tr, String msg, Object... args) {

        Log.d(getTag(cls), formatString(msg, args), tr);
    }

    public static void d(String tag, String msg, Throwable tr) {

        Log.d(tag, msg, tr);
    }

    public static void d(Class<?> cls, String msg, Throwable tr) {

        Log.d(getTag(cls), msg, tr);
    }

    public static void i(String tag, String msg) {

        Log.i(tag, msg);
    }

    public static void i(String tag, String msg, Object arg1) {

        Log.i(tag, formatString(msg, arg1));
    }

    public static void i(String tag, String msg, Object arg1, Object arg2) {

        Log.i(tag, formatString(msg, arg1, arg2));
    }

    public static void i(String tag, String msg, Object arg1, Object arg2, Object arg3) {

        Log.i(tag, formatString(msg, arg1, arg2, arg3));
    }

    public static void i(String tag, String msg, Object arg1, Object arg2, Object arg3, Object arg4) {

        Log.i(tag, formatString(msg, arg1, arg2, arg3, arg4));
    }

    public static void i(Class<?> cls, String msg) {

        Log.i(getTag(cls), msg);
    }

    public static void i(Class<?> cls, String msg, Object arg1) {

        Log.i(getTag(cls), formatString(msg, arg1));
    }

    public static void i(Class<?> cls, String msg, Object arg1, Object arg2) {

        Log.i(getTag(cls), formatString(msg, arg1, arg2));
    }

    public static void i(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3) {

        Log.i(getTag(cls), formatString(msg, arg1, arg2, arg3));
    }

    public static void i(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3,
                         Object arg4) {

        Log.i(getTag(cls), formatString(msg, arg1, arg2, arg3, arg4));
    }

    public static void i(String tag, String msg, Object... args) {

        Log.i(tag, formatString(msg, args));
    }

    public static void i(String tag, Throwable tr, String msg, Object... args) {

        Log.i(tag, formatString(msg, args), tr);
    }

    public static void i(Class<?> cls, String msg, Object... args) {

        Log.i(getTag(cls), formatString(msg, args));
    }

    public static void i(Class<?> cls, Throwable tr, String msg, Object... args) {
        Log.i(getTag(cls), formatString(msg, args), tr);
    }

    public static void i(String tag, String msg, Throwable tr) {

        Log.i(tag, msg, tr);
    }

    public static void i(Class<?> cls, String msg, Throwable tr) {

        Log.i(getTag(cls), msg, tr);
    }

    public static void w(String tag, String msg) {
        Log.w(tag, msg);
    }

    public static void w(Class<?> cls, String msg) {
        Log.w(getTag(cls), msg);
    }

    public static void w(String tag, String msg, Object... args) {
        Log.w(tag, formatString(msg, args));
    }

    public static void w(String tag, Throwable tr, String msg, Object... args) {
        Log.w(tag, formatString(msg, args), tr);
    }

    public static void w(Class<?> cls, String msg, Object... args) {
        Log.w(getTag(cls), formatString(msg, args));
    }

    public static void w(Class<?> cls, Throwable tr, String msg, Object... args) {
        w(cls, formatString(msg, args), tr);
    }

    public static void w(String tag, String msg, Throwable tr) {
        Log.w(tag, msg, tr);
    }

    public static void w(Class<?> cls, String msg, Throwable tr) {
        Log.w(getTag(cls), msg, tr);
    }

    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }

    public static void e(Class<?> cls, String msg) {
        Log.e(getTag(cls), msg);
    }

    public static void e(String tag, String msg, Object... args) {
        Log.e(tag, formatString(msg, args));
    }

    public static void e(String tag, Throwable tr, String msg, Object... args) {
        Log.e(tag, formatString(msg, args), tr);
    }

    public static void e(Class<?> cls, String msg, Object... args) {
        Log.e(getTag(cls), formatString(msg, args));
    }

    public static void e(Class<?> cls, Throwable tr, String msg, Object... args) {
        Log.e(getTag(cls), formatString(msg, args), tr);
    }

    public static void e(String tag, String msg, Throwable tr) {
        Log.e(tag, msg, tr);
    }

    public static void e(Class<?> cls, String msg, Throwable tr) {
        Log.e(getTag(cls), msg, tr);
    }

    public static void wtf(String tag, String msg) {
        Log.e(tag, msg);
    }

    public static void wtf(Class<?> cls, String msg) {
        Log.e(getTag(cls), msg);
    }

    public static void wtf(String tag, String msg, Object... args) {
        Log.wtf(tag, formatString(msg, args));
    }

    public static void wtf(String tag, Throwable tr, String msg, Object... args) {
        Log.wtf(tag, formatString(msg, args), tr);
    }

    public static void wtf(Class<?> cls, String msg, Object... args) {
        Log.wtf(getTag(cls), formatString(msg, args));
    }

    public static void wtf(Class<?> cls, Throwable tr, String msg, Object... args) {
        Log.wtf(getTag(cls), formatString(msg, args), tr);
    }

    public static void wtf(String tag, String msg, Throwable tr) {
        Log.wtf(tag, msg, tr);
    }

    public static void wtf(Class<?> cls, String msg, Throwable tr) {
        Log.wtf(getTag(cls), msg, tr);
    }

    private static String formatString(String str, Object... args) {
        return String.format(null, str, args);
    }

    private static String getTag(Class<?> clazz) {
        return clazz.getSimpleName();
    }
}
