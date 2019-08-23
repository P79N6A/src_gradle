package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.a.a;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35824a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35825b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f35826c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35827d;

    /* renamed from: e  reason: collision with root package name */
    private final int f35828e;

    /* renamed from: f  reason: collision with root package name */
    private final int f35829f;

    f(a aVar, MusicModel musicModel, int i, int i2, int i3) {
        this.f35825b = aVar;
        this.f35826c = musicModel;
        this.f35827d = i;
        this.f35828e = i2;
        this.f35829f = i3;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35824a, false, 26742, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35824a, false, 26742, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35825b;
        MusicModel musicModel = this.f35826c;
        int i = this.f35827d;
        int i2 = this.f35828e;
        int i3 = this.f35829f;
        if (!iVar.c()) {
            if (iVar.d()) {
                musicModel.setCollectionType(i == 1 ? MusicModel.CollectionType.NOT_COLLECTED : MusicModel.CollectionType.COLLECTED);
                DataCenter dataCenter = aVar.f35805c;
                a aVar2 = new a(1, i, i2, i3, musicModel);
                dataCenter.a("music_collect_status", (Object) aVar2);
            } else if (iVar.b()) {
                musicModel.setCollectionType(i == 1 ? MusicModel.CollectionType.COLLECTED : MusicModel.CollectionType.NOT_COLLECTED);
                DataCenter dataCenter2 = aVar.f35805c;
                a aVar3 = new a(0, i, i2, i3, musicModel);
                dataCenter2.a("music_collect_status", (Object) aVar3);
            }
        }
        return null;
    }
}
