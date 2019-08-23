package me.drakeet.multitype;

import android.support.annotation.NonNull;

public interface i {
    @NonNull
    c<?, ?> a(int i);

    <T> void a(@NonNull Class<? extends T> cls, @NonNull c<T, ?> cVar, @NonNull d<T> dVar);

    boolean a(@NonNull Class<?> cls);

    int b(@NonNull Class<?> cls);

    @NonNull
    d<?> b(int i);
}
