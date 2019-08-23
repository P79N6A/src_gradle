package com.ss.android.ugc.aweme.base.mvvm;

import android.support.annotation.MainThread;
import com.ss.android.ugc.aweme.base.mvvm.e;

public interface c<T extends e> {
    @MainThread
    void bind(T t);

    @MainThread
    void refresh();
}
