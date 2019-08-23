package com.ss.android.ugc.aweme.feedback;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.global.config.settings.g;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47115a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedbackActivity f47116b;

    a(FeedbackActivity feedbackActivity) {
        this.f47116b = feedbackActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47115a, false, 43753, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47115a, false, 43753, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FeedbackActivity feedbackActivity = this.f47116b;
        try {
            h.a().a(g.b().aQ().getHelp());
            feedbackActivity.finish();
        } catch (com.bytedance.ies.a unused) {
            Intent intent = new Intent(feedbackActivity, SubmitFeedbackActivity.class);
            intent.putExtra("use_anim", feedbackActivity.f47078b);
            feedbackActivity.startActivityForResult(intent, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
        }
    }
}
