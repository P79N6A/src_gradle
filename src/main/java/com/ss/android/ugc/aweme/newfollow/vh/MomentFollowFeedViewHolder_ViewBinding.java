package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MomentFollowFeedViewHolder_ViewBinding extends BaseFollowViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57651b;

    /* renamed from: c  reason: collision with root package name */
    private MomentFollowFeedViewHolder f57652c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57651b, false, 62614, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57651b, false, 62614, new Class[0], Void.TYPE);
            return;
        }
        MomentFollowFeedViewHolder momentFollowFeedViewHolder = this.f57652c;
        if (momentFollowFeedViewHolder != null) {
            this.f57652c = null;
            momentFollowFeedViewHolder.mCenterContainer = null;
            momentFollowFeedViewHolder.mHeaderContainer = null;
            momentFollowFeedViewHolder.mPlayView = null;
            momentFollowFeedViewHolder.mFriendPermissionView = null;
            momentFollowFeedViewHolder.mFriendPermissionCover = null;
            momentFollowFeedViewHolder.mDynamicStub = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MomentFollowFeedViewHolder_ViewBinding(MomentFollowFeedViewHolder momentFollowFeedViewHolder, View view) {
        super(momentFollowFeedViewHolder, view);
        this.f57652c = momentFollowFeedViewHolder;
        momentFollowFeedViewHolder.mCenterContainer = Utils.findRequiredView(view, C0906R.id.baf, "field 'mCenterContainer'");
        momentFollowFeedViewHolder.mHeaderContainer = Utils.findRequiredView(view, C0906R.id.afn, "field 'mHeaderContainer'");
        momentFollowFeedViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b43, "field 'mPlayView'", ImageView.class);
        momentFollowFeedViewHolder.mFriendPermissionView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dc4, "field 'mFriendPermissionView'", DmtTextView.class);
        momentFollowFeedViewHolder.mFriendPermissionCover = Utils.findRequiredView(view, C0906R.id.a1c, "field 'mFriendPermissionCover'");
        momentFollowFeedViewHolder.mDynamicStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
    }
}
