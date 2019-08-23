package org.android.spdy;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public final class SpdyRequest {
    private int connectionTimeoutMs;
    private String domain;
    private Map<String, String> extHead;
    private String host;
    private String method;
    private int port;
    private RequestPriority priority;
    private String proxyIp = "0.0.0.0";
    private int proxyPort;
    private int requestRdTimeoutMs;
    private int requestTimeoutMs;
    private int retryTimes;
    private URL url;

    public final int getConnectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    /* access modifiers changed from: package-private */
    public final String getDomain() {
        return this.domain;
    }

    /* access modifiers changed from: package-private */
    public final String getHost() {
        return this.host;
    }

    /* access modifiers changed from: package-private */
    public final String getMethod() {
        return this.method;
    }

    /* access modifiers changed from: package-private */
    public final String getProxyIp() {
        return this.proxyIp;
    }

    /* access modifiers changed from: package-private */
    public final int getProxyPort() {
        return this.proxyPort;
    }

    public final int getRequestRdTimeoutMs() {
        return this.requestRdTimeoutMs;
    }

    public final int getRequestTimeoutMs() {
        return this.requestTimeoutMs;
    }

    public final int getRetryTimes() {
        return this.retryTimes;
    }

    /* access modifiers changed from: package-private */
    public final URL getUrl() {
        return this.url;
    }

    public SpdyRequest(URL url2, String str, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = "";
        this.host = url2.getHost();
        this.port = url2.getPort();
        if (this.port < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, RequestPriority requestPriority, int i, int i2) {
        this.url = url2;
        this.domain = "";
        this.host = url2.getHost();
        this.port = url2.getPort();
        if (this.port < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i;
        this.connectionTimeoutMs = i2;
    }

    public SpdyRequest(URL url2, String str, String str2, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = str;
        this.host = url2.getHost();
        this.port = url2.getPort();
        if (this.port < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, String str2, RequestPriority requestPriority, int i, int i2) {
        this.url = url2;
        this.domain = str;
        this.host = url2.getHost();
        this.port = url2.getPort();
        if (this.port < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i;
        this.connectionTimeoutMs = i2;
    }

    /* access modifiers changed from: package-private */
    public final int getPriority() {
        return this.priority.getPriorityInt();
    }

    /* access modifiers changed from: package-private */
    public final int getPort() {
        if (this.port < 0) {
            return 80;
        }
        return this.port;
    }

    public final String getAuthority() {
        return this.host + ":" + Integer.toString(this.port) + "/" + this.proxyIp + ":" + this.proxyPort;
    }

    /* access modifiers changed from: package-private */
    public final String getUrlPath() {
        return this.url.getProtocol() + "://" + this.url.getAuthority() + getPath();
    }

    private String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.url.getPath());
        if (this.url.getQuery() != null) {
            sb.append("?");
            sb.append(this.url.getQuery());
        }
        if (this.url.getRef() != null) {
            sb.append("#");
            sb.append(this.url.getRef());
        }
        if (sb.length() == 0) {
            sb.append('/');
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(":path", getPath());
        hashMap.put(":method", this.method);
        hashMap.put(":version", "HTTP/1.1");
        hashMap.put(":host", this.url.getAuthority());
        hashMap.put(":scheme", this.url.getProtocol());
        if (this.extHead != null && this.extHead.size() > 0) {
            hashMap.putAll(this.extHead);
        }
        return hashMap;
    }

    public final void setDomain(String str) {
        this.domain = str;
    }

    public final void addHeaders(Map<String, String> map) {
        this.extHead.putAll(map);
    }

    public final void setRequestRdTimeoutMs(int i) {
        if (i >= 0) {
            this.requestRdTimeoutMs = i;
        }
    }

    public final void addHeader(String str, String str2) {
        this.extHead.put(str, str2);
    }

    public SpdyRequest(URL url2, String str) {
        this.url = url2;
        this.domain = "";
        this.host = url2.getHost();
        this.port = url2.getPort();
        if (this.port < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
    }

    public SpdyRequest(URL url2, String str, String str2) {
        this.url = url2;
        this.domain = str;
        this.host = url2.getHost();
        this.port = url2.getPort();
        if (this.port < 0) {
            this.port = url2.getDefaultPort();
        }
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
    }

    public SpdyRequest(URL url2, String str, int i, String str2, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = "";
        this.host = str;
        this.port = i;
        this.method = str2;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, String str2, int i, String str3, RequestPriority requestPriority) {
        this.url = url2;
        this.domain = str;
        this.host = str2;
        this.port = i;
        this.method = str3;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
    }

    public SpdyRequest(URL url2, String str, int i, String str2, int i2, String str3, RequestPriority requestPriority, int i3, int i4, int i5) {
        this.url = url2;
        this.domain = "";
        this.host = str;
        this.port = i;
        if (!(str2 == null || i2 == 0)) {
            this.proxyIp = str2;
            this.proxyPort = i2;
        }
        this.method = str3;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i3;
        this.connectionTimeoutMs = i4;
        this.retryTimes = i5;
    }

    public SpdyRequest(URL url2, String str, String str2, int i, String str3, int i2, String str4, RequestPriority requestPriority, int i3, int i4, int i5) {
        this.url = url2;
        this.domain = str;
        this.host = str2;
        this.port = i;
        if (!(str3 == null || i2 == 0)) {
            this.proxyIp = str3;
            this.proxyPort = i2;
        }
        this.method = str4;
        this.extHead = new HashMap(5);
        this.priority = requestPriority;
        if (requestPriority == null) {
            this.priority = RequestPriority.DEFAULT_PRIORITY;
        }
        this.requestTimeoutMs = i3;
        this.connectionTimeoutMs = i4;
        this.retryTimes = i5;
    }
}
