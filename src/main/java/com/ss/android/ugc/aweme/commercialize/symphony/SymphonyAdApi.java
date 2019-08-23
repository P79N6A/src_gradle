package com.ss.android.ugc.aweme.commercialize.symphony;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Url;

public interface SymphonyAdApi {
    @GET
    Call<String> executeGet(@MaxLength int i, @Url String str);
}
