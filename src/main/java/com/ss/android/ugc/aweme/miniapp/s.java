package com.ss.android.ugc.aweme.miniapp;

import android.content.Context;
import com.bytedance.crash.f;
import com.bytedance.crash.i.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.applog.z;
import com.ss.android.d.a.d;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55909a;

    /* renamed from: b  reason: collision with root package name */
    public String f55910b;

    /* renamed from: c  reason: collision with root package name */
    private Context f55911c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f55912d = new HashMap();

    public final String d() {
        return this.f55910b;
    }

    public final long c() {
        if (PatchProxy.isSupport(new Object[0], this, f55909a, false, 59080, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f55909a, false, 59080, new Class[0], Long.TYPE)).longValue();
        }
        long j = 0;
        try {
            j = Long.parseLong(AppLog.getUserId());
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    public final Map<String, Object> a() {
        if (PatchProxy.isSupport(new Object[0], this, f55909a, false, 59077, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f55909a, false, 59077, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        NetUtil.putCommonParams(hashMap2, true);
        hashMap.putAll(hashMap2);
        hashMap.putAll(this.f55912d);
        if (!hashMap.containsKey("channel")) {
            hashMap.put("channel", d.c());
        }
        if (!hashMap.containsKey("release_build")) {
            hashMap.put("release_build", d.f28348e);
        }
        return hashMap;
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f55909a, false, 59079, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55909a, false, 59079, new Class[0], String.class);
        } else if (a.b(this.f55911c)) {
            return z.a();
        } else {
            if (!PatchProxy.isSupport(new Object[0], this, f55909a, false, 59081, new Class[0], String.class)) {
                return c.a(this.f55911c, com.ss.android.d.a.a.a(), 0).getString("device_id", "");
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55909a, false, 59081, new Class[0], String.class);
        }
    }

    public s(Context context) {
        this.f55911c = context;
        if (PatchProxy.isSupport(new Object[0], this, f55909a, false, 59082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55909a, false, 59082, new Class[0], Void.TYPE);
            return;
        }
        AppLog.addSessionHook(new AppLog.j() {
            public final void a(long j) {
            }

            public final void a(long j, String str, JSONObject jSONObject) {
            }

            public final void b(long j, String str, JSONObject jSONObject) {
                s.this.f55910b = str;
            }
        });
    }
}
