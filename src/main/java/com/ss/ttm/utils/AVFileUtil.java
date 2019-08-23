package com.ss.ttm.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AVFileUtil {
    private static String APP_PATH;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final String getAppFilesPath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 91142, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 91142, new Class[]{Context.class}, String.class);
        } else if (APP_PATH != null) {
            return APP_PATH;
        } else {
            if (context == null) {
                return null;
            }
            try {
                APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
                return APP_PATH;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 91144, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return copyFile(str3, str4, z, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, null, changeQuickRedirect, true, 91144, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
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
            r7 = 91143(0x16407, float:1.27719E-40)
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
            r18 = 91143(0x16407, float:1.27719E-40)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.AVFileUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
