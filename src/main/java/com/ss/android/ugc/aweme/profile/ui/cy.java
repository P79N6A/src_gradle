package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cy implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62617a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditSignatureFragment f62618b;

    cy(ProfileEditSignatureFragment profileEditSignatureFragment) {
        this.f62618b = profileEditSignatureFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62617a, false, 68817, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62617a, false, 68817, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ProfileEditSignatureFragment profileEditSignatureFragment = this.f62618b;
        if (profileEditSignatureFragment.getActivity() instanceof EditSelfBriefActivity) {
            profileEditSignatureFragment.b();
            return;
        }
        profileEditSignatureFragment.b();
        profileEditSignatureFragment.dismiss();
    }
}
