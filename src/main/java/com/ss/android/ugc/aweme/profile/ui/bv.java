package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.concurrent.Callable;

public final /* synthetic */ class bv implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62551a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverCropActivity f62552b;

    bv(ProfileCoverCropActivity profileCoverCropActivity) {
        this.f62552b = profileCoverCropActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r17 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f62551a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 68618(0x10c0a, float:9.6154E-41)
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f62551a
            r5 = 0
            r6 = 68618(0x10c0a, float:9.6154E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r3 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x002a:
            r1 = r17
            com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity r9 = r1.f62552b
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity.f62085a
            r5 = 0
            r6 = 68606(0x10bfe, float:9.6137E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0055
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity.f62085a
            r5 = 0
            r6 = 68606(0x10bfe, float:9.6137E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0055:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.d.l.f61457a
            r5 = 1
            r6 = 69970(0x11152, float:9.8049E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.io.File> r8 = java.io.File.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x007d
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.profile.d.l.f61457a
            r13 = 1
            r14 = 69970(0x11152, float:9.8049E-41)
            java.lang.Class[] r15 = new java.lang.Class[r0]
            java.lang.Class<java.io.File> r16 = java.io.File.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.io.File r2 = (java.io.File) r2
        L_0x007b:
            r10 = r2
            goto L_0x008b
        L_0x007d:
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "profileCover"
            java.io.File r3 = com.ss.android.ugc.aweme.video.b.a((java.lang.String) r3)
            java.lang.String r4 = "profileCoverCrop.png"
            r2.<init>(r3, r4)
            goto L_0x007b
        L_0x008b:
            com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView r11 = r9.mCoverImage
            android.graphics.Bitmap r12 = r9.f62086b
            r13 = 2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r0] = r11
            r14 = 1
            r2[r14] = r12
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity.f62085a
            r5 = 0
            r6 = 68605(0x10bfd, float:9.6136E-41)
            java.lang.Class[] r7 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView> r3 = com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.class
            r7[r0] = r3
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r7[r14] = r3
            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            r15 = 0
            if (r2 == 0) goto L_0x00d3
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r0] = r11
            r2[r14] = r12
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity.f62085a
            r5 = 0
            r6 = 68605(0x10bfd, float:9.6136E-41)
            java.lang.Class[] r7 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView> r3 = com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.class
            r7[r0] = r3
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            r7[r14] = r0
            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            r12 = r0
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            goto L_0x014d
        L_0x00d3:
            android.graphics.RectF r2 = r11.a((android.graphics.RectF) r15)
            android.graphics.Rect r3 = r9.f62087c
            if (r3 != 0) goto L_0x00dc
            goto L_0x014d
        L_0x00dc:
            android.graphics.Rect r3 = r9.f62087c
            int r3 = r3.left
            float r3 = (float) r3
            float r4 = r2.left
            float r3 = r3 - r4
            float r4 = r2.width()
            float r3 = r3 / r4
            int r4 = r12.getWidth()
            float r4 = (float) r4
            float r3 = r3 * r4
            int r3 = (int) r3
            android.graphics.Rect r4 = r9.f62087c
            int r4 = r4.top
            float r4 = (float) r4
            float r5 = r2.top
            float r4 = r4 - r5
            float r5 = r2.height()
            float r4 = r4 / r5
            int r5 = r12.getHeight()
            float r5 = (float) r5
            float r4 = r4 * r5
            int r4 = (int) r4
            android.graphics.Rect r5 = r9.f62087c
            int r5 = r5.width()
            float r5 = (float) r5
            float r6 = r2.width()
            float r5 = r5 / r6
            int r6 = r12.getWidth()
            float r6 = (float) r6
            float r5 = r5 * r6
            int r5 = (int) r5
            android.graphics.Rect r6 = r9.f62087c
            int r6 = r6.height()
            float r6 = (float) r6
            float r2 = r2.height()
            float r6 = r6 / r2
            int r2 = r12.getHeight()
            float r2 = (float) r2
            float r6 = r6 * r2
            int r2 = (int) r6
            if (r3 >= 0) goto L_0x0131
            r3 = 0
        L_0x0131:
            if (r4 >= 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r0 = r4
        L_0x0135:
            int r4 = r12.getWidth()
            if (r5 <= r4) goto L_0x013f
            int r5 = r12.getWidth()
        L_0x013f:
            int r4 = r12.getHeight()
            if (r2 <= r4) goto L_0x0149
            int r2 = r12.getHeight()
        L_0x0149:
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r12, r3, r0, r5, r2)
        L_0x014d:
            java.lang.String r0 = r10.getParent()
            java.lang.String r2 = r10.getName()
            boolean r0 = com.bytedance.common.utility.BitmapUtils.saveBitmapToSD(r12, r0, r2)
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r10.getAbsolutePath()
            return r0
        L_0x0160:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.bv.call():java.lang.Object");
    }
}
