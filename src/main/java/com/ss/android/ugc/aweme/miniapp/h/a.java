package com.ss.android.ugc.aweme.miniapp.h;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.callback.IpcCallbackManagerProxy;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONObject;

public final class a extends NativeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55772a;

    /* renamed from: b  reason: collision with root package name */
    int f55773b;

    /* renamed from: c  reason: collision with root package name */
    boolean f55774c;

    public final String getName() {
        return "logclient";
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f55772a, false, 59456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55772a, false, 59456, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (AppBrandLogger.debug()) {
            AppBrandLogger.d("LoginClient", "onStop");
        }
    }

    public final void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f55772a, false, 59455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55772a, false, 59455, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (AppBrandLogger.debug()) {
            AppBrandLogger.d("LoginClient", "onStart");
        }
        if (this.f55774c) {
            this.f55774c = false;
            HostProcessBridge.hostActionSync("login_state", CrossProcessDataEntity.Builder.create().put("login_state_value", PushConstants.PUSH_TYPE_NOTIFY).build());
            IpcCallbackManagerProxy.getInstance().handleIpcCallBack(this.f55773b, CrossProcessDataEntity.Builder.create().build());
            this.f55773b = 0;
        }
    }

    public a(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    public final <T> String invoke(String str, NativeModule.NativeModuleCallback<T> nativeModuleCallback) throws Exception {
        if (PatchProxy.isSupport(new Object[]{str, nativeModuleCallback}, this, f55772a, false, 59454, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, nativeModuleCallback}, this, f55772a, false, 59454, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class);
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).login(new IAccountService.d().a(currentActivity).a());
            this.f55774c = true;
            HostProcessBridge.hostActionSync("login_state", CrossProcessDataEntity.Builder.create().put("login_state_value", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).build());
            try {
                this.f55773b = new JSONObject(str).optInt("hostCallId");
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
