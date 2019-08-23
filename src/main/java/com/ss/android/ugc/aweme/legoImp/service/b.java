package com.ss.android.ugc.aweme.legoImp.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53120a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f53121b = new b();

    private b() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f53120a, false, 55235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53120a, false, 55235, new Class[0], Void.TYPE);
            return;
        }
        MainLooperOptService.lambda$logMeasure$1$MainLooperOptService();
    }
}
