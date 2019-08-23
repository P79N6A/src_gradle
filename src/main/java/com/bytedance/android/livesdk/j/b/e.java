package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class e extends a<d> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15652b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{map2, dVar}, this, f15652b, false, 10938, new Class[]{Map.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, dVar}, this, f15652b, false, 10938, new Class[]{Map.class, d.class}, Void.TYPE);
            return;
        }
        super.a(map2, dVar);
        if (dVar != null) {
            map2.put("gesture_id", String.valueOf(dVar.f15676a));
        }
    }
}
