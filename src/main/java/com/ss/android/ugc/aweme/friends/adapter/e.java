package com.ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.shortvideo.util.an;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48793a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendListViewHolder f48794b;

    /* renamed from: c  reason: collision with root package name */
    private final c f48795c;

    e(FriendListViewHolder friendListViewHolder, c cVar) {
        this.f48794b = friendListViewHolder;
        this.f48795c = cVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48793a, false, 46284, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48793a, false, 46284, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FriendListViewHolder friendListViewHolder = this.f48794b;
        c cVar = this.f48795c;
        UserProfileActivity.a(view.getContext(), cVar.getUser());
        b.a().cleanUpdateTagCount(cVar.getUser().getUid());
        an.a(friendListViewHolder.f48720c, 1.0f, 0.0f);
        friendListViewHolder.f48720c.setVisibility(8);
    }
}
