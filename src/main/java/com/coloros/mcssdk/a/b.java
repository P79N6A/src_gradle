package com.coloros.mcssdk.a;

import android.content.Context;
import android.content.Intent;
import com.coloros.mcssdk.c.d;
import com.coloros.mcssdk.mode.CommandMessage;
import com.coloros.mcssdk.mode.Message;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class b extends c {
    public final Message a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return a(intent);
        }
        return null;
    }

    public final Message a(Intent intent) {
        try {
            CommandMessage commandMessage = new CommandMessage();
            commandMessage.setCommand(Integer.parseInt(com.coloros.mcssdk.c.b.a(intent.getStringExtra("command"))));
            commandMessage.setResponseCode(Integer.parseInt(com.coloros.mcssdk.c.b.a(intent.getStringExtra("code"))));
            commandMessage.setContent(com.coloros.mcssdk.c.b.a(intent.getStringExtra(PushConstants.CONTENT)));
            commandMessage.setAppKey(com.coloros.mcssdk.c.b.a(intent.getStringExtra("appKey")));
            commandMessage.setAppSecret(com.coloros.mcssdk.c.b.a(intent.getStringExtra("appSecret")));
            commandMessage.setAppPackage(com.coloros.mcssdk.c.b.a(intent.getStringExtra("appPackage")));
            d.a("OnHandleIntent-message:" + commandMessage.toString());
            return commandMessage;
        } catch (Exception e2) {
            d.a("OnHandleIntent--" + e2.getMessage());
            return null;
        }
    }
}
