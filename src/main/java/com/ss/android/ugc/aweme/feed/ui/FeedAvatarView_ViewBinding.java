package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class FeedAvatarView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46154a;

    /* renamed from: b  reason: collision with root package name */
    private FeedAvatarView f46155b;

    /* renamed from: c  reason: collision with root package name */
    private View f46156c;

    /* renamed from: d  reason: collision with root package name */
    private View f46157d;

    /* renamed from: e  reason: collision with root package name */
    private View f46158e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46154a, false, 42553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46154a, false, 42553, new Class[0], Void.TYPE);
            return;
        }
        FeedAvatarView feedAvatarView = this.f46155b;
        if (feedAvatarView != null) {
            this.f46155b = null;
            feedAvatarView.mAvatarView = null;
            feedAvatarView.mStoryRing = null;
            feedAvatarView.mAvatarLoadingView = null;
            feedAvatarView.mAvatarLiveView = null;
            feedAvatarView.mAvatarBorderView = null;
            feedAvatarView.mAvatarDeco = null;
            feedAvatarView.mFollowContainerView = null;
            feedAvatarView.ivAdLink = null;
            feedAvatarView.mFollowView = null;
            feedAvatarView.mAvatarDecoration = null;
            this.f46156c.setOnClickListener(null);
            this.f46156c = null;
            this.f46157d.setOnClickListener(null);
            this.f46157d = null;
            this.f46158e.setOnClickListener(null);
            this.f46158e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FeedAvatarView_ViewBinding(final FeedAvatarView feedAvatarView, View view) {
        this.f46155b = feedAvatarView;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dp2, "field 'mAvatarView' and method 'onClick'");
        feedAvatarView.mAvatarView = (AvatarWithBorderView) Utils.castView(findRequiredView, C0906R.id.dp2, "field 'mAvatarView'", AvatarWithBorderView.class);
        this.f46156c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46159a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46159a, false, 42554, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46159a, false, 42554, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedAvatarView.onClick(view2);
            }
        });
        feedAvatarView.mStoryRing = (StoryCircleView) Utils.findRequiredViewAsType(view, C0906R.id.cw5, "field 'mStoryRing'", StoryCircleView.class);
        feedAvatarView.mAvatarLoadingView = (AnimationImageView) Utils.findRequiredViewAsType(view, C0906R.id.i8, "field 'mAvatarLoadingView'", AnimationImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dp9, "field 'mAvatarLiveView' and method 'onClick'");
        feedAvatarView.mAvatarLiveView = (AvatarImageWithLive) Utils.castView(findRequiredView2, C0906R.id.dp9, "field 'mAvatarLiveView'", AvatarImageWithLive.class);
        this.f46157d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46162a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46162a, false, 42555, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46162a, false, 42555, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedAvatarView.onClick(view2);
            }
        });
        feedAvatarView.mAvatarBorderView = (LiveCircleView) Utils.findRequiredViewAsType(view, C0906R.id.dp4, "field 'mAvatarBorderView'", LiveCircleView.class);
        feedAvatarView.mAvatarDeco = (RemoteImageView) Utils.findOptionalViewAsType(view, C0906R.id.hu, "field 'mAvatarDeco'", RemoteImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.agt, "field 'mFollowContainerView' and method 'onClick'");
        feedAvatarView.mFollowContainerView = (RelativeLayout) Utils.castView(findRequiredView3, C0906R.id.agt, "field 'mFollowContainerView'", RelativeLayout.class);
        this.f46158e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46165a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46165a, false, 42556, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46165a, false, 42556, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                feedAvatarView.onClick(view2);
            }
        });
        feedAvatarView.ivAdLink = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ce, "field 'ivAdLink'", ImageView.class);
        feedAvatarView.mFollowView = (AnimationImageView) Utils.findRequiredViewAsType(view, C0906R.id.agq, "field 'mFollowView'", AnimationImageView.class);
        feedAvatarView.mAvatarDecoration = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b17, "field 'mAvatarDecoration'", ImageView.class);
        feedAvatarView.avatarSize = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.g5);
    }
}
