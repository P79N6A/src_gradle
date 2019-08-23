package com.ss.android.ugc.aweme.miniapp.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.y;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.ModeManager;
import com.tt.miniapphost.NativeModule;
import com.tt.option.ext.ApiHandlerCallback;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55810a;

    public final String getActionName() {
        return "DMTscanCode";
    }

    public final void act() {
        if (PatchProxy.isSupport(new Object[0], this, f55810a, false, 59517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55810a, false, 59517, new Class[0], Void.TYPE);
            return;
        }
        NativeModule nativeModule = ModeManager.getInst().get("DMTscanCode");
        if (nativeModule != null) {
            try {
                nativeModule.invoke(this.mArgs, new NativeModule.NativeModuleCallback<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55811a;

                    public final /* synthetic */ void onNativeModuleCall(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f55811a, false, 59519, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f55811a, false, 59519, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        a.this.mApiHandlerCallback.callback(a.this.mCallBackId, a.this.a(str));
                    }
                });
            } catch (Exception e2) {
                AppBrandLogger.e("tma_ApiScanCodeCtrl", "", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f55810a, false, 59518, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f55810a, false, 59518, new Class[]{String.class}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            try {
                jSONObject.put("errMsg", buildErrorMsg("scanCode", "ok"));
                return jSONObject.toString();
            } catch (JSONException unused) {
                return y.a();
            }
        } catch (JSONException unused2) {
            return y.a();
        }
    }

    public a(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
