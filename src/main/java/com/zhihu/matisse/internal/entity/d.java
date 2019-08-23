package com.zhihu.matisse.internal.entity;

import android.support.annotation.StyleRes;
import com.zhihu.matisse.b;
import com.zhihu.matisse.c.c;
import java.util.List;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Set<b> f82646a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f82647b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f82648c;
    @StyleRes

    /* renamed from: d  reason: collision with root package name */
    public int f82649d;

    /* renamed from: e  reason: collision with root package name */
    public int f82650e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f82651f;
    public int g;
    public int h;
    public int i;
    public List<com.zhihu.matisse.b.a> j;
    public boolean k;
    public b l;
    public int m;
    public int n;
    public float o;
    public com.zhihu.matisse.a.a p;
    public boolean q;
    public c r;
    public boolean s;
    public boolean t;
    public int u;
    public com.zhihu.matisse.c.a v;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f82652a = new d((byte) 0);
    }

    private d() {
    }

    public static d a() {
        return a.f82652a;
    }

    public final boolean c() {
        if (this.f82650e != -1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f82651f || (this.g != 1 && (this.h != 1 || this.i != 1))) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (!this.f82648c || !b.ofImage().containsAll(this.f82646a)) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (!this.f82648c || !b.ofVideo().containsAll(this.f82646a)) {
            return false;
        }
        return true;
    }

    /* synthetic */ d(byte b2) {
        this();
    }
}
