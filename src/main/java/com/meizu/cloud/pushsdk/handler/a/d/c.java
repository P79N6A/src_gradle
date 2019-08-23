package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.util.b;

public class c extends a<RegisterStatus> {
    public c(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 512;
    }

    /* access modifiers changed from: protected */
    public void a(RegisterStatus registerStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (b() != null && registerStatus != null) {
            b().a(c(), registerStatus);
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start RegisterStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_REGISTER_STATUS.equals(i(intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public RegisterStatus c(Intent intent) {
        RegisterStatus registerStatus = (RegisterStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_REGISTER_STATUS);
        if (!TextUtils.isEmpty(registerStatus.getPushId())) {
            b.f(c(), registerStatus.getPushId(), c().getPackageName());
            b.a(c(), (int) ((System.currentTimeMillis() / 1000) + ((long) registerStatus.getExpireTime())), c().getPackageName());
        }
        return registerStatus;
    }
}
