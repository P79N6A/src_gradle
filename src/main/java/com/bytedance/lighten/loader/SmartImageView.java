package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.lighten.core.b;
import com.bytedance.lighten.core.b.a;
import com.bytedance.lighten.core.b.d;
import com.bytedance.lighten.core.k;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class SmartImageView extends SimpleDraweeView implements d {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a> f21798a;

    /* renamed from: b  reason: collision with root package name */
    public a f21799b;

    public void a() {
        if (getController() != null) {
            Animatable animatable = getController().getAnimatable();
            if (animatable != null && !animatable.isRunning()) {
                animatable.start();
                if (!(this.f21798a == null || this.f21798a.get() == null)) {
                    ((a) this.f21798a.get()).a();
                }
            }
        }
    }

    public SmartImageView(Context context) {
        super(context);
    }

    public void setAnimationListener(a aVar) {
        this.f21798a = new WeakReference<>(aVar);
    }

    private static ResizeOptions d(com.bytedance.lighten.core.d dVar) {
        return new ResizeOptions(dVar.h, dVar.i);
    }

    private void a(Drawable drawable) {
        if (drawable == null) {
            ((GenericDraweeHierarchy) getHierarchy()).setBackgroundImage(null);
        } else {
            ((GenericDraweeHierarchy) getHierarchy()).setBackgroundImage(new ScaleTypeDrawable(drawable, ScalingUtils.ScaleType.CENTER_CROP));
        }
    }

    private static ImageDecodeOptionsBuilder c(com.bytedance.lighten.core.d dVar) {
        ImageDecodeOptionsBuilder newBuilder = ImageDecodeOptions.newBuilder();
        newBuilder.setBitmapConfig(dVar.m);
        newBuilder.setDecodeAllFrames(dVar.f21779e);
        newBuilder.setPreDecodeFrameCount(dVar.f21780f);
        return newBuilder;
    }

    private static Priority e(com.bytedance.lighten.core.d dVar) {
        k kVar = dVar.s;
        if (kVar == k.LOW) {
            return Priority.LOW;
        }
        if (kVar == k.HIGH) {
            return Priority.HIGH;
        }
        return Priority.MEDIUM;
    }

    private void setHierarchy(com.bytedance.lighten.core.d dVar) {
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(getContext().getResources());
        genericDraweeHierarchyBuilder.setActualImageScaleType(g.a(dVar.n));
        setHierarchy(genericDraweeHierarchyBuilder.build());
    }

    private void b(com.bytedance.lighten.core.d dVar) {
        RoundingParams roundingParams;
        if (dVar.p != null) {
            b bVar = dVar.p;
            if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
                roundingParams = ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams();
            } else {
                roundingParams = new RoundingParams();
            }
            if (bVar.g != null) {
                b.a aVar = bVar.g;
                roundingParams.setCornersRadii(aVar.f21767a, aVar.f21768b, aVar.f21769c, aVar.f21770d);
            }
            roundingParams.setRoundAsCircle(bVar.f21764d);
            roundingParams.setCornersRadius(bVar.f21765e);
            roundingParams.setBorderWidth(bVar.f21761a);
            roundingParams.setBorderColor(bVar.f21762b);
            roundingParams.setOverlayColor(bVar.f21763c);
            roundingParams.setPadding(bVar.f21766f);
            roundingParams.setRoundingMethod(h.a(bVar.h));
            if (bVar.h != null) {
                if (bVar.h == b.C0222b.OVERLAY_COLOR) {
                    roundingParams.setRoundingMethod(RoundingParams.RoundingMethod.OVERLAY_COLOR);
                } else {
                    roundingParams.setRoundingMethod(RoundingParams.RoundingMethod.BITMAP_ONLY);
                }
            }
            ((GenericDraweeHierarchy) getHierarchy()).setRoundingParams(roundingParams);
        }
    }

    public final void a(com.bytedance.lighten.core.d dVar) {
        if (dVar.o == null || dVar.o.size() == 0) {
            PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(getController())).setAutoPlayAnimations(dVar.f21777c)).setImageRequest(a(dVar, dVar.f21775a));
            if (dVar.t != null && this.f21799b == null) {
                this.f21799b = new a(this, dVar.t, dVar.f21775a);
                pipelineDraweeControllerBuilder.setControllerListener(this.f21799b);
            }
            setController(pipelineDraweeControllerBuilder.build());
            return;
        }
        List<String> list = dVar.o;
        ArrayList arrayList = new ArrayList();
        for (String a2 : list) {
            arrayList.add(a(dVar, com.bytedance.lighten.core.c.a.a(a2)));
        }
        ImageRequest[] imageRequestArr = new ImageRequest[arrayList.size()];
        arrayList.toArray(imageRequestArr);
        if (imageRequestArr.length != 0) {
            PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder2 = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(getController())).setAutoPlayAnimations(dVar.f21777c)).setFirstAvailableImageRequests(imageRequestArr);
            if (dVar.t != null && this.f21799b == null) {
                this.f21799b = new a(this, dVar.t, dVar.f21775a);
                pipelineDraweeControllerBuilder2.setControllerListener(this.f21799b);
            }
            setController(pipelineDraweeControllerBuilder2.build());
        }
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void a(ImageRequestBuilder imageRequestBuilder, com.bytedance.lighten.core.d dVar) {
        if (dVar.r != null) {
            imageRequestBuilder.setPostprocessor(new b(dVar.r));
        }
    }

    public SmartImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        setHierarchy(genericDraweeHierarchy);
    }

    private ImageRequest a(com.bytedance.lighten.core.d dVar, Uri uri) {
        ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(uri);
        newBuilderWithSource.setAutoRotateEnabled(dVar.f21778d);
        a(newBuilderWithSource, dVar);
        b(dVar);
        ImageDecodeOptions imageDecodeOptions = new ImageDecodeOptions(c(dVar));
        newBuilderWithSource.setImageDecodeOptions(imageDecodeOptions).setRequestPriority(e(dVar)).setAutoRotateEnabled(dVar.f21778d);
        if (dVar.h > 0 || dVar.i > 0) {
            newBuilderWithSource.setResizeOptions(d(dVar));
        }
        a(dVar.l);
        return newBuilderWithSource.build();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
