package com.ss.android.d.c;

public final class b {
    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length < 13 || length > 160) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
