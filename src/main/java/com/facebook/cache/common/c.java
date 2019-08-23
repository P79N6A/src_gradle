package com.facebook.cache.common;

import android.net.Uri;
import java.util.List;

public final class c implements CacheKey {

    /* renamed from: a  reason: collision with root package name */
    public final List<CacheKey> f23426a;

    public final int hashCode() {
        return this.f23426a.hashCode();
    }

    public final String getUriString() {
        return this.f23426a.get(0).getUriString();
    }

    public final String toString() {
        return "MultiCacheKey:" + this.f23426a.toString();
    }

    public final boolean containsUri(Uri uri) {
        for (int i = 0; i < this.f23426a.size(); i++) {
            if (this.f23426a.get(i).containsUri(uri)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.f23426a.equals(((c) obj).f23426a);
        }
        return false;
    }
}
