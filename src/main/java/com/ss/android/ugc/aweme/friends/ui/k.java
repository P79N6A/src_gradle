package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.share.c.i;
import com.ss.android.ugc.aweme.share.invitefriends.b;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49465a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49466b;

    k(FindFriendsFragment findFriendsFragment) {
        this.f49466b = findFriendsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49465a, false, 47168, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49465a, false, 47168, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FindFriendsFragment findFriendsFragment = this.f49466b;
        if (!a.a(view)) {
            b.a(0, findFriendsFragment.getActivity(), findFriendsFragment.l);
            findFriendsFragment.a(i.a(0), findFriendsFragment.l);
        }
    }
}
