package anet.channel.request;

import android.text.TextUtils;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.c;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public class Request {

    /* renamed from: a  reason: collision with root package name */
    public final RequestStatistic f1262a;

    /* renamed from: b  reason: collision with root package name */
    private HttpUrl f1263b;

    /* renamed from: c  reason: collision with root package name */
    private HttpUrl f1264c;

    /* renamed from: d  reason: collision with root package name */
    private HttpUrl f1265d;

    /* renamed from: e  reason: collision with root package name */
    private URL f1266e;

    /* renamed from: f  reason: collision with root package name */
    private String f1267f;
    private Map<String, String> g;
    private Map<String, String> h;
    private String i;
    private BodyEntry j;
    private boolean k;
    private String l;
    private String m;
    private int n;
    private int o;
    private int p;
    private HostnameVerifier q;
    private SSLSocketFactory r;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public HttpUrl f1268a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public HttpUrl f1269b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f1270c = "GET";
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String> f1271d = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f1272e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f1273f;
        /* access modifiers changed from: private */
        public BodyEntry g;
        /* access modifiers changed from: private */
        public boolean h = true;
        /* access modifiers changed from: private */
        public int i = 0;
        /* access modifiers changed from: private */
        public HostnameVerifier j;
        /* access modifiers changed from: private */
        public SSLSocketFactory k;
        /* access modifiers changed from: private */
        public String l;
        /* access modifiers changed from: private */
        public String m;
        /* access modifiers changed from: private */
        public int n = 10000;
        /* access modifiers changed from: private */
        public int o = 10000;
        /* access modifiers changed from: private */
        public RequestStatistic p = null;

        public Request build() {
            if (this.g == null && this.f1272e == null && Method.a(this.f1270c)) {
                ALog.e("awcn.Request", "method " + this.f1270c + " must have a request body", null, new Object[0]);
            }
            if (this.g != null && !Method.b(this.f1270c)) {
                ALog.e("awcn.Request", "method " + this.f1270c + " should not have a request body", null, new Object[0]);
                this.g = null;
            }
            if (!(this.g == null || this.g.getContentType() == null)) {
                addHeader("Content-Type", this.g.getContentType());
            }
            return new Request(this);
        }

        public Builder setBizId(String str) {
            this.l = str;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            this.g = bodyEntry;
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.j = hostnameVerifier;
            return this;
        }

        public Builder setRedirectEnable(boolean z) {
            this.h = z;
            return this;
        }

        public Builder setRedirectTimes(int i2) {
            this.i = i2;
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            this.p = requestStatistic;
            return this;
        }

        public Builder setSeq(String str) {
            this.m = str;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.k = sSLSocketFactory;
            return this;
        }

        public Builder setCharset(String str) {
            this.f1273f = str;
            this.f1269b = null;
            return this;
        }

        public Builder setConnectTimeout(int i2) {
            if (i2 > 0) {
                this.n = i2;
            }
            return this;
        }

        public Builder setParams(Map<String, String> map) {
            this.f1272e = map;
            this.f1269b = null;
            return this;
        }

        public Builder setReadTimeout(int i2) {
            if (i2 > 0) {
                this.o = i2;
            }
            return this;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            this.f1268a = httpUrl;
            this.f1269b = null;
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f1271d.clear();
            if (map != null) {
                this.f1271d.putAll(map);
            }
            return this;
        }

        public Builder setUrl(String str) {
            this.f1268a = HttpUrl.parse(str);
            this.f1269b = null;
            if (this.f1268a != null) {
                return this;
            }
            throw new IllegalArgumentException("toURL is invalid! toURL = " + str);
        }

        public Builder setMethod(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (!"GET".equalsIgnoreCase(str)) {
                    if ("POST".equalsIgnoreCase(str)) {
                        this.f1270c = "POST";
                    } else if ("OPTIONS".equalsIgnoreCase(str)) {
                        this.f1270c = "OPTIONS";
                    } else if ("HEAD".equalsIgnoreCase(str)) {
                        this.f1270c = "HEAD";
                    } else if ("PUT".equalsIgnoreCase(str)) {
                        this.f1270c = "PUT";
                    } else if ("DELETE".equalsIgnoreCase(str)) {
                        this.f1270c = "DELETE";
                    }
                    return this;
                }
                this.f1270c = "GET";
                return this;
            }
            throw new IllegalArgumentException("method is null or empty");
        }

        public Builder addHeader(String str, String str2) {
            this.f1271d.put(str, str2);
            return this;
        }

        public Builder addParam(String str, String str2) {
            if (this.f1272e == null) {
                this.f1272e = new HashMap();
            }
            this.f1272e.put(str, str2);
            this.f1269b = null;
            return this;
        }
    }

    public static final class Method {
        static boolean a(String str) {
            if (str.equals("POST") || str.equals("PUT")) {
                return true;
            }
            return false;
        }

        static boolean b(String str) {
            if (a(str) || str.equals("DELETE") || str.equals("OPTIONS")) {
                return true;
            }
            return false;
        }
    }

    public String getBizId() {
        return this.l;
    }

    public int getConnectTimeout() {
        return this.o;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.q;
    }

    public HttpUrl getHttpUrl() {
        return this.f1264c;
    }

    public String getMethod() {
        return this.f1267f;
    }

    public int getReadTimeout() {
        return this.p;
    }

    public int getRedirectTimes() {
        return this.n;
    }

    public String getSeq() {
        return this.m;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.r;
    }

    public boolean isRedirectEnable() {
        return this.k;
    }

    public boolean containsBody() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.g);
    }

    public String getHost() {
        return this.f1264c.host();
    }

    public String getUrlString() {
        return this.f1264c.urlString();
    }

    public String getContentEncoding() {
        if (this.i != null) {
            return this.i;
        }
        return "UTF-8";
    }

    public byte[] getBodyBytes() {
        if (this.j == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(SearchJediMixFeedAdapter.f42517f);
        try {
            postBody(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public URL getUrl() {
        HttpUrl httpUrl;
        if (this.f1266e == null) {
            if (this.f1265d != null) {
                httpUrl = this.f1265d;
            } else {
                httpUrl = this.f1264c;
            }
            this.f1266e = httpUrl.toURL();
        }
        return this.f1266e;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        String unused = builder.f1270c = this.f1267f;
        Map unused2 = builder.f1271d = this.g;
        Map unused3 = builder.f1272e = this.h;
        BodyEntry unused4 = builder.g = this.j;
        String unused5 = builder.f1273f = this.i;
        boolean unused6 = builder.h = this.k;
        int unused7 = builder.i = this.n;
        HostnameVerifier unused8 = builder.j = this.q;
        SSLSocketFactory unused9 = builder.k = this.r;
        HttpUrl unused10 = builder.f1268a = this.f1263b;
        HttpUrl unused11 = builder.f1269b = this.f1264c;
        String unused12 = builder.l = this.l;
        String unused13 = builder.m = this.m;
        int unused14 = builder.n = this.o;
        int unused15 = builder.o = this.p;
        RequestStatistic unused16 = builder.p = this.f1262a;
        return builder;
    }

    private void a() {
        String a2 = c.a(this.h, getContentEncoding());
        if (!TextUtils.isEmpty(a2)) {
            if (!Method.a(this.f1267f) || this.j != null) {
                String urlString = this.f1263b.urlString();
                StringBuilder sb = new StringBuilder(urlString);
                if (sb.indexOf("?") == -1) {
                    sb.append('?');
                } else if (urlString.charAt(urlString.length() - 1) != '&') {
                    sb.append('&');
                }
                sb.append(a2);
                HttpUrl parse = HttpUrl.parse(sb.toString());
                if (parse != null) {
                    this.f1264c = parse;
                }
            } else {
                try {
                    this.j = new ByteArrayEntry(a2.getBytes(getContentEncoding()));
                    Map<String, String> map = this.g;
                    map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        if (this.f1264c == null) {
            this.f1264c = this.f1263b;
        }
    }

    public int postBody(OutputStream outputStream) throws IOException {
        if (this.j != null) {
            return this.j.writeTo(outputStream);
        }
        return 0;
    }

    public void setUrlScheme(boolean z) {
        String str;
        if (this.f1265d == null) {
            this.f1265d = new HttpUrl(this.f1264c);
        }
        HttpUrl httpUrl = this.f1265d;
        if (z) {
            str = "https";
        } else {
            str = "http";
        }
        httpUrl.setScheme(str);
        this.f1266e = null;
    }

    private Request(Builder builder) {
        RequestStatistic requestStatistic;
        this.f1267f = "GET";
        this.k = true;
        this.o = 10000;
        this.p = 10000;
        this.f1267f = builder.f1270c;
        this.g = builder.f1271d;
        this.h = builder.f1272e;
        this.j = builder.g;
        this.i = builder.f1273f;
        this.k = builder.h;
        this.n = builder.i;
        this.q = builder.j;
        this.r = builder.k;
        this.l = builder.l;
        this.m = builder.m;
        this.o = builder.n;
        this.p = builder.o;
        this.f1263b = builder.f1268a;
        this.f1264c = builder.f1269b;
        if (this.f1264c == null) {
            a();
        }
        if (builder.p != null) {
            requestStatistic = builder.p;
        } else {
            requestStatistic = new RequestStatistic(getHost(), this.l);
        }
        this.f1262a = requestStatistic;
    }

    public void setDnsOptimize(String str, int i2) {
        if (str != null) {
            if (this.f1265d == null) {
                this.f1265d = new HttpUrl(this.f1264c);
            }
            this.f1265d.replaceIpAndPort(str, i2);
        } else {
            this.f1265d = null;
        }
        this.f1266e = null;
        this.f1262a.setIPAndPort(str, i2);
    }
}
