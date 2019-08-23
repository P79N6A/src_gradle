package com.ss.android.ugc.awemepushlib.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.awemepushapi.g;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76967a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f76968c;

    /* renamed from: b  reason: collision with root package name */
    public List<g> f76969b;

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f76967a, true, 90370, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f76967a, true, 90370, new Class[0], c.class);
        }
        if (f76968c == null) {
            synchronized (c.class) {
                if (f76968c == null) {
                    f76968c = new c();
                }
            }
        }
        return f76968c;
    }

    public final void a(com.ss.android.ugc.awemepushlib.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f76967a, false, 90373, new Class[]{com.ss.android.ugc.awemepushlib.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f76967a, false, 90373, new Class[]{com.ss.android.ugc.awemepushlib.a.c.class}, Void.TYPE);
        } else if (this.f76969b != null && this.f76969b.size() != 0) {
            for (g a2 : this.f76969b) {
                a2.a(cVar);
            }
        }
    }
}
