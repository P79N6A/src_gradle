package com.ss.android.ugc.aweme.miniapp;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.menu.ITitleMenuItem;
import com.tt.option.share.OnGetShareBaseInfoListener;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;

public final class t implements ITitleMenuItem {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55914a;

    @NonNull
    public final String getKey() {
        return "video";
    }

    public final String getName() {
        return "拍抖音";
    }

    public final void onItemClick() {
        if (PatchProxy.isSupport(new Object[0], this, f55914a, false, 59083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55914a, false, 59083, new Class[0], Void.TYPE);
            return;
        }
        final HostDependManager inst = HostDependManager.getInst();
        inst.getShareBaseInfo("video", new OnGetShareBaseInfoListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55915a;

            public final void onFail() {
            }

            public final void onSuccess(ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
                ShareInfoModel shareInfoModel2 = shareInfoModel;
                OnShareEventListener onShareEventListener2 = onShareEventListener;
                if (PatchProxy.isSupport(new Object[]{shareInfoModel2, onShareEventListener2}, this, f55915a, false, 59084, new Class[]{ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{shareInfoModel2, onShareEventListener2}, this, f55915a, false, 59084, new Class[]{ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE);
                    return;
                }
                inst.share(AppbrandContext.getInst().getCurrentActivity(), shareInfoModel2, onShareEventListener2);
            }
        });
    }
}
