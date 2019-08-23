package com.loc;

import com.google.a.a.a.a.a.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class z extends u {
    private PublicKey i;

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0 A[SYNTHETIC, Splitter:B:47:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    z(final android.content.Context r7, com.loc.dh r8) throws java.lang.Exception {
        /*
            r6 = this;
            r6.<init>(r7, r8)
            java.lang.String r0 = r8.a()
            java.lang.String r8 = r8.f25797a
            java.lang.String r8 = com.loc.w.b((android.content.Context) r7, (java.lang.String) r0, (java.lang.String) r8)
            java.lang.String r0 = com.loc.w.a((android.content.Context) r7)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x00c4
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00c4
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            com.loc.ab r2 = com.loc.ab.b()
            com.loc.dh r3 = r6.f25892e
            com.loc.ab$a r2 = r2.a(r3)
            boolean r2 = r2.f25410b
            if (r2 != 0) goto L_0x00bc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = com.loc.w.a((java.lang.String) r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            r3 = 0
            dalvik.system.DexFile r4 = r6.f25890c     // Catch:{ Throwable -> 0x009e }
            if (r4 == 0) goto L_0x0053
            goto L_0x0083
        L_0x0053:
            com.loc.ab r4 = com.loc.ab.b()     // Catch:{ Throwable -> 0x009e }
            com.loc.dh r5 = r6.f25892e     // Catch:{ Throwable -> 0x009e }
            com.loc.ab$a r4 = r4.a(r5)     // Catch:{ Throwable -> 0x009e }
            if (r4 == 0) goto L_0x0069
            r2 = 1
            r4.f25409a = r2     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r7 = move-exception
            r2 = r4
            goto L_0x00ae
        L_0x0066:
            r7 = move-exception
            r2 = r4
            goto L_0x009f
        L_0x0069:
            r6.b()     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            boolean r2 = r4.f25410b     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            if (r2 != 0) goto L_0x0094
            dalvik.system.DexFile r1 = dalvik.system.DexFile.loadDex(r8, r1, r3)     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            r6.f25890c = r1     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            if (r4 == 0) goto L_0x0083
            r4.f25409a = r3     // Catch:{ Throwable -> 0x0083 }
            monitor-enter(r4)     // Catch:{ Throwable -> 0x0083 }
            r4.notify()     // Catch:{ all -> 0x0080 }
            monitor-exit(r4)     // Catch:{ all -> 0x0080 }
            goto L_0x0083
        L_0x0080:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ Throwable -> 0x0083 }
            throw r1     // Catch:{ Throwable -> 0x0083 }
        L_0x0083:
            com.loc.ab r1 = com.loc.ab.b()     // Catch:{ Throwable -> 0x0093 }
            java.util.concurrent.ExecutorService r1 = r1.a()     // Catch:{ Throwable -> 0x0093 }
            com.loc.z$1 r2 = new com.loc.z$1     // Catch:{ Throwable -> 0x0093 }
            r2.<init>(r7, r8, r0)     // Catch:{ Throwable -> 0x0093 }
            r1.submit(r2)     // Catch:{ Throwable -> 0x0093 }
        L_0x0093:
            return
        L_0x0094:
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            java.lang.String r8 = "file is downloading"
            r7.<init>(r8)     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            throw r7     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
        L_0x009c:
            r7 = move-exception
            goto L_0x00ae
        L_0x009e:
            r7 = move-exception
        L_0x009f:
            java.lang.String r8 = "dLoader"
            java.lang.String r0 = "loadFile"
            com.loc.f.a((java.lang.Throwable) r7, (java.lang.String) r8, (java.lang.String) r0)     // Catch:{ all -> 0x009c }
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ all -> 0x009c }
            java.lang.String r8 = "load file fail"
            r7.<init>(r8)     // Catch:{ all -> 0x009c }
            throw r7     // Catch:{ all -> 0x009c }
        L_0x00ae:
            if (r2 == 0) goto L_0x00bb
            r2.f25409a = r3     // Catch:{ Throwable -> 0x00bb }
            monitor-enter(r2)     // Catch:{ Throwable -> 0x00bb }
            r2.notify()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b8 }
            goto L_0x00bb
        L_0x00b8:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ Throwable -> 0x00bb }
            throw r8     // Catch:{ Throwable -> 0x00bb }
        L_0x00bb:
            throw r7
        L_0x00bc:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "file is downloading"
            r7.<init>(r8)
            throw r7
        L_0x00c4:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "dexPath or dexOutputDir is null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.z.<init>(android.content.Context, com.loc.dh):void");
    }

    private static void a(JarFile jarFile, JarEntry jarEntry) throws IOException {
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = jarFile.getInputStream(jarEntry);
            try {
                do {
                } while (inputStream2.read(new byte[8192]) > 0);
                try {
                    ac.a((Closeable) inputStream2);
                } catch (Throwable th) {
                    a.b(th);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                ac.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f.a(th, "DyLoader", "loadJa");
            ac.a((Closeable) inputStream);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0044 A[SYNTHETIC, Splitter:B:37:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x004a A[SYNTHETIC, Splitter:B:42:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.io.File r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.security.PublicKey r2 = r4.i     // Catch:{ Throwable -> 0x003a }
            if (r2 != 0) goto L_0x000c
            java.security.PublicKey r2 = com.loc.ac.a()     // Catch:{ Throwable -> 0x003a }
            r4.i = r2     // Catch:{ Throwable -> 0x003a }
        L_0x000c:
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch:{ Throwable -> 0x003a }
            r2.<init>(r5)     // Catch:{ Throwable -> 0x003a }
            java.lang.String r5 = "classes.dex"
            java.util.jar.JarEntry r5 = r2.getJarEntry(r5)     // Catch:{ Throwable -> 0x0035, all -> 0x0032 }
            if (r5 != 0) goto L_0x001d
            r2.close()     // Catch:{ Throwable -> 0x001c }
        L_0x001c:
            return r0
        L_0x001d:
            a(r2, r5)     // Catch:{ Throwable -> 0x0035, all -> 0x0032 }
            java.security.cert.Certificate[] r5 = r5.getCertificates()     // Catch:{ Throwable -> 0x0035, all -> 0x0032 }
            if (r5 != 0) goto L_0x002a
            r2.close()     // Catch:{ Throwable -> 0x0029 }
        L_0x0029:
            return r0
        L_0x002a:
            boolean r5 = r4.a((java.security.cert.Certificate[]) r5)     // Catch:{ Throwable -> 0x0035, all -> 0x0032 }
            r2.close()     // Catch:{ Throwable -> 0x0031 }
        L_0x0031:
            return r5
        L_0x0032:
            r5 = move-exception
            r1 = r2
            goto L_0x0048
        L_0x0035:
            r5 = move-exception
            r1 = r2
            goto L_0x003b
        L_0x0038:
            r5 = move-exception
            goto L_0x0048
        L_0x003a:
            r5 = move-exception
        L_0x003b:
            java.lang.String r2 = "DyLoader"
            java.lang.String r3 = "verify"
            com.loc.f.a((java.lang.Throwable) r5, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ Throwable -> 0x0047 }
        L_0x0047:
            return r0
        L_0x0048:
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ Throwable -> 0x004d }
        L_0x004d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.z.a(java.io.File):boolean");
    }

    private boolean a(Certificate[] certificateArr) {
        try {
            if (certificateArr.length > 0) {
                int length = certificateArr.length - 1;
                if (length >= 0) {
                    certificateArr[length].verify(this.i);
                    return true;
                }
            }
        } catch (Exception e2) {
            f.a((Throwable) e2, "DyLoader", "check");
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea A[Catch:{ Throwable -> 0x00f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r11, java.lang.String r12, java.lang.String r13) throws java.lang.Exception {
        /*
            r10 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r0.getTime()
            com.loc.n r0 = new com.loc.n     // Catch:{ Throwable -> 0x00f2 }
            com.loc.y r1 = com.loc.y.b()     // Catch:{ Throwable -> 0x00f2 }
            r0.<init>(r11, r1)     // Catch:{ Throwable -> 0x00f2 }
            java.io.File r11 = new java.io.File     // Catch:{ Throwable -> 0x00f2 }
            r11.<init>(r12)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r12 = r11.getName()     // Catch:{ Throwable -> 0x00f2 }
            com.loc.aa r12 = com.loc.w.a.a(r0, r12)     // Catch:{ Throwable -> 0x00f2 }
            if (r12 == 0) goto L_0x0024
            java.lang.String r12 = r12.f25396e     // Catch:{ Throwable -> 0x00f2 }
            r10.f25893f = r12     // Catch:{ Throwable -> 0x00f2 }
        L_0x0024:
            com.loc.dh r12 = r10.f25892e     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r11.getAbsolutePath()     // Catch:{ Throwable -> 0x00f2 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00f2 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x00f2 }
            boolean r2 = r10.a((java.io.File) r2)     // Catch:{ Throwable -> 0x00f2 }
            r3 = 0
            if (r2 == 0) goto L_0x0047
            android.content.Context r2 = r10.f25888a     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r4 = r12.a()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r5 = r12.f25797a     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r2 = com.loc.w.a((android.content.Context) r2, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x00f2 }
            boolean r12 = com.loc.ac.a(r0, r2, r1, r12)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x0048
        L_0x0047:
            r12 = 0
        L_0x0048:
            if (r12 != 0) goto L_0x006c
            r10.f25891d = r3     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r12 = r10.f25888a     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r11.getName()     // Catch:{ Throwable -> 0x00f2 }
            com.loc.w.a((android.content.Context) r12, (com.loc.n) r0, (java.lang.String) r1)     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r12 = r10.f25888a     // Catch:{ Throwable -> 0x00f2 }
            com.loc.dh r1 = r10.f25892e     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r12 = com.loc.w.a((android.content.Context) r12, (com.loc.n) r0, (com.loc.dh) r1)     // Catch:{ Throwable -> 0x00f2 }
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x00f2 }
            if (r1 != 0) goto L_0x006c
            r10.f25893f = r12     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r12 = r10.f25888a     // Catch:{ Throwable -> 0x00f2 }
            com.loc.dh r1 = r10.f25892e     // Catch:{ Throwable -> 0x00f2 }
            com.loc.w.a((android.content.Context) r12, (com.loc.dh) r1)     // Catch:{ Throwable -> 0x00f2 }
        L_0x006c:
            boolean r12 = r11.exists()     // Catch:{ Throwable -> 0x00f2 }
            if (r12 != 0) goto L_0x0073
            return
        L_0x0073:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f2 }
            r12.<init>()     // Catch:{ Throwable -> 0x00f2 }
            r12.append(r13)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r13 = java.io.File.separator     // Catch:{ Throwable -> 0x00f2 }
            r12.append(r13)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r13 = r11.getName()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r13 = com.loc.w.a((java.lang.String) r13)     // Catch:{ Throwable -> 0x00f2 }
            r12.append(r13)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x00f2 }
            java.io.File r13 = new java.io.File     // Catch:{ Throwable -> 0x00f2 }
            r13.<init>(r12)     // Catch:{ Throwable -> 0x00f2 }
            boolean r12 = r13.exists()     // Catch:{ Throwable -> 0x00f2 }
            if (r12 == 0) goto L_0x00fa
            java.lang.String r11 = r11.getName()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r11 = com.loc.w.a((java.lang.String) r11)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r9 = r10.f25893f     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r12 = r10.f25888a     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r12 = com.loc.w.a((android.content.Context) r12, (java.lang.String) r11)     // Catch:{ Throwable -> 0x00f2 }
            com.loc.dh r13 = r10.f25892e     // Catch:{ Throwable -> 0x00f2 }
            boolean r13 = com.loc.ac.a(r0, r11, r12, r13)     // Catch:{ Throwable -> 0x00f2 }
            if (r13 != 0) goto L_0x00e7
            com.loc.aa r13 = com.loc.w.a.a(r0, r11)     // Catch:{ Throwable -> 0x00f2 }
            if (r13 == 0) goto L_0x00b9
            goto L_0x00e8
        L_0x00b9:
            java.lang.String r13 = r10.f25893f     // Catch:{ Throwable -> 0x00f2 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x00f2 }
            if (r13 != 0) goto L_0x00e7
            com.loc.aa$a r13 = new com.loc.aa$a     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r6 = com.loc.de.a((java.lang.String) r12)     // Catch:{ Throwable -> 0x00f2 }
            com.loc.dh r12 = r10.f25892e     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r7 = r12.a()     // Catch:{ Throwable -> 0x00f2 }
            com.loc.dh r12 = r10.f25892e     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r8 = r12.f25797a     // Catch:{ Throwable -> 0x00f2 }
            r4 = r13
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r12 = "useod"
            com.loc.aa$a r12 = r13.a(r12)     // Catch:{ Throwable -> 0x00f2 }
            com.loc.aa r12 = r12.a()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r11 = com.loc.aa.a(r11)     // Catch:{ Throwable -> 0x00f2 }
            r0.a((java.lang.Object) r12, (java.lang.String) r11)     // Catch:{ Throwable -> 0x00f2 }
        L_0x00e7:
            r3 = 1
        L_0x00e8:
            if (r3 != 0) goto L_0x00fa
            android.content.Context r11 = r10.f25888a     // Catch:{ Throwable -> 0x00f2 }
            com.loc.dh r12 = r10.f25892e     // Catch:{ Throwable -> 0x00f2 }
            com.loc.w.a((android.content.Context) r11, (com.loc.dh) r12)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x00fa
        L_0x00f2:
            r11 = move-exception
            java.lang.String r12 = "dLoader"
            java.lang.String r13 = "verifyD()"
            com.loc.f.a((java.lang.Throwable) r11, (java.lang.String) r12, (java.lang.String) r13)
        L_0x00fa:
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            r11.getTime()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.z.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0070, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0072, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        com.loc.f.a(r1, "dLoader", "findCl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x007f, code lost:
        throw new java.lang.ClassNotFoundException(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0080, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0081, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0082, code lost:
        r6.h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0084, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0080 A[Catch:{ all -> 0x0070 }, ExcHandler: ClassNotFoundException (r7v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE, Catch:{  }])] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class<?> findClass(java.lang.String r7) throws java.lang.ClassNotFoundException {
        /*
            r6 = this;
            r0 = 0
            dalvik.system.DexFile r1 = r6.f25890c     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            if (r1 == 0) goto L_0x006a
            r1 = 0
            java.util.Map r2 = r6.f25889b     // Catch:{ Throwable -> 0x001b, ClassNotFoundException -> 0x0080 }
            monitor-enter(r2)     // Catch:{ Throwable -> 0x001b, ClassNotFoundException -> 0x0080 }
            java.util.Map r3 = r6.f25889b     // Catch:{ all -> 0x0018 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0018 }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            goto L_0x0024
        L_0x0013:
            r1 = move-exception
            r5 = r3
            r3 = r1
            r1 = r5
            goto L_0x0019
        L_0x0018:
            r3 = move-exception
        L_0x0019:
            monitor-exit(r2)     // Catch:{ Throwable -> 0x001b, ClassNotFoundException -> 0x0080 }
            throw r3     // Catch:{ Throwable -> 0x001b, ClassNotFoundException -> 0x0080 }
        L_0x001b:
            r2 = move-exception
            r3 = r1
            java.lang.String r1 = "dLoader"
            java.lang.String r4 = "findCl"
            com.loc.f.a((java.lang.Throwable) r2, (java.lang.String) r1, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
        L_0x0024:
            if (r3 == 0) goto L_0x0029
            r6.h = r0
            return r3
        L_0x0029:
            boolean r1 = r6.g     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            if (r1 != 0) goto L_0x0064
            r1 = 1
            r6.h = r1     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            dalvik.system.DexFile r1 = r6.f25890c     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            java.lang.Class r1 = r1.loadClass(r7, r6)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            dalvik.system.DexFile r2 = r6.f25890c     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            dalvik.system.DexFile r3 = r6.f25890c     // Catch:{ all -> 0x0061 }
            r3.notify()     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            r6.h = r0     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            if (r1 == 0) goto L_0x005b
            java.util.Map r2 = r6.f25889b     // Catch:{ Throwable -> 0x0050, ClassNotFoundException -> 0x0080 }
            monitor-enter(r2)     // Catch:{ Throwable -> 0x0050, ClassNotFoundException -> 0x0080 }
            java.util.Map r3 = r6.f25889b     // Catch:{ all -> 0x004d }
            r3.put(r7, r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x0058
        L_0x004d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ Throwable -> 0x0050, ClassNotFoundException -> 0x0080 }
            throw r3     // Catch:{ Throwable -> 0x0050, ClassNotFoundException -> 0x0080 }
        L_0x0050:
            r2 = move-exception
            java.lang.String r3 = "dLoader"
            java.lang.String r4 = "findCl"
            com.loc.f.a((java.lang.Throwable) r2, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
        L_0x0058:
            r6.h = r0
            return r1
        L_0x005b:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            r1.<init>(r7)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
        L_0x0061:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
        L_0x0064:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            r1.<init>(r7)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
        L_0x006a:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            r1.<init>(r7)     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x0080, Throwable -> 0x0072 }
        L_0x0070:
            r7 = move-exception
            goto L_0x0082
        L_0x0072:
            r1 = move-exception
            java.lang.String r2 = "dLoader"
            java.lang.String r3 = "findCl"
            com.loc.f.a((java.lang.Throwable) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0070 }
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException     // Catch:{ all -> 0x0070 }
            r1.<init>(r7)     // Catch:{ all -> 0x0070 }
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0080:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0070 }
        L_0x0082:
            r6.h = r0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.z.findClass(java.lang.String):java.lang.Class");
    }
}
