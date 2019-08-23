package com.ss.android.ugc.aweme.choosemusic.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.music.a.c;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36050a;

    /* renamed from: b  reason: collision with root package name */
    private final ChooseMusicFragmentView f36051b;

    d(ChooseMusicFragmentView chooseMusicFragmentView) {
        this.f36051b = chooseMusicFragmentView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36050a, false, 26844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36050a, false, 26844, new Class[0], Void.TYPE);
            return;
        }
        ChooseMusicFragmentView chooseMusicFragmentView = this.f36051b;
        if (chooseMusicFragmentView.mSearchEditView != null) {
            chooseMusicFragmentView.mSearchEditView.requestFocus();
            KeyboardUtils.b(chooseMusicFragmentView.mSearchEditView);
            bg.a(new c(false));
        }
    }
}
