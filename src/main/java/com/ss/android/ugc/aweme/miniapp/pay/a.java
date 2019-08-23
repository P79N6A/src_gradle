package com.ss.android.ugc.aweme.miniapp.pay;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.ext.ApiHandlerCallback;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends ApiHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55873a;

    /* renamed from: b  reason: collision with root package name */
    private Object f55874b;

    /* renamed from: c  reason: collision with root package name */
    private String f55875c;

    public final String getActionName() {
        return "requestPayment";
    }

    public final void act() {
        JSONObject jSONObject;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f55873a, false, 59483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55873a, false, 59483, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (TextUtils.isEmpty(this.mArgs)) {
                callbackDefaultMsg(false);
            } else {
                try {
                    jSONObject = new JSONObject(this.mArgs);
                    try {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject != null) {
                            if (!optJSONObject.has("tt_pay_business")) {
                                optJSONObject.put("tt_pay_business", "littleapp");
                            }
                            if (jSONObject != null) {
                                str = jSONObject.toString();
                            } else {
                                str = "";
                            }
                            this.f55875c = str;
                            AnonymousClass1 r2 = new IpcCallback() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f55876a;

                                public final void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
                                    if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55876a, false, 59486, new Class[]{CrossProcessDataEntity.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55876a, false, 59486, new Class[]{CrossProcessDataEntity.class}, Void.TYPE);
                                        return;
                                    }
                                    String str = null;
                                    if (crossProcessDataEntity != null) {
                                        str = crossProcessDataEntity.getString("payResult");
                                    }
                                    if (AppBrandLogger.debug()) {
                                        AppBrandLogger.d("ApiRequestPayCtrl", "onHostCall callbackData:", crossProcessDataEntity);
                                    }
                                    if (TextUtils.isEmpty(str) || !str.contains("requestPayment")) {
                                        a.this.callbackDefaultMsg(false);
                                    } else {
                                        a.this.doCallbackByApiHandler(str);
                                    }
                                    finishListenIpcCallback();
                                }
                            };
                            Activity currentActivity = AppbrandContext.getInst().getCurrentActivity();
                            if (currentActivity != null) {
                                Intent intent = new Intent(currentActivity, OnePixelPayActivity.class);
                                intent.putExtra("pay_str", this.f55875c);
                                ProcessUtil.fillCrossProcessCallbackIntent(intent, r2);
                                currentActivity.startActivity(intent);
                                Class<?> cls = Class.forName("com.tt.miniapp.notification.MiniAppNotificationManager");
                                Class.forName("com.tt.miniapp.notification.MiniAppNotificationManager$NotificationEntity");
                                this.f55874b = cls.getMethod("createPayNotification", new Class[0]).invoke(null, new Object[0]);
                            } else {
                                callbackDefaultMsg(false);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    jSONObject = null;
                }
            }
        } catch (Exception e2) {
            AppBrandLogger.e("ApiRequestPayCtrl", e2);
            callbackDefaultMsg(false);
        }
    }

    @MiniAppProcess
    public final void doCallbackByApiHandler(String str) {
        Method method;
        if (PatchProxy.isSupport(new Object[]{str}, this, f55873a, false, 59484, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f55873a, false, 59484, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.doCallbackByApiHandler(str);
        if (PatchProxy.isSupport(new Object[0], this, f55873a, false, 59485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55873a, false, 59485, new Class[0], Void.TYPE);
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
                    objArr[0] = this.f55874b;
                    method.invoke(null, objArr);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    public a(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        super(str, i, apiHandlerCallback);
    }
}
