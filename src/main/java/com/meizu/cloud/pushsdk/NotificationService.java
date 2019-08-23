package com.meizu.cloud.pushsdk;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.base.a.a;
import com.meizu.cloud.pushsdk.base.a.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.b.b;
import com.meizu.cloud.pushsdk.util.c;
import java.util.List;

public class NotificationService extends IntentService {

    /* renamed from: a  reason: collision with root package name */
    private Object f26823a;

    public NotificationService() {
        super("NotificationService");
    }

    public NotificationService(String str) {
        super(str);
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        List<ResolveInfo> queryBroadcastReceivers = getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return null;
        }
        return queryBroadcastReceivers.get(0).activityInfo.name;
    }

    public void a(Intent intent) {
        String a2 = a(getPackageName(), intent.getAction());
        if (TextUtils.isEmpty(a2)) {
            c.a((Context) this, intent, "reflectReceiver sendbroadcast", (int) PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST);
            DebugLogger.i("NotificationService", " reflectReceiver error: receiver for: " + intent.getAction() + " not found, package: " + getPackageName());
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
            return;
        }
        try {
            c.a((Context) this, intent, "reflectReceiver startservice", (int) PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE);
            intent.setClassName(getPackageName(), a2);
            d a3 = a.a(a2).a((Class<?>[]) null).a(null);
            if (a3.f27048a && a3.f27049b != null) {
                DebugLogger.i("NotificationService", "Reflect MzPushReceiver " + a3.f27048a);
                a.a((Object) a3.f27049b).a("onReceive", Context.class, Intent.class).a((Object) a3.f27049b, getApplicationContext(), intent);
            }
        } catch (Exception e2) {
            DebugLogger.i("NotificationService", "reflect e: " + e2);
            c.a((Context) this, intent, e2.getMessage(), (int) PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_ERROR);
        }
    }

    public void onDestroy() {
        DebugLogger.i("NotificationService", "NotificationService destroy");
        this.f26823a = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        boolean z;
        Process.setThreadPriority(10);
        if (intent != null) {
            try {
                DebugLogger.i("NotificationService", "onHandleIntentaction " + intent.getAction());
                String stringExtra = intent.getStringExtra("command_type");
                if (!PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && !PushConstants.MZ_PUSH_ON_REGISTER_ACTION.equals(intent.getAction())) {
                    if (!PushConstants.MZ_PUSH_ON_UNREGISTER_ACTION.equals(intent.getAction())) {
                        z = false;
                        DebugLogger.d("NotificationService", "-- command_type -- " + stringExtra + " legalAction " + z);
                        if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver") && z) {
                            String stringExtra2 = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
                            DebugLogger.i("NotificationService", "control message is " + stringExtra2);
                            if (!TextUtils.isEmpty(stringExtra2)) {
                                com.meizu.cloud.pushsdk.c.a.a((Context) this, new b(stringExtra2, null, null).b().c());
                            }
                            a(intent);
                            return;
                        }
                        return;
                    }
                }
                z = true;
                DebugLogger.d("NotificationService", "-- command_type -- " + stringExtra + " legalAction " + z);
                if (!TextUtils.isEmpty(stringExtra)) {
                }
            } catch (Exception e2) {
                DebugLogger.e("NotificationService", "onHandleIntent error " + e2.getMessage());
            }
        }
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
