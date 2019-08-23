package com.facebook.imagepipeline.animated.b;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.i;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final g<CacheKey, CloseableImage> f23789a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c<CacheKey> f23790b = new g.c<CacheKey>() {
        public final void onExclusivityChanged(CacheKey cacheKey, boolean z) {
            c.this.onReusabilityChange(cacheKey, z);
        }
    };
    @GuardedBy

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<CacheKey> f23791c = new LinkedHashSet<>();
    public final CacheKey mImageCacheKey;

    @VisibleForTesting
    static class a implements CacheKey {

        /* renamed from: a  reason: collision with root package name */
        private final CacheKey f23795a;

        /* renamed from: b  reason: collision with root package name */
        private final int f23796b;

        public final String getUriString() {
            return null;
        }

        public final int hashCode() {
            return (this.f23795a.hashCode() * 1013) + this.f23796b;
        }

        public final String toString() {
            return Objects.toStringHelper((Object) this).add("imageCacheKey", (Object) this.f23795a).add("frameIndex", this.f23796b).toString();
        }

        public final boolean containsUri(Uri uri) {
            return this.f23795a.containsUri(uri);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f23796b != aVar.f23796b || !this.f23795a.equals(aVar.f23795a)) {
                return false;
            }
            return true;
        }

        public a(CacheKey cacheKey, int i) {
            this.f23795a = cacheKey;
            this.f23796b = i;
        }
    }

    @Nullable
    private synchronized CacheKey a() {
        CacheKey cacheKey;
        cacheKey = null;
        Iterator it2 = this.f23791c.iterator();
        if (it2.hasNext()) {
            cacheKey = (CacheKey) it2.next();
            it2.remove();
        }
        return cacheKey;
    }

    @Nullable
    public final CloseableReference<CloseableImage> getForReuse() {
        CloseableReference<CloseableImage> reuse;
        do {
            CacheKey a2 = a();
            if (a2 == null) {
                return null;
            }
            reuse = this.f23789a.reuse(a2);
        } while (reuse == null);
        return reuse;
    }

    private a a(int i) {
        return new a(this.mImageCacheKey, i);
    }

    public final void clear(final int i) {
        if (i != -1) {
            this.f23789a.removeAllForExclusive(new i<CacheKey>() {
                public final boolean apply(CacheKey cacheKey) {
                    if (new a(c.this.mImageCacheKey, i).equals(cacheKey)) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public final boolean contains(int i) {
        return this.f23789a.contains(a(i));
    }

    @Nullable
    public final CloseableReference<CloseableImage> get(int i) {
        return this.f23789a.get(a(i));
    }

    @Nullable
    public final CloseableReference<CloseableImage> cache(int i, CloseableReference<CloseableImage> closeableReference) {
        return this.f23789a.cache(a(i), closeableReference, this.f23790b);
    }

    public c(CacheKey cacheKey, g<CacheKey, CloseableImage> gVar) {
        this.mImageCacheKey = cacheKey;
        this.f23789a = gVar;
    }

    public final synchronized void onReusabilityChange(CacheKey cacheKey, boolean z) {
        if (z) {
            this.f23791c.add(cacheKey);
        } else {
            this.f23791c.remove(cacheKey);
        }
    }
}
