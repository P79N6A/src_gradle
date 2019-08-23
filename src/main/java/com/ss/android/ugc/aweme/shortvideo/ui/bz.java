package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.ai;

public final /* synthetic */ class bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70849a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity.AnonymousClass5 f70850b;

    bz(VideoRecordNewActivity.AnonymousClass5 r1) {
        this.f70850b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70849a, false, 80660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70849a, false, 80660, new Class[0], Void.TYPE);
            return;
        }
        VideoRecordNewActivity.AnonymousClass5 r1 = this.f70850b;
        if (VideoRecordNewActivity.this.ad) {
            VideoRecordNewActivity.this.ad = false;
            ai.a("VideoRecordNewActivity => addFragment by postDelay");
            VideoRecordNewActivity.this.b();
        }
    }
}
