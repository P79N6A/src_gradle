package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.v.b;
import java.io.IOException;

public class CallServerInterceptor<T> implements i, Interceptor, j {

    /* renamed from: a  reason: collision with root package name */
    a f21821a;

    /* renamed from: b  reason: collision with root package name */
    public Request f21822b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f21823c;

    /* renamed from: d  reason: collision with root package name */
    public Object f21824d;

    /* renamed from: e  reason: collision with root package name */
    private final p<T> f21825e;

    /* renamed from: f  reason: collision with root package name */
    private Throwable f21826f;
    private volatile boolean g;

    public final synchronized boolean a() {
        return this.g;
    }

    public final synchronized void b() {
        this.g = false;
    }

    public void doCollect() {
        if (this.f21821a instanceof i) {
            ((i) this.f21821a).doCollect();
        }
    }

    public Object getRequestInfo() {
        if (this.f21821a instanceof j) {
            ((j) this.f21821a).getRequestInfo();
        }
        return null;
    }

    public CallServerInterceptor(p<T> pVar) {
        this.f21825e = pVar;
    }

    public final SsResponse<T> a(Response response) throws IOException {
        if (response != null) {
            TypedInput body = response.getBody();
            int status = response.getStatus();
            if (status < 200 || status >= 300) {
                return SsResponse.error(body, response);
            }
            if (status == 204 || status == 205) {
                return SsResponse.success(null, response);
            }
            try {
                return SsResponse.success(this.f21825e.l.convert(body), response);
            } catch (RuntimeException e2) {
                throw e2;
            }
        } else {
            throw new IOException("SsResponse is null");
        }
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (!(chain.metrics() instanceof b)) {
            return a(chain);
        }
        b bVar = (b) chain.metrics();
        if (bVar.f75984e > 0) {
            bVar.a(bVar.g, SystemClock.uptimeMillis() - bVar.f75984e);
        }
        bVar.a(getClass().getSimpleName());
        bVar.f75984e = SystemClock.uptimeMillis();
        SsResponse a2 = a(chain);
        if (bVar.f75985f > 0) {
            bVar.a(getClass().getSimpleName(), SystemClock.uptimeMillis() - bVar.f75985f);
        }
        bVar.f75985f = SystemClock.uptimeMillis();
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.SsResponse a(com.bytedance.retrofit2.intercept.Interceptor.Chain r14) throws java.lang.Exception {
        /*
            r13 = this;
            com.bytedance.retrofit2.client.Request r0 = r14.request()
            r13.f21822b = r0
            monitor-enter(r13)
            boolean r0 = r13.g     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x0129
            r0 = 1
            r13.g = r0     // Catch:{ all -> 0x0131 }
            java.lang.Throwable r1 = r13.f21826f     // Catch:{ all -> 0x0131 }
            if (r1 == 0) goto L_0x0025
            java.lang.Throwable r14 = r13.f21826f     // Catch:{ all -> 0x0131 }
            boolean r14 = r14 instanceof java.io.IOException     // Catch:{ all -> 0x0131 }
            if (r14 == 0) goto L_0x001d
            java.lang.Throwable r14 = r13.f21826f     // Catch:{ all -> 0x0131 }
            java.io.IOException r14 = (java.io.IOException) r14     // Catch:{ all -> 0x0131 }
            throw r14     // Catch:{ all -> 0x0131 }
        L_0x001d:
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ all -> 0x0131 }
            java.lang.Throwable r0 = r13.f21826f     // Catch:{ all -> 0x0131 }
            r14.<init>(r0)     // Catch:{ all -> 0x0131 }
            throw r14     // Catch:{ all -> 0x0131 }
        L_0x0025:
            com.bytedance.retrofit2.client.Request r1 = r13.f21822b     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            com.bytedance.retrofit2.o r14 = r14.metrics()     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            r1.setMetrics(r14)     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            com.bytedance.retrofit2.client.Request r14 = r13.f21822b     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            com.bytedance.retrofit2.p<T> r1 = r13.f21825e     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            com.bytedance.retrofit2.client.Client$Provider r1 = r1.f21933c     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            com.bytedance.retrofit2.client.Client r1 = r1.get()     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            com.bytedance.retrofit2.client.a r14 = r1.newSsCall(r14)     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            r13.f21821a = r14     // Catch:{ IOException | RuntimeException -> 0x0125, Throwable -> 0x0115 }
            monitor-exit(r13)     // Catch:{ all -> 0x0131 }
            boolean r1 = r13.f21823c
            if (r1 == 0) goto L_0x0046
            r14.b()
        L_0x0046:
            com.bytedance.retrofit2.client.a r14 = r13.f21821a
            com.bytedance.retrofit2.client.Response r14 = com.bytedance.retrofit2.b.a(r13, r14)
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r13.f21824d
        L_0x0054:
            com.bytedance.retrofit2.client.Request r1 = (com.bytedance.retrofit2.client.Request) r1
            goto L_0x005a
        L_0x0057:
            com.bytedance.retrofit2.client.Request r1 = r13.f21822b
            goto L_0x0054
        L_0x005a:
            com.ss.android.ugc.aweme.feed.ag r2 = com.ss.android.ugc.aweme.feed.ag.i()
            boolean r2 = r2.f3142b
            r3 = 0
            if (r2 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.feed.ag r2 = com.ss.android.ugc.aweme.feed.ag.i()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r12 = 0
            r5[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.feed.ag.f3141a
            r8 = 0
            r9 = 40172(0x9cec, float:5.6293E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.retrofit2.client.Request> r6 = com.bytedance.retrofit2.client.Request.class
            r10[r12] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r2
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0099
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.feed.ag.f3141a
            r8 = 0
            r9 = 40172(0x9cec, float:5.6293E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.retrofit2.client.Request> r0 = com.bytedance.retrofit2.client.Request.class
            r10[r12] = r0
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00b1
        L_0x0099:
            long r5 = r2.r
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00b1
            java.lang.String r0 = r1.getPath()
            java.lang.String r5 = "/aweme/v1/feed/"
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00b1
            long r5 = android.os.SystemClock.uptimeMillis()
            r2.r = r5
        L_0x00b1:
            java.lang.Object r0 = r14.getExtraInfo()
            boolean r0 = r0 instanceof com.bytedance.frameworks.baselib.network.http.a
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r14.getExtraInfo()
            com.bytedance.frameworks.baselib.network.http.a r0 = (com.bytedance.frameworks.baselib.network.http.a) r0
            long r5 = r0.h
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r0 = r13.f21824d
        L_0x00cd:
            com.bytedance.retrofit2.client.Request r0 = (com.bytedance.retrofit2.client.Request) r0
            goto L_0x00d3
        L_0x00d0:
            com.bytedance.retrofit2.client.Request r0 = r13.f21822b
            goto L_0x00cd
        L_0x00d3:
            com.bytedance.retrofit2.o r2 = r0.getMetrics()
            boolean r2 = r2 instanceof com.ss.android.ugc.aweme.v.b
            if (r2 == 0) goto L_0x00f4
            com.bytedance.retrofit2.o r0 = r0.getMetrics()
            com.ss.android.ugc.aweme.v.b r0 = (com.ss.android.ugc.aweme.v.b) r0
            long r2 = android.os.SystemClock.uptimeMillis()
            com.bytedance.retrofit2.SsResponse r14 = r13.a((com.bytedance.retrofit2.client.Response) r14)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r2 = r4 - r2
            r0.h = r2
            r0.k = r4
            goto L_0x00f8
        L_0x00f4:
            com.bytedance.retrofit2.SsResponse r14 = r13.a((com.bytedance.retrofit2.client.Response) r14)
        L_0x00f8:
            if (r1 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.services.ApiMonitorService$Companion r0 = com.ss.android.ugc.aweme.services.ApiMonitorService.Companion
            com.ss.android.ugc.aweme.services.ApiMonitorService r0 = r0.getInstance()
            java.lang.String r2 = r1.getUrl()
            r0.checkApiFailedAndMonitor(r2, r14)
            com.ss.android.ugc.aweme.services.ApiMonitorService$Companion r0 = com.ss.android.ugc.aweme.services.ApiMonitorService.Companion
            com.ss.android.ugc.aweme.services.ApiMonitorService r0 = r0.getInstance()
            java.lang.String r1 = r1.getUrl()
            r0.addALog(r1, r14)
        L_0x0114:
            return r14
        L_0x0115:
            r14 = move-exception
            r13.f21826f = r14     // Catch:{ all -> 0x0131 }
            boolean r0 = r14 instanceof java.lang.Exception     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x011f
            java.lang.Exception r14 = (java.lang.Exception) r14     // Catch:{ all -> 0x0131 }
            throw r14     // Catch:{ all -> 0x0131 }
        L_0x011f:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x0131 }
            r0.<init>(r14)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ all -> 0x0131 }
        L_0x0125:
            r14 = move-exception
            r13.f21826f = r14     // Catch:{ all -> 0x0131 }
            throw r14     // Catch:{ all -> 0x0131 }
        L_0x0129:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = "Already executed."
            r14.<init>(r0)     // Catch:{ all -> 0x0131 }
            throw r14     // Catch:{ all -> 0x0131 }
        L_0x0131:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0131 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.CallServerInterceptor.a(com.bytedance.retrofit2.intercept.Interceptor$Chain):com.bytedance.retrofit2.SsResponse");
    }
}
