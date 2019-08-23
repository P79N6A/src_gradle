package com.bytedance.android.live.core.rxutils.autodispose.b;

import com.bytedance.android.live.core.rxutils.autodispose.ae;
import com.bytedance.android.live.core.rxutils.autodispose.internal.DoNotMock;
import io.reactivex.Observable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Nullable;

@DoNotMock
public interface d<E> extends ae {
    @CheckReturnValue
    Observable<E> a();

    @CheckReturnValue
    a<E> b();

    @Nullable
    E d();
}
