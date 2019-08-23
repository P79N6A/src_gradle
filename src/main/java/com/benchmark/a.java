package com.benchmark;

import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.effectmanager.common.f.e;
import java.io.File;

public final class a {
    public static void a(Throwable th) {
        ExceptionMonitor.ensureNotReachHere(th, "benchmark test");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        int indexOf = str2.indexOf("?");
        if (indexOf == -1) {
            return false;
        }
        String substring = str2.substring(indexOf + 1);
        if (TextUtils.isEmpty(substring) || !substring.equalsIgnoreCase(e.a(file))) {
            return false;
        }
        return true;
    }

    public static boolean a(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
