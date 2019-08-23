package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {

    static final class NonOwnedBitmapResource implements Resource<Bitmap> {
        private final Bitmap bitmap;

        public final void recycle() {
        }

        @NonNull
        public final Bitmap get() {
            return this.bitmap;
        }

        @NonNull
        public final Class<Bitmap> getResourceClass() {
            return Bitmap.class;
        }

        public final int getSize() {
            return Util.getBitmapByteSize(this.bitmap);
        }

        NonOwnedBitmapResource(@NonNull Bitmap bitmap2) {
            this.bitmap = bitmap2;
        }
    }

    public final boolean handles(@NonNull Bitmap bitmap, @NonNull Options options) {
        return true;
    }

    public final Resource<Bitmap> decode(@NonNull Bitmap bitmap, int i, int i2, @NonNull Options options) {
        return new NonOwnedBitmapResource(bitmap);
    }
}
