package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72978a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryCommentInputWidget f72979b;

    h(StoryCommentInputWidget storyCommentInputWidget) {
        this.f72979b = storyCommentInputWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72978a, false, 84301, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72978a, false, 84301, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f72979b.o();
    }
}
