package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;

public class SimpleCacheKey implements CacheKey {
    final String mKey;

    public String getUriString() {
        return this.mKey;
    }

    public String toString() {
        return this.mKey;
    }

    public int hashCode() {
        return this.mKey.hashCode();
    }

    public SimpleCacheKey(String str) {
        this.mKey = (String) Preconditions.checkNotNull(str);
    }

    public boolean containsUri(Uri uri) {
        return this.mKey.contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SimpleCacheKey) {
            return this.mKey.equals(((SimpleCacheKey) obj).mKey);
        }
        return false;
    }
}
