package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35987a;

    /* renamed from: b  reason: collision with root package name */
    private final NewMusicListFragment f35988b;

    m(NewMusicListFragment newMusicListFragment) {
        this.f35988b = newMusicListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35987a, false, 26661, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35987a, false, 26661, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        NewMusicListFragment newMusicListFragment = this.f35988b;
        if (newMusicListFragment.i != null) {
            newMusicListFragment.i.a();
        }
    }
}
