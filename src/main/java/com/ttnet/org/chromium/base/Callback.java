package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.CalledByNative;

public abstract class Callback<T> {
    public abstract void onResult(T t);

    @CalledByNative
    private void onResultFromNative(Object obj) {
        onResult(obj);
    }

    @CalledByNative
    private void onResultFromNative(int i) {
        onResult(Integer.valueOf(i));
    }

    @CalledByNative
    private void onResultFromNative(boolean z) {
        onResult(Boolean.valueOf(z));
    }
}
