package com.huawei;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.api.PushManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.thirdparty.IPushAdapter;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import org.json.JSONObject;

public class HWPushAdapter implements IPushAdapter {
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    public void trackPush(Context context, int i, Object obj) {
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        return ManifestChecker.checkManifest(str, context);
    }

    public void unregisterPush(Context context, int i) {
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("HWPush", "unregisterPush");
        }
        try {
            String token = PushDependManager.inst().getToken(context, i);
            if (!TextUtils.isEmpty(token)) {
                PushManager.deregisterToken(context, token);
            }
        } catch (Throwable unused) {
        }
    }

    public void registerPush(Context context, int i) {
        if (context == null || i != 7) {
            String str = null;
            if (context == null) {
                str = "空 context";
            } else if (i != 7) {
                str = "通道注册错误";
            }
            d.a(i, BaseLoginOrRegisterActivity.o, PushConstants.PUSH_TYPE_NOTIFY, str);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("HWPush", "registerHWPush");
        }
        try {
            PushManager.requestToken(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "request_token");
            jSONObject.put("type", 7);
            PushDependManager.inst().sendMonitor(context, "ss_push", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void setAlias(Context context, String str, int i) {
        if (context != null && i == 7 && PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("HWPush", "setAlias");
        }
    }
}
