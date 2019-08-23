package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53771a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f53772b;

    k(Bundle bundle) {
        this.f53772b = bundle;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f53771a, false, 56375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53771a, false, 56375, new Class[0], Void.TYPE);
            return;
        }
        LoginUtils.b(this.f53772b);
    }
}
