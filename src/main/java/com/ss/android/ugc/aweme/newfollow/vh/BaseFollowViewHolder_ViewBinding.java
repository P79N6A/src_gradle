package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagLayout2;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class BaseFollowViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57468a;

    /* renamed from: b  reason: collision with root package name */
    private BaseFollowViewHolder f57469b;

    /* renamed from: c  reason: collision with root package name */
    private View f57470c;

    /* renamed from: d  reason: collision with root package name */
    private View f57471d;

    /* renamed from: e  reason: collision with root package name */
    private View f57472e;

    /* renamed from: f  reason: collision with root package name */
    private View f57473f;
    private View g;
    private View h;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57468a, false, 62090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57468a, false, 62090, new Class[0], Void.TYPE);
            return;
        }
        BaseFollowViewHolder baseFollowViewHolder = this.f57469b;
        if (baseFollowViewHolder != null) {
            this.f57469b = null;
            baseFollowViewHolder.mRecommendFeedLayout = null;
            baseFollowViewHolder.mLookMoreView = null;
            baseFollowViewHolder.mCoverView = null;
            baseFollowViewHolder.mHeaderLayout = null;
            baseFollowViewHolder.mAvatarLayout = null;
            baseFollowViewHolder.mAvatarView = null;
            baseFollowViewHolder.mStoryRing = null;
            baseFollowViewHolder.mAvatarLoadingView = null;
            baseFollowViewHolder.mAvatarLiveView = null;
            baseFollowViewHolder.mAvatarBorderView = null;
            baseFollowViewHolder.mCreateTimeView = null;
            baseFollowViewHolder.mHeadUserNameView = null;
            baseFollowViewHolder.mRecommendReasonView = null;
            baseFollowViewHolder.mCouponContainer = null;
            baseFollowViewHolder.mFeedTagLayout2 = null;
            baseFollowViewHolder.mDescView = null;
            baseFollowViewHolder.mDiggView = null;
            baseFollowViewHolder.mDiggCountView = null;
            baseFollowViewHolder.mCommentView = null;
            baseFollowViewHolder.mCommentCountView = null;
            baseFollowViewHolder.mShareView = null;
            baseFollowViewHolder.mShareCountView = null;
            baseFollowViewHolder.mDiggLayout = null;
            baseFollowViewHolder.mShoppingView = null;
            baseFollowViewHolder.mFollow = null;
            baseFollowViewHolder.mCommentLayout = null;
            baseFollowViewHolder.mPressLayout = null;
            baseFollowViewHolder.mIvForward = null;
            baseFollowViewHolder.mFriendTagView = null;
            baseFollowViewHolder.mForwardCountView = null;
            baseFollowViewHolder.mForwardLayout = null;
            baseFollowViewHolder.mTopDivider = null;
            baseFollowViewHolder.mBottomDivider = null;
            baseFollowViewHolder.mLineDivider = null;
            if (this.f57470c != null) {
                this.f57470c.setOnClickListener(null);
                this.f57470c = null;
            }
            if (this.f57471d != null) {
                this.f57471d.setOnClickListener(null);
                this.f57471d = null;
            }
            if (this.f57472e != null) {
                this.f57472e.setOnClickListener(null);
                this.f57472e = null;
            }
            if (this.f57473f != null) {
                this.f57473f.setOnClickListener(null);
                this.f57473f = null;
            }
            if (this.g != null) {
                this.g.setOnClickListener(null);
                this.g = null;
            }
            if (this.h != null) {
                this.h.setOnClickListener(null);
                this.h = null;
            }
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseFollowViewHolder_ViewBinding(final BaseFollowViewHolder baseFollowViewHolder, View view) {
        this.f57469b = baseFollowViewHolder;
        baseFollowViewHolder.mRecommendFeedLayout = view.findViewById(C0906R.id.b8o);
        baseFollowViewHolder.mLookMoreView = view.findViewById(C0906R.id.bks);
        baseFollowViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mCoverView'", RemoteImageView.class);
        baseFollowViewHolder.mHeaderLayout = Utils.findRequiredView(view, C0906R.id.b8r, "field 'mHeaderLayout'");
        baseFollowViewHolder.mAvatarLayout = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.b7y, "field 'mAvatarLayout'", FrameLayout.class);
        baseFollowViewHolder.mAvatarView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp2, "field 'mAvatarView'", AvatarImageView.class);
        baseFollowViewHolder.mStoryRing = (StoryCircleView) Utils.findOptionalViewAsType(view, C0906R.id.cw5, "field 'mStoryRing'", StoryCircleView.class);
        baseFollowViewHolder.mAvatarLoadingView = (AnimationImageView) Utils.findOptionalViewAsType(view, C0906R.id.i8, "field 'mAvatarLoadingView'", AnimationImageView.class);
        baseFollowViewHolder.mAvatarLiveView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.dp9, "field 'mAvatarLiveView'", AvatarImageView.class);
        baseFollowViewHolder.mAvatarBorderView = (LiveCircleView) Utils.findRequiredViewAsType(view, C0906R.id.dq0, "field 'mAvatarBorderView'", LiveCircleView.class);
        baseFollowViewHolder.mCreateTimeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dak, "field 'mCreateTimeView'", TextView.class);
        baseFollowViewHolder.mHeadUserNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dlg, "field 'mHeadUserNameView'", TextView.class);
        baseFollowViewHolder.mRecommendReasonView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dh6, "field 'mRecommendReasonView'", TextView.class);
        baseFollowViewHolder.mCouponContainer = (LinearLayout) Utils.findOptionalViewAsType(view, C0906R.id.a0v, "field 'mCouponContainer'", LinearLayout.class);
        baseFollowViewHolder.mFeedTagLayout2 = (FollowFeedTagLayout2) Utils.findOptionalViewAsType(view, C0906R.id.agv, "field 'mFeedTagLayout2'", FollowFeedTagLayout2.class);
        baseFollowViewHolder.mDescView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.dau, "field 'mDescView'", MentionTextView.class);
        baseFollowViewHolder.mDiggView = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.a4x, "field 'mDiggView'", ImageView.class);
        baseFollowViewHolder.mDiggCountView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.db2, "field 'mDiggCountView'", TextView.class);
        baseFollowViewHolder.mCommentView = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.b02, "field 'mCommentView'", ImageView.class);
        baseFollowViewHolder.mCommentCountView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.d_r, "field 'mCommentCountView'", TextView.class);
        baseFollowViewHolder.mShareView = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.cpw, "field 'mShareView'", ImageView.class);
        baseFollowViewHolder.mShareCountView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dit, "field 'mShareCountView'", TextView.class);
        baseFollowViewHolder.mDiggLayout = (DiggLayout) Utils.findOptionalViewAsType(view, C0906R.id.a51, "field 'mDiggLayout'", DiggLayout.class);
        View findViewById = view.findViewById(C0906R.id.diy);
        baseFollowViewHolder.mShoppingView = (TextView) Utils.castView(findViewById, C0906R.id.diy, "field 'mShoppingView'", TextView.class);
        if (findViewById != null) {
            this.f57470c = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57474a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f57474a, false, 62091, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f57474a, false, 62091, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseFollowViewHolder.clickShopping(view2);
                }
            });
        }
        baseFollowViewHolder.mFollow = (FollowUserBtn) Utils.findOptionalViewAsType(view, C0906R.id.agq, "field 'mFollow'", FollowUserBtn.class);
        baseFollowViewHolder.mCommentLayout = (FollowFeedCommentLayout) Utils.findOptionalViewAsType(view, C0906R.id.b8m, "field 'mCommentLayout'", FollowFeedCommentLayout.class);
        baseFollowViewHolder.mPressLayout = (LongPressLayout) Utils.findOptionalViewAsType(view, C0906R.id.bkq, "field 'mPressLayout'", LongPressLayout.class);
        baseFollowViewHolder.mIvForward = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.b1e, "field 'mIvForward'", ImageView.class);
        baseFollowViewHolder.mFriendTagView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dka, "field 'mFriendTagView'", TextView.class);
        baseFollowViewHolder.mForwardCountView = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dc0, "field 'mForwardCountView'", TextView.class);
        View findViewById2 = view.findViewById(C0906R.id.b8q);
        baseFollowViewHolder.mForwardLayout = (ViewGroup) Utils.castView(findViewById2, C0906R.id.b8q, "field 'mForwardLayout'", ViewGroup.class);
        if (findViewById2 != null) {
            this.f57471d = findViewById2;
            findViewById2.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57477a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f57477a, false, 62092, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f57477a, false, 62092, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseFollowViewHolder.showCreateForward(view2);
                }
            });
        }
        baseFollowViewHolder.mTopDivider = view.findViewById(C0906R.id.d58);
        baseFollowViewHolder.mBottomDivider = view.findViewById(C0906R.id.mb);
        baseFollowViewHolder.mLineDivider = view.findViewById(C0906R.id.bbt);
        View findViewById3 = view.findViewById(C0906R.id.b85);
        if (findViewById3 != null) {
            this.f57472e = findViewById3;
            findViewById3.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57480a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f57480a, false, 62093, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f57480a, false, 62093, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseFollowViewHolder.expandComment(view2);
                }
            });
        }
        View findViewById4 = view.findViewById(C0906R.id.b_l);
        if (findViewById4 != null) {
            this.f57473f = findViewById4;
            findViewById4.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57483a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f57483a, false, 62094, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f57483a, false, 62094, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseFollowViewHolder.showShare(view2);
                }
            });
        }
        View findViewById5 = view.findViewById(C0906R.id.b8e);
        if (findViewById5 != null) {
            this.g = findViewById5;
            findViewById5.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57486a;

                public final void doClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f57486a, false, 62095, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f57486a, false, 62095, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseFollowViewHolder.clickLike(view2);
                }
            });
        }
        View findViewById6 = view.findViewById(C0906R.id.b7s);
        if (findViewById6 != null) {
            this.h = findViewById6;
            findViewById6.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57489a;

                public final void doClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57489a, false, 62096, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57489a, false, 62096, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    baseFollowViewHolder.addComment();
                }
            });
        }
        baseFollowViewHolder.avatarSize = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.gg);
    }
}
