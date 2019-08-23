package com.bytedance.scene;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.bytedance.scene.i;
import com.bytedance.scene.navigation.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private e f22135a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f22136b;

    public final void a() {
        if (this.f22135a.f22098f == l.STOPPED) {
            this.f22135a.g();
            return;
        }
        throw new IllegalStateException("NavigationScene state must be STOPPED");
    }

    public final void b() {
        if (this.f22135a.f22098f == l.STARTED) {
            this.f22135a.h();
            return;
        }
        throw new IllegalStateException("NavigationScene state must be STARTED");
    }

    public final void c() {
        if (this.f22135a.f22098f == l.RESUMED) {
            this.f22135a.i();
            return;
        }
        throw new IllegalStateException("NavigationScene state must be RESUMED");
    }

    public final void d() {
        if (this.f22135a.f22098f == l.STARTED) {
            this.f22135a.j();
            return;
        }
        throw new IllegalStateException("NavigationScene state must be STARTED");
    }

    public final void e() {
        if (this.f22135a.f22098f == l.STOPPED) {
            this.f22135a.k();
            this.f22135a.l();
            this.f22135a.m();
            this.f22135a.n();
            this.f22135a.j = null;
            this.f22135a.i = null;
            this.f22135a.f22096d = null;
            this.f22135a = null;
            return;
        }
        throw new IllegalStateException("NavigationScene state must be STOPPED");
    }

    public final void a(@NonNull Configuration configuration) {
        if (this.f22135a != null) {
            this.f22135a.a(configuration);
        }
    }

    public final void a(@NonNull Bundle bundle) {
        if (this.f22136b) {
            this.f22135a.d(bundle);
            return;
        }
        throw new IllegalArgumentException("cant invoke onSaveInstanceState when not support restore");
    }

    public final void b(@NonNull Bundle bundle) {
        if (this.f22135a.f22098f != l.STOPPED) {
            throw new IllegalStateException("NavigationScene state must be STOPPED");
        } else if (this.f22136b) {
            this.f22135a.c(bundle);
        } else {
            throw new IllegalArgumentException("cant invoke onViewStateRestored when not support restore");
        }
    }

    public final void a(@NonNull Activity activity, @NonNull ViewGroup viewGroup, @NonNull e eVar, @NonNull e.a aVar, @NonNull i.a aVar2, @Nullable f fVar, @Nullable Bundle bundle) {
        if (eVar.f22098f != l.NONE) {
            throw new IllegalStateException("NavigationScene state must be NONE");
        } else if (activity == null) {
            throw new NullPointerException("activity can't be null");
        } else if (eVar == null) {
            throw new NullPointerException("viewGroup can't be null");
        } else if (eVar == null) {
            throw new NullPointerException("navigationScene can't be null");
        } else if (eVar == null) {
            throw new NullPointerException("navigationSceneHost can't be null");
        } else if (eVar != null) {
            this.f22136b = aVar.a();
            if (this.f22136b || bundle == null) {
                this.f22135a = eVar;
                this.f22135a.f22096d = aVar2;
                this.f22135a.i = aVar;
                this.f22135a.j = fVar;
                this.f22135a.a(activity);
                this.f22135a.a((e) null);
                this.f22135a.a(bundle);
                this.f22135a.a(bundle, viewGroup);
                viewGroup.addView(this.f22135a.f22094b);
                this.f22135a.b(bundle);
                return;
            }
            throw new IllegalArgumentException("savedInstanceState should be null when not support restore");
        } else {
            throw new NullPointerException("rootScopeFactory can't be null");
        }
    }
}
