package com.ss.android.ugc.aweme.detail.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class AwemeResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Aweme mAweme;
    private final String mRequestId;

    @NonNull
    public final Aweme getAweme() {
        return this.mAweme;
    }

    @NonNull
    public final String getRequestId() {
        return this.mRequestId;
    }

    public AwemeResponse(@NonNull Aweme aweme, @Nullable String str) {
        this.mAweme = aweme;
        this.mRequestId = str == null ? "" : str;
    }
}
