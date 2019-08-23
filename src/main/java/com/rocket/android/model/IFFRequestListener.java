package com.rocket.android.model;

import android.support.annotation.Nullable;

public interface IFFRequestListener<T> {
    void onFailure(@Nullable ErrorData errorData);

    void onSuccess(T t);
}
