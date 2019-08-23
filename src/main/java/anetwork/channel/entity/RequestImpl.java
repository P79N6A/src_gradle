package anetwork.channel.entity;

import android.text.TextUtils;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import anetwork.channel.Header;
import anetwork.channel.IBodyHandler;
import anetwork.channel.Param;
import anetwork.channel.Request;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestImpl implements Request {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    private URI f1522a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private URL f1523b;

    /* renamed from: c  reason: collision with root package name */
    private String f1524c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1525d = true;

    /* renamed from: e  reason: collision with root package name */
    private List<Header> f1526e;

    /* renamed from: f  reason: collision with root package name */
    private String f1527f = "GET";
    private List<Param> g;
    private int h = 2;
    private String i = "utf-8";
    private BodyEntry j;
    private int k;
    private int l;
    private String m;
    private String n;
    private Map<String, String> o;

    @Deprecated
    public IBodyHandler getBodyHandler() {
        return null;
    }

    public String getBizId() {
        return this.m;
    }

    public BodyEntry getBodyEntry() {
        return this.j;
    }

    public String getCharset() {
        return this.i;
    }

    public int getConnectTimeout() {
        return this.k;
    }

    public Map<String, String> getExtProperties() {
        return this.o;
    }

    public boolean getFollowRedirects() {
        return this.f1525d;
    }

    public List<Header> getHeaders() {
        return this.f1526e;
    }

    public String getMethod() {
        return this.f1527f;
    }

    public List<Param> getParams() {
        return this.g;
    }

    public int getReadTimeout() {
        return this.l;
    }

    public int getRetryTime() {
        return this.h;
    }

    public String getSeqNo() {
        return this.n;
    }

    public String getUrlString() {
        return this.f1524c;
    }

    public RequestImpl() {
    }

    @Deprecated
    public boolean isCookieEnabled() {
        if (!"false".equals(getExtProperty("EnableCookie"))) {
            return true;
        }
        return false;
    }

    @Deprecated
    public URI getURI() {
        if (this.f1522a != null) {
            return this.f1522a;
        }
        if (this.f1524c != null) {
            try {
                this.f1522a = new URI(this.f1524c);
            } catch (Exception e2) {
                ALog.e("anet.RequestImpl", "uri error", this.n, e2, new Object[0]);
            }
        }
        return this.f1522a;
    }

    @Deprecated
    public URL getURL() {
        if (this.f1523b != null) {
            return this.f1523b;
        }
        if (this.f1524c != null) {
            try {
                this.f1523b = new URL(this.f1524c);
            } catch (Exception e2) {
                ALog.e("anet.RequestImpl", "url error", this.n, e2, new Object[0]);
            }
        }
        return this.f1523b;
    }

    public void setBizId(String str) {
        this.m = str;
    }

    public void setBodyEntry(BodyEntry bodyEntry) {
        this.j = bodyEntry;
    }

    public void setCharset(String str) {
        this.i = str;
    }

    public void setConnectTimeout(int i2) {
        this.k = i2;
    }

    public void setFollowRedirects(boolean z) {
        this.f1525d = z;
    }

    public void setHeaders(List<Header> list) {
        this.f1526e = list;
    }

    public void setMethod(String str) {
        this.f1527f = str;
    }

    public void setParams(List<Param> list) {
        this.g = list;
    }

    public void setReadTimeout(int i2) {
        this.l = i2;
    }

    public void setRetryTime(int i2) {
        this.h = i2;
    }

    public void setSeqNo(String str) {
        this.n = str;
    }

    @Deprecated
    public void setUri(URI uri) {
        this.f1522a = uri;
    }

    @Deprecated
    public void setBizId(int i2) {
        this.m = String.valueOf(i2);
    }

    public void setBodyHandler(IBodyHandler iBodyHandler) {
        this.j = new BodyHandlerEntry(iBodyHandler);
    }

    public String getExtProperty(String str) {
        if (this.o == null) {
            return null;
        }
        return this.o.get(str);
    }

    public void removeHeader(Header header) {
        if (this.f1526e != null) {
            this.f1526e.remove(header);
        }
    }

    @Deprecated
    public void setCookieEnabled(boolean z) {
        String str;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        setExtProperty("EnableCookie", str);
    }

    @Deprecated
    public void setUrL(URL url) {
        this.f1523b = url;
        this.f1524c = url.toString();
    }

    public RequestImpl(String str) {
        this.f1524c = str;
    }

    @Deprecated
    public RequestImpl(URI uri) {
        this.f1522a = uri;
        this.f1524c = uri.toString();
    }

    public Header[] getHeaders(String str) {
        Header[] headerArr = null;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f1526e != null) {
            for (int i2 = 0; i2 < this.f1526e.size(); i2++) {
                if (!(this.f1526e.get(i2) == null || this.f1526e.get(i2).getName() == null || !this.f1526e.get(i2).getName().equalsIgnoreCase(str))) {
                    arrayList.add(this.f1526e.get(i2));
                }
            }
            if (arrayList.size() > 0) {
                headerArr = new Header[arrayList.size()];
                arrayList.toArray(headerArr);
            }
        }
        return headerArr;
    }

    public void setHeader(Header header) {
        if (header != null) {
            if (this.f1526e == null) {
                this.f1526e = new ArrayList();
            }
            int i2 = 0;
            int size = this.f1526e.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (header.getName().equalsIgnoreCase(this.f1526e.get(i2).getName())) {
                    this.f1526e.set(i2, header);
                    break;
                }
                i2++;
            }
            if (i2 < this.f1526e.size()) {
                this.f1526e.add(header);
            }
        }
    }

    @Deprecated
    public RequestImpl(URL url) {
        this.f1523b = url;
        this.f1524c = url.toString();
    }

    public void addHeader(String str, String str2) {
        if (str != null && str2 != null) {
            if (this.f1526e == null) {
                this.f1526e = new ArrayList();
            }
            this.f1526e.add(new BasicHeader(str, str2));
        }
    }

    public void setExtProperty(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (this.o == null) {
                this.o = new HashMap();
            }
            this.o.put(str, str2);
        }
    }
}
