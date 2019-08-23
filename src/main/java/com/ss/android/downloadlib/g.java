package com.ss.android.downloadlib;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.download.api.b.a.b;
import com.ss.android.download.api.c.f;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.ugc.aweme.q.c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class g {

    /* renamed from: c  reason: collision with root package name */
    private static g f29052c;

    /* renamed from: a  reason: collision with root package name */
    public Context f29053a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Long, b> f29054b = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private List<f> f29055d;

    public static g a() {
        if (f29052c == null) {
            synchronized (g.class) {
                if (f29052c == null) {
                    f29052c = new g(k.a());
                }
            }
        }
        return f29052c;
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(b(str))) {
            return true;
        }
        return false;
    }

    private g(Context context) {
        if (context != null) {
            this.f29053a = context.getApplicationContext();
        }
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return c.a(this.f29053a, "ss_package_url", 0).getString(str, "");
    }

    public final boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return c.a(this.f29053a, "ss_fake_download", 0).getBoolean(str, false);
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        if (this.f29055d == null || TextUtils.isEmpty(str)) {
            return false;
        }
        for (f fVar : this.f29055d) {
            if (TextUtils.equals(str, fVar.appPackageName)) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            try {
                SharedPreferences.Editor edit = c.a(this.f29053a, "ss_fake_download", 0).edit();
                edit.putBoolean(str, true);
                edit.apply();
            } catch (Exception unused) {
            }
        }
    }
}
