package com.alipay.b.b.a.a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class b implements Serializable {
    private static final long serialVersionUID = -6098125857367743614L;
    private Map<String, String> headers = new HashMap();

    public final String getHead(String str) {
        return this.headers.get(str);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final void setHead(String str, String str2) {
        this.headers.put(str, str2);
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }
}
