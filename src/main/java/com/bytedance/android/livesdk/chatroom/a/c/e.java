package com.bytedance.android.livesdk.chatroom.a.c;

import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.barrage.a.a;

public final /* synthetic */ class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9739a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileEvent f9740b;

    e(UserProfileEvent userProfileEvent) {
        this.f9740b = userProfileEvent;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f9739a, false, 3939, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f9739a, false, 3939, new Class[]{a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) this.f9740b);
    }
}
