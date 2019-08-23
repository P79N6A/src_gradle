package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class q extends a<User> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15667b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        User user = (User) obj;
        if (PatchProxy.isSupport(new Object[]{map2, user}, this, f15667b, false, 10952, new Class[]{Map.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, user}, this, f15667b, false, 10952, new Class[]{Map.class, User.class}, Void.TYPE);
            return;
        }
        super.a(map2, user);
    }
}
