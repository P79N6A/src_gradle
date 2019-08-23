package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class k extends a<j> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15657b;

    public final /* synthetic */ void a(Map map, Object obj) {
        Map map2 = map;
        j jVar = (j) obj;
        if (PatchProxy.isSupport(new Object[]{map2, jVar}, this, f15657b, false, 10943, new Class[]{Map.class, j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, jVar}, this, f15657b, false, 10943, new Class[]{Map.class, j.class}, Void.TYPE);
            return;
        }
        super.a(map2, jVar);
        if (jVar != null) {
            if (!StringUtils.isEmpty(jVar.f15694b)) {
                map2.put("event_page", jVar.f15694b);
            }
            if (!StringUtils.isEmpty(jVar.f15695c)) {
                map2.put("event_module", jVar.f15695c);
            }
            if (!StringUtils.isEmpty(jVar.f15696d)) {
                map2.put("source", jVar.f15696d);
            }
            if (!StringUtils.isEmpty(jVar.f15697e)) {
                map2.put("enter_from", jVar.f15697e);
            }
            if (!StringUtils.isEmpty(jVar.f15693a)) {
                map2.put("event_belong", jVar.f15693a);
            }
            if (!StringUtils.isEmpty(jVar.f15698f)) {
                map2.put("event_type", jVar.f15698f);
            }
            if (!StringUtils.isEmpty(jVar.g)) {
                map2.put("action_type", jVar.g);
            }
            if (!StringUtils.isEmpty(jVar.h)) {
                map2.put("top_message_type", jVar.h);
            }
        }
    }
}
