package com.ta.utdid2.b.a;

public class i {
    /* renamed from: a  reason: collision with other method in class */
    public static boolean m17a(String str) {
        if (str == null || str.length() <= 0) {
            return true;
        }
        return false;
    }

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c2 : str.toCharArray()) {
            i = (i * 31) + c2;
        }
        return i;
    }
}
