package com.ss.android.ugc.aweme.commercialize.utils;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.fresco.animation.drawable.animator.AnimatedDrawable2ValueAnimatorHelper;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import javax.annotation.Nullable;

public class a implements ControllerListener<ImageInfo> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f39624c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f39625a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f39626b;

    public void onFailure(String str, Throwable th) {
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
    }

    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }

    public a(boolean z, RemoteImageView remoteImageView) {
        this.f39625a = z;
        this.f39626b = remoteImageView;
    }

    /* renamed from: a */
    public void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
        if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f39624c, false, 32209, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f39624c, false, 32209, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
        } else if (animatable != null) {
            ValueAnimator createValueAnimator = AnimatedDrawable2ValueAnimatorHelper.createValueAnimator((AnimatedDrawable2) animatable);
            createValueAnimator.setRepeatCount(-1);
            createValueAnimator.start();
            if (this.f39625a && imageInfo != null) {
                this.f39626b.getLayoutParams().width = UIUtils.getScreenWidth(this.f39626b.getContext());
                this.f39626b.getLayoutParams().height = -2;
                this.f39626b.setAspectRatio(((float) imageInfo.getWidth()) / ((float) imageInfo.getHeight()));
            }
        }
    }
}
