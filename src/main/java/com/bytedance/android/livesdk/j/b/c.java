package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class c extends a<b> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15650b;

    public final void a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f15650b, false, 10936, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, this, f15650b, false, 10936, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        super.a(map);
        map2.put("_param_live_platform", "live");
    }
}
