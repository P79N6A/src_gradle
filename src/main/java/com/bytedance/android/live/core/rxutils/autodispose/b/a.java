package com.bytedance.android.live.core.rxutils.autodispose.b;

import com.bytedance.android.live.core.rxutils.autodispose.ac;
import io.reactivex.functions.Function;

public interface a<E> extends Function<E, E> {
    E apply(E e2) throws ac;
}
