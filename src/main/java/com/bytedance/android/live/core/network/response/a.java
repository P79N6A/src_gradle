package com.bytedance.android.live.core.network.response;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.Extra;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class a<T, R extends Extra> {
    @SerializedName("status_code")

    /* renamed from: a  reason: collision with root package name */
    public int f7866a;
    @SerializedName("data")

    /* renamed from: b  reason: collision with root package name */
    public List<T> f7867b;
    @SerializedName("extra")

    /* renamed from: c  reason: collision with root package name */
    public R f7868c;
    @IgnoreStyleCheck

    /* renamed from: d  reason: collision with root package name */
    public transient RequestError f7869d;
}
