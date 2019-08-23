package com.ss.android.ugc.aweme.miniapp.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.e.d;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.IDCreator;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.ext.ApiHandlerCallback;
import java.lang.reflect.Method;
import org.json.JSONObject;

public final class b extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55886a;

    /* renamed from: b  reason: collision with root package name */
    private Object f55887b;

    public final String getActionName() {
        return "requestWXPayment";
    }

    public final void act() {
        if (PatchProxy.isSupport(new Object[0], this, f55886a, false, 59487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55886a, false, 59487, new Class[0], Void.TYPE);
            return;
        }
        IDCreator.create();
        final Activity currentActivity = AppbrandContext.getInst().getCurrentActivity();
        if (currentActivity != null) {
            try {
                if (!TextUtils.isEmpty(this.mArgs)) {
                    JSONObject jSONObject = new JSONObject(this.mArgs);
                    String optString = jSONObject.optString("userName");
                    String optString2 = jSONObject.optString("path");
                    int optInt = jSONObject.optInt("miniprogramType");
                    AppBrandLogger.d("ApiWXRequestPayCtrl", "userName " + optString + " path " + optString2 + " miniprogramType " + optInt + " mArgs " + this.mArgs);
                    AppInfoEntity appInfo = AppbrandApplication.getInst().getAppInfo();
                    if (appInfo != null) {
                        if (!TextUtils.isEmpty(optString) || !TextUtils.isEmpty(optString2)) {
                            if (!ToolUtils.isInstalledApp((Context) currentActivity, "com.tencent.mm")) {
                                AppbrandContext.mainHandler.post(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f55888a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f55888a, false, 59492, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f55888a, false, 59492, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        new d(currentActivity).a(currentActivity.getString(C0906R.string.dtj), 2000, 17);
                                        b.this.callbackDefaultMsg(false);
                                    }
                                });
                                return;
                            }
                            String str = appInfo.appId;
                            Intent intent = new Intent(currentActivity, OnePixelPayActivity.class);
                            intent.addFlags(268435456);
                            intent.putExtra("user_name", optString);
                            intent.putExtra("path", optString2);
                            intent.putExtra("mini_program_type", optInt);
                            intent.putExtra("is_wx_mini_pay", true);
                            intent.putExtra("app_id", str);
                            ProcessUtil.fillCrossProcessCallbackIntent(intent, new IpcCallback() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f55891a;

                                public final void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
                                    CrossProcessDataEntity crossProcessDataEntity2 = crossProcessDataEntity;
                                    if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity2}, this, f55891a, false, 59493, new Class[]{CrossProcessDataEntity.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity2}, this, f55891a, false, 59493, new Class[]{CrossProcessDataEntity.class}, Void.TYPE);
                                        return;
                                    }
                                    String str = null;
                                    if (crossProcessDataEntity2 != null) {
                                        str = crossProcessDataEntity2.getString("payResult");
                                    }
                                    b bVar = b.this;
                                    if (PatchProxy.isSupport(new Object[]{str}, bVar, b.f55886a, false, 59488, new Class[]{String.class}, Void.TYPE)) {
                                        b bVar2 = bVar;
                                        PatchProxy.accessDispatch(new Object[]{str}, bVar2, b.f55886a, false, 59488, new Class[]{String.class}, Void.TYPE);
                                        return;
                                    }
                                    if (AppBrandLogger.debug()) {
                                        AppBrandLogger.d("ApiWXRequestPayCtrl", "onHostCall " + str);
                                    }
                                    if (TextUtils.isEmpty(str) || !str.contains("requestWXPayment")) {
                                        bVar.callbackDefaultMsg(false);
                                    } else {
                                        bVar.doCallbackByApiHandler(str);
                                    }
                                }
                            });
                            currentActivity.startActivity(intent);
                            this.f55887b = Class.forName("com.tt.miniapp.notification.MiniAppNotificationManager").getMethod("createPayNotification", new Class[0]).invoke(null, new Object[0]);
                            return;
                        }
                    }
                    callbackDefaultMsg(false);
                    return;
                }
            } catch (Exception unused) {
                callbackDefaultMsg(false);
            }
        }
        callbackDefaultMsg(false);
    }

    @MiniAppProcess
    public final void doCallbackByApiHandler(String str) {
        Method method;
        if (PatchProxy.isSupport(new Object[]{str}, this, f55886a, false, 59490, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f55886a, false, 59490, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.doCallbackByApiHandler(str);
        if (PatchProxy.isSupport(new Object[0], this, f55886a, false, 59491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55886a, false, 59491, new Class[0], Void.TYPE);
            return;
        }
        try {
            Method[] methods = Class.forName("com.tt.miniapp.notification.MiniAppNotificationManager").getMethods();
            int i = 0;
            while (true) {
                if (i >= methods.length) {
                    method = null;
                    break;
                } else if (methods[i].getName().equals("cancelPayNotification")) {
                    method = methods[i];
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                Object[] objArr = new Object[1];
                try {
                    objArr[0] = this.f55887b;
                    method.invoke(null, objArr);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    public b(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
