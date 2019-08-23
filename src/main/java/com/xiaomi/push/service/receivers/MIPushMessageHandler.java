package com.xiaomi.push.service.receivers;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.message.b.h;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.setting.b;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;
import org.json.JSONObject;

public class MIPushMessageHandler extends PushMessageReceiver {
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageArrived(context, miPushMessage);
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager inst = PushDependManager.inst();
            inst.loggerD("MiPushMessageHandler", "onNotificationMessageArrived -> " + miPushMessage);
        }
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        String str;
        super.onNotificationMessageClicked(context, miPushMessage);
        if (b.a().v()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("msg", miPushMessage.toString());
                f.a().a("mipush_onnotificationmessageclicked", jSONObject);
            } catch (Exception unused) {
            }
        }
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager inst = PushDependManager.inst();
            if (("Get MiPush Message " + miPushMessage) != null) {
                str = miPushMessage.toString();
            } else {
                str = String.valueOf(null);
            }
            inst.loggerD("MiPushMessageHandler", str);
        }
        if (context != null && miPushMessage != null) {
            try {
                String content = miPushMessage.getContent();
                if (!TextUtils.isEmpty(content)) {
                    JSONObject message = PushDependManager.inst().getMessage(content.getBytes(), true);
                    if (message != null) {
                        message.put("pass_through", miPushMessage.getPassThrough());
                        PushDependManager.inst().onClickNotPassThroughNotification(context, 1, message.toString(), 1, null);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        String str;
        super.onReceivePassThroughMessage(context, miPushMessage);
        if (b.a().v()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("msg", miPushMessage.toString());
                f.a().a("mipush_onreceivepassthroughmessage", jSONObject);
            } catch (Exception unused) {
            }
        }
        if (PushDependManager.inst().loggerDebug()) {
            PushDependManager inst = PushDependManager.inst();
            if (("Get MiPush Message " + miPushMessage) != null) {
                str = miPushMessage.toString();
            } else {
                str = String.valueOf(null);
            }
            inst.loggerD("MiPushMessageHandler", str);
        }
        if (context != null && miPushMessage != null) {
            try {
                String content = miPushMessage.getContent();
                if (!TextUtils.isEmpty(content)) {
                    JSONObject message = PushDependManager.inst().getMessage(content.getBytes(), true);
                    if (message != null) {
                        message.put("pass_through", miPushMessage.getPassThrough());
                        handleMessage(context, 1, message.toString(), 1);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String str;
        String str2;
        if (context != null && miPushCommandMessage != null) {
            try {
                String command = miPushCommandMessage.getCommand();
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                String str3 = null;
                if (commandArguments == null || commandArguments.size() <= 0) {
                    str = null;
                } else {
                    str = commandArguments.get(0);
                }
                if (commandArguments == null || commandArguments.size() <= 1) {
                    str2 = null;
                } else {
                    str2 = commandArguments.get(1);
                }
                if (b.a().v()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("command", command);
                        jSONObject.put("cmdArg1", str);
                        jSONObject.put("cmdArg2", str2);
                        jSONObject.put("getResultCode", miPushCommandMessage.getResultCode());
                        f.a().a("mipush_oncommandresult", jSONObject);
                    } catch (Exception unused) {
                    }
                }
                if ("register".equals(command)) {
                    if (miPushCommandMessage.getResultCode() == 0) {
                        PushDependManager.inst().loggerD("MiPushMessageHandler", "mRegId = " + str);
                        handleMessage(context, 0, str, 1);
                    } else {
                        d.a(1, 104, String.valueOf(miPushCommandMessage.getResultCode()), miPushCommandMessage.getReason());
                        handleMessage(context, 2, "code = " + miPushCommandMessage.getResultCode() + " " + miPushCommandMessage.getReason(), 1);
                    }
                } else if ("set-alias".equals(command)) {
                    if (miPushCommandMessage.getResultCode() == 0) {
                        d.b(1);
                        PushDependManager.inst().loggerD("MiPushMessageHandler", "set alias success, mAlias = " + str);
                    } else {
                        d.a(1, 105, String.valueOf(miPushCommandMessage.getResultCode()), miPushCommandMessage.getReason());
                    }
                } else if ("unset-alias".equals(command)) {
                    if (miPushCommandMessage.getResultCode() == 0) {
                        PushDependManager.inst().loggerD("MiPushMessageHandler", "unSet alias success, mAlias = " + str);
                    }
                } else if ("subscribe-topic".equals(command)) {
                    if (miPushCommandMessage.getResultCode() == 0) {
                        PushDependManager.inst().loggerD("MiPushMessageHandler", "subscribe topic success, mTopic = " + str);
                    }
                } else if ("unsubscibe-topic".equals(command)) {
                    if (miPushCommandMessage.getResultCode() == 0) {
                        PushDependManager.inst().loggerD("MiPushMessageHandler", "unSubscribe topic success, mTopic = " + str);
                    }
                } else if ("accept-time".equals(command) && miPushCommandMessage.getResultCode() == 0) {
                    PushDependManager.inst().loggerD("MiPushMessageHandler", "mStartTime = " + str + " mEndTime = " + str2);
                }
                if (miPushCommandMessage.getResultCode() != 0) {
                    if (70000002 == miPushCommandMessage.getResultCode()) {
                        str3 = "push连接的认证失败";
                    } else if (70000001 == miPushCommandMessage.getResultCode()) {
                        str3 = "由于网络原因导致的push连接失败";
                    } else if (70000004 == miPushCommandMessage.getResultCode()) {
                        str3 = "push内部状态错误，遇到此类错误请联系开发人员";
                    } else if (70000003 == miPushCommandMessage.getResultCode()) {
                        str3 = "客户端的发给PUSH通道的消息格式不合法";
                    }
                    if (TextUtils.equals(command, "Registration")) {
                        d.a(1, 104, String.valueOf(miPushCommandMessage.getResultCode()), str3);
                    }
                    PushDependManager.inst().loggerD("MiPushMessageHandler", command + " -> " + str3);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private void handleMessage(Context context, int i, String str, int i2) {
        try {
            Intent intent = new Intent("com.ss.android.xiaomi.message");
            intent.setPackage(context.getPackageName());
            intent.putExtra("message_type", i);
            intent.putExtra("message_obj", str);
            intent.putExtra("message_from", i2);
            h.a(context, intent);
        } catch (Exception unused) {
        }
    }
}
