package com.bytedance.retrofit2.client;

import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Response {
    private final TypedInput body;
    private Object extraInfo;
    private final List<Header> headers;
    private final String reason;
    private final int status;
    private final String url;

    public final TypedInput getBody() {
        return this.body;
    }

    public final Object getExtraInfo() {
        return this.extraInfo;
    }

    public final List<Header> getHeaders() {
        return this.headers;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isSuccessful() {
        if (this.status < 200 || this.status >= 300) {
            return false;
        }
        return true;
    }

    public final void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public final Header getFirstHeader(String str) {
        if (str == null || this.headers == null) {
            return null;
        }
        for (Header next : this.headers) {
            if (str.equalsIgnoreCase(next.getName())) {
                return next;
            }
        }
        return null;
    }

    public final List<Header> headers(String str) {
        ArrayList arrayList = null;
        if (str == null || this.headers == null) {
            return null;
        }
        for (Header next : this.headers) {
            if (str.equalsIgnoreCase(next.getName())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Response(String str, int i, String str2, List<Header> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        } else if (i < 200) {
            throw new IllegalArgumentException("Invalid status code: " + i);
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else if (list != null) {
            this.url = str;
            this.status = i;
            this.reason = str2;
            this.headers = Collections.unmodifiableList(new ArrayList(list));
            this.body = typedInput;
        } else {
            throw new IllegalArgumentException("headers == null");
        }
    }
}
