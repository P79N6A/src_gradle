package com.ss.android.ad.splash.core;

import android.support.annotation.Nullable;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.utils.d;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.g;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static n f27711a;

    private n() {
    }

    public static n a() {
        if (f27711a == null) {
            synchronized (n.class) {
                if (f27711a == null) {
                    f27711a = new n();
                }
            }
        }
        return f27711a;
    }

    @Nullable
    static List<b> b() {
        JSONArray jSONArray;
        try {
            String string = r.a().f27732a.getString("splash_ad_first_show_data", "");
            if (!g.a(string)) {
                jSONArray = new JSONArray(string);
            } else {
                jSONArray = new JSONArray();
            }
            return f.a(jSONArray, 0, true);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public com.ss.android.ad.splash.core.c.f c() {
        long currentTimeMillis = System.currentTimeMillis();
        String e2 = r.a().e();
        String string = r.a().f27732a.getString("splash_ad_data", "");
        new StringBuilder("read sp data time cost: ").append(System.currentTimeMillis() - currentTimeMillis);
        com.ss.android.ad.splash.core.c.f fVar = new com.ss.android.ad.splash.core.c.f();
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<b> b2 = b(e2);
            List<b> b3 = b(string);
            Map<String, b> a2 = f.a(b2);
            fVar.f27634b = b3;
            fVar.f27635c = a2;
            fVar.f27633a = b2;
            if (!d.a(b3)) {
                fVar.f27637e = com.ss.android.ad.splash.core.c.f.a(b3);
            } else {
                fVar.f27637e = com.ss.android.ad.splash.core.c.f.a(b2);
            }
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis2);
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    static List<b> a(String str) {
        JSONArray jSONArray;
        try {
            long f2 = r.a().f();
            long currentTimeMillis = System.currentTimeMillis();
            if (!g.a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            List<b> a2 = f.a(jSONArray, f2, true);
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis);
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    private static List<b> b(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!g.a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            List<b> a2 = f.a(jSONArray, false);
            new StringBuilder("parseSplashAdList time : ").append(System.currentTimeMillis() - currentTimeMillis);
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }
}
