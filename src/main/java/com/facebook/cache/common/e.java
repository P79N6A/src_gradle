package com.facebook.cache.common;

public final class e implements CacheEventListener {

    /* renamed from: a  reason: collision with root package name */
    private static e f23428a;

    public final void onCleared() {
    }

    public final void onEviction(CacheEvent cacheEvent) {
    }

    public final void onHit(CacheEvent cacheEvent) {
    }

    public final void onMiss(CacheEvent cacheEvent) {
    }

    public final void onReadException(CacheEvent cacheEvent) {
    }

    public final void onWriteAttempt(CacheEvent cacheEvent) {
    }

    public final void onWriteException(CacheEvent cacheEvent) {
    }

    public final void onWriteSuccess(CacheEvent cacheEvent) {
    }

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f23428a == null) {
                f23428a = new e();
            }
            eVar = f23428a;
        }
        return eVar;
    }
}
