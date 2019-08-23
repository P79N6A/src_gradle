package com.ss.android.ugc.aweme.miniapp.i;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.hostmethod.HostMethodManager;

public final /* synthetic */ class b implements HostMethodManager.ResponseCallBack {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55782a;

    /* renamed from: b  reason: collision with root package name */
    static final HostMethodManager.ResponseCallBack f55783b = new b();

    private b() {
    }

    public final void callResponse(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55782a, false, 59477, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f55782a, false, 59477, new Class[]{String.class}, Void.TYPE);
        }
    }
}
