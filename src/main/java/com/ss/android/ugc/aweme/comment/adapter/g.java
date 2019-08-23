package com.ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36352a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentReplyViewHolder f36353b;

    g(CommentReplyViewHolder commentReplyViewHolder) {
        this.f36353b = commentReplyViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36352a, false, 27244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36352a, false, 27244, new Class[0], Void.TYPE);
            return;
        }
        CommentReplyViewHolder commentReplyViewHolder = this.f36353b;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(commentReplyViewHolder.mBgView, "backgroundColor", new int[]{commentReplyViewHolder.mBgView.getResources().getColor(C0906R.color.h6), commentReplyViewHolder.mBgView.getResources().getColor(C0906R.color.a7l)});
        ofInt.setDuration(3000);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        commentReplyViewHolder.f36297c.setNeedHint(false);
    }
}
