package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.util.b;

public class f extends a<Boolean> {
    public f(Context context, a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 32;
    }

    /* access modifiers changed from: protected */
    public void a(Boolean bool, c cVar) {
        if (b() != null) {
            b().a(c(), bool.booleanValue());
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start UnRegisterMessageHandler match");
        return PushConstants.MZ_PUSH_ON_UNREGISTER_ACTION.equals(intent.getAction()) || (PushConstants.REQUEST_UNREGISTRATION_INTENT.equals(intent.getAction()) && TextUtils.isEmpty(intent.getStringExtra(PushConstants.EXTRA_UNREGISTERED)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Boolean c(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(PushConstants.EXTRA_APP_IS_UNREGISTER_SUCCESS, false);
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_REGISTRATION_ERROR);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_UNREGISTERED);
        DebugLogger.i("AbstractMessageHandler", "processUnRegisterCallback 5.0:" + booleanExtra + " 4.0:" + stringExtra + " 3.0:" + stringExtra2);
        if (!TextUtils.isEmpty(stringExtra) && !booleanExtra && TextUtils.isEmpty(stringExtra2)) {
            return Boolean.FALSE;
        }
        b.f(c(), "", c().getPackageName());
        return Boolean.TRUE;
    }
}
