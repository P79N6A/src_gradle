package com.ss.android.ugc.aweme.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.image.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Interceptor;
import okhttp3.Response;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34655a;

    public interface a {
        void a(DataSource<CloseableReference<CloseableImage>> dataSource);

        void a(Exception exc);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2}, null, f34655a, true, 23950, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2}, null, f34655a, true, 23950, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, (ControllerListener<ImageInfo>) null, true);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, ControllerListener<ImageInfo> controllerListener, boolean z) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        ControllerListener<ImageInfo> controllerListener2 = controllerListener;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, controllerListener2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f34655a, true, 23951, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, controllerListener2, Byte.valueOf(z)}, null, f34655a, true, 23951, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class, Boolean.TYPE}, Void.TYPE);
        } else if (remoteImageView2 != null && urlModel2 != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            ImageRequest[] a2 = a(urlModel2, (ResizeOptions) null, (Postprocessor) null);
            if (a2 != null && a2.length != 0) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setFirstAvailableImageRequests(a2)).setAutoPlayAnimations(z);
                pipelineDraweeControllerBuilder.setControllerListener(a(controllerListener2, a2[0].getSourceUri(), applicationContext, urlModel2));
                remoteImageView2.setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, ControllerListener<ImageInfo> controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        ControllerListener<ImageInfo> controllerListener2 = controllerListener;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, controllerListener2}, null, f34655a, true, 23954, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, controllerListener2}, null, f34655a, true, 23954, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, Priority.MEDIUM, controllerListener2);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, Priority priority, ControllerListener<ImageInfo> controllerListener) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        Priority priority2 = priority;
        ControllerListener<ImageInfo> controllerListener2 = controllerListener;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, priority2, controllerListener2}, null, f34655a, true, 23955, new Class[]{RemoteImageView.class, UrlModel.class, Priority.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, priority2, controllerListener2}, null, f34655a, true, 23955, new Class[]{RemoteImageView.class, UrlModel.class, Priority.class, ControllerListener.class}, Void.TYPE);
        } else if (remoteImageView2 != null && urlModel2 != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            ImageRequest[] a2 = a(urlModel2, (ResizeOptions) null, priority2, (Postprocessor) null);
            if (a2 != null && a2.length != 0) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setFirstAvailableImageRequests(a2);
                pipelineDraweeControllerBuilder.setControllerListener(a(controllerListener2, a2[0].getSourceUri(), applicationContext, urlModel2));
                remoteImageView2.setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, int i) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, Integer.valueOf(i)}, null, f34655a, true, 23956, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, Integer.valueOf(i)}, null, f34655a, true, 23956, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE);
        } else if (remoteImageView2 != null) {
            remoteImageView2.setImageURI(ImageRequestBuilder.newBuilderWithResourceId(i).build().getSourceUri());
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, Postprocessor postprocessor) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        Postprocessor postprocessor2 = postprocessor;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, postprocessor2}, null, f34655a, true, 23957, new Class[]{RemoteImageView.class, UrlModel.class, Postprocessor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, postprocessor2}, null, f34655a, true, 23957, new Class[]{RemoteImageView.class, UrlModel.class, Postprocessor.class}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, -1, -1, postprocessor2);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, Postprocessor postprocessor) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        int i3 = i;
        int i4 = i2;
        Postprocessor postprocessor2 = postprocessor;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, Integer.valueOf(i), Integer.valueOf(i2), postprocessor2}, null, f34655a, true, 23958, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE, Postprocessor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, Integer.valueOf(i), Integer.valueOf(i2), postprocessor2}, null, f34655a, true, 23958, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE, Postprocessor.class}, Void.TYPE);
        } else if (remoteImageView2 != null && urlModel2 != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            ImageRequest[] a2 = a(urlModel2, (i3 <= 0 || i4 <= 0) ? null : new ResizeOptions(i3, i4), postprocessor2);
            if (a2 != null && a2.length != 0) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setFirstAvailableImageRequests(a2);
                pipelineDraweeControllerBuilder.setControllerListener(a((ControllerListener<ImageInfo>) null, a2[0].getSourceUri(), applicationContext, urlModel2));
                remoteImageView2.setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, com.ss.android.ugc.aweme.base.model.a aVar) {
        RemoteImageView remoteImageView2 = remoteImageView;
        com.ss.android.ugc.aweme.base.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, aVar2}, null, f34655a, true, 23959, new Class[]{RemoteImageView.class, com.ss.android.ugc.aweme.base.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, aVar2}, null, f34655a, true, 23959, new Class[]{RemoteImageView.class, com.ss.android.ugc.aweme.base.model.a.class}, Void.TYPE);
            return;
        }
        switch (aVar2.f34765b) {
            case RES_ID:
                a(remoteImageView2, PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.base.model.a.f34764a, false, 24659, new Class[0], Integer.TYPE) ? ((Integer) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.base.model.a.f34764a, false, 24659, new Class[0], Integer.TYPE)).intValue() : aVar2.f34766c == null ? 0 : ((Integer) aVar2.f34766c).intValue());
                return;
            case URL_MODEL:
                b(remoteImageView2, (UrlModel) aVar2.f34766c);
                return;
            case URL:
                a(remoteImageView2, (String) aVar2.f34766c);
                break;
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f34655a, true, 23961, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f34655a, true, 23961, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, i, i2, (Postprocessor) null);
    }

    public static void a(RemoteImageView remoteImageView, String str) {
        RemoteImageView remoteImageView2 = remoteImageView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, str2}, null, f34655a, true, 23962, new Class[]{RemoteImageView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, str2}, null, f34655a, true, 23962, new Class[]{RemoteImageView.class, String.class}, Void.TYPE);
            return;
        }
        a(remoteImageView2, str2, -1, -1);
    }

    public static void a(RemoteImageView remoteImageView, String str, int i, int i2) {
        RemoteImageView remoteImageView2 = remoteImageView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f34655a, true, 23963, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f34655a, true, 23963, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(remoteImageView2, str2, i, i2, Bitmap.Config.ARGB_8888);
    }

    public static void a(RemoteImageView remoteImageView, String str, int i, int i2, Bitmap.Config config) {
        RemoteImageView remoteImageView2 = remoteImageView;
        int i3 = i;
        int i4 = i2;
        Bitmap.Config config2 = config;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, str, Integer.valueOf(i), Integer.valueOf(i2), config2}, null, f34655a, true, 23964, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE, Bitmap.Config.class}, Void.TYPE)) {
            Object[] objArr = {remoteImageView2, str, Integer.valueOf(i), Integer.valueOf(i2), config2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f34655a, true, 23964, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE, Bitmap.Config.class}, Void.TYPE);
        } else if (remoteImageView2 != null) {
            if (TextUtils.isEmpty(str)) {
                a(remoteImageView2, 2130839027);
                return;
            }
            ResizeOptions resizeOptions = null;
            if (i3 > 0 && i4 > 0) {
                resizeOptions = new ResizeOptions(i3, i4);
            }
            ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str));
            if (resizeOptions != null) {
                newBuilderWithSource.setResizeOptions(resizeOptions);
            }
            if (config2 != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config2);
                newBuilderWithSource.setImageDecodeOptions(new ImageDecodeOptions(imageDecodeOptionsBuilder));
            }
            remoteImageView2.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setImageRequest(newBuilderWithSource.build())).build());
        }
    }

    public static ImageRequest[] a(UrlModel urlModel, ResizeOptions resizeOptions, Postprocessor postprocessor) {
        UrlModel urlModel2 = urlModel;
        ResizeOptions resizeOptions2 = resizeOptions;
        Postprocessor postprocessor2 = postprocessor;
        if (!PatchProxy.isSupport(new Object[]{urlModel2, resizeOptions2, postprocessor2}, null, f34655a, true, 23965, new Class[]{UrlModel.class, ResizeOptions.class, Postprocessor.class}, ImageRequest[].class)) {
            return a(urlModel2, resizeOptions2, Priority.MEDIUM, postprocessor2, Bitmap.Config.RGB_565);
        }
        return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{urlModel2, resizeOptions2, postprocessor2}, null, f34655a, true, 23965, new Class[]{UrlModel.class, ResizeOptions.class, Postprocessor.class}, ImageRequest[].class);
    }

    public static ImageRequest[] a(UrlModel urlModel, ResizeOptions resizeOptions, Priority priority, Postprocessor postprocessor) {
        UrlModel urlModel2 = urlModel;
        Priority priority2 = priority;
        if (!PatchProxy.isSupport(new Object[]{urlModel2, null, priority2, null}, null, f34655a, true, 23966, new Class[]{UrlModel.class, ResizeOptions.class, Priority.class, Postprocessor.class}, ImageRequest[].class)) {
            return a(urlModel2, (ResizeOptions) null, priority2, (Postprocessor) null, Bitmap.Config.RGB_565);
        }
        return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{urlModel2, null, priority2, null}, null, f34655a, true, 23966, new Class[]{UrlModel.class, ResizeOptions.class, Priority.class, Postprocessor.class}, ImageRequest[].class);
    }

    public static ImageRequest[] a(UrlModel urlModel, ResizeOptions resizeOptions, Postprocessor postprocessor, Bitmap.Config config) {
        UrlModel urlModel2 = urlModel;
        Bitmap.Config config2 = config;
        if (!PatchProxy.isSupport(new Object[]{urlModel2, null, null, config2}, null, f34655a, true, 23967, new Class[]{UrlModel.class, ResizeOptions.class, Postprocessor.class, Bitmap.Config.class}, ImageRequest[].class)) {
            return a(urlModel2, (ResizeOptions) null, Priority.MEDIUM, (Postprocessor) null, config2);
        }
        return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{urlModel2, null, null, config2}, null, f34655a, true, 23967, new Class[]{UrlModel.class, ResizeOptions.class, Postprocessor.class, Bitmap.Config.class}, ImageRequest[].class);
    }

    private static ImageRequest[] a(UrlModel urlModel, ResizeOptions resizeOptions, Priority priority, Postprocessor postprocessor, Bitmap.Config config) {
        ResizeOptions resizeOptions2 = resizeOptions;
        Priority priority2 = priority;
        Postprocessor postprocessor2 = postprocessor;
        Bitmap.Config config2 = config;
        if (PatchProxy.isSupport(new Object[]{urlModel, resizeOptions2, priority2, postprocessor2, config2}, null, f34655a, true, 23968, new Class[]{UrlModel.class, ResizeOptions.class, Priority.class, Postprocessor.class, Bitmap.Config.class}, ImageRequest[].class)) {
            return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{urlModel, resizeOptions2, priority2, postprocessor2, config2}, null, f34655a, true, 23968, new Class[]{UrlModel.class, ResizeOptions.class, Priority.class, Postprocessor.class, Bitmap.Config.class}, ImageRequest[].class);
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new ImageRequest[0];
        } else {
            ArrayList arrayList = new ArrayList();
            f fVar = new f();
            for (String next : urlModel.getUrlList()) {
                if (!StringUtils.isEmpty(next)) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(config2);
                    imageDecodeOptionsBuilder.setPreDecodeFrameCount(1);
                    imageDecodeOptionsBuilder.setDecodeAllFrames(false);
                    ImageRequestBuilder imageDecodeOptions = ImageRequestBuilder.newBuilderWithSource(Uri.parse(next)).setRequestPriority(priority2).setImageDecodeOptions(new ImageDecodeOptions(imageDecodeOptionsBuilder));
                    if (postprocessor2 != null) {
                        imageDecodeOptions.setPostprocessor(postprocessor2);
                    }
                    if (resizeOptions2 != null) {
                        imageDecodeOptions.setResizeOptions(resizeOptions2);
                    }
                    fVar.a(imageDecodeOptions);
                    arrayList.add(imageDecodeOptions.build());
                }
            }
            if (arrayList.size() == 0) {
                return new ImageRequest[0];
            }
            return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
        }
    }

    public static boolean a(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, null, f34655a, true, 23970, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, null, f34655a, true, 23970, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (uri == null) {
            return false;
        } else {
            return ImagePipelineFactory.getInstance().getMainFileCache().hasKey(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(uri), null));
        }
    }

    public static void a(UrlModel urlModel, a aVar) {
        UrlModel urlModel2 = urlModel;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{urlModel2, aVar2}, null, f34655a, true, 23978, new Class[]{UrlModel.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2, aVar2}, null, f34655a, true, 23978, new Class[]{UrlModel.class, a.class}, Void.TYPE);
            return;
        }
        final ImageRequest[] a2 = a(urlModel2, (ResizeOptions) null, (Postprocessor) null);
        final ImagePipeline imagePipeline = Fresco.getImagePipeline();
        a(imagePipeline, a2, 0, (DataSubscriber<CloseableReference<CloseableImage>>) new BaseDataSubscriber<CloseableReference<CloseableImage>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34665a;

            /* renamed from: e  reason: collision with root package name */
            private int f34669e = 1;

            public final void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                DataSource<CloseableReference<CloseableImage>> dataSource2 = dataSource;
                if (PatchProxy.isSupport(new Object[]{dataSource2}, this, f34665a, false, 23989, new Class[]{DataSource.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dataSource2}, this, f34665a, false, 23989, new Class[]{DataSource.class}, Void.TYPE);
                    return;
                }
                aVar2.a(dataSource2);
            }

            public final void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                if (PatchProxy.isSupport(new Object[]{dataSource}, this, f34665a, false, 23990, new Class[]{DataSource.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dataSource}, this, f34665a, false, 23990, new Class[]{DataSource.class}, Void.TYPE);
                    return;
                }
                Throwable failureCause = dataSource.getFailureCause();
                ImagePipeline imagePipeline = imagePipeline;
                ImageRequest[] imageRequestArr = a2;
                int i = this.f34669e;
                this.f34669e = i + 1;
                if (!c.a(imagePipeline, imageRequestArr, i, (DataSubscriber<CloseableReference<CloseableImage>>) this)) {
                    aVar2.a((Exception) new RuntimeException(failureCause));
                }
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.facebook.imagepipeline.core.ImagePipeline r23, com.facebook.imagepipeline.request.ImageRequest[] r24, int r25, com.facebook.datasource.DataSubscriber<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r14 = 2
            r5[r14] = r6
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f34655a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<com.facebook.imagepipeline.core.ImagePipeline> r6 = com.facebook.imagepipeline.core.ImagePipeline.class
            r10[r12] = r6
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r6 = com.facebook.imagepipeline.request.ImageRequest[].class
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r14] = r6
            java.lang.Class<com.facebook.datasource.DataSubscriber> r6 = com.facebook.datasource.DataSubscriber.class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = 0
            r8 = 1
            r9 = 23979(0x5dab, float:3.3602E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0074
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r5[r14] = r0
            r5[r15] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f34655a
            r19 = 1
            r20 = 23979(0x5dab, float:3.3602E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<com.facebook.imagepipeline.core.ImagePipeline> r1 = com.facebook.imagepipeline.core.ImagePipeline.class
            r0[r12] = r1
            java.lang.Class<com.facebook.imagepipeline.request.ImageRequest[]> r1 = com.facebook.imagepipeline.request.ImageRequest[].class
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<com.facebook.datasource.DataSubscriber> r1 = com.facebook.datasource.DataSubscriber.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r5
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0074:
            int r4 = r1.length
            if (r2 < r4) goto L_0x0078
            return r12
        L_0x0078:
            r1 = r1[r2]
            r2 = 0
            com.facebook.datasource.DataSource r0 = r0.fetchDecodedImage(r1, r2)
            com.facebook.common.executors.h r1 = com.facebook.common.executors.h.a()
            r0.subscribe(r3, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.c.a(com.facebook.imagepipeline.core.ImagePipeline, com.facebook.imagepipeline.request.ImageRequest[], int, com.facebook.datasource.DataSubscriber):boolean");
    }

    public static Interceptor a() {
        if (PatchProxy.isSupport(new Object[0], null, f34655a, true, 23976, new Class[0], Interceptor.class)) {
            return (Interceptor) PatchProxy.accessDispatch(new Object[0], null, f34655a, true, 23976, new Class[0], Interceptor.class);
        }
        return new Interceptor() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34661a;

            public final Response intercept(Interceptor.Chain chain) throws IOException {
                Interceptor.Chain chain2 = chain;
                if (PatchProxy.isSupport(new Object[]{chain2}, this, f34661a, false, 23986, new Class[]{Interceptor.Chain.class}, Response.class)) {
                    return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, f34661a, false, 23986, new Class[]{Interceptor.Chain.class}, Response.class);
                }
                long nanoTime = System.nanoTime();
                try {
                    Response proceed = chain2.proceed(chain.request());
                    n.a("aweme_image_load", "download_time", (float) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
                    return proceed;
                } catch (IOException e2) {
                    throw e2;
                }
            }
        };
    }

    public static void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f34655a, true, 23974, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f34655a, true, 23974, new Class[]{String.class}, Void.TYPE);
        } else if (str != null && !str.isEmpty() && !a(Uri.parse(str))) {
            ImagePipelineFactory.getInstance().getImagePipeline().prefetchToDiskCache(ImageRequest.fromUri(str), null);
        }
    }

    public static String a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, f34655a, true, 23971, new Class[]{UrlModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{urlModel}, null, f34655a, true, 23971, new Class[]{UrlModel.class}, String.class);
        }
        if (urlModel != null) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    List<String> urlList = urlModel.getUrlList();
                    if (urlList == null || urlList.isEmpty()) {
                        return "";
                    }
                    int size = urlList.size();
                    for (int i = 0; i < size; i++) {
                        if (a(Uri.parse(urlList.get(i)))) {
                            return urlList.get(i);
                        }
                    }
                    return "";
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f34655a, true, 23972, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f34655a, true, 23972, new Class[]{String.class}, String.class);
        }
        String str2 = "";
        if (str == null || str.isEmpty()) {
            return str2;
        }
        Uri parse = Uri.parse(str);
        if (a(parse)) {
            BinaryResource resource = ImagePipelineFactory.getInstance().getMainFileCache().getResource(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(parse), null));
            if (resource != null) {
                File file = ((FileBinaryResource) resource).getFile();
                if (file != null) {
                    str2 = file.getAbsolutePath();
                }
            }
        }
        return str2;
    }

    public static void b(RemoteImageView remoteImageView, UrlModel urlModel) {
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2}, null, f34655a, true, 23960, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2}, null, f34655a, true, 23960, new Class[]{RemoteImageView.class, UrlModel.class}, Void.TYPE);
            return;
        }
        a(remoteImageView2, urlModel2, -1, -1, (Postprocessor) null);
    }

    public static String a(Context context, String str) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, f34655a, true, 23973, new Class[]{Context.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, str}, null, f34655a, true, 23973, new Class[]{Context.class, String.class}, String.class);
        } else if (StringUtils.isEmpty(str)) {
            return "";
        } else {
            String str2 = "";
            Uri parse = Uri.parse(str);
            if (a(parse)) {
                BinaryResource resource = ImagePipelineFactory.getInstance().getMainFileCache().getResource(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(parse), null));
                if (resource != null) {
                    File file = ((FileBinaryResource) resource).getFile();
                    if (file != null) {
                        new b(context2);
                        String a2 = b.a();
                        String md5Hex = DigestUtils.md5Hex(file.getName());
                        File file2 = new File(a2, md5Hex);
                        if (!file2.exists()) {
                            FileUtils.copyFile(file.getAbsolutePath(), a2, md5Hex);
                        }
                        str2 = file2.getAbsolutePath();
                    }
                }
            }
            return str2;
        }
    }

    public static ControllerListener<ImageInfo> a(ControllerListener<ImageInfo> controllerListener, Uri uri, Context context, UrlModel urlModel) {
        final ControllerListener<ImageInfo> controllerListener2 = controllerListener;
        final UrlModel urlModel2 = urlModel;
        if (!PatchProxy.isSupport(new Object[]{controllerListener2, uri, context, urlModel2}, null, f34655a, true, 23975, new Class[]{ControllerListener.class, Uri.class, Context.class, UrlModel.class}, ControllerListener.class)) {
            return new ControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34656a;

                /* renamed from: b  reason: collision with root package name */
                UrlModel f34657b;

                /* renamed from: c  reason: collision with root package name */
                long f34658c = System.currentTimeMillis();

                public final void onRelease(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f34656a, false, 23985, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f34656a, false, 23985, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    if (controllerListener2 != null) {
                        controllerListener2.onRelease(str);
                    }
                }

                public final void onFailure(String str, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{str, th}, this, f34656a, false, 23984, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, th}, this, f34656a, false, 23984, new Class[]{String.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (controllerListener2 != null) {
                        controllerListener2.onFailure(str, th);
                    }
                }

                public final void onIntermediateImageFailed(String str, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{str, th}, this, f34656a, false, 23983, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, th}, this, f34656a, false, 23983, new Class[]{String.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (controllerListener2 != null) {
                        controllerListener2.onIntermediateImageFailed(str, th);
                    }
                }

                public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str, imageInfo}, this, f34656a, false, 23982, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, imageInfo}, this, f34656a, false, 23982, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                        return;
                    }
                    if (controllerListener2 != null) {
                        controllerListener2.onIntermediateImageSet(str, imageInfo);
                    }
                }

                public final void onSubmit(String str, Object obj) {
                    if (PatchProxy.isSupport(new Object[]{str, obj}, this, f34656a, false, 23980, new Class[]{String.class, Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, obj}, this, f34656a, false, 23980, new Class[]{String.class, Object.class}, Void.TYPE);
                        return;
                    }
                    this.f34658c = System.currentTimeMillis();
                    this.f34657b = urlModel2;
                    if (controllerListener2 != null) {
                        controllerListener2.onSubmit(str, obj);
                    }
                }

                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                    String str2 = str;
                    Animatable animatable2 = animatable;
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str2, imageInfo, animatable2}, this, f34656a, false, 23981, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, imageInfo, animatable2}, this, f34656a, false, 23981, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    if (controllerListener2 != null) {
                        controllerListener2.onFinalImageSet(str2, imageInfo, animatable2);
                    }
                }
            };
        }
        Object[] objArr = {controllerListener2, uri, context, urlModel2};
        return (ControllerListener) PatchProxy.accessDispatch(objArr, null, f34655a, true, 23975, new Class[]{ControllerListener.class, Uri.class, Context.class, UrlModel.class}, ControllerListener.class);
    }

    public static void a(UrlModel urlModel, int i, int i2, com.ss.android.ugc.aweme.base.b.a.b<Bitmap> bVar) {
        ResizeOptions resizeOptions;
        UrlModel urlModel2 = urlModel;
        int i3 = i;
        int i4 = i2;
        final com.ss.android.ugc.aweme.base.b.a.b<Bitmap> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{urlModel2, Integer.valueOf(i), Integer.valueOf(i2), bVar2}, null, f34655a, true, 23977, new Class[]{UrlModel.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.base.b.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2, Integer.valueOf(i), Integer.valueOf(i2), bVar2}, null, f34655a, true, 23977, new Class[]{UrlModel.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.base.b.a.b.class}, Void.TYPE);
            return;
        }
        ImagePipeline imagePipeline = ImagePipelineFactory.getInstance().getImagePipeline();
        if (i3 <= 0 || i4 <= 0) {
            resizeOptions = null;
        } else {
            resizeOptions = new ResizeOptions(i3, i4);
        }
        ImageRequest[] a2 = a(urlModel2, resizeOptions, (Postprocessor) null);
        if (a2.length != 0) {
            final DataSource<CloseableReference<CloseableImage>> fetchDecodedImage = imagePipeline.fetchDecodedImage(a2[0], null);
            fetchDecodedImage.subscribe(new BaseBitmapDataSubscriber() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34662a;

                public final void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                    if (PatchProxy.isSupport(new Object[]{dataSource}, this, f34662a, false, 23988, new Class[]{DataSource.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dataSource}, this, f34662a, false, 23988, new Class[]{DataSource.class}, Void.TYPE);
                        return;
                    }
                    if (dataSource != null) {
                        dataSource.close();
                    }
                    bVar2.accept(null);
                }

                public final void onNewResultImpl(@Nullable Bitmap bitmap) {
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f34662a, false, 23987, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f34662a, false, 23987, new Class[]{Bitmap.class}, Void.TYPE);
                    } else if (!fetchDecodedImage.isFinished() || bitmap == null) {
                        bVar2.accept(null);
                    } else {
                        bVar2.accept(Bitmap.createBitmap(bitmap));
                        fetchDecodedImage.close();
                    }
                }
            }, CallerThreadExecutor.getInstance());
        }
    }
}
