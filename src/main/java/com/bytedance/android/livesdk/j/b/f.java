package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class f extends a<e> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15653b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{map2, eVar}, this, f15653b, false, 10939, new Class[]{Map.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, eVar}, this, f15653b, false, 10939, new Class[]{Map.class, e.class}, Void.TYPE);
            return;
        }
        super.a(map2, eVar);
        if (eVar != null) {
            map2.put("status", eVar.f15677a);
        }
    }
}
