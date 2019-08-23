package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35992a;

    /* renamed from: b  reason: collision with root package name */
    private final NewMusicTabFragment f35993b;

    p(NewMusicTabFragment newMusicTabFragment) {
        this.f35993b = newMusicTabFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35992a, false, 26708, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35992a, false, 26708, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f35993b.d();
    }
}
