package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;

public class ProAccountService extends BaseProAccountService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void switchProAccount(int i, String str, @Nullable IAccountService.h hVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, hVar}, this, changeQuickRedirect, false, 71477, new Class[]{Integer.TYPE, String.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, hVar}, this, changeQuickRedirect, false, 71477, new Class[]{Integer.TYPE, String.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        super.switchProAccount(i, str, hVar);
    }

    public void bindProAccountMobile(Activity activity, String str, @Nullable IAccountService.h hVar, int i, String str2) {
        if (PatchProxy.isSupport(new Object[]{activity, str, hVar, Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 71476, new Class[]{Activity.class, String.class, IAccountService.h.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, hVar, Integer.valueOf(i), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 71476, new Class[]{Activity.class, String.class, IAccountService.h.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        super.bindProAccountMobile(activity, str, hVar, i, str2);
    }
}
