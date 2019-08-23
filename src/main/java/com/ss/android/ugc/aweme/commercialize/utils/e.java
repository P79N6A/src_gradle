package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import javax.annotation.Nullable;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39778a;

    public static class a extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39779a;

        /* renamed from: b  reason: collision with root package name */
        private final View f39780b;

        public a(View view) {
            this.f39780b = view;
        }

        public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f39779a, false, 32326, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f39779a, false, 32326, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            if (imageInfo != null) {
                int width = imageInfo.getWidth();
                int height = imageInfo.getHeight();
                if (height > 0) {
                    ViewGroup.LayoutParams layoutParams = this.f39780b.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f39780b.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2}, null, f39778a, true, 32318, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2}, null, f39778a, true, 32318, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, false);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, ControllerListener<ImageInfo> controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, controllerListener}, null, f39778a, true, 32322, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, controllerListener}, null, f39778a, true, 32322, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE);
            return;
        }
        b(remoteImageView2, urlModel2, new v(controllerListener, new a(remoteImageView2)));
    }

    public static void b(RemoteImageView remoteImageView, UrlModel urlModel, ControllerListener<ImageInfo> controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, controllerListener}, null, f39778a, true, 32325, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, controllerListener}, null, f39778a, true, 32325, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE);
        } else if (remoteImageView2 != null && urlModel2 != null && remoteImageView.getContext() != null) {
            ImageRequest[] a2 = c.a(urlModel2, (ResizeOptions) null, (Postprocessor) null);
            if (a2 != null && a2.length > 0) {
                ControllerListener<ImageInfo> a3 = c.a((ControllerListener<ImageInfo>) null, a2[0].getSourceUri(), remoteImageView.getContext(), urlModel2);
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setFirstAvailableImageRequests(a2);
                pipelineDraweeControllerBuilder.setControllerListener(new v(a3, controllerListener));
                remoteImageView2.setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }

    private static void a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, (byte) 0}, null, f39778a, true, 32319, new Class[]{RemoteImageView.class, UrlModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, (byte) 0}, null, f39778a, true, 32319, new Class[]{RemoteImageView.class, UrlModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, false, new a(false, remoteImageView2));
    }

    public static void a(RemoteImageView remoteImageView, String str, ControllerListener<ImageInfo> controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        ControllerListener<ImageInfo> controllerListener2 = controllerListener;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, str, controllerListener2}, null, f39778a, true, 32323, new Class[]{RemoteImageView.class, String.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, str, controllerListener2}, null, f39778a, true, 32323, new Class[]{RemoteImageView.class, String.class, ControllerListener.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, str, -1, -1, controllerListener2}, null, f39778a, true, 32324, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, str, -1, -1, controllerListener2}, null, f39778a, true, 32324, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE, ControllerListener.class}, Void.TYPE);
        } else if (remoteImageView2 != null && !TextUtils.isEmpty(str)) {
            remoteImageView2.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build())).setControllerListener(controllerListener2)).build());
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z, ControllerListener controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        ControllerListener controllerListener2 = controllerListener;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, Byte.valueOf(z ? (byte) 1 : 0), controllerListener2}, null, f39778a, true, 32320, new Class[]{RemoteImageView.class, UrlModel.class, Boolean.TYPE, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, Byte.valueOf(z), controllerListener2}, null, f39778a, true, 32320, new Class[]{RemoteImageView.class, UrlModel.class, Boolean.TYPE, ControllerListener.class}, Void.TYPE);
        } else if (remoteImageView2 != null) {
            Context context = remoteImageView.getContext();
            if (context != null && urlModel2 != null && !CollectionUtils.isEmpty(urlModel.getUrlList())) {
                ImageRequest[] a2 = c.a(urlModel2, (ResizeOptions) null, (Postprocessor) null, Bitmap.Config.ARGB_8888);
                if (a2 != null && a2.length != 0) {
                    PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setAutoPlayAnimations(false)).setFirstAvailableImageRequests(a2);
                    pipelineDraweeControllerBuilder.setControllerListener(c.a(controllerListener2, a2[0].getSourceUri(), context, urlModel2));
                    remoteImageView2.setController(pipelineDraweeControllerBuilder.build());
                }
            }
        }
    }
}
