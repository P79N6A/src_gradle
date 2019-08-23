package com.ss.android.ugc.aweme.choosemusic.widgets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.ui.p;

public final /* synthetic */ class e implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36194a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicBoardWidget f36195b;

    e(MusicBoardWidget musicBoardWidget) {
        this.f36195b = musicBoardWidget;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36194a, false, 27000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36194a, false, 27000, new Class[0], Void.TYPE);
            return;
        }
        this.f36195b.g.a("music_loading", (Object) Boolean.FALSE);
    }
}
