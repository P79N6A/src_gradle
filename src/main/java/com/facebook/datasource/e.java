package com.facebook.datasource;

import com.facebook.common.internal.Preconditions;

public final class e<T> extends a<T> {
    private e() {
    }

    public static <T> e<T> a() {
        return new e<>();
    }

    public final boolean setProgress(float f2) {
        return super.setProgress(f2);
    }

    public final boolean a(T t) {
        return super.a(Preconditions.checkNotNull(t), true);
    }

    public final boolean a(Throwable th) {
        return super.a((Throwable) Preconditions.checkNotNull(th));
    }

    public final boolean a(T t, boolean z) {
        return super.a(Preconditions.checkNotNull(t), z);
    }
}
