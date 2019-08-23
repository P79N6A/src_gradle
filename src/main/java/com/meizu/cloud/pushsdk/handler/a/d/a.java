package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.util.b;

public class a extends com.meizu.cloud.pushsdk.handler.a.a<PushSwitchStatus> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 256;
    }

    /* access modifiers changed from: protected */
    public void a(PushSwitchStatus pushSwitchStatus, c cVar) {
        if (b() != null && pushSwitchStatus != null) {
            b().a(c(), pushSwitchStatus);
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start PushSwitchStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS.equals(i(intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public PushSwitchStatus c(Intent intent) {
        PushSwitchStatus pushSwitchStatus = (PushSwitchStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_STATUS);
        if (BasicPushStatus.SUCCESS_CODE.equals(pushSwitchStatus.getCode())) {
            String g = g(intent);
            DebugLogger.e("AbstractMessageHandler", "PushSwitchStatusHandler update local " + g + " switch status " + pushSwitchStatus);
            b.a(c(), g, pushSwitchStatus.isSwitchNotificationMessage());
            b.b(c(), g, pushSwitchStatus.isSwitchThroughMessage());
        }
        return pushSwitchStatus;
    }
}
