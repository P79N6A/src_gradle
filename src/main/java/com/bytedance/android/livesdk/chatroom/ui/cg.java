package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.fresco.h;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cg implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12007a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnClickListener f12008b = new cg();

    private cg() {
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12007a, false, 5926, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f12007a, false, 5926, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Object a2 = h.a(view2, String.valueOf(view.getId()));
        if (a2 != null) {
            a.a().a((Object) new UserProfileEvent((User) a2, "guest_waiting_list"));
        }
    }
}
