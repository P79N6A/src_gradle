package com.ss.android.ugc.aweme.web;

import android.os.ResultReceiver;
import android.support.annotation.Keep;

@Keep
public interface IJsCallback<T> {
    T get();

    ResultReceiver getResultReceiver();
}
