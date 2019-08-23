package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import com.loc.aa;
import com.loc.aj;
import com.ss.android.ugc.aweme.q.c;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

public final class r implements aj.a {

    /* renamed from: a  reason: collision with root package name */
    s f25870a;

    /* renamed from: b  reason: collision with root package name */
    aj f25871b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public dh f25872c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f25873d;

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f25874e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Context f25875f;

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f25877b;

        /* renamed from: c  reason: collision with root package name */
        private n f25878c;

        /* renamed from: d  reason: collision with root package name */
        private String f25879d;

        a() {
        }

        a(n nVar) {
            this.f25877b = 2;
            this.f25878c = nVar;
        }

        public final void run() {
            switch (this.f25877b) {
                case 0:
                    try {
                        if (r.this.b()) {
                            au auVar = new au(r.this.f25875f, r.this.f25872c.a(), r.this.f25872c.f25797a, "O008");
                            auVar.a("{\"param_int_first\":0}");
                            av.a(auVar, r.this.f25875f);
                            r.this.f25871b.a(r.this);
                        }
                        return;
                    } catch (Throwable th) {
                        f.a(th, "dDownLoad", "run()");
                        return;
                    }
                case 1:
                case 2:
                    try {
                        w.a(r.this.f25875f, this.f25878c, r.this.f25872c, r.this.f25873d, r.this.f25870a.f25885f);
                        w.a(r.this.f25875f, r.this.f25872c);
                        return;
                    } catch (Throwable th2) {
                        f.a(th2, "dDownLoad", "onFinish2");
                        return;
                    }
                case 3:
                    try {
                        w.a(r.this.f25875f, this.f25878c, r.this.f25872c, r.this.f25873d, this.f25879d);
                        w.a(r.this.f25875f, r.this.f25872c);
                        return;
                    } catch (Throwable th3) {
                        f.a(th3, "dDownLoad", "processDownloadedFile()");
                        break;
                    }
            }
        }
    }

    public r(Context context, s sVar, dh dhVar) {
        try {
            this.f25875f = context.getApplicationContext();
            this.f25872c = dhVar;
            if (sVar != null) {
                this.f25870a = sVar;
                this.f25871b = new aj(new v(this.f25870a));
                this.f25873d = w.a(context, this.f25870a.f25882c);
            }
        } catch (Throwable th) {
            f.a(th, "dDownLoad", "DexDownLoad()");
        }
    }

    public final void a() {
        try {
            ab.b().a().submit(new a());
        } catch (Throwable th) {
            f.a(th, "dDownLoad", "startDownload()");
        }
    }

    public final void a(byte[] bArr, long j) {
        try {
            if (this.f25874e == null) {
                File file = new File(this.f25873d);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f25874e = new RandomAccessFile(file, "rw");
            }
            this.f25874e.seek(j);
            this.f25874e.write(bArr);
        } catch (Throwable th) {
            f.a(th, "dDownLoad", "onDownload()");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[Catch:{ Throwable -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r5 = this;
            com.loc.s r0 = r5.f25870a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            com.loc.s r0 = r5.f25870a
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            com.loc.dh r3 = r5.f25872c     // Catch:{ Throwable -> 0x0056 }
            com.loc.s r4 = r5.f25870a     // Catch:{ Throwable -> 0x0056 }
            boolean r3 = com.loc.ac.a((com.loc.dh) r3, (com.loc.s) r4)     // Catch:{ Throwable -> 0x0056 }
            if (r3 == 0) goto L_0x0055
            com.loc.s r3 = r5.f25870a     // Catch:{ Throwable -> 0x0056 }
            boolean r3 = com.loc.ac.a((com.loc.s) r3)     // Catch:{ Throwable -> 0x0056 }
            if (r3 == 0) goto L_0x0055
            android.content.Context r3 = r5.f25875f     // Catch:{ Throwable -> 0x0056 }
            boolean r0 = com.loc.ac.a((android.content.Context) r3, (boolean) r0)     // Catch:{ Throwable -> 0x0056 }
            if (r0 == 0) goto L_0x0055
            android.content.Context r0 = r5.f25875f     // Catch:{ Throwable -> 0x0056 }
            com.loc.s r3 = r5.f25870a     // Catch:{ Throwable -> 0x0056 }
            com.loc.dh r4 = r5.f25872c     // Catch:{ Throwable -> 0x0056 }
            boolean r0 = com.loc.ac.a(r0, r3, r4)     // Catch:{ Throwable -> 0x0056 }
            if (r0 != 0) goto L_0x0055
            android.content.Context r0 = r5.f25875f     // Catch:{ Throwable -> 0x0056 }
            com.loc.s r3 = r5.f25870a     // Catch:{ Throwable -> 0x0056 }
            boolean r3 = r3.j     // Catch:{ Throwable -> 0x0056 }
            if (r3 == 0) goto L_0x003f
        L_0x003d:
            r0 = 1
            goto L_0x0047
        L_0x003f:
            boolean r0 = com.loc.di.b((android.content.Context) r0)     // Catch:{ Throwable -> 0x0056 }
            if (r0 != 0) goto L_0x0046
            goto L_0x003d
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x0055
            android.content.Context r0 = r5.f25875f     // Catch:{ Throwable -> 0x0056 }
            com.loc.dh r3 = r5.f25872c     // Catch:{ Throwable -> 0x0056 }
            java.lang.String r3 = r3.a()     // Catch:{ Throwable -> 0x0056 }
            com.loc.w.b(r0, r3)     // Catch:{ Throwable -> 0x0056 }
            return r1
        L_0x0055:
            return r2
        L_0x0056:
            r0 = move-exception
            java.lang.String r1 = "dDownLoad"
            java.lang.String r3 = "isNeedDownload()"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.r.b():boolean");
    }

    public final void c() {
        try {
            ac.a((Closeable) this.f25874e);
        } catch (Throwable th) {
            com.google.a.a.a.a.a.a.b(th);
        }
    }

    public final void d() {
        try {
            if (this.f25874e != null) {
                ac.a((Closeable) this.f25874e);
                String str = this.f25870a.f25881b;
                if (ac.a(this.f25873d, str)) {
                    String str2 = this.f25870a.f25884e;
                    n nVar = new n(this.f25875f, y.b());
                    aa.a aVar = new aa.a(this.f25870a.f25882c, str, this.f25870a.f25883d, str2, this.f25870a.f25885f);
                    nVar.a((Object) aVar.a("copy").a(), aa.a(this.f25870a.f25882c, this.f25870a.f25883d, str2, this.f25870a.f25885f));
                    SharedPreferences.Editor edit = c.a(this.f25875f, this.f25870a.f25883d, 0).edit();
                    edit.clear();
                    edit.commit();
                    try {
                        ab.b().a().submit(new a(nVar));
                    } catch (Throwable th) {
                        f.a(th, "dDownLoad", "onFinish1");
                    }
                    au auVar = new au(this.f25875f, this.f25872c.a(), this.f25872c.f25797a, "O008");
                    auVar.a("{\"param_int_first\":1}");
                    av.a(auVar, this.f25875f);
                    return;
                }
                try {
                    new File(this.f25873d).delete();
                } catch (Throwable th2) {
                    f.a(th2, "dDownLoad", "onFinish");
                }
            }
        } catch (Throwable th3) {
            f.a(th3, "dDownLoad", "onFinish()");
        }
    }

    public final void e() {
    }
}
