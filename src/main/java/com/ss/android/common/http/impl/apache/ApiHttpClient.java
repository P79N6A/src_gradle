package com.ss.android.common.http.impl.apache;

import android.webkit.CookieManager;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

public class ApiHttpClient extends DefaultHttpClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    final CookieManager mCookieMgr;

    class a implements HttpRequestInterceptor, HttpResponseInterceptor {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28304a;

        a() {
        }

        private HttpHost a(HttpRequest httpRequest, HttpHost httpHost) {
            HttpHost httpHost2;
            HttpRequest httpRequest2 = httpRequest;
            if (PatchProxy.isSupport(new Object[]{httpRequest2, httpHost}, this, f28304a, false, 15768, new Class[]{HttpRequest.class, HttpHost.class}, HttpHost.class)) {
                return (HttpHost) PatchProxy.accessDispatch(new Object[]{httpRequest2, httpHost}, this, f28304a, false, 15768, new Class[]{HttpRequest.class, HttpHost.class}, HttpHost.class);
            } else if (!NetworkUtils.getUseDnsMapping()) {
                return httpHost;
            } else {
                try {
                    if ("https".equals(httpHost.getSchemeName())) {
                        return httpHost;
                    }
                    Header firstHeader = httpRequest2.getFirstHeader("Host");
                    String str = null;
                    if (firstHeader != null) {
                        str = firstHeader.getValue();
                    }
                    if (!StringUtils.isEmpty(str) && str.indexOf(58) < 0) {
                        httpHost2 = new HttpHost(str);
                        return httpHost2;
                    }
                    httpHost2 = httpHost;
                    return httpHost2;
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void process(org.apache.http.HttpRequest r11, org.apache.http.protocol.HttpContext r12) throws org.apache.http.HttpException, java.io.IOException {
            /*
                r10 = this;
                r7 = 2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r11
                r9 = 1
                r0[r9] = r12
                com.meituan.robust.ChangeQuickRedirect r2 = f28304a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<org.apache.http.HttpRequest> r1 = org.apache.http.HttpRequest.class
                r5[r8] = r1
                java.lang.Class<org.apache.http.protocol.HttpContext> r1 = org.apache.http.protocol.HttpContext.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 15766(0x3d96, float:2.2093E-41)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003d
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r11
                r0[r9] = r12
                com.meituan.robust.ChangeQuickRedirect r2 = f28304a
                r3 = 0
                r4 = 15766(0x3d96, float:2.2093E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<org.apache.http.HttpRequest> r1 = org.apache.http.HttpRequest.class
                r5[r8] = r1
                java.lang.Class<org.apache.http.protocol.HttpContext> r1 = org.apache.http.protocol.HttpContext.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003d:
                if (r11 == 0) goto L_0x00e9
                if (r12 != 0) goto L_0x0043
                goto L_0x00e9
            L_0x0043:
                java.lang.String r0 = "http.connection"
                java.lang.Object r0 = r12.getAttribute(r0)     // Catch:{ Exception -> 0x0064 }
                boolean r1 = r0 instanceof org.apache.http.HttpInetConnection     // Catch:{ Exception -> 0x0064 }
                if (r1 == 0) goto L_0x0064
                org.apache.http.HttpInetConnection r0 = (org.apache.http.HttpInetConnection) r0     // Catch:{ Exception -> 0x0064 }
                java.net.InetAddress r0 = r0.getRemoteAddress()     // Catch:{ Exception -> 0x0064 }
                java.lang.String r0 = r0.getHostAddress()     // Catch:{ Exception -> 0x0064 }
                if (r0 == 0) goto L_0x0064
                int r1 = r0.length()     // Catch:{ Exception -> 0x0064 }
                if (r1 <= 0) goto L_0x0064
                java.lang.String r1 = "x-snssdk.remoteaddr"
                r12.setAttribute(r1, r0)     // Catch:{ Exception -> 0x0064 }
            L_0x0064:
                java.lang.String r0 = "http.target_host"
                java.lang.Object r0 = r12.getAttribute(r0)
                org.apache.http.HttpHost r0 = (org.apache.http.HttpHost) r0
                if (r0 != 0) goto L_0x006f
                return
            L_0x006f:
                r1 = 0
                r0.getHostName()     // Catch:{ Exception -> 0x0097 }
                boolean r2 = r11 instanceof org.apache.http.client.methods.HttpUriRequest     // Catch:{ Exception -> 0x0097 }
                if (r2 == 0) goto L_0x007f
                r2 = r11
                org.apache.http.client.methods.HttpUriRequest r2 = (org.apache.http.client.methods.HttpUriRequest) r2     // Catch:{ Exception -> 0x0097 }
                java.net.URI r2 = r2.getURI()     // Catch:{ Exception -> 0x0097 }
                goto L_0x008c
            L_0x007f:
                java.net.URI r2 = new java.net.URI     // Catch:{ Exception -> 0x0097 }
                org.apache.http.RequestLine r3 = r11.getRequestLine()     // Catch:{ Exception -> 0x0097 }
                java.lang.String r3 = r3.getUri()     // Catch:{ Exception -> 0x0097 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0097 }
            L_0x008c:
                if (r2 == 0) goto L_0x0097
                org.apache.http.HttpHost r0 = r10.a(r11, r0)     // Catch:{ Exception -> 0x0097 }
                java.net.URI r0 = org.apache.http.client.utils.URIUtils.rewriteURI(r2, r0, r9)     // Catch:{ Exception -> 0x0097 }
                goto L_0x0098
            L_0x0097:
                r0 = r1
            L_0x0098:
                if (r0 == 0) goto L_0x009e
                java.lang.String r1 = r0.toString()
            L_0x009e:
                if (r1 != 0) goto L_0x00a1
                return
            L_0x00a1:
                com.ss.android.common.http.impl.apache.ApiHttpClient r0 = com.ss.android.common.http.impl.apache.ApiHttpClient.this
                android.webkit.CookieManager r0 = r0.mCookieMgr
                java.util.List r0 = com.ss.android.common.util.NetworkUtils.getShareCookie(r0, r1)
                com.ss.android.common.http.impl.apache.ApiHttpClient r2 = com.ss.android.common.http.impl.apache.ApiHttpClient.this
                android.webkit.CookieManager r2 = r2.mCookieMgr
                java.lang.String r1 = r2.getCookie(r1)
                com.bytedance.common.utility.Logger.debug()
                boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r0)
                if (r2 != 0) goto L_0x00d8
                java.util.Iterator r0 = r0.iterator()
            L_0x00be:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x00d8
                java.lang.Object r2 = r0.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r3 = "Cookie"
                r11.addHeader(r3, r2)
                java.lang.String r3 = "X-SS-Cookie"
                r11.addHeader(r3, r2)
                com.bytedance.common.utility.Logger.debug()
                goto L_0x00be
            L_0x00d8:
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L_0x00e8
                java.lang.String r0 = "Cookie"
                r11.addHeader(r0, r1)
                java.lang.String r0 = "X-SS-Cookie"
                r11.addHeader(r0, r1)
            L_0x00e8:
                return
            L_0x00e9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.http.impl.apache.ApiHttpClient.a.process(org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void process(org.apache.http.HttpResponse r11, org.apache.http.protocol.HttpContext r12) throws org.apache.http.HttpException, java.io.IOException {
            /*
                r10 = this;
                r7 = 2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r11
                r9 = 1
                r0[r9] = r12
                com.meituan.robust.ChangeQuickRedirect r2 = f28304a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<org.apache.http.HttpResponse> r1 = org.apache.http.HttpResponse.class
                r5[r8] = r1
                java.lang.Class<org.apache.http.protocol.HttpContext> r1 = org.apache.http.protocol.HttpContext.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 15767(0x3d97, float:2.2094E-41)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003d
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r11
                r0[r9] = r12
                com.meituan.robust.ChangeQuickRedirect r2 = f28304a
                r3 = 0
                r4 = 15767(0x3d97, float:2.2094E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<org.apache.http.HttpResponse> r1 = org.apache.http.HttpResponse.class
                r5[r8] = r1
                java.lang.Class<org.apache.http.protocol.HttpContext> r1 = org.apache.http.protocol.HttpContext.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003d:
                if (r11 == 0) goto L_0x00bd
                if (r12 != 0) goto L_0x0043
                goto L_0x00bd
            L_0x0043:
                r0 = 0
                java.lang.String r1 = "http.target_host"
                java.lang.Object r1 = r12.getAttribute(r1)     // Catch:{ Exception -> 0x007e }
                org.apache.http.HttpHost r1 = (org.apache.http.HttpHost) r1     // Catch:{ Exception -> 0x007e }
                if (r1 != 0) goto L_0x004f
                return
            L_0x004f:
                r1.getHostName()     // Catch:{ Exception -> 0x007e }
                java.lang.String r2 = "http.request"
                java.lang.Object r2 = r12.getAttribute(r2)     // Catch:{ Exception -> 0x007e }
                org.apache.http.HttpRequest r2 = (org.apache.http.HttpRequest) r2     // Catch:{ Exception -> 0x007e }
                boolean r3 = r2 instanceof org.apache.http.client.methods.HttpUriRequest     // Catch:{ Exception -> 0x007e }
                if (r3 == 0) goto L_0x0066
                r3 = r2
                org.apache.http.client.methods.HttpUriRequest r3 = (org.apache.http.client.methods.HttpUriRequest) r3     // Catch:{ Exception -> 0x007e }
                java.net.URI r3 = r3.getURI()     // Catch:{ Exception -> 0x007e }
                goto L_0x0073
            L_0x0066:
                java.net.URI r3 = new java.net.URI     // Catch:{ Exception -> 0x007e }
                org.apache.http.RequestLine r4 = r2.getRequestLine()     // Catch:{ Exception -> 0x007e }
                java.lang.String r4 = r4.getUri()     // Catch:{ Exception -> 0x007e }
                r3.<init>(r4)     // Catch:{ Exception -> 0x007e }
            L_0x0073:
                if (r3 == 0) goto L_0x007e
                org.apache.http.HttpHost r1 = r10.a(r2, r1)     // Catch:{ Exception -> 0x007e }
                java.net.URI r1 = org.apache.http.client.utils.URIUtils.rewriteURI(r3, r1, r9)     // Catch:{ Exception -> 0x007e }
                goto L_0x007f
            L_0x007e:
                r1 = r0
            L_0x007f:
                if (r1 == 0) goto L_0x0085
                java.lang.String r0 = r1.toString()
            L_0x0085:
                if (r0 != 0) goto L_0x0088
                return
            L_0x0088:
                com.bytedance.common.utility.Logger.debug()
                java.lang.String[] r1 = new java.lang.String[r7]
                java.lang.String r2 = "Set-Cookie"
                r1[r8] = r2
                java.lang.String r2 = "X-SS-Set-Cookie"
                r1[r9] = r2
            L_0x0095:
                if (r8 >= r7) goto L_0x00bc
                r2 = r1[r8]
                org.apache.http.HeaderIterator r2 = r11.headerIterator(r2)
            L_0x009d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00b9
                org.apache.http.Header r3 = r2.nextHeader()
                r3.getValue()
                com.ss.android.common.http.impl.apache.ApiHttpClient r4 = com.ss.android.common.http.impl.apache.ApiHttpClient.this
                android.webkit.CookieManager r4 = r4.mCookieMgr
                java.lang.String r3 = r3.getValue()
                r4.setCookie(r0, r3)
                com.bytedance.common.utility.Logger.debug()
                goto L_0x009d
            L_0x00b9:
                int r8 = r8 + 1
                goto L_0x0095
            L_0x00bc:
                return
            L_0x00bd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.http.impl.apache.ApiHttpClient.a.process(org.apache.http.HttpResponse, org.apache.http.protocol.HttpContext):void");
        }
    }

    public HttpContext createHttpContext() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15764, new Class[0], HttpContext.class)) {
            return (HttpContext) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15764, new Class[0], HttpContext.class);
        }
        HttpContext createHttpContext = ApiHttpClient.super.createHttpContext();
        if (createHttpContext != null) {
            createHttpContext.removeAttribute("http.cookie-store");
        }
        return createHttpContext;
    }

    public BasicHttpProcessor createHttpProcessor() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15765, new Class[0], BasicHttpProcessor.class)) {
            return (BasicHttpProcessor) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15765, new Class[0], BasicHttpProcessor.class);
        }
        BasicHttpProcessor createHttpProcessor = ApiHttpClient.super.createHttpProcessor();
        if (this.mCookieMgr != null) {
            a aVar = new a();
            createHttpProcessor.addRequestInterceptor(aVar);
            createHttpProcessor.addResponseInterceptor(aVar);
        }
        return createHttpProcessor;
    }

    public ApiHttpClient(HttpParams httpParams, CookieManager cookieManager) {
        super(httpParams);
        this.mCookieMgr = cookieManager;
    }

    public ApiHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams, CookieManager cookieManager) {
        super(clientConnectionManager, httpParams);
        this.mCookieMgr = cookieManager;
    }
}
