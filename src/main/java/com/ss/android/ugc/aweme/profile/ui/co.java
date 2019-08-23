package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class co implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62597a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditIdFragment f62598b;

    co(ProfileEditIdFragment profileEditIdFragment) {
        this.f62598b = profileEditIdFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62597a, false, 68765, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62597a, false, 68765, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ProfileEditIdFragment profileEditIdFragment = this.f62598b;
        if (profileEditIdFragment.a()) {
            profileEditIdFragment.b();
            profileEditIdFragment.dismiss();
        }
    }
}
