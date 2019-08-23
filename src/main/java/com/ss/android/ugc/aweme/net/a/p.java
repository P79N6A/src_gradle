package com.ss.android.ugc.aweme.net.a;

import android.app.Application;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.ttnet.c;
import com.facebook.common.internal.Preconditions;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.f;
import java.util.List;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56866a;

    /* renamed from: b  reason: collision with root package name */
    public Application f56867b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ttnet.a.a f56868c;

    /* renamed from: d  reason: collision with root package name */
    public f f56869d;

    /* renamed from: e  reason: collision with root package name */
    public c f56870e;

    /* renamed from: f  reason: collision with root package name */
    public int f56871f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public List<Interceptor> s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56872a;

        /* renamed from: b  reason: collision with root package name */
        public Application f56873b;

        /* renamed from: c  reason: collision with root package name */
        public com.bytedance.ttnet.a.a f56874c;

        /* renamed from: d  reason: collision with root package name */
        public f f56875d;

        /* renamed from: e  reason: collision with root package name */
        public c f56876e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f56877f;
        public boolean g;
        public int h;
        public String i;
        public String j;
        public String k;
        public boolean l;
        public String m;
        public boolean n;
        public boolean o;
        public boolean p;
        public int q;
        public String r;
        public List<Interceptor> s;

        public final p a() {
            if (!PatchProxy.isSupport(new Object[0], this, f56872a, false, 60908, new Class[0], p.class)) {
                return new p(this, (byte) 0);
            }
            return (p) PatchProxy.accessDispatch(new Object[0], this, f56872a, false, 60908, new Class[0], p.class);
        }

        public final a a(int i2) {
            this.h = i2;
            return this;
        }

        public final a b(String str) {
            this.r = str;
            return this;
        }

        public final a c(String str) {
            this.i = str;
            return this;
        }

        public final a d(String str) {
            this.j = str;
            return this;
        }

        public final a e(String str) {
            this.k = str;
            return this;
        }

        public final a a(com.bytedance.ttnet.a.a aVar) {
            this.f56874c = aVar;
            return this;
        }

        public final a b(boolean z) {
            this.p = z;
            return this;
        }

        public final a c(boolean z) {
            this.f56877f = z;
            return this;
        }

        public final a d(boolean z) {
            this.g = z;
            return this;
        }

        public final a e(boolean z) {
            this.l = true;
            return this;
        }

        private a(Application application) {
            this.f56873b = (Application) Preconditions.checkNotNull(application);
        }

        public final a a(c cVar) {
            this.f56876e = cVar;
            return this;
        }

        public final a a(f fVar) {
            this.f56875d = fVar;
            return this;
        }

        public final a a(String str) {
            this.m = str;
            return this;
        }

        public final a a(List<Interceptor> list) {
            this.s = list;
            return this;
        }

        public final a a(boolean z) {
            this.o = z;
            return this;
        }

        /* synthetic */ a(Application application, byte b2) {
            this(application);
        }
    }

    public static a a(Application application) {
        Application application2 = application;
        if (!PatchProxy.isSupport(new Object[]{application2}, null, f56866a, true, 60907, new Class[]{Application.class}, a.class)) {
            return new a(application2, (byte) 0);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{application2}, null, f56866a, true, 60907, new Class[]{Application.class}, a.class);
    }

    private p(a aVar) {
        this.f56867b = (Application) Preconditions.checkNotNull(aVar.f56873b);
        this.f56868c = (com.bytedance.ttnet.a.a) Preconditions.checkNotNull(aVar.f56874c);
        this.f56869d = (f) Preconditions.checkNotNull(aVar.f56875d);
        this.f56870e = (c) Preconditions.checkNotNull(aVar.f56876e);
        this.f56871f = aVar.h;
        this.g = aVar.i;
        this.h = aVar.j;
        this.i = aVar.k;
        this.j = aVar.l;
        this.k = aVar.r;
        this.l = aVar.m;
        this.o = aVar.f56877f;
        this.p = aVar.g;
        this.n = aVar.o;
        this.m = aVar.n;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.s;
    }

    /* synthetic */ p(a aVar, byte b2) {
        this(aVar);
    }
}
