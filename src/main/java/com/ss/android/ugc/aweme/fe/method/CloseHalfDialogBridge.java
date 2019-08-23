package com.ss.android.ugc.aweme.fe.method;

import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONObject;

public class CloseHalfDialogBridge extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44433a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f44434a;

        a(JSONObject jSONObject) {
            this.f44434a = jSONObject;
        }
    }

    public CloseHalfDialogBridge(com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    public CloseHalfDialogBridge(ReactContext reactContext) {
        super(reactContext);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar}, this, f44433a, false, 39742, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar}, this, f44433a, false, 39742, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        bg.a(new a(jSONObject2));
    }
}
