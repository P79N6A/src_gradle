package com.bytedance.android.live.core.rxutils.autodispose;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public interface ab<T> {
    Disposable a(Consumer<? super T> consumer);

    Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2);

    void a(Observer<? super T> observer);
}
