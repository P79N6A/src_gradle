package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;

public final class LazyBitmapDrawableResource implements Initializable, Resource<BitmapDrawable> {
    private final Resource<Bitmap> bitmapResource;
    private final Resources resources;

    @NonNull
    public final Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    public final int getSize() {
        return this.bitmapResource.getSize();
    }

    public final void recycle() {
        this.bitmapResource.recycle();
    }

    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.resources, (Bitmap) this.bitmapResource.get());
    }

    public final void initialize() {
        if (this.bitmapResource instanceof Initializable) {
            ((Initializable) this.bitmapResource).initialize();
        }
    }

    @Nullable
    public static Resource<BitmapDrawable> obtain(@NonNull Resources resources2, @Nullable Resource<Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(resources2, resource);
    }

    private LazyBitmapDrawableResource(@NonNull Resources resources2, @NonNull Resource<Bitmap> resource) {
        this.resources = (Resources) Preconditions.checkNotNull(resources2);
        this.bitmapResource = (Resource) Preconditions.checkNotNull(resource);
    }

    @Deprecated
    public static LazyBitmapDrawableResource obtain(Context context, Bitmap bitmap) {
        return (LazyBitmapDrawableResource) obtain(context.getResources(), (Resource<Bitmap>) BitmapResource.obtain(bitmap, Glide.get(context).getBitmapPool()));
    }

    @Deprecated
    public static LazyBitmapDrawableResource obtain(Resources resources2, BitmapPool bitmapPool, Bitmap bitmap) {
        return (LazyBitmapDrawableResource) obtain(resources2, (Resource<Bitmap>) BitmapResource.obtain(bitmap, bitmapPool));
    }
}
