package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import java.util.List;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35835a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35836b;

    public h(a aVar) {
        this.f35836b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35835a, false, 26744, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35835a, false, 26744, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35836b;
        aVar.f35806d = false;
        if (!iVar.c()) {
            if (iVar.d()) {
                aVar.f35805c.a("collection_feed_status", (Object) 1);
            } else if (iVar.b()) {
                t tVar = (t) iVar.e();
                aVar.f35805c.a("collection_feed_cursor", (Object) Integer.valueOf(tVar.f35862b));
                aVar.f35805c.a("collection_feed_has_more", (Object) Integer.valueOf(tVar.f35863c));
                List list = (List) aVar.f35805c.a("list");
                if (list == null) {
                    aVar.f35805c.a("collection_feed_status", (Object) 1);
                } else {
                    for (s next : ((t) iVar.e()).f35861a) {
                        list.add(new r(d.a(next.f35860b), next.f35859a, 2));
                    }
                    aVar.f35805c.a("list", (Object) list);
                    aVar.f35805c.a("collection_feed_status", (Object) 0);
                }
            }
        }
        return null;
    }
}
