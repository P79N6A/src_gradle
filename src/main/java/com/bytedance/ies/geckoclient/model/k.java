package com.bytedance.ies.geckoclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class k {
    @SerializedName("common")

    /* renamed from: a  reason: collision with root package name */
    public CommonParamsModel f20826a;
    @SerializedName("packages")

    /* renamed from: b  reason: collision with root package name */
    public List<PackageStatisticModel> f20827b;

    public k() {
    }

    public k(CommonParamsModel commonParamsModel, List<PackageStatisticModel> list) {
        this.f20826a = commonParamsModel;
        this.f20827b = list;
    }
}
