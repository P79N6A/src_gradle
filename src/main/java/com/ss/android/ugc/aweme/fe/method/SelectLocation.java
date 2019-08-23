package com.ss.android.ugc.aweme.fe.method;

import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.profile.ui.du;
import org.json.JSONException;
import org.json.JSONObject;

public class SelectLocation extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44487a;

    public SelectLocation(ReactContext reactContext) {
        super(reactContext);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f44487a, false, 39813, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f44487a, false, 39813, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        du duVar = new du(p.a().e());
        duVar.a();
        duVar.g = new du.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44488a;

            public final void a(boolean z, String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f44488a, false, 39814, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, this, f44488a, false, 39814, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventName", "locationSelected");
                    if (!z) {
                        jSONObject.put("code", 0);
                    } else {
                        jSONObject.put("code", 1);
                        jSONObject.put("location", str2);
                    }
                    try {
                        SelectLocation.this.a("notification", jSONObject, 2);
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                }
            }
        };
    }
}
