package com.ss.android.ugc.aweme.forward.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class BaseForwardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48331a;

    /* renamed from: b  reason: collision with root package name */
    private BaseForwardViewHolder f48332b;

    /* renamed from: c  reason: collision with root package name */
    private View f48333c;

    /* renamed from: d  reason: collision with root package name */
    private View f48334d;

    /* renamed from: e  reason: collision with root package name */
    private View f48335e;

    /* renamed from: f  reason: collision with root package name */
    private View f48336f;
    private View g;
    private View h;
    private View i;
    private View j;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48331a, false, 45606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48331a, false, 45606, new Class[0], Void.TYPE);
            return;
        }
        BaseForwardViewHolder baseForwardViewHolder = this.f48332b;
        if (baseForwardViewHolder != null) {
            this.f48332b = null;
            baseForwardViewHolder.mRecommendFeedLayout = null;
            baseForwardViewHolder.mLookMoreView = null;
            baseForwardViewHolder.mForwardHeaderLayout = null;
            baseForwardViewHolder.mAuthorAvatarLayout = null;
            baseForwardViewHolder.mAuthorAvatarImageView = null;
            baseForwardViewHolder.mFriendTagView = null;
            baseForwardViewHolder.mDiggLayout = null;
            baseForwardViewHolder.mPressLayout = null;
            baseForwardViewHolder.mStoryRing = null;
            baseForwardViewHolder.mAvatarLoadingView = null;
            baseForwardViewHolder.mAuthorAvatarLiveView = null;
            baseForwardViewHolder.mAuthorAvatarBorderView = null;
            baseForwardViewHolder.mAuthorNameView = null;
            baseForwardViewHolder.mRecommendReasonView = null;
            baseForwardViewHolder.mForwardDescView = null;
            baseForwardViewHolder.mCreateTimeView = null;
            baseForwardViewHolder.mDiggView = null;
            baseForwardViewHolder.mDiggCountView = null;
            baseForwardViewHolder.mCommentView = null;
            baseForwardViewHolder.mCommentCountView = null;
            baseForwardViewHolder.mForwardLayout = null;
            baseForwardViewHolder.mForwardView = null;
            baseForwardViewHolder.mForwardCountView = null;
            baseForwardViewHolder.mShareView = null;
            baseForwardViewHolder.mShareCountView = null;
            baseForwardViewHolder.mCommentLayout = null;
            baseForwardViewHolder.mFollow = null;
            baseForwardViewHolder.mTopDivider = null;
            baseForwardViewHolder.mBottomDivider = null;
            baseForwardViewHolder.mLineDivider = null;
            baseForwardViewHolder.mAwemeStatusView = null;
            baseForwardViewHolder.mIvExtraBtn = null;
            this.f48333c.setOnClickListener(null);
            this.f48333c = null;
            this.f48334d.setOnClickListener(null);
            this.f48334d = null;
            if (this.f48335e != null) {
                this.f48335e.setOnClickListener(null);
                this.f48335e = null;
            }
            if (this.f48336f != null) {
                this.f48336f.setOnClickListener(null);
                this.f48336f = null;
            }
            this.g.setOnClickListener(null);
            this.g = null;
            if (this.h != null) {
                this.h.setOnClickListener(null);
                this.h = null;
            }
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseForwardViewHolder_ViewBinding(final BaseForwardViewHolder baseForwardViewHolder, View view) {
        this.f48332b = baseForwardViewHolder;
        baseForwardViewHolder.mRecommendFeedLayout = view.findViewById(C0906R.id.b8o);
        baseForwardViewHolder.mLookMoreView = view.findViewById(C0906R.id.bks);
        baseForwardViewHolder.mForwardHeaderLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.b8r, "field 'mForwardHeaderLayout'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b7y, "field 'mAuthorAvatarLayout' and method 'onClickAuthorAvatar'");
        baseForwardViewHolder.mAuthorAvatarLayout = (ViewGroup) Utils.castView(findRequiredView, C0906R.id.b7y, "field 'mAuthorAvatarLayout'", ViewGroup.class);
        this.f48333c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48337a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48337a, false, 45607, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48337a, false, 45607, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseForwardViewHolder.onClickAuthorAvatar(view2);
            }
        });
        baseForwardViewHolder.mAuthorAvatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp2, "field 'mAuthorAvatarImageView'", AvatarImageView.class);
        baseForwardViewHolder.mFriendTagView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dka, "field 'mFriendTagView'", TextView.class);
        baseForwardViewHolder.mDiggLayout = (DiggLayout) Utils.findOptionalViewAsType(view, C0906R.id.a51, "field 'mDiggLayout'", DiggLayout.class);
        baseForwardViewHolder.mPressLayout = (LongPressLayout) Utils.findOptionalViewAsType(view, C0906R.id.bkq, "field 'mPressLayout'", LongPressLayout.class);
        baseForwardViewHolder.mStoryRing = (StoryCircleView) Utils.findOptionalViewAsType(view, C0906R.id.cw5, "field 'mStoryRing'", StoryCircleView.class);
        baseForwardViewHolder.mAvatarLoadingView = (AnimationImageView) Utils.findOptionalViewAsType(view, C0906R.id.i8, "field 'mAvatarLoadingView'", AnimationImageView.class);
        baseForwardViewHolder.mAuthorAvatarLiveView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp9, "field 'mAuthorAvatarLiveView'", AvatarImageView.class);
        baseForwardViewHolder.mAuthorAvatarBorderView = (LiveCircleView) Utils.findRequiredViewAsType(view, C0906R.id.dq0, "field 'mAuthorAvatarBorderView'", LiveCircleView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dlg, "field 'mAuthorNameView' and method 'onClickAuthorName'");
        baseForwardViewHolder.mAuthorNameView = (TextView) Utils.castView(findRequiredView2, C0906R.id.dlg, "field 'mAuthorNameView'", TextView.class);
        this.f48334d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48340a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48340a, false, 45608, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48340a, false, 45608, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseForwardViewHolder.onClickAuthorName(view2);
            }
        });
        baseForwardViewHolder.mRecommendReasonView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dh6, "field 'mRecommendReasonView'", TextView.class);
        baseForwardViewHolder.mForwardDescView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.dau, "field 'mForwardDescView'", MentionTextView.class);
        baseForwardViewHolder.mCreateTimeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dak, "field 'mCreateTimeView'", TextView.class);
        baseForwardViewHolder.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a4x, "field 'mDiggView'", ImageView.class);
        baseForwardViewHolder.mDiggCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.db2, "field 'mDiggCountView'", TextView.class);
        baseForwardViewHolder.mCommentView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b02, "field 'mCommentView'", ImageView.class);
        baseForwardViewHolder.mCommentCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d_r, "field 'mCommentCountView'", TextView.class);
        View findViewById = view.findViewById(C0906R.id.b8q);
        baseForwardViewHolder.mForwardLayout = (ViewGroup) Utils.castView(findViewById, C0906R.id.b8q, "field 'mForwardLayout'", ViewGroup.class);
        if (findViewById != null) {
            this.f48335e = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48343a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f48343a, false, 45609, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f48343a, false, 45609, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseForwardViewHolder.showCreateForward(view2);
                }
            });
        }
        baseForwardViewHolder.mForwardView = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.b1e, "field 'mForwardView'", ImageView.class);
        baseForwardViewHolder.mForwardCountView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dc0, "field 'mForwardCountView'", TextView.class);
        baseForwardViewHolder.mShareView = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.cpw, "field 'mShareView'", ImageView.class);
        baseForwardViewHolder.mShareCountView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dit, "field 'mShareCountView'", TextView.class);
        baseForwardViewHolder.mCommentLayout = (FollowFeedCommentLayout) Utils.findOptionalViewAsType(view, C0906R.id.b8m, "field 'mCommentLayout'", FollowFeedCommentLayout.class);
        baseForwardViewHolder.mFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, C0906R.id.agq, "field 'mFollow'", FollowUserBtn.class);
        baseForwardViewHolder.mTopDivider = Utils.findRequiredView(view, C0906R.id.d58, "field 'mTopDivider'");
        baseForwardViewHolder.mBottomDivider = Utils.findRequiredView(view, C0906R.id.mb, "field 'mBottomDivider'");
        baseForwardViewHolder.mLineDivider = Utils.findRequiredView(view, C0906R.id.bbt, "field 'mLineDivider'");
        baseForwardViewHolder.mAwemeStatusView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.d9d, "field 'mAwemeStatusView'", TextView.class);
        View findViewById2 = view.findViewById(C0906R.id.b11);
        baseForwardViewHolder.mIvExtraBtn = (ImageView) Utils.castView(findViewById2, C0906R.id.b11, "field 'mIvExtraBtn'", ImageView.class);
        if (findViewById2 != null) {
            this.f48336f = findViewById2;
            findViewById2.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48346a;

                public final void doClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f48346a, false, 45610, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f48346a, false, 45610, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseForwardViewHolder.clickExtra();
                }
            });
        }
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.b85, "method 'expandComment'");
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48349a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48349a, false, 45611, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48349a, false, 45611, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseForwardViewHolder.expandComment(view2);
            }
        });
        View findViewById3 = view.findViewById(C0906R.id.b_l);
        if (findViewById3 != null) {
            this.h = findViewById3;
            findViewById3.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48352a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f48352a, false, 45612, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f48352a, false, 45612, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseForwardViewHolder.showShare(view2);
                }
            });
        }
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.b7s, "method 'addComment'");
        this.i = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48355a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48355a, false, 45613, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48355a, false, 45613, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseForwardViewHolder.addComment();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.b8e, "method 'clickLike'");
        this.j = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48358a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48358a, false, 45614, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48358a, false, 45614, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseForwardViewHolder.clickLike(view2);
            }
        });
        baseForwardViewHolder.avatarSize = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.gg);
    }
}
