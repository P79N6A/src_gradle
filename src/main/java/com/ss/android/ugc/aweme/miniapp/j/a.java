package com.ss.android.ugc.aweme.miniapp.j;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.e.d;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import org.json.JSONObject;

public final class a extends NativeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55802a;

    public final String getName() {
        return "DMTshowToast";
    }

    public a(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @SuppressLint({"SSRawToast"})
    public final String invoke(String str, NativeModule.NativeModuleCallback nativeModuleCallback) throws Exception {
        String str2 = str;
        final NativeModule.NativeModuleCallback nativeModuleCallback2 = nativeModuleCallback;
        if (PatchProxy.isSupport(new Object[]{str2, nativeModuleCallback2}, this, f55802a, false, 59515, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, nativeModuleCallback2}, this, f55802a, false, 59515, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class);
        }
        JSONObject jSONObject = new JSONObject(str2);
        final int optInt = jSONObject.optInt("duration");
        final String optString = jSONObject.optString(PushConstants.TITLE);
        AppbrandContext.mainHandler.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55803a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f55803a, false, 59516, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f55803a, false, 59516, new Class[0], Void.TYPE);
                    return;
                }
                Activity currentActivity = a.this.getCurrentActivity();
                if (currentActivity != null) {
                    new d(currentActivity).a(optString, optInt, 17);
                    if (nativeModuleCallback2 != null) {
                        nativeModuleCallback2.onNativeModuleCall("ok");
                    }
                }
            }
        });
        return null;
    }
}
