package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.b;
import com.bytedance.retrofit2.mime.d;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public final class m {
    private static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public String f21905a;

    /* renamed from: b  reason: collision with root package name */
    public String f21906b;

    /* renamed from: c  reason: collision with root package name */
    public String f21907c;

    /* renamed from: d  reason: collision with root package name */
    public List<Header> f21908d;

    /* renamed from: e  reason: collision with root package name */
    final d f21909e;

    /* renamed from: f  reason: collision with root package name */
    public TypedOutput f21910f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public Object k;
    private final e m;
    private StringBuilder n;
    private String o;
    private final boolean p;
    private final b q;

    static class a implements TypedOutput {

        /* renamed from: a  reason: collision with root package name */
        private final TypedOutput f21911a;

        /* renamed from: b  reason: collision with root package name */
        private final String f21912b;

        public final String mimeType() {
            return this.f21912b;
        }

        public final String fileName() {
            return this.f21911a.fileName();
        }

        public final long length() {
            return this.f21911a.length();
        }

        public final String md5Stub() {
            return this.f21911a.md5Stub();
        }

        public final void writeTo(OutputStream outputStream) throws IOException {
            this.f21911a.writeTo(outputStream);
        }

        a(TypedOutput typedOutput, String str) {
            this.f21911a = typedOutput;
            this.f21912b = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.Request a(com.bytedance.retrofit2.h r11) {
        /*
            r10 = this;
            com.bytedance.retrofit2.mime.d r11 = r10.f21909e
            if (r11 == 0) goto L_0x0017
            com.bytedance.retrofit2.mime.d r11 = r10.f21909e
            java.util.List<com.bytedance.retrofit2.mime.d$a> r11 = r11.f21916a
            int r11 = r11.size()
            if (r11 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Multipart requests must contain at least one part."
            r11.<init>(r0)
            throw r11
        L_0x0017:
            com.bytedance.retrofit2.e r11 = r10.m
            java.lang.String r11 = r11.a()
            boolean r0 = com.bytedance.retrofit2.l.b()
            if (r0 == 0) goto L_0x009b
            okhttp3.HttpUrl r0 = okhttp3.HttpUrl.parse(r11)
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = r0.encodedPath()
            if (r1 == 0) goto L_0x004b
            java.lang.String r1 = r0.encodedPath()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x004b
            java.lang.String r1 = "/"
            java.lang.String r2 = r10.f21907c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = r10.f21907c
            java.lang.StringBuilder r11 = b(r11, r0)
            goto L_0x00f8
        L_0x004b:
            java.lang.String r11 = r10.f21907c
            okhttp3.HttpUrl r11 = r0.resolve(r11)
            if (r11 == 0) goto L_0x005f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
        L_0x005c:
            r11 = r0
            goto L_0x00f8
        L_0x005f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed URL. Base: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", Relative: "
            r1.append(r0)
            java.lang.String r0 = r10.f21907c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x007d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed URL. Base: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", Relative: "
            r1.append(r0)
            java.lang.String r0 = r10.f21907c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x009b:
            java.net.URI r0 = java.net.URI.create(r11)     // Catch:{ Throwable -> 0x00d1 }
            java.lang.String r1 = r0.getPath()     // Catch:{ Throwable -> 0x00d1 }
            if (r1 == 0) goto L_0x00c0
            java.lang.String r1 = r0.getPath()     // Catch:{ Throwable -> 0x00d1 }
            int r1 = r1.length()     // Catch:{ Throwable -> 0x00d1 }
            if (r1 <= 0) goto L_0x00c0
            java.lang.String r1 = "/"
            java.lang.String r2 = r10.f21907c     // Catch:{ Throwable -> 0x00d1 }
            boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x00d1 }
            if (r1 == 0) goto L_0x00c0
            java.lang.String r0 = r10.f21907c     // Catch:{ Throwable -> 0x00d1 }
            java.lang.StringBuilder r0 = b(r11, r0)     // Catch:{ Throwable -> 0x00d1 }
            goto L_0x005c
        L_0x00c0:
            java.lang.String r1 = r10.f21907c     // Catch:{ Throwable -> 0x00d1 }
            java.net.URI r0 = r0.resolve(r1)     // Catch:{ Throwable -> 0x00d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00d1 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x00d1 }
            r11 = r1
            goto L_0x00f8
        L_0x00d1:
            java.lang.String r0 = r10.f21907c
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = r10.f21907c
            java.lang.String r1 = "http://"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = r10.f21907c
            java.lang.String r1 = "https://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x00f2
        L_0x00ea:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = r10.f21907c
            r11.<init>(r0)
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r0 = r10.f21907c
            java.lang.StringBuilder r11 = b(r11, r0)
        L_0x00f8:
            java.lang.StringBuilder r0 = r10.n
            if (r0 == 0) goto L_0x011a
            r1 = 0
            char r2 = r0.charAt(r1)
            r3 = 63
            if (r3 != r2) goto L_0x0117
            java.lang.String r2 = r10.f21907c
            if (r2 == 0) goto L_0x0117
            java.lang.String r2 = r10.f21907c
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L_0x0117
            r2 = 38
            r0.setCharAt(r1, r2)
        L_0x0117:
            r11.append(r0)
        L_0x011a:
            java.lang.String r11 = r11.toString()
            r10.f21906b = r11
            com.bytedance.retrofit2.mime.TypedOutput r11 = r10.f21910f
            java.util.List<com.bytedance.retrofit2.client.Header> r0 = r10.f21908d
            java.lang.String r1 = r10.o
            if (r1 == 0) goto L_0x0147
            if (r11 == 0) goto L_0x0134
            com.bytedance.retrofit2.m$a r1 = new com.bytedance.retrofit2.m$a
            java.lang.String r2 = r10.o
            r1.<init>(r11, r2)
            r3 = r0
            r11 = r1
            goto L_0x0148
        L_0x0134:
            com.bytedance.retrofit2.client.Header r1 = new com.bytedance.retrofit2.client.Header
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = r10.o
            r1.<init>(r2, r3)
            if (r0 != 0) goto L_0x0144
            java.util.List r0 = java.util.Collections.singletonList(r1)
            goto L_0x0147
        L_0x0144:
            r0.add(r1)
        L_0x0147:
            r3 = r0
        L_0x0148:
            if (r11 != 0) goto L_0x015e
            java.lang.String r0 = r10.f21905a
            boolean r0 = com.bytedance.retrofit2.s.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x015e
            com.bytedance.retrofit2.mime.b r11 = new com.bytedance.retrofit2.mime.b
            r11.<init>()
            java.lang.String r0 = "body"
            java.lang.String r1 = "null"
            r11.a(r0, r1)
        L_0x015e:
            r4 = r11
            com.bytedance.retrofit2.client.Request r11 = new com.bytedance.retrofit2.client.Request
            java.lang.String r1 = r10.f21905a
            java.lang.String r2 = r10.f21906b
            int r5 = r10.g
            boolean r6 = r10.h
            int r7 = r10.i
            boolean r8 = r10.j
            java.lang.Object r9 = r10.k
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.m.a(com.bytedance.retrofit2.h):com.bytedance.retrofit2.client.Request");
    }

    private static StringBuilder b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        } else if ("Content-Type".equalsIgnoreCase(str)) {
            this.o = str2;
        } else {
            List list = this.f21908d;
            if (list == null) {
                list = new ArrayList(2);
                this.f21908d = list;
            }
            list.add(new Header(str, str2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2, boolean z) {
        this.q.a(str, z, str2.toString(), z);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, boolean z) {
        char c2;
        if (str != null) {
            try {
                StringBuilder sb = this.n;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.n = sb;
                }
                if (sb.length() > 0) {
                    c2 = '&';
                } else {
                    c2 = '?';
                }
                sb.append(c2);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                }
                if (z) {
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 != null) {
                    if (!str2.isEmpty()) {
                        sb.append(str);
                        sb.append('=');
                        sb.append(str2);
                        return;
                    }
                }
                sb.append(str);
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e2);
            }
        } else {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
    }

    m(String str, e eVar, String str2, List<Header> list, String str3, int i2, boolean z, int i3, boolean z2, Object obj, boolean z3, boolean z4, boolean z5) {
        this.f21905a = str;
        this.m = eVar;
        this.f21907c = str2;
        this.o = str3;
        this.g = i2;
        this.h = z;
        this.i = i3;
        this.j = z2;
        this.k = obj;
        this.p = z3;
        this.f21908d = list;
        if (z4) {
            this.q = new b();
            this.f21909e = null;
            this.f21910f = this.q;
        } else if (z5) {
            this.q = null;
            this.f21909e = new d();
            this.f21910f = this.f21909e;
        } else {
            this.q = null;
            this.f21909e = null;
        }
    }
}
