package com.ss.android.ugc.aweme.profile.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61457a;

    public static File a() {
        if (PatchProxy.isSupport(new Object[0], null, f61457a, true, 69969, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f61457a, true, 69969, new Class[0], File.class);
        }
        return new File(b.a("profileCover"), "profileCoverOrigin.data");
    }

    public static File b() {
        if (PatchProxy.isSupport(new Object[0], null, f61457a, true, 69971, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f61457a, true, 69971, new Class[0], File.class);
        }
        return new File(b.a("profileHeader"), "profileHeaderCrop.png");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f A[SYNTHETIC, Splitter:B:23:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[SYNTHETIC, Splitter:B:29:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r20, int r21, int r22) {
        /*
            r0 = r20
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            r10 = 250(0xfa, float:3.5E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r11 = 1
            r2[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r12 = 2
            r2[r12] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f61457a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r12] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 69968(0x11150, float:9.8046E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x006a
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r13[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f61457a
            r16 = 1
            r17 = 69968(0x11150, float:9.8046E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x006a:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0093, all -> 0x008b }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0093, all -> 0x008b }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0087 }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0087 }
            r0.inJustDecodeBounds = r11     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0087 }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r0)     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0087 }
            int r1 = r0.outWidth     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0087 }
            if (r10 > r1) goto L_0x0082
            int r0 = r0.outHeight     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0087 }
            if (r10 <= r0) goto L_0x0083
        L_0x0082:
            r9 = 1
        L_0x0083:
            r2.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            return r9
        L_0x0087:
            r0 = move-exception
            goto L_0x008d
        L_0x0089:
            r1 = r2
            goto L_0x0093
        L_0x008b:
            r0 = move-exception
            r2 = r1
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ IOException -> 0x0092 }
        L_0x0092:
            throw r0
        L_0x0093:
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.d.l.a(java.lang.String, int, int):boolean");
    }
}
