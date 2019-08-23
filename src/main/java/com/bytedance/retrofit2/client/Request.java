package com.bytedance.retrofit2.client;

import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.o;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class Request {
    public final boolean addCommonParam;
    public final TypedOutput body;
    public Object extraInfo;
    public final List<Header> headers;
    public final int maxLength;
    public final String method;
    private o metrics;
    public final int priorityLevel;
    public final boolean responseStreaming;
    public final String url;

    public static class Builder {
        boolean addCommonParam;
        TypedOutput body;
        Object extraInfo;
        List<Header> headers;
        int maxLength;
        String method;
        int priorityLevel;
        boolean responseStreaming;
        String url;

        public Builder() {
            this.method = "GET";
        }

        public Builder get() {
            return method("GET", null);
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public Builder headers(List<Header> list) {
            this.headers = list;
            return this;
        }

        public Builder maxLength(int i) {
            this.maxLength = i;
            return this;
        }

        public Builder priorityLevel(int i) {
            this.priorityLevel = i;
            return this;
        }

        public Builder responseStreaming(boolean z) {
            this.responseStreaming = z;
            return this;
        }

        public Builder setExtraInfo(Object obj) {
            this.extraInfo = obj;
            return this;
        }

        public Builder delete(TypedOutput typedOutput) {
            return method("DELETE", typedOutput);
        }

        public Builder patch(TypedOutput typedOutput) {
            return method("PATCH", typedOutput);
        }

        public Builder post(TypedOutput typedOutput) {
            return method("POST", typedOutput);
        }

        public Builder put(TypedOutput typedOutput) {
            return method("PUT", typedOutput);
        }

        public Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        Builder(Request request) {
            this.method = request.method;
            this.url = request.url;
            this.headers = new LinkedList();
            this.headers.addAll(request.headers);
            this.body = request.body;
            this.priorityLevel = request.priorityLevel;
            this.responseStreaming = request.responseStreaming;
            this.maxLength = request.maxLength;
            this.addCommonParam = request.addCommonParam;
            this.extraInfo = request.extraInfo;
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bytedance.retrofit2.client.Request.Builder method(java.lang.String r3, com.bytedance.retrofit2.mime.TypedOutput r4) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x0079
                int r0 = r3.length()
                if (r0 == 0) goto L_0x0071
                if (r4 == 0) goto L_0x0058
                boolean r0 = com.bytedance.retrofit2.s.a((java.lang.String) r3)
                if (r0 != 0) goto L_0x003b
                java.lang.String r0 = "OPTIONS"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L_0x003b
                java.lang.String r0 = "DELETE"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L_0x003b
                java.lang.String r0 = "PROPFIND"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L_0x003b
                java.lang.String r0 = "MKCOL"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L_0x003b
                java.lang.String r0 = "LOCK"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x0039
                goto L_0x003b
            L_0x0039:
                r0 = 0
                goto L_0x003c
            L_0x003b:
                r0 = 1
            L_0x003c:
                if (r0 == 0) goto L_0x003f
                goto L_0x0058
            L_0x003f:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "method "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = " must not have a request body."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            L_0x0058:
                if (r4 != 0) goto L_0x006c
                boolean r0 = com.bytedance.retrofit2.s.a((java.lang.String) r3)
                if (r0 == 0) goto L_0x006c
                com.bytedance.retrofit2.mime.b r4 = new com.bytedance.retrofit2.mime.b
                r4.<init>()
                java.lang.String r0 = "body"
                java.lang.String r1 = "null"
                r4.a(r0, r1)
            L_0x006c:
                r2.method = r3
                r2.body = r4
                return r2
            L_0x0071:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "method.length() == 0"
                r3.<init>(r4)
                throw r3
            L_0x0079:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "method == null"
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.client.Request.Builder.method(java.lang.String, com.bytedance.retrofit2.mime.TypedOutput):com.bytedance.retrofit2.client.Request$Builder");
        }
    }

    public final TypedOutput getBody() {
        return this.body;
    }

    public final Object getExtraInfo() {
        return this.extraInfo;
    }

    public final List<Header> getHeaders() {
        return this.headers;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final String getMethod() {
        return this.method;
    }

    public final o getMetrics() {
        return this.metrics;
    }

    public final int getPriorityLevel() {
        return this.priorityLevel;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public final boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final String getPath() {
        return safeCreateUri(this.url).getPath();
    }

    public final void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public final void setMetrics(o oVar) {
        this.metrics = oVar;
    }

    private static URI createUriWithOutQuery(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static URI safeCreateUri(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return createUriWithOutQuery(str);
            }
        }
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

    Request(Builder builder) {
        if (builder.url != null) {
            this.url = builder.url;
            if (builder.method != null) {
                this.method = builder.method;
                if (builder.headers == null) {
                    this.headers = Collections.emptyList();
                } else {
                    this.headers = Collections.unmodifiableList(new ArrayList(builder.headers));
                }
                this.body = builder.body;
                this.priorityLevel = builder.priorityLevel;
                this.responseStreaming = builder.responseStreaming;
                this.maxLength = builder.maxLength;
                this.addCommonParam = builder.addCommonParam;
                this.extraInfo = builder.extraInfo;
                return;
            }
            throw new NullPointerException("Method must not be null.");
        }
        throw new NullPointerException("URL must not be null.");
    }

    public Request(String str, String str2, List<Header> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj) {
        if (str == null) {
            throw new NullPointerException("Method must not be null.");
        } else if (str2 != null) {
            this.method = str;
            this.url = str2;
            if (list == null) {
                this.headers = Collections.emptyList();
            } else {
                this.headers = Collections.unmodifiableList(new ArrayList(list));
            }
            this.body = typedOutput;
            this.priorityLevel = i;
            this.responseStreaming = z;
            this.maxLength = i2;
            this.addCommonParam = z2;
            this.extraInfo = obj;
        } else {
            throw new NullPointerException("URL must not be null.");
        }
    }
}
