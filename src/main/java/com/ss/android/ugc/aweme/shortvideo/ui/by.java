package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class by implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70847a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70848b;

    by(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70848b = videoRecordNewActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70847a, false, 80652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70847a, false, 80652, new Class[0], Void.TYPE);
            return;
        }
        this.f70848b.c();
    }
}
