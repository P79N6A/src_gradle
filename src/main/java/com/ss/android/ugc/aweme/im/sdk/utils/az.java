package com.ss.android.ugc.aweme.im.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.im.sdk.R$drawable;
import java.util.List;
import javax.annotation.Nullable;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52525a;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52526a;

        /* renamed from: b  reason: collision with root package name */
        public RemoteImageView f52527b;

        /* renamed from: c  reason: collision with root package name */
        public t f52528c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f52529d = true;

        /* renamed from: e  reason: collision with root package name */
        ControllerListener<ImageInfo> f52530e = new BaseControllerListener<ImageInfo>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52532a;

            /* renamed from: b  reason: collision with root package name */
            boolean f52533b;

            public final void onRelease(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f52532a, false, 53750, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f52532a, false, 53750, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                super.onRelease(str);
                this.f52533b = false;
            }

            public final void onFailure(String str, Throwable th) {
                if (PatchProxy.isSupport(new Object[]{str, th}, this, f52532a, false, 53749, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f52532a, false, 53749, new Class[]{String.class, Throwable.class}, Void.TYPE);
                    return;
                }
                super.onFailure(str, th);
                if (a.this.f52528c != null) {
                    a.this.f52528c.b();
                }
                a.this.a();
                this.f52533b = false;
            }

            public final /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo}, this, f52532a, false, 53751, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo}, this, f52532a, false, 53751, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                    return;
                }
                super.onIntermediateImageSet(str, imageInfo);
                this.f52533b = false;
            }

            public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f52532a, false, 53748, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f52532a, false, 53748, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                    return;
                }
                if (animatable != null) {
                    this.f52533b = true;
                    if (PatchProxy.isSupport(new Object[0], this, f52532a, false, 53747, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f52532a, false, 53747, new Class[0], Void.TYPE);
                    } else if (a.this.f52527b.getController() != null && this.f52533b) {
                        Animatable animatable2 = a.this.f52527b.getController().getAnimatable();
                        if (animatable2 != null && !animatable2.isRunning() && a.this.f52529d) {
                            animatable2.start();
                        }
                    }
                    if (a.this.f52528c != null) {
                        a.this.f52528c.a();
                    }
                } else {
                    this.f52533b = false;
                }
            }
        };

        /* renamed from: f  reason: collision with root package name */
        private int f52531f;
        private UrlModel g;
        private ImageRequest[] h;
        private DraweeController i;
        private int j;
        private int k;
        private PipelineDraweeControllerBuilder l;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f52526a, false, 53745, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52526a, false, 53745, new Class[0], Void.TYPE);
                return;
            }
            List<String> urlList = this.g.getUrlList();
            int i2 = this.f52531f;
            this.f52531f = i2 + 1;
            String a2 = az.a(urlList, i2);
            if (TextUtils.isEmpty(a2)) {
                int a3 = b.a(this.f52527b.getContext(), 90.0f);
                ViewGroup.LayoutParams layoutParams = this.f52527b.getLayoutParams();
                layoutParams.width = a3;
                layoutParams.height = a3;
                this.f52527b.setLayoutParams(layoutParams);
                if (this.f52528c == null) {
                    c.a(this.f52527b, com.ss.android.ugc.aweme.base.model.a.a(R$drawable.im_emoji_download_fail));
                }
                return;
            }
            ImageRequest[] a4 = a(a2);
            if (this.l == null) {
                this.l = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(this.f52527b.getController())).setFirstAvailableImageRequests(a4)).setControllerListener(this.f52530e);
            }
            this.l.setFirstAvailableImageRequests(a4);
            if (this.i == null) {
                this.i = this.l.build();
            }
            this.f52527b.setController(this.i);
        }

        /* access modifiers changed from: package-private */
        public final a a(boolean z) {
            this.f52529d = z;
            return this;
        }

        @NonNull
        private ImageRequest[] a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f52526a, false, 53746, new Class[]{String.class}, ImageRequest[].class)) {
                return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{str}, this, f52526a, false, 53746, new Class[]{String.class}, ImageRequest[].class);
            }
            if (this.h == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                imageDecodeOptionsBuilder.setPreDecodeFrameCount(1);
                imageDecodeOptionsBuilder.setDecodeAllFrames(false);
                ImageRequestBuilder imageDecodeOptions = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setImageDecodeOptions(new ImageDecodeOptions(imageDecodeOptionsBuilder));
                if (this.k > 0 && this.j > 0) {
                    imageDecodeOptions.setResizeOptions(new ResizeOptions(this.j, this.k));
                }
                this.h = new ImageRequest[]{imageDecodeOptions.build()};
            }
            return this.h;
        }

        public a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3, t tVar) {
            this.f52527b = remoteImageView;
            this.g = urlModel;
            this.j = i2;
            this.k = i3;
            this.f52528c = tVar;
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        if (PatchProxy.isSupport(new Object[]{remoteImageView, urlModel, (byte) 0}, null, f52525a, true, 53738, new Class[]{RemoteImageView.class, UrlModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, urlModel, (byte) 0}, null, f52525a, true, 53738, new Class[]{RemoteImageView.class, UrlModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(remoteImageView, urlModel, 0, 0, null, false);
    }

    public static String a(List<String> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, null, f52525a, true, 53742, new Class[]{List.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, null, f52525a, true, 53742, new Class[]{List.class, Integer.TYPE}, String.class);
        } else if (!CollectionUtils.isEmpty(list) && i < list.size()) {
            return list.get(i);
        } else {
            return null;
        }
    }

    public static void b(RemoteImageView remoteImageView, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{remoteImageView, urlModel}, null, f52525a, true, 53737, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, urlModel}, null, f52525a, true, 53737, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE);
            return;
        }
        a(remoteImageView, urlModel, 0, 0, null, true);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel}, null, f52525a, true, 53734, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel}, null, f52525a, true, 53734, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE);
        } else if (remoteImageView2 != null && urlModel != null) {
            if (!CollectionUtils.isEmpty(urlModel.getUrlList())) {
                c.b(remoteImageView, urlModel);
                return;
            }
            if (!TextUtils.isEmpty(urlModel.getUri())) {
                c.a(remoteImageView2, urlModel.getUri());
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, t tVar) {
        if (PatchProxy.isSupport(new Object[]{remoteImageView, urlModel, tVar}, null, f52525a, true, 53741, new Class[]{RemoteImageView.class, UrlModel.class, t.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, urlModel, tVar}, null, f52525a, true, 53741, new Class[]{RemoteImageView.class, UrlModel.class, t.class}, Void.TYPE);
            return;
        }
        a(remoteImageView, urlModel, 0, 0, tVar, true);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{remoteImageView, urlModel, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52525a, true, 53739, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, urlModel, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52525a, true, 53739, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            a aVar = new a(remoteImageView, urlModel, i, i2, null);
            aVar.a();
        }
    }

    private static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, t tVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{remoteImageView, urlModel, 0, 0, tVar, Byte.valueOf(z ? (byte) 1 : 0)}, null, f52525a, true, 53740, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE, t.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {remoteImageView, urlModel, 0, 0, tVar, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52525a, true, 53740, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE, t.class, Boolean.TYPE}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            a aVar = new a(remoteImageView, urlModel, 0, 0, tVar);
            aVar.a(z).a();
        }
    }
}
