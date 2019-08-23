package com.bytedance.android.livesdk.j.b;

import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.j.c.i;
import com.bytedance.android.livesdk.j.c.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONObject;

public final class p extends a<n> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15666b;

    public final /* synthetic */ void a(Map map, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        Map map2 = map;
        n nVar = (n) obj;
        if (PatchProxy.isSupport(new Object[]{map2, nVar}, this, f15666b, false, 10951, new Class[]{Map.class, n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, nVar}, this, f15666b, false, 10951, new Class[]{Map.class, n.class}, Void.TYPE);
            return;
        }
        super.a(map2, nVar);
        if (nVar != null) {
            b bVar = nVar.f15707c;
            Prop prop = nVar.f15708d;
            if (i.f15692b == nVar.f15709e) {
                str = "guest_";
            } else {
                str = "";
            }
            if (bVar != null && bVar.a()) {
                str2 = "animation_gift";
            } else if (nVar.g == 1) {
                str2 = "single_gift";
            } else if (nVar.h > 1) {
                str2 = "bunching_gift";
            } else {
                str2 = "running_gift";
            }
            if (!map2.containsKey("request_page")) {
                map2.put("request_page", "normal");
            }
            if (nVar.f15706b > 0) {
                str3 = "prop_type";
            } else {
                str3 = "gift_type";
            }
            if (nVar.f15706b > 0) {
                str4 = "prop_id";
            } else {
                str4 = "gift_id";
            }
            map2.put(str3, str + str2);
            if (nVar.f15706b > 0) {
                j = nVar.f15706b;
            } else {
                j = nVar.f15705a;
            }
            map2.put(str4, String.valueOf(j));
            if (nVar.f15706b <= 0) {
                map2.put("gift_cnt", String.valueOf(nVar.g));
            } else {
                map2.put("prop_cnt", String.valueOf(nVar.g));
            }
            map2.put("group_cnt", String.valueOf(nVar.h));
            map2.put("combo_cnt", String.valueOf(nVar.f15710f));
            if (i.f15692b == nVar.f15709e) {
                map2.put("guest_id", String.valueOf(nVar.j));
            }
            if (nVar.f15706b <= 0 && bVar != null) {
                map2.put("money", String.valueOf(nVar.g * bVar.f15107f));
            } else if (!(nVar.f15706b <= 0 || prop == null || bVar == null)) {
                map2.put("income", String.valueOf(nVar.g * bVar.f15107f));
                map2.put("money", String.valueOf(nVar.g * bVar.f15107f));
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (nVar.f15706b <= 0) {
                    jSONObject.put(String.valueOf(nVar.f15705a), String.valueOf(nVar.g));
                    map2.put("gift_info", jSONObject.toString());
                } else {
                    jSONObject.put(String.valueOf(nVar.f15706b), String.valueOf(nVar.g));
                    map2.put("prop_info", jSONObject.toString());
                }
            } catch (Exception unused) {
            }
        }
    }
}
