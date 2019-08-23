package com.ta.utdid2.b.a;

public class j {
    public static final String TAG = "com.ta.utdid2.b.a.j";

    public static boolean a(long j, int i) {
        if ((System.currentTimeMillis() - j) / 86400000 < ((long) i)) {
            return true;
        }
        return false;
    }
}
