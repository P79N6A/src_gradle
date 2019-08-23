package com.ss.android.ugc.aweme.sdk.wallet.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import org.json.JSONException;
import org.json.JSONObject;

public class ChargeJavaMethod implements d {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a jsBridge;

    public ChargeJavaMethod(a aVar) {
        this.jsBridge = aVar;
    }

    public void call(h hVar, JSONObject jSONObject) {
        h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, changeQuickRedirect, false, 71064, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, changeQuickRedirect, false, 71064, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            String string = hVar2.f20623d.getString("type");
            if (!TextUtils.isEmpty(string)) {
                IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
                JSONObject optJSONObject = hVar2.f20623d.optJSONObject("args");
                if (optJSONObject != null) {
                    try {
                        iWalletService.pay(string, optJSONObject, new IWalletService.a() {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            public void onFail(Exception exc) {
                            }

                            public void onSuccess(JSONObject jSONObject) {
                                JSONObject jSONObject2 = jSONObject;
                                if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 71065, new Class[]{JSONObject.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 71065, new Class[]{JSONObject.class}, Void.TYPE);
                                    return;
                                }
                                ChargeJavaMethod.this.jsBridge.b("H5_chargeStatus", jSONObject2);
                            }
                        });
                    } catch (Exception unused) {
                        try {
                            jSONObject2.put("code", 0);
                        } catch (JSONException unused2) {
                            return;
                        }
                    }
                }
                jSONObject2.put("code", 1);
            }
        } catch (Exception unused3) {
            jSONObject2.put("code", 0);
        }
    }
}
