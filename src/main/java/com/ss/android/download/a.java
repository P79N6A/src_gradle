package com.ss.android.download;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28417a = ("/" + Environment.DIRECTORY_DOWNLOADS);

    /* renamed from: b  reason: collision with root package name */
    public static final String f28418b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f28419c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f28420d;

    static {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(Build.VERSION.RELEASE);
        boolean z3 = !TextUtils.isEmpty(Build.ID);
        if (!"REL".equals(Build.VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) {
            z = false;
        }
        sb.append("SsAndroidDownloadManager");
        if (z2) {
            sb.append("/");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append(" (Linux; U; Android");
        if (z2) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        if (z || z3) {
            sb.append(";");
            if (z) {
                sb.append(" ");
                sb.append(Build.MODEL);
            }
            if (z3) {
                sb.append(" Build/");
                sb.append(Build.ID);
            }
        }
        sb.append(")");
        f28418b = sb.toString();
        boolean isLoggable = Log.isLoggable("SsDownloadManager", 2);
        f28419c = isLoggable;
        f28420d = isLoggable;
    }
}
