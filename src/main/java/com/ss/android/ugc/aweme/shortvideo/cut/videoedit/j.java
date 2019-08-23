package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66590a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView.AnonymousClass1 f66591b;

    j(VideoEditView.AnonymousClass1 r1) {
        this.f66591b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66590a, false, 75968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66590a, false, 75968, new Class[0], Void.TYPE);
            return;
        }
        VideoEditView.this.e();
    }
}
