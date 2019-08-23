package com.ss.android.ugc.aweme.miniapp.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.y;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.ModeManager;
import com.tt.miniapphost.NativeModule;
import com.tt.option.ext.ApiHandlerCallback;
import org.json.JSONObject;

public final class a extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55486a;

    public final String getActionName() {
        return "DMTshowActionSheet";
    }

    public final void act() {
        if (PatchProxy.isSupport(new Object[0], this, f55486a, false, 59237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55486a, false, 59237, new Class[0], Void.TYPE);
            return;
        }
        NativeModule nativeModule = ModeManager.getInst().get("DMTshowActionSheet");
        if (nativeModule != null) {
            try {
                nativeModule.invoke(this.mArgs, new NativeModule.NativeModuleCallback<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55489a;

                    public final /* synthetic */ void onNativeModuleCall(Object obj) {
                        String str;
                        String str2 = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str2}, this, f55489a, false, 59239, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2}, this, f55489a, false, 59239, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        int intValue = Integer.valueOf(str2).intValue();
                        if (intValue < 0) {
                            str = "fail";
                        } else {
                            str = "ok";
                        }
                        a.this.mApiHandlerCallback.callback(a.this.mCallBackId, a.this.a(intValue, str));
                    }
                });
            } catch (Exception e2) {
                AppBrandLogger.e("tma_ApiActionSheetCtrl", "", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f55486a, false, 59238, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f55486a, false, 59238, new Class[]{Integer.TYPE, String.class}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", buildErrorMsg("showActionSheet", str2));
                if (i2 >= 0) {
                    jSONObject.put("tapIndex", i2);
                }
                return jSONObject.toString();
            } catch (Exception unused) {
                return y.a();
            }
        } catch (Exception unused2) {
            return y.a();
        }
    }

    public a(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
