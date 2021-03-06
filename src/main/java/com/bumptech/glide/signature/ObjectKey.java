package com.bumptech.glide.signature;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public final class ObjectKey implements Key {
    private final Object object;

    public final int hashCode() {
        return this.object.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.object + '}';
    }

    public ObjectKey(@NonNull Object obj) {
        this.object = Preconditions.checkNotNull(obj);
    }

    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.object.toString().getBytes(CHARSET));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.object.equals(((ObjectKey) obj).object);
        }
        return false;
    }
}
