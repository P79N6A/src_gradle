package com.bytedance.android.livesdk.browser.jsbridge.c;

import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d implements com.bytedance.ies.f.a.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9454a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<a> f9455b;

    public interface a {
        void a(long j);

        void a(String str);

        void a(String str, Object obj);

        void g();
    }

    public d(WeakReference<a> weakReference) {
        this.f9455b = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f9454a, false, 3621, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f9454a, false, 3621, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (hVar2.f20623d != null) {
            a aVar = (a) this.f9455b.get();
            String optString = hVar2.f20623d.optString("type");
            char c2 = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != -1361632588) {
                if (hashCode == 24553548 && optString.equals("cashdesk")) {
                    c2 = 1;
                }
            } else if (optString.equals("charge")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    aVar.a(com.bytedance.android.live.core.d.d.a("ttlive_charge_open_fe_detail"));
                    break;
                case 1:
                    aVar.a(com.bytedance.android.live.core.d.d.a("ttlive_charge_open_check_fe_detail"));
                    break;
            }
            if (hVar2.f20623d.has("args")) {
                JSONObject optJSONObject = hVar2.f20623d.optJSONObject("args");
                if (optJSONObject.has("first_loaded")) {
                    aVar.g();
                }
                if (optJSONObject.has("blank_duration")) {
                    long optLong = optJSONObject.optLong("blank_duration");
                    aVar.a("blank_duration", Long.valueOf(optLong));
                    aVar.a(optLong);
                }
                if (optJSONObject.has("interactive_duration")) {
                    aVar.a("interactive_duration", Long.valueOf(optJSONObject.optLong("interactive_duration")));
                }
                if (optJSONObject.has("finished_duration")) {
                    aVar.a("finished_duration", Long.valueOf(optJSONObject.optLong("finished_duration")));
                }
            }
        }
    }
}
