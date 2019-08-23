package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.am;
import com.xiaomi.push.fh;
import com.xiaomi.push.fi;
import com.xiaomi.push.ht;
import com.xiaomi.push.j;
import com.xiaomi.push.u;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ba {

    /* renamed from: a  reason: collision with root package name */
    private static ba f82537a = new ba();

    /* renamed from: a  reason: collision with other field name */
    private static String f963a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public am.b f964a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public fh.a f965a;

    /* renamed from: a  reason: collision with other field name */
    private List<a> f966a = new ArrayList();

    public static abstract class a {
        public void a(fh.a aVar) {
        }

        public void a(fi.b bVar) {
        }
    }

    private ba() {
    }

    public static ba a() {
        return f82537a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m619a() {
        String str;
        synchronized (ba.class) {
            try {
                if (f963a == null) {
                    SharedPreferences a2 = c.a(u.a(), "XMPushServiceConfig", 0);
                    String string = a2.getString("DeviceUUID", null);
                    f963a = string;
                    if (string == null) {
                        String a3 = j.a(u.a(), false);
                        f963a = a3;
                        if (a3 != null) {
                            a2.edit().putString("DeviceUUID", f963a).commit();
                        }
                    }
                }
                str = f963a;
            } catch (Throwable th) {
                Class<ba> cls = ba.class;
                throw th;
            }
        }
        return str;
    }

    private void b() {
        if (this.f965a == null) {
            d();
        }
    }

    private void c() {
        if (this.f964a == null) {
            this.f964a = new bb(this);
            ht.a(this.f964a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.u.a()     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x002b }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1)     // Catch:{ Exception -> 0x002b }
            com.xiaomi.push.b r0 = com.xiaomi.push.b.a((java.io.InputStream) r2)     // Catch:{ Exception -> 0x0025, all -> 0x0021 }
            com.xiaomi.push.fh$a r0 = com.xiaomi.push.fh.a.b((com.xiaomi.push.b) r0)     // Catch:{ Exception -> 0x0025, all -> 0x0021 }
            r4.f965a = r0     // Catch:{ Exception -> 0x0025, all -> 0x0021 }
            r2.close()     // Catch:{ Exception -> 0x0025, all -> 0x0021 }
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            goto L_0x0047
        L_0x0021:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x0053
        L_0x0025:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x002c
        L_0x0029:
            r1 = move-exception
            goto L_0x0053
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r2.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "load config failure: "
            r2.append(r3)     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0029 }
            r2.append(r1)     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0029 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r1)     // Catch:{ all -> 0x0029 }
            com.xiaomi.push.z.a((java.io.Closeable) r0)
        L_0x0047:
            com.xiaomi.push.fh$a r0 = r4.f965a
            if (r0 != 0) goto L_0x0052
            com.xiaomi.push.fh$a r0 = new com.xiaomi.push.fh$a
            r0.<init>()
            r4.f965a = r0
        L_0x0052:
            return
        L_0x0053:
            com.xiaomi.push.z.a((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ba.d():void");
    }

    private void e() {
        try {
            if (this.f965a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(u.a().openFileOutput("XMCloudCfg", 0));
                com.xiaomi.push.c a2 = com.xiaomi.push.c.a((OutputStream) bufferedOutputStream);
                this.f965a.a(a2);
                a2.a();
                bufferedOutputStream.close();
            }
        } catch (Exception e2) {
            b.a("save config failure: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public int m620a() {
        b();
        if (this.f965a != null) {
            return this.f965a.c();
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public fh.a m621a() {
        b();
        return this.f965a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m622a() {
        synchronized (this) {
            this.f966a.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(fi.b bVar) {
        a[] aVarArr;
        if (bVar.d() && bVar.d() > a()) {
            c();
        }
        synchronized (this) {
            aVarArr = (a[]) this.f966a.toArray(new a[this.f966a.size()]);
        }
        for (a a2 : aVarArr) {
            a2.a(bVar);
        }
    }

    public void a(a aVar) {
        synchronized (this) {
            this.f966a.add(aVar);
        }
    }
}
