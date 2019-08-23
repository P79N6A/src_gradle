package com.ss.android.ugc.aweme.poi.ui.accelerate;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.poi.model.an;
import com.ss.android.ugc.aweme.poi.model.t;
import com.ss.android.ugc.aweme.poi.ui.h;
import com.ss.android.ugc.aweme.poi.ui.i;
import java.util.ArrayList;
import java.util.List;

public final class a extends h<com.ss.android.ugc.aweme.poi.model.h> {
    public static ChangeQuickRedirect s;
    public boolean t;
    private an u;

    /* renamed from: v */
    public final com.ss.android.ugc.aweme.poi.model.h i() {
        return (com.ss.android.ugc.aweme.poi.model.h) this.f2978e;
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66194, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, s, false, 66194, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.u != null && this.u.getException() == null && s()) {
            z = true;
        }
        return z;
    }

    public final t t() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66197, new Class[0], t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[0], this, s, false, 66197, new Class[0], t.class);
        } else if (this.u != null) {
            return this.u.getActivity();
        } else {
            return null;
        }
    }

    public final List<b> u() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66192, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, s, false, 66192, new Class[0], List.class);
        } else if (this.f2978e != null) {
            return ((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).getItems();
        } else {
            return new ArrayList();
        }
    }

    public final boolean s() {
        t tVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66196, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, s, false, 66196, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.u != null) {
            tVar = this.u.getActivity();
        } else {
            tVar = null;
        }
        if (tVar != null && tVar.isValid()) {
            z = true;
        }
        return z;
    }

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66189, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((i) this.f2979f).isViewValid()) {
            int i = ((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                    case 5:
                        i iVar = (i) this.f2979f;
                        List<b> items = ((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).getItems();
                        if (((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).isHasMore() && !((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).isNewDataEmpty()) {
                            z = true;
                        }
                        iVar.b(items, z);
                        break;
                }
                return;
            }
            this.t = false;
            ((i) this.f2979f).a(((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).getItems(), ((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).isHasMore());
        }
    }

    public a(h.a aVar) {
        super(aVar);
    }

    public final void a(List<b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, s, false, 66191, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, s, false, 66191, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f2978e != null) {
            ((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).setItems(list);
        }
    }

    public final void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, s, false, 66195, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, s, false, 66195, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (!(this.u == null || this.u.getException() == null)) {
            com.ss.android.ugc.aweme.app.api.a.a.a((Context) activity, (Throwable) this.u.getException());
        }
    }

    public final void a(an anVar) {
        if (PatchProxy.isSupport(new Object[]{anVar}, this, s, false, 66193, new Class[]{an.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{anVar}, this, s, false, 66193, new Class[]{an.class}, Void.TYPE);
            return;
        }
        this.u = anVar;
        if (this.f3761b != null) {
            if (d()) {
                this.f3761b.o();
            }
            if (c().getActivity() != null) {
                a((Activity) c().getActivity());
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, s, false, 66190, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, s, false, 66190, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((i) this.f2979f).isViewValid()) {
            ((i) this.f2979f).b(false);
            int i = ((com.ss.android.ugc.aweme.poi.model.h) this.f2978e).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                        ((i) this.f2979f).c(1);
                        return;
                    case 5:
                        ((i) this.f2979f).c(5);
                        break;
                }
                return;
            }
            ((i) this.f2979f).a(1);
            this.t = true;
        }
    }
}
