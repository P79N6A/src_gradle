package com.bytedance.scene.group;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.animation.b;
import com.bytedance.scene.b.f;
import com.bytedance.scene.b.h;
import com.bytedance.scene.b.j;
import com.bytedance.scene.e;
import com.bytedance.scene.group.d;
import com.bytedance.scene.l;
import java.util.ArrayList;
import java.util.List;

public abstract class c extends e {
    public static final b i = new b() {
    };
    public final d j = new d();
    private final List<f<Object, Boolean>> k = new ArrayList();

    @NonNull
    public abstract ViewGroup a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void g() {
        super.g();
        b(l.STARTED);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void h() {
        super.h();
        b(l.RESUMED);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void i() {
        b(l.STARTED);
        super.i();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void j() {
        b(l.STOPPED);
        super.j();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void k() {
        a(l.NONE);
        super.k();
    }

    public c() {
        this.j.f22113a = this;
    }

    private void a(@NonNull l lVar) {
        this.j.a(lVar);
    }

    private void b(@NonNull l lVar) {
        this.j.b(lVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b(@Nullable Bundle bundle) {
        super.b(bundle);
        a(l.STOPPED);
    }

    @Nullable
    public final <T extends e> T a(@NonNull String str) {
        j.a();
        if (str == null) {
            return null;
        }
        a a2 = this.j.a(str);
        if (a2 != null) {
            return a2.f22106b;
        }
        return null;
    }

    @CallSuper
    public final void g(@Nullable Bundle bundle) {
        super.g(bundle);
        List a2 = this.j.a();
        for (int i2 = 0; i2 <= a2.size() - 1; i2++) {
            ((e) a2.get(i2)).g(bundle);
        }
    }

    public final void b(@NonNull e eVar) {
        b bVar = i;
        j.a();
        d dVar = this.j;
        if (dVar.f22116e || dVar.f22115c.a(eVar) != null) {
            d.b bVar2 = new d.b(dVar, eVar, bVar, (byte) 0);
            if (dVar.f22116e) {
                dVar.f22117f.add(bVar2);
            } else {
                d.a((d.C0229d) bVar2);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    public final void c(@NonNull e eVar) {
        b bVar = i;
        j.a();
        d dVar = this.j;
        if (dVar.f22116e || dVar.f22115c.a(eVar) != null) {
            d.f fVar = new d.f(dVar, eVar, bVar, (byte) 0);
            if (dVar.f22116e) {
                dVar.f22117f.add(fVar);
            } else {
                d.a((d.C0229d) fVar);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    @CallSuper
    public final void h(@NonNull Bundle bundle) {
        super.h(bundle);
        d dVar = this.j;
        bundle.putParcelableArrayList("bd-scene-nav:group_stack", new ArrayList(dVar.f22115c.f22111a));
        ArrayList arrayList = new ArrayList();
        List a2 = dVar.a();
        for (int i2 = 0; i2 <= a2.size() - 1; i2++) {
            Bundle bundle2 = new Bundle();
            ((e) a2.get(i2)).h(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:group_scene_manager", arrayList);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final ViewGroup b(int i2) {
        ViewGroup viewGroup = (ViewGroup) this.f22094b.findViewById(i2);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            while (viewGroup2 != null && viewGroup2 != this.f22094b) {
                a a2 = this.j.f22115c.a((View) viewGroup2);
                if (a2 == null) {
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                } else {
                    throw new IllegalArgumentException(String.format("cant add Scene to child Scene %s view hierarchy ", new Object[]{a2.f22106b.toString()}));
                }
            }
            return viewGroup;
        }
        try {
            String resourceName = t().getResourceName(i2);
            throw new IllegalArgumentException(" " + resourceName + " view not found");
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(" " + i2 + " view not found");
        }
    }

    public final void e(@Nullable Bundle bundle) {
        super.e(bundle);
        if (bundle != null) {
            d dVar = this.j;
            Activity s = s();
            b bVar = dVar.f22115c;
            if (bVar.f22111a == null || bVar.f22111a.size() <= 0) {
                bVar.f22111a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:group_stack"));
                for (a next : bVar.f22111a) {
                    next.f22106b = h.a(s, next.f22110f, null);
                }
                List<a> b2 = dVar.f22115c.b();
                if (b2.size() != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
                    for (int i2 = 0; i2 <= b2.size() - 1; i2++) {
                        a aVar = b2.get(i2);
                        e eVar = aVar.f22106b;
                        aVar.g = (Bundle) parcelableArrayList.get(i2);
                        d.a(dVar.f22113a, eVar, dVar.f22113a.f22098f, true, null);
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("mSceneList size is not zero, Scene is added before restore");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@Nullable Bundle bundle, @NonNull ViewGroup viewGroup) {
        super.a(bundle, viewGroup);
        if (this.f22094b instanceof ViewGroup) {
            this.j.f22114b = (ViewGroup) this.f22094b;
            return;
        }
        throw new IllegalArgumentException("GroupScene onCreateView view must be ViewGroup");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d(@NonNull e eVar, boolean z) {
        if (eVar != this) {
            for (f next : this.k) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.d(eVar, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void e(@NonNull e eVar, boolean z) {
        if (eVar != this) {
            for (f next : this.k) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.e(eVar, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void c(@NonNull e eVar, boolean z) {
        if (eVar != this) {
            for (f next : this.k) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.c(eVar, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@NonNull e eVar, boolean z) {
        if (eVar != this) {
            for (f next : this.k) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.a(eVar, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b(@NonNull e eVar, boolean z) {
        if (eVar != this) {
            for (f next : this.k) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.b(eVar, z);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, @Nullable Bundle bundle) {
        return a(layoutInflater, viewGroup);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@NonNull e eVar, Bundle bundle, boolean z) {
        if (eVar != this) {
            for (f next : this.k) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.a(eVar, bundle, z);
    }

    public final void a(@IdRes int i2, @NonNull e eVar, @NonNull String str) {
        boolean z;
        String str2;
        b bVar = i;
        j.a();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag can't be empty");
        } else if (a(str) == null) {
            if (this.j.a(eVar) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int b2 = this.j.b(eVar);
                if (b2 == i2) {
                    String str3 = this.j.f22115c.a(eVar).f22107c;
                    if (!str3.equals(str)) {
                        throw new IllegalArgumentException("Scene is already added, tag " + str3);
                    }
                } else {
                    try {
                        str2 = t().getResourceName(b2);
                    } catch (Resources.NotFoundException unused) {
                        str2 = String.valueOf(b2);
                    }
                    throw new IllegalArgumentException("Scene is already added to another container, viewId " + str2);
                }
            }
            if (eVar.f22095c != null && eVar.f22095c != this) {
                throw new IllegalArgumentException("Scene already has a parent, parent " + eVar.f22095c);
            } else if (this.f22097e == null || !this.f22097e.a() || h.a(eVar)) {
                d dVar = this.j;
                d.a aVar = new d.a(dVar, i2, eVar, str, bVar, (byte) 0);
                if (dVar.f22116e) {
                    dVar.f22117f.add(aVar);
                } else {
                    d.a((d.C0229d) aVar);
                }
            } else {
                throw new IllegalArgumentException("Scene must have only empty argument constructor when support restore");
            }
        } else {
            throw new IllegalArgumentException("already have a Scene with tag " + str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b(@NonNull e eVar, Bundle bundle, boolean z) {
        if (eVar != this) {
            for (f next : this.k) {
                if (!z) {
                    ((Boolean) next.f22084b).booleanValue();
                }
            }
        }
        super.b(eVar, bundle, z);
    }
}
