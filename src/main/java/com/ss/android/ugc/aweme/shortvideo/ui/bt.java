package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.v;

public final /* synthetic */ class bt implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70837a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70838b;

    bt(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70838b = videoRecordNewActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70837a, false, 80644, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70837a, false, 80644, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoRecordNewActivity videoRecordNewActivity = this.f70838b;
        if (PatchProxy.isSupport(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80561, new Class[0], Void.TYPE);
            return;
        }
        int h = videoRecordNewActivity.m.h();
        if (h == 0) {
            v a2 = v.a();
            a2.f74943c = false;
            videoRecordNewActivity.A.a((Object) videoRecordNewActivity, (bc) a2);
            return;
        }
        if (h == 1) {
            v b2 = v.b();
            b2.f74943c = false;
            videoRecordNewActivity.A.a((Object) videoRecordNewActivity, (bc) b2);
        }
    }
}
