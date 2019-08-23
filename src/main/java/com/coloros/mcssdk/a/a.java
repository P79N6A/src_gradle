package com.coloros.mcssdk.a;

import android.content.Context;
import android.content.Intent;
import com.coloros.mcssdk.PushManager;
import com.coloros.mcssdk.c.b;
import com.coloros.mcssdk.c.d;
import com.coloros.mcssdk.mode.AppMessage;
import com.coloros.mcssdk.mode.Message;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class a extends c {
    public final Message a(Context context, int i, Intent intent) {
        if (4098 != i) {
            return null;
        }
        Message a2 = a(intent);
        PushManager.statisticMessage(context, (AppMessage) a2, "push_transmit");
        return a2;
    }

    public final Message a(Intent intent) {
        try {
            AppMessage appMessage = new AppMessage();
            appMessage.setMessageID(Integer.parseInt(b.a(intent.getStringExtra("messageID"))));
            appMessage.setTaskID(b.a(intent.getStringExtra("taskID")));
            appMessage.setAppPackage(b.a(intent.getStringExtra("appPackage")));
            appMessage.setContent(b.a(intent.getStringExtra(PushConstants.CONTENT)));
            appMessage.setBalanceTime(Integer.parseInt(b.a(intent.getStringExtra("balanceTime"))));
            appMessage.setStartDate(Long.parseLong(b.a(intent.getStringExtra("startDate"))));
            appMessage.setEndDate(Long.parseLong(b.a(intent.getStringExtra("endDate"))));
            appMessage.setTimeRanges(b.a(intent.getStringExtra("timeRanges")));
            appMessage.setTitle(b.a(intent.getStringExtra(PushConstants.TITLE)));
            appMessage.setRule(b.a(intent.getStringExtra("rule")));
            appMessage.setForcedDelivery(Integer.parseInt(b.a(intent.getStringExtra("forcedDelivery"))));
            appMessage.setDistinctBycontent(Integer.parseInt(b.a(intent.getStringExtra("distinctBycontent"))));
            d.a("OnHandleIntent-message:" + appMessage.toString());
            return appMessage;
        } catch (Exception e2) {
            d.a("OnHandleIntent--" + e2.getMessage());
            return null;
        }
    }
}
