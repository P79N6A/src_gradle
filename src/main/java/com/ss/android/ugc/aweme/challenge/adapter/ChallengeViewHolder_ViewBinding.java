package com.ss.android.ugc.aweme.challenge.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ChallengeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35326a;

    /* renamed from: b  reason: collision with root package name */
    private ChallengeViewHolder f35327b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35326a, false, 25777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35326a, false, 25777, new Class[0], Void.TYPE);
            return;
        }
        ChallengeViewHolder challengeViewHolder = this.f35327b;
        if (challengeViewHolder != null) {
            this.f35327b = null;
            challengeViewHolder.mTitleView = null;
            challengeViewHolder.mDescView = null;
            challengeViewHolder.mJoinCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ChallengeViewHolder_ViewBinding(ChallengeViewHolder challengeViewHolder, View view) {
        this.f35327b = challengeViewHolder;
        challengeViewHolder.mTitleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitleView'", TextView.class);
        challengeViewHolder.mDescView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3m, "field 'mDescView'", TextView.class);
        challengeViewHolder.mJoinCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.b6s, "field 'mJoinCountView'", TextView.class);
        challengeViewHolder.margin = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.cl);
    }
}
