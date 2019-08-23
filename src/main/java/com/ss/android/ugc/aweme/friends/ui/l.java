package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.share.c.i;
import com.ss.android.ugc.aweme.share.invitefriends.b;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49467a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49468b;

    l(FindFriendsFragment findFriendsFragment) {
        this.f49468b = findFriendsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49467a, false, 47169, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49467a, false, 47169, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FindFriendsFragment findFriendsFragment = this.f49468b;
        if (!a.a(view)) {
            b.a(1, findFriendsFragment.getActivity(), findFriendsFragment.l);
            findFriendsFragment.a(i.a(1), findFriendsFragment.l);
        }
    }
}
