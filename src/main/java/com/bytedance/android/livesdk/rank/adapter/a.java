package com.bytedance.android.livesdk.rank.adapter;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16926a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnClickListener f16927b = new a();

    private a() {
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16926a, false, 13008, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16926a, false, 13008, new Class[]{View.class}, Void.TYPE);
        } else if (view.getTag() != null && (view.getTag() instanceof User)) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent((User) view.getTag(), "guest_contribution_list"));
        }
    }
}
