package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.ix;
import com.xiaomi.push.jn;
import java.util.List;

public class PushMessageHelper {
    public static final String KEY_MESSAGE = "key_message";
    private static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j, String str2, String str3) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(jn jnVar, ix ixVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(jnVar.a());
        if (!TextUtils.isEmpty(jnVar.d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(jnVar.d());
        } else if (!TextUtils.isEmpty(jnVar.c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(jnVar.c());
        } else if (!TextUtils.isEmpty(jnVar.f())) {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(jnVar.f());
        } else {
            miPushMessage.setMessageType(0);
        }
        miPushMessage.setCategory(jnVar.e());
        if (jnVar.a() != null) {
            miPushMessage.setContent(jnVar.a().c());
        }
        if (ixVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(ixVar.a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(ixVar.b());
            }
            miPushMessage.setDescription(ixVar.d());
            miPushMessage.setTitle(ixVar.c());
            miPushMessage.setNotifyType(ixVar.a());
            miPushMessage.setNotifyId(ixVar.c());
            miPushMessage.setPassThrough(ixVar.b());
            miPushMessage.setExtra(ixVar.a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static ix generateMessage(MiPushMessage miPushMessage) {
        ix ixVar = new ix();
        ixVar.a(miPushMessage.getMessageId());
        ixVar.b(miPushMessage.getTopic());
        ixVar.d(miPushMessage.getDescription());
        ixVar.c(miPushMessage.getTitle());
        ixVar.c(miPushMessage.getNotifyId());
        ixVar.a(miPushMessage.getNotifyType());
        ixVar.b(miPushMessage.getPassThrough());
        ixVar.a(miPushMessage.getExtra());
        return ixVar;
    }

    public static int getPushMode(Context context) {
        if (pushMode == 0) {
            setPushMode(isUseCallbackPushMode(context) ? 1 : 2);
        }
        return pushMode;
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return isIntentAvailable(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 3);
        intent.putExtra("key_command", miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 4);
        new PushServiceReceiver().onReceive(context, intent);
    }

    private static void setPushMode(int i) {
        pushMode = i;
    }
}
