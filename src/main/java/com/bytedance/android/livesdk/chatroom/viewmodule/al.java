package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.annotation.SuppressLint;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import com.bytedance.ies.a.a;
import com.bytedance.ies.sdk.widgets.DataCenter;

public interface al extends LifecycleOwner, a {
    String a();

    @SuppressLint({"InflateParams", "SetTextI18n"})
    void a(@NonNull Throwable th);

    @Deprecated
    <T> com.bytedance.android.live.core.rxutils.a<T> getAutoUnbindTransformer();

    DataCenter getDataCenter();
}
