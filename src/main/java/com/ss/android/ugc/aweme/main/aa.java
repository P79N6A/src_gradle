package com.ss.android.ugc.aweme.main;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;

public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54313a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f54314b;

    aa(MainFragment mainFragment) {
        this.f54314b = mainFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54313a, false, 57332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54313a, false, 57332, new Class[0], Void.TYPE);
            return;
        }
        MainFragment mainFragment = this.f54314b;
        v.b((View) mainFragment.mFollowPillNotice, 8);
        mainFragment.g = System.currentTimeMillis();
    }
}
