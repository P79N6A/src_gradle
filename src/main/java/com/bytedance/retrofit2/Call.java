package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Request;

public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(c<T> cVar);

    SsResponse<T> execute() throws Exception;

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
