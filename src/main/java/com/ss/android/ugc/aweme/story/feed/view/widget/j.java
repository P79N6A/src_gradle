package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72982a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryCommentInputWidget f72983b;

    j(StoryCommentInputWidget storyCommentInputWidget) {
        this.f72983b = storyCommentInputWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f72982a, false, 84303, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f72982a, false, 84303, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f72983b.g();
    }
}
