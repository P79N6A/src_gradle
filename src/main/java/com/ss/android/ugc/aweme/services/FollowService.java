package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IFollowService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;

public class FollowService implements IFollowService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void sendRequest(String str, int i, IFollowService.IFollowCallback iFollowCallback) {
        String str2 = str;
        IFollowService.IFollowCallback iFollowCallback2 = iFollowCallback;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), iFollowCallback2}, this, changeQuickRedirect, false, 71381, new Class[]{String.class, Integer.TYPE, IFollowService.IFollowCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), iFollowCallback2}, this, changeQuickRedirect, false, 71381, new Class[]{String.class, Integer.TYPE, IFollowService.IFollowCallback.class}, Void.TYPE);
            return;
        }
        sendRequest(str2, i, 0, iFollowCallback2);
    }

    public void sendRequest(String str, int i, int i2, IFollowService.IFollowCallback iFollowCallback) {
        String str2 = str;
        final IFollowService.IFollowCallback iFollowCallback2 = iFollowCallback;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), iFollowCallback2}, this, changeQuickRedirect, false, 71382, new Class[]{String.class, Integer.TYPE, Integer.TYPE, IFollowService.IFollowCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), iFollowCallback2}, this, changeQuickRedirect, false, 71382, new Class[]{String.class, Integer.TYPE, Integer.TYPE, IFollowService.IFollowCallback.class}, Void.TYPE);
            return;
        }
        i iVar = new i();
        iVar.a(new i.a().a(str2).a(i).b(i2).a());
        iVar.a(new m() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onFollowFail(Exception exc) {
                if (PatchProxy.isSupport(new Object[]{exc}, this, changeQuickRedirect, false, 71384, new Class[]{Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc}, this, changeQuickRedirect, false, 71384, new Class[]{Exception.class}, Void.TYPE);
                    return;
                }
                if (iFollowCallback2 != null) {
                    iFollowCallback2.onFollowFailed(exc);
                }
            }

            public void onFollowSuccess(FollowStatus followStatus) {
                if (PatchProxy.isSupport(new Object[]{followStatus}, this, changeQuickRedirect, false, 71383, new Class[]{FollowStatus.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{followStatus}, this, changeQuickRedirect, false, 71383, new Class[]{FollowStatus.class}, Void.TYPE);
                    return;
                }
                if (iFollowCallback2 != null) {
                    iFollowCallback2.onFollowSuccess();
                }
            }
        });
    }
}
