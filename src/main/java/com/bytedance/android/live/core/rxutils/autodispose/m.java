package com.bytedance.android.live.core.rxutils.autodispose;

import io.reactivex.CompletableConverter;
import io.reactivex.FlowableConverter;
import io.reactivex.MaybeConverter;
import io.reactivex.ObservableConverter;
import io.reactivex.SingleConverter;
import io.reactivex.parallel.ParallelFlowableConverter;

public interface m<T> extends CompletableConverter<w>, FlowableConverter<T, y<T>>, MaybeConverter<T, aa<T>>, ObservableConverter<T, ab<T>>, SingleConverter<T, af<T>>, ParallelFlowableConverter<T, ad<T>> {
}
