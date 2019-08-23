package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.annotation.Nullable;

public final class am implements ControllerListener<ImageInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46497a;

    /* renamed from: b  reason: collision with root package name */
    private View f46498b;

    /* renamed from: c  reason: collision with root package name */
    private Context f46499c;

    public final void onFailure(String str, Throwable th) {
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
    }

    public final void onRelease(String str) {
    }

    public final void onSubmit(String str, Object obj) {
    }

    public am(View view, Context context) {
        this.f46498b = view;
        this.f46499c = context;
    }

    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        ImageInfo imageInfo = (ImageInfo) obj;
        if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f46497a, false, 42855, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f46497a, false, 42855, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            return;
        }
        if (imageInfo != null) {
            ViewGroup.LayoutParams layoutParams = this.f46498b.getLayoutParams();
            int width = (int) (((float) imageInfo.getWidth()) * (((float) layoutParams.height) / ((float) imageInfo.getHeight())));
            if (width != layoutParams.width) {
                layoutParams.width = width;
                this.f46498b.setLayoutParams(layoutParams);
            }
        }
    }
}
