package com.ss.android.ugc.aweme.hotsearch.b;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49683a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49684b;

    public d(c cVar) {
        this.f49684b = cVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49683a, false, 49729, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49683a, false, 49729, new Class[]{i.class}, Object.class);
        }
        c cVar = this.f49684b;
        if (!iVar.c()) {
            if (iVar.d()) {
                cVar.f49681b.a("hot_search_status", (Object) 1);
            } else if (iVar.b()) {
                b bVar = new b();
                HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) iVar.e();
                bVar.a("hot_search_status", 0).a("action_type", 1).a("list_data", hotSearchListResponse.getData().getList()).a("hot_search_last_update_time", hotSearchListResponse.getData().getLastUpdateTime()).a("hot_search_share_info", hotSearchListResponse.getData().getShareInfo()).a("hot_search_log_pb", hotSearchListResponse.getLogPb());
                cVar.f49681b.a("hot_search_data", (Object) bVar);
            }
        }
        return null;
    }
}
