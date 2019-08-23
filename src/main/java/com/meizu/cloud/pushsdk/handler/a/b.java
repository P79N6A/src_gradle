package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.meizu.cloud.pushsdk.notification.c;

public class b extends c {
    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public void a(MessageV3 messageV3, c cVar) {
        if (cVar != null) {
            cVar.e(messageV3);
            b().b(c(), MzPushMessage.fromMessageV3(messageV3));
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start MessageV2Handler match");
        return a(0, g(intent)) && PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW.equals(i(intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.c.c(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void c(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.c.a(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public MessageV3 c(Intent intent) {
        MPushMessage mPushMessage = (MPushMessage) intent.getSerializableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
        return MessageV3.parse(g(intent), d(intent), mPushMessage.getTaskId(), mPushMessage);
    }
}
