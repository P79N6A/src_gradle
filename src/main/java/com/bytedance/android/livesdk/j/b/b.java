package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class b extends a<a> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15649b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{map2, aVar}, this, f15649b, false, 10935, new Class[]{Map.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, aVar}, this, f15649b, false, 10935, new Class[]{Map.class, a.class}, Void.TYPE);
            return;
        }
        super.a(map2, aVar);
        if (aVar != null) {
            map2.put("action_type", aVar.f15670a);
        }
    }
}
