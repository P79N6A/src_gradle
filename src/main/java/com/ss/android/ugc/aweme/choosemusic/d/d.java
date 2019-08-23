package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.music.model.MusicList;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35820a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35821b;

    d(a aVar) {
        this.f35821b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35820a, false, 26740, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35820a, false, 26740, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35821b;
        aVar.h = false;
        if (iVar.d()) {
            aVar.f35805c.a("refresh_status_hot_music_list", (Object) 1);
        } else if (iVar.b()) {
            MusicList musicList = (MusicList) iVar.e();
            b bVar = new b();
            bVar.a("refresh_status_hot_music_list", 0).a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 1).a("list_data", com.ss.android.ugc.aweme.choosemusic.f.d.a(musicList.items));
            aVar.f35805c.a("hot_music_list_data", (Object) bVar);
        }
        return null;
    }
}
