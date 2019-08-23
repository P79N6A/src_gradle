package com.ss.android.ugc.aweme.miniapp.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends NativeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55713a;

    public final String getName() {
        return "DMTshowActionSheet";
    }

    public a(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    public final void a(String[] strArr, final NativeModule.NativeModuleCallback nativeModuleCallback) {
        if (PatchProxy.isSupport(new Object[]{strArr, nativeModuleCallback}, this, f55713a, false, 59211, new Class[]{String[].class, NativeModule.NativeModuleCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, nativeModuleCallback}, this, f55713a, false, 59211, new Class[]{String[].class, NativeModule.NativeModuleCallback.class}, Void.TYPE);
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && strArr != null) {
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(currentActivity);
            aVar.a((CharSequence[]) strArr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55718a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55718a, false, 59213, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55718a, false, 59213, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (nativeModuleCallback != null) {
                        nativeModuleCallback.onNativeModuleCall(String.valueOf(i));
                    }
                }
            });
            aVar.a((DialogInterface.OnCancelListener) new DialogInterface.OnCancelListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55721a;

                public final void onCancel(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f55721a, false, 59214, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f55721a, false, 59214, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    if (nativeModuleCallback != null) {
                        nativeModuleCallback.onNativeModuleCall("-1");
                    }
                }
            });
            aVar.b();
        }
    }

    public final String invoke(String str, NativeModule.NativeModuleCallback nativeModuleCallback) throws Exception {
        String str2 = str;
        final NativeModule.NativeModuleCallback nativeModuleCallback2 = nativeModuleCallback;
        if (PatchProxy.isSupport(new Object[]{str2, nativeModuleCallback2}, this, f55713a, false, 59210, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, nativeModuleCallback2}, this, f55713a, false, 59210, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class);
        }
        JSONArray optJSONArray = new JSONObject(str2).optJSONArray("itemList");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            final String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = optJSONArray.getString(i);
            }
            AppbrandContext.mainHandler.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55714a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f55714a, false, 59212, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f55714a, false, 59212, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.a(strArr, nativeModuleCallback2);
                }
            });
        }
        return null;
    }
}
