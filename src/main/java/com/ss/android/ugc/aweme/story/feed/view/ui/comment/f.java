package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.g;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72889a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryFeedCommentContainer f72890b;

    f(StoryFeedCommentContainer storyFeedCommentContainer) {
        this.f72890b = storyFeedCommentContainer;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f72889a, false, 84194, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f72889a, false, 84194, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        StoryFeedCommentContainer storyFeedCommentContainer = this.f72890b;
        if (PatchProxy.isSupport(new Object[]{view2}, storyFeedCommentContainer, StoryFeedCommentContainer.f72866a, false, 84191, new Class[]{View.class}, Void.TYPE)) {
            StoryFeedCommentContainer storyFeedCommentContainer2 = storyFeedCommentContainer;
            PatchProxy.accessDispatch(new Object[]{view2}, storyFeedCommentContainer2, StoryFeedCommentContainer.f72866a, false, 84191, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(storyFeedCommentContainer.f72867b)) {
            int indexOfChild = storyFeedCommentContainer.indexOfChild(view2);
            if (indexOfChild >= 0 && indexOfChild <= 2 && indexOfChild <= storyFeedCommentContainer.f72867b.size() - 1) {
                g gVar = storyFeedCommentContainer.f72867b.get(indexOfChild);
                if (storyFeedCommentContainer.f72868c != null) {
                    storyFeedCommentContainer.f72868c.a(gVar);
                }
            }
        }
    }
}
