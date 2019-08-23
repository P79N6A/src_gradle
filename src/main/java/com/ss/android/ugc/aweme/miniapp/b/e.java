package com.ss.android.ugc.aweme.miniapp.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.option.ext.ApiHandlerCallback;
import org.json.JSONObject;

public final class e extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55594a;

    public final String getActionName() {
        return "getUseDuration";
    }

    public final void act() {
        if (PatchProxy.isSupport(new Object[0], this, f55594a, false, 59262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55594a, false, 59262, new Class[0], Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errMsg", buildErrorMsg("getUseDuration", "ok"));
            jSONObject.put("duration", 1000);
            this.mApiHandlerCallback.callback(this.mCallBackId, jSONObject.toString());
        } catch (Exception e2) {
            AppBrandLogger.e("GetUseDurationCtrl", "", e2);
        }
    }

    public e(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
