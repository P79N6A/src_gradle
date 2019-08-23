package com.ss.android.ugc.aweme.newfollow.util;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57435a;

    /* renamed from: b  reason: collision with root package name */
    public int f57436b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f57437c;

    /* renamed from: d  reason: collision with root package name */
    public g f57438d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f57439e;

    /* renamed from: f  reason: collision with root package name */
    private Set<m> f57440f;
    private a g;

    public interface a {
        boolean k();
    }

    private int i() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61955, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61955, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f57438d != null) {
            i = this.f57438d.a();
        }
        return i;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61961, new Class[0], Void.TYPE);
            return;
        }
        this.f57440f.clear();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61963, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61963, new Class[0], Void.TYPE);
            return;
        }
        g();
        b();
        e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61951, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f57440f)) {
            for (m next : this.f57440f) {
                if (d(next) && !next.f57449f) {
                    next.f57449f = true;
                    next.c();
                }
            }
        }
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61962, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61962, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f57440f)) {
            for (m mVar : this.f57440f) {
                mVar.f57448e = 0;
            }
        }
    }

    public final void a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61950, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f57440f)) {
            for (m next : this.f57440f) {
                if (PatchProxy.isSupport(new Object[]{next}, this, f57435a, false, 61958, new Class[]{m.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{next}, this, f57435a, false, 61958, new Class[]{m.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Rect a2 = next.a();
                    int i = (a2.top + a2.bottom) / 2;
                    if (i < this.f57439e.getTop() + i() || i > this.f57439e.getBottom() + i()) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z && !next.g) {
                    next.g = true;
                    next.f();
                } else if (!z && next.g) {
                    next.g = false;
                    next.g();
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61952, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f57440f)) {
            for (m h : this.f57440f) {
                h.h();
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61953, new Class[0], Void.TYPE);
        } else if (this.f57436b == 2 || CollectionUtils.isEmpty(this.f57440f)) {
        } else {
            if (this.g == null || this.g.k()) {
                ArrayList arrayList = new ArrayList();
                for (m next : this.f57440f) {
                    if (c(next)) {
                        if (next.f57448e != 16) {
                            next.f57448e = 16;
                            arrayList.add(next);
                        }
                    } else if (next.f57448e == 16) {
                        next.f57448e = 32;
                        next.b();
                    }
                }
                Collections.sort(arrayList, new Comparator<m>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57441a;

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        m mVar = (m) obj;
                        m mVar2 = (m) obj2;
                        if (PatchProxy.isSupport(new Object[]{mVar, mVar2}, this, f57441a, false, 61968, new Class[]{m.class, m.class}, Integer.TYPE)) {
                            return ((Integer) PatchProxy.accessDispatch(new Object[]{mVar, mVar2}, this, f57441a, false, 61968, new Class[]{m.class, m.class}, Integer.TYPE)).intValue();
                        }
                        return mVar2.a().bottom - mVar.a().bottom;
                    }
                });
                for (int i = 0; i < arrayList.size(); i++) {
                    m mVar = (m) arrayList.get(i);
                    if (i == 0) {
                        mVar.b(this.f57436b);
                    } else {
                        mVar.f57448e = 32;
                        mVar.b();
                    }
                }
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57435a, false, 61954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57435a, false, 61954, new Class[0], Void.TYPE);
        } else if (this.f57436b == 2 || CollectionUtils.isEmpty(this.f57440f)) {
        } else {
            if (this.g == null || this.g.k()) {
                ArrayList arrayList = new ArrayList();
                for (m next : this.f57440f) {
                    if (c(next)) {
                        if (next.f57448e != 16) {
                            next.f57448e = 16;
                            arrayList.add(next);
                        }
                    } else if (next.f57448e == 16) {
                        next.f57448e = 32;
                        next.b();
                    }
                }
                Collections.sort(arrayList, new Comparator<m>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57443a;

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        m mVar = (m) obj;
                        m mVar2 = (m) obj2;
                        if (PatchProxy.isSupport(new Object[]{mVar, mVar2}, this, f57443a, false, 61969, new Class[]{m.class, m.class}, Integer.TYPE)) {
                            return ((Integer) PatchProxy.accessDispatch(new Object[]{mVar, mVar2}, this, f57443a, false, 61969, new Class[]{m.class, m.class}, Integer.TYPE)).intValue();
                        }
                        return mVar2.a().bottom - mVar.a().bottom;
                    }
                });
                for (int i = 0; i < arrayList.size(); i++) {
                    m mVar = (m) arrayList.get(i);
                    if (i == 0) {
                        mVar.a(this.f57436b);
                    } else {
                        mVar.f57448e = 32;
                        mVar.b();
                    }
                }
            }
        }
    }

    public l(RecyclerView recyclerView) {
        this(recyclerView, null, null);
    }

    private boolean c(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f57435a, false, 61956, new Class[]{m.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mVar}, this, f57435a, false, 61956, new Class[]{m.class}, Boolean.TYPE)).booleanValue();
        }
        int top = ((this.f57439e.getTop() + this.f57439e.getBottom()) / 2) - i();
        Rect a2 = mVar.a();
        if (a2.top > top || a2.bottom < top) {
            return false;
        }
        return true;
    }

    private boolean d(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f57435a, false, 61957, new Class[]{m.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mVar}, this, f57435a, false, 61957, new Class[]{m.class}, Boolean.TYPE)).booleanValue();
        }
        Rect a2 = mVar.a();
        int i = (a2.top + a2.bottom) / 2;
        if (Math.abs((i - this.f57439e.getBottom()) - i()) <= 10 || Math.abs((i - this.f57439e.getTop()) - i()) <= 10) {
            return true;
        }
        return false;
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{500L}, this, f57435a, false, 61965, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{500L}, this, f57435a, false, 61965, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57445a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f57445a, false, 61970, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57445a, false, 61970, new Class[0], Void.TYPE);
                    return;
                }
                l.this.e();
            }
        }, 500);
    }

    public final void b(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, f57435a, false, 61960, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, this, f57435a, false, 61960, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (mVar2 != null) {
            mVar.e();
        }
        this.f57440f.remove(mVar2);
    }

    public final void a(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, f57435a, false, 61959, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, this, f57435a, false, 61959, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (mVar2 != null) {
            mVar.e();
        }
        this.f57440f.add(mVar2);
    }

    public l(RecyclerView recyclerView, g gVar, a aVar) {
        this.f57440f = new LinkedHashSet();
        this.f57436b = 0;
        this.f57438d = gVar;
        this.g = aVar;
        this.f57439e = recyclerView;
        this.f57439e.addOnScrollListener(new RecyclerViewScrollStateManager$1(this));
    }
}
