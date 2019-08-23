package com.bytedance.scene;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.ContextThemeWrapper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.i;
import java.util.ArrayList;
import java.util.List;

public abstract class e implements LifecycleOwner, ViewModelStoreOwner {

    /* renamed from: a  reason: collision with root package name */
    public Activity f22093a;

    /* renamed from: b  reason: collision with root package name */
    public View f22094b;

    /* renamed from: c  reason: collision with root package name */
    public e f22095c;

    /* renamed from: d  reason: collision with root package name */
    public i.a f22096d = i.f22137a;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.scene.navigation.e f22097e;

    /* renamed from: f  reason: collision with root package name */
    public l f22098f = l.NONE;
    public Bundle g;
    public int h;
    private ContextThemeWrapper i;
    private LayoutInflater j;
    private i k;
    private StringBuilder l = new StringBuilder(this.f22098f.name);
    private Handler m = new Handler(Looper.getMainLooper());
    private List<Runnable> n = new ArrayList();
    private boolean o = false;
    private boolean p = false;
    private a q = new a(new LifecycleRegistry(this), (byte) 0);

    static class a extends Lifecycle {

        /* renamed from: a  reason: collision with root package name */
        final LifecycleRegistry f22101a;

        /* renamed from: b  reason: collision with root package name */
        final List<LifecycleObserver> f22102b;

        @NonNull
        public final Lifecycle.State getCurrentState() {
            return this.f22101a.getCurrentState();
        }

        /* access modifiers changed from: package-private */
        public final void a(@NonNull Lifecycle.Event event) {
            this.f22101a.handleLifecycleEvent(event);
        }

        private a(LifecycleRegistry lifecycleRegistry) {
            this.f22102b = new ArrayList();
            this.f22101a = lifecycleRegistry;
        }

        public final void addObserver(@NonNull LifecycleObserver lifecycleObserver) {
            this.f22102b.add(lifecycleObserver);
            this.f22101a.addObserver(lifecycleObserver);
        }

        public final void removeObserver(@NonNull LifecycleObserver lifecycleObserver) {
            this.f22102b.remove(lifecycleObserver);
            this.f22101a.removeObserver(lifecycleObserver);
        }

        /* synthetic */ a(LifecycleRegistry lifecycleRegistry, byte b2) {
            this(lifecycleRegistry);
        }
    }

    static class b implements i.b {

        /* renamed from: a  reason: collision with root package name */
        public ViewModelStore f22103a;

        public final void a() {
            this.f22103a.clear();
        }

        private b(@NonNull ViewModelStore viewModelStore) {
            this.f22103a = viewModelStore;
        }

        /* synthetic */ b(ViewModelStore viewModelStore, byte b2) {
            this(viewModelStore);
        }
    }

