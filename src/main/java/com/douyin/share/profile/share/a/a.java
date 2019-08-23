package com.douyin.share.profile.share.a;

import android.app.Activity;
import com.douyin.share.a.b.c.c;
import com.douyin.share.a.c.b;

public class a extends com.douyin.share.a.c.a implements com.douyin.share.a.b.c.a, c {
    public final boolean a(com.douyin.share.a.b.b.a aVar) {
        if (!a()) {
            return false;
        }
        String a2 = com.douyin.share.profile.share.a.a(aVar.h(), this.f23138b);
        b.a(this.f23137a, aVar.c(), a2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (r12.canRead() != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.douyin.share.a.b.b.d r11, android.os.Handler r12) {
        /*
            r10 = this;
            boolean r12 = r10.a()
            if (r12 != 0) goto L_0x0008
            r11 = 0
            return r11
        L_0x0008:
            java.lang.String r1 = r11.b()
            java.lang.String r2 = r11.d()
            java.lang.String r3 = r11.e()
            java.lang.String r6 = r11.c()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r0 = com.douyin.share.a.c.b.a()
            r12.append(r0)
            java.lang.String r7 = r12.toString()
            java.lang.String r4 = r11.g()
            java.lang.String r11 = r11.h()
            java.lang.String r12 = r10.f23138b
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r11)
            r5 = 0
            if (r0 != 0) goto L_0x0074
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0043
            goto L_0x0074
        L_0x0043:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r8 = "mounted"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0050
            goto L_0x0074
        L_0x0050:
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            java.lang.String r11 = r0.getName()
            java.lang.String r11 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r11)
            java.io.File r8 = new java.io.File
            r8.<init>(r12, r11)
            boolean r9 = r8.exists()
            if (r9 != 0) goto L_0x006f
            java.lang.String r0 = r0.getAbsolutePath()
            com.bytedance.common.utility.io.FileUtils.copyFile(r0, r12, r11)
        L_0x006f:
            java.lang.String r11 = r8.getAbsolutePath()
            goto L_0x0075
        L_0x0074:
            r11 = r5
        L_0x0075:
            if (r11 == 0) goto L_0x0089
            java.io.File r12 = new java.io.File
            r12.<init>(r11)
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x008a
            boolean r12 = r12.canRead()
            if (r12 != 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r5 = r11
        L_0x008a:
            android.app.Activity r0 = r10.f23137a
            r8 = 1
            com.douyin.share.a.c.b.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (int) r8)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.douyin.share.profile.share.a.a.a(com.douyin.share.a.b.b.d, android.os.Handler):boolean");
    }

    public a(Activity activity, String str, String str2) {
        super(activity, str, str2);
    }
}
