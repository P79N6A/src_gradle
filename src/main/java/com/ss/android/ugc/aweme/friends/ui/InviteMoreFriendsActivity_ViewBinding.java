package com.ss.android.ugc.aweme.friends.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class InviteMoreFriendsActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49321a;

    /* renamed from: b  reason: collision with root package name */
    private InviteMoreFriendsActivity f49322b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49321a, false, 47381, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49321a, false, 47381, new Class[0], Void.TYPE);
            return;
        }
        InviteMoreFriendsActivity inviteMoreFriendsActivity = this.f49322b;
        if (inviteMoreFriendsActivity != null) {
            this.f49322b = null;
            inviteMoreFriendsActivity.mTitleBar = null;
            inviteMoreFriendsActivity.mListView = null;
            inviteMoreFriendsActivity.mStatusView = null;
            inviteMoreFriendsActivity.mRefreshLayout = null;
            inviteMoreFriendsActivity.mInviteSelectedTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public InviteMoreFriendsActivity_ViewBinding(InviteMoreFriendsActivity inviteMoreFriendsActivity, View view) {
        this.f49322b = inviteMoreFriendsActivity;
        inviteMoreFriendsActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        inviteMoreFriendsActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mListView'", RecyclerView.class);
        inviteMoreFriendsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        inviteMoreFriendsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        inviteMoreFriendsActivity.mInviteSelectedTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.avg, "field 'mInviteSelectedTv'", TextView.class);
    }
}
