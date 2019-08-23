package com.ss.android.ugc.aweme.fe.method;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.fe.b.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ApiParamMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44426a;

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Map map;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar2}, this, f44426a, false, 39725, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar2}, this, f44426a, false, 39725, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, b.f44409a, true, 39880, new Class[0], Map.class)) {
            map = (Map) PatchProxy.accessDispatch(new Object[0], null, b.f44409a, true, 39880, new Class[0], Map.class);
        } else {
            map = new HashMap();
            NetUtil.putCommonParams(map, true);
        }
        aVar2.a((Object) new JSONObject(map));
    }
}
