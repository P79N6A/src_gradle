package com.meizu.cloud.pushsdk.b.c;

import com.meizu.cloud.pushsdk.b.c.c;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final i f26969a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26970b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26971c;

    /* renamed from: d  reason: collision with root package name */
    private final c f26972d;

    /* renamed from: e  reason: collision with root package name */
    private final l f26973e;

    /* renamed from: f  reason: collision with root package name */
    private k f26974f;
    private k g;
    private final k h;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public i f26975a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f26976b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f26977c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public c.a f26978d = new c.a();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public l f26979e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public k f26980f;
        /* access modifiers changed from: private */
        public k g;
        /* access modifiers changed from: private */
        public k h;

        public a a(int i) {
            this.f26976b = i;
            return this;
        }

        public a a(c cVar) {
            this.f26978d = cVar.c();
            return this;
        }

        public a a(i iVar) {
            this.f26975a = iVar;
            return this;
        }

        public a a(l lVar) {
            this.f26979e = lVar;
            return this;
        }

        public a a(String str) {
            this.f26977c = str;
            return this;
        }

        public k a() {
            if (this.f26975a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f26976b >= 0) {
                return new k(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.f26976b);
            }
        }
    }

    private k(a aVar) {
        this.f26969a = aVar.f26975a;
        this.f26970b = aVar.f26976b;
        this.f26971c = aVar.f26977c;
        this.f26972d = aVar.f26978d.a();
        this.f26973e = aVar.f26979e;
        this.f26974f = aVar.f26980f;
        this.g = aVar.g;
        this.h = aVar.h;
    }

    public int a() {
        return this.f26970b;
    }

    public l b() {
        return this.f26973e;
    }

    public String toString() {
        return "Response{protocol=, code=" + this.f26970b + ", message=" + this.f26971c + ", url=" + this.f26969a.a() + '}';
    }
}
