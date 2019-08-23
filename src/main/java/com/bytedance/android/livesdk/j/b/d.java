package com.bytedance.android.livesdk.j.b;

import android.text.TextUtils;
import com.bytedance.android.livesdk.j.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class d extends a<c> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15651b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        c cVar = (c) obj;
        if (PatchProxy.isSupport(new Object[]{map2, cVar}, this, f15651b, false, 10937, new Class[]{Map.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, cVar}, this, f15651b, false, 10937, new Class[]{Map.class, c.class}, Void.TYPE);
            return;
        }
        super.a(map2, cVar);
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.f15671a)) {
                map2.put("request_page", cVar.f15671a);
            }
            if (cVar.f15672b > 0) {
                map2.put("to_user_id", String.valueOf(cVar.f15672b));
            }
            if (!TextUtils.isEmpty(cVar.f15673c)) {
                map2.put("type", cVar.f15673c);
            }
            if (!TextUtils.isEmpty(cVar.f15674d)) {
                map2.put("preview_source", cVar.f15674d);
            }
        }
    }
}
