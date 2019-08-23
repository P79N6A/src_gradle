package com.meizu.cloud.pushsdk.handler.a.c;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.handler.a.b.b;
import com.meizu.cloud.pushsdk.handler.a.b.g;
import com.meizu.cloud.pushsdk.util.c;

public class e extends a<g> {
    public e(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 262144;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void b(g gVar) {
        c.c(c(), gVar.c(), gVar.a().b().d(), gVar.a().b().a(), gVar.a().b().e(), gVar.a().b().b());
    }

    /* access modifiers changed from: protected */
    public void a(g gVar, com.meizu.cloud.pushsdk.notification.c cVar) {
        NotificationManager notificationManager = (NotificationManager) c().getSystemService("notification");
        if (notificationManager != null) {
            DebugLogger.e("AbstractMessageHandler", "start cancel notification id " + gVar.b());
            notificationManager.cancel(gVar.b());
        }
    }

    public boolean a(Intent intent) {
        int i;
        DebugLogger.i("AbstractMessageHandler", "start WithDrawMessageHandler match");
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        if (!TextUtils.isEmpty(stringExtra)) {
            b a2 = b.a(stringExtra);
            if (a2.a() != null) {
                i = a2.a().a();
                return !PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION.equals(String.valueOf(i));
            }
        }
        i = 0;
        if (!PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public g c(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        g gVar = new g(intent.getStringExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE), g(intent), stringExtra, intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), stringExtra2);
        return gVar;
    }
}
