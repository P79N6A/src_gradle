package com.bumptech.glide.load;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public final class Option<T> {
    private static final CacheKeyUpdater<Object> EMPTY_UPDATER = new CacheKeyUpdater<Object>() {
        public void update(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    };
    private final CacheKeyUpdater<T> cacheKeyUpdater;
    private final T defaultValue;
    private final String key;
    private volatile byte[] keyBytes;

    public interface CacheKeyUpdater<T> {
        void update(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    @NonNull
    private static <T> CacheKeyUpdater<T> emptyUpdater() {
        return EMPTY_UPDATER;
    }

    @Nullable
    public final T getDefaultValue() {
        return this.defaultValue;
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    @NonNull
    private byte[] getKeyBytes() {
        if (this.keyBytes == null) {
            this.keyBytes = this.key.getBytes(Key.CHARSET);
        }
        return this.keyBytes;
    }

    public final String toString() {
        return "Option{key='" + this.key + '\'' + '}';
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str) {
        return new Option<>(str, null, emptyUpdater());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.key.equals(((Option) obj).key);
        }
        return false;
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @NonNull CacheKeyUpdater<T> cacheKeyUpdater2) {
        return new Option<>(str, null, cacheKeyUpdater2);
    }

    public final void update(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.cacheKeyUpdater.update(getKeyBytes(), t, messageDigest);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str, @NonNull T t) {
        return new Option<>(str, t, emptyUpdater());
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @Nullable T t, @NonNull CacheKeyUpdater<T> cacheKeyUpdater2) {
        return new Option<>(str, t, cacheKeyUpdater2);
    }

    private Option(@NonNull String str, @Nullable T t, @NonNull CacheKeyUpdater<T> cacheKeyUpdater2) {
        this.key = Preconditions.checkNotEmpty(str);
        this.defaultValue = t;
        this.cacheKeyUpdater = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater2);
    }
}
