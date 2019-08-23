package com.rocket.android.model;

import android.support.annotation.NonNull;

public final class ErrorData {
    private final int code;
    @NonNull
    private final String msg;

    public final int getCode() {
        return this.code;
    }

    @NonNull
    public final String getMsg() {
        return this.msg;
    }

    public ErrorData(int i, @NonNull String str) {
        this.code = i;
        this.msg = str;
    }
}
