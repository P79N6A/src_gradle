package com.ss.android.ugc.aweme.fe.method.charge;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import org.json.JSONObject;

public class ChargeMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44536a;

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        final BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44536a, false, 39853, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44536a, false, 39853, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject2.optJSONObject("args");
            if (optJSONObject == null) {
                aVar2.a(-1, "args == null");
                return;
            }
            String string = jSONObject2.getString("type");
            if (!TextUtils.isEmpty(string)) {
                try {
                    ((IWalletService) ServiceManager.get().getService(IWalletService.class)).pay(string, optJSONObject, new IWalletService.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f44537a;

                        public final void onSuccess(JSONObject jSONObject) {
                            JSONObject jSONObject2 = jSONObject;
                            if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f44537a, false, 39854, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f44537a, false, 39854, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            aVar2.a((Object) jSONObject2);
                        }

                        public final void onFail(Exception exc) {
                            if (PatchProxy.isSupport(new Object[]{exc}, this, f44537a, false, 39855, new Class[]{Exception.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{exc}, this, f44537a, false, 39855, new Class[]{Exception.class}, Void.TYPE);
                                return;
                            }
                            aVar2.a(-1, exc.getMessage());
                        }
                    });
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar2.a(-1, e.getMessage());
        }
    }
}
