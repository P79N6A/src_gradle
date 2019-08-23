package com.cmic.sso.sdk.d;

import android.content.Context;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.cmic.sso.sdk.b.a.c;
import com.cmic.sso.sdk.b.a.e;
import com.cmic.sso.sdk.d.x;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f23056a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f23057b = "";

    /* renamed from: c  reason: collision with root package name */
    private int f23058c = 1;

    /* renamed from: d  reason: collision with root package name */
    private String f23059d;

    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, String str3);
    }

    /* access modifiers changed from: private */
    public void a(c cVar, Bundle bundle) {
        String a2 = v.a();
        String b2 = v.b();
        bundle.putString("ipv4List", a2);
        bundle.putString("ipv6List", b2);
        c.a c2 = cVar.c();
        if (!bundle.getBoolean("isCloseIpv4", false)) {
            c2.a(v.a());
        }
        if (!bundle.getBoolean("isCloseIpv6", true)) {
            c2.b(v.b());
        }
        c2.v(c2.w(bundle.getString("appkey")));
        cVar.a(c2);
    }

    private static void a(HttpsURLConnection httpsURLConnection, Bundle bundle, String str) throws Exception {
        if (bundle.getBoolean("CLOSE_CERT_VERIFY", true) || str.contains("https://config.cmpassport.com/client/uniConfig")) {
            X509TrustManager[] x509TrustManagerArr = {new X509TrustManager() {
                public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }};
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, x509TrustManagerArr, null);
                httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
            } catch (NoSuchAlgorithmException unused) {
            } catch (KeyManagementException unused2) {
            }
        } else {
            httpsURLConnection.setSSLSocketFactory(new com.cmic.sso.sdk.b.c.a().a().getSocketFactory());
        }
    }

    private <T extends e> void a(String str, T t, a aVar, String str2, Bundle bundle) {
        f.b("HttpUtils", "in  wifiNetwork");
        x a2 = x.a((Context) null);
        if (Build.VERSION.SDK_INT >= 21) {
            final String str3 = str;
            final T t2 = t;
            final Bundle bundle2 = bundle;
            final a aVar2 = aVar;
            final String str4 = str2;
            AnonymousClass2 r1 = new x.a() {
                private AtomicBoolean g = new AtomicBoolean(false);

                public void a(Network network) {
                    if (!this.g.getAndSet(true)) {
                        f.b("HttpUtils", "onAvailable");
                        String unused = d.this.f23057b = t.a();
                        if (str3.contains("getPrePhonescrip")) {
                            d.this.a((c) t2, bundle2);
                        }
                        d.this.a(str3, t2.b().toString(), aVar2, network, str4, bundle2);
                    }
                }
            };
            a2.a((x.a) r1);
            return;
        }
        int i = 0;
        x.f23094a.startUsingNetworkFeature(0, "enableHIPRI");
        while (i < 30) {
            try {
                if (x.f23094a.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                    break;
                }
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e2) {
                com.cmic.sso.sdk.c.a.f23036a.add(e2);
                f.a("HttpUtils", "check hipri failed");
            }
        }
        boolean requestRouteToHost = x.f23094a.requestRouteToHost(5, x.a(x.b(str)));
        f.a("HttpUtils", "切换数据网络结果 >>> " + requestRouteToHost);
        x.a((Context) null).a(requestRouteToHost);
        if (requestRouteToHost) {
            f.a("HttpUtils", "切换网络成功");
            this.f23057b = t.a();
            if (str.contains("getPrePhonescrip")) {
                a((c) t, bundle);
            }
            a(str, t.b().toString(), aVar, null, str2, bundle);
            return;
        }
        f.a("HttpUtils", "切换网络失败or无数据网络");
        aVar.a("102508", "数据网络切换失败", this.f23057b);
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.net.URLConnection] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r15, java.lang.String r16, com.cmic.sso.sdk.d.d.a r17, android.net.Network r18, java.lang.String r19, android.os.Bundle r20) {
        /*
            r14 = this;
            r11 = r14
            r8 = r15
            r6 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = r11.f23056a
            boolean r0 = com.cmic.sso.sdk.d.h.a(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "logReport"
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "uniConfig"
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            r1 = 0
            r2 = 1
            java.lang.String r0 = "HttpUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            java.lang.String r4 = "try "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0170 }
            int r4 = r11.f23058c     // Catch:{ Exception -> 0x0170 }
            r3.append(r4)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r4 = " http reqeust, url: "
            r3.append(r4)     // Catch:{ Exception -> 0x0170 }
            r3.append(r15)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0170 }
            com.cmic.sso.sdk.d.f.c(r0, r3)     // Catch:{ Exception -> 0x0170 }
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x0170 }
            r0.<init>(r15)     // Catch:{ Exception -> 0x0170 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0170 }
            r4 = 21
            if (r3 < r4) goto L_0x005c
            if (r6 == 0) goto L_0x005c
            java.net.URLConnection r0 = r6.openConnection(r0)     // Catch:{ Exception -> 0x0170 }
            r3 = r0
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = "HttpUtils"
            java.lang.String r1 = "is network null?不为空"
            com.cmic.sso.sdk.d.f.c(r0, r1)     // Catch:{ Exception -> 0x016b }
            goto L_0x006a
        L_0x005c:
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x0170 }
            r3 = r0
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = "HttpUtils"
            java.lang.String r1 = "is network null?为空"
            com.cmic.sso.sdk.d.f.c(r0, r1)     // Catch:{ Exception -> 0x016b }
        L_0x006a:
            r5 = r3
            java.lang.String r0 = "https"
            boolean r0 = r15.startsWith(r0)     // Catch:{ Exception -> 0x0167 }
            if (r0 == 0) goto L_0x0079
            r0 = r5
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ Exception -> 0x0167 }
            a((javax.net.ssl.HttpsURLConnection) r0, (android.os.Bundle) r10, (java.lang.String) r15)     // Catch:{ Exception -> 0x0167 }
        L_0x0079:
            r0 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0167 }
            r5.setReadTimeout(r0)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "traceId"
            java.lang.String r1 = r11.f23056a     // Catch:{ Exception -> 0x0167 }
            r5.addRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0167 }
            if (r10 == 0) goto L_0x00a4
            java.lang.String r0 = "appid"
            java.lang.String r1 = "appid"
            java.lang.String r3 = ""
            java.lang.String r1 = r10.getString(r1, r3)     // Catch:{ Exception -> 0x0167 }
            r5.addRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "interfaceVersion"
            java.lang.String r1 = "interfaceVersion"
            java.lang.String r3 = ""
            java.lang.String r1 = r10.getString(r1, r3)     // Catch:{ Exception -> 0x0167 }
            r5.addRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0167 }
        L_0x00a4:
            java.lang.String r0 = "sdkVersion"
            java.lang.String r1 = "quick_login_android_9.0.6.1"
            r5.addRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0167 }
            r0 = 0
            r5.setUseCaches(r0)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = "application/json"
            r5.setRequestProperty(r1, r3)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r1 = "preGetMobile"
            boolean r1 = r15.contains(r1)     // Catch:{ Exception -> 0x0167 }
            if (r1 == 0) goto L_0x00c5
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded "
            r5.setRequestProperty(r1, r3)     // Catch:{ Exception -> 0x0167 }
        L_0x00c5:
            java.lang.String r1 = "getPrePhonescrip"
            boolean r1 = r15.contains(r1)     // Catch:{ Exception -> 0x0167 }
            if (r1 == 0) goto L_0x00d4
            java.lang.String r1 = "defendEOF"
            java.lang.String r3 = "1"
            r5.setRequestProperty(r1, r3)     // Catch:{ Exception -> 0x0167 }
        L_0x00d4:
            java.lang.String r1 = "Charset"
            java.lang.String r3 = "UTF-8"
            r5.setRequestProperty(r1, r3)     // Catch:{ Exception -> 0x0167 }
            r5.setDoInput(r2)     // Catch:{ Exception -> 0x0167 }
            r5.setInstanceFollowRedirects(r0)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r1 = "POST"
            boolean r1 = r9.equals(r1)     // Catch:{ Exception -> 0x0167 }
            if (r1 == 0) goto L_0x010d
            java.lang.String r1 = "POST"
            r5.setRequestMethod(r1)     // Catch:{ Exception -> 0x0167 }
            r5.setDoOutput(r2)     // Catch:{ Exception -> 0x0167 }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0167 }
            java.io.OutputStream r3 = r5.getOutputStream()     // Catch:{ Exception -> 0x0167 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r3 = "UTF-8"
            r7 = r16
            byte[] r3 = r7.getBytes(r3)     // Catch:{ Exception -> 0x0165 }
            int r4 = r3.length     // Catch:{ Exception -> 0x0165 }
            r1.write(r3, r0, r4)     // Catch:{ Exception -> 0x0165 }
            r1.flush()     // Catch:{ Exception -> 0x0165 }
            r1.close()     // Catch:{ Exception -> 0x0165 }
            goto L_0x011c
        L_0x010d:
            r7 = r16
            java.lang.String r0 = "GET"
            boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x0165 }
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "GET"
            r5.setRequestMethod(r0)     // Catch:{ Exception -> 0x0165 }
        L_0x011c:
            int r3 = r5.getResponseCode()     // Catch:{ Exception -> 0x0165 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0165 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0165 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ Exception -> 0x0165 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0165 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0165 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0165 }
            java.lang.String r4 = ""
            r1.<init>(r4)     // Catch:{ Exception -> 0x0165 }
        L_0x0135:
            java.lang.String r4 = r0.readLine()     // Catch:{ Exception -> 0x0165 }
            if (r4 == 0) goto L_0x014a
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x0165 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0165 }
            java.lang.String r13 = "utf-8"
            r12.<init>(r4, r13)     // Catch:{ Exception -> 0x0165 }
            r1.append(r12)     // Catch:{ Exception -> 0x0165 }
            goto L_0x0135
        L_0x014a:
            r0.close()     // Catch:{ Exception -> 0x0165 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0165 }
            r5.disconnect()     // Catch:{ Exception -> 0x0165 }
            r1 = r14
            r2 = r0
            r4 = r17
            r6 = r18
            r7 = r16
            r8 = r15
            r9 = r19
            r10 = r20
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0165:
            r0 = move-exception
            goto L_0x0174
        L_0x0167:
            r0 = move-exception
            r7 = r16
            goto L_0x0174
        L_0x016b:
            r0 = move-exception
            r7 = r16
            r5 = r3
            goto L_0x0174
        L_0x0170:
            r0 = move-exception
            r7 = r16
            r5 = r1
        L_0x0174:
            boolean r1 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 != 0) goto L_0x017c
            boolean r1 = r0 instanceof java.security.cert.CertPathValidatorException
            if (r1 == 0) goto L_0x0181
        L_0x017c:
            java.lang.String r1 = "isNeedToGetCert"
            r10.putBoolean(r1, r2)
        L_0x0181:
            if (r5 == 0) goto L_0x0186
            r5.disconnect()
        L_0x0186:
            java.util.ArrayList<java.lang.Throwable> r1 = com.cmic.sso.sdk.c.a.f23036a
            r1.add(r0)
            boolean r0 = r0 instanceof java.io.EOFException
            if (r0 == 0) goto L_0x01ab
            r2 = 0
            java.lang.String r0 = "200050"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r0.intValue()
            r5 = 0
            r1 = r14
            r4 = r17
            r6 = r18
            r7 = r16
            r8 = r15
            r9 = r19
            r10 = r20
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x01ab:
            r2 = 0
            r3 = -1
            r5 = 0
            r1 = r14
            r4 = r17
            r6 = r18
            r7 = r16
            r8 = r15
            r9 = r19
            r10 = r20
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.d.d.a(java.lang.String, java.lang.String, com.cmic.sso.sdk.d.d$a, android.net.Network, java.lang.String, android.os.Bundle):void");
    }

    public <T extends e> void a(String str, T t, boolean z, a aVar, String str2, String str3, Bundle bundle) {
        this.f23056a = str3;
        if (!h.a(str3) || str.contains("logReport") || str.contains("uniConfig")) {
            f.c("HttpUtils", "使用wifi下取号？？？？？？？" + z);
            if (z) {
                a(str, t, aVar, str2, bundle);
                return;
            }
            if (str.contains("getPrePhonescrip")) {
                a((c) t, bundle);
            }
            a(str, t.b().toString(), aVar, null, str2, bundle);
        }
    }

    private void a(String str, int i, a aVar, HttpURLConnection httpURLConnection, Network network, String str2, String str3, String str4, Bundle bundle) {
        String str5;
        String str6 = str;
        int i2 = i;
        a aVar2 = aVar;
        HttpURLConnection httpURLConnection2 = httpURLConnection;
        Bundle bundle2 = bundle;
        if (i2 == 302 || i2 == 301) {
            if (TextUtils.isEmpty(bundle2.getString("interfaceCode", ""))) {
                bundle2.putString("interfaceCode", String.valueOf(i));
            } else {
                bundle2.putString("interfaceCode", bundle2.getString("interfaceCode") + ";" + String.valueOf(i));
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (this.f23059d == null) {
                this.f23059d = httpURLConnection.getHeaderField("pplocation");
            }
            if (!TextUtils.isEmpty(headerField)) {
                if (TextUtils.isEmpty(bundle2.getString("interfaceType", ""))) {
                    if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(bundle2.getString("operatortype", PushConstants.PUSH_TYPE_NOTIFY))) {
                        bundle2.putString("interfaceType", "getUnicomMobile");
                    } else {
                        bundle2.putString("interfaceType", "getTelecomMobile");
                    }
                } else if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(bundle2.getString("operatortype", PushConstants.PUSH_TYPE_NOTIFY))) {
                    bundle2.putString("interfaceType", bundle2.getString("interfaceType") + ";getUnicomMobile");
                } else {
                    bundle2.putString("interfaceType", bundle2.getString("interfaceType") + ";getTelecomMobile");
                }
                a(headerField, "", aVar, network, "GET", bundle);
            } else {
                aVar.a("200038", "电信重定向失败", this.f23057b);
            }
        } else if (i2 != 200) {
            try {
                f.a("HttpUtils", "http response code is not 200 ---" + i);
                this.f23058c = this.f23058c + 1;
                if (this.f23058c <= 3) {
                    if (!h.a(this.f23056a)) {
                        String str7 = str3;
                    } else if (str3.contains("logReport")) {
                    }
                    a(str3, str2, aVar, network, str4, bundle);
                    return;
                }
                if (i2 == 0) {
                    aVar.a(i, "请求出错", this.f23057b);
                } else if (i2 == Integer.valueOf("200050").intValue()) {
                    aVar.a("200050", "EOF异常", this.f23057b);
                } else if (i2 == Integer.valueOf("102507").intValue()) {
                    aVar.a(i, str, this.f23057b);
                } else {
                    if (TextUtils.isEmpty(str)) {
                        str5 = "网络异常";
                    } else {
                        str5 = str6;
                    }
                    aVar.a("102102", str5, this.f23057b);
                }
            } catch (Exception e2) {
                com.cmic.sso.sdk.c.a.f23036a.add(e2);
                if (TextUtils.isEmpty(str)) {
                    str6 = "网络异常";
                }
                aVar.a("102102", str6, this.f23057b);
            }
        } else {
            if (!TextUtils.isEmpty(this.f23059d)) {
                try {
                    f.b("HttpUtils", "电信取号结果 = " + str);
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("result", PushConstants.PUSH_TYPE_NOTIFY);
                    if (TextUtils.isEmpty(bundle2.getString("interfaceCode", ""))) {
                        bundle2.putString("interfaceCode", optString);
                    } else {
                        bundle2.putString("interfaceCode", bundle2.getString("interfaceCode") + ";" + optString);
                    }
                    if (PushConstants.PUSH_TYPE_NOTIFY.equals(optString)) {
                        f.c("HttpUtils", "pplocation" + this.f23059d);
                        String str8 = "http://www.cmpassport.com/unisdk/" + this.f23059d + "&data=" + jSONObject.getString("data");
                        if (TextUtils.isEmpty(bundle2.getString("interfaceType", ""))) {
                            bundle2.putString("interfaceType", "getNewTelecomPhoneNumberNotify");
                        } else {
                            bundle2.putString("interfaceType", bundle2.getString("interfaceType") + ";getNewTelecomPhoneNumberNotify");
                        }
                        this.f23059d = null;
                        f.c("HttpUtils", "location" + str8);
                        a(str8, "", aVar, network, "GET", bundle);
                    } else {
                        aVar.a("200039" + optString, jSONObject.optString("msg"), this.f23057b);
                    }
                } catch (JSONException e3) {
                    com.cmic.sso.sdk.c.a.f23036a.add(e3);
                    aVar.a("200039", "电信取号接口失败", this.f23057b);
                }
            } else {
                aVar.a(str, this.f23057b);
            }
        }
    }
}
