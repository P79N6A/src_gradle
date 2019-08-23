package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feedback.g;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedbackUploadALog extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76647a;

    public FeedbackUploadALog() {
    }

    private JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f76647a, false, 89962, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76647a, false, 89962, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableFeedbackLog()) {
            try {
                String a2 = g.a();
                if (!TextUtils.isEmpty(a2)) {
                    jSONObject.put("aweme_infra_log", a2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public FeedbackUploadALog(a aVar) {
        super(aVar);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) throws JSONException {
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar2}, this, f76647a, false, 89961, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar2}, this, f76647a, false, 89961, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        aVar2.a((Object) a());
        com.ss.android.ugc.aweme.b.a.a.f34456b.a();
    }
}
