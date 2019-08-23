package com.bytedance.scene.navigation;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.UiThread;
import android.support.v4.util.LruCache;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.a.b;
import com.bytedance.scene.a.c;
import com.bytedance.scene.animation.c;
import com.bytedance.scene.animation.interaction.a;
import com.bytedance.scene.b.d;
import com.bytedance.scene.b.h;
import com.bytedance.scene.b.i;
import com.bytedance.scene.b.j;
import com.bytedance.scene.b.k;
import com.bytedance.scene.f;
import com.bytedance.scene.l;
import com.bytedance.scene.navigation.f;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class e extends com.bytedance.scene.e implements d {
    public a i;
    public f j;
    public g k;
    public f l;
    public FrameLayout m;
    public FrameLayout n;
    @NonNull
    public c o = new com.bytedance.scene.animation.a.a();
    public final List<a.C0227a> p = new ArrayList();
    public final List<d> q = new ArrayList();
    private final LruCache<Class, com.bytedance.scene.group.f> r = new LruCache<>(3);
    private final List<com.bytedance.scene.b.f<Object, Boolean>> s = new ArrayList();
    private final SparseArrayCompat<com.bytedance.scene.a.a> t = new SparseArrayCompat<>();
    private final SparseArrayCompat<b> u = new SparseArrayCompat<>();
    private a.C0227a v = new a.C0227a() {
        public final void a() {
            for (a.C0227a a2 : new ArrayList(e.this.p)) {
                a2.a();
            }
        }
    };

    public interface a {
        boolean a();
    }

    public final void o() {
        super.o();
    }

    public final void a(@NonNull Class<? extends com.bytedance.scene.e> cls) {
        a(cls, (Bundle) null, new c.a().a());
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.scene.group.f fVar) {
        this.r.put(fVar.getClass(), fVar);
    }

    public final void a(@NonNull Class<? extends com.bytedance.scene.e> cls, Bundle bundle, com.bytedance.scene.a.c cVar) {
        if (k.a(this.f22093a)) {
            com.bytedance.scene.e eVar = null;
            if (com.bytedance.scene.group.f.class.isAssignableFrom(cls)) {
                eVar = (com.bytedance.scene.e) this.r.get(cls);
            }
            if (eVar == null) {
                eVar = h.a(cls, bundle);
            } else {
                eVar.g = bundle;
            }
            a(eVar, cVar);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean a() {
        e eVar = this;
        while (true) {
            e eVar2 = eVar.f22097e;
            if (eVar2 == null) {
                return eVar.i.a();
            }
            eVar = eVar2;
        }
    }

    public final void a(boolean z) {
        ((com.bytedance.scene.c.a) this.f22094b).setTouchEnabled(!z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@NonNull com.bytedance.scene.e eVar, boolean z) {
        if (eVar != this) {
            for (com.bytedance.scene.b.f next : this.s) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.a(eVar, z);
    }

    private void d() {
        com.bytedance.scene.e d2 = this.l.d();
        if (d2 != null) {
            i.a(d2.f22094b);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void g() {
        super.g();
        a(l.STARTED);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void h() {
        super.h();
        a(l.RESUMED);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void i() {
        a(l.STARTED);
        super.i();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void j() {
        a(l.STOPPED);
        super.j();
    }

    public final void u() {
        super.u();
        this.l.g();
    }

    private void e() {
        com.bytedance.scene.e d2 = this.l.d();
        if (d2 != null) {
            View view = d2.f22094b;
            if (view != null && Build.VERSION.SDK_INT >= 19) {
                view.cancelPendingInputEvents();
            }
        }
    }

    public final void c() {
        j.a();
        if (k.a(this.f22093a)) {
            d();
            e();
            this.l.a();
        }
    }

    public final void p() {
        new f.C0230f(this.l, l.NONE, (byte) 0).a(f.f22156f);
        super.p();
        this.t.clear();
        this.u.clear();
    }

    public final boolean b() {
        j.a();
        if (!k.a(this.f22093a)) {
            return false;
        }
        if (this.l.f()) {
            return true;
        }
        if (!this.l.c()) {
            return false;
        }
        c();
        return true;
    }

    public final void a(Configuration configuration) {
        this.l.a(configuration);
    }

    private void a(l lVar) {
        if (this.f22098f.value >= l.STOPPED.value) {
            this.l.a(lVar);
            return;
        }
        throw new IllegalArgumentException("dispatchCurrentChildState can only call when state is STOPPED, STARTED, RESUMED");
    }

    /* access modifiers changed from: package-private */
    public final i b(com.bytedance.scene.e eVar) {
        for (i next : this.l.f22158b.f22196a) {
            if (next.f22190a == eVar) {
                return next;
            }
        }
        return null;
    }

    @CallSuper
    public final void g(@Nullable Bundle bundle) {
        super.g(bundle);
        List<i> c2 = this.l.f22158b.c();
        ArrayList arrayList = new ArrayList();
        for (i iVar : c2) {
            arrayList.add(iVar.f22190a);
        }
        for (int i2 = 0; i2 <= arrayList.size() - 1; i2++) {
            ((com.bytedance.scene.e) arrayList.get(i2)).g(bundle);
        }
    }

    public final void e(@Nullable Bundle bundle) {
        super.e(bundle);
        this.l = new f(this);
        if (this.g != null) {
            Bundle bundle2 = this.g;
            String string = bundle2.getString("extra_rootScene");
            if (string != null) {
                g gVar = new g(string, bundle2.getBundle("extra_rootScene_arguments"));
                gVar.f22187c = bundle2.getBoolean("extra_drawWindowBackground");
                gVar.f22188d = bundle2.getBoolean("extra_fixSceneBackground_enabled");
                gVar.f22189e = bundle2.getInt("extra_sceneBackground");
                this.k = gVar;
                return;
            }
            throw new IllegalStateException("root scene class name cant be null");
        }
        throw new IllegalArgumentException("NavigationScene need NavigationSceneOptions bundle");
    }

    public final void h(@NonNull Bundle bundle) {
        super.h(bundle);
        f fVar = this.l;
        bundle.putParcelableArrayList("bd-scene-nav:record_stack", new ArrayList(fVar.f22158b.f22196a));
        ArrayList arrayList = new ArrayList();
        for (i iVar : fVar.f22158b.c()) {
            Bundle bundle2 = new Bundle();
            iVar.f22190a.h(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:navigation_scene_manager", arrayList);
    }

    public final void f(@Nullable Bundle bundle) {
        com.bytedance.scene.e eVar;
        super.f(bundle);
        com.bytedance.scene.e eVar2 = null;
        if (bundle != null) {
            f fVar = this.l;
            Activity s2 = s();
            com.bytedance.scene.f fVar2 = this.j;
            j jVar = fVar.f22158b;
            jVar.f22196a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:record_stack"));
            for (int i2 = 0; i2 < jVar.f22196a.size(); i2++) {
                i iVar = jVar.f22196a.get(i2);
                if (i2 != 0 || fVar2 == null) {
                    eVar = null;
                } else {
                    eVar = fVar2.a(s2.getClassLoader(), iVar.g, null);
                    if (!(eVar == null || eVar.f22095c == null)) {
                        throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                    }
                }
                if (eVar == null) {
                    eVar = h.a(s2, iVar.g, null);
                }
                iVar.f22190a = eVar;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:navigation_scene_manager");
            List c2 = fVar.f22158b.c();
            for (int i3 = 0; i3 <= c2.size() - 1; i3++) {
                f.a(fVar.f22157a, ((i) c2.get(i3)).f22190a, l.STOPPED, (Bundle) parcelableArrayList.get(i3), false, null);
            }
        } else {
            String str = this.k.f22185a;
            Bundle bundle2 = this.k.f22186b;
            if (this.j != null) {
                eVar2 = this.j.a(s().getClassLoader(), str, bundle2);
                if (!(eVar2 == null || eVar2.f22095c == null)) {
                    throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                }
            }
            if (eVar2 == null) {
                eVar2 = h.a(s(), str, bundle2);
            }
            this.l.a(eVar2, new c.a().a());
        }
        this.l.b();
        e eVar3 = this.f22097e;
        if (eVar3 != null) {
            AnonymousClass1 r0 = new h() {
                public final boolean a() {
                    if (e.this.f22098f.value < l.STARTED.value) {
                        return false;
                    }
                    return e.this.b();
                }
            };
            j.a();
            if (getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                eVar3.l.f22161e.add(com.bytedance.scene.b.f.a(this, r0));
                getLifecycle().addObserver(new NavigationScene$2(eVar3, r0));
            }
            AnonymousClass2 r02 = new c() {
                public final void a(Configuration configuration) {
                    e.this.a(configuration);
                }
            };
            j.a();
            if (getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                eVar3.l.h.add(r02);
                getLifecycle().addObserver(new NavigationScene$3(eVar3, r02));
            }
        }
    }

    public final void a(int i2, @NonNull int[] iArr) {
        if (((b) this.u.get(i2)) != null) {
            this.u.remove(i2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void c(@NonNull com.bytedance.scene.e eVar, boolean z) {
        if (eVar != this) {
            for (com.bytedance.scene.b.f next : this.s) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.c(eVar, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d(@NonNull com.bytedance.scene.e eVar, boolean z) {
        if (eVar != this) {
            for (com.bytedance.scene.b.f next : this.s) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.d(eVar, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void e(@NonNull com.bytedance.scene.e eVar, boolean z) {
        if (eVar != this) {
            for (com.bytedance.scene.b.f next : this.s) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.e(eVar, z);
    }

    private void a(@NonNull com.bytedance.scene.e eVar, @Nullable com.bytedance.scene.a.c cVar) {
        j.a();
        if (k.a(this.f22093a)) {
            if (eVar.f22095c != null) {
                if (eVar.f22095c == this) {
                    throw new IllegalArgumentException("Scene is already pushed");
                }
                throw new IllegalArgumentException("Scene already has a parent, parent " + eVar.f22095c);
            } else if (!a() || h.a(eVar)) {
                d();
                e();
                this.l.a(eVar, cVar);
            } else {
                throw new IllegalArgumentException("Scene must have only empty argument constructor when support restore");
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b(@NonNull com.bytedance.scene.e eVar, boolean z) {
        if (eVar != this) {
            for (com.bytedance.scene.b.f next : this.s) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.b(eVar, z);
    }

    @UiThread
    public final void a(@NonNull Lifecycle lifecycle, @NonNull d dVar) {
        j.a();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            this.q.add(dVar);
            lifecycle.addObserver(new NavigationScene$1(this, dVar));
        }
    }

    public final void a(int i2, int i3, Intent intent) {
        if (((com.bytedance.scene.a.a) this.t.get(i2)) != null) {
            this.t.remove(i2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b(@NonNull com.bytedance.scene.e eVar, Bundle bundle, boolean z) {
        if (eVar != this) {
            for (com.bytedance.scene.b.f next : this.s) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.b(eVar, bundle, z);
    }

    @NonNull
    public final View a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        com.bytedance.scene.c.a aVar = new com.bytedance.scene.c.a(r());
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setOnApplyWindowInsetsListener(new d());
        }
        aVar.setId(C0906R.id.bpz);
        aVar.setSupportRestore(a());
        this.m = new FrameLayout(r());
        if (Build.VERSION.SDK_INT >= 21) {
            this.m.setOnApplyWindowInsetsListener(new d());
        }
        aVar.addView(this.m);
        com.bytedance.scene.c.b bVar = new com.bytedance.scene.c.b(r());
        if (Build.VERSION.SDK_INT >= 21) {
            bVar.setOnApplyWindowInsetsListener(new d());
        }
        bVar.setTouchEnabled(false);
        this.n = bVar;
        aVar.addView(this.n);
        if (this.k.f22187c) {
            ViewCompat.setBackground(aVar, k.a((Context) r()));
        }
        return aVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@NonNull com.bytedance.scene.e eVar, Bundle bundle, boolean z) {
        if (eVar != this) {
            for (com.bytedance.scene.b.f next : this.s) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.a(eVar, bundle, z);
    }

    public final void a(@Nullable com.bytedance.scene.e eVar, @NonNull com.bytedance.scene.e eVar2, boolean z) {
        for (d a2 : new ArrayList(this.q)) {
            a2.a(eVar, eVar2, z);
        }
    }
}
