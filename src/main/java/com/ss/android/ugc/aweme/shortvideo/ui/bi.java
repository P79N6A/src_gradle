package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bi implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70813a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70814b;

    bi(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70814b = videoRecordNewActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70813a, false, 80632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70813a, false, 80632, new Class[0], Void.TYPE);
            return;
        }
        this.f70814b.N = true;
    }
}
