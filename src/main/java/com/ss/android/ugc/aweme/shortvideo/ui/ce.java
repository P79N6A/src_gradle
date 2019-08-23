package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;

public final /* synthetic */ class ce implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70860a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity.AnonymousClass2.AnonymousClass1 f70861b;

    ce(VideoRecordNewActivity.AnonymousClass2.AnonymousClass1 r1) {
        this.f70861b = r1;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70860a, false, 80679, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70860a, false, 80679, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoRecordNewActivity.this.l.b();
    }
}
