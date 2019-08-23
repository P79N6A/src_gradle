package com.ss.android.ugc.aweme.shortvideo.util;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import javax.annotation.Nullable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71064a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a$a  reason: collision with other inner class name */
    public static class C0739a extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71065a;

        /* renamed from: b  reason: collision with root package name */
        private final View f71066b;

        public C0739a(View view) {
            this.f71066b = view;
        }

        public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f71065a, false, 80837, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f71065a, false, 80837, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            if (imageInfo != null) {
                int width = imageInfo.getWidth();
                int height = imageInfo.getHeight();
                if (height > 0) {
                    ViewGroup.LayoutParams layoutParams = this.f71066b.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f71066b.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2}, null, f71064a, true, 80834, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2}, null, f71064a, true, 80834, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, null);
    }

    private static void a(RemoteImageView remoteImageView, UrlModel urlModel, ControllerListener<ImageInfo> controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, null}, null, f71064a, true, 80835, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, null}, null, f71064a, true, 80835, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE);
            return;
        }
        b(remoteImageView2, urlModel2, new k(null, new C0739a(remoteImageView2)));
    }

    private static void b(RemoteImageView remoteImageView, UrlModel urlModel, ControllerListener<ImageInfo> controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, controllerListener}, null, f71064a, true, 80836, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, controllerListener}, null, f71064a, true, 80836, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE);
        } else if (remoteImageView2 != null && urlModel2 != null && remoteImageView.getContext() != null) {
            ImageRequest[] a2 = c.a(urlModel2, (ResizeOptions) null, (Postprocessor) null);
            if (a2 != null && a2.length > 0) {
                ControllerListener<ImageInfo> a3 = c.a((ControllerListener<ImageInfo>) null, a2[0].getSourceUri(), remoteImageView.getContext(), urlModel2);
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setFirstAvailableImageRequests(a2);
                pipelineDraweeControllerBuilder.setControllerListener(new k(a3, controllerListener));
                remoteImageView2.setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }
}
