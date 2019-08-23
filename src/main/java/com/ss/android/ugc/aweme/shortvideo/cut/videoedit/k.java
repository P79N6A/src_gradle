package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66592a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView.AnonymousClass2 f66593b;

    k(VideoEditView.AnonymousClass2 r1) {
        this.f66593b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66592a, false, 75970, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66592a, false, 75970, new Class[0], Void.TYPE);
            return;
        }
        VideoEditView.this.e();
    }
}
