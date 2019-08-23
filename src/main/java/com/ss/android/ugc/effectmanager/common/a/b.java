package com.ss.android.ugc.effectmanager.common.a;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.d.a;
import com.ss.android.ugc.effectmanager.common.f.d;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.io.InputStream;

public class b implements a {

    /* renamed from: e  reason: collision with root package name */
    public g f77275e;

    /* renamed from: f  reason: collision with root package name */
    public File f77276f;

    private File a() {
        if (this.f77276f == null) {
            return this.f77275e.i;
        }
        return this.f77276f;
    }

    public b(File file) {
        this.f77276f = file;
    }

    public b(g gVar) {
        this.f77275e = gVar;
        this.f77276f = gVar.i;
    }

    public boolean d(String str) {
        return d.a(a() + File.separator + str);
    }

    public String a(String str) {
        String str2 = a() + File.separator + str;
        synchronized (b.class) {
            String c2 = d.c(str2);
            if (TextUtils.isEmpty(c2)) {
                return "";
            }
            return c2;
        }
    }

    public InputStream b(String str) {
        InputStream d2;
        String str2 = a() + File.separator + str;
        synchronized (b.class) {
            d2 = d.d(str2);
        }
        return d2;
    }

    public boolean c(String str) {
        boolean b2;
        synchronized (b.class) {
            b2 = d.b(a() + File.separator + str);
        }
        return b2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|(0)|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|(1:8)|9|(6:10|11|12|13|14|15)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b A[SYNTHETIC, Splitter:B:22:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[SYNTHETIC, Splitter:B:28:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Class<com.ss.android.ugc.effectmanager.common.a.b> r0 = com.ss.android.ugc.effectmanager.common.a.b.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r1.<init>()     // Catch:{ all -> 0x005a }
            java.io.File r2 = r4.a()     // Catch:{ all -> 0x005a }
            r1.append(r2)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x005a }
            r1.append(r2)     // Catch:{ all -> 0x005a }
            r1.append(r5)     // Catch:{ all -> 0x005a }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x005a }
            java.lang.Class<com.ss.android.ugc.effectmanager.common.f.d> r1 = com.ss.android.ugc.effectmanager.common.f.d.class
            monitor-enter(r1)     // Catch:{ all -> 0x005a }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0057 }
            r2.<init>(r5)     // Catch:{ all -> 0x0057 }
            boolean r5 = r2.exists()     // Catch:{ all -> 0x0057 }
            if (r5 != 0) goto L_0x0031
            java.lang.String r5 = r2.getPath()     // Catch:{ all -> 0x0057 }
            r3 = 1
            com.ss.android.ugc.effectmanager.common.f.d.a((java.lang.String) r5, (boolean) r3)     // Catch:{ all -> 0x0057 }
        L_0x0031:
            r5 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004f, all -> 0x0046 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x004f, all -> 0x0046 }
            byte[] r5 = r6.getBytes()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r3.write(r5)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x0042:
            r5 = move-exception
            goto L_0x0049
        L_0x0044:
            r5 = r3
            goto L_0x004f
        L_0x0046:
            r6 = move-exception
            r3 = r5
            r5 = r6
        L_0x0049:
            if (r3 == 0) goto L_0x004e
            r3.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r5     // Catch:{ all -> 0x0057 }
        L_0x004f:
            if (r5 == 0) goto L_0x0054
            r5.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            monitor-exit(r1)     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x0057:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0057 }
            throw r5     // Catch:{ all -> 0x005a }
        L_0x005a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.a.b.a(java.lang.String, java.lang.String):void");
    }
}
