package com.ss.android.ugc.aweme.newfollow.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.o;
import java.util.LinkedList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57428a;

    /* renamed from: b  reason: collision with root package name */
    private List<o> f57429b = new LinkedList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static j f57430a = new j();
    }

    public static j a() {
        return a.f57430a;
    }

    public final o b() {
        if (PatchProxy.isSupport(new Object[0], this, f57428a, false, 61941, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f57428a, false, 61941, new Class[0], o.class);
        }
        if (this.f57429b.size() >= 8) {
            o oVar = this.f57429b.get(this.f57429b.size() - 1);
            oVar.n();
            oVar.j();
            this.f57429b.remove(this.f57429b.size() - 1);
        }
        o oVar2 = new o();
        this.f57429b.add(oVar2);
        return oVar2;
    }

    public final void a(o oVar) {
        o oVar2 = oVar;
        if (PatchProxy.isSupport(new Object[]{oVar2}, this, f57428a, false, 61942, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar2}, this, f57428a, false, 61942, new Class[]{o.class}, Void.TYPE);
        } else if (oVar2 != null) {
            oVar.n();
            try {
                oVar.j();
                try {
                    this.f57429b.remove(oVar2);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }
    }
}
