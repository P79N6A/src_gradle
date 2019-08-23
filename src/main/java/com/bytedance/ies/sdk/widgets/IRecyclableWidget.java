package com.bytedance.ies.sdk.widgets;

import android.support.annotation.Nullable;

public interface IRecyclableWidget {
    boolean isAlive();

    boolean isInitialized();

    void onInit(@Nullable Object[] objArr);

    void onLoad(@Nullable Object[] objArr);

    void onUnload();

    void setClearAfterDestroyed();
}
