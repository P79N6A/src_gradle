package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.preview.b.b;
import com.ss.android.ugc.aweme.poi.preview.b.c;
import com.ss.android.ugc.aweme.poi.preview.transfer.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60179a;
    public boolean A;
    public j.a B;

    /* renamed from: b  reason: collision with root package name */
    public int f60180b;

    /* renamed from: c  reason: collision with root package name */
    public int f60181c;

    /* renamed from: d  reason: collision with root package name */
    public int f60182d;

    /* renamed from: e  reason: collision with root package name */
    public int f60183e;

    /* renamed from: f  reason: collision with root package name */
    public int f60184f;
    public long g;
    public boolean h;
    public int i;
    public Drawable j;
    public Drawable k;
    public List<ImageView> l;
    public List<String> m;
    public List<String> n;
    public List<String> o;
    public c p;
    public b q;
    public com.ss.android.ugc.aweme.poi.preview.a.c r;
    @IdRes
    public int s;
    public AbsListView t;
    public RecyclerView u;
    public ViewPager v;
    public int w;
    public String x;
    public String y;
    public HashMap<String, String> z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60185a;

        /* renamed from: b  reason: collision with root package name */
        public int f60186b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f60187c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f60188d;

        /* renamed from: e  reason: collision with root package name */
        public ViewPager f60189e;

        /* renamed from: f  reason: collision with root package name */
        public int f60190f;
        public j.a g;
        private int h;
        private int i;
        private int j;
        private int k;
        private long l;
        private boolean m;
        private Drawable n;
        private Drawable o;
        private List<String> p;
        private List<String> q;
        private c r;
        private b s;
        private com.ss.android.ugc.aweme.poi.preview.a.c t;
        @IdRes
        private int u;
        private AbsListView v;
        private String w;
        private String x;
        private HashMap<String, String> y;
        private boolean z;

        public final g a() {
            if (PatchProxy.isSupport(new Object[0], this, f60185a, false, 65455, new Class[0], g.class)) {
                return (g) PatchProxy.accessDispatch(new Object[0], this, f60185a, false, 65455, new Class[0], g.class);
            }
            g gVar = new g();
            gVar.f60180b = this.h;
            gVar.f60181c = this.i;
            gVar.f60182d = this.j;
            gVar.f60183e = this.f60186b;
            gVar.f60184f = this.k;
            gVar.g = this.l;
            gVar.h = this.m;
            gVar.j = this.n;
            gVar.k = this.o;
            gVar.m = this.p;
            gVar.n = this.q;
            gVar.o = this.f60187c;
            gVar.p = this.r;
            gVar.q = this.s;
            gVar.r = this.t;
            gVar.s = this.u;
            gVar.t = this.v;
            gVar.u = this.f60188d;
            gVar.v = this.f60189e;
            gVar.w = this.f60190f;
            gVar.x = this.w;
            gVar.A = this.z;
            gVar.y = this.x;
            gVar.z = this.y;
            gVar.B = this.g;
            return gVar;
        }

        public final a a(b bVar) {
            this.s = bVar;
            return this;
        }

        public final a b(String str) {
            this.x = str;
            return this;
        }

        public final a c(int i2) {
            this.u = i2;
            return this;
        }

        public final a a(int i2) {
            this.j = C0906R.color.xv;
            return this;
        }

        public final a b(int i2) {
            this.k = -16777216;
            return this;
        }

        public final a a(c cVar) {
            this.r = cVar;
            return this;
        }

        public final a b(List<String> list) {
            this.q = list;
            return this;
        }

        public final a a(String str) {
            this.w = str;
            return this;
        }

        public final a b(boolean z2) {
            this.z = true;
            return this;
        }

        public final a a(HashMap<String, String> hashMap) {
            this.y = hashMap;
            return this;
        }

        public final a a(List<String> list) {
            this.p = list;
            return this;
        }

        public final a a(boolean z2) {
            this.m = true;
            return this;
        }
    }

    public final boolean d() {
        if (this.v != null) {
            return true;
        }
        return false;
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f60179a, true, 65444, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f60179a, true, 65444, new Class[0], a.class);
        }
        return new a();
    }

    public final List<ImageView> b() {
        if (PatchProxy.isSupport(new Object[0], this, f60179a, false, 65447, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f60179a, false, 65447, new Class[0], List.class);
        } else if (this.l == null) {
            return new ArrayList();
        } else {
            return this.l;
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f60179a, false, 65450, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60179a, false, 65450, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.n == null || this.n.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f60179a, false, 65454, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60179a, false, 65454, new Class[0], Integer.TYPE)).intValue();
        } else if (this.v == null) {
            return -1;
        } else {
            return this.v.getCurrentItem() % this.w;
        }
    }

    public final Drawable a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f60179a, false, 65445, new Class[]{Context.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{context}, this, f60179a, false, 65445, new Class[]{Context.class}, Drawable.class);
        } else if (this.j != null || this.f60182d == 0) {
            return this.j;
        } else {
            return com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), this.f60182d);
        }
    }

    public final Drawable b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f60179a, false, 65446, new Class[]{Context.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{context}, this, f60179a, false, 65446, new Class[]{Context.class}, Drawable.class);
        } else if (this.k != null || this.f60183e == 0) {
            return this.k;
        } else {
            return com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), this.f60183e);
        }
    }

    public final String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60179a, false, 65448, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60179a, false, 65448, new Class[]{Integer.TYPE}, String.class);
        } else if (CollectionUtils.isEmpty(this.o) || i2 < 0 || i2 >= this.o.size()) {
            return "";
        } else {
            return this.o.get(i2);
        }
    }
}
