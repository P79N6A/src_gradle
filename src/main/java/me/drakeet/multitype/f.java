package me.drakeet.multitype;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

public final class f<T> implements g<T>, h<T> {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final MultiTypeAdapter f83981a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final Class<? extends T> f83982b;

    /* renamed from: c  reason: collision with root package name */
    private c<T, ?>[] f83983c;

    @SafeVarargs
    @CheckResult
    @NonNull
    public final g<T> a(@NonNull c<T, ?>... cVarArr) {
        this.f83983c = cVarArr;
        return this;
    }

    public final void a(@NonNull d<T> dVar) {
        for (c<T, ?> a2 : this.f83983c) {
            this.f83981a.f83976c.a(this.f83982b, a2, dVar);
        }
    }

    f(@NonNull MultiTypeAdapter multiTypeAdapter, @NonNull Class<? extends T> cls) {
        this.f83982b = cls;
        this.f83981a = multiTypeAdapter;
    }
}
