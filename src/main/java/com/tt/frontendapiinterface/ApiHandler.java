package com.tt.frontendapiinterface;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.annotation.ProcessSwitchEnable;
import com.tt.miniapphost.process.annotation.SpecificProcess;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.extra.ICrossProcessOperator;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;
import com.tt.option.ext.ApiHandlerCallback;
import java.util.HashMap;
import org.json.JSONObject;

@SpecificProcess
public abstract class ApiHandler implements ICrossProcessOperator {
    public static final String TAG = "ApiHandler";
    public ApiHandlerCallback mApiHandlerCallback;
    public String mArgs;
    public int mCallBackId;

    @ProcessSwitchEnable(defaultOperateProcess = "miniAppProcess")
    public abstract void act();

    @AnyProcess
    public boolean canOverride() {
        return true;
    }

    @AnyProcess
    public abstract String getActionName();

    /* access modifiers changed from: protected */
    @AnyProcess
    public String[] getNeededPermissions() {
        return null;
    }

    @AnyProcess
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public final boolean isSwitchProcessOperateAsync() {
        return true;
    }

    public String operateProcessIdentify() {
        return "miniAppProcess";
    }

    @AnyProcess
    public boolean shouldHandleActivityResult() {
        return false;
    }

    @MiniAppProcess
    public void callbackAppUnSupportFeature() {
        callbackMsg(false, null, "feature is not supported in app");
    }

    @AnyProcess
    public void unRegesterResultHandler() {
        ApiHandlerManager.getInst().unregisterActivityResultApiHandler(this);
    }

    @MiniAppProcess
    public void callbackDefaultMsg(boolean z) {
        callbackMsg(z, null, null);
    }

    @MiniAppProcess
    public void callbackException(Throwable th) {
        doCallbackByApiHandler(makeMsgByResult(false, null, "exception", th).toString());
    }

    /* access modifiers changed from: protected */
    @MiniAppProcess
    public void callbackIllegalParam(String str) {
        callbackExtraInfoMsg(false, paramIllegalMsg(str));
    }

    @MiniAppProcess
    public final void callbackOnOriginProcess(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            callbackDefaultMsg(false);
        } else {
            doCallbackByApiHandler(str);
        }
    }

    @MiniAppProcess
    public void doCallbackByApiHandler(String str) {
        if (this.mApiHandlerCallback != null) {
            this.mApiHandlerCallback.callback(this.mCallBackId, str);
        }
    }

    /* access modifiers changed from: protected */
    @MiniAppProcess
    @NonNull
    public String paramIllegalMsg(String str) {
        return "param:" + str + " illegal";
    }

    @MiniAppProcess
    public void callbackExtraInfoMsg(boolean z, String str) {
        callbackMsg(z, null, str);
    }

    @MiniAppProcess
    public void callbackOtherExtraMsg(boolean z, HashMap<String, Object> hashMap) {
        callbackMsg(z, hashMap, null);
    }

    @AnyProcess
    public String buildErrorMsg(String str, String str2) {
        return str + ":" + str2;
    }

    @HostProcess
    public final void operateFinishOnGoalProcess(@Nullable String str, @NonNull AsyncIpcHandler asyncIpcHandler) {
        asyncIpcHandler.callback(CrossProcessDataEntity.Builder.create().put("apiExecuteResult", str).build(), true);
    }

    @AnyProcess
    public JSONObject makeMsgByResult(boolean z, HashMap<String, Object> hashMap, String str) {
        return makeMsgByResult(z, hashMap, str, null);
    }

    @AnyProcess
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return handleActivityResult(i, i2, intent);
    }

    @MiniAppProcess
    public void callbackMsg(boolean z, HashMap<String, Object> hashMap, String str) {
        doCallbackByApiHandler(makeMsgByResult(z, hashMap, str).toString());
    }

    @AnyProcess
    public ApiHandler(String str, int i, ApiHandlerCallback apiHandlerCallback) {
        this.mArgs = str;
        this.mCallBackId = i;
        this.mApiHandlerCallback = apiHandlerCallback;
        if (shouldHandleActivityResult()) {
            ApiHandlerManager.getInst().registerActivityResultApiHandler(this);
        }
    }

    @AnyProcess
    public JSONObject makeMsgByResult(boolean z, HashMap<String, Object> hashMap, String str, Throwable th) {
        String str2;
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                String actionName = getActionName();
                if (z) {
                    str3 = "ok";
                } else {
                    str3 = "fail";
                }
                jSONObject.put("errMsg", buildErrorMsg(actionName, str3));
            } else {
                StringBuilder sb = new StringBuilder();
                String actionName2 = getActionName();
                if (z) {
                    str2 = "ok";
                } else {
                    str2 = "fail";
                }
                sb.append(buildErrorMsg(actionName2, str2));
                sb.append(" ");
                sb.append(str);
                jSONObject.put("errMsg", sb.toString());
            }
            if (!z && th != null) {
                jSONObject.put("errStack", Log.getStackTraceString(th));
            }
            if (hashMap != null && hashMap.size() > 0) {
                for (String next : hashMap.keySet()) {
                    jSONObject.put(next, hashMap.get(next));
                }
            }
            return jSONObject;
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, TAG, e2.getStackTrace());
            return new JSONObject();
        }
    }
}
