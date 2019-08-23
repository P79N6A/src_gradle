package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70856a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70857b;

    cc(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70857b = videoRecordNewActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70856a, false, 80664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70856a, false, 80664, new Class[0], Void.TYPE);
            return;
        }
        this.f70857b.b();
    }
}
