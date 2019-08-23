package com.ss.android.ugc.aweme.hotsearch.b;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49692a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49693b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49694c;

    h(c cVar, String str) {
        this.f49693b = cVar;
        this.f49694c = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49692a, false, 49733, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49692a, false, 49733, new Class[]{i.class}, Object.class);
        }
        c cVar = this.f49693b;
        String str = this.f49694c;
        if (!iVar.c()) {
            if (iVar.d()) {
                cVar.f49681b.a("hot_search_status", (Object) 1);
            } else if (iVar.b()) {
                b bVar = new b();
                j jVar = (j) iVar.e();
                if (PatchProxy.isSupport(new Object[]{str}, jVar, j.f49697a, false, 49735, new Class[]{String.class}, Void.TYPE)) {
                    j jVar2 = jVar;
                    PatchProxy.accessDispatch(new Object[]{str}, jVar2, j.f49697a, false, 49735, new Class[]{String.class}, Void.TYPE);
                } else if (!CollectionUtils.isEmpty(jVar.f49698b)) {
                    for (k kVar : jVar.f49698b) {
                        kVar.f49708f = str;
                    }
                }
                bVar.a("hot_search_status", 0).a("action_type", 1).a("list_data", jVar.f49698b).a("hot_search_last_update_time", jVar.f49699c).a("hot_search_share_info", jVar.f49701e).a("hot_search_log_pb", jVar.f49702f);
                cVar.f49681b.a("hot_search_banner", (Object) jVar.f49700d);
                cVar.f49681b.a("hot_search_last_update_time", (Object) jVar.f49699c);
                cVar.f49681b.a("hot_search_share_info", (Object) jVar.f49701e);
                cVar.f49681b.a("hot_search_data", (Object) bVar);
            }
        }
        return null;
    }
}
