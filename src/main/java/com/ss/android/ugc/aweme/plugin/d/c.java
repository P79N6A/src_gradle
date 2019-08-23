package com.ss.android.ugc.aweme.plugin.d;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.plugin.a.a;
import com.ss.android.ugc.aweme.plugin.e.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class c implements a.C0664a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59283a;

    /* renamed from: b  reason: collision with root package name */
    private Context f59284b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f59285c = new ArrayList();

    public final void b(b bVar) {
    }

    public c(Context context) {
        this.f59284b = context;
        for (com.bytedance.frameworks.plugin.a.b bVar : com.bytedance.frameworks.plugin.d.b.a().c()) {
            this.f59285c.add(bVar.f2145a);
        }
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59283a, false, 64616, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59283a, false, 64616, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar2.f59320c.isSucceed() && !bVar2.f59319b.j) {
            if (this.f59285c.contains(bVar2.f59319b.f59324a)) {
                com.bytedance.frameworks.plugin.pm.c.a(new File(bVar2.f59321d.f59308c, bVar2.f59321d.f59307b).getPath(), true, 0);
            }
        }
    }
}
