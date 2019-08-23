package com.bytedance.android.live.core.utils;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.fresco.c;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.StringUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8293a;

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f8294b = new Handler(Looper.getMainLooper());

    public static class a implements ControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8298a;

        /* renamed from: b  reason: collision with root package name */
        private ImageModel f8299b;

        /* renamed from: c  reason: collision with root package name */
        private q.a f8300c;

        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public a(ImageModel imageModel, q.a aVar) {
            this.f8299b = imageModel;
            this.f8300c = aVar;
        }

        public final void onFailure(String str, Throwable th) {
            if (PatchProxy.isSupport(new Object[]{str, th}, this, f8298a, false, 1140, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, th}, this, f8298a, false, 1140, new Class[]{String.class, Throwable.class}, Void.TYPE);
                return;
            }
            if (this.f8300c != null) {
                this.f8300c.a(this.f8299b, new RuntimeException(th));
            }
        }

        public final void onSubmit(String str, Object obj) {
            if (PatchProxy.isSupport(new Object[]{str, obj}, this, f8298a, false, 1138, new Class[]{String.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, obj}, this, f8298a, false, 1138, new Class[]{String.class, Object.class}, Void.TYPE);
                return;
            }
            if (this.f8300c != null) {
                this.f8300c.a(this.f8299b);
            }
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            int i;
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f8298a, false, 1139, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f8298a, false, 1139, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            boolean a2 = o.a().a(this.f8299b);
            int i2 = -1;
            if (imageInfo != null) {
                i = imageInfo.getWidth();
            } else {
                i = -1;
            }
            if (imageInfo != null) {
                i2 = imageInfo.getHeight();
            }
            if (this.f8299b != null) {
                o a3 = o.a();
                ImageModel imageModel = this.f8299b;
                if (PatchProxy.isSupport(new Object[]{imageModel}, a3, o.f8308a, false, 1143, new Class[]{ImageModel.class}, Void.TYPE)) {
                    o oVar = a3;
                    PatchProxy.accessDispatch(new Object[]{imageModel}, oVar, o.f8308a, false, 1143, new Class[]{ImageModel.class}, Void.TYPE);
                } else if (imageModel != null) {
                    List<String> urls = imageModel.getUrls();
                    if (urls != null && !urls.isEmpty()) {
                        a3.f8310b.execute(new Runnable(urls) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f8313a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ List f8314b;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f8313a, false, 1145, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f8313a, false, 1145, new Class[0], Void.TYPE);
                                    return;
                                }
                                synchronized (o.this.f8312d) {
                                    o.this.f8311c.removeAll(this.f8314b);
                                }
                            }

                            {
                                this.f8314b = r2;
                            }
                        });
                    }
                }
                this.f8299b.setLoaded(true);
            }
            if (this.f8300c != null) {
                this.f8300c.a(this.f8299b, i, i2, a2);
            }
        }
    }

    private static ImageRequest[] a(ImageModel imageModel, ResizeOptions resizeOptions, Postprocessor postprocessor, boolean z) {
        ResizeOptions resizeOptions2 = resizeOptions;
        Postprocessor postprocessor2 = postprocessor;
        if (PatchProxy.isSupport(new Object[]{imageModel, resizeOptions2, postprocessor2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f8293a, true, 1107, new Class[]{ImageModel.class, ResizeOptions.class, Postprocessor.class, Boolean.TYPE}, ImageRequest[].class)) {
            return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{imageModel, resizeOptions2, postprocessor2, Byte.valueOf(z)}, null, f8293a, true, 1107, new Class[]{ImageModel.class, ResizeOptions.class, Postprocessor.class, Boolean.TYPE}, ImageRequest[].class);
        } else if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new ImageRequest[0];
        } else {
            ArrayList arrayList = new ArrayList();
            c cVar = new c();
            for (String next : imageModel.getUrls()) {
                if (!StringUtils.isEmpty(next)) {
                    ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(next));
                    if (postprocessor2 != null) {
                        newBuilderWithSource.setPostprocessor(postprocessor2);
                    }
                    if (resizeOptions2 != null) {
                        newBuilderWithSource.setResizeOptions(resizeOptions2);
                    }
                    cVar.a(newBuilderWithSource);
                    arrayList.add(newBuilderWithSource.build());
                }
            }
            if (arrayList.size() == 0) {
                return new ImageRequest[0];
            }
            return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r21, int r22, int r23, com.bytedance.android.live.core.utils.q.b r24) {
        /*
            r1 = r24
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r21
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r11 = 1
            r3[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r12 = 2
            r3[r12] = r4
            r13 = 3
            r3[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f8293a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r12] = r4
            java.lang.Class<com.bytedance.android.live.core.utils.q$b> r4 = com.bytedance.android.live.core.utils.q.b.class
            r8[r13] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 1124(0x464, float:1.575E-42)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x006c
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r10] = r21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r14[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r14[r12] = r0
            r14[r13] = r1
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f8293a
            r17 = 1
            r18 = 1124(0x464, float:1.575E-42)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class<com.bytedance.android.live.core.utils.q$b> r1 = com.bytedance.android.live.core.utils.q.b.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x006c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.net.Uri r0 = android.net.Uri.parse(r21)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r10] = r0
            r13 = 0
            r3[r11] = r13
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f8293a
            r6 = 1
            r7 = 1112(0x458, float:1.558E-42)
            java.lang.Class[] r8 = new java.lang.Class[r12]
            java.lang.Class<android.net.Uri> r9 = android.net.Uri.class
            r8[r10] = r9
            java.lang.Class<com.facebook.imagepipeline.common.ResizeOptions> r9 = com.facebook.imagepipeline.common.ResizeOptions.class
            r8[r11] = r9
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest> r9 = com.facebook.imagepipeline.request.ImageRequest.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00b6
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r10] = r0
            r14[r11] = r13
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f8293a
            r17 = 1
            r18 = 1112(0x458, float:1.558E-42)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            r0[r10] = r3
            java.lang.Class<com.facebook.imagepipeline.common.ResizeOptions> r3 = com.facebook.imagepipeline.common.ResizeOptions.class
            r0[r11] = r3
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest> r20 = com.facebook.imagepipeline.request.ImageRequest.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.facebook.imagepipeline.request.ImageRequest r0 = (com.facebook.imagepipeline.request.ImageRequest) r0
            goto L_0x00c2
        L_0x00b6:
            if (r0 != 0) goto L_0x00ba
            r0 = r13
            goto L_0x00c2
        L_0x00ba:
            com.facebook.imagepipeline.request.ImageRequestBuilder r0 = com.facebook.imagepipeline.request.ImageRequestBuilder.newBuilderWithSource(r0)
            com.facebook.imagepipeline.request.ImageRequest r0 = r0.build()
        L_0x00c2:
            if (r0 == 0) goto L_0x00c7
            r2.add(r0)
        L_0x00c7:
            int r0 = r2.size()
            com.facebook.imagepipeline.request.ImageRequest[] r0 = new com.facebook.imagepipeline.request.ImageRequest[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            com.facebook.imagepipeline.request.ImageRequest[] r0 = (com.facebook.imagepipeline.request.ImageRequest[]) r0
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r10] = r0
            r2[r11] = r1
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f8293a
            r5 = 1
            r6 = 1126(0x466, float:1.578E-42)
            java.lang.Class[] r7 = new java.lang.Class[r12]
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r8 = com.facebook.imagepipeline.request.ImageRequest[].class
            r7[r10] = r8
            java.lang.Class<com.bytedance.android.live.core.utils.q$b> r8 = com.bytedance.android.live.core.utils.q.b.class
            r7[r11] = r8
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x010d
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r10] = r0
            r3[r11] = r1
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f8293a
            r6 = 1
            r7 = 1126(0x466, float:1.578E-42)
            java.lang.Class[] r8 = new java.lang.Class[r12]
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r0 = com.facebook.imagepipeline.request.ImageRequest[].class
            r8[r10] = r0
            java.lang.Class<com.bytedance.android.live.core.utils.q$b> r0 = com.bytedance.android.live.core.utils.q.b.class
            r8[r11] = r0
            java.lang.Class r9 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x010d:
            if (r0 == 0) goto L_0x012e
            int r2 = r0.length
            if (r2 != 0) goto L_0x0113
            goto L_0x012e
        L_0x0113:
            com.facebook.imagepipeline.core.ImagePipelineFactory r2 = com.facebook.imagepipeline.core.ImagePipelineFactory.getInstance()
            com.facebook.imagepipeline.core.ImagePipeline r2 = r2.getImagePipeline()
            r0 = r0[r10]
            com.facebook.datasource.DataSource r0 = r2.fetchDecodedImage(r0, r13)
            com.bytedance.android.live.core.utils.k$1 r2 = new com.bytedance.android.live.core.utils.k$1
            r2.<init>(r0, r1)
            com.facebook.common.executors.CallerThreadExecutor r1 = com.facebook.common.executors.CallerThreadExecutor.getInstance()
            r0.subscribe(r2, r1)
            return
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.k.a(java.lang.String, int, int, com.bytedance.android.live.core.utils.q$b):void");
    }

    public static void a(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, null, f8293a, true, 1128, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, null, f8293a, true, 1128, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        f8294b.post(runnable2);
    }

    @Deprecated
    public static void a(HSImageView hSImageView, ImageModel imageModel) {
        a(hSImageView, imageModel, null, -1, -1, null, null, false);
    }

    public static void b(HSImageView hSImageView, String str) {
        HSImageView hSImageView2 = hSImageView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{hSImageView2, str2}, null, f8293a, true, 1117, new Class[]{HSImageView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView2, str2}, null, f8293a, true, 1117, new Class[]{HSImageView.class, String.class}, Void.TYPE);
        } else if (hSImageView2 != null && !TextUtils.isEmpty(str)) {
            if (!str2.startsWith("file://")) {
                str2 = "file://" + str2;
            }
            hSImageView2.setImageURI(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str2)).build().getSourceUri());
        }
    }

    @Deprecated
    public static void a(HSImageView hSImageView, String str) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            hSImageView.setImageURI(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build().getSourceUri());
        }
    }

    @Deprecated
    public static void a(HSImageView hSImageView, ImageModel imageModel, q.a aVar) {
        a(hSImageView, imageModel, null, -1, -1, null, aVar, false);
    }

    @Deprecated
    public static void a(HSImageView hSImageView, ImageModel imageModel, Postprocessor postprocessor) {
        a(hSImageView, imageModel, null, -1, -1, postprocessor, null, false);
    }

    @Deprecated
    public static void a(HSImageView hSImageView, String str, Postprocessor postprocessor) {
        if (hSImageView != null && !TextUtils.isEmpty(str) && postprocessor != null) {
            ImageRequest build = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setPostprocessor(postprocessor).build();
            hSImageView.setImageURI(build.getSourceUri());
            hSImageView.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(hSImageView.getController())).setFirstAvailableImageRequests(new ImageRequest[]{build})).build());
        }
    }

    public static void a(HSImageView hSImageView, ImageModel imageModel, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{hSImageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2)}, null, f8293a, true, 1103, new Class[]{HSImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2)}, null, f8293a, true, 1103, new Class[]{HSImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(hSImageView, imageModel, null, i, i2, null, null, false);
    }

    @Deprecated
    public static void a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i, int i2, Postprocessor postprocessor, q.a aVar, boolean z) {
        a(simpleDraweeView, imageModel, drawable, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f, i, i2, postprocessor, aVar, false, false);
    }

    @Deprecated
    private static void a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i, int i2, int i3, Postprocessor postprocessor, q.a aVar, boolean z, boolean z2) {
        if (simpleDraweeView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            ResizeOptions resizeOptions = null;
            if (i2 < 0 || i3 < 0) {
                i2 = simpleDraweeView.getMeasuredWidth();
                i3 = simpleDraweeView.getMeasuredHeight();
            }
            if (i2 > 0 && i3 > 0) {
                resizeOptions = new ResizeOptions(i2, i3);
            }
            ImageRequest[] a2 = a(imageModel, resizeOptions, postprocessor, false);
            if (a2 != null && a2.length != 0) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(simpleDraweeView.getController())).setFirstAvailableImageRequests(a2);
                if (z) {
                    pipelineDraweeControllerBuilder.setAutoPlayAnimations(true);
                }
                if (drawable != null) {
                    if (simpleDraweeView.getHierarchy() == null) {
                        simpleDraweeView.setHierarchy(new GenericDraweeHierarchyBuilder(simpleDraweeView.getContext().getResources()).setFadeDuration(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f).setPlaceholderImage(drawable).setPlaceholderImageScaleType(ScalingUtils.ScaleType.CENTER_CROP).build());
                    } else {
                        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) simpleDraweeView.getHierarchy();
                        genericDraweeHierarchy.setFadeDuration(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
                        genericDraweeHierarchy.setPlaceholderImage(drawable);
                        simpleDraweeView.setHierarchy(genericDraweeHierarchy);
                    }
                }
                pipelineDraweeControllerBuilder.setControllerListener(new a(imageModel, aVar));
                simpleDraweeView.setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }
}
