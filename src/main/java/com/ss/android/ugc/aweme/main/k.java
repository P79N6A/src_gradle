package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54850a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54851b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54852c;

    k(MainActivity mainActivity, String str) {
        this.f54851b = mainActivity;
        this.f54852c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54850a, false, 57201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54850a, false, 57201, new Class[0], Void.TYPE);
            return;
        }
        this.f54851b.lambda$onCreate$3$MainActivity(this.f54852c);
    }
}
