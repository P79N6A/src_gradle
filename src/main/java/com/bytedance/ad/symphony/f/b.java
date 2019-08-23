package com.bytedance.ad.symphony.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ad.symphony.g.a;
import com.bytedance.ad.symphony.model.config.c;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    Map<String, a> f7629a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public boolean f7630b;

    /* renamed from: c  reason: collision with root package name */
    public c f7631c;

    /* renamed from: d  reason: collision with root package name */
    private Context f7632d;

    /* renamed from: e  reason: collision with root package name */
    private long f7633e;

    /* renamed from: f  reason: collision with root package name */
    private String f7634f;
    private String g;

    /* access modifiers changed from: package-private */
    public SharedPreferences a() {
        return com.ss.android.ugc.aweme.q.c.a(this.f7632d, this.f7634f, 0);
    }

    private a b() {
        a aVar = this.f7629a.get("debug_strategy");
        if (aVar == null) {
            aVar = b("debug_strategy");
        }
        if (aVar == null) {
            return a.f7623a;
        }
        return aVar;
    }

    private static String c(String str) {
        if (StringUtils.isEmpty(str) || str.length() < 2) {
            return "";
        }
        return str.substring(0, str.length() - 2);
    }

    public final a a(String str) {
        if (StringUtils.isEmpty(str)) {
            return a.f7623a;
        }
        if (this.f7630b && com.bytedance.ad.symphony.b.b()) {
            return b();
        }
        a aVar = this.f7629a.get(str);
        if (aVar == null) {
            aVar = b(str);
        }
        if (aVar == null) {
            return a.f7623a;
        }
        return aVar;
    }

    private a b(String str) {
        String str2;
        boolean z = true;
        if (a().getInt("key_version", 0) != 1) {
            z = false;
        }
        JSONObject jSONObject = null;
        if (z) {
            str2 = a().getString(str, null);
        } else {
            str2 = null;
        }
        if (StringUtils.isEmpty(str2)) {
            if (this.f7631c == null || this.f7631c.a(c(str)) == null) {
                str2 = this.g;
            } else {
                str2 = this.f7631c.a(c(str));
            }
        }
        StringBuilder sb = new StringBuilder("placement-->");
        sb.append(str);
        sb.append(", strategy-->");
        sb.append(str2);
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception unused) {
        }
        a a2 = a.a(jSONObject);
        if (a2 != null) {
            this.f7629a.put(str, a2);
        }
        return a2;
    }

    public final void a(String str, a aVar) {
        if (!StringUtils.isEmpty(str)) {
            this.f7629a.put(str, aVar);
            if (System.currentTimeMillis() - this.f7633e > 120000) {
                a.a((Runnable) new Runnable() {
                    public final void run() {
                        b bVar = b.this;
                        SharedPreferences.Editor edit = bVar.a().edit();
                        for (String next : bVar.f7629a.keySet()) {
                            a aVar = bVar.f7629a.get(next);
                            if (aVar != null) {
                                String a2 = aVar.a();
                                if (a2 != null) {
                                    edit.putString(next, a2);
                                }
                            }
                        }
                        edit.putInt("key_version", 1);
                        SharedPrefsEditorCompat.apply(edit);
                    }
                });
                this.f7633e = System.currentTimeMillis();
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f7632d = context.getApplicationContext();
        this.f7634f = str;
        this.g = str2;
    }
}
