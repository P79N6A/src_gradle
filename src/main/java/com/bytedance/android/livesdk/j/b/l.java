package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class l extends a<k> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15658b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        k kVar = (k) obj;
        if (PatchProxy.isSupport(new Object[]{map2, kVar}, this, f15658b, false, 10944, new Class[]{Map.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, kVar}, this, f15658b, false, 10944, new Class[]{Map.class, k.class}, Void.TYPE);
            return;
        }
        super.a(map2, kVar);
        if (kVar != null && map2.containsKey("_staging_flag")) {
            map2.remove("_staging_flag");
        }
    }
}
