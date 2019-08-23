package com.ss.android.excitingvideo.utils;

import com.taobao.android.dexposed.ClassUtils;

public class SSLog {
    public static void debug(String str) {
    }

    public static void error(long j, String str) {
    }

    public static void error(String str) {
    }

    public static void error(String str, Throwable th) {
    }

    private SSLog() {
    }

    private static String generateMsg(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 4) {
            return str;
        }
        StackTraceElement stackTraceElement = stackTrace[4];
        String className = stackTraceElement.getClassName();
        if (className.split("\\.").length > 0) {
            className = r2[r2.length - 1] + ".java";
        }
        if (className.contains(ClassUtils.INNER_CLASS_SEPARATOR)) {
            className = className.split("\\$")[0] + ".java";
        }
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        if (lineNumber < 0) {
            lineNumber = 0;
        }
        return "[ (" + className + ":" + lineNumber + ")#" + methodName + " ] " + str;
    }
}
