package com.ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76274a;

    /* renamed from: b  reason: collision with root package name */
    private List<o> f76275b = new LinkedList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static u f76276a = new u();
    }

    public static u a() {
        return a.f76276a;
    }

    public final synchronized o b() {
        if (PatchProxy.isSupport(new Object[0], this, f76274a, false, 89030, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f76274a, false, 89030, new Class[0], o.class);
        } else if (!o.f76179d) {
            return o.b();
        } else {
            for (o next : this.f76275b) {
                if (next.f76181c) {
                    return next;
                }
            }
            return c();
        }
    }

    public final synchronized o c() {
        if (PatchProxy.isSupport(new Object[0], this, f76274a, false, 89032, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f76274a, false, 89032, new Class[0], o.class);
        } else if (!o.f76179d) {
            return o.b();
        } else {
            o oVar = new o();
            this.f76275b.add(oVar);
            return oVar;
        }
    }

    public final synchronized void d() {
        if (PatchProxy.isSupport(new Object[0], this, f76274a, false, 89034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76274a, false, 89034, new Class[0], Void.TYPE);
        } else if (o.f76179d) {
            for (o next : this.f76275b) {
                if (next != null && !next.f76181c) {
                    next.i();
                }
            }
            this.f76275b.clear();
        }
    }

    public final synchronized void a(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, f76274a, false, 89033, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, f76274a, false, 89033, new Class[]{o.class}, Void.TYPE);
        } else if (o.f76179d) {
            if (oVar != null) {
                oVar.i();
                this.f76275b.remove(oVar);
            }
        }
    }

    public final synchronized o a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76274a, false, 89031, new Class[]{String.class}, o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[]{str}, this, f76274a, false, 89031, new Class[]{String.class}, o.class);
        } else if (!o.f76179d) {
            return o.b();
        } else {
            ArrayList<o> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(str)) {
                for (o next : this.f76275b) {
                    if (next.f76183f != null && str.equals(next.f76183f.getUri())) {
                        return next;
                    }
                    if (!next.f76181c) {
                        arrayList.add(next);
                    }
                }
            }
            for (o a2 : arrayList) {
                a(a2);
            }
            return c();
        }
    }
}
