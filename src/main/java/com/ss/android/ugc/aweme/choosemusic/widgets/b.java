package com.ss.android.ugc.aweme.choosemusic.widgets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.ui.p;

public final /* synthetic */ class b implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36187a;

    /* renamed from: b  reason: collision with root package name */
    private final ChallengeMusicWidget f36188b;

    b(ChallengeMusicWidget challengeMusicWidget) {
        this.f36188b = challengeMusicWidget;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36187a, false, 26982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36187a, false, 26982, new Class[0], Void.TYPE);
            return;
        }
        this.f36188b.g.a("music_loading", (Object) Boolean.FALSE);
    }
}
