package com.alipay.b.b.a.a;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class i implements HttpClient {

    /* renamed from: a  reason: collision with root package name */
    public static long f5265a = 160;

    /* renamed from: b  reason: collision with root package name */
    static final HttpRequestInterceptor f5266b = new j();

    /* renamed from: e  reason: collision with root package name */
    private static String[] f5267e = {"text/", "application/xml", "application/json"};

    /* renamed from: c  reason: collision with root package name */
    final HttpClient f5268c;

    /* renamed from: d  reason: collision with root package name */
    volatile b f5269d;

    /* renamed from: f  reason: collision with root package name */
    private RuntimeException f5270f = new IllegalStateException("AndroidHttpClient created and never closed");

    class a implements HttpRequestInterceptor {
        private a() {
        }

        /* synthetic */ a(i iVar, byte b2) {
            this();
        }

        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            String str;
            b bVar = i.this.f5269d;
            if (bVar != null && Log.isLoggable(bVar.f5272a, bVar.f5273b) && (httpRequest instanceof HttpUriRequest)) {
                RequestWrapper requestWrapper = (HttpUriRequest) httpRequest;
                StringBuilder sb = new StringBuilder();
                sb.append("curl ");
                for (Header header : requestWrapper.getAllHeaders()) {
                    if (!header.getName().equals("Authorization") && !header.getName().equals("Cookie")) {
                        sb.append("--header \"");
                        sb.append(header.toString().trim());
                        sb.append("\" ");
                    }
                }
                URI uri = requestWrapper.getURI();
                if (requestWrapper instanceof RequestWrapper) {
                    HttpUriRequest original = requestWrapper.getOriginal();
                    if (original instanceof HttpUriRequest) {
                        uri = original.getURI();
                    }
                }
                sb.append("\"");
                sb.append(uri);
                sb.append("\"");
                if (requestWrapper instanceof HttpEntityEnclosingRequest) {
                    HttpEntity entity = requestWrapper.getEntity();
                    if (entity != null && entity.isRepeatable()) {
                        if (entity.getContentLength() < 1024) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            entity.writeTo(byteArrayOutputStream);
                            if (i.a(requestWrapper)) {
                                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                                sb.insert(0, "echo '" + encodeToString + "' | base64 -d > /tmp/$$.bin; ");
                                str = " --data-binary @/tmp/$$.bin";
                            } else {
                                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                                sb.append(" --data-ascii \"");
                                sb.append(byteArrayOutputStream2);
                                str = "\"";
                            }
                        } else {
                            str = " [TOO MUCH DATA TO INCLUDE]";
                        }
                        sb.append(str);
                    }
                }
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f5272a;

        /* renamed from: b  reason: collision with root package name */
        final int f5273b;
    }

    i(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f5268c = new k(this, clientConnectionManager, httpParams);
    }

    static boolean a(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header value : headers) {
                if ("gzip".equalsIgnoreCase(value.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header : headers2) {
                for (String startsWith : f5267e) {
                    if (header.getValue().startsWith(startsWith)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return this.f5268c.execute(httpHost, httpRequest, responseHandler);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.f5268c.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return this.f5268c.execute(httpUriRequest, responseHandler);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.f5268c.execute(httpUriRequest, responseHandler, httpContext);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f5268c.execute(httpHost, httpRequest);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f5268c.execute(httpHost, httpRequest, httpContext);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f5268c.execute(httpUriRequest);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f5268c.execute(httpUriRequest, httpContext);
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.f5268c.getConnectionManager();
    }

    public final HttpParams getParams() {
        return this.f5268c.getParams();
    }
}
