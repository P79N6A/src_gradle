package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import java.util.List;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35839a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35840b;

    public j(a aVar) {
        this.f35840b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35839a, false, 26746, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35839a, false, 26746, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35840b;
        if (iVar.d()) {
            aVar.f35805c.a("loadmore_status_music_sheet", (Object) 1);
        } else if (iVar.b()) {
            aVar.f35805c.a("loadmore_status_music_sheet", (Object) 0);
            MusicCollection musicCollection = (MusicCollection) iVar.e();
            List list = (List) ((b) aVar.f35805c.a("music_sheet_list")).a("list_data");
            list.addAll(musicCollection.getItems());
            b bVar = new b();
            bVar.a("list_cursor", Long.valueOf(musicCollection.cursor)).a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).a("action_type", 2).a("list_data", list);
            aVar.f35805c.a("music_sheet_list", (Object) bVar);
        }
        return null;
    }
}
