package com.ss.android.ugc.aweme.miniapp.g;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.a.c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import org.json.JSONObject;

@Deprecated
public final class a extends NativeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55768a;

    public final String getName() {
        return "DMTgetLocation";
    }

    public a(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    public final String invoke(String str, NativeModule.NativeModuleCallback nativeModuleCallback) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, nativeModuleCallback}, this, f55768a, false, 59453, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, nativeModuleCallback}, this, f55768a, false, 59453, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class);
        }
        new JSONObject(str2).optString("type");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            c cVar = q.a().h;
            if (cVar != null) {
                cVar.a(currentActivity);
                JSONObject c2 = cVar.c(currentActivity);
                if (c2 != null) {
                    return c2.toString();
                }
                JSONObject b2 = cVar.b(currentActivity);
                if (b2 != null) {
                    return b2.toString();
                }
            }
        }
        return null;
    }
}
