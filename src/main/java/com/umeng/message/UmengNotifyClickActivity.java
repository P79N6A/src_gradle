package com.umeng.message;

import android.content.Intent;
import android.os.Bundle;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UMessage;
import org.json.JSONException;
import org.json.JSONObject;

public class UmengNotifyClickActivity extends BaseNotifyClickActivity {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81144a = "com.umeng.message.UmengNotifyClickActivity";

    /* access modifiers changed from: protected */
    public void a() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onMessage(Intent intent) {
        String stringExtra = intent.getStringExtra("body");
        String str = f81144a;
        UMLog.mutlInfo(str, 2, "onMessage():[" + stringExtra + "]");
        try {
            UMessage uMessage = new UMessage(new JSONObject(stringExtra));
            uMessage.message_id = intent.getStringExtra("id");
            uMessage.task_id = intent.getStringExtra(PushConstants.TASK_ID);
            UTrack.getInstance(this).trackMiPushMsgClick(uMessage);
        } catch (JSONException e2) {
            UMLog.mutlInfo(f81144a, 2, e2.toString());
        }
    }
}
