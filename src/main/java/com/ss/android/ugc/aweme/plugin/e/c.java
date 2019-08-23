package com.ss.android.ugc.aweme.plugin.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f59324a;

    /* renamed from: b  reason: collision with root package name */
    public int f59325b;

    /* renamed from: c  reason: collision with root package name */
    public String f59326c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f59327d;

    /* renamed from: e  reason: collision with root package name */
    public String f59328e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f59329f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59330a;

        /* renamed from: b  reason: collision with root package name */
        public String f59331b;

        /* renamed from: c  reason: collision with root package name */
        public int f59332c;

        /* renamed from: d  reason: collision with root package name */
        public String f59333d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f59334e;

        /* renamed from: f  reason: collision with root package name */
        public String f59335f;
        public boolean g;
        public int h;
        public int i;
        public String j;
        public boolean k;
        public boolean l;
        public int m;
        public int n;

        public final c a() {
            if (!PatchProxy.isSupport(new Object[0], this, f59330a, false, 64652, new Class[0], c.class)) {
                return new c(this, (byte) 0);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, f59330a, false, 64652, new Class[0], c.class);
        }

        public final a a(int i2) {
            this.f59332c = i2;
            return this;
        }

        public final a b(String str) {
            this.f59333d = str;
            return this;
        }

        public final a c(String str) {
            this.f59335f = str;
            return this;
        }

        public final a d(String str) {
            this.j = str;
            return this;
        }

        public final a a(String str) {
            this.f59331b = str;
            return this;
        }

        public final a b(boolean z) {
            this.k = z;
            return this;
        }

        public final a a(boolean z) {
            this.g = z;
            return this;
        }
    }

    private c(a aVar) {
        this.f59324a = aVar.f59331b;
        this.f59325b = aVar.f59332c;
        this.f59326c = aVar.f59333d;
        this.f59327d = aVar.f59334e;
        this.f59328e = aVar.f59335f;
        this.f59329f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.i = aVar.j;
        this.j = aVar.k;
        this.k = aVar.l;
        this.l = aVar.m;
        this.m = aVar.n;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
