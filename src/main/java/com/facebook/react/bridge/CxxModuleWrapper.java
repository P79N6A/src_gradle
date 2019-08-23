package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    public static String getAbsolutePath(String str) {
        return str;
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);

    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        System.loadLibrary(str);
        return makeDsoNative(getAbsolutePath(str), str2);
    }
}
