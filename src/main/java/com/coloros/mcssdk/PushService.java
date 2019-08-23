package com.coloros.mcssdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.coloros.mcssdk.a.c;
import com.coloros.mcssdk.c.d;
import com.coloros.mcssdk.c.e;
import com.coloros.mcssdk.callback.MessageCallback;
import com.coloros.mcssdk.mode.AppMessage;
import com.coloros.mcssdk.mode.CommandMessage;
import com.coloros.mcssdk.mode.Message;
import com.coloros.mcssdk.mode.SptDataMessage;
import java.util.List;

public class PushService extends Service implements MessageCallback {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        List<Message> a2 = c.a(getApplicationContext(), intent);
        List<com.coloros.mcssdk.b.c> processors = PushManager.getInstance().getProcessors();
        if (a2 == null || a2.size() == 0 || processors == null || processors.size() == 0) {
            return super.onStartCommand(intent, i, i2);
        }
        for (Message message : a2) {
            if (message != null) {
                for (com.coloros.mcssdk.b.c next : processors) {
                    if (next != null) {
                        try {
                            next.a(getApplicationContext(), message, this);
                        } catch (Exception e2) {
                            d.b("process Exception:" + e2.getMessage());
                        }
                    }
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    public void processMessage(Context context, AppMessage appMessage) {
    }

    public void processMessage(Context context, CommandMessage commandMessage) {
        if (PushManager.getInstance().getPushCallback() != null) {
            switch (commandMessage.getCommand()) {
                case 12289:
                    if (commandMessage.getResponseCode() == 0) {
                        PushManager.getInstance().setRegisterID(commandMessage.getContent());
                    }
                    PushManager.getInstance().getPushCallback().onRegister(commandMessage.getResponseCode(), commandMessage.getContent());
                    break;
                case 12290:
                    PushManager.getInstance().getPushCallback().onUnRegister(commandMessage.getResponseCode());
                    return;
                case 12292:
                    PushManager.getInstance().getPushCallback().onSetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                    return;
                case 12293:
                    PushManager.getInstance().getPushCallback().onGetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                    return;
                case 12294:
                    PushManager.getInstance().getPushCallback().onUnsetAliases(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "alias", "aliasId", "aliasName"));
                    return;
                case 12295:
                    PushManager.getInstance().getPushCallback().onSetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                    return;
                case 12296:
                    PushManager.getInstance().getPushCallback().onGetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                    return;
                case 12297:
                    PushManager.getInstance().getPushCallback().onUnsetTags(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "tagId", "tagName"));
                    return;
                case 12298:
                    PushManager.getInstance().getPushCallback().onSetPushTime(commandMessage.getResponseCode(), commandMessage.getContent());
                    return;
                case 12301:
                    PushManager.getInstance().getPushCallback().onSetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                    return;
                case 12302:
                    PushManager.getInstance().getPushCallback().onGetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                    return;
                case 12303:
                    PushManager.getInstance().getPushCallback().onUnsetUserAccounts(commandMessage.getResponseCode(), CommandMessage.parseToSubscribeResultList(commandMessage.getContent(), "tags", "accountId", "accountName"));
                    return;
                case 12306:
                    PushManager.getInstance().getPushCallback().onGetPushStatus(commandMessage.getResponseCode(), e.a(commandMessage.getContent()));
                    return;
                case 12309:
                    PushManager.getInstance().getPushCallback().onGetNotificationStatus(commandMessage.getResponseCode(), e.a(commandMessage.getContent()));
                    break;
            }
        }
    }

    public void processMessage(Context context, SptDataMessage sptDataMessage) {
    }
}
