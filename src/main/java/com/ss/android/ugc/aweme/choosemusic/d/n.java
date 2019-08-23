package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.List;

public final /* synthetic */ class n implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35847a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35848b;

    public n(a aVar) {
        this.f35848b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35847a, false, 26750, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35847a, false, 26750, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35848b;
        aVar.g = false;
        if (iVar.d()) {
            aVar.f35805c.a("loadmore_status_user_collected_music", (Object) 1);
        } else if (iVar.b()) {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.e();
            List list = (List) ((b) aVar.f35805c.a("user_collected_music_list")).a("list_data");
            list.addAll(d.a(collectedMusicList.items));
            b bVar = new b();
            bVar.a("loadmore_status_user_collected_music", 0).a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).a("action_type", 2).a("list_data", list);
            aVar.f35805c.a("user_collected_music_list", (Object) bVar);
        }
        return null;
    }
}
