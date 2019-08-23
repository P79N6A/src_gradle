package com.ss.android.ugc.aweme.choosemusic.widgets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.ui.p;

public final /* synthetic */ class h implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36200a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerMusicWidget f36201b;

    h(StickerMusicWidget stickerMusicWidget) {
        this.f36201b = stickerMusicWidget;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36200a, false, 27029, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36200a, false, 27029, new Class[0], Void.TYPE);
            return;
        }
        this.f36201b.g.a("music_loading", (Object) Boolean.FALSE);
    }
}
