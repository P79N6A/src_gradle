package com.meizu.cloud.pushsdk.handler.a.c;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class c extends a<MessageV3> {
    public c(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    public int a() {
        return SearchJediMixFeedAdapter.f42517f;
    }

    /* access modifiers changed from: protected */
    public void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (b() != null && messageV3 != null) {
            b().c(c(), MzPushMessage.fromMessageV3(messageV3));
            a(messageV3);
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationDeleteMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE.equals(i(intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.c.b(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public MessageV3 c(Intent intent) {
        return (MessageV3) intent.getParcelableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
    }
}
