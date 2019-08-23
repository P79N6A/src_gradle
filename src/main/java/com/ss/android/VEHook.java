package com.ss.android;

import android.support.annotation.Keep;
import java.util.LinkedList;
import java.util.List;

@Keep
public class VEHook {
    private static List<String> sHookLibs = new LinkedList();

    public static native boolean hook(String[] strArr);

    static {
        System.loadLibrary("vehook");
    }

    public static void setHookLibraries(String[] strArr) {
        for (String add : strArr) {
            sHookLibs.add(add);
        }
    }

    public static boolean hookLibrary(String str) {
        for (String next : sHookLibs) {
            if (str.equals(next)) {
                return hook(new String[]{".*/lib" + next + "\\.so$"});
            }
        }
        return false;
    }
}
