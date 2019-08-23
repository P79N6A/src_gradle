package com.huawei.android.pushselfshow.utils.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import com.huawei.android.pushagent.utils.a.e;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static String f25381b = "PushSelfShowLog";

    /* renamed from: a  reason: collision with root package name */
    private Context f25382a;

    public d(Context context) {
        this.f25382a = context;
    }

    public String a() {
        String str = null;
        try {
            str = Build.VERSION.SDK_INT >= 11 ? System.getProperty("http.proxyHost") : Proxy.getHost(this.f25382a);
            String str2 = f25381b;
            e.b(str2, "proxyHost=" + str);
        } catch (Exception e2) {
            String str3 = f25381b;
            e.d(str3, "getProxyHost error:" + e2.getMessage());
        }
        return str;
    }

    public HttpResponse a(String str, HttpClient httpClient, HttpGet httpGet) {
        StringBuilder sb;
        String str2;
        String str3;
        try {
            HttpParams params = httpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 30000);
            HttpConnectionParams.setSoTimeout(params, 30000);
            HttpClientParams.setRedirecting(params, true);
            HttpProtocolParams.setUseExpectContinue(params, false);
            a((HttpRequest) httpGet, httpClient, str);
            return httpClient.execute(httpGet);
        } catch (SocketTimeoutException e2) {
            str2 = f25381b;
            sb = new StringBuilder("SocketTimeoutException occur");
            str3 = e2.getMessage();
            sb.append(str3);
            e.d(str2, sb.toString());
            return null;
        } catch (ClientProtocolException e3) {
            str2 = f25381b;
            sb = new StringBuilder("ClientProtocolException occur");
            str3 = e3.getMessage();
            sb.append(str3);
            e.d(str2, sb.toString());
            return null;
        } catch (IOException e4) {
            str2 = f25381b;
            sb = new StringBuilder("IOException occur");
            str3 = e4.getMessage();
            sb.append(str3);
            e.d(str2, sb.toString());
            return null;
        } catch (Exception e5) {
            str2 = f25381b;
            sb = new StringBuilder("Exception occur");
            str3 = e5.getMessage();
            sb.append(str3);
            e.d(str2, sb.toString());
            return null;
        }
    }

    public void a(HttpRequest httpRequest, HttpClient httpClient, String str) {
        httpRequest.setHeader("Accept-Encoding", "");
        String a2 = a();
        int b2 = b();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f25382a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0 && a2 != null && a2.length() > 0 && b2 != -1) {
            HttpParams params = httpClient.getParams();
            ConnRouteParams.setDefaultProxy(params, new HttpHost(a(), b()));
            httpRequest.setParams(params);
        }
    }

    public int b() {
        int i;
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                String property = System.getProperty("http.proxyPort");
                if (property == null) {
                    property = "-1";
                }
                i = Integer.parseInt(property);
            } else {
                i = Proxy.getPort(this.f25382a);
            }
            int i2 = i;
            String str = f25381b;
            e.b(str, "proxyPort=" + i2);
            return i2;
        } catch (Exception e2) {
            String str2 = f25381b;
            e.d(str2, "proxyPort error:" + e2.getMessage());
            return -1;
        }
    }
}
