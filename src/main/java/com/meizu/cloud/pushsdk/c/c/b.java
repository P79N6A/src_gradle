package com.meizu.cloud.pushsdk.c.c;

import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.c.a;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private String f27134d;

    /* renamed from: e  reason: collision with root package name */
    private String f27135e;

    /* renamed from: f  reason: collision with root package name */
    private String f27136f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private int l;

    public static abstract class a<T extends a<T>> extends a.C0314a<T> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f27137a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f27138b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f27139c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f27140d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f27141e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f27142f;
        /* access modifiers changed from: private */
        public String g;
        /* access modifiers changed from: private */
        public String h;
        /* access modifiers changed from: private */
        public int i;

        public T a(int i2) {
            this.i = i2;
            return (a) a();
        }

        public T a(String str) {
            this.f27137a = str;
            return (a) a();
        }

        public T b(String str) {
            this.f27138b = str;
            return (a) a();
        }

        public b b() {
            return new b(this);
        }

        public T c(String str) {
            this.f27139c = str;
            return (a) a();
        }

        public T d(String str) {
            this.f27140d = str;
            return (a) a();
        }

        public T e(String str) {
            this.f27141e = str;
            return (a) a();
        }

        public T f(String str) {
            this.f27142f = str;
            return (a) a();
        }

        public T g(String str) {
            this.g = str;
            return (a) a();
        }

        public T h(String str) {
            this.h = str;
            return (a) a();
        }
    }

    /* renamed from: com.meizu.cloud.pushsdk.c.c.b$b  reason: collision with other inner class name */
    static class C0315b extends a<C0315b> {
        private C0315b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C0315b a() {
            return this;
        }
    }

    protected b(a<?> aVar) {
        super(aVar);
        this.f27135e = aVar.f27138b;
        this.f27136f = aVar.f27139c;
        this.f27134d = aVar.f27137a;
        this.g = aVar.f27140d;
        this.h = aVar.f27141e;
        this.i = aVar.f27142f;
        this.j = aVar.g;
        this.k = aVar.h;
        this.l = aVar.i;
    }

    public static a<?> d() {
        return new C0315b();
    }

    public c e() {
        c cVar = new c();
        cVar.a("en", this.f27134d);
        cVar.a("ti", this.f27135e);
        cVar.a(AppIconSetting.DEFAULT_LARGE_ICON, this.f27136f);
        cVar.a("pv", this.g);
        cVar.a("pn", this.h);
        cVar.a("si", this.i);
        cVar.a("ms", this.j);
        cVar.a("ect", this.k);
        cVar.a("br", (Object) Integer.valueOf(this.l));
        return a(cVar);
    }
}
