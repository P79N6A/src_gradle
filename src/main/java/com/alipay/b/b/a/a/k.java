package com.alipay.b.b.a.a;

import com.alipay.b.b.a.a.i;
import org.apache.http.client.RedirectHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

public final class k extends DefaultHttpClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f5274a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(i iVar, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
        this.f5274a = iVar;
    }

    /* access modifiers changed from: protected */
    public final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new m(this);
    }

    /* access modifiers changed from: protected */
    public final HttpContext createHttpContext() {
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    /* access modifiers changed from: protected */
    public final RedirectHandler createRedirectHandler() {
        return new l(this);
    }

    /* access modifiers changed from: protected */
    public final BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = k.super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(i.f5266b);
        createHttpProcessor.addRequestInterceptor(new i.a(this.f5274a, (byte) 0));
        return createHttpProcessor;
    }
}
