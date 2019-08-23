package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51008a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51009b;

    w(int i) {
        this.f51009b = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f51008a, false, 51307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51008a, false, 51307, new Class[0], Void.TYPE);
            return;
        }
        UIUtils.displayToast(GlobalContext.getContext(), this.f51009b);
    }
}
