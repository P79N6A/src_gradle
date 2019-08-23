package com.ss.android.ugc.aweme.live.c;

import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.facebook.cache.common.CacheKey;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53336a;

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f53337b;

    static {
        ExecutorService executorService;
        SimpleThreadFactory simpleThreadFactory = new SimpleThreadFactory("fresco_download_image");
        if (PatchProxy.isSupport(new Object[]{simpleThreadFactory}, null, c.f53342a, true, 55965, new Class[]{ThreadFactory.class}, ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{simpleThreadFactory}, null, c.f53342a, true, 55965, new Class[]{ThreadFactory.class}, ExecutorService.class);
        } else {
            executorService = h.a(m.a(p.FIXED).a(1).a((ThreadFactory) simpleThreadFactory).a());
        }
        f53337b = executorService;
    }

    public static boolean a(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, null, f53336a, true, 55955, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, null, f53336a, true, 55955, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        } else if (uri == null) {
            return false;
        } else {
            return ImagePipelineFactory.getInstance().getMainFileCache().hasKey(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(uri), null));
        }
    }

    public static boolean a(ImageModel imageModel) {
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageModel2}, null, f53336a, true, 55956, new Class[]{ImageModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageModel2}, null, f53336a, true, 55956, new Class[]{ImageModel.class}, Boolean.TYPE)).booleanValue();
        }
        for (ImageRequest encodedCacheKey : a(imageModel2, null, null)) {
            if (ImagePipelineFactory.getInstance().getMainFileCache().hasKey(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(encodedCacheKey, null))) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, e.b bVar) {
        final e.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str, bVar2}, null, f53336a, true, 55959, new Class[]{String.class, e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bVar2}, null, f53336a, true, 55959, new Class[]{String.class, e.b.class}, Void.TYPE);
        } else if (str != null && !str.isEmpty() && !a(Uri.parse(str))) {
            ImageRequest fromUri = ImageRequest.fromUri(str);
            CacheKey encodedCacheKey = DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(fromUri, null);
            com.facebook.imagepipeline.cache.m<CacheKey, com.facebook.common.memory.e> encodedMemoryCache = ImagePipelineFactory.getInstance().getEncodedMemoryCache();
            if (encodedMemoryCache.get(encodedCacheKey) != null) {
                encodedMemoryCache.removeAll(b.f53341b);
            }
            ImagePipelineFactory.getInstance().getImagePipeline().prefetchToDiskCache(fromUri, null).subscribe(new BaseDataSubscriber<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53338a;

                public final void onFailureImpl(DataSource<Void> dataSource) {
                    if (PatchProxy.isSupport(new Object[]{dataSource}, this, f53338a, false, 55964, new Class[]{DataSource.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dataSource}, this, f53338a, false, 55964, new Class[]{DataSource.class}, Void.TYPE);
                        return;
                    }
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                }

                public final void onNewResultImpl(DataSource<Void> dataSource) {
                    if (PatchProxy.isSupport(new Object[]{dataSource}, this, f53338a, false, 55963, new Class[]{DataSource.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dataSource}, this, f53338a, false, 55963, new Class[]{DataSource.class}, Void.TYPE);
                        return;
                    }
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                }
            }, f53337b);
        }
    }

    public static ImageRequest[] a(ImageModel imageModel, ResizeOptions resizeOptions, Postprocessor postprocessor) {
        ResizeOptions resizeOptions2 = resizeOptions;
        Postprocessor postprocessor2 = postprocessor;
        if (PatchProxy.isSupport(new Object[]{imageModel, resizeOptions2, postprocessor2}, null, f53336a, true, 55953, new Class[]{ImageModel.class, ResizeOptions.class, Postprocessor.class}, ImageRequest[].class)) {
            return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{imageModel, resizeOptions2, postprocessor2}, null, f53336a, true, 55953, new Class[]{ImageModel.class, ResizeOptions.class, Postprocessor.class}, ImageRequest[].class);
        } else if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new ImageRequest[0];
        } else {
            ArrayList arrayList = new ArrayList();
            f fVar = new f();
            for (String next : imageModel.getUrls()) {
                if (!StringUtils.isEmpty(next)) {
                    ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(next));
                    if (postprocessor2 != null) {
                        newBuilderWithSource.setPostprocessor(postprocessor2);
                    }
                    if (resizeOptions2 != null) {
                        newBuilderWithSource.setResizeOptions(resizeOptions2);
                    }
                    fVar.a(newBuilderWithSource);
                    arrayList.add(newBuilderWithSource.build());
                }
            }
            if (arrayList.size() == 0) {
                return new ImageRequest[0];
            }
            return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
        }
    }
}
