package com.ss.android.ugc.aweme.cloudcontrol.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.e.a;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.websocket.b.b.c;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36229a;

    public static void a(AbTestModel abTestModel) {
        AbTestModel abTestModel2 = abTestModel;
        if (PatchProxy.isSupport(new Object[]{abTestModel2}, null, f36229a, true, 27053, new Class[]{AbTestModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abTestModel2}, null, f36229a, true, 27053, new Class[]{AbTestModel.class}, Void.TYPE);
            return;
        }
        a.a().a(abTestModel2);
    }

    public static void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f36229a, true, 27051, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, null, f36229a, true, 27051, new Class[]{c.class}, Void.TYPE);
            return;
        }
        try {
            JSONArray optJSONArray = new JSONObject(a.a(cVar2.f78209b)).optJSONObject("configs").optJSONArray("cloud_commands");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    com.monitor.cloudmessage.a.a().a(optJSONArray.optString(i));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
