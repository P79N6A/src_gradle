package com.bytedance.android.livesdk.livecommerce.view.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.livecommerce.view.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16292a;

    /* renamed from: b  reason: collision with root package name */
    public d.a f16293b;

    /* renamed from: c  reason: collision with root package name */
    private View f16294c;

    /* renamed from: d  reason: collision with root package name */
    private long f16295d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16296e = true;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f16297f = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16298a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f16298a, false, 10844, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16298a, false, 10844, new Class[0], Void.TYPE);
                return;
            }
            a.this.b();
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16292a, false, 10840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16292a, false, 10840, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16292a, false, 10842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16292a, false, 10842, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f16296e) {
            this.f16294c.clearAnimation();
            if (this.f16294c != null) {
                ViewParent parent = this.f16294c.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f16294c);
                }
                this.f16296e = true;
            }
        }
    }

    public final void a(d.a aVar) {
        this.f16293b = aVar;
    }

    public final void a(long j) {
        this.f16295d = 5000;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16292a, false, 10841, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16292a, false, 10841, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f16294c = view;
        this.f16294c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16300a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f16300a, false, 10845, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f16300a, false, 10845, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (a.this.f16293b != null) {
                    a.this.f16293b.a(view);
                }
                a.this.b();
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0145, code lost:
        if (com.bytedance.android.livesdk.livecommerce.f.c.f16198b == com.bytedance.android.livesdk.livecommerce.f.c.a.FULL_SCREEN) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0149, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0197, code lost:
        if (com.bytedance.android.livesdk.livecommerce.f.c.f16198b == com.bytedance.android.livesdk.livecommerce.f.c.a.FULL_SCREEN) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.ViewGroup r21, android.view.View r22, int r23, int r24) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            r13 = 48
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14 = 2
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r15 = 3
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16292a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 10843(0x2a5b, float:1.5194E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16292a
            r3 = 0
            r4 = 10843(0x2a5b, float:1.5194E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0071:
            boolean r0 = r8 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x025f
            int[] r0 = new int[r14]
            r9.getLocationOnScreen(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 80
            r1.gravity = r2
            android.content.Context r2 = r21.getContext()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.a.f16195a
            r16 = 1
            r17 = 10726(0x29e6, float:1.503E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x00c4
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.a.f16195a
            r16 = 1
            r17 = 10726(0x29e6, float:1.503E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0225
        L_0x00c4:
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.c.f16197a
            r16 = 1
            r17 = 10730(0x29ea, float:1.5036E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x0100
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.c.f16197a
            r16 = 1
            r17 = 10730(0x29ea, float:1.5036E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0225
        L_0x0100:
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.c.f16197a
            r16 = 1
            r17 = 10733(0x29ed, float:1.504E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x013b
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.c.f16197a
            r16 = 1
            r17 = 10733(0x29ed, float:1.504E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x019a
        L_0x013b:
            com.bytedance.android.livesdk.livecommerce.f.c$a r3 = com.bytedance.android.livesdk.livecommerce.f.c.f16198b
            com.bytedance.android.livesdk.livecommerce.f.c$a r4 = com.bytedance.android.livesdk.livecommerce.f.c.a.UNKNOWN
            if (r3 == r4) goto L_0x014b
            com.bytedance.android.livesdk.livecommerce.f.c$a r3 = com.bytedance.android.livesdk.livecommerce.f.c.f16198b
            com.bytedance.android.livesdk.livecommerce.f.c$a r4 = com.bytedance.android.livesdk.livecommerce.f.c.a.FULL_SCREEN
            if (r3 != r4) goto L_0x0149
        L_0x0147:
            r3 = 1
            goto L_0x019a
        L_0x0149:
            r3 = 0
            goto L_0x019a
        L_0x014b:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r3 <= r4) goto L_0x0189
            java.lang.String r3 = "window"
            java.lang.Object r3 = r2.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            if (r3 == 0) goto L_0x0189
            android.view.Display r3 = r3.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            r3.getRealSize(r4)
            int r3 = r4.x
            int r5 = r4.y
            if (r3 >= r5) goto L_0x0174
            int r3 = r4.x
            float r3 = (float) r3
            int r4 = r4.y
            float r4 = (float) r4
            goto L_0x017a
        L_0x0174:
            int r3 = r4.y
            float r3 = (float) r3
            int r4 = r4.x
            float r4 = (float) r4
        L_0x017a:
            float r4 = r4 / r3
            r3 = 1073490166(0x3ffc28f6, float:1.97)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0185
            com.bytedance.android.livesdk.livecommerce.f.c$a r3 = com.bytedance.android.livesdk.livecommerce.f.c.a.FULL_SCREEN
            goto L_0x0187
        L_0x0185:
            com.bytedance.android.livesdk.livecommerce.f.c$a r3 = com.bytedance.android.livesdk.livecommerce.f.c.a.NORMAL_SCREEN
        L_0x0187:
            com.bytedance.android.livesdk.livecommerce.f.c.f16198b = r3
        L_0x0189:
            com.bytedance.android.livesdk.livecommerce.f.c$a r3 = com.bytedance.android.livesdk.livecommerce.f.c.f16198b
            com.bytedance.android.livesdk.livecommerce.f.c$a r4 = com.bytedance.android.livesdk.livecommerce.f.c.a.UNKNOWN
            if (r3 != r4) goto L_0x0193
            com.bytedance.android.livesdk.livecommerce.f.c$a r3 = com.bytedance.android.livesdk.livecommerce.f.c.a.NORMAL_SCREEN
            com.bytedance.android.livesdk.livecommerce.f.c.f16198b = r3
        L_0x0193:
            com.bytedance.android.livesdk.livecommerce.f.c$a r3 = com.bytedance.android.livesdk.livecommerce.f.c.f16198b
            com.bytedance.android.livesdk.livecommerce.f.c$a r4 = com.bytedance.android.livesdk.livecommerce.f.c.a.FULL_SCREEN
            if (r3 != r4) goto L_0x0149
            goto L_0x0147
        L_0x019a:
            if (r3 != 0) goto L_0x01a2
            int r2 = com.bytedance.android.livesdk.livecommerce.f.c.a(r2)
            goto L_0x0225
        L_0x01a2:
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.c.f16197a
            r16 = 1
            r17 = 10731(0x29eb, float:1.5037E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x01dd
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.livecommerce.f.c.f16197a
            r16 = 1
            r17 = 10731(0x29eb, float:1.5037E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0225
        L_0x01dd:
            if (r2 == 0) goto L_0x0221
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 17
            if (r3 >= r4) goto L_0x01e6
            goto L_0x0221
        L_0x01e6:
            android.content.res.Resources r3 = r2.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            if (r3 != r12) goto L_0x01f4
            r3 = 0
            goto L_0x01f5
        L_0x01f4:
            r3 = 1
        L_0x01f5:
            android.graphics.Point[] r4 = com.bytedance.android.livesdk.livecommerce.f.c.f16199c
            r4 = r4[r3]
            if (r4 != 0) goto L_0x021a
            java.lang.String r4 = "window"
            java.lang.Object r4 = r2.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x020a
            int r2 = com.bytedance.android.livesdk.livecommerce.f.c.a(r2)
            goto L_0x0225
        L_0x020a:
            android.view.Display r2 = r4.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            r2.getRealSize(r4)
            android.graphics.Point[] r2 = com.bytedance.android.livesdk.livecommerce.f.c.f16199c
            r2[r3] = r4
        L_0x021a:
            android.graphics.Point[] r2 = com.bytedance.android.livesdk.livecommerce.f.c.f16199c
            r2 = r2[r3]
            int r2 = r2.y
            goto L_0x0225
        L_0x0221:
            int r2 = com.bytedance.android.livesdk.livecommerce.f.c.a(r2)
        L_0x0225:
            r3 = r0[r12]
            int r2 = r2 - r3
            r1.bottomMargin = r2
            android.view.View r2 = r7.f16294c
            r2.measure(r11, r11)
            r0 = r0[r11]
            float r0 = (float) r0
            int r2 = r22.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 + r2
            android.view.View r2 = r7.f16294c
            int r2 = r2.getMeasuredWidth()
            float r2 = (float) r2
            float r2 = r2 / r3
            float r0 = r0 - r2
            int r0 = (int) r0
            r1.leftMargin = r0
            android.view.View r0 = r7.f16294c
            r8.addView(r0, r1)
            r7.f16296e = r11
            long r0 = r7.f16295d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x025f
            android.view.View r0 = r7.f16294c
            java.lang.Runnable r1 = r7.f16297f
            long r2 = r7.f16295d
            r0.postDelayed(r1, r2)
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livecommerce.view.a.a.a(android.view.ViewGroup, android.view.View, int, int):void");
    }
}
