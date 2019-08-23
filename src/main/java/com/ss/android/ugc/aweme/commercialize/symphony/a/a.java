package com.ss.android.ugc.aweme.commercialize.symphony.a;

import com.bytedance.ad.symphony.ad.nativead.d;
import com.bytedance.ad.symphony.b.b;
import com.bytedance.ad.symphony.b.f;
import com.bytedance.ad.symphony.g.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f39544b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ad.symphony.model.a f39545c;

    /* renamed from: d  reason: collision with root package name */
    public b f39546d = new b();

    /* renamed from: e  reason: collision with root package name */
    private b f39547e = new b();

    public static a a(JSONObject jSONObject) {
        e eVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, null, f39544b, true, 32208, new Class[]{JSONObject.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, f39544b, true, 32208, new Class[]{JSONObject.class}, a.class);
        }
        try {
            a aVar = new a();
            aVar.f39545c = com.bytedance.ad.symphony.model.a.a(jSONObject);
            b bVar = new b();
            bVar.f7582a = new HashMap();
            bVar.f7583b = "draw_ad";
            aVar.f39546d = bVar;
            if (!aVar.f39547e.f39548a) {
                com.bytedance.ad.symphony.model.a aVar2 = aVar.f39545c;
                String str = aVar.f39546d.f7583b;
                Map<String, Object> map = aVar.f39546d.f7582a;
                if (aVar2 != null && !com.bytedance.ad.symphony.g.d.a(aVar2.f7642b) && f.a()) {
                    try {
                        eVar = new e(map);
                    } catch (ConcurrentModificationException e2) {
                        com.bytedance.ad.symphony.d.a(e2);
                        eVar = new e();
                    }
                    List<String> list = aVar2.f7642b;
                    eVar.put("ad_placement_type", list);
                    if (!com.bytedance.ad.symphony.g.d.a(list)) {
                        eVar.put("ad_placement_type_prefix", com.bytedance.ad.symphony.model.config.a.a(list.get(0)));
                    }
                    if (aVar2 != null) {
                        f.a("ad_slot_receive", str, aVar2.f7644d, aVar2.f7643c, eVar);
                    }
                }
                aVar.f39547e.f39548a = true;
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
