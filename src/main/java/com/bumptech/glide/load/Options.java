package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

public final class Options implements Key {
    private final ArrayMap<Option<?>, Object> values = new CachedHashCodeArrayMap();

    public final int hashCode() {
        return this.values.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.values + '}';
    }

    public final void putAll(@NonNull Options options) {
        this.values.putAll(options.values);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.values.equals(((Options) obj).values);
        }
        return false;
    }

    @Nullable
    public final <T> T get(@NonNull Option<T> option) {
        if (this.values.containsKey(option)) {
            return this.values.get(option);
        }
        return option.getDefaultValue();
    }

    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.values.size(); i++) {
            updateDiskCacheKey((Option) this.values.keyAt(i), this.values.valueAt(i), messageDigest);
        }
    }

    @NonNull
    public final <T> Options set(@NonNull Option<T> option, @NonNull T t) {
        this.values.put(option, t);
        return this;
    }

    private static <T> void updateDiskCacheKey(@NonNull Option<T> option, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        option.update(obj, messageDigest);
    }
}
