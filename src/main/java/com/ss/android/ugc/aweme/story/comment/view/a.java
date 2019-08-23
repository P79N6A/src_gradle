package com.ss.android.ugc.aweme.story.comment.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72231a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentActivity f72232b;

    a(CommentActivity commentActivity) {
        this.f72232b = commentActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72231a, false, 82935, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72231a, false, 82935, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentActivity commentActivity = this.f72232b;
        commentActivity.k = true;
        commentActivity.onBackPressed();
    }
}
