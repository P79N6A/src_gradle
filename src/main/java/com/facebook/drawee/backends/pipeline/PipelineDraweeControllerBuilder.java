package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.f;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.info.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class PipelineDraweeControllerBuilder extends AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<CloseableImage>, ImageInfo> {
    @Nullable
    private f<DrawableFactory> mCustomDrawableFactories;
    @Nullable
    private b mImageOriginListener;
    @Nullable
    private com.facebook.drawee.backends.pipeline.info.f mImagePerfDataListener;
    private final ImagePipeline mImagePipeline;
    private final d mPipelineDraweeControllerFactory;

    private CacheKey getCacheKey() {
        ImageRequest imageRequest = (ImageRequest) getImageRequest();
        CacheKeyFactory cacheKeyFactory = this.mImagePipeline.getCacheKeyFactory();
        if (cacheKeyFactory == null || imageRequest == null) {
            return null;
        }
        if (imageRequest.getPostprocessor() != null) {
            return cacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, getCallerContext());
        }
        return cacheKeyFactory.getBitmapCacheKey(imageRequest, getCallerContext());
    }

    /* access modifiers changed from: protected */
    public c obtainController() {
        c cVar;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            DraweeController oldController = getOldController();
            String generateUniqueControllerId = generateUniqueControllerId();
            if (oldController instanceof c) {
                cVar = (c) oldController;
            } else {
                cVar = this.mPipelineDraweeControllerFactory.a();
            }
            cVar.a(obtainDataSourceSupplier(cVar, generateUniqueControllerId), generateUniqueControllerId, getCacheKey(), getCallerContext(), this.mCustomDrawableFactories, this.mImageOriginListener);
            cVar.a(this.mImagePerfDataListener);
            return cVar;
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public RequestListener getRequestListener(DraweeController draweeController) {
        if (draweeController instanceof c) {
            return ((c) draweeController).a();
        }
        return null;
    }

    public PipelineDraweeControllerBuilder setCustomDrawableFactories(@Nullable f<DrawableFactory> fVar) {
        this.mCustomDrawableFactories = fVar;
        return (PipelineDraweeControllerBuilder) getThis();
    }

    public PipelineDraweeControllerBuilder setImageOriginListener(@Nullable b bVar) {
        this.mImageOriginListener = bVar;
        return (PipelineDraweeControllerBuilder) getThis();
    }

    public PipelineDraweeControllerBuilder setPerfDataListener(@Nullable com.facebook.drawee.backends.pipeline.info.f fVar) {
        this.mImagePerfDataListener = fVar;
        return (PipelineDraweeControllerBuilder) getThis();
    }

    public PipelineDraweeControllerBuilder setCustomDrawableFactories(DrawableFactory... drawableFactoryArr) {
        Preconditions.checkNotNull(drawableFactoryArr);
        return setCustomDrawableFactories(f.of(drawableFactoryArr));
    }

    public PipelineDraweeControllerBuilder setCustomDrawableFactory(DrawableFactory drawableFactory) {
        Preconditions.checkNotNull(drawableFactory);
        return setCustomDrawableFactories(f.of(drawableFactory));
    }

    public PipelineDraweeControllerBuilder setUri(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return (PipelineDraweeControllerBuilder) super.setImageRequest(ImageRequest.fromUri(str));
        }
        return setUri(Uri.parse(str));
    }

    public static ImageRequest.a convertCacheLevelToRequestLevel(AbstractDraweeControllerBuilder.a aVar) {
        switch (aVar) {
            case FULL_FETCH:
                return ImageRequest.a.FULL_FETCH;
            case DISK_CACHE:
                return ImageRequest.a.DISK_CACHE;
            case BITMAP_MEMORY_CACHE:
                return ImageRequest.a.BITMAP_MEMORY_CACHE;
            default:
                throw new RuntimeException("Cache level" + aVar + "is not supported. ");
        }
    }

    public PipelineDraweeControllerBuilder setUri(@Nullable Uri uri) {
        if (uri == null) {
            return (PipelineDraweeControllerBuilder) super.setImageRequest(null);
        }
        return (PipelineDraweeControllerBuilder) super.setImageRequest(ImageRequestBuilder.newBuilderWithSource(uri).setRotationOptions(RotationOptions.autoRotateAtRenderTime()).build());
    }

    public SimpleDraweeControllerBuilder setUris(List<Uri> list) {
        if (list == null || list.isEmpty()) {
            return super.setImageRequest(null);
        }
        ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(list.get(0));
        int size = list.size();
        if (size > 1) {
            newBuilderWithSource.setBackup(list.subList(1, size));
        }
        newBuilderWithSource.setRotationOptions(RotationOptions.autoRotateAtRenderTime());
        return super.setImageRequest(newBuilderWithSource.build());
    }

    public PipelineDraweeControllerBuilder(Context context, d dVar, ImagePipeline imagePipeline, Set<ControllerListener> set) {
        super(context, set);
        this.mImagePipeline = imagePipeline;
        this.mPipelineDraweeControllerFactory = dVar;
    }

    /* access modifiers changed from: protected */
    public DataSource<CloseableReference<CloseableImage>> getDataSourceForRequest(DraweeController draweeController, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.a aVar) {
        return this.mImagePipeline.fetchDecodedImage(imageRequest, obj, convertCacheLevelToRequestLevel(aVar), getRequestListener(draweeController));
    }
}
