package com.ss.android.ugc.effectmanager.common;

public final class c {
    public static String a(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf("_v");
        if (lastIndexOf2 > 0) {
            return str.substring(lastIndexOf + 1, lastIndexOf2);
        }
        int a2 = f.a(str, ".model|.dat");
        if (a2 > 0) {
            return str.substring(lastIndexOf + 1, a2);
        }
        return str.substring(lastIndexOf + 1, str.length());
    }
}
