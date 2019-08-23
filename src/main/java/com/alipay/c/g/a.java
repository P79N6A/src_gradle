package com.alipay.c.g;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.c.f.d;
import com.alipay.c.f.g;
import com.alipay.c.f.h;
import com.alipay.c.f.i;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f5339b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f5340c = new Object();

    /* renamed from: a  reason: collision with root package name */
    Context f5341a;

    /* renamed from: com.alipay.c.g.a$a  reason: collision with other inner class name */
    public interface C0040a {
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f5342a;

        /* renamed from: b  reason: collision with root package name */
        public String f5343b;

        /* renamed from: c  reason: collision with root package name */
        public String f5344c;

        /* renamed from: d  reason: collision with root package name */
        public String f5345d;

        public b() {
        }
    }

    private a(Context context) {
        this.f5341a = context;
    }

    public static a a(Context context) {
        if (f5339b == null) {
            synchronized (f5340c) {
                if (f5339b == null) {
                    f5339b = new a(context);
                }
            }
        }
        return f5339b;
    }

    public final synchronized b a() {
        b bVar;
        bVar = new b();
        try {
            bVar.f5342a = com.alipay.c.a.a.a(this.f5341a, "");
            bVar.f5343b = h.c(this.f5341a);
            bVar.f5344c = com.alipay.c.a.a.a(this.f5341a);
            bVar.f5345d = com.alipay.c.e.a.a();
        } catch (Throwable unused) {
        }
        return bVar;
    }

    public final void a(int i, Map<String, String> map, C0040a aVar) {
        com.alipay.c.b.a.a().f5315a = 0;
        String a2 = h.a(this.f5341a);
        String b2 = com.alipay.c.b.a.a().b();
        if (com.alipay.d.a.a.a.a.b(a2) && !com.alipay.d.a.a.a.a.a(a2, b2)) {
            com.alipay.c.f.a.a(this.f5341a);
            d.a(this.f5341a);
            g.a(this.f5341a);
            i.f5338f.clear();
            i.f5333a = "";
            i.f5334b = "";
            i.f5336d = "";
            i.f5337e = "";
            i.f5335c = "";
        }
        if (!com.alipay.d.a.a.a.a.a(a2, b2)) {
            try {
                SharedPreferences.Editor edit = c.a(this.f5341a, "vkeyid_settings", 0).edit();
                if (edit != null) {
                    edit.putString("last_apdid_env", com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), b2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
        String a3 = com.alipay.d.a.a.a.a.a(map, "utdid", "");
        String a4 = com.alipay.d.a.a.a.a.a(map, "tid", "");
        String a5 = com.alipay.d.a.a.a.a.a(map, "userId", "");
        if (com.alipay.d.a.a.a.a.a(a3)) {
            a3 = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("utdid", a3);
        hashMap.put("tid", a4);
        hashMap.put("userId", a5);
        hashMap.put("appName", "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put("rpcVersion", "3");
        com.alipay.c.h.b.f5350a.a((Runnable) new b(this, hashMap, null));
    }
}
