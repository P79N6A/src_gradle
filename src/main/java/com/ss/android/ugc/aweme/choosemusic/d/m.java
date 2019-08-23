package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;

public final /* synthetic */ class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35845a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35846b;

    m(a aVar) {
        this.f35846b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35845a, false, 26749, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35845a, false, 26749, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35846b;
        aVar.g = false;
        if (iVar.d()) {
            aVar.f35805c.a("refresh_status_user_collected_music", (Object) 1);
        } else if (iVar.b()) {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.e();
            b bVar = new b();
            bVar.a("refresh_status_user_collected_music", 0).a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).a("action_type", 1).a("list_data", d.a(collectedMusicList.items));
            aVar.f35805c.a("user_collected_music_list", (Object) bVar);
        }
        return null;
    }
}
