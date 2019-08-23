package com.ss.android.ugc.aweme.hotsearch.b;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.discover.model.HotVideoListResponse;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49685a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49686b;

    public e(c cVar) {
        this.f49686b = cVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49685a, false, 49730, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49685a, false, 49730, new Class[]{i.class}, Object.class);
        }
        c cVar = this.f49686b;
        if (!iVar.c()) {
            if (iVar.d()) {
                cVar.f49681b.a("hot_search_status", (Object) 1);
            } else if (iVar.b()) {
                b bVar = new b();
                HotVideoListResponse hotVideoListResponse = (HotVideoListResponse) iVar.e();
                b bVar2 = new b(1);
                bVar2.handleData(hotVideoListResponse);
                bVar.a("hot_search_status", 0).a("action_type", 1).a("list_data", hotVideoListResponse.mHotVideoItemList).a("hot_search_last_update_time", hotVideoListResponse.lastUpdateTime).a("hot_search_share_info", hotVideoListResponse.shareInfo).a("hot_search_log_pb", hotVideoListResponse.logPb).a("hot_search_video_model", bVar2);
                cVar.f49681b.a("hot_search_data", (Object) bVar);
            }
        }
        return null;
    }
}
