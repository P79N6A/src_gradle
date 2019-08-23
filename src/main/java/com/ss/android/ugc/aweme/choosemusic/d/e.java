package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.music.model.MusicList;
import java.util.List;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35822a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35823b;

    public e(a aVar) {
        this.f35823b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35822a, false, 26741, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35822a, false, 26741, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35823b;
        aVar.h = false;
        if (iVar.d()) {
            aVar.f35805c.a("loadmore_status_hot_music_list", (Object) 1);
        } else if (iVar.b()) {
            MusicList musicList = (MusicList) iVar.e();
            List list = (List) ((b) aVar.f35805c.a("hot_music_list_data")).a("list_data");
            list.addAll(d.a(musicList.items));
            b bVar = new b();
            bVar.a("loadmore_status_hot_music_list", 0).a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 2).a("list_data", list);
            aVar.f35805c.a("hot_music_list_data", (Object) bVar);
        }
        return null;
    }
}
