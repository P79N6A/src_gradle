package com.ss.android.ugc.aweme.feed.preload;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45775a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f45776b = new f();

    /* renamed from: c  reason: collision with root package name */
    private SparseArray<a> f45777c = new SparseArray<>();

    public static f a() {
        return f45776b;
    }

    private f() {
        a(1, new i());
        a(2, new d());
        a(3, new e());
        a(4, new h());
    }

    public final c a(int i) {
        if (PatchProxy.isSupport(new Object[]{4}, this, f45775a, false, 41981, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{4}, this, f45775a, false, 41981, new Class[]{Integer.TYPE}, c.class);
        }
        a aVar = this.f45777c.get(4);
        if (aVar != null) {
            return aVar;
        }
        if (!a.a()) {
            return null;
        }
        throw new IllegalStateException("Preload Command not register !");
    }

    private void a(int i, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2}, this, f45775a, false, 41980, new Class[]{Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2}, this, f45775a, false, 41980, new Class[]{Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        this.f45777c.put(i, aVar2);
    }
}
