package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

public class AnimatedImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34888a;

    /* renamed from: b  reason: collision with root package name */
    public a f34889b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f34890c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f34891d;

    /* renamed from: e  reason: collision with root package name */
    protected ControllerListener<ImageInfo> f34892e = new BaseControllerListener<ImageInfo>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34894a;

        public final void onRelease(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f34894a, false, 24918, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f34894a, false, 24918, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.onRelease(str);
            AnimatedImageView.this.f34891d = false;
        }

        public final void onFailure(String str, Throwable th) {
            if (PatchProxy.isSupport(new Object[]{str, th}, this, f34894a, false, 24917, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, th}, this, f34894a, false, 24917, new Class[]{String.class, Throwable.class}, Void.TYPE);
                return;
            }
            super.onFailure(str, th);
            AnimatedImageView.this.f34891d = false;
        }

        public final /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo}, this, f34894a, false, 24919, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo}, this, f34894a, false, 24919, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                return;
            }
            super.onIntermediateImageSet(str, imageInfo);
            AnimatedImageView.this.f34891d = false;
        }

        public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f34894a, false, 24916, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f34894a, false, 24916, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            if (AnimatedImageView.this.f34889b != null) {
                AnimatedImageView.this.f34889b.a();
            }
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && com.ss.android.ugc.aweme.framework.fresco.a.b().a(url) == null && (imageInfo instanceof CloseableAnimatedImage)) {
                com.ss.android.ugc.aweme.framework.fresco.a.b().a(url, (CloseableAnimatedImage) imageInfo);
            }
            if (animatable != null) {
                AnimatedImageView.this.f34891d = true;
                if (AnimatedImageView.this.f34890c) {
                    AnimatedImageView.this.b();
                }
            } else {
                AnimatedImageView.this.f34891d = false;
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<com.ss.android.ugc.aweme.base.ui.a.a> f34893f;
    private CloseableReference<Bitmap> g;
    private UrlModel h;
    private boolean i;

    public interface a {
        void a();
    }

    public void a() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34888a, false, 24914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34888a, false, 24914, new Class[0], Void.TYPE);
            return;
        }
        if (getController() != null && this.f34890c && this.f34891d && this.i) {
            Animatable animatable = getController().getAnimatable();
            if (animatable != null && !animatable.isRunning()) {
                animatable.start();
                if (!(this.f34893f == null || this.f34893f.get() == null)) {
                    ((com.ss.android.ugc.aweme.base.ui.a.a) this.f34893f.get()).a();
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34888a, false, 24915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34888a, false, 24915, new Class[0], Void.TYPE);
        } else if (getController() != null) {
            Animatable animatable = getController().getAnimatable();
            if (animatable != null && animatable.isRunning()) {
                animatable.stop();
                if (!(this.f34893f == null || this.f34893f.get() == null)) {
                    ((com.ss.android.ugc.aweme.base.ui.a.a) this.f34893f.get()).b();
                }
            }
        }
    }

    public String getUrl() {
        if (PatchProxy.isSupport(new Object[0], this, f34888a, false, 24913, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f34888a, false, 24913, new Class[0], String.class);
        } else if (this.h == null || this.h.getUrlList() == null || this.h.getUrlList().size() == 0) {
            return "";
        } else {
            return this.h.getUrlList().get(0);
        }
    }

    public void setAttached(boolean z) {
        this.f34890c = z;
    }

    public void setImageLoadFinishListener(a aVar) {
        this.f34889b = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.i = z;
    }

    public AnimatedImageView(Context context) {
        super(context);
        a();
    }

    public void setAnimationListener(com.ss.android.ugc.aweme.base.ui.a.a aVar) {
        com.ss.android.ugc.aweme.base.ui.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f34888a, false, 24911, new Class[]{com.ss.android.ugc.aweme.base.ui.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f34888a, false, 24911, new Class[]{com.ss.android.ugc.aweme.base.ui.a.a.class}, Void.TYPE);
            return;
        }
        this.f34893f = new WeakReference<>(aVar2);
    }

    public final void a(UrlModel urlModel) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f34888a, false, 24912, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, f34888a, false, 24912, new Class[]{UrlModel.class}, Void.TYPE);
        } else if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            this.h = urlModel;
            ((GenericDraweeHierarchy) getHierarchy()).setBackgroundImage(null);
            this.g = com.ss.android.ugc.aweme.framework.fresco.a.b().a(getUrl());
            if (this.g != null && this.g.isValid()) {
                Bitmap bitmap = (Bitmap) this.g.get();
                if (!bitmap.isRecycled()) {
                    ((GenericDraweeHierarchy) getHierarchy()).setBackgroundImage(new ScaleTypeDrawable(new BitmapDrawable(bitmap), ScalingUtils.ScaleType.CENTER_CROP));
                } else {
                    ((GenericDraweeHierarchy) getHierarchy()).setBackgroundImage(null);
                }
            }
            if (getContext() != null) {
                context = getContext().getApplicationContext();
            } else {
                context = null;
            }
            ImageRequest[] a2 = c.a(urlModel, (ResizeOptions) null, (Postprocessor) null);
            if (a2 != null && a2.length != 0) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(getController())).setFirstAvailableImageRequests(a2);
                pipelineDraweeControllerBuilder.setControllerListener(c.a(this.f34892e, a2[0].getSourceUri(), context, urlModel));
                setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public AnimatedImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        a();
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a();
    }
}
