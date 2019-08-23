package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54840a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54841b;

    i(MainActivity mainActivity) {
        this.f54841b = mainActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54840a, false, 57199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54840a, false, 57199, new Class[0], Void.TYPE);
            return;
        }
        this.f54841b.lambda$onCreate$1$MainActivity();
    }
}
