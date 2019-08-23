package com.bytedance.android.livesdk.kickout.ui;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15760a;

    /* renamed from: b  reason: collision with root package name */
    private final User f15761b;

    a(User user) {
        this.f15761b = user;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15760a, false, 10218, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15760a, false, 10218, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent(this.f15761b));
    }
}
