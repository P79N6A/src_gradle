package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72885a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryFeedCommentContainer f72886b;

    d(StoryFeedCommentContainer storyFeedCommentContainer) {
        this.f72886b = storyFeedCommentContainer;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72885a, false, 84192, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72885a, false, 84192, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        StoryFeedCommentContainer storyFeedCommentContainer = this.f72886b;
        if (PatchProxy.isSupport(new Object[0], storyFeedCommentContainer, StoryFeedCommentContainer.f72866a, false, 84189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], storyFeedCommentContainer, StoryFeedCommentContainer.f72866a, false, 84189, new Class[0], Void.TYPE);
            return;
        }
        if (storyFeedCommentContainer.f72868c != null) {
            storyFeedCommentContainer.f72868c.ah_();
        }
    }
}
