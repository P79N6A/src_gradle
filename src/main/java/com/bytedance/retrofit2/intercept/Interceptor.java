package com.bytedance.retrofit2.intercept;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.o;

public interface Interceptor {

    public interface Chain {
        Call call();

        o metrics();

        SsResponse proceed(Request request) throws Exception;

        Request request();
    }

    SsResponse intercept(Chain chain) throws Exception;
}
