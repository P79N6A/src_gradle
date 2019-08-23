package com.ss.android.ugc.aweme.flow.manager.impl;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Url;

public interface IMobileFlowApi {
    @GET
    Call<a> getPassCode(@Url String str);
}
