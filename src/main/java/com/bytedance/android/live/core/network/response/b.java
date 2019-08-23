package com.bytedance.android.live.core.network.response;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.Extra;
import com.google.gson.annotations.SerializedName;

public class b<T, R extends Extra> {
    @SerializedName("status_code")

    /* renamed from: a  reason: collision with root package name */
    public int f7870a;
    @SerializedName("data")

    /* renamed from: b  reason: collision with root package name */
    public T f7871b;
    @SerializedName("extra")

    /* renamed from: c  reason: collision with root package name */
    public R f7872c;
    @IgnoreStyleCheck

    /* renamed from: d  reason: collision with root package name */
    public transient RequestError f7873d;
}
