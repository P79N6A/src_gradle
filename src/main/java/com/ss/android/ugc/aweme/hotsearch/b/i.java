package com.ss.android.ugc.aweme.hotsearch.b;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49695a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49696b;

    i(c cVar) {
        this.f49696b = cVar;
    }

    public final Object then(a.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49695a, false, 49734, new Class[]{a.i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49695a, false, 49734, new Class[]{a.i.class}, Object.class);
        }
        c cVar = this.f49696b;
        if (!iVar.c()) {
            if (iVar.d()) {
                b bVar = new b();
                bVar.a("picker_status", 1);
                cVar.f49681b.a("hot_search_picker", (Object) bVar);
            } else if (iVar.b()) {
                b bVar2 = new b();
                bVar2.a("picker_status", 0).a("picker_list", ((l) iVar.e()).f49709a);
                cVar.f49681b.a("hot_search_picker", (Object) bVar2);
            }
        }
        return null;
    }
}
