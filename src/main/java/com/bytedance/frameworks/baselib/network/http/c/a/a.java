package com.bytedance.frameworks.baselib.network.http.c.a;

import okhttp3.Request;
import okhttp3.Response;

public interface a {
    void a(Request request, Exception exc);

    void a(Request request, Response response);
}
