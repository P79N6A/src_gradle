package com.bytedance.frameworks.baselib.network.http.cronet.a;

import com.bytedance.frameworks.baselib.network.http.a.b;
import java.io.IOException;

public final class a extends IOException {
    private com.bytedance.frameworks.baselib.network.http.a requestInfo;
    private int statusCode;
    private String traceCode;

    public final com.bytedance.frameworks.baselib.network.http.a getRequestInfo() {
        return this.requestInfo;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getTraceCode() {
        return this.traceCode;
    }

    public final String getRequestLog() {
        return this.requestInfo.v;
    }

    public a(Exception exc, com.bytedance.frameworks.baselib.network.http.a aVar, String str) {
        super(exc.getMessage(), exc.getCause());
        this.requestInfo = aVar;
        this.traceCode = str;
        if (exc instanceof b) {
            this.statusCode = ((b) exc).getStatusCode();
        }
    }
}
