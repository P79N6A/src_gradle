package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.g;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;

public final class i extends a<g> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15655b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        g gVar = (g) obj;
        if (PatchProxy.isSupport(new Object[]{map2, gVar}, this, f15655b, false, 10941, new Class[]{Map.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, gVar}, this, f15655b, false, 10941, new Class[]{Map.class, g.class}, Void.TYPE);
            return;
        }
        super.a(map2, gVar);
        if (gVar != null) {
            if (gVar.f15687d > 0) {
                map2.put("channel_id", String.valueOf(gVar.f15687d));
            }
            if (gVar.f15685b > 0) {
                map2.put("invitee_id", String.valueOf(gVar.f15685b));
            }
            if (gVar.f15684a > 0) {
                map2.put("inviter_id", String.valueOf(gVar.f15684a));
            }
            if (!StringUtils.isEmpty(gVar.h)) {
                map2.put("match_type", gVar.h);
            }
            if (!StringUtils.isEmpty(gVar.f15686c)) {
                map2.put("end_type", gVar.f15686c);
            }
            if (!StringUtils.isEmpty(gVar.f15688e)) {
                map2.put("connection_type", gVar.f15688e);
                if (gVar.f15688e.equals(PushConstants.URI_PACKAGE_NAME)) {
                    if (!StringUtils.isEmpty(gVar.f15689f)) {
                        map2.put(PushConstants.TITLE, gVar.f15689f);
                    }
                    if (gVar.g > 0) {
                        map2.put("pk_time", String.valueOf(gVar.g));
                    }
                }
            }
        }
    }
}
