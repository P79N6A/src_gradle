package com.bytedance.android.livesdk.browser.fragment;

import android.view.View;
import com.bytedance.android.livesdk.j.c.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9370a;

    /* renamed from: b  reason: collision with root package name */
    private final FullWebDialogFragment f9371b;

    a(FullWebDialogFragment fullWebDialogFragment) {
        this.f9371b = fullWebDialogFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9370a, false, 3484, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9370a, false, 3484, new Class[]{View.class}, Void.TYPE);
            return;
        }
        FullWebDialogFragment fullWebDialogFragment = this.f9371b;
        if (PatchProxy.isSupport(new Object[0], fullWebDialogFragment, FullWebDialogFragment.f9350e, false, 3475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], fullWebDialogFragment, FullWebDialogFragment.f9350e, false, 3475, new Class[0], Void.TYPE);
        } else {
            com.bytedance.android.livesdk.j.a.a().a("click_withdraw_popup", new j().b("video").f("show").a(fullWebDialogFragment.g).c("popup").g("close"));
        }
        fullWebDialogFragment.dismiss();
    }
}
