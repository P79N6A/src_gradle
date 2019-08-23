package com.ss.android.ugc.aweme.story.feed.view.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.view.ui.comment.StoryReplyDialog;

public final /* synthetic */ class k implements StoryReplyDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72984a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryCommentInputWidget f72985b;

    k(StoryCommentInputWidget storyCommentInputWidget) {
        this.f72985b = storyCommentInputWidget;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72984a, false, 84304, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72984a, false, 84304, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        StoryCommentInputWidget storyCommentInputWidget = this.f72985b;
        if (z) {
            storyCommentInputWidget.h();
            return;
        }
        storyCommentInputWidget.g();
        if (storyCommentInputWidget.c() != null) {
            ((StoryDetailActivity) storyCommentInputWidget.c()).a();
        }
    }
}
