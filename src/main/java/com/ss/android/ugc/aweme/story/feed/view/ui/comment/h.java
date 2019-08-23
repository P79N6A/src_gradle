package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72893a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryReplyDialog f72894b;

    h(StoryReplyDialog storyReplyDialog) {
        this.f72894b = storyReplyDialog;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f72893a, false, 84217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72893a, false, 84217, new Class[0], Void.TYPE);
            return;
        }
        StoryReplyDialog storyReplyDialog = this.f72894b;
        if (TextUtils.isEmpty(storyReplyDialog.f72874e)) {
            storyReplyDialog.f72873d.setCommentEnable(false);
            return;
        }
        storyReplyDialog.f72872c.setText(storyReplyDialog.f72874e);
        storyReplyDialog.f72872c.setSelection(storyReplyDialog.f72872c.getText().length());
        storyReplyDialog.f72873d.setCommentEnable(true);
    }
}
