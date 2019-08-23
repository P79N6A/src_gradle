package com.ss.android.ugc.aweme.miniapp.b;

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

public final class c extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55580a;

    public final String getActionName() {
        return "DMTshowModal";
    }

    public final void act() {
        if (PatchProxy.isSupport(new Object[0], this, f55580a, false, 59247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55580a, false, 59247, new Class[0], Void.TYPE);
            return;
        }
        NativeModule nativeModule = ModeManager.getInst().get("DMTshowModal");
        if (nativeModule != null) {
            try {
                nativeModule.invoke(this.mArgs, new NativeModule.NativeModuleCallback<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55581a;

                    public final /* synthetic */ void onNativeModuleCall(Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f55581a, false, 59249, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f55581a, false, 59249, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        c.this.mApiHandlerCallback.callback(c.this.mCallBackId, c.this.a(Integer.valueOf(str).intValue()));
                    }
                });
            } catch (Exception e2) {
                AppBrandLogger.e("tma_ApiModeDialogCtrl", "", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55580a, false, 59248, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55580a, false, 59248, new Class[]{Integer.TYPE}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", buildErrorMsg("showModal", "ok"));
                if (i2 == 1) {
                    jSONObject.put("confirm", 1);
                    jSONObject.put("cancel", 0);
                } else if (i2 == 0) {
                    jSONObject.put("confirm", 0);
                    jSONObject.put("cancel", 1);
                }
                return jSONObject.toString();
            } catch (JSONException unused) {
                return y.a();
            }
        } catch (JSONException unused2) {
            return y.a();
        }
    }

    public c(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
