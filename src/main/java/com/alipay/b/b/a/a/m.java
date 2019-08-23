package com.alipay.b.b.a.a;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

public final class m implements ConnectionKeepAliveStrategy {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f5277a;

    m(k kVar) {
        this.f5277a = kVar;
    }

    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000;
    }
}
