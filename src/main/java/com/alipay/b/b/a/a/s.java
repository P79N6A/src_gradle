package com.alipay.b.b.a.a;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.security.Security;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.HttpVersion;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

public final class s implements f {

    /* renamed from: a  reason: collision with root package name */
    static s f5286a;
    private static final ThreadFactory i = new u();

    /* renamed from: b  reason: collision with root package name */
    Context f5287b;

    /* renamed from: c  reason: collision with root package name */
    public i f5288c;

    /* renamed from: d  reason: collision with root package name */
    long f5289d;

    /* renamed from: e  reason: collision with root package name */
    long f5290e;

    /* renamed from: f  reason: collision with root package name */
    long f5291f;
    int g;
    private ThreadPoolExecutor h;

    static final synchronized s a(Context context) {
        synchronized (s.class) {
            if (f5286a != null) {
                s sVar = f5286a;
                return sVar;
            }
            s sVar2 = new s(context);
            f5286a = sVar2;
            return sVar2;
        }
    }

    public final Future<ab> a(aa aaVar) {
        if (z.a(this.f5287b)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.h.getActiveCount());
            objArr[1] = Long.valueOf(this.h.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.h.getTaskCount());
            long j = 0;
            objArr[3] = Long.valueOf(this.f5291f == 0 ? 0 : ((this.f5289d * 1000) / this.f5291f) >> 10);
            if (this.g != 0) {
                j = this.f5290e / ((long) this.g);
            }
            objArr[4] = Long.valueOf(j);
            objArr[5] = Long.valueOf(this.f5289d);
            objArr[6] = Long.valueOf(this.f5290e);
            objArr[7] = Long.valueOf(this.f5291f);
            objArr[8] = Integer.valueOf(this.g);
            String.format(str, objArr);
        }
        x xVar = new x(this, (v) aaVar);
        t tVar = new t(this, xVar, xVar);
        this.h.execute(tVar);
        return tVar;
    }

    private s(Context context) {
        this.f5287b = context;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, "android");
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, null), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        this.f5288c = new i(threadSafeClientConnManager, basicHttpParams);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3, TimeUnit.SECONDS, new ArrayBlockingQueue(20), i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.h = threadPoolExecutor;
        try {
            this.h.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f5287b);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}
