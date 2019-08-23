package com.ss.android.ugc.aweme.comment.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.p;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36565a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentInputFragment f36566b;

    a(CommentInputFragment commentInputFragment) {
        this.f36566b = commentInputFragment;
    }

    public final void onChanged(Object obj) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f36565a, false, 27470, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f36565a, false, 27470, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CommentInputFragment commentInputFragment = this.f36566b;
        Float f3 = (Float) obj;
        if (commentInputFragment.mLayout != null) {
            if (f3 == null) {
                f2 = 0.0f;
            } else {
                f2 = f3.floatValue();
            }
            commentInputFragment.mLayout.setTranslationX(((float) p.b(commentInputFragment.getContext())) * f2);
            commentInputFragment.mLayout.setAlpha(1.0f - f2);
        }
    }
}
