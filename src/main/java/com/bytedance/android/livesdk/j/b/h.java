package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.f;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;

public final class h extends a<f> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15654b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        f fVar = (f) obj;
        if (PatchProxy.isSupport(new Object[]{map2, fVar}, this, f15654b, false, 10940, new Class[]{Map.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, fVar}, this, f15654b, false, 10940, new Class[]{Map.class, f.class}, Void.TYPE);
            return;
        }
        if (fVar != null) {
            if (fVar.f15678a > 0) {
                map2.put("channel_id", String.valueOf(fVar.f15678a));
            }
            if (fVar.f15679b > 0) {
                map2.put("right_user_id", String.valueOf(fVar.f15679b));
            }
            if (fVar.f15680c > 0) {
                map2.put("pk_time", String.valueOf(fVar.f15680c));
                map2.put("connection_type", fVar.f15681d);
                map2.put("match_type", fVar.f15682e);
                if (fVar.f15683f > 0) {
                    map2.put("pk_id", String.valueOf(fVar.f15683f));
                }
                if (StringUtils.isEmpty(fVar.g)) {
                    map2.put(PushConstants.TITLE, fVar.g);
                }
                if (fVar.h > 0) {
                    map2.put("backdoor_time", String.valueOf(fVar.h));
                }
            } else {
                map2.put("connection_type", "anchor");
            }
        }
    }
}
