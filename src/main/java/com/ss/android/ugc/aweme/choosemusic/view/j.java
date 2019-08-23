package com.ss.android.ugc.aweme.choosemusic.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.b.d;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

public final /* synthetic */ class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36057a;

    /* renamed from: b  reason: collision with root package name */
    private final i f36058b;

    j(i iVar) {
        this.f36058b = iVar;
    }

    public final void a(MusicCollectionItem musicCollectionItem, int i) {
        MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
        if (PatchProxy.isSupport(new Object[]{musicCollectionItem2, Integer.valueOf(i)}, this, f36057a, false, 26857, new Class[]{MusicCollectionItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicCollectionItem2, Integer.valueOf(i)}, this, f36057a, false, 26857, new Class[]{MusicCollectionItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f36058b.a(musicCollectionItem2, i);
    }
}
