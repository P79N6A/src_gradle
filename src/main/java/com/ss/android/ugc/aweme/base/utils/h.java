package com.ss.android.ugc.aweme.base.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35022a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35023a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f35024b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f35025c = Bitmap.Config.RGB_565;
        @DrawableRes

        /* renamed from: d  reason: collision with root package name */
        public int f35026d = 2130838560;

        /* renamed from: e  reason: collision with root package name */
        public UrlModel f35027e;

        /* renamed from: f  reason: collision with root package name */
        public RemoteImageView f35028f;
        ControllerListener<ImageInfo> g = new BaseControllerListener<ImageInfo>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35029a;

            /* renamed from: b  reason: collision with root package name */
            boolean f35030b;

            public final void onRelease(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f35029a, false, 25222, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f35029a, false, 25222, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                super.onRelease(str);
                this.f35030b = false;
            }

            public final void onFailure(String str, Throwable th) {
                if (PatchProxy.isSupport(new Object[]{str, th}, this, f35029a, false, 25221, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f35029a, false, 25221, new Class[]{String.class, Throwable.class}, Void.TYPE);
                    return;
                }
                super.onFailure(str, th);
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f35023a, false, 25212, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f35023a, false, 25212, new Class[0], Void.TYPE);
                } else {
                    aVar.a(aVar.f35024b, aVar.f35025c, (BaseControllerListener<ImageInfo>) null);
                }
                this.f35030b = false;
            }

            public final /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo}, this, f35029a, false, 25223, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo}, this, f35029a, false, 25223, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                    return;
                }
                super.onIntermediateImageSet(str, imageInfo);
                this.f35030b = false;
            }

            public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f35029a, false, 25220, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f35029a, false, 25220, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                    return;
                }
                if (animatable != null) {
                    this.f35030b = true;
                    if (PatchProxy.isSupport(new Object[0], this, f35029a, false, 25219, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f35029a, false, 25219, new Class[0], Void.TYPE);
                    } else {
                        if (a.this.f35028f.getController() != null && a.this.f35028f.getVisibility() == 0 && this.f35030b) {
                            Animatable animatable2 = a.this.f35028f.getController().getAnimatable();
                            if (animatable2 != null && !animatable2.isRunning()) {
                                animatable2.start();
                            }
                        }
                    }
                } else {
                    this.f35030b = false;
                }
            }
        };
        private int h;
        private int i;
        private ImageRequest[] j;
        private DraweeController k;
        private PipelineDraweeControllerBuilder l;
        private boolean m = true;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int hashCode() {
            /*
                r12 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f35023a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Integer.TYPE
                r4 = 0
                r5 = 25218(0x6282, float:3.5338E-41)
                r2 = r12
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x002a
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f35023a
                r5 = 0
                r6 = 25218(0x6282, float:3.5338E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Integer.TYPE
                r3 = r12
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L_0x002a:
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r2 = r12.f35026d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r0] = r2
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r12.f35027e
                r3 = 1
                r1[r3] = r2
                r2 = 2
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r12.f35028f
                r1[r2] = r4
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r0] = r1
                r6 = 0
                com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.base.utils.n.f35040a
                r8 = 1
                r9 = 25254(0x62a6, float:3.5388E-41)
                java.lang.Class[] r10 = new java.lang.Class[r3]
                java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
                r10[r0] = r2
                java.lang.Class r11 = java.lang.Integer.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
                if (r2 == 0) goto L_0x0074
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r4[r0] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.base.utils.n.f35040a
                r7 = 1
                r8 = 25254(0x62a6, float:3.5388E-41)
                java.lang.Class[] r9 = new java.lang.Class[r3]
                java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
                r9[r0] = r1
                java.lang.Class r10 = java.lang.Integer.TYPE
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L_0x0074:
                int r0 = java.util.Arrays.hashCode(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.utils.h.a.hashCode():int");
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f35023a, false, 25217, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f35023a, false, 25217, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (this == obj) {
                return true;
            } else {
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (this.f35026d != aVar.f35026d || !n.a(this.f35027e, aVar.f35027e) || !n.a(this.f35028f, aVar.f35028f)) {
                    return false;
                }
                return true;
            }
        }

        @NonNull
        private ImageRequest[] a(int i2, boolean z, Bitmap.Config config) {
            Bitmap.Config config2 = config;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), config2}, this, f35023a, false, 25216, new Class[]{Integer.TYPE, Boolean.TYPE, Bitmap.Config.class}, ImageRequest[].class)) {
                return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z), config2}, this, f35023a, false, 25216, new Class[]{Integer.TYPE, Boolean.TYPE, Bitmap.Config.class}, ImageRequest[].class);
            }
            if (this.j == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config2);
                boolean z2 = z;
                imageDecodeOptionsBuilder.setDecodeAllFrames(z);
                this.j = new ImageRequest[]{ImageRequestBuilder.newBuilderWithResourceId(i2).setImageDecodeOptions(new ImageDecodeOptions(imageDecodeOptionsBuilder)).build()};
            }
            return this.j;
        }

        @NonNull
        private ImageRequest[] a(String str, boolean z, Bitmap.Config config) {
            Bitmap.Config config2 = config;
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0), config2}, this, f35023a, false, 25215, new Class[]{String.class, Boolean.TYPE, Bitmap.Config.class}, ImageRequest[].class)) {
                return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z), config2}, this, f35023a, false, 25215, new Class[]{String.class, Boolean.TYPE, Bitmap.Config.class}, ImageRequest[].class);
            }
            if (this.j == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config2);
                imageDecodeOptionsBuilder.setPreDecodeFrameCount(1);
                boolean z2 = z;
                imageDecodeOptionsBuilder.setDecodeAllFrames(z);
                this.j = new ImageRequest[]{ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setImageDecodeOptions(new ImageDecodeOptions(imageDecodeOptionsBuilder)).build()};
            }
            return this.j;
        }

        public final void a(boolean z, Bitmap.Config config, BaseControllerListener<ImageInfo> baseControllerListener) {
            boolean z2 = z;
            Bitmap.Config config2 = config;
            BaseControllerListener<ImageInfo> baseControllerListener2 = baseControllerListener;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), config2, baseControllerListener2}, this, f35023a, false, 25214, new Class[]{Boolean.TYPE, Bitmap.Config.class, BaseControllerListener.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), config2, baseControllerListener2}, this, f35023a, false, 25214, new Class[]{Boolean.TYPE, Bitmap.Config.class, BaseControllerListener.class}, Void.TYPE);
                return;
            }
            this.f35024b = z2;
            this.f35025c = config2;
            ImageRequest[] imageRequestArr = null;
            if (this.f35027e != null) {
                List<String> urlList = this.f35027e.getUrlList();
                int i2 = this.h;
                this.h = i2 + 1;
                String a2 = h.a(urlList, i2);
                if (!TextUtils.isEmpty(a2)) {
                    imageRequestArr = a(a2, z2, config2);
                }
            } else if (this.i > 0) {
                imageRequestArr = a(this.i, z2, config2);
            }
            if (imageRequestArr == null) {
                c.a(this.f35028f, com.ss.android.ugc.aweme.base.model.a.a(this.f35026d));
                return;
            }
            if (this.l == null) {
                this.l = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(this.f35028f.getController())).setControllerListener(this.g)).setAutoPlayAnimations(true);
            }
            this.l.setFirstAvailableImageRequests(imageRequestArr);
            if (this.k == null) {
                this.k = this.l.build();
                if ((this.k instanceof com.facebook.drawee.backends.pipeline.c) && baseControllerListener2 != null) {
                    ((com.facebook.drawee.backends.pipeline.c) this.k).addControllerListener(baseControllerListener2);
                }
            }
            this.f35028f.setController(this.k);
        }
    }

    public static String a(List<String> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, null, f35022a, true, 25205, new Class[]{List.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, null, f35022a, true, 25205, new Class[]{List.class, Integer.TYPE}, String.class);
        } else if (!CollectionUtils.isEmpty(list) && i < list.size()) {
            return list.get(i);
        } else {
            return null;
        }
    }
}
