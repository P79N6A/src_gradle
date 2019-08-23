package com.ss.android.ugc.aweme.plugin.b;

import android.content.Context;
import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59235a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f59236b = {"oppo"};

    public static String c() {
        return "download";
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f59235a, true, 64562, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f59235a, true, 64562, new Class[0], String.class);
        }
        Context a2 = com.bytedance.frameworks.plugin.e.a();
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = a2.getExternalFilesDir(".download");
                if (externalFilesDir != null) {
                    String a3 = a(externalFilesDir);
                    a(a3);
                    return a3;
                }
            }
        } catch (Exception unused) {
        }
        return a(new File(a2.getFilesDir(), ".download"));
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f59235a, true, 64563, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f59235a, true, 64563, new Class[0], String.class);
        }
        Context a2 = com.bytedance.frameworks.plugin.e.a();
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = a2.getExternalFilesDir(".download");
                if (externalFilesDir != null) {
                    String a3 = a(externalFilesDir);
                    a(a3);
                    return a3;
                }
            }
        } catch (Exception unused) {
        }
        return a(new File(a2.getFilesDir(), ".download"));
    }

    private static String a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f59235a, true, 64564, new Class[]{File.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{file}, null, f59235a, true, 64564, new Class[]{File.class}, String.class);
        } else if (file == null) {
            return null;
        } else {
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getPath();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r17) throws java.io.IOException {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f59235a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 64565(0xfc35, float:9.0475E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f59235a
            r13 = 1
            r14 = 64565(0xfc35, float:9.0475E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String[] r2 = f59236b
            int r3 = r2.length
        L_0x003d:
            if (r9 >= r3) goto L_0x0078
            r4 = r2[r9]
            boolean r4 = android.text.TextUtils.equals(r1, r4)
            if (r4 == 0) goto L_0x0075
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ".test"
            r4.<init>(r0, r5)
            r5 = 0
            boolean r6 = r4.exists()     // Catch:{ all -> 0x006e }
            if (r6 == 0) goto L_0x0056
            return
        L_0x0056:
            r4.createNewFile()     // Catch:{ all -> 0x006e }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x006e }
            r6.<init>(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "for test"
            byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x006b }
            r6.write(r4)     // Catch:{ all -> 0x006b }
            r6.close()
            goto L_0x0075
        L_0x006b:
            r0 = move-exception
            r5 = r6
            goto L_0x006f
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            if (r5 == 0) goto L_0x0074
            r5.close()
        L_0x0074:
            throw r0
        L_0x0075:
            int r9 = r9 + 1
            goto L_0x003d
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.b.e.a(java.lang.String):void");
    }
}
