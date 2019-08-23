package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;

public final /* synthetic */ class bh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70811a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70812b;

    bh(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70812b = videoRecordNewActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70811a, false, 80631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70811a, false, 80631, new Class[0], Void.TYPE);
            return;
        }
        this.f70812b.N = true;
        a.a("duet complete callback");
    }
}
