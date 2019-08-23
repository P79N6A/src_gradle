package com.ss.android.downloadlib.core.download;

import android.net.Uri;
import android.provider.BaseColumns;
import android.text.TextUtils;
import com.ss.android.downloadlib.c.k;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static String f29028a = (b() + ".newmedia.downloads");

    public static final class a implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static Uri f29029a = Uri.parse("content://" + j.f29028a + "/all_downloads");
    }

    private static String b() {
        String str;
        try {
            str = k.a();
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "com.ss.android.newmedia.downloads";
        }
        return str;
    }

    public static void a() {
        try {
            f29028a = b() + ".newmedia.downloads";
            a.f29029a = Uri.parse("content://" + f29028a + "/all_downloads");
        } catch (Exception unused) {
        }
    }
}
