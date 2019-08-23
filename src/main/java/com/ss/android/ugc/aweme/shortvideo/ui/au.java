package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.d;

public final /* synthetic */ class au implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70784a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70785b;

    au(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70785b = videoRecordNewActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70784a, false, 80618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70784a, false, 80618, new Class[0], Void.TYPE);
            return;
        }
        VideoRecordNewActivity videoRecordNewActivity = this.f70785b;
        if (a.M.a(a.C0682a.EnableTextStickerInMain)) {
            d.a().a((Context) videoRecordNewActivity);
        }
    }
}
