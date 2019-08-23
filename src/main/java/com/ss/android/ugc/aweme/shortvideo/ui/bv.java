package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;

public final /* synthetic */ class bv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70841a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity.AnonymousClass1 f70842b;

    bv(VideoRecordNewActivity.AnonymousClass1 r1) {
        this.f70842b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70841a, false, 80649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70841a, false, 80649, new Class[0], Void.TYPE);
            return;
        }
        VideoRecordNewActivity.AnonymousClass1 r0 = this.f70842b;
        VideoRecordNewActivity.this.af.b().b(bx.f70846b);
        VideoRecordNewActivity.this.runOnUiThread(new by(VideoRecordNewActivity.this));
    }
}
