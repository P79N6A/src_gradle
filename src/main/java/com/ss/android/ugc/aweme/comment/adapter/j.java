package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.f;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36358a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentViewHolderNewStyle f36359b;

    j(CommentViewHolderNewStyle commentViewHolderNewStyle) {
        this.f36359b = commentViewHolderNewStyle;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36358a, false, 27273, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36358a, false, 27273, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentViewHolderNewStyle commentViewHolderNewStyle = this.f36359b;
        if (commentViewHolderNewStyle.j != null && f.f36433c.b(commentViewHolderNewStyle.f36314b)) {
            commentViewHolderNewStyle.j.c(commentViewHolderNewStyle.f36314b);
        }
    }
}
