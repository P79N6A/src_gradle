package com.ss.android.ugc.aweme.qrcode.d;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.bi;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63442a;

    /* renamed from: b  reason: collision with root package name */
    public a f63443b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f63444c;

    /* renamed from: d  reason: collision with root package name */
    public String f63445d;

    public interface a {
        View a();

        void a(String str);

        void ac_();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63442a, false, 70481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63442a, false, 70481, new Class[0], Void.TYPE);
            return;
        }
        this.f63443b.ac_();
        com.ss.android.b.a.a.a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63446a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r17 = this;
                    r7 = r17
                    r8 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f63446a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 70484(0x11354, float:9.8769E-41)
                    r1 = r17
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0029
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f63446a
                    r3 = 0
                    r4 = 70484(0x11354, float:9.8769E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r17
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0029:
                    com.ss.android.ugc.aweme.qrcode.d.l r0 = com.ss.android.ugc.aweme.qrcode.d.l.this
                    java.lang.String r0 = r0.f63445d
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x005c
                    com.ss.android.ugc.aweme.qrcode.d.l r0 = com.ss.android.ugc.aweme.qrcode.d.l.this
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    long r3 = java.lang.System.currentTimeMillis()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r2 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r2)
                    r1.append(r2)
                    java.lang.String r2 = ".png"
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.f63445d = r1
                L_0x005c:
                    com.ss.android.ugc.aweme.qrcode.d.l r0 = com.ss.android.ugc.aweme.qrcode.d.l.this
                    com.ss.android.ugc.aweme.qrcode.d.l$a r0 = r0.f63443b
                    if (r0 == 0) goto L_0x0133
                    com.ss.android.ugc.aweme.qrcode.d.l r0 = com.ss.android.ugc.aweme.qrcode.d.l.this
                    com.ss.android.ugc.aweme.qrcode.d.l$a r0 = r0.f63443b
                    android.view.View r0 = r0.a()
                    com.ss.android.ugc.aweme.qrcode.d.l r1 = com.ss.android.ugc.aweme.qrcode.d.l.this
                    android.app.Activity r1 = r1.f63444c
                    java.lang.String r1 = com.ss.android.ugc.aweme.am.a.a(r1)
                    com.ss.android.ugc.aweme.qrcode.d.l r2 = com.ss.android.ugc.aweme.qrcode.d.l.this
                    java.lang.String r2 = r2.f63445d
                    r3 = 3
                    java.lang.Object[] r9 = new java.lang.Object[r3]
                    r9[r8] = r0
                    r4 = 1
                    r9[r4] = r1
                    r5 = 2
                    r9[r5] = r2
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.qrcode.e.c.f63464a
                    r12 = 1
                    r13 = 70511(0x1136f, float:9.8807E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r3]
                    java.lang.Class<android.view.View> r6 = android.view.View.class
                    r14[r8] = r6
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r14[r4] = r6
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r14[r5] = r6
                    java.lang.Class<java.lang.String> r15 = java.lang.String.class
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    r9 = 0
                    if (r6 == 0) goto L_0x00c6
                    java.lang.Object[] r10 = new java.lang.Object[r3]
                    r10[r8] = r0
                    r10[r4] = r1
                    r10[r5] = r2
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.qrcode.e.c.f63464a
                    r13 = 1
                    r14 = 70511(0x1136f, float:9.8807E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r3]
                    java.lang.Class<android.view.View> r0 = android.view.View.class
                    r15[r8] = r0
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    r15[r4] = r0
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    r15[r5] = r0
                    java.lang.Class<java.lang.String> r16 = java.lang.String.class
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    r9 = r0
                    java.lang.String r9 = (java.lang.String) r9
                    goto L_0x012b
                L_0x00c6:
                    java.lang.Object[] r10 = new java.lang.Object[r4]
                    r10[r8] = r0
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.qrcode.e.c.f63464a
                    r13 = 1
                    r14 = 70512(0x11370, float:9.8808E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r4]
                    java.lang.Class<android.view.View> r3 = android.view.View.class
                    r15[r8] = r3
                    java.lang.Class<android.graphics.Bitmap> r16 = android.graphics.Bitmap.class
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                    if (r3 == 0) goto L_0x00f9
                    java.lang.Object[] r10 = new java.lang.Object[r4]
                    r10[r8] = r0
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.qrcode.e.c.f63464a
                    r13 = 1
                    r14 = 70512(0x11370, float:9.8808E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r4]
                    java.lang.Class<android.view.View> r0 = android.view.View.class
                    r15[r8] = r0
                    java.lang.Class<android.graphics.Bitmap> r16 = android.graphics.Bitmap.class
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                    goto L_0x010f
                L_0x00f9:
                    r0.setDrawingCacheEnabled(r4)
                    r0.buildDrawingCache()
                    android.graphics.Bitmap r3 = r0.getDrawingCache()
                    if (r3 == 0) goto L_0x010e
                    android.graphics.Bitmap r0 = r0.getDrawingCache()
                    android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
                    goto L_0x010f
                L_0x010e:
                    r0 = r9
                L_0x010f:
                    if (r0 == 0) goto L_0x012b
                    boolean r0 = com.bytedance.common.utility.BitmapUtils.saveBitmapToSD(r0, r1, r2)
                    if (r0 == 0) goto L_0x012b
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    java.lang.String r1 = "/"
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r9 = r0.toString()
                L_0x012b:
                    com.ss.android.ugc.aweme.qrcode.d.l$1$1 r0 = new com.ss.android.ugc.aweme.qrcode.d.l$1$1
                    r0.<init>(r9)
                    com.ss.android.b.a.a.a.b(r0)
                L_0x0133:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.d.l.AnonymousClass1.run():void");
            }
        });
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63442a, false, 70482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63442a, false, 70482, new Class[0], Void.TYPE);
            return;
        }
        b.a(this.f63444c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63451a;

            public final void a(String[] strArr, int[] iArr) {
                if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f63451a, false, 70486, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f63451a, false, 70486, new Class[]{String[].class, int[].class}, Void.TYPE);
                    return;
                }
                if (iArr.length > 0 && iArr[0] == -1 && !ActivityCompat.shouldShowRequestPermissionRationale(l.this.f63444c, strArr[0])) {
                    bc.a(l.this.f63444c, C0906R.string.fs, C0906R.string.pm, new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f63453a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63453a, false, 70487, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63453a, false, 70487, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            }
                        }
                    }, C0906R.string.a0x, new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f63455a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63455a, false, 70488, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63455a, false, 70488, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            bi.a(l.this.f63444c);
                        }
                    }).show();
                }
            }
        });
    }

    public l(a aVar, Activity activity) {
        this(aVar, activity, "");
    }

    private l(a aVar, Activity activity, String str) {
        this.f63443b = aVar;
        this.f63444c = activity;
        this.f63445d = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r21, @android.support.annotation.NonNull java.lang.String[] r22, @android.support.annotation.NonNull int[] r23) {
        /*
            r20 = this;
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r22
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f63442a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 70483(0x11353, float:9.8768E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005b
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r22
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = f63442a
            r16 = 0
            r17 = 70483(0x11353, float:9.8768E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005b:
            r0 = r21
            if (r0 != r11) goto L_0x0071
            int r0 = r1.length
        L_0x0060:
            if (r10 >= r0) goto L_0x006e
            r2 = r1[r10]
            r3 = -1
            if (r2 != r3) goto L_0x006b
            r20.b()
            return
        L_0x006b:
            int r10 = r10 + 1
            goto L_0x0060
        L_0x006e:
            r20.a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.d.l.a(int, java.lang.String[], int[]):void");
    }
}
