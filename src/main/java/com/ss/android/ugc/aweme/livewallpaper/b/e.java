package com.ss.android.ugc.aweme.livewallpaper.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53619a = null;

    /* renamed from: f  reason: collision with root package name */
    private static int f53620f = 12375;
    private static int g = 12374;

    /* renamed from: b  reason: collision with root package name */
    protected d f53621b;

    /* renamed from: c  reason: collision with root package name */
    private Object f53622c;

    /* renamed from: d  reason: collision with root package name */
    private int f53623d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f53624e = -1;

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f53619a, false, 56103, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53619a, false, 56103, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f53623d < 0) {
            return this.f53621b.a(this.f53622c, f53620f);
        } else {
            return this.f53623d;
        }
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f53619a, false, 56104, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53619a, false, 56104, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f53624e < 0) {
            return this.f53621b.a(this.f53622c, g);
        } else {
            return this.f53624e;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f53619a, false, 56105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53619a, false, 56105, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f53621b;
        Object obj = this.f53622c;
        if (PatchProxy.isSupport(new Object[]{obj}, dVar, d.f53617a, false, 56090, new Class[]{Object.class}, Void.TYPE)) {
            Object[] objArr = {obj};
            d dVar2 = dVar;
            PatchProxy.accessDispatch(objArr, dVar2, d.f53617a, false, 56090, new Class[]{Object.class}, Void.TYPE);
        } else {
            dVar.f53618b.a(obj);
        }
        this.f53622c = null;
        this.f53623d = -1;
        this.f53624e = -1;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f53619a, false, 56106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53619a, false, 56106, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f53621b;
        Object obj = this.f53622c;
        if (PatchProxy.isSupport(new Object[]{obj}, dVar, d.f53617a, false, 56093, new Class[]{Object.class}, Void.TYPE)) {
            Object[] objArr = {obj};
            d dVar2 = dVar;
            PatchProxy.accessDispatch(objArr, dVar2, d.f53617a, false, 56093, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dVar.f53618b.c(obj);
    }

    public final boolean e() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f53619a, false, 56108, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53619a, false, 56108, new Class[0], Boolean.TYPE)).booleanValue();
        }
        d dVar = this.f53621b;
        Object obj = this.f53622c;
        if (PatchProxy.isSupport(new Object[]{obj}, dVar, d.f53617a, false, 56096, new Class[]{Object.class}, Boolean.TYPE)) {
            d dVar2 = dVar;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, dVar2, d.f53617a, false, 56096, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else {
            z = dVar.f53618b.d(obj);
        }
        return z;
    }

    public e(d dVar) {
        this.f53621b = dVar;
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f53619a, false, 56109, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f53619a, false, 56109, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        d dVar = this.f53621b;
        Object obj = this.f53622c;
        if (PatchProxy.isSupport(new Object[]{obj, new Long(j2)}, dVar, d.f53617a, false, 56097, new Class[]{Object.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {obj, new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = d.f53617a;
            Object[] objArr2 = objArr;
            d dVar2 = dVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr2, dVar2, changeQuickRedirect2, false, 56097, new Class[]{Object.class, Long.TYPE}, Void.TYPE);
            return;
        }
        dVar.f53618b.a(obj, j2);
    }

    public final void a(Object obj) {
        Object obj2;
        Object obj3 = obj;
        if (PatchProxy.isSupport(new Object[]{obj3}, this, f53619a, false, 56101, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj3}, this, f53619a, false, 56101, new Class[]{Object.class}, Void.TYPE);
        } else if (this.f53622c == null) {
            d dVar = this.f53621b;
            if (PatchProxy.isSupport(new Object[]{obj3}, dVar, d.f53617a, false, 56091, new Class[]{Object.class}, Object.class)) {
                d dVar2 = dVar;
                obj2 = PatchProxy.accessDispatch(new Object[]{obj3}, dVar2, d.f53617a, false, 56091, new Class[]{Object.class}, Object.class);
            } else {
                obj2 = dVar.f53618b.b(obj3);
            }
            this.f53622c = obj2;
        } else {
            throw new IllegalStateException("surface already created");
        }
    }

    public final void a(int i, int i2) {
        Object obj;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53619a, false, 56102, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53619a, false, 56102, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f53622c == null) {
            d dVar = this.f53621b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, dVar, d.f53617a, false, 56092, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class)) {
                d dVar2 = dVar;
                obj = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, dVar2, d.f53617a, false, 56092, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class);
            } else {
                obj = dVar.f53618b.a(i3, i4);
            }
            this.f53622c = obj;
            this.f53623d = i3;
            this.f53624e = i4;
        } else {
            throw new IllegalStateException("surface already created");
        }
    }
}
