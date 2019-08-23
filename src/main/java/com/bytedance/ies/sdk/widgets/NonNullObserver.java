package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.Observer;

public interface NonNullObserver<T> extends Observer<T> {
    void onChanged(T t);
}
