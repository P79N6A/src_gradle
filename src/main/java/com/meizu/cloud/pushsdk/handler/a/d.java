package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.util.b;

public class d extends a<String> {
    public d(Context context, a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 16;
    }

    /* access modifiers changed from: protected */
    public void a(String str, c cVar) {
        if (b() != null) {
            b().a(c(), str);
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start RegisterMessageHandler match");
        return PushConstants.MZ_PUSH_ON_REGISTER_ACTION.equals(intent.getAction()) || (PushConstants.REGISTRATION_CALLBACK_INTENT.equals(intent.getAction()) && !TextUtils.isEmpty(intent.getStringExtra("registration_id")));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String c(Intent intent) {
        String stringExtra = intent.getStringExtra("registration_id");
        b.f(c(), stringExtra, c().getPackageName());
        b.a(c(), 0, c().getPackageName());
        return stringExtra;
    }
}
