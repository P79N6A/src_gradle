package com.ss.android.ugc.aweme.hotsearch.b;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicListResponse;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49689a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49690b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49691c;

    g(c cVar, String str) {
        this.f49690b = cVar;
        this.f49691c = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49689a, false, 49732, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49689a, false, 49732, new Class[]{i.class}, Object.class);
        }
        c cVar = this.f49690b;
        String str = this.f49691c;
        if (!iVar.c()) {
            if (iVar.d()) {
                cVar.f49681b.a("hot_search_status", (Object) 1);
            } else if (iVar.b()) {
                b bVar = new b();
                HotSearchMusicListResponse hotSearchMusicListResponse = (HotSearchMusicListResponse) iVar.e();
                hotSearchMusicListResponse.setEditionUid(str);
                bVar.a("hot_search_status", 0).a("action_type", 1).a("list_data", hotSearchMusicListResponse.list).a("hot_search_last_update_time", hotSearchMusicListResponse.lastUpdateTime).a("hot_search_share_info", hotSearchMusicListResponse.shareInfo).a("hot_search_log_pb", hotSearchMusicListResponse.logPb);
                cVar.f49681b.a("hot_search_banner", (Object) hotSearchMusicListResponse.bannerUrl);
                cVar.f49681b.a("hot_search_last_update_time", (Object) hotSearchMusicListResponse.lastUpdateTime);
                cVar.f49681b.a("hot_search_share_info", (Object) hotSearchMusicListResponse.shareInfo);
                cVar.f49681b.a("hot_search_data", (Object) bVar);
            }
        }
        return null;
    }
}
