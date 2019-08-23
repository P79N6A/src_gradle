package com.ss.android.ugc.aweme.miniapp.a;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.excitingvideo.IImageLoadListener;
import com.ss.android.excitingvideo.ImageLoadCallback;
import javax.annotation.Nullable;

public final class f implements IImageLoadListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55432a;

    /* renamed from: b  reason: collision with root package name */
    private SimpleDraweeView f55433b;

    public final View createImageView(@NonNull Context context, float f2) {
        if (PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, this, f55432a, false, 59139, new Class[]{Context.class, Float.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, this, f55432a, false, 59139, new Class[]{Context.class, Float.TYPE}, View.class);
        }
        if (this.f55433b == null) {
            this.f55433b = new SimpleDraweeView(context);
        }
        if (f2 > 0.0f) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.setCornersRadius(f2);
            GenericDraweeHierarchy build = new GenericDraweeHierarchyBuilder(context.getResources()).build();
            build.setRoundingParams(roundingParams);
            this.f55433b.setHierarchy(build);
        }
        return this.f55433b;
    }

    public final void setRadius(Context context, float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f55432a, false, 59140, new Class[]{Context.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f55432a, false, 59140, new Class[]{Context.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55433b != null) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.setCornersRadii(f2, f3, f4, f5);
            ((GenericDraweeHierarchy) this.f55433b.getHierarchy()).setRoundingParams(roundingParams);
        }
    }

    public final void setUrl(@NonNull Context context, @NonNull String str, int i, int i2, @NonNull ImageLoadCallback imageLoadCallback) {
        final ImageLoadCallback imageLoadCallback2 = imageLoadCallback;
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i), Integer.valueOf(i2), imageLoadCallback2}, this, f55432a, false, 59138, new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, ImageLoadCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, Integer.valueOf(i), Integer.valueOf(i2), imageLoadCallback2}, this, f55432a, false, 59138, new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, ImageLoadCallback.class}, Void.TYPE);
            return;
        }
        this.f55433b.setAspectRatio((float) (i / i2));
        this.f55433b.setController(((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setControllerListener(new BaseControllerListener<ImageInfo>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55434a;

            public final void onFailure(String str, Throwable th) {
                if (PatchProxy.isSupport(new Object[]{str, th}, this, f55434a, false, 59141, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f55434a, false, 59141, new Class[]{String.class, Throwable.class}, Void.TYPE);
                    return;
                }
                super.onFailure(str, th);
                imageLoadCallback2.onFail();
            }

            public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                String str2 = str;
                Animatable animatable2 = animatable;
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str2, imageInfo, animatable2}, this, f55434a, false, 59142, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2, imageInfo, animatable2}, this, f55434a, false, 59142, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                    return;
                }
                super.onFinalImageSet(str2, imageInfo, animatable2);
            }
        })).setUri(Uri.parse(str)).build());
        imageLoadCallback.onSuccess();
    }
}
