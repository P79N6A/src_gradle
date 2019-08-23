package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.i;
import com.bytedance.android.livesdk.j.c.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class o extends a<m> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15665b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        m mVar = (m) obj;
        if (PatchProxy.isSupport(new Object[]{map2, mVar}, this, f15665b, false, 10950, new Class[]{Map.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, mVar}, this, f15665b, false, 10950, new Class[]{Map.class, m.class}, Void.TYPE);
            return;
        }
        super.a(map2, mVar);
        if (mVar != null) {
            map2.put("gift_type", mVar.f15700a);
            map2.put("gift_id", mVar.f15701b);
            map2.put("money", String.valueOf(mVar.f15702c));
            if (i.f15692b == mVar.f15703d) {
                map2.put("guest_id", String.valueOf(mVar.f15704e));
            }
        }
    }
}
