package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;

public final /* synthetic */ class bg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70809a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70810b;

    bg(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70810b = videoRecordNewActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70809a, false, 80630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70809a, false, 80630, new Class[0], Void.TYPE);
            return;
        }
        VideoRecordNewActivity videoRecordNewActivity = this.f70810b;
        Context applicationContext = videoRecordNewActivity.getApplicationContext();
        int i = videoRecordNewActivity.Y;
        videoRecordNewActivity.Y = i + 1;
        a.b(applicationContext, i < 2 ? C0906R.string.c04 : C0906R.string.c05).a();
        ax axVar = new ax();
        axVar.f74636a = 1;
        videoRecordNewActivity.A.a((Object) videoRecordNewActivity, (bc) axVar);
        videoRecordNewActivity.z.a((Object) videoRecordNewActivity, (bc) axVar);
    }
}
