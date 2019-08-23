package com.ss.android.download.b;

import android.net.Uri;
import android.provider.BaseColumns;

public final class c {

    public static final class a implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static final Uri f28513a = Uri.parse("content://com.ss.android.newmedia.downloads/all_downloads");

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
