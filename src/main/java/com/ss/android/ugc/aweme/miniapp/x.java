package com.ss.android.ugc.aweme.miniapp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.option.menu.ITitleMenuItem;

public final class x implements ITitleMenuItem {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55975a;

    public final String getKey() {
        return "share";
    }

    public final String getName() {
        if (!PatchProxy.isSupport(new Object[0], this, f55975a, false, 59116, new Class[0], String.class)) {
            return GlobalContext.getContext().getString(C0906R.string.bbp);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f55975a, false, 59116, new Class[0], String.class);
    }

    public final void onItemClick() {
        if (PatchProxy.isSupport(new Object[0], this, f55975a, false, 59117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55975a, false, 59117, new Class[0], Void.TYPE);
            return;
        }
        AppbrandApplication.getInst().getJsBridge().sendMsgToJsCore("onShareAppMessage", null);
    }
}
