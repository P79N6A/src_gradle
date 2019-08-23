package com.facebook.cache.disk;

import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.io.IOException;
import javax.annotation.Nullable;

public final class h implements CacheEvent {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f23489a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static h f23490b;

    /* renamed from: c  reason: collision with root package name */
    private static int f23491c;

    /* renamed from: d  reason: collision with root package name */
    private CacheKey f23492d;

    /* renamed from: e  reason: collision with root package name */
    private String f23493e;

    /* renamed from: f  reason: collision with root package name */
    private long f23494f;
    private long g;
    private long h;
    private IOException i;
    private CacheEventListener.a j;
    private h k;

    private h() {
    }

    @Nullable
    public final CacheKey getCacheKey() {
        return this.f23492d;
    }

    public final long getCacheLimit() {
        return this.g;
    }

    public final long getCacheSize() {
        return this.h;
    }

    @Nullable
    public final CacheEventListener.a getEvictionReason() {
        return this.j;
    }

    @Nullable
    public final IOException getException() {
        return this.i;
    }

    public final long getItemSize() {
        return this.f23494f;
    }

    @Nullable
    public final String getResourceId() {
        return this.f23493e;
    }

    private void c() {
        this.f23492d = null;
        this.f23493e = null;
        this.f23494f = 0;
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        synchronized (f23489a) {
            if (f23491c < 5) {
                c();
                f23491c++;
                if (f23490b != null) {
                    this.k = f23490b;
                }
                f23490b = this;
            }
        }
    }

    @ReturnsOwnership
    public static h a() {
        synchronized (f23489a) {
            if (f23490b == null) {
                return new h();
            }
            h hVar = f23490b;
            f23490b = hVar.k;
            hVar.k = null;
            f23491c--;
            return hVar;
        }
    }

    public final h a(long j2) {
        this.f23494f = j2;
        return this;
    }

    public final h b(long j2) {
        this.h = j2;
        return this;
    }

    public final h c(long j2) {
        this.g = j2;
        return this;
    }

    public final h a(CacheEventListener.a aVar) {
        this.j = aVar;
        return this;
    }

    public final h a(CacheKey cacheKey) {
        this.f23492d = cacheKey;
        return this;
    }

    public final h a(IOException iOException) {
        this.i = iOException;
        return this;
    }

    public final h a(String str) {
        this.f23493e = str;
        return this;
    }
}
