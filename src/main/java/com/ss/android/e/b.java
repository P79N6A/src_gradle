package com.ss.android.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.ss.android.ugc.aweme.q.c;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static Context f2459b;

    /* renamed from: c  reason: collision with root package name */
    private static c<b> f2460c = new c<b>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object a() {
            return new b();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public a f2461a;

    private static int a() {
        try {
            return c.a(f2459b, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).getInt("json_data", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static b a(Context context) {
        f2459b = context.getApplicationContext();
        return (b) f2460c.b();
    }

    private boolean b(Uri uri) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("needlaunchlog", false);
        int a2 = a();
        if (!booleanQueryParameter || a2 <= 0) {
            return false;
        }
        return true;
    }

    private void a(Map<String, String> map) {
        if (this.f2461a != null) {
            this.f2461a.onEvent(map);
        }
    }

    public static void a(boolean z) {
        try {
            SharedPreferences.Editor edit = c.a(f2459b, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).edit();
            edit.putInt("json_data", 1);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    private static Map<String, String> c(Uri uri) throws UnsupportedEncodingException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQuery().split("&")) {
            int indexOf = str.indexOf("=");
            linkedHashMap.put(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
        linkedHashMap.put("launchlog_protocol", uri.getScheme());
        linkedHashMap.put("launchlog_authority", uri.getAuthority());
        linkedHashMap.put("launchlog_path", uri.getPath());
        return linkedHashMap;
    }

    public final void a(Uri uri) {
        try {
            if (b(uri)) {
                a(c(uri));
            }
        } catch (Exception unused) {
        }
    }

    public final void a(String str) {
        try {
            a(Uri.parse(str));
        } catch (Exception unused) {
        }
    }
}
