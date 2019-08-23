package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.ej;
import org.json.JSONException;
import org.json.JSONObject;

public class IsAppInstalledMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76648a;

    public IsAppInstalledMethod() {
    }

    public IsAppInstalledMethod(a aVar) {
        super(aVar);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f76648a, false, 89984, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f76648a, false, 89984, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        String string = jSONObject2.getString("packageName");
        if (ej.a(GlobalContext.getContext(), string)) {
            aVar2.a((Object) new JSONObject());
        } else {
            aVar2.a(-1, string);
        }
    }
}
