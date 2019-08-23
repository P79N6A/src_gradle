package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.music.model.MusicCollection;

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35837a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35838b;

    i(a aVar) {
        this.f35838b = aVar;
    }

    public final Object then(a.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35837a, false, 26745, new Class[]{a.i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35837a, false, 26745, new Class[]{a.i.class}, Object.class);
        }
        a aVar = this.f35838b;
        if (iVar.d()) {
            aVar.f35805c.a("refresh_status_music_sheet", (Object) 1);
        } else if (iVar.b()) {
            aVar.f35805c.a("refresh_status_music_sheet", (Object) 0);
            MusicCollection musicCollection = (MusicCollection) iVar.e();
            b bVar = new b();
            bVar.a("list_cursor", Long.valueOf(musicCollection.cursor)).a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).a("action_type", 1).a("list_data", musicCollection.getItems());
            aVar.f35805c.a("music_sheet_list", (Object) bVar);
        }
        return null;
    }
}
