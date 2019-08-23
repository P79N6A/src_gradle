package com.tt.miniapphost.entity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class DisableStateEntity {
    @NonNull
    private final String mDisableHintMessage;
    @Nullable
    private final String mDisableHintUrl;

    @NonNull
    public String getHintMessage() {
        return this.mDisableHintMessage;
    }

    @Nullable
    public String getHintUrl() {
        return this.mDisableHintUrl;
    }

    public DisableStateEntity(@NonNull String str, @Nullable String str2) {
        this.mDisableHintMessage = str;
        this.mDisableHintUrl = str2;
    }
}
