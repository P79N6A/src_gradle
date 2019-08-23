package com.ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36356a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentViewHolder f36357b;

    i(CommentViewHolder commentViewHolder) {
        this.f36357b = commentViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36356a, false, 27257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36356a, false, 27257, new Class[0], Void.TYPE);
            return;
        }
        CommentViewHolder commentViewHolder = this.f36357b;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(commentViewHolder.mBgView, "backgroundColor", new int[]{commentViewHolder.mBgView.getResources().getColor(C0906R.color.h6), commentViewHolder.mBgView.getResources().getColor(C0906R.color.a7l)});
        ofInt.setDuration(3000);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        commentViewHolder.f36314b.setNeedHint(false);
    }
}
