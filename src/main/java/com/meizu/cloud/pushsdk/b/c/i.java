package com.meizu.cloud.pushsdk.b.c;

import com.meizu.cloud.pushsdk.b.c.c;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final f f26953a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26954b;

    /* renamed from: c  reason: collision with root package name */
    private final c f26955c;

    /* renamed from: d  reason: collision with root package name */
    private final j f26956d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f26957e;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public f f26958a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f26959b = "GET";
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public c.a f26960c = new c.a();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public j f26961d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Object f26962e;

        public a a() {
            return a("GET", (j) null);
        }

        public a a(c cVar) {
            this.f26960c = cVar.c();
            return this;
        }

        public a a(f fVar) {
            if (fVar != null) {
                this.f26958a = fVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        public a a(j jVar) {
            return a("POST", jVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.meizu.cloud.pushsdk.b.c.i.a a(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0058
                r1 = 1
                r2 = 0
                java.lang.String r3 = "ws:"
                r4 = 0
                r5 = 3
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x0023
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "http:"
                r0.<init>(r1)
                r1 = 3
            L_0x0017:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L_0x0039
            L_0x0023:
                r1 = 1
                r2 = 0
                java.lang.String r3 = "wss:"
                r4 = 0
                r5 = 4
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x0039
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "https:"
                r0.<init>(r1)
                r1 = 4
                goto L_0x0017
            L_0x0039:
                com.meizu.cloud.pushsdk.b.c.f r0 = com.meizu.cloud.pushsdk.b.c.f.c((java.lang.String) r7)
                if (r0 == 0) goto L_0x0044
                com.meizu.cloud.pushsdk.b.c.i$a r7 = r6.a((com.meizu.cloud.pushsdk.b.c.f) r0)
                return r7
            L_0x0044:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected url: "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L_0x0058:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.b.c.i.a.a(java.lang.String):com.meizu.cloud.pushsdk.b.c.i$a");
        }

        public a a(String str, j jVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (jVar != null && !d.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (jVar != null || !d.a(str)) {
                this.f26959b = str;
                this.f26961d = jVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a a(String str, String str2) {
            this.f26960c.a(str, str2);
            return this;
        }

        public a b() {
            return a("HEAD", (j) null);
        }

        public a b(j jVar) {
            return a("DELETE", jVar);
        }

        public a c(j jVar) {
            return a("PUT", jVar);
        }

        public i c() {
            if (this.f26958a != null) {
                return new i(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a d(j jVar) {
            return a("PATCH", jVar);
        }
    }

    private i(a aVar) {
        this.f26953a = aVar.f26958a;
        this.f26954b = aVar.f26959b;
        this.f26955c = aVar.f26960c.a();
        this.f26956d = aVar.f26961d;
        this.f26957e = aVar.f26962e != null ? aVar.f26962e : this;
    }

    public f a() {
        return this.f26953a;
    }

    public String a(String str) {
        return this.f26955c.a(str);
    }

    public String b() {
        return this.f26954b;
    }

    public int c() {
        if ("GET".equals(b())) {
            return 0;
        }
        if ("POST".equals(b())) {
            return 1;
        }
        if ("PUT".equals(b())) {
            return 2;
        }
        if ("DELETE".equals(b())) {
            return 3;
        }
        if ("HEAD".equals(b())) {
            return 4;
        }
        return "PATCH".equals(b()) ? 5 : 0;
    }

    public c d() {
        return this.f26955c;
    }

    public j e() {
        return this.f26956d;
    }

    public boolean f() {
        return this.f26953a.a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f26954b);
        sb.append(", url=");
        sb.append(this.f26953a);
        sb.append(", tag=");
        sb.append(this.f26957e != this ? this.f26957e : null);
        sb.append('}');
        return sb.toString();
    }
}
