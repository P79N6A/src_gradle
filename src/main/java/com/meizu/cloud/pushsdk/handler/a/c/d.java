package com.meizu.cloud.pushsdk.handler.a.c;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.handler.a.b.c;
import com.meizu.cloud.pushsdk.notification.c.b;

public class d extends a<c> {
    public d(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 32768;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void b(c cVar) {
        switch (cVar.c()) {
            case -2:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_ACCESS_DENY");
                com.meizu.cloud.pushsdk.util.c.g(c(), cVar.a().getUploadDataPackageName(), cVar.a().getDeviceId(), cVar.a().getTaskId(), cVar.a().getSeqId(), cVar.a().getPushTimestamp());
                break;
            case -1:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_INBOX");
                com.meizu.cloud.pushsdk.util.c.f(c(), cVar.a().getUploadDataPackageName(), cVar.a().getDeviceId(), cVar.a().getTaskId(), cVar.a().getSeqId(), cVar.a().getPushTimestamp());
                return;
            case 0:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_NORMAL");
                return;
            case 1:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_FLOAT");
                break;
        }
    }

    /* access modifiers changed from: protected */
    public void a(c cVar, com.meizu.cloud.pushsdk.notification.c cVar2) {
        DebugLogger.e("AbstractMessageHandler", "store notification id " + cVar.b());
        b.b(c(), cVar.a().getUploadDataPackageName(), cVar.b());
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationStateMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_STATE.equals(i(intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public c c(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_SHOW_PACKAGE_NAME);
        String stringExtra2 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_TASK_ID);
        String stringExtra3 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_SEQ_ID);
        String stringExtra4 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID);
        String stringExtra5 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP);
        String stringExtra6 = intent.getStringExtra(PushConstants.MZ_PUSH_NOTIFICATION_STATE_MESSAGE);
        DebugLogger.i("AbstractMessageHandler", "current taskId " + stringExtra2 + " seqId " + stringExtra3 + " deviceId " + stringExtra4 + " packageName " + stringExtra);
        c cVar = new c(MessageV3.parse(c().getPackageName(), stringExtra, stringExtra5, stringExtra4, stringExtra2, stringExtra3, stringExtra6));
        String stringExtra7 = intent.getStringExtra("flyme:notification_pkg");
        int intExtra = intent.getIntExtra("flyme:notification_id", 0);
        int intExtra2 = intent.getIntExtra("flyme:notification_state", 0);
        cVar.a(intExtra);
        cVar.a(stringExtra7);
        cVar.b(intExtra2);
        return cVar;
    }
}
