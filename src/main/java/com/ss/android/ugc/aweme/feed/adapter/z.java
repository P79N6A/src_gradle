package com.ss.android.ugc.aweme.feed.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.util.m;
import com.ss.android.ugc.aweme.poi.e.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44975a;

    /* renamed from: b  reason: collision with root package name */
    Set<m> f44976b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public int f44977c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f44978d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f44979e = true;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f44980f;

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f44975a, false, 40645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44975a, false, 40645, new Class[0], Void.TYPE);
            return;
        }
        f();
        b();
        c();
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f44975a, false, 40644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44975a, false, 40644, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f44976b)) {
            for (m mVar : this.f44976b) {
                mVar.f57448e = 0;
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f44975a, false, 40646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44975a, false, 40646, new Class[0], Void.TYPE);
            return;
        }
        for (m next : this.f44976b) {
            if (next.f57448e == 16) {
                next.f57448e = 32;
                next.b();
            }
        }
    }

    public final void a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f44975a, false, 40635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44975a, false, 40635, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f44976b)) {
            for (m next : this.f44976b) {
                if (PatchProxy.isSupport(new Object[]{next}, this, f44975a, false, 40640, new Class[]{m.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{next}, this, f44975a, false, 40640, new Class[]{m.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Rect a2 = next.a();
                    int i = (a2.top + a2.bottom) / 2;
                    if (i < this.f44980f.getTop() || i > this.f44980f.getBottom()) {
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

    public final void b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f44975a, false, 40636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44975a, false, 40636, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f44976b)) {
            for (m next : this.f44976b) {
                if (PatchProxy.isSupport(new Object[]{next}, this, f44975a, false, 40639, new Class[]{m.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{next}, this, f44975a, false, 40639, new Class[]{m.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Rect a2 = next.a();
                    int i = (a2.top + a2.bottom) / 2;
                    if (Math.abs(i - this.f44980f.getBottom()) <= 10 || Math.abs(i - this.f44980f.getTop()) <= 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z && !next.f57449f) {
                    next.f57449f = true;
                    next.c();
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f44975a, false, 40637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44975a, false, 40637, new Class[0], Void.TYPE);
        } else if (this.f44977c == 2 || !e.b() || CollectionUtils.isEmpty(this.f44976b)) {
        } else {
            if (!NetworkUtils.isWifi(this.f44980f.getContext())) {
                for (m next : this.f44976b) {
                    if (next.f57448e == 16) {
                        next.b();
                    }
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (m next2 : this.f44976b) {
                if (c(next2)) {
                    if (next2.f57448e != 16) {
                        next2.f57448e = 16;
                    }
                    arrayList.add(next2);
                } else if (next2.f57448e == 16) {
                    next2.f57448e = 32;
                    next2.b();
                }
            }
            Collections.sort(arrayList, new Comparator<m>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44981a;

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    m mVar = (m) obj;
                    m mVar2 = (m) obj2;
                    if (PatchProxy.isSupport(new Object[]{mVar, mVar2}, this, f44981a, false, 40650, new Class[]{m.class, m.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{mVar, mVar2}, this, f44981a, false, 40650, new Class[]{m.class, m.class}, Integer.TYPE)).intValue();
                    }
                    return mVar.a().top - mVar2.a().top;
                }
            });
            for (int i = 0; i < arrayList.size(); i++) {
                m mVar = (m) arrayList.get(i);
                if (i != 0) {
                    mVar.f57448e = 32;
                    mVar.b();
                } else if (this.f44979e) {
                    mVar.a(this.f44977c);
                }
            }
        }
    }

    public z(RecyclerView recyclerView) {
        this.f44980f = recyclerView;
        this.f44980f.addOnScrollListener(new StaggeredGridScrollStateManager$1(this));
    }

    public final void a(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, f44975a, false, 40641, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, this, f44975a, false, 40641, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (mVar2 != null) {
            mVar.e();
        }
        this.f44976b.add(mVar2);
    }

    public final void b(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, f44975a, false, 40642, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, this, f44975a, false, 40642, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (mVar2 != null) {
            if (mVar2.f57448e == 16) {
                mVar.b();
            }
            mVar.e();
        }
        this.f44976b.remove(mVar2);
    }

    private boolean c(m mVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f44975a, false, 40638, new Class[]{m.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mVar}, this, f44975a, false, 40638, new Class[]{m.class}, Boolean.TYPE)).booleanValue();
        } else if (!mVar.d()) {
            return false;
        } else {
            Rect a2 = mVar.a();
            if (a2.top >= this.f44980f.getTop() ? !(a2.bottom <= this.f44980f.getBottom() || (((float) (this.f44980f.getBottom() - a2.top)) * 1.0f) / ((float) (a2.bottom - a2.top)) >= 0.75f) : (((float) (a2.bottom - this.f44980f.getTop())) * 1.0f) / ((float) (a2.bottom - a2.top)) < 0.75f) {
                z = false;
            }
            return z;
        }
    }
}