    @NonNull
    public abstract View a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @Nullable Bundle bundle);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void m() {
        this.f22095c = null;
    }

    @Deprecated
    @CallSuper
    public void o() {
        this.o = true;
    }

    @CallSuper
    public void p() {
        this.o = true;
    }

    @NonNull
    public final Lifecycle getLifecycle() {
        return this.q;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a(@NonNull e eVar, boolean z) {
        e eVar2 = this.f22095c;
        if (eVar2 != null) {
            eVar2.a(eVar, eVar == this);
        }
    }

    @CallSuper
    public void u() {
        this.o = true;
        v();
    }

    private boolean b() {
        if (this.f22098f.value >= l.STARTED.value) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Context q() {
        if (this.f22093a == null) {
            return null;
        }
        return this.f22093a.getApplicationContext();
    }

    public final Resources t() {
        return s().getResources();
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void v() {
        boolean b2 = b();
        if (b2 != this.p) {
            this.p = b2;
        }
    }

    public final i w() {
        if (this.k != null) {
            return this.k;
        }
        throw new IllegalStateException("Scope is not created, you can't call before onCreate");
    }

    @NonNull
    public final ContextThemeWrapper r() {
        ContextThemeWrapper a2 = a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Scene " + this + " not attached to an activity.");
    }

    @NonNull
    public final Activity s() {
        Activity activity = this.f22093a;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Scene " + this + " not attached to an activity.");
    }

    @Nullable
    private ContextThemeWrapper a() {
        ContextThemeWrapper contextThemeWrapper;
        if (this.f22093a == null) {
            return null;
        }
        if (this.i == null) {
            if (this.f22093a != null) {
                if (this.h > 0) {
                    contextThemeWrapper = new Scene$1(this, this.f22093a, this.h);
                } else {
                    contextThemeWrapper = new Scene$2(this, this.f22093a, this.f22093a.getTheme());
                }
                this.i = contextThemeWrapper;
            } else {
                throw new IllegalStateException("onGetContextThemeWrapper() cannot be executed until the Scene is attached to the Activity.");
            }
        }
        return this.i;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final LayoutInflater f() {
        if (this.j == null) {
            if (this.f22093a != null) {
                this.j = this.f22093a.getLayoutInflater().cloneInContext(r());
            } else {
                throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
            }
        }
        return this.j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g() {
        a(l.STARTED);
        this.o = false;
        this.o = true;
        v();
        if (this.o) {
            this.q.a(Lifecycle.Event.ON_START);
            a(this, false);
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onStart()");
    }

    @NonNull
    public final ViewModelStore getViewModelStore() {
        i w = w();
        if (w.f22141d.containsKey(b.class)) {
            return ((b) w.a(b.class)).f22103a;
        }
        ViewModelStore viewModelStore = new ViewModelStore();
        w.a(b.class, new b(viewModelStore, (byte) 0));
        return viewModelStore;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void i() {
        this.q.a(Lifecycle.Event.ON_PAUSE);
        a(l.STARTED);
        this.o = false;
        this.o = true;
        if (this.o) {
            d(this, false);
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onPause()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void j() {
        this.q.a(Lifecycle.Event.ON_STOP);
        a(l.STOPPED);
        this.o = false;
        u();
        if (this.o) {
            c(this, false);
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onStop()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void k() {
        this.q.a(Lifecycle.Event.ON_DESTROY);
        a(l.NONE);
        this.o = false;
        p();
        if (this.o) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f22094b.cancelPendingInputEvents();
            }
            this.f22094b = null;
            this.j = null;
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onDestroyView()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void l() {
        this.o = false;
        this.o = true;
        if (this.o) {
            e(this, false);
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onDestroy()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void n() {
        Activity activity = this.f22093a;
        this.f22093a = null;
        this.i = null;
        this.o = false;
        this.o = true;
        if (this.o) {
            if (!activity.isChangingConfigurations()) {
                this.k.b();
            }
            this.k = null;
            this.n.clear();
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onDetach()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void h() {
        a(l.RESUMED);
        this.o = false;
        this.o = true;
        if (this.n.size() > 0) {
            ArrayList<Runnable> arrayList = new ArrayList<>(this.n);
            for (final Runnable runnable : arrayList) {
                AnonymousClass1 r4 = new Runnable() {
                    public final void run() {
                        runnable.run();
                    }
                };
                if (this.f22098f == l.RESUMED) {
                    r4.run();
                } else {
                    this.n.add(r4);
                }
            }
            this.n.removeAll(arrayList);
        }
        if (this.o) {
            this.q.a(Lifecycle.Event.ON_RESUME);
            b(this, false);
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onResume()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d(Bundle bundle) {
        h(bundle);
    }

    @Deprecated
    @CallSuper
    public void e(@Nullable Bundle bundle) {
        this.o = true;
    }

    @CallSuper
    public void g(@Nullable Bundle bundle) {
        this.o = true;
    }

    public final <T extends View> T a(@IdRes int i2) {
        return this.f22094b.findViewById(i2);
    }

    private void a(l lVar) {
        this.f22098f = lVar;
        StringBuilder sb = this.l;
        sb.append(" - " + lVar.name);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b(Bundle bundle) {
        a(l.STOPPED);
        this.o = false;
        f(bundle);
        if (this.o) {
            this.q.a(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onActivityCreated()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void c(@Nullable Bundle bundle) {
        this.o = false;
        g(bundle);
        if (!this.o) {
            throw new m("Scene " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    @CallSuper
    public void h(@NonNull Bundle bundle) {
        if (this.g != null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
            bundle.putBundle("bd-scene-nav:scene_argument", this.g);
        } else {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        bundle.putString("scope_key", this.k.f22139b);
        b(this, bundle, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(Activity activity) {
        this.f22093a = activity;
        if (this.q.getCurrentState() != Lifecycle.State.INITIALIZED) {
            a aVar = this.q;
            for (LifecycleObserver removeObserver : aVar.f22102b) {
                aVar.f22101a.removeObserver(removeObserver);
            }
            aVar.f22101a.markState(Lifecycle.State.INITIALIZED);
            for (LifecycleObserver addObserver : aVar.f22102b) {
                aVar.f22101a.addObserver(addObserver);
            }
        }
    }

    @CallSuper
    public void f(@Nullable Bundle bundle) {
        View decorView = s().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & 1024) != 0) {
            ViewCompat.requestApplyInsets(decorView);
        } else if ((systemUiVisibility & 512) != 0) {
            ViewCompat.requestApplyInsets(decorView);
        }
        this.o = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@Nullable Bundle bundle) {
        if (this.f22095c == null) {
            this.k = this.f22096d.a();
        } else {
            i w = this.f22095c.w();
            String str = null;
            if (bundle != null) {
                str = bundle.getString("scope_key");
            }
            if (TextUtils.isEmpty(str)) {
                str = i.a();
            }
            i iVar = w.f22140c.get(str);
            if (iVar == null) {
                iVar = new i(w, str);
                w.f22140c.put(str, iVar);
            }
            this.k = iVar;
        }
        if (bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
            Bundle bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            if (bundle2 != null) {
                bundle2.setClassLoader(getClass().getClassLoader());
                this.g = bundle2;
            } else {
                throw new IllegalStateException("can't get Scene arguments from savedInstanceState");
            }
        }
        this.o = false;
        e(bundle);
        if (this.o) {
            a(this, bundle, false);
            return;
        }
        throw new m("Scene " + this + " did not call through to super.onCreate()");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@Nullable e eVar) {
        if (eVar != null) {
            this.f22095c = eVar;
            if (this.f22095c instanceof com.bytedance.scene.navigation.e) {
                this.f22097e = (com.bytedance.scene.navigation.e) this.f22095c;
            } else {
                this.f22097e = this.f22095c.f22097e;
            }
        }
        this.o = false;
        o();
        if (!this.o) {
            throw new m("Scene " + this + " did not call through to super.onAttach()");
        }
    }

    @CallSuper
    public void a(@NonNull View view, @Nullable Bundle bundle) {
        this.o = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void c(@NonNull e eVar, boolean z) {
        boolean z2;
        e eVar2 = this.f22095c;
        if (eVar2 != null) {
            if (eVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            eVar2.c(eVar, z2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d(@NonNull e eVar, boolean z) {
        boolean z2;
        e eVar2 = this.f22095c;
        if (eVar2 != null) {
            if (eVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            eVar2.d(eVar, z2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void e(@NonNull e eVar, boolean z) {
        boolean z2;
        e eVar2 = this.f22095c;
        if (eVar2 != null) {
            if (eVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            eVar2.e(eVar, z2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b(@NonNull e eVar, boolean z) {
        boolean z2;
        e eVar2 = this.f22095c;
        if (eVar2 != null) {
            if (eVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            eVar2.b(eVar, z2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a(@Nullable Bundle bundle, @NonNull ViewGroup viewGroup) {
        if (this.f22094b == null) {
            View a2 = a(f(), viewGroup, bundle);
            if (a2 == null) {
                throw new IllegalArgumentException("onCreateView cant return null");
            } else if (a2.getParent() == null) {
                a2.getId();
                this.f22094b = a2;
                this.o = false;
                a(this.f22094b, bundle);
                if (!this.o) {
                    throw new m("Scene " + this + " did not call through to super.onViewCreated()");
                }
            } else {
                throw new IllegalArgumentException("onCreateView return view already has a parent. You must call removeView() on the view's parent first.");
            }
        } else {
            throw new IllegalArgumentException("Scene already call onCreateView");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b(@NonNull e eVar, Bundle bundle, boolean z) {
        boolean z2;
        e eVar2 = this.f22095c;
        if (eVar2 != null) {
            if (eVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            eVar2.b(eVar, bundle, z2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a(@NonNull e eVar, Bundle bundle, boolean z) {
        boolean z2;
        e eVar2 = this.f22095c;
        if (eVar2 != null) {
            if (eVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            eVar2.a(eVar, bundle, z2);
        }
    }
}
