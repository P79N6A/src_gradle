package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity;

public class PasswordService extends BasePasswordService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void changePassword(Activity activity, @Nullable IAccountService.h hVar) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, hVar}, this, changeQuickRedirect, false, 71475, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, hVar}, this, changeQuickRedirect, false, 71475, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        super.changePassword(activity, hVar);
        activity2.startActivity(new Intent(activity2, UpdatePasswordActivity.class));
    }

    public void setPassword(Activity activity, @Nullable IAccountService.h hVar) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, hVar}, this, changeQuickRedirect, false, 71474, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, hVar}, this, changeQuickRedirect, false, 71474, new Class[]{Activity.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        super.setPassword(activity, hVar);
        activity2.startActivity(new Intent(activity2, UpdatePasswordActivity.class));
    }
}
