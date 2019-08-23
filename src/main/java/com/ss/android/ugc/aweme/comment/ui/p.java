package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36607a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCommentDialogFragment2 f36608b;

    /* renamed from: c  reason: collision with root package name */
    private final IMiniAppService f36609c;

    /* renamed from: d  reason: collision with root package name */
    private final f f36610d;

    p(VideoCommentDialogFragment2 videoCommentDialogFragment2, IMiniAppService iMiniAppService, f fVar) {
        this.f36608b = videoCommentDialogFragment2;
        this.f36609c = iMiniAppService;
        this.f36610d = fVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36607a, false, 27725, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36607a, false, 27725, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoCommentDialogFragment2 videoCommentDialogFragment2 = this.f36608b;
        IMiniAppService iMiniAppService = this.f36609c;
        f fVar = this.f36610d;
        if (iMiniAppService.openMiniApp(videoCommentDialogFragment2.getContext(), iMiniAppService.buildSchema(fVar), new b.a().b(videoCommentDialogFragment2.getEventType()).a("comment_page").d(videoCommentDialogFragment2.r.getAid()).c("023002").a())) {
            videoCommentDialogFragment2.q();
        }
        r.a("mp_click", (Map) d.a().a("enter_from", videoCommentDialogFragment2.getEventType()).a("position", "comment_top").a("group_id", videoCommentDialogFragment2.r.getAid()).a("author_id", videoCommentDialogFragment2.r.getAuthorUid()).a("_param_for_special", fVar.isApp() ? "micro_app" : "micro_game").a("mp_id", fVar.getAppId()).f34114b);
    }
}
