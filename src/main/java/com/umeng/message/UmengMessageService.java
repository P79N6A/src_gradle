package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.service.UMJobIntentService;

public abstract class UmengMessageService extends UMJobIntentService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81142a = "UmengMessageService";

    public abstract void onMessage(Context context, Intent intent);

    public void a(Intent intent) {
        onMessage(this, intent);
        String stringExtra = intent.getStringExtra("body");
        String str = f81142a;
        UMLog.mutlInfo(str, 2, "message:" + stringExtra);
    }
}
