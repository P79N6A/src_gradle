package com.tencent.open.web.security;

public class JniInterface {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f79767a;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);
}
