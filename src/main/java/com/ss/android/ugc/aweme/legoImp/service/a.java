package com.ss.android.ugc.aweme.legoImp.service;

import android.view.Choreographer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53118a;

    /* renamed from: b  reason: collision with root package name */
    static final Choreographer.FrameCallback f53119b = new a();

    private a() {
    }

    public final void doFrame(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f53118a, false, 55234, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f53118a, false, 55234, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        MainLooperOptService.lambda$logMeasure$0$MainLooperOptService(j);
    }
}
