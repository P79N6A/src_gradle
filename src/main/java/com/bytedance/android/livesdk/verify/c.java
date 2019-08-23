package com.bytedance.android.livesdk.verify;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17690a;

    /* renamed from: b  reason: collision with root package name */
    private final VerifyBrowserFragment f17691b;

    c(VerifyBrowserFragment verifyBrowserFragment) {
        this.f17691b = verifyBrowserFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17690a, false, 13840, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17690a, false, 13840, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17691b.W.a();
    }
}
