package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67266a;

    /* renamed from: b  reason: collision with root package name */
    private final e f67267b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67268c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67269d;

    /* renamed from: e  reason: collision with root package name */
    private final View f67270e;

    /* renamed from: f  reason: collision with root package name */
    private final View f67271f;
    private final int g;
    private final int h;

    f(e eVar, int i, int i2, View view, View view2, int i3, int i4) {
        this.f67267b = eVar;
        this.f67268c = i;
        this.f67269d = i2;
        this.f67270e = view;
        this.f67271f = view2;
        this.g = i3;
        this.h = i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f67266a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 76975(0x12caf, float:1.07865E-40)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f67266a
            r5 = 0
            r6 = 76975(0x12caf, float:1.07865E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r3 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.e r8 = r15.f67267b
            int r1 = r15.f67268c
            int r2 = r15.f67269d
            android.view.View r3 = r15.f67270e
            android.view.View r9 = r15.f67271f
            int r4 = r15.g
            int r5 = r15.h
            if (r1 != 0) goto L_0x003e
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r1 = com.ss.android.ugc.aweme.port.in.a.q
            int r1 = r1.getVideoWidth()
        L_0x003e:
            if (r2 != 0) goto L_0x0046
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r2 = com.ss.android.ugc.aweme.port.in.a.q
            int r2 = r2.getVideoHeight()
        L_0x0046:
            r10 = r3
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.h r11 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.h
            r11.<init>(r1, r2, r4, r5)
            r12 = 3
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r0] = r10
            r13 = 1
            r1[r13] = r9
            r14 = 2
            r1[r14] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.e.f67265b
            r4 = 0
            r5 = 76972(0x12cac, float:1.07861E-40)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r6[r0] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r6[r13] = r2
            java.lang.Class<com.ss.android.ugc.aweme.base.b.a.c> r2 = com.ss.android.ugc.aweme.base.b.a.c.class
            r6[r14] = r2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r2 = r8
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x009d
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r0] = r10
            r1[r13] = r9
            r1[r14] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.e.f67265b
            r4 = 0
            r5 = 76972(0x12cac, float:1.07861E-40)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r6[r0] = r2
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r6[r13] = r0
            java.lang.Class<com.ss.android.ugc.aweme.base.b.a.c> r0 = com.ss.android.ugc.aweme.base.b.a.c.class
            r6[r14] = r0
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r2 = r8
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = (java.lang.Object) r0
            goto L_0x015e
        L_0x009d:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r0] = r9
            r1[r13] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.e.f67265b
            r4 = 0
            r5 = 76974(0x12cae, float:1.07864E-40)
            java.lang.Class[] r6 = new java.lang.Class[r14]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r6[r0] = r2
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r6[r13] = r2
            java.lang.Class<android.view.View[]> r7 = android.view.View[].class
            r2 = r8
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00dd
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r0] = r9
            r1[r13] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.e.f67265b
            r4 = 0
            r5 = 76974(0x12cae, float:1.07864E-40)
            java.lang.Class[] r6 = new java.lang.Class[r14]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r6[r0] = r2
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r6[r13] = r2
            java.lang.Class<android.view.View[]> r7 = android.view.View[].class
            r2 = r8
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            android.view.View[] r1 = (android.view.View[]) r1
        L_0x00db:
            r12 = r1
            goto L_0x00fc
        L_0x00dd:
            int r1 = r10.getChildCount()
            android.view.View[] r1 = new android.view.View[r1]
            int r2 = r10.getChildCount()
            int r2 = r2 - r13
        L_0x00e8:
            if (r2 < 0) goto L_0x00db
            android.view.View r3 = r10.getChildAt(r2)
            if (r3 == r9) goto L_0x00f9
            android.view.View r3 = r10.getChildAt(r2)
            r1[r2] = r3
            r10.removeViewAt(r2)
        L_0x00f9:
            int r2 = r2 + -1
            goto L_0x00e8
        L_0x00fc:
            int r1 = r9.getVisibility()
            if (r1 == 0) goto L_0x0105
            r9.setVisibility(r0)
        L_0x0105:
            r9.invalidate()
            r10.invalidate()
            java.lang.Object r11 = r11.a(r10)
            if (r1 == 0) goto L_0x0114
            r9.setVisibility(r1)
        L_0x0114:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r0] = r10
            r1[r13] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.e.f67265b
            r4 = 0
            r5 = 76973(0x12cad, float:1.07862E-40)
            java.lang.Class[] r6 = new java.lang.Class[r14]
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r6[r0] = r2
            java.lang.Class<android.view.View[]> r2 = android.view.View[].class
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r8
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0150
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r0] = r10
            r1[r13] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.e.f67265b
            r4 = 0
            r5 = 76973(0x12cad, float:1.07862E-40)
            java.lang.Class[] r6 = new java.lang.Class[r14]
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            r6[r0] = r2
            java.lang.Class<android.view.View[]> r0 = android.view.View[].class
            r6[r13] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x015d
        L_0x0150:
            int r1 = r12.length
            if (r0 >= r1) goto L_0x015d
            r1 = r12[r0]
            if (r1 == 0) goto L_0x015a
            r10.addView(r1, r0)
        L_0x015a:
            int r0 = r0 + 1
            goto L_0x0150
        L_0x015d:
            r0 = r11
        L_0x015e:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.i r1 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.i
            int r2 = r10.indexOfChild(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.f.call():java.lang.Object");
    }
}
