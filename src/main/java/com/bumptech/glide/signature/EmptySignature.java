package com.bumptech.glide.signature;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

public final class EmptySignature implements Key {
    private static final EmptySignature EMPTY_KEY = new EmptySignature();

    public final String toString() {
        return "EmptySignature";
    }

    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }

    private EmptySignature() {
    }

    @NonNull
    public static EmptySignature obtain() {
        return EMPTY_KEY;
    }
}
