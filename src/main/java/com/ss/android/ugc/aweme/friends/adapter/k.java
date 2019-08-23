package com.ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48807a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendsViewHolder f48808b;

    k(FriendsViewHolder friendsViewHolder) {
        this.f48808b = friendsViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48807a, false, 46317, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48807a, false, 46317, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f48808b.a("click_card");
    }
}
