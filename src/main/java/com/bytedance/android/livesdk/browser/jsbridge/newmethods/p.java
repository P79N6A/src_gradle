package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.d.e;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class p extends d<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9609a;

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9609a, false, 3687, new Class[]{JSONObject.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9609a, false, 3687, new Class[]{JSONObject.class, f.class}, Object.class);
        }
        String optString = jSONObject.optString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        char c2 = 65535;
        int hashCode = optString.hashCode();
        if (hashCode != -1853762817) {
            if (hashCode != -858688242) {
                if (hashCode == 1821543916 && optString.equals("monitorStatus")) {
                    c2 = 0;
                }
            } else if (optString.equals("monitorDuration")) {
                c2 = 1;
            }
        } else if (optString.equals("monitorStatusAndDuration")) {
            c2 = 2;
        }
        switch (c2) {
            case 0:
                if (!PatchProxy.isSupport(new Object[]{jSONObject2}, this, f9609a, false, 3688, new Class[]{JSONObject.class}, Void.TYPE)) {
                    e.a(jSONObject2.optString("service"), jSONObject2.optInt("status"), jSONObject2.optJSONObject("ext_json"));
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f9609a, false, 3688, new Class[]{JSONObject.class}, Void.TYPE);
                    break;
                }
            case 1:
                if (!PatchProxy.isSupport(new Object[]{jSONObject2}, this, f9609a, false, 3689, new Class[]{JSONObject.class}, Void.TYPE)) {
                    String optString2 = jSONObject2.optString("service");
                    long optLong = jSONObject2.optLong("duration");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("ext_json");
                    if (!PatchProxy.isSupport(new Object[]{optString2, new Long(optLong), optJSONObject}, null, e.f7842a, true, 381, new Class[]{String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                        JSONObject a2 = e.a(optLong);
                        e.a(optJSONObject);
                        if (!PatchProxy.isSupport(new Object[]{optString2, a2, optJSONObject}, null, e.f7842a, true, 382, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
                            e.a().a(optString2, a2, optJSONObject);
                            if (e.b()) {
                                a.b(e.a(optString2), e.a(optString2, a2, optJSONObject));
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{optString2, a2, optJSONObject}, null, e.f7842a, true, 382, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[]{optString2, new Long(optLong), optJSONObject}, null, e.f7842a, true, 381, new Class[]{String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f9609a, false, 3689, new Class[]{JSONObject.class}, Void.TYPE);
                    break;
                }
                break;
            case 2:
                if (!PatchProxy.isSupport(new Object[]{jSONObject2}, this, f9609a, false, 3690, new Class[]{JSONObject.class}, Void.TYPE)) {
                    e.a(jSONObject2.optString("service"), jSONObject2.optInt("status"), jSONObject2.optLong("duration"), jSONObject2.optJSONObject("ext_json"));
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f9609a, false, 3690, new Class[]{JSONObject.class}, Void.TYPE);
                    break;
                }
        }
        return null;
    }
}
