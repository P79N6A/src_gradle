package com.ss.android.ugc.bogut.library.factory;

import android.support.annotation.Nullable;
import com.ss.android.ugc.bogut.library.a.a;

public final class a<P extends com.ss.android.ugc.bogut.library.a.a> implements b<P> {

    /* renamed from: a  reason: collision with root package name */
    private Class<P> f77171a;

    public final P a() {
        try {
            return (com.ss.android.ugc.bogut.library.a.a) this.f77171a.newInstance();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private a(Class<P> cls) {
        this.f77171a = cls;
    }

    @Nullable
    public static <P extends com.ss.android.ugc.bogut.library.a.a> a<P> a(Class<?> cls) {
        Class cls2;
        PresenterClass presenterClass = (PresenterClass) cls.getAnnotation(PresenterClass.class);
        if (presenterClass == null) {
            cls2 = null;
        } else {
            cls2 = presenterClass.a();
        }
        if (cls2 == null) {
            return null;
        }
        return new a<>(cls2);
    }
}
