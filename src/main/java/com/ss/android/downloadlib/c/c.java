package com.ss.android.downloadlib.c;

import com.ss.android.downloadlib.addownload.k;
import org.json.JSONObject;

public final class c {
    private static boolean a() {
        if (k.g() == null || k.g().optInt("enable_download_tlog", 0) != 1) {
            return false;
        }
        return true;
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        if (a()) {
        }
    }

    public static void b(String str, String str2, JSONObject jSONObject) {
        if (a()) {
        }
    }
}
