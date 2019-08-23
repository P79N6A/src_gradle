package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36625a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCommentDialogFragment2 f36626b;

    w(VideoCommentDialogFragment2 videoCommentDialogFragment2) {
        this.f36626b = videoCommentDialogFragment2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36625a, false, 27732, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36625a, false, 27732, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoCommentDialogFragment2 videoCommentDialogFragment2 = this.f36626b;
        if (view.getId() == C0906R.id.bc9) {
            videoCommentDialogFragment2.q();
            return;
        }
        if (!a.a(view)) {
            g.a(videoCommentDialogFragment2.getContext(), new a.C0509a().a("click").a(videoCommentDialogFragment2.r.getLinkAdData()).a(videoCommentDialogFragment2.r).a(true).a());
            f.a(videoCommentDialogFragment2.r.getLinkAdData(), videoCommentDialogFragment2.r, "click", true, videoCommentDialogFragment2.getEventType());
            com.ss.android.ugc.aweme.commercialize.utils.g.a(videoCommentDialogFragment2.getContext(), videoCommentDialogFragment2.r.getLinkAdData(), videoCommentDialogFragment2.r, true);
            if (c.u(videoCommentDialogFragment2.r)) {
                g.a(videoCommentDialogFragment2.getContext(), videoCommentDialogFragment2.r.getLinkAdData(), videoCommentDialogFragment2.r, true);
            }
        }
    }
}
