package com.ss.android.ugc.aweme.commercialize.link;

import com.bytedance.ies.f.a.a;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.link.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public class LinkAuthBridgeSet extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38941a;

    public LinkAuthBridgeSet() {
    }

    public LinkAuthBridgeSet(a aVar) {
        super(aVar);
    }

    public LinkAuthBridgeSet(ReactContext reactContext) {
        super(reactContext);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f38941a, false, 30868, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f38941a, false, 30868, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 == null) {
            str = "";
        } else {
            str = jSONObject2.optString("data", "");
        }
        if (PatchProxy.isSupport(new Object[]{str}, null, b.f38963a, true, 30864, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, b.f38963a, true, 30864, new Class[]{String.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(str, "value");
            b.a aVar3 = b.f38964b;
            if (aVar3 != null) {
                aVar3.setLinkData(str);
            }
        }
        aVar2.a((Object) null);
    }
}
