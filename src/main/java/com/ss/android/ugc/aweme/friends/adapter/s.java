package com.ss.android.ugc.aweme.friends.adapter;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.ui.InviteMoreFriendsActivity;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48822a;

    /* renamed from: b  reason: collision with root package name */
    private final UnRegisteredFriendsViewHolder f48823b;

    s(UnRegisteredFriendsViewHolder unRegisteredFriendsViewHolder) {
        this.f48823b = unRegisteredFriendsViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48822a, false, 46372, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48822a, false, 46372, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        UnRegisteredFriendsViewHolder unRegisteredFriendsViewHolder = this.f48823b;
        if (PatchProxy.isSupport(new Object[0], unRegisteredFriendsViewHolder, UnRegisteredFriendsViewHolder.f48778a, false, 46365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], unRegisteredFriendsViewHolder, UnRegisteredFriendsViewHolder.f48778a, false, 46365, new Class[0], Void.TYPE);
            return;
        }
        unRegisteredFriendsViewHolder.f48780c.startActivity(new Intent(unRegisteredFriendsViewHolder.f48780c, InviteMoreFriendsActivity.class));
    }
}
