package com.ss.android.download.api.a;

import android.provider.BaseColumns;

public final class a {

    /* renamed from: com.ss.android.download.api.a.a$a  reason: collision with other inner class name */
    public static final class C0337a implements BaseColumns {
        public static boolean a(int i) {
            return i >= 200 && i < 300;
        }

        public static boolean b(int i) {
            return i >= 400 && i < 600;
        }

        public static boolean c(int i) {
            return (i >= 200 && i < 300) || (i >= 400 && i < 600);
        }
    }
}
