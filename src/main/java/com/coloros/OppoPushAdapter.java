package com.coloros;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.coloros.mcssdk.PushManager;
import com.coloros.mcssdk.callback.PushCallback;
import com.coloros.mcssdk.mode.SubscribeResult;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.message.b.h;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.thirdparty.IPushAdapter;
import com.ss.android.pushmanager.thirdparty.ISendTokenCallBack;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class OppoPushAdapter implements PushCallback, IPushAdapter {
    private Context mContext;

    public void onGetAliases(int i, List<SubscribeResult> list) {
    }

    public void onGetNotificationStatus(int i, int i2) {
    }

    public void onGetPushStatus(int i, int i2) {
    }

    public void onGetTags(int i, List<SubscribeResult> list) {
    }

    public void onGetUserAccounts(int i, List<SubscribeResult> list) {
    }

    public void onSetAliases(int i, List<SubscribeResult> list) {
    }

    public void onSetPushTime(int i, String str) {
    }

    public void onSetTags(int i, List<SubscribeResult> list) {
    }

    public void onSetUserAccounts(int i, List<SubscribeResult> list) {
    }

    public void onUnRegister(int i) {
    }

    public void onUnsetAliases(int i, List<SubscribeResult> list) {
    }

    public void onUnsetTags(int i, List<SubscribeResult> list) {
    }

    public void onUnsetUserAccounts(int i, List<SubscribeResult> list) {
    }

    public void trackPush(Context context, int i, Object obj) {
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        return ManifestChecker.checkManifest(str, context);
    }

    public boolean isPushAvailable(Context context, int i) {
        return PushManager.isSupportPush(context);
    }

    private static void sendToken(Context context, final String str) {
        if (context != null) {
            try {
                AnonymousClass1 r0 = new ISendTokenCallBack() {
                    public final int getType() {
                        return 10;
                    }

                    public final String getToken(Context context) {
                        return str;
                    }
                };
                handleMessage(context, 0, str, 10, null);
                PushDependManager.inst().sendToken(context, r0);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("label", "get_token");
                jSONObject.put("type", 10);
                jSONObject.put("token", str);
                PushDependManager.inst().sendMonitor(context, "ss_push", jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 10 && PushManager.isSupportPush(context)) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("OppoPush", "unregisterOppoPush");
            }
            try {
                PushManager.getInstance().pausePush();
                PushManager.getInstance().unRegister();
            } catch (Exception unused) {
            }
        }
    }

    public void onRegister(int i, String str) {
        if (i != 0 || TextUtils.isEmpty(str)) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("OppoPush", "register onFailure resultCode " + i + " registerId = " + str);
            }
            String str2 = i + " " + str;
            handleMessage(this.mContext, 2, str2, 10, null);
            d.a(10, 104, String.valueOf(i), str2);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("OppoPush", "register onSuccess registerId = " + str);
        }
        sendToken(this.mContext, str);
    }

    public void registerPush(Context context, int i) {
        String str;
        if (context == null || i != 10 || !PushManager.isSupportPush(context)) {
            if (context == null) {
                str = "空 context";
            } else if (i != 10) {
                str = "通道注册错误";
            } else {
                str = "该手机不支持OPPO Push";
            }
            d.a(i, BaseLoginOrRegisterActivity.o, PushConstants.PUSH_TYPE_NOTIFY, str);
            return;
        }
        this.mContext = context.getApplicationContext();
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("OppoPush", "registerOppoPush");
        }
        Pair<String, String> pushConfig = PushDependManager.inst().getPushConfig(10);
        if (pushConfig == null) {
            d.a(i, 106, PushConstants.PUSH_TYPE_NOTIFY, "配置为空");
            return;
        }
        PushManager.getInstance().register(context, (String) pushConfig.first, (String) pushConfig.second, this);
        PushManager.getInstance().resumePush();
    }

    public void setAlias(Context context, String str, int i) {
        String str2;
        if (context == null || i != 10 || TextUtils.isEmpty(str) || !PushManager.isSupportPush(context)) {
            if (context == null) {
                str2 = "空 context";
            } else if (i != 10) {
                str2 = "通道注册错误";
            } else if (TextUtils.isEmpty(str)) {
                str2 = "alias 为空";
            } else {
                str2 = "该手机不支持OPPO Push";
            }
            d.a(i, 105, PushConstants.PUSH_TYPE_NOTIFY, str2);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager inst = PushDependManager.inst();
            inst.loggerD("OppoPush", "set alias:" + str);
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            PushManager.getInstance().setAliases(arrayList);
        } catch (Exception unused) {
        }
    }

    private static void handleMessage(Context context, int i, String str, int i2, String str2) {
        try {
            Intent intent = new Intent("com.ss.android.oppo.message");
            intent.setPackage(context.getPackageName());
            intent.putExtra("message_type", i);
            intent.putExtra("message_obj", str);
            intent.putExtra("message_from", i2);
            if (str2 != null) {
                intent.putExtra("message_extra", str2);
            }
            h.a(context, intent);
        } catch (Exception unused) {
        }
    }
}
