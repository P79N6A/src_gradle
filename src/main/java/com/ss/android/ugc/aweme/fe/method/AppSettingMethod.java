package com.ss.android.ugc.aweme.fe.method;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import org.json.JSONException;
import org.json.JSONObject;

public class AppSettingMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44429a;

    private JSONObject a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44429a, false, 39728, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f44429a, false, 39728, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (AbTestManager.a().aI() == 1 && TimeLockRuler.isContentFilterOn()) {
                i = 1;
            }
            jSONObject.put("isTeenagersModel", i);
            jSONObject.put("language", e.b());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar2}, this, f44429a, false, 39727, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar2}, this, f44429a, false, 39727, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        aVar2.a((Object) a());
    }
}
