package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.proguard.j;
import com.umeng.commonsdk.proguard.m;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.b;
import com.umeng.commonsdk.statistics.proto.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class e {

    /* renamed from: b  reason: collision with root package name */
    public static e f80956b;
    private static Object j = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final String f80957c = "umeng_it.cache";

    /* renamed from: d  reason: collision with root package name */
    private File f80958d;

    /* renamed from: e  reason: collision with root package name */
    private c f80959e;

    /* renamed from: f  reason: collision with root package name */
    private long f80960f;
    private long g;
    private Set<a> h = new HashSet();
    private a i = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Context f80961a;

        /* renamed from: b  reason: collision with root package name */
        private Set<String> f80962b = new HashSet();

        public synchronized void b() {
            String string = PreferenceWrapper.getDefault(this.f80961a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split(",");
                if (split != null) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f80962b.add(str);
                        }
                    }
                }
            }
        }

        public synchronized void a() {
            if (!this.f80962b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String append : this.f80962b) {
                    sb.append(append);
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f80961a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        public void c(String str) {
            this.f80962b.remove(str);
        }

        public a(Context context) {
            this.f80961a = context;
        }

        public synchronized void b(String str) {
            this.f80962b.add(str);
        }

        public synchronized boolean a(String str) {
            boolean z;
            if (!this.f80962b.contains(str)) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }
    }

    public String c() {
        return null;
    }

    public synchronized c b() {
        return this.f80959e;
    }

    public synchronized void f() {
        if (this.f80959e != null) {
            a(this.f80959e);
        }
    }

    private c h() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (j) {
            if (!this.f80958d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f80958d);
                try {
                    byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                    c cVar = new c();
                    new m().a((j) cVar, readStreamToByteArray);
                    HelperUtils.safeClose((InputStream) fileInputStream);
                    return cVar;
                } catch (Exception unused) {
                    HelperUtils.safeClose((InputStream) fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose((InputStream) fileInputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                fileInputStream = null;
                HelperUtils.safeClose((InputStream) fileInputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose((InputStream) fileInputStream);
                throw th;
            }
        }
    }

    public synchronized void d() {
        boolean z = false;
        for (a next : this.h) {
            if (next.c() && next.e() != null && !next.e().isEmpty()) {
                next.a((List<com.umeng.commonsdk.statistics.proto.a>) null);
                z = true;
            }
        }
        if (z) {
            this.f80959e.b(false);
            f();
        }
    }

    private synchronized void g() {
        c cVar = new c();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (a next : this.h) {
            if (next.c()) {
                if (next.d() != null) {
                    hashMap.put(next.b(), next.d());
                }
                if (next.e() != null && !next.e().isEmpty()) {
                    arrayList.addAll(next.e());
                }
            }
        }
        cVar.a((List<com.umeng.commonsdk.statistics.proto.a>) arrayList);
        cVar.a((Map<String, b>) hashMap);
        synchronized (this) {
            this.f80959e = cVar;
        }
    }

    public synchronized void e() {
        c h2 = h();
        if (h2 != null) {
            ArrayList<a> arrayList = new ArrayList<>(this.h.size());
            synchronized (this) {
                this.f80959e = h2;
                for (a next : this.h) {
                    next.a(this.f80959e);
                    if (!next.c()) {
                        arrayList.add(next);
                    }
                }
                for (a remove : arrayList) {
                    this.h.remove(remove);
                }
            }
            g();
        }
    }

    public synchronized void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f80960f >= this.g) {
            boolean z = false;
            for (a next : this.h) {
                if (next.c() && next.a()) {
                    z = true;
                    if (!next.c()) {
                        this.i.b(next.b());
                    }
                }
            }
            if (z) {
                g();
                this.i.a();
                f();
            }
            this.f80960f = currentTimeMillis;
        }
    }

    public void a(long j2) {
        this.g = j2;
    }

    e(Context context) {
        this.f80958d = new File(context.getFilesDir(), "umeng_it.cache");
        this.g = 86400000;
        this.i = new a(context);
        this.i.b();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.umeng.commonsdk.statistics.proto.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = j
            monitor-enter(r0)
            if (r3 == 0) goto L_0x001d
            monitor-enter(r2)     // Catch:{ Exception -> 0x001d }
            com.umeng.commonsdk.proguard.s r1 = new com.umeng.commonsdk.proguard.s     // Catch:{ all -> 0x0018 }
            r1.<init>()     // Catch:{ all -> 0x0018 }
            byte[] r3 = r1.a(r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x001d
            java.io.File r1 = r2.f80958d     // Catch:{ Exception -> 0x001d }
            com.umeng.commonsdk.statistics.common.HelperUtils.writeFile((java.io.File) r1, (byte[]) r3)     // Catch:{ Exception -> 0x001d }
            goto L_0x001d
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r3     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3 = move-exception
            goto L_0x001f
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.e.a(com.umeng.commonsdk.statistics.proto.c):void");
    }

    private boolean a(a aVar) {
        if (this.i.a(aVar.b())) {
            return this.h.add(aVar);
        }
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.w("invalid domain: " + aVar.b());
        }
        return false;
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (f80956b == null) {
                e eVar2 = new e(context);
                f80956b = eVar2;
                eVar2.a((a) new f(context));
                f80956b.a((a) new b(context));
                f80956b.a((a) new r(context));
                f80956b.a((a) new d(context));
                f80956b.a((a) new c(context));
                f80956b.a((a) new g(context));
                f80956b.a((a) new j());
                f80956b.a((a) new s(context));
                q qVar = new q(context);
                if (!TextUtils.isEmpty(qVar.f())) {
                    f80956b.a((a) qVar);
                }
                i iVar = new i(context);
                if (iVar.g()) {
                    f80956b.a((a) iVar);
                    f80956b.a((a) new h(context));
                    iVar.i();
                }
                if (SdkVersion.SDK_TYPE != 1) {
                    f80956b.a((a) new p(context));
                    f80956b.a((a) new m(context));
                    f80956b.a((a) new o(context));
                    f80956b.a((a) new n(context));
                    f80956b.a((a) new l(context));
                    f80956b.a((a) new k(context));
                }
                f80956b.e();
            }
            eVar = f80956b;
        }
        return eVar;
    }
}
