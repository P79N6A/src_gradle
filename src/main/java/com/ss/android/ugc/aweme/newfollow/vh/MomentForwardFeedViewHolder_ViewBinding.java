package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder_ViewBinding;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class MomentForwardFeedViewHolder_ViewBinding extends BaseForwardViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57655b;

    /* renamed from: c  reason: collision with root package name */
    private MomentForwardFeedViewHolder f57656c;

    /* renamed from: d  reason: collision with root package name */
    private View f57657d;

    /* renamed from: e  reason: collision with root package name */
    private View f57658e;

    /* renamed from: f  reason: collision with root package name */
    private View f57659f;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57655b, false, 62649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57655b, false, 62649, new Class[0], Void.TYPE);
            return;
        }
        MomentForwardFeedViewHolder momentForwardFeedViewHolder = this.f57656c;
        if (momentForwardFeedViewHolder != null) {
            this.f57656c = null;
            momentForwardFeedViewHolder.mForwardContainer = null;
            momentForwardFeedViewHolder.mCenterContainer = null;
            momentForwardFeedViewHolder.mHeaderContainer = null;
            momentForwardFeedViewHolder.mPlayView = null;
            momentForwardFeedViewHolder.mCoverView = null;
            momentForwardFeedViewHolder.mFriendPermissionView = null;
            momentForwardFeedViewHolder.mFriendPermissionCover = null;
            momentForwardFeedViewHolder.mOriginDescView = null;
            momentForwardFeedViewHolder.mOriginHeader = null;
            momentForwardFeedViewHolder.mOriginNickName = null;
            momentForwardFeedViewHolder.mDynamicStub = null;
            this.f57657d.setOnClickListener(null);
            this.f57657d = null;
            this.f57658e.setOnClickListener(null);
            this.f57658e = null;
            this.f57659f.setOnClickListener(null);
            this.f57659f = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MomentForwardFeedViewHolder_ViewBinding(final MomentForwardFeedViewHolder momentForwardFeedViewHolder, View view) {
        super(momentForwardFeedViewHolder, view);
        this.f57656c = momentForwardFeedViewHolder;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ci0, "field 'mForwardContainer' and method 'onCheckDetail'");
        momentForwardFeedViewHolder.mForwardContainer = findRequiredView;
        this.f57657d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57660a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57660a, false, 62650, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57660a, false, 62650, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                momentForwardFeedViewHolder.onCheckDetail();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.baf, "field 'mCenterContainer' and method 'onClickOriginContent'");
        momentForwardFeedViewHolder.mCenterContainer = findRequiredView2;
        this.f57658e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57663a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f57663a, false, 62651, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f57663a, false, 62651, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                momentForwardFeedViewHolder.onClickOriginContent(view2);
            }
        });
        momentForwardFeedViewHolder.mHeaderContainer = Utils.findRequiredView(view, C0906R.id.afn, "field 'mHeaderContainer'");
        momentForwardFeedViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b43, "field 'mPlayView'", ImageView.class);
        momentForwardFeedViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mCoverView'", RemoteImageView.class);
        momentForwardFeedViewHolder.mFriendPermissionView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dc4, "field 'mFriendPermissionView'", DmtTextView.class);
        momentForwardFeedViewHolder.mFriendPermissionCover = Utils.findRequiredView(view, C0906R.id.a1c, "field 'mFriendPermissionCover'");
        momentForwardFeedViewHolder.mOriginDescView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.dft, "field 'mOriginDescView'", MentionTextView.class);
        momentForwardFeedViewHolder.mOriginHeader = Utils.findRequiredView(view, C0906R.id.b9j, "field 'mOriginHeader'");
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.dfe, "field 'mOriginNickName' and method 'onClickOriginNickName'");
        momentForwardFeedViewHolder.mOriginNickName = (DmtTextView) Utils.castView(findRequiredView3, C0906R.id.dfe, "field 'mOriginNickName'", DmtTextView.class);
        this.f57659f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57666a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f57666a, false, 62652, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f57666a, false, 62652, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                momentForwardFeedViewHolder.onClickOriginNickName(view2);
            }
        });
        momentForwardFeedViewHolder.mDynamicStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
    }
}
