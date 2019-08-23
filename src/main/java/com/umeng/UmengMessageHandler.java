package com.umeng;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.push.PushDependManager;
import com.umeng.message.UmengMessageService;
import com.umeng.message.entity.UMessage;
import org.json.JSONObject;

public class UmengMessageHandler extends UmengMessageService {
    public void onCreate() {
        try {
            super.onCreate();
        } catch (Throwable unused) {
        }
    }

    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Throwable unused) {
        }
    }

    public void onStart(Intent intent, int i) {
        try {
            super.onStart(intent, i);
        } catch (Throwable unused) {
        }
    }

    public void onMessage(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("body");
            UMessage uMessage = new UMessage(new JSONObject(stringExtra));
            if (PushDependManager.inst().loggerDebug() && stringExtra != null) {
                PushDependManager inst = PushDependManager.inst();
                inst.loggerD("UmengPushAdapter", "message=" + stringExtra);
                PushDependManager inst2 = PushDependManager.inst();
                inst2.loggerD("UmengPushAdapter", "custom=" + uMessage.custom);
                PushDependManager inst3 = PushDependManager.inst();
                inst3.loggerD("UmengPushAdapter", "title=" + uMessage.title);
                PushDependManager inst4 = PushDependManager.inst();
                inst4.loggerD("UmengPushAdapter", "text=" + uMessage.text);
            }
            String str = uMessage.custom;
            if (!TextUtils.isEmpty(str)) {
                JSONObject message = PushDependManager.inst().getMessage(str.getBytes(), false);
                if (message != null) {
                    UmengPushAdapter.handleMessage(context, 1, message.toString(), 6, stringExtra);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (Throwable unused) {
            return 2;
        }
    }
}
