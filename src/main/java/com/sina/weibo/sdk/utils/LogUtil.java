package com.sina.weibo.sdk.utils;

public class LogUtil {
    public static boolean sIsLogEnable;

    public static void disableLog() {
        sIsLogEnable = false;
    }

    public static void enableLog() {
        sIsLogEnable = true;
    }

    public static String getStackTraceMsg() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        return String.valueOf(stackTraceElement.getFileName()) + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName();
    }

    public static void d(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder(String.valueOf(stackTraceElement.getFileName()));
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }

    public static void e(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder(String.valueOf(stackTraceElement.getFileName()));
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }

    public static void i(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder(String.valueOf(stackTraceElement.getFileName()));
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }

    public static void v(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder(String.valueOf(stackTraceElement.getFileName()));
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }

    public static void w(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder(String.valueOf(stackTraceElement.getFileName()));
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }
}
