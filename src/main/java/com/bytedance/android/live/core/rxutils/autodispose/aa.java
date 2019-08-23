package com.bytedance.android.live.core.rxutils.autodispose;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public interface aa<T> {
    Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2);
}
