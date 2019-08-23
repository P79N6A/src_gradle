package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.executors.h;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.f;
import com.facebook.drawee.components.a;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.Set;
import javax.annotation.Nullable;

public class PipelineDraweeControllerBuilderSupplier implements Supplier<PipelineDraweeControllerBuilder> {
    private final Set<ControllerListener> mBoundControllerListeners;
    private final Context mContext;
    private final ImagePipeline mImagePipeline;
    private final d mPipelineDraweeControllerFactory;

    public PipelineDraweeControllerBuilder get() {
        return new PipelineDraweeControllerBuilder(this.mContext, this.mPipelineDraweeControllerFactory, this.mImagePipeline, this.mBoundControllerListeners);
    }

    public PipelineDraweeControllerBuilderSupplier(Context context) {
        this(context, null);
    }

    public PipelineDraweeControllerBuilderSupplier(Context context, @Nullable b bVar) {
        this(context, ImagePipelineFactory.getInstance(), bVar);
    }

    public PipelineDraweeControllerBuilderSupplier(Context context, ImagePipelineFactory imagePipelineFactory, @Nullable b bVar) {
        this(context, imagePipelineFactory, null, bVar);
    }

    public PipelineDraweeControllerBuilderSupplier(Context context, ImagePipelineFactory imagePipelineFactory, Set<ControllerListener> set, @Nullable b bVar) {
        f<DrawableFactory> fVar;
        this.mContext = context;
        this.mImagePipeline = imagePipelineFactory.getImagePipeline();
        if (bVar == null || bVar.f23638b == null) {
            this.mPipelineDraweeControllerFactory = new d();
        } else {
            this.mPipelineDraweeControllerFactory = bVar.f23638b;
        }
        d dVar = this.mPipelineDraweeControllerFactory;
        Resources resources = context.getResources();
        a a2 = a.a();
        DrawableFactory animatedDrawableFactory = imagePipelineFactory.getAnimatedDrawableFactory(context);
        h a3 = h.a();
        n<CacheKey, CloseableImage> bitmapMemoryCache = this.mImagePipeline.getBitmapMemoryCache();
        Supplier<Boolean> supplier = null;
        if (bVar != null) {
            fVar = bVar.f23637a;
        } else {
            fVar = null;
        }
        supplier = bVar != null ? bVar.f23639c : supplier;
        dVar.f23646a = resources;
        dVar.f23647b = a2;
        dVar.f23648c = animatedDrawableFactory;
        dVar.f23649d = a3;
        dVar.f23650e = bitmapMemoryCache;
        dVar.f23651f = fVar;
        dVar.g = supplier;
        this.mBoundControllerListeners = set;
    }
}
