package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.agoo.TaobaoBaseIntentService;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.m;
import org.json.JSONObject;

public abstract class UmengBaseIntentService extends TaobaoBaseIntentService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81118a = "com.umeng.message.UmengBaseIntentService";

    public void onRegistered(Context context, String str) {
    }

    public void onUnregistered(Context context, String str) {
    }

    public void onError(Context context, String str) {
        String str2 = f81118a;
        UMLog.mutlInfo(str2, 0, "onError()[" + str + "]");
    }

    public void onMessage(Context context, Intent intent) {
        MLog.i(f81118a, "--->>> UmengBaseIntentService onMessage");
        if (Process.getElapsedCpuTime() < 3000) {
            UMLog.mutlInfo(f81118a, 2, "应用程序通过推送消息启动");
            PushAgent.setAppLaunchByMessage();
        }
        String stringExtra = intent.getStringExtra("body");
        String str = f81118a;
        UMLog.mutlInfo(str, 2, "onMessage():[" + stringExtra + "]");
        try {
            UMessage uMessage = new UMessage(new JSONObject(stringExtra));
            uMessage.message_id = intent.getStringExtra("id");
            uMessage.task_id = intent.getStringExtra(PushConstants.TASK_ID);
            UTrack.getInstance(getApplicationContext()).trackMsgArrival(uMessage);
            m.a(context).a(uMessage.message_id, uMessage.task_id, uMessage.display_type);
            if (TextUtils.equals("autoupdate", uMessage.display_type)) {
                String stringExtra2 = intent.getStringExtra("id");
                String stringExtra3 = intent.getStringExtra(PushConstants.TASK_ID);
                Intent intent2 = new Intent();
                intent2.setPackage(context.getPackageName());
                intent2.setAction("com.umeng.message.autoupdate.handler.action");
                intent2.putExtra("body", stringExtra);
                intent2.putExtra("id", stringExtra2);
                intent2.putExtra(PushConstants.TASK_ID, stringExtra3);
            }
        } catch (Exception e2) {
            UMLog.mutlInfo(f81118a, 0, e2.toString());
        }
    }
}
