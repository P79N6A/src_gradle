package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72986a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryCommentInputWidget f72987b;

    l(StoryCommentInputWidget storyCommentInputWidget) {
        this.f72987b = storyCommentInputWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f72986a, false, 84305, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f72986a, false, 84305, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        StoryCommentInputWidget storyCommentInputWidget = this.f72987b;
        if (!storyCommentInputWidget.t && !storyCommentInputWidget.u) {
            storyCommentInputWidget.g();
        }
    }
}
