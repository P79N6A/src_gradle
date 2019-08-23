package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class WrapContentRemoteImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76428a;

    /* renamed from: b  reason: collision with root package name */
    private final ControllerListener f76429b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76428a, false, 89682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76428a, false, 89682, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76432a;

                public final void getOutline(View view, Outline outline) {
                    if (PatchProxy.isSupport(new Object[]{view, outline}, this, f76432a, false, 89688, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, outline}, this, f76432a, false, 89688, new Class[]{View.class, Outline.class}, Void.TYPE);
                        return;
                    }
                    float aspectRatio = WrapContentRemoteImageView.this.getAspectRatio();
                    float height = (float) WrapContentRemoteImageView.this.getHeight();
                    float width = (float) WrapContentRemoteImageView.this.getWidth();
                    if (height != 0.0f) {
                        float f2 = height * aspectRatio;
                        float f3 = (width - f2) / 2.0f;
                        outline.setRoundRect((int) f3, 0, (int) (f3 + f2), WrapContentRemoteImageView.this.getBottom(), UIUtils.dip2Px(WrapContentRemoteImageView.this.getContext(), 4.3f));
                    }
                }
            });
            setClipToOutline(true);
        }
    }

    public WrapContentRemoteImageView(Context context) {
        this(context, null);
    }

    public final void a(@Nullable ImageInfo imageInfo) {
        if (PatchProxy.isSupport(new Object[]{imageInfo}, this, f76428a, false, 89685, new Class[]{ImageInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageInfo}, this, f76428a, false, 89685, new Class[]{ImageInfo.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            getLayoutParams().width = (getLayoutParams().height * imageInfo.getWidth()) / imageInfo.getHeight();
            requestLayout();
        } else if (imageInfo != null) {
            setAspectRatio(((float) imageInfo.getWidth()) / ((float) imageInfo.getHeight()));
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setImageURI(Uri uri, Object obj) {
        if (PatchProxy.isSupport(new Object[]{uri, obj}, this, f76428a, false, 89683, new Class[]{Uri.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri, obj}, this, f76428a, false, 89683, new Class[]{Uri.class, Object.class}, Void.TYPE);
            return;
        }
        setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) getControllerBuilder()).setControllerListener(this.f76429b)).setCallerContext(obj)).setUri(uri).setOldController(getController())).build());
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76429b = new BaseControllerListener<ImageInfo>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76430a;

            public final /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo}, this, f76430a, false, 89686, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo}, this, f76430a, false, 89686, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                    return;
                }
                WrapContentRemoteImageView.this.a(imageInfo);
            }

            public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f76430a, false, 89687, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f76430a, false, 89687, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                    return;
                }
                WrapContentRemoteImageView.this.a(imageInfo);
            }
        };
    }

    public final void a(String str, Object obj, ControllerListener<ImageInfo> controllerListener) {
        Uri uri;
        ControllerListener<ImageInfo> controllerListener2 = controllerListener;
        if (PatchProxy.isSupport(new Object[]{str, null, controllerListener2}, this, f76428a, false, 89684, new Class[]{String.class, Object.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, null, controllerListener2}, this, f76428a, false, 89684, new Class[]{String.class, Object.class, ControllerListener.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) getControllerBuilder()).setControllerListener(controllerListener2)).setCallerContext((Object) null)).setUri(uri).setOldController(getController())).build());
    }
}
