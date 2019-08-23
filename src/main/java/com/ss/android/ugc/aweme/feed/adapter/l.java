package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44954a;

    /* renamed from: b  reason: collision with root package name */
    private final k f44955b;

    l(k kVar) {
        this.f44955b = kVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44954a, false, 40553, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44954a, false, 40553, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        k kVar = this.f44955b;
        if (kVar.f44951b != null) {
            VideoCommentDialogFragment2.x = true;
            kVar.f44951b.a("video_open_comment_dialog", (Object) Boolean.TRUE);
        }
    }
}
