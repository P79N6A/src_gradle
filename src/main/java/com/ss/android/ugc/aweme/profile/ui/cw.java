package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62613a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditNicknameFragment f62614b;

    cw(ProfileEditNicknameFragment profileEditNicknameFragment) {
        this.f62614b = profileEditNicknameFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62613a, false, 68799, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62613a, false, 68799, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ProfileEditNicknameFragment profileEditNicknameFragment = this.f62614b;
        profileEditNicknameFragment.b();
        profileEditNicknameFragment.dismiss();
    }
}
