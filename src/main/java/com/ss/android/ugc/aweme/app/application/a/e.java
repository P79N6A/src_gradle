package com.ss.android.ugc.aweme.app.application.a;

import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.LoginUtils;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33922a;

    /* renamed from: b  reason: collision with root package name */
    private final i f33923b;

    e(i iVar) {
        this.f33923b = iVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33922a, false, 23236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33922a, false, 23236, new Class[0], Void.TYPE);
            return;
        }
        LoginUtils.b((Bundle) this.f33923b.e());
    }
}
