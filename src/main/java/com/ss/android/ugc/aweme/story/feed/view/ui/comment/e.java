package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72887a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryFeedCommentContainer f72888b;

    e(StoryFeedCommentContainer storyFeedCommentContainer) {
        this.f72888b = storyFeedCommentContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f72887a, false, 84193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72887a, false, 84193, new Class[0], Void.TYPE);
            return;
        }
        StoryFeedCommentContainer storyFeedCommentContainer = this.f72888b;
        ArrayList<StoryCommentView> arrayList = new ArrayList<>();
        StoryCommentView storyCommentView = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < storyFeedCommentContainer.getChildCount(); i3++) {
            try {
                StoryCommentView storyCommentView2 = (StoryCommentView) storyFeedCommentContainer.getChildAt(i3);
                int lineCount = storyCommentView2.getLineCount() + i2;
                if (lineCount > 3 && i3 != 0) {
                    if (i2 < 3) {
                        i = 3 - i2;
                        storyCommentView = storyCommentView2;
                    } else {
                        arrayList.add(storyCommentView2);
                    }
                }
                i2 = lineCount;
            } catch (ClassCastException unused) {
            }
        }
        if (storyCommentView != null) {
            storyCommentView.setEllipsize(TextUtils.TruncateAt.END);
            storyCommentView.setMaxLines(i);
        }
        for (StoryCommentView removeView : arrayList) {
            storyFeedCommentContainer.removeView(removeView);
        }
    }
}
