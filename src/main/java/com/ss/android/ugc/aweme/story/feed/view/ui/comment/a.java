package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72880a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentEditTextWrapper f72881b;

    a(CommentEditTextWrapper commentEditTextWrapper) {
        this.f72881b = commentEditTextWrapper;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f72880a, false, 84154, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f72880a, false, 84154, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentEditTextWrapper commentEditTextWrapper = this.f72881b;
        if (commentEditTextWrapper.f72839b != null) {
            commentEditTextWrapper.f72839b.onClick(view2);
        }
    }
}
