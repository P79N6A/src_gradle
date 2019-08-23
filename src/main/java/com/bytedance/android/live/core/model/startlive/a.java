package com.bytedance.android.live.core.model.startlive;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.core.network.response.RequestError;
import com.google.gson.annotations.SerializedName;

public final class a<T> {
    @SerializedName("status_code")

    /* renamed from: a  reason: collision with root package name */
    public int f7843a;
    @SerializedName("data")

    /* renamed from: b  reason: collision with root package name */
    public T f7844b;
    @SerializedName("extra")

    /* renamed from: c  reason: collision with root package name */
    public Object f7845c;
    @IgnoreStyleCheck

    /* renamed from: d  reason: collision with root package name */
    public transient RequestError f7846d;
}
