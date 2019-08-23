package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.d.b;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49491a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendListFragment f49492b;

    z(FriendListFragment friendListFragment) {
        this.f49492b = friendListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49491a, false, 47307, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49491a, false, 47307, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FriendListFragment friendListFragment = this.f49492b;
        friendListFragment.mStatusView.d();
        ((b) friendListFragment.a()).a();
    }
}
