package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class m extends a<l> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15659b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        l lVar = (l) obj;
        if (PatchProxy.isSupport(new Object[]{map2, lVar}, this, f15659b, false, 10945, new Class[]{Map.class, l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, lVar}, this, f15659b, false, 10945, new Class[]{Map.class, l.class}, Void.TYPE);
            return;
        }
        super.a(map2, lVar);
        if (lVar != null) {
            map2.put("prompt", lVar.f15699a);
        }
    }
}
