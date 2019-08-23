package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cs implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62605a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditLocationFragment f62606b;

    cs(ProfileEditLocationFragment profileEditLocationFragment) {
        this.f62606b = profileEditLocationFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62605a, false, 68788, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62605a, false, 68788, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ProfileEditLocationFragment profileEditLocationFragment = this.f62606b;
        if (PatchProxy.isSupport(new Object[0], profileEditLocationFragment, ProfileEditLocationFragment.f62201c, false, 68786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], profileEditLocationFragment, ProfileEditLocationFragment.f62201c, false, 68786, new Class[0], Void.TYPE);
            return;
        }
        profileEditLocationFragment.dismiss();
    }
}
