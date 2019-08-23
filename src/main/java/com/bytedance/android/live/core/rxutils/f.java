package com.bytedance.android.live.core.rxutils;

import io.reactivex.CompletableTransformer;
import io.reactivex.FlowableTransformer;
import io.reactivex.MaybeTransformer;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleTransformer;

public interface f<T> extends CompletableTransformer, FlowableTransformer<T, T>, MaybeTransformer<T, T>, ObservableTransformer<T, T>, SingleTransformer<T, T> {
}
