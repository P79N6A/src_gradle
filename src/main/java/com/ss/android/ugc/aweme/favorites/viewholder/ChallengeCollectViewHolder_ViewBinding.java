package com.ss.android.ugc.aweme.favorites.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class ChallengeCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44366a;

    /* renamed from: b  reason: collision with root package name */
    private ChallengeCollectViewHolder f44367b;

    /* renamed from: c  reason: collision with root package name */
    private View f44368c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44366a, false, 39690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44366a, false, 39690, new Class[0], Void.TYPE);
            return;
        }
        ChallengeCollectViewHolder challengeCollectViewHolder = this.f44367b;
        if (challengeCollectViewHolder != null) {
            this.f44367b = null;
            challengeCollectViewHolder.mNameView = null;
            challengeCollectViewHolder.mCoverView = null;
            challengeCollectViewHolder.mRightView = null;
            challengeCollectViewHolder.mTopView = null;
            challengeCollectViewHolder.challengeItemll = null;
            challengeCollectViewHolder.txtUserCount = null;
            this.f44368c.setOnClickListener(null);
            this.f44368c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ChallengeCollectViewHolder_ViewBinding(final ChallengeCollectViewHolder challengeCollectViewHolder, View view) {
        this.f44367b = challengeCollectViewHolder;
        challengeCollectViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.rt, "field 'mNameView'", TextView.class);
        challengeCollectViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ckd, "field 'mCoverView'", RemoteImageView.class);
        challengeCollectViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.cg_, "field 'mRightView'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bid, "field 'mTopView' and method 'onClick'");
        challengeCollectViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView, C0906R.id.bid, "field 'mTopView'", LinearLayout.class);
        this.f44368c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44369a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f44369a, false, 39691, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f44369a, false, 39691, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                challengeCollectViewHolder.onClick(view2);
            }
        });
        challengeCollectViewHolder.challengeItemll = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.rr, "field 'challengeItemll'", LinearLayout.class);
        challengeCollectViewHolder.txtUserCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dle, "field 'txtUserCount'", TextView.class);
    }
}
