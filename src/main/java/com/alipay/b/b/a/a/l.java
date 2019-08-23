package com.alipay.b.b.a.a;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

public final class l extends DefaultRedirectHandler {

    /* renamed from: a  reason: collision with root package name */
    int f5275a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f5276b;

    l(k kVar) {
        this.f5276b = kVar;
    }

    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        this.f5275a++;
        boolean isRedirectRequested = l.super.isRedirectRequested(httpResponse, httpContext);
        if (!isRedirectRequested && this.f5275a < 5) {
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode == 301 || statusCode == 302) {
                return true;
            }
        }
        return isRedirectRequested;
    }
}
