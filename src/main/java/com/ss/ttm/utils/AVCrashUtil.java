package com.ss.ttm.utils;

import android.content.Context;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

@Deprecated
public final class AVCrashUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getBase64SampleCrash(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 91135, new Class[]{String.class}, String.class)) {
            return Base64.encodeToString(str.getBytes(), 0);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 91135, new Class[]{String.class}, String.class);
    }

    public static void compress(InputStream inputStream, OutputStream outputStream) throws Exception {
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2, outputStream2}, null, changeQuickRedirect, true, 91137, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inputStream2, outputStream2}, null, changeQuickRedirect, true, 91137, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE);
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream2);
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream2.read(bArr, 0, 10240);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                return;
            }
        }
    }

    public static void deleteCrashFile(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 91133, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 91133, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static boolean existsCrashFile(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 91134, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 91134, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null && str2 == null) {
            return false;
        } else {
            return new File(str2).exists();
        }
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 91139, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return copyFile(str3, str4, z, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, null, changeQuickRedirect, true, 91139, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00aa */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7 A[SYNTHETIC, Splitter:B:25:0x00a7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCrashFileContext(android.content.Context r21, java.lang.String r22, java.lang.StringBuilder r23) {
        /*
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r21
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.StringBuilder> r5 = java.lang.StringBuilder.class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 91136(0x16400, float:1.27709E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r21
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 1
            r18 = 91136(0x16400, float:1.27709E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0056:
            r3 = 0
            if (r21 == 0) goto L_0x00ba
            if (r1 != 0) goto L_0x005c
            goto L_0x00ba
        L_0x005c:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0075
            java.lang.String r0 = "file not exist.path:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "\r\n"
            r2.append(r0)
            return r3
        L_0x0075:
            long r4 = r0.length()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0085
            java.lang.String r0 = "file size is zore.\r\n"
            r2.append(r0)
            return r3
        L_0x0085:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00a3 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00a3 }
            compress(r4, r1)     // Catch:{ Exception -> 0x00a1 }
            r4.close()     // Catch:{ Exception -> 0x00a1 }
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r11)     // Catch:{ Exception -> 0x00a1 }
            r1.close()     // Catch:{ Exception -> 0x00a1 }
            return r0
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a5
        L_0x00a3:
            r0 = move-exception
            r4 = r3
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r4.close()     // Catch:{ IOException -> 0x00aa }
        L_0x00aa:
            r1.close()     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            java.lang.String r1 = "gzip file is error.error:"
            r2.append(r1)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            return r3
        L_0x00ba:
            java.lang.String r0 = "context or path is null.\r\n"
            r2.append(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.AVCrashUtil.getCrashFileContext(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef A[SYNTHETIC, Splitter:B:47:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4 A[Catch:{ IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb A[SYNTHETIC, Splitter:B:57:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0100 A[Catch:{ IOException -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0107 A[SYNTHETIC, Splitter:B:67:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010c A[Catch:{ IOException -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r23)
            r12 = 2
            r3[r12] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r24)
            r13 = 3
            r3[r13] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r13] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 91138(0x16402, float:1.27712E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0077
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r10] = r0
            r14[r11] = r1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r23)
            r14[r12] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 1
            r18 = 91138(0x16402, float:1.27712E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0077:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x0083
            return r10
        L_0x0083:
            boolean r1 = r2.isFile()
            if (r1 != 0) goto L_0x008a
            return r10
        L_0x008a:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x00a0
            if (r23 == 0) goto L_0x00b5
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            r3.delete()
            goto L_0x00b5
        L_0x00a0:
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x00b5
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.mkdirs()
            if (r0 != 0) goto L_0x00b5
            return r10
        L_0x00b5:
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0104, IOException -> 0x00f8, all -> 0x00ea }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0104, IOException -> 0x00f8, all -> 0x00ea }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00f9, all -> 0x00e7 }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00f9, all -> 0x00e7 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
        L_0x00c4:
            int r1 = r4.read(r0)     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            r3 = -1
            if (r1 == r3) goto L_0x00cf
            r5.write(r0, r10, r1)     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            goto L_0x00c4
        L_0x00cf:
            r5.close()     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
            if (r24 == 0) goto L_0x00da
            r2.delete()     // Catch:{ FileNotFoundException -> 0x00e5, IOException -> 0x00e3, all -> 0x00e1 }
        L_0x00da:
            r5.close()     // Catch:{ IOException -> 0x00e0 }
            r4.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00e0:
            return r11
        L_0x00e1:
            r0 = move-exception
            goto L_0x00ed
        L_0x00e3:
            r3 = r5
            goto L_0x00f9
        L_0x00e5:
            r3 = r5
            goto L_0x0105
        L_0x00e7:
            r0 = move-exception
            r5 = r3
            goto L_0x00ed
        L_0x00ea:
            r0 = move-exception
            r4 = r3
            r5 = r4
        L_0x00ed:
            if (r5 == 0) goto L_0x00f2
            r5.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00f2:
            if (r4 == 0) goto L_0x00f7
            r4.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00f7:
            throw r0
        L_0x00f8:
            r4 = r3
        L_0x00f9:
            if (r3 == 0) goto L_0x00fe
            r3.close()     // Catch:{ IOException -> 0x0103 }
        L_0x00fe:
            if (r4 == 0) goto L_0x0103
            r4.close()     // Catch:{ IOException -> 0x0103 }
        L_0x0103:
            return r10
        L_0x0104:
            r4 = r3
        L_0x0105:
            if (r3 == 0) goto L_0x010a
            r3.close()     // Catch:{ IOException -> 0x010f }
        L_0x010a:
            if (r4 == 0) goto L_0x010f
            r4.close()     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.AVCrashUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
