package com.ss.android.ugc.aweme.antiaddic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g;
import java.util.ArrayList;
import java.util.Iterator;

public class d implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33384a;

    /* renamed from: c  reason: collision with root package name */
    private static d f33385c;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<g.a> f33386b = new ArrayList<>();

    private d() {
    }

    public static d d() {
        if (PatchProxy.isSupport(new Object[0], null, f33384a, true, 21696, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f33384a, true, 21696, new Class[0], d.class);
        }
        if (f33385c == null) {
            synchronized (d.class) {
                if (f33385c == null) {
                    f33385c = new d();
                }
            }
        }
        return f33385c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f33384a, false, 21701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33384a, false, 21701, new Class[0], Void.TYPE);
            return;
        }
        synchronized (d.class) {
            Iterator<g.a> it2 = this.f33386b.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f33384a, false, 21702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33384a, false, 21702, new Class[0], Void.TYPE);
            return;
        }
        synchronized (d.class) {
            Iterator<g.a> it2 = this.f33386b.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f33384a, false, 21703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33384a, false, 21703, new Class[0], Void.TYPE);
            return;
        }
        synchronized (d.class) {
            Iterator<g.a> it2 = this.f33386b.iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        }
    }

    public final void a(g.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f33384a, false, 21698, new Class[]{g.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f33384a, false, 21698, new Class[]{g.a.class}, Void.TYPE);
            return;
        }
        synchronized (d.class) {
            if (!this.f33386b.contains(aVar)) {
                this.f33386b.add(aVar);
            }
        }
    }
}
