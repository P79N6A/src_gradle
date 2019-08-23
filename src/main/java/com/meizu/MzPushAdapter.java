package com.meizu;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.PushManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.thirdparty.IPushAdapter;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public class MzPushAdapter implements IPushAdapter {
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    public void trackPush(Context context, int i, Object obj) {
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        return ManifestChecker.checkManifest(str, context);
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 8) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("MzPush", "unregisterMzPush");
            }
            Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(8);
            PushManager.unRegister(context, (String) pushConfig.first, (String) pushConfig.second);
        }
    }

    public void registerPush(Context context, int i) {
        if (context == null || i != 8) {
            String str = null;
            if (context == null) {
                str = "空 context";
            } else if (i != 8) {
                str = "通道注册错误";
            }
            d.a(i, BaseLoginOrRegisterActivity.o, PushConstants.PUSH_TYPE_NOTIFY, str);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("MzPush", "registerMzPush");
        }
        Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(8);
        if (pushConfig == null) {
            d.a(i, 106, PushConstants.PUSH_TYPE_NOTIFY, "配置为空");
            return;
        }
        DebugLogger.switchDebug(PushDependManager.inst().loggerDebug());
        PushManager.register(context, (String) pushConfig.first, (String) pushConfig.second);
    }

    public void setAlias(Context context, String str, int i) {
        if (context != null && i == 8 && !TextUtils.isEmpty(str)) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager inst = PushDependManager.inst();
                inst.loggerD("MzPush", "set alias:" + str);
            }
            String pushId = PushManager.getPushId(context);
            if (!TextUtils.isEmpty(pushId)) {
                Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(8);
                PushManager.subScribeAlias(context, (String) pushConfig.first, (String) pushConfig.second, pushId, str);
            }
        }
    }
}
