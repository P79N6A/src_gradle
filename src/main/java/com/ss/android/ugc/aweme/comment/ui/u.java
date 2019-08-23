package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36621a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCommentDialogFragment2 f36622b;

    u(VideoCommentDialogFragment2 videoCommentDialogFragment2) {
        this.f36622b = videoCommentDialogFragment2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36621a, false, 27730, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36621a, false, 27730, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoCommentDialogFragment2 videoCommentDialogFragment2 = this.f36622b;
        if (!a.a(view)) {
            videoCommentDialogFragment2.i();
        }
    }
}
