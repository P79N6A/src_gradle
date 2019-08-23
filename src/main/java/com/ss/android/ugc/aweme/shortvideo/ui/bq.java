package com.ss.android.ugc.aweme.shortvideo.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bq implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70831a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70832b;

    bq(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70832b = videoRecordNewActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70831a, false, 80641, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70831a, false, 80641, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VideoRecordNewActivity videoRecordNewActivity = this.f70832b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            videoRecordNewActivity.b(videoRecordNewActivity.f4034c.p);
        }
    }
}
