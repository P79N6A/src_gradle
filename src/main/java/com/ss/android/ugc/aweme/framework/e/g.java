package com.ss.android.ugc.aweme.framework.e;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48508a;

    private static File a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f48508a, true, 45986, new Class[]{Context.class}, File.class)) {
            return context2.getDir("lib", 0);
        }
        return (File) PatchProxy.accessDispatch(new Object[]{context2}, null, f48508a, true, 45986, new Class[]{Context.class}, File.class);
    }

    private static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f48508a, true, 45990, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f48508a, true, 45990, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f48508a, true, 45985, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str}, null, f48508a, true, 45985, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError unused) {
                File b2 = b(context, str);
                if (!b2.exists()) {
                    c(context, str);
                }
                System.load(b2.getAbsolutePath());
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    private static File b(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f48508a, true, 45987, new Class[]{Context.class, String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context, str}, null, f48508a, true, 45987, new Class[]{Context.class, String.class}, File.class);
        }
        return new File(a(context), System.mapLibraryName(str));
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2, outputStream2}, null, f48508a, true, 45989, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inputStream2, outputStream2}, null, f48508a, true, 45989, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE);
            return;
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream2.read(bArr);
            if (read != -1) {
                outputStream2.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        a((java.io.Closeable) r7);
        a((java.io.Closeable) r8);
        r3.setReadable(true, false);
        r3.setExecutable(true, false);
        r3.setWritable(true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011b A[SYNTHETIC, Splitter:B:80:0x011b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(android.content.Context r19, java.lang.String r20) {
        /*
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = f48508a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 45988(0xb3a4, float:6.4443E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0041
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r20
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f48508a
            r15 = 1
            r16 = 45988(0xb3a4, float:6.4443E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0041:
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r19.getApplicationInfo()     // Catch:{ all -> 0x0117 }
            r4 = 0
        L_0x0047:
            int r5 = r4 + 1
            r6 = 5
            if (r4 >= r6) goto L_0x005b
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0059 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0059 }
            java.lang.String r8 = r3.sourceDir     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r4.<init>(r7, r11)     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = r5
            goto L_0x0047
        L_0x005b:
            r4 = r2
        L_0x005c:
            if (r4 != 0) goto L_0x0066
            if (r4 == 0) goto L_0x0065
            r4.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0065
        L_0x0064:
            return
        L_0x0065:
            return
        L_0x0066:
            r3 = 0
        L_0x0067:
            int r5 = r3 + 1
            if (r3 >= r6) goto L_0x010f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x010d }
            r7 = 21
            if (r3 < r7) goto L_0x009d
            java.lang.String[] r3 = android.os.Build.SUPPORTED_ABIS     // Catch:{ all -> 0x010d }
            int r7 = r3.length     // Catch:{ all -> 0x010d }
            r9 = r2
            r8 = 0
        L_0x0076:
            if (r8 >= r7) goto L_0x00bd
            r9 = r3[r8]     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            java.lang.String r13 = "lib/"
            r12.<init>(r13)     // Catch:{ all -> 0x010d }
            r12.append(r9)     // Catch:{ all -> 0x010d }
            java.lang.String r9 = "/"
            r12.append(r9)     // Catch:{ all -> 0x010d }
            java.lang.String r9 = java.lang.System.mapLibraryName(r20)     // Catch:{ all -> 0x010d }
            r12.append(r9)     // Catch:{ all -> 0x010d }
            java.lang.String r9 = r12.toString()     // Catch:{ all -> 0x010d }
            java.util.zip.ZipEntry r9 = r4.getEntry(r9)     // Catch:{ all -> 0x010d }
            if (r9 != 0) goto L_0x00bd
            int r8 = r8 + 1
            goto L_0x0076
        L_0x009d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            java.lang.String r7 = "lib/"
            r3.<init>(r7)     // Catch:{ all -> 0x010d }
            java.lang.String r7 = android.os.Build.CPU_ABI     // Catch:{ all -> 0x010d }
            r3.append(r7)     // Catch:{ all -> 0x010d }
            java.lang.String r7 = "/"
            r3.append(r7)     // Catch:{ all -> 0x010d }
            java.lang.String r7 = java.lang.System.mapLibraryName(r20)     // Catch:{ all -> 0x010d }
            r3.append(r7)     // Catch:{ all -> 0x010d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x010d }
            java.util.zip.ZipEntry r9 = r4.getEntry(r3)     // Catch:{ all -> 0x010d }
        L_0x00bd:
            if (r9 == 0) goto L_0x010f
            java.io.File r3 = b(r19, r20)     // Catch:{ all -> 0x010d }
            r3.delete()     // Catch:{ all -> 0x010d }
            boolean r7 = r3.createNewFile()     // Catch:{ IOException -> 0x010a }
            if (r7 != 0) goto L_0x00cd
            goto L_0x010a
        L_0x00cd:
            java.io.InputStream r7 = r4.getInputStream(r9)     // Catch:{ FileNotFoundException -> 0x0104, IOException -> 0x00fb, all -> 0x00f2 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00f0, IOException -> 0x00ee, all -> 0x00ec }
            r8.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00f0, IOException -> 0x00ee, all -> 0x00ec }
            a((java.io.InputStream) r7, (java.io.OutputStream) r8)     // Catch:{ FileNotFoundException -> 0x0106, IOException -> 0x00fd, all -> 0x00e9 }
            a((java.io.Closeable) r7)     // Catch:{ all -> 0x010d }
            a((java.io.Closeable) r8)     // Catch:{ all -> 0x010d }
            r3.setReadable(r11, r10)     // Catch:{ all -> 0x010d }
            r3.setExecutable(r11, r10)     // Catch:{ all -> 0x010d }
            r3.setWritable(r11)     // Catch:{ all -> 0x010d }
            goto L_0x010f
        L_0x00e9:
            r0 = move-exception
            r2 = r8
            goto L_0x00f4
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f4
        L_0x00ee:
            r8 = r2
            goto L_0x00fd
        L_0x00f0:
            r8 = r2
            goto L_0x0106
        L_0x00f2:
            r0 = move-exception
            r7 = r2
        L_0x00f4:
            a((java.io.Closeable) r7)     // Catch:{ all -> 0x010d }
            a((java.io.Closeable) r2)     // Catch:{ all -> 0x010d }
            throw r0     // Catch:{ all -> 0x010d }
        L_0x00fb:
            r7 = r2
            r8 = r7
        L_0x00fd:
            a((java.io.Closeable) r7)     // Catch:{ all -> 0x010d }
        L_0x0100:
            a((java.io.Closeable) r8)     // Catch:{ all -> 0x010d }
            goto L_0x010a
        L_0x0104:
            r7 = r2
            r8 = r7
        L_0x0106:
            a((java.io.Closeable) r7)     // Catch:{ all -> 0x010d }
            goto L_0x0100
        L_0x010a:
            r3 = r5
            goto L_0x0067
        L_0x010d:
            r0 = move-exception
            goto L_0x0119
        L_0x010f:
            if (r4 == 0) goto L_0x0116
            r4.close()     // Catch:{ IOException -> 0x0115 }
            goto L_0x0116
        L_0x0115:
            return
        L_0x0116:
            return
        L_0x0117:
            r0 = move-exception
            r4 = r2
        L_0x0119:
            if (r4 == 0) goto L_0x011e
            r4.close()     // Catch:{ IOException -> 0x011e }
        L_0x011e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.framework.e.g.c(android.content.Context, java.lang.String):void");
    }
}
