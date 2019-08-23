package com.toutiao.proxyserver.b;

import android.provider.BaseColumns;

public final class b implements BaseColumns {
    public static int a(boolean z) {
        return z ? 1 : 0;
    }

    public static boolean a(int i) {
        return i == 1;
    }
}
