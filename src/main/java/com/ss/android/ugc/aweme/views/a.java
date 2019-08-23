package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import javax.annotation.Nullable;

public class a extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76442a;

    public a(Context context) {
        super(context);
    }

    public void setController(@Nullable DraweeController draweeController) {
        if (PatchProxy.isSupport(new Object[]{draweeController}, this, f76442a, false, 89372, new Class[]{DraweeController.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{draweeController}, this, f76442a, false, 89372, new Class[]{DraweeController.class}, Void.TYPE);
            return;
        }
        super.setController(draweeController);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76442a, false, 89375, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76442a, false, 89375, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        DraweeController draweeController = null;
        try {
            draweeController = getController();
        } catch (NullPointerException unused) {
        }
        if (draweeController != null) {
            Animatable animatable = draweeController.getAnimatable();
            if (animatable != null) {
                if (z) {
                    animatable.start();
                } else {
                    animatable.stop();
                }
            }
        }
    }

    public void onWindowVisibilityChanged(int i) {
        int i2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76442a, false, 89373, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76442a, false, 89373, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            i2 = i;
        } else if (getVisibility() == 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (i2 == 0) {
            z = true;
        }
        a(z);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public void onVisibilityChanged(@NonNull View view, int i) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f76442a, false, 89374, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f76442a, false, 89374, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        }
        a(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r20, android.graphics.Bitmap.Config r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r21
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r20
            r11 = 1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f76442a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<android.graphics.Bitmap$Config> r1 = android.graphics.Bitmap.Config.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 89371(0x15d1b, float:1.25235E-40)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r20
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f76442a
            r3 = 0
            r4 = 89371(0x15d1b, float:1.25235E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<android.graphics.Bitmap$Config> r1 = android.graphics.Bitmap.Config.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            r0 = 3
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r10] = r7
            r12[r11] = r20
            r12[r9] = r8
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.helper.b.f68118a
            r15 = 1
            r16 = 77448(0x12e88, float:1.08528E-40)
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r2 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r1[r10] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r11] = r2
            java.lang.Class<android.graphics.Bitmap$Config> r2 = android.graphics.Bitmap.Config.class
            r1[r9] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0092
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r10] = r7
            r12[r11] = r20
            r12[r9] = r8
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.helper.b.f68118a
            r15 = 1
            r16 = 77448(0x12e88, float:1.08528E-40)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<android.graphics.Bitmap$Config> r1 = android.graphics.Bitmap.Config.class
            r0[r9] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0092:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r20)
            if (r2 != 0) goto L_0x0118
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r10] = r20
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r12[r11] = r1
            r12[r9] = r8
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.helper.b.f68118a
            r15 = 1
            r16 = 77451(0x12e8b, float:1.08532E-40)
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r11] = r2
            java.lang.Class<android.graphics.Bitmap$Config> r2 = android.graphics.Bitmap.Config.class
            r1[r9] = r2
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r18 = com.facebook.imagepipeline.request.ImageRequest[].class
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x00f0
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r10] = r20
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r12[r11] = r1
            r12[r9] = r8
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.helper.b.f68118a
            r15 = 1
            r16 = 77451(0x12e8b, float:1.08532E-40)
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r11] = r2
            java.lang.Class<android.graphics.Bitmap$Config> r2 = android.graphics.Bitmap.Config.class
            r1[r9] = r2
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r18 = com.facebook.imagepipeline.request.ImageRequest[].class
            r17 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.facebook.imagepipeline.request.ImageRequest[] r1 = (com.facebook.imagepipeline.request.ImageRequest[]) r1
            goto L_0x0118
        L_0x00f0:
            com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder r1 = new com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder
            r1.<init>()
            r1.setBitmapConfig(r8)
            r1.setPreDecodeFrameCount(r11)
            r1.setDecodeAllFrames(r10)
            com.facebook.imagepipeline.common.ImageDecodeOptions r2 = new com.facebook.imagepipeline.common.ImageDecodeOptions
            r2.<init>(r1)
            android.net.Uri r1 = android.net.Uri.parse(r20)
            com.facebook.imagepipeline.request.ImageRequestBuilder r1 = com.facebook.imagepipeline.request.ImageRequestBuilder.newBuilderWithSource(r1)
            com.facebook.imagepipeline.request.ImageRequestBuilder r1 = r1.setImageDecodeOptions(r2)
            com.facebook.imagepipeline.request.ImageRequest r1 = r1.build()
            com.facebook.imagepipeline.request.ImageRequest[] r2 = new com.facebook.imagepipeline.request.ImageRequest[r11]
            r2[r10] = r1
            r1 = r2
        L_0x0118:
            r2 = 4
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r7
            r12[r11] = r1
            java.lang.Byte r3 = java.lang.Byte.valueOf(r10)
            r12[r9] = r3
            r12[r0] = r8
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.helper.b.f68118a
            r15 = 1
            r16 = 77450(0x12e8a, float:1.0853E-40)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r4 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r3[r10] = r4
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r4 = com.facebook.imagepipeline.request.ImageRequest[].class
            r3[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r9] = r4
            java.lang.Class<android.graphics.Bitmap$Config> r4 = android.graphics.Bitmap.Config.class
            r3[r0] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x0179
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r7
            r12[r11] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r12[r9] = r1
            r12[r0] = r8
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.helper.b.f68118a
            r15 = 1
            r16 = 77450(0x12e8a, float:1.0853E-40)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r2 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r1[r10] = r2
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r2 = com.facebook.imagepipeline.request.ImageRequest[].class
            r1[r11] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r9] = r2
            java.lang.Class<android.graphics.Bitmap$Config> r2 = android.graphics.Bitmap.Config.class
            r1[r0] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0179:
            if (r1 != 0) goto L_0x0182
            r0 = 2130839027(0x7f0205f3, float:1.7283053E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r7, (int) r0)
            return
        L_0x0182:
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = com.facebook.drawee.backends.pipeline.Fresco.newDraweeControllerBuilder()
            com.facebook.drawee.interfaces.DraweeController r2 = r19.getController()
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.setOldController((com.facebook.drawee.interfaces.DraweeController) r2)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.setAutoPlayAnimations(r11)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.setFirstAvailableImageRequests(r1)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.facebook.drawee.controller.AbstractDraweeController r0 = r0.build()
            r7.setController(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.a.a(java.lang.String, android.graphics.Bitmap$Config):void");
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
