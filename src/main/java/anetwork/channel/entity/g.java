package anetwork.channel.entity;

import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.c;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.Utils;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.util.a;
import java.util.HashMap;
import java.util.Map;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public int f1547a;

    /* renamed from: b  reason: collision with root package name */
    public RequestStatistic f1548b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1549c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1550d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1551e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1552f;
    private ParcelableRequest g;
    private Request h;
    private int i;
    private int j;
    private final boolean k;

    public Request a() {
        return this.h;
    }

    public boolean c() {
        return this.k;
    }

    public HttpUrl f() {
        return this.h.getHttpUrl();
    }

    public String g() {
        return this.h.getUrlString();
    }

    public Map<String, String> h() {
        return this.h.getHeaders();
    }

    public int b() {
        return this.f1550d * (this.j + 1);
    }

    public boolean d() {
        if (this.f1547a < this.j) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return "true".equals(this.g.getExtProperty("CheckContentLength"));
    }

    public void k() {
        this.f1547a++;
        this.f1548b.retryTimes = this.f1547a;
    }

    public boolean i() {
        if (!"false".equalsIgnoreCase(this.g.getExtProperty("EnableCookie"))) {
            return true;
        }
        return false;
    }

    private HttpUrl l() {
        HttpUrl parse = HttpUrl.parse(this.g.url);
        if (parse != null) {
            if (!NetworkConfigCenter.isSSLEnabled()) {
                parse.downgradeSchemeAndLock();
            } else if ("false".equalsIgnoreCase(this.g.getExtProperty("EnableSchemeReplace"))) {
                parse.lockScheme();
            }
            return parse;
        }
        throw new IllegalArgumentException("url is invalid. url=" + this.g.url);
    }

    public boolean e() {
        if (!NetworkConfigCenter.isHttpSessionEnable() || "false".equalsIgnoreCase(this.g.getExtProperty("EnableHttpDns")) || (!NetworkConfigCenter.isAllowHttpIpRetry() && this.f1547a != 0)) {
            return false;
        }
        return true;
    }

    public String a(String str) {
        return this.g.getExtProperty(str);
    }

    public void a(Request request) {
        this.h = request;
    }

    public void a(HttpUrl httpUrl) {
        ALog.i("anet.RequestConfig", "redirect", this.f1551e, "to url", httpUrl.toString());
        this.i++;
        this.f1548b.url = httpUrl.simpleUrlString();
        this.h = b(httpUrl);
    }

    private Request b(HttpUrl httpUrl) {
        Request.Builder requestStatistic = new Request.Builder().setUrl(httpUrl).setMethod(this.g.method).setBody(this.g.bodyEntry).setReadTimeout(this.f1550d).setConnectTimeout(this.f1549c).setRedirectEnable(this.g.allowRedirect).setRedirectTimes(this.i).setBizId(this.g.bizId).setSeq(this.f1551e).setRequestStatistic(this.f1548b);
        requestStatistic.setParams(this.g.params);
        if (this.g.charset != null) {
            requestStatistic.setCharset(this.g.charset);
        }
        requestStatistic.setHeaders(c(httpUrl));
        return requestStatistic.build();
    }

    private Map<String, String> c(HttpUrl httpUrl) {
        String host = httpUrl.host();
        boolean z = !c.a(host);
        if (host.length() > 2 && host.charAt(0) == '[' && host.charAt(host.length() - 1) == ']' && c.b(host.substring(1, host.length() - 1))) {
            z = false;
        }
        HashMap hashMap = new HashMap();
        if (this.g.headers != null) {
            for (Map.Entry next : this.g.headers.entrySet()) {
                String str = (String) next.getKey();
                if (!"Host".equalsIgnoreCase(str) && !":host".equalsIgnoreCase(str)) {
                    boolean equalsIgnoreCase = "true".equalsIgnoreCase(this.g.getExtProperty("KeepCustomCookie"));
                    if (!"Cookie".equalsIgnoreCase(str) || equalsIgnoreCase) {
                        hashMap.put(str, next.getValue());
                    }
                } else if (!z) {
                    hashMap.put("Host", next.getValue());
                }
            }
        }
        return hashMap;
    }

    public g(ParcelableRequest parcelableRequest, int i2, boolean z) {
        String str;
        int i3;
        int i4;
        int i5;
        if (parcelableRequest != null) {
            this.g = parcelableRequest;
            this.f1552f = i2;
            this.k = z;
            String str2 = parcelableRequest.seqNo;
            if (this.f1552f == 0) {
                str = "HTTP";
            } else {
                str = "DGRD";
            }
            this.f1551e = a.a(str2, str);
            if (parcelableRequest.connectTimeout <= 0) {
                i3 = (int) (Utils.getNetworkTimeFactor() * 12000.0f);
            } else {
                i3 = parcelableRequest.connectTimeout;
            }
            this.f1549c = i3;
            if (parcelableRequest.readTimeout <= 0) {
                i4 = (int) (Utils.getNetworkTimeFactor() * 12000.0f);
            } else {
                i4 = parcelableRequest.readTimeout;
            }
            this.f1550d = i4;
            if (parcelableRequest.retryTime < 0 || parcelableRequest.retryTime > 3) {
                i5 = 2;
            } else {
                i5 = parcelableRequest.retryTime;
            }
            this.j = i5;
            HttpUrl l = l();
            this.f1548b = new RequestStatistic(l.host(), String.valueOf(parcelableRequest.bizId));
            this.f1548b.url = l.simpleUrlString();
            this.h = b(l);
            return;
        }
        throw new IllegalArgumentException("request is null");
    }
}
