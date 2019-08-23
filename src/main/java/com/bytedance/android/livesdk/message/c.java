package com.bytedance.android.livesdk.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16398a;

    public static String a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f16398a, true, 10960, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user2}, null, f16398a, true, 10960, new Class[]{User.class}, String.class);
        } else if (a.j()) {
            return user2.displayId;
        } else {
            return user.getNickName();
        }
    }
}
