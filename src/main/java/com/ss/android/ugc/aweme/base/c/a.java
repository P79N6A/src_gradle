package com.ss.android.ugc.aweme.base.c;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.d;
import com.ss.android.ugc.aweme.base.sharedpref.f;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34671a;

    /* renamed from: f  reason: collision with root package name */
    private static final Gson f34672f = new Gson();
    private static final Type g = new TypeToken<Map<String, Map<String, Long>>>() {
    }.getType();

    /* renamed from: b  reason: collision with root package name */
    private final String f34673b;

    /* renamed from: c  reason: collision with root package name */
    private Context f34674c;

    /* renamed from: d  reason: collision with root package name */
    private C0445a f34675d;

    /* renamed from: e  reason: collision with root package name */
    private final String f34676e;
    private Map<String, Long> h;
    private Map<String, Long> i;
    private Map<String, Long> j;
    private Map<String, Map<String, Long>> k;

    /* renamed from: com.ss.android.ugc.aweme.base.c.a$a  reason: collision with other inner class name */
    public enum C0445a {
        PERSISTENT,
        APP_ALIVE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final synchronized String a() {
        if (PatchProxy.isSupport(new Object[0], this, f34671a, false, 24626, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f34671a, false, 24626, new Class[0], String.class);
        }
        return f34672f.toJson((Object) this.k);
    }

    public final synchronized JSONObject b() throws JSONException {
        if (PatchProxy.isSupport(new Object[0], this, f34671a, false, 24627, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f34671a, false, 24627, new Class[0], JSONObject.class);
        }
        return new JSONObject(a());
    }

    private f b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34671a, false, 24628, new Class[]{String.class}, f.class)) {
            return d.a(this.f34674c, str2);
        }
        return (f) PatchProxy.accessDispatch(new Object[]{str2}, this, f34671a, false, 24628, new Class[]{String.class}, f.class);
    }

    public final synchronized a a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34671a, false, 24622, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f34671a, false, 24622, new Class[]{String.class}, a.class);
        }
        return a(str, 1);
    }

    public a(Context context, String str) {
        this(context, str, C0445a.PERSISTENT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ss.android.ugc.aweme.base.c.a a(java.lang.String r15, long r16) {
        /*
            r14 = this;
            r8 = r14
            r0 = r15
            monitor-enter(r14)
            r9 = 2
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0083 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x0083 }
            r11 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0083 }
            r13 = 1
            r1[r13] = r2     // Catch:{ all -> 0x0083 }
            com.meituan.robust.ChangeQuickRedirect r3 = f34671a     // Catch:{ all -> 0x0083 }
            r4 = 0
            r5 = 24623(0x602f, float:3.4504E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0083 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ all -> 0x0083 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0083 }
            r6[r13] = r2     // Catch:{ all -> 0x0083 }
            java.lang.Class<com.ss.android.ugc.aweme.base.c.a> r7 = com.ss.android.ugc.aweme.base.c.a.class
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x004e
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0083 }
            r1[r10] = r0     // Catch:{ all -> 0x0083 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0083 }
            r1[r13] = r0     // Catch:{ all -> 0x0083 }
            com.meituan.robust.ChangeQuickRedirect r3 = f34671a     // Catch:{ all -> 0x0083 }
            r4 = 0
            r5 = 24623(0x602f, float:3.4504E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0083 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ all -> 0x0083 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0083 }
            r6[r13] = r0     // Catch:{ all -> 0x0083 }
            java.lang.Class<com.ss.android.ugc.aweme.base.c.a> r7 = com.ss.android.ugc.aweme.base.c.a.class
            r2 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0083 }
            com.ss.android.ugc.aweme.base.c.a r0 = (com.ss.android.ugc.aweme.base.c.a) r0     // Catch:{ all -> 0x0083 }
            monitor-exit(r14)
            return r0
        L_0x004e:
            java.util.Map<java.lang.String, java.lang.Long> r1 = r8.h     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.get(r15)     // Catch:{ all -> 0x0083 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x005d
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0083 }
            goto L_0x0067
        L_0x005d:
            long r1 = r1.longValue()     // Catch:{ all -> 0x0083 }
            r3 = 0
            long r1 = r1 + r11
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0083 }
        L_0x0067:
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.h     // Catch:{ all -> 0x0083 }
            r2.put(r15, r1)     // Catch:{ all -> 0x0083 }
            com.ss.android.ugc.aweme.base.c.a$a r0 = r8.f34675d     // Catch:{ all -> 0x0083 }
            com.ss.android.ugc.aweme.base.c.a$a r1 = com.ss.android.ugc.aweme.base.c.a.C0445a.PERSISTENT     // Catch:{ all -> 0x0083 }
            if (r0 != r1) goto L_0x0081
            java.lang.String r0 = r8.f34676e     // Catch:{ all -> 0x0083 }
            com.ss.android.ugc.aweme.base.sharedpref.f r0 = r14.b(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "raw"
            java.lang.String r2 = r14.a()     // Catch:{ all -> 0x0083 }
            r0.b((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0083 }
        L_0x0081:
            monitor-exit(r14)
            return r8
        L_0x0083:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.c.a.a(java.lang.String, long):com.ss.android.ugc.aweme.base.c.a");
    }

    private a(Context context, String str, C0445a aVar) {
        this.h = new LinkedHashMap();
        this.i = new ArrayMap();
        this.j = new LinkedHashMap();
        this.k = new ArrayMap();
        this.k.put("events", this.h);
        this.k.put("durations", this.j);
        this.f34674c = context.getApplicationContext();
        this.f34673b = str;
        this.f34675d = aVar;
        if (!TextUtils.isEmpty(str)) {
            this.f34676e = str + "_funnel";
            switch (aVar) {
                case PERSISTENT:
                    Map map = (Map) f34672f.fromJson(b(this.f34676e).a("raw", ""), g);
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            Map map2 = this.k.get(entry.getKey());
                            if (!(map2 == null || entry.getValue() == null)) {
                                map2.putAll((Map) entry.getValue());
                            }
                        }
                        return;
                    }
                    break;
                case APP_ALIVE:
                    f b2 = b(this.f34676e);
                    if (!PatchProxy.isSupport(new Object[0], b2, f.f34885a, false, 24906, new Class[0], Void.TYPE)) {
                        b2.a().clear().apply();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], b2, f.f34885a, false, 24906, new Class[0], Void.TYPE);
                        return;
                    }
            }
            return;
        }
        throw new IllegalArgumentException("name is null");
    }
}
