package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class j extends a<h> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15656b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        h hVar = (h) obj;
        if (PatchProxy.isSupport(new Object[]{map2, hVar}, this, f15656b, false, 10942, new Class[]{Map.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, hVar}, this, f15656b, false, 10942, new Class[]{Map.class, h.class}, Void.TYPE);
            return;
        }
        super.a(map2, hVar);
        if (hVar != null) {
            map2.put("duration", String.valueOf(hVar.f15690a));
        }
    }
}
