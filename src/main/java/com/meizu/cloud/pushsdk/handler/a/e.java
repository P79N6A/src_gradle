package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.a.b.d;
import com.meizu.cloud.pushsdk.notification.c;

public class e extends a<MessageV3> {
    public e(Context context, a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void a(MessageV3 messageV3, c cVar) {
        if (b() != null && messageV3 != null && !TextUtils.isEmpty(messageV3.getThroughMessage())) {
            b().b(c(), messageV3.getThroughMessage());
            b().a(c(), messageV3.getThroughMessage(), d.a().a(messageV3.getTaskId()).b(messageV3.getSeqId()).c(messageV3.getPushTimestamp()).d(messageV3.getDeviceId()).a().b());
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start ThroughMessageHandler match");
        if (!a(1, g(intent))) {
            return false;
        }
        if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
            if ("message".equals(i(intent))) {
                return true;
            }
            if (TextUtils.isEmpty(i(intent))) {
                String stringExtra = intent.getStringExtra("message");
                if (!TextUtils.isEmpty(stringExtra) && !a(stringExtra)) {
                    return true;
                }
            }
        }
        return PushConstants.C2DM_INTENT.equals(intent.getAction());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void b(MessageV3 messageV3) {
        if (messageV3 != null && !TextUtils.isEmpty(messageV3.getDeviceId()) && !TextUtils.isEmpty(messageV3.getTaskId())) {
            String b2 = b(messageV3.getThroughMessage());
            if (!TextUtils.isEmpty(b2)) {
                com.meizu.cloud.pushsdk.util.c.d(c(), b2, messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
                return;
            }
            com.meizu.cloud.pushsdk.util.c.d(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public MessageV3 c(Intent intent) {
        MessageV3 messageV3 = new MessageV3();
        if (PushConstants.C2DM_INTENT.equals(intent.getAction())) {
            b().a(c(), intent);
            return null;
        }
        messageV3.setThroughMessage(intent.getStringExtra("message"));
        messageV3.setTaskId(e(intent));
        messageV3.setDeviceId(d(intent));
        messageV3.setSeqId(f(intent));
        messageV3.setPushTimestamp(h(intent));
        messageV3.setUploadDataPackageName(g(intent));
        return messageV3;
    }
}
