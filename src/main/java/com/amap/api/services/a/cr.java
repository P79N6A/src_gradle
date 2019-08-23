package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.a.cq;
import com.amap.api.services.a.cu;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class cr extends cn {
    private PublicKey g;

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) throws Exception {
        try {
            if (this.f6732c == null) {
                b();
                this.f6732c = DexFile.loadDex(str, str2, 0);
            }
        } catch (Throwable th) {
            cv.a(th, "dLoader", "loadFile");
            throw new Exception("load file fail");
        }
    }

    private void c() {
        if (this.g == null) {
            this.g = cv.a();
        }
    }

    /* access modifiers changed from: protected */
    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> cls;
        Class<?> cls2;
        Class<?> loadClass;
        try {
            if (this.f6732c != null) {
                cls = null;
                synchronized (this.f6731b) {
                    try {
                        cls2 = (Class) this.f6731b.get(str);
                        try {
                        } catch (Throwable th) {
                            Class<?> cls3 = cls2;
                            th = th;
                            cls = cls3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } else {
                throw new ClassNotFoundException(str);
            }
        } catch (Throwable th3) {
            cv.a(th3, "dLoader", "findCl");
            throw new ClassNotFoundException(str);
        }
        if (cls2 != null) {
            return cls2;
        }
        loadClass = this.f6732c.loadClass(str, this);
        if (loadClass != null) {
            try {
                synchronized (this.f6731b) {
                    this.f6731b.put(str, loadClass);
                }
            } catch (Throwable th4) {
                cv.a(th4, "dLoader", "findCl");
            }
            return loadClass;
        }
        throw new ClassNotFoundException(str);
        return loadClass;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x003d A[SYNTHETIC, Splitter:B:34:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0043 A[SYNTHETIC, Splitter:B:39:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.io.File r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            r4.c()     // Catch:{ Throwable -> 0x0033 }
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch:{ Throwable -> 0x0033 }
            r2.<init>(r5)     // Catch:{ Throwable -> 0x0033 }
            java.lang.String r1 = "classes.dex"
            java.util.jar.JarEntry r1 = r2.getJarEntry(r1)     // Catch:{ Throwable -> 0x002e, all -> 0x002b }
            if (r1 != 0) goto L_0x0016
            r2.close()     // Catch:{ Throwable -> 0x0015 }
        L_0x0015:
            return r0
        L_0x0016:
            r4.a((java.util.jar.JarFile) r2, (java.util.jar.JarEntry) r1)     // Catch:{ Throwable -> 0x002e, all -> 0x002b }
            java.security.cert.Certificate[] r1 = r1.getCertificates()     // Catch:{ Throwable -> 0x002e, all -> 0x002b }
            if (r1 != 0) goto L_0x0023
            r2.close()     // Catch:{ Throwable -> 0x0022 }
        L_0x0022:
            return r0
        L_0x0023:
            boolean r5 = r4.a((java.io.File) r5, (java.security.cert.Certificate[]) r1)     // Catch:{ Throwable -> 0x002e, all -> 0x002b }
            r2.close()     // Catch:{ Throwable -> 0x002a }
        L_0x002a:
            return r5
        L_0x002b:
            r5 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x002e:
            r5 = move-exception
            r1 = r2
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x0041
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            java.lang.String r2 = "DyLoader"
            java.lang.String r3 = "verify"
            com.amap.api.services.a.cv.a(r5, r2, r3)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ Throwable -> 0x0040 }
        L_0x0040:
            return r0
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ Throwable -> 0x0046 }
        L_0x0046:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.cr.a(java.io.File):boolean");
    }

    private void a(ce ceVar, File file) {
        cu a2 = cq.a.a(ceVar, file.getName());
        if (a2 != null) {
            this.f6735f = a2.e();
        }
    }

    private void b(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new Exception("dexPath or dexOutputDir is null.");
        }
    }

    private void a(JarFile jarFile, JarEntry jarEntry) throws IOException {
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = jarFile.getInputStream(jarEntry);
            try {
                do {
                } while (inputStream2.read(new byte[8192]) > 0);
                try {
                    cv.a((Closeable) inputStream2);
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStream2;
                cv.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cv.a(th, "DyLoader", "loadJa");
            cv.a((Closeable) inputStream);
        }
    }

    private void b(ce ceVar, File file) {
        this.f6733d = false;
        cq.a(this.f6730a, ceVar, file.getName());
        String a2 = cq.a(this.f6730a, ceVar, this.f6734e);
        if (!TextUtils.isEmpty(a2)) {
            this.f6735f = a2;
            cq.a(this.f6730a, this.f6734e);
        }
    }

    private boolean a(File file, Certificate[] certificateArr) {
        try {
            if (certificateArr.length > 0) {
                int length = certificateArr.length - 1;
                if (length >= 0) {
                    certificateArr[length].verify(this.g);
                    return true;
                }
            }
        } catch (Exception e2) {
            cv.a(e2, "DyLoader", "check");
        }
        return false;
    }

    private void b(final Context context, final String str, final String str2) {
        ca.c().submit(new Runnable() {
            public void run() {
                try {
                    cr.this.a(context, str, str2);
                } catch (Throwable th) {
                    cv.a(th, "dLoader", "run()");
                }
            }
        });
    }

    cr(Context context, bn bnVar, boolean z) throws Exception {
        super(context, bnVar, z);
        String b2 = cq.b(context, bnVar.a(), bnVar.b());
        String a2 = cq.a(context);
        b(b2, a2);
        new File(b2);
        if (z) {
            a(b2, a2 + File.separator + cq.a(r1.getName()));
            b(context, b2, a2);
        }
    }

    private boolean a(ce ceVar, bn bnVar, String str) {
        if (a(new File(str))) {
            return cv.a(ceVar, cq.a(this.f6730a, bnVar.a(), bnVar.b()), str, bnVar);
        }
        return false;
    }

    private boolean a(ce ceVar, String str, String str2) {
        String a2 = cq.a(this.f6730a, str);
        if (cv.a(ceVar, str, a2, this.f6734e)) {
            return true;
        }
        if (cq.a.a(ceVar, str) != null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f6735f)) {
            cu.a aVar = new cu.a(str, bl.a(a2), this.f6734e.a(), this.f6734e.b(), str2);
            cq.a.a(ceVar, aVar.a("useod").a(), cu.b(str));
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, String str, String str2) throws Exception {
        new Date().getTime();
        try {
            ce ceVar = new ce(context, ct.c());
            File file = new File(str);
            a(ceVar, file);
            if (!a(ceVar, this.f6734e, file.getAbsolutePath())) {
                b(ceVar, file);
            }
            if (file.exists()) {
                if (new File(str2 + File.separator + cq.a(file.getName())).exists() && !a(ceVar, cq.a(file.getName()), this.f6735f)) {
                    cq.a(this.f6730a, this.f6734e);
                }
                new Date().getTime();
            }
        } catch (Throwable th) {
            cv.a(th, "dLoader", "verifyD()");
        }
    }
}
