package com.ss.android.ugc.aweme.miniapp.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import org.json.JSONObject;

public final class b extends NativeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55724a;

    /* renamed from: b  reason: collision with root package name */
    public String f55725b;

    /* renamed from: c  reason: collision with root package name */
    public String f55726c;

    /* renamed from: d  reason: collision with root package name */
    public String f55727d;

    /* renamed from: e  reason: collision with root package name */
    public String f55728e;

    /* renamed from: f  reason: collision with root package name */
    public String f55729f;
    public String g;
    private boolean h;

    public final String getName() {
        return "DMTshowModal";
    }

    public b(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    public final String invoke(String str, final NativeModule.NativeModuleCallback nativeModuleCallback) {
        if (PatchProxy.isSupport(new Object[]{str, nativeModuleCallback}, this, f55724a, false, 59215, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, nativeModuleCallback}, this, f55724a, false, 59215, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f55725b = jSONObject.optString(PushConstants.TITLE);
            this.f55726c = jSONObject.optString(PushConstants.CONTENT);
            this.f55727d = jSONObject.optString("confirmText");
            this.f55728e = jSONObject.optString("cancelText");
            this.h = jSONObject.optBoolean("showCancel");
            this.f55729f = jSONObject.optString("confirmColor");
            this.g = jSONObject.optString("cancelColor");
            if (!TextUtils.isEmpty(this.f55726c) || !TextUtils.isEmpty(this.f55725b)) {
                if (!this.h) {
                    this.f55728e = "";
                }
                AppbrandContext.mainHandler.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55730a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f55730a, false, 59217, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55730a, false, 59217, new Class[0], Void.TYPE);
                            return;
                        }
                        b bVar = b.this;
                        String str = b.this.f55725b;
                        String str2 = b.this.f55726c;
                        String str3 = b.this.f55728e;
                        String str4 = b.this.g;
                        String str5 = b.this.f55727d;
                        String str6 = b.this.f55729f;
                        NativeModule.NativeModuleCallback nativeModuleCallback = nativeModuleCallback;
                        NativeModule.NativeModuleCallback nativeModuleCallback2 = nativeModuleCallback;
                        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5, str6, nativeModuleCallback}, bVar, b.f55724a, false, 59216, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, NativeModule.NativeModuleCallback.class}, Void.TYPE)) {
                            Object[] objArr = {str, str2, str3, str4, str5, str6, nativeModuleCallback2};
                            b bVar2 = bVar;
                            PatchProxy.accessDispatch(objArr, bVar2, b.f55724a, false, 59216, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, NativeModule.NativeModuleCallback.class}, Void.TYPE);
                            return;
                        }
                        NativeModule.NativeModuleCallback nativeModuleCallback3 = nativeModuleCallback2;
                        Activity currentActivity = bVar.getCurrentActivity();
                        if (currentActivity != null) {
                            new AlertDialog.Builder(currentActivity, C0906R.style.kx).setMessage(str2).setTitle(str).setNegativeButton(str3, new DialogInterface.OnClickListener(nativeModuleCallback3) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f55736a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ NativeModule.NativeModuleCallback f55737b;

                                {
                                    this.f55737b = r2;
                                }

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55736a, false, 59219, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55736a, false, 59219, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    if (this.f55737b != null) {
                                        this.f55737b.onNativeModuleCall(PushConstants.PUSH_TYPE_NOTIFY);
                                    }
                                }
                            }).setPositiveButton(str5, new DialogInterface.OnClickListener(nativeModuleCallback3) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f55733a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ NativeModule.NativeModuleCallback f55734b;

                                {
                                    this.f55734b = r2;
                                }

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55733a, false, 59218, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55733a, false, 59218, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    if (this.f55734b != null) {
                                        this.f55734b.onNativeModuleCall(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                    }
                                }
                            }).create().show();
                        }
                    }
                });
                return null;
            }
            AppBrandLogger.e("tma_DialogImpl", "empty");
            return null;
        } catch (Exception e2) {
            AppBrandLogger.e("tma_DialogImpl", "", e2);
        }
    }
}
