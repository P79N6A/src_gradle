package com.facebook.common.internal;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Supplier<Boolean> f23531a = new Supplier<Boolean>() {
        public final /* bridge */ /* synthetic */ Object get() {
            return Boolean.TRUE;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final Supplier<Boolean> f23532b = new Supplier<Boolean>() {
        public final /* bridge */ /* synthetic */ Object get() {
            return Boolean.FALSE;
        }
    };

    public static <T> Supplier<T> a(final T t) {
        return new Supplier<T>() {
            public final T get() {
                return t;
            }
        };
    }
}
