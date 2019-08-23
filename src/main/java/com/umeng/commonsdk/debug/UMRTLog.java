package com.umeng.commonsdk.debug;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class UMRTLog {
    private UMRTLog() {
    }

    private static boolean shouldOutput() {
        if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(getSystemProperty("debug.umeng.rtlog", PushConstants.PUSH_TYPE_NOTIFY))) {
            return true;
        }
        return false;
    }

    public static void d(String str, String str2) {
        shouldOutput();
    }

    public static void e(String str, String str2) {
        shouldOutput();
    }

    public static void i(String str, String str2) {
        shouldOutput();
    }

    public static void sd(String str, String str2) {
        shouldOutput();
    }

    public static void se(String str, String str2) {
        shouldOutput();
    }

    public static void si(String str, String str2) {
        shouldOutput();
    }

    public static void sv(String str, String str2) {
        shouldOutput();
    }

    public static void sw(String str, String str2) {
        shouldOutput();
    }

    public static void v(String str, String str2) {
        shouldOutput();
    }

    public static void w(String str, String str2) {
        shouldOutput();
    }

    private static String getSystemProperty(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Throwable unused) {
            return str2;
        }
    }

    private static String warpperMsg(String str, boolean z) {
        if (!z) {
            return str;
        }
        StringBuffer stringBuffer = null;
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("<");
                stringBuffer2.append(fileName);
                stringBuffer2.append(":");
                stringBuffer2.append(methodName);
                stringBuffer2.append(":");
                stringBuffer2.append(lineNumber);
                stringBuffer2.append("> ");
                stringBuffer2.append(str);
                stringBuffer = stringBuffer2;
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}