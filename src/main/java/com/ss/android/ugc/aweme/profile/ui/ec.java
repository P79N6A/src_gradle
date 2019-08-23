package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;

public final /* synthetic */ class ec implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62724a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdateUserInfoDialog f62725b;

    ec(UpdateUserInfoDialog updateUserInfoDialog) {
        this.f62725b = updateUserInfoDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62724a, false, 69089, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62724a, false, 69089, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        UpdateUserInfoDialog updateUserInfoDialog = this.f62725b;
        updateUserInfoDialog.dismiss();
        if (updateUserInfoDialog.h) {
            SharePrefCache.inst().getLastCloseUpdateDialogTime().a(Long.valueOf(System.currentTimeMillis()));
        } else {
            SharePrefCache.inst().getLastCloseFeedUpdateDialogTime().a(Long.valueOf(System.currentTimeMillis()));
        }
    }
}
