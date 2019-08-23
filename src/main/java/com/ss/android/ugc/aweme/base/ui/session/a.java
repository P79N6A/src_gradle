package com.ss.android.ugc.aweme.base.ui.session;

import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35002a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<C0450a<T>> f35003b = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.base.ui.session.a$a  reason: collision with other inner class name */
    public interface C0450a<T> {
        void a(T t);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35002a, false, 25154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35002a, false, 25154, new Class[0], Void.TYPE);
            return;
        }
        this.f35003b.clear();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35002a, false, 25157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35002a, false, 25157, new Class[0], Void.TYPE);
            return;
        }
        b();
        b.a().a(this);
    }

    private void a(C0450a<T> aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f35002a, false, 25152, new Class[]{C0450a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f35002a, false, 25152, new Class[]{C0450a.class}, Void.TYPE);
            return;
        }
        if (!this.f35003b.contains(aVar)) {
            this.f35003b.add(aVar);
        }
    }

    public final a<T> a(LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, this, f35002a, false, 25151, new Class[]{LifecycleOwner.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, this, f35002a, false, 25151, new Class[]{LifecycleOwner.class}, a.class);
        }
        lifecycleOwner.getLifecycle().addObserver(new Session$2(this));
        return this;
    }

    public final void a(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f35002a, false, 25155, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f35002a, false, 25155, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Iterator<C0450a<T>> it2 = this.f35003b.iterator();
        while (it2.hasNext()) {
            it2.next().a(t2);
        }
        a();
    }

    public final void a(LifecycleOwner lifecycleOwner, @NonNull C0450a aVar) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, aVar}, this, f35002a, false, 25150, new Class[]{LifecycleOwner.class, C0450a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, aVar}, this, f35002a, false, 25150, new Class[]{LifecycleOwner.class, C0450a.class}, Void.TYPE);
            return;
        }
        a(aVar);
        lifecycleOwner.getLifecycle().addObserver(new Session$1(this, aVar));
    }
}
