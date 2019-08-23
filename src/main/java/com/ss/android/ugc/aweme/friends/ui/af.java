package com.ss.android.ugc.aweme.friends.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public final /* synthetic */ class af implements SwipeRefreshLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49390a;

    /* renamed from: b  reason: collision with root package name */
    private final InviteMoreFriendsActivity f49391b;

    af(InviteMoreFriendsActivity inviteMoreFriendsActivity) {
        this.f49391b = inviteMoreFriendsActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49390a, false, 47376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49390a, false, 47376, new Class[0], Void.TYPE);
            return;
        }
        InviteMoreFriendsActivity inviteMoreFriendsActivity = this.f49391b;
        if (inviteMoreFriendsActivity.f49313d != null) {
            inviteMoreFriendsActivity.f49313d.a(1);
            return;
        }
        inviteMoreFriendsActivity.mRefreshLayout.setRefreshing(false);
    }
}
