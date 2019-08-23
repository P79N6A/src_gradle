package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore2d.ee;
import com.amap.api.mapcore2d.ei;
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

public class eh extends ec {
    private PublicKey g;

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) throws Exception {
        try {
            if (this.f6009c == null) {
                b();
                this.f6009c = DexFile.loadDex(str, str2, 0);
            }
        } catch (Throwable th) {
            ek.a(th, "dLoader", "loadFile");
            throw new Exception("load file fail");
        }
    }

    private void c() {
        if (this.g == null) {
            this.g = ek.a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x003b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.amap.api.mapcore2d.ek.a(r1, "dLoader", "findCl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0051, code lost:
        com.amap.api.mapcore2d.ek.a(r0, "dLoader", "findCl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x005d, code lost:
        throw new java.lang.ClassNotFoundException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x005e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x005f, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005e A[ExcHandler: ClassNotFoundException (r6v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Class<?> findClass(java.lang.String r6) throws java.lang.ClassNotFoundException {
        /*
            r5 = this;
            dalvik.system.DexFile r0 = r5.f6009c     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
            if (r0 == 0) goto L_0x004a
            r0 = 0
            java.util.Map r1 = r5.f6008b     // Catch:{ Throwable -> 0x001a, ClassNotFoundException -> 0x005e }
            monitor-enter(r1)     // Catch:{ Throwable -> 0x001a, ClassNotFoundException -> 0x005e }
            java.util.Map r2 = r5.f6008b     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0017 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            goto L_0x0023
        L_0x0012:
            r0 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x0018
        L_0x0017:
            r2 = move-exception
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r2     // Catch:{ Throwable -> 0x001a, ClassNotFoundException -> 0x005e }
        L_0x001a:
            r1 = move-exception
            r2 = r0
            java.lang.String r0 = "dLoader"
            java.lang.String r3 = "findCl"
            com.amap.api.mapcore2d.ek.a(r1, r0, r3)     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
        L_0x0023:
            if (r2 == 0) goto L_0x0026
            return r2
        L_0x0026:
            dalvik.system.DexFile r0 = r5.f6009c     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
            java.lang.Class r0 = r0.loadClass(r6, r5)     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
            if (r0 == 0) goto L_0x0044
            java.util.Map r1 = r5.f6008b     // Catch:{ Throwable -> 0x003b, ClassNotFoundException -> 0x005e }
            monitor-enter(r1)     // Catch:{ Throwable -> 0x003b, ClassNotFoundException -> 0x005e }
            java.util.Map r2 = r5.f6008b     // Catch:{ all -> 0x0038 }
            r2.put(r6, r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            goto L_0x0043
        L_0x0038:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            throw r2     // Catch:{ Throwable -> 0x003b, ClassNotFoundException -> 0x005e }
        L_0x003b:
            r1 = move-exception
            java.lang.String r2 = "dLoader"
            java.lang.String r3 = "findCl"
            com.amap.api.mapcore2d.ek.a(r1, r2, r3)     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
        L_0x0043:
            return r0
        L_0x0044:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
            r0.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
        L_0x004a:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
            r0.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x005e, Throwable -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            java.lang.String r1 = "dLoader"
            java.lang.String r2 = "findCl"
            com.amap.api.mapcore2d.ek.a(r0, r1, r2)
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r0.<init>(r6)
            throw r0
        L_0x005e:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.eh.findClass(java.lang.String):java.lang.Class");
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
            com.amap.api.mapcore2d.ek.a(r5, r2, r3)     // Catch:{ all -> 0x0031 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.eh.a(java.io.File):boolean");
    }

    private void a(dm dmVar, File file) {
        ei a2 = ee.a.a(dmVar, file.getName());
        if (a2 != null) {
            this.f6012f = a2.e();
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
                    ek.a((Closeable) inputStream2);
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStream2;
                ek.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ek.a(th, "DyLoader", "loadJa");
            ek.a((Closeable) inputStream);
        }
    }

    private void b(dm dmVar, File file) {
        this.f6010d = false;
        ee.a(this.f6007a, dmVar, file.getName());
        String a2 = ee.a(this.f6007a, dmVar, this.f6011e);
        if (!TextUtils.isEmpty(a2)) {
            this.f6012f = a2;
            ee.a(this.f6007a, this.f6011e);
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
            ek.a(e2, "DyLoader", "check");
        }
        return false;
    }

    private void b(final Context context, final String str, final String str2) {
        dg.c().submit(new Runnable() {
            public void run() {
                try {
                    eh.this.a(context, str, str2);
                } catch (Throwable th) {
                    ek.a(th, "dLoader", "run()");
                }
            }
        });
    }

    eh(Context context, cy cyVar, boolean z) throws Exception {
        super(context, cyVar, z);
        String b2 = ee.b(context, cyVar.a(), cyVar.b());
        String a2 = ee.a(context);
        b(b2, a2);
        new File(b2);
        if (z) {
            a(b2, a2 + File.separator + ee.a(r1.getName()));
            b(context, b2, a2);
        }
    }

    private boolean a(dm dmVar, cy cyVar, String str) {
        if (a(new File(str))) {
            return ek.a(dmVar, ee.a(this.f6007a, cyVar.a(), cyVar.b()), str, cyVar);
        }
        return false;
    }

    private boolean a(dm dmVar, String str, String str2) {
        String a2 = ee.a(this.f6007a, str);
        if (ek.a(dmVar, str, a2, this.f6011e)) {
            return true;
        }
        if (ee.a.a(dmVar, str) != null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f6012f)) {
            ei.a aVar = new ei.a(str, cv.a(a2), this.f6011e.a(), this.f6011e.b(), str2);
            ee.a.a(dmVar, aVar.a("useod").a(), ei.b(str));
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, String str, String str2) throws Exception {
        new Date().getTime();
        try {
            dm dmVar = new dm(context, eg.c());
            File file = new File(str);
            a(dmVar, file);
            if (!a(dmVar, this.f6011e, file.getAbsolutePath())) {
                b(dmVar, file);
            }
            if (file.exists()) {
                if (new File(str2 + File.separator + ee.a(file.getName())).exists() && !a(dmVar, ee.a(file.getName()), this.f6012f)) {
                    ee.a(this.f6007a, this.f6011e);
                }
                new Date().getTime();
            }
        } catch (Throwable th) {
            ek.a(th, "dLoader", "verifyD()");
        }
    }
}
