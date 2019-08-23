package com.ss.android.ugc.aweme.comment.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36570a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentInputFragment f36571b;

    b(CommentInputFragment commentInputFragment) {
        this.f36571b = commentInputFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f36570a, false, 27471, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f36570a, false, 27471, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CommentInputFragment commentInputFragment = this.f36571b;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            commentInputFragment.mEditCommentView.setEnabled(true);
        } else {
            commentInputFragment.mEditCommentView.setEnabled(false);
        }
    }
}
