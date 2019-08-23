package com.ss.android.socialbase.downloader.b;

import android.text.TextUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static C0373a f30846a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f30847b = 4;

    /* renamed from: com.ss.android.socialbase.downloader.b.a$a  reason: collision with other inner class name */
    public static abstract class C0373a {
    }

    public static boolean a() {
        if (f30847b <= 3) {
            return true;
        }
        return false;
    }

    public static void a(int i) {
        f30847b = i;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "DownloaderLogger";
        }
        return "Downloader-" + str;
    }

    public static void a(String str, String str2) {
        if (f30846a != null) {
            a(str);
        }
    }
}
