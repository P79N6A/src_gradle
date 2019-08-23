package com.ss.android.ugc.aweme.sdk.wallet.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.c.b.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class AuthJavaMethod extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a jsBridge;

    public AuthJavaMethod(WeakReference<Context> weakReference, a aVar) {
        super(weakReference);
        this.jsBridge = aVar;
    }

    public void call(final h hVar, final JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, changeQuickRedirect, false, 71062, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, changeQuickRedirect, false, 71062, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = null;
        if (hVar.f20623d.has("args")) {
            jSONObject2 = hVar.f20623d.getJSONObject("args");
        }
        if (jSONObject2 != null) {
            hVar.f20625f = false;
            String string = hVar.f20623d.getString("type");
            if (!TextUtils.isEmpty(string)) {
                IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
                if (this.mContextRef.get() != null) {
                    iWalletService.auth((Context) this.mContextRef.get(), string, jSONObject2.optString("info_str"), new IWalletService.a() {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        public void onFail(Exception exc) {
                        }

                        public void onSuccess(JSONObject jSONObject) {
                            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 71063, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 71063, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            AuthJavaMethod.this.jsBridge.a(hVar.f20621b, jSONObject);
                        }
                    });
                }
            }
        }
    }
}
