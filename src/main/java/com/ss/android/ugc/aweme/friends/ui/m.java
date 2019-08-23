package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.d.j;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49469a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49470b;

    m(FindFriendsFragment findFriendsFragment) {
        this.f49470b = findFriendsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49469a, false, 47170, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49469a, false, 47170, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FindFriendsFragment findFriendsFragment = this.f49470b;
        findFriendsFragment.mStatusView.d();
        ((j) findFriendsFragment.a()).a();
    }
}
