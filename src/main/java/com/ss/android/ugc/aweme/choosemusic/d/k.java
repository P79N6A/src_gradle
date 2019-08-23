package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.music.model.MusicList;

public final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35841a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35842b;

    k(a aVar) {
        this.f35842b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35841a, false, 26747, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35841a, false, 26747, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35842b;
        aVar.f35808f = false;
        if (iVar.d()) {
            aVar.f35805c.a("refresh_status_music_list", (Object) 1);
        } else if (iVar.b()) {
            aVar.f35805c.a("refresh_status_music_list", (Object) 0);
            MusicList musicList = (MusicList) iVar.e();
            b bVar = new b();
            bVar.a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 1).a("list_data", d.a(musicList.items));
            aVar.f35805c.a("music_list", (Object) bVar);
        }
        return null;
    }
}
