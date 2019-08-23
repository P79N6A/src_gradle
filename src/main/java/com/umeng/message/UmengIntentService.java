package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.push.PushDependManager;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.entity.UMessage;
import com.umeng.message.service.UMJobIntentService;
import java.util.Map;
import org.json.JSONObject;

public class UmengIntentService extends UmengBaseIntentService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81128a = "com.umeng.message.UmengIntentService";

    public void onCreate() {
        try {
            super.onCreate();
            PushDependManager.inst().tryHookInit(this);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r11) {
        /*
            r10 = this;
            super.onHandleIntent(r11)
            if (r11 == 0) goto L_0x0076
            java.lang.String r0 = "org.agoo.android.intent.action.RECEIVE"
            java.lang.String r1 = r11.getAction()     // Catch:{ Exception -> 0x0076 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0075
            android.content.Context r0 = r10.getApplicationContext()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r0 = com.umeng.message.common.UmengMessageDeviceConfig.getAppkey(r0)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = "fromAppkey"
            java.lang.String r11 = r11.getStringExtra(r1)     // Catch:{ Exception -> 0x0076 }
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0076 }
            if (r1 != 0) goto L_0x0075
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0076 }
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = "umeng"
            boolean r1 = r11.contains(r1)     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            boolean r0 = r11.contains(r0)     // Catch:{ Exception -> 0x0076 }
            if (r0 != 0) goto L_0x0075
            boolean r0 = com.ss.android.push.c.f30394d     // Catch:{ Exception -> 0x0076 }
            if (r0 != 0) goto L_0x0075
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0076 }
            r0.<init>()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = "fromAppkey"
            r0.put(r1, r11)     // Catch:{ Exception -> 0x0076 }
            android.content.Context r2 = r10.getApplicationContext()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r11 = ""
            java.lang.String r1 = "umeng"
            r9 = 1
            org.json.JSONObject[] r3 = new org.json.JSONObject[r9]     // Catch:{ Exception -> 0x0076 }
            r4 = 0
            r3[r4] = r0     // Catch:{ Exception -> 0x0076 }
            r0 = r3[r4]     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r3 = "package"
            r0.put(r3, r11)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r11 = "from"
            r0.put(r11, r1)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r3 = com.ss.android.push.c.f30393c     // Catch:{ JSONException -> 0x0073 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0073 }
            r7 = 0
            org.json.JSONObject[] r11 = new org.json.JSONObject[r9]     // Catch:{ JSONException -> 0x0073 }
            r11[r4] = r0     // Catch:{ JSONException -> 0x0073 }
            r4 = r5
            r6 = r7
            r8 = r11
            com.ss.android.push.c.a(r2, r3, r4, r6, r8)     // Catch:{ JSONException -> 0x0073 }
        L_0x0073:
            com.ss.android.push.c.f30394d = r9     // Catch:{ Exception -> 0x0076 }
        L_0x0075:
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengIntentService.onHandleIntent(android.content.Intent):void");
    }

    private Intent a(Intent intent, UMessage uMessage) {
        if (intent == null || uMessage == null || uMessage.extra == null) {
            return intent;
        }
        for (Map.Entry next : uMessage.extra.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (str != null) {
                intent.putExtra(str, str2);
            }
        }
        return intent;
    }

    public void onMessage(final Context context, Intent intent) {
        MLog.i(f81128a, "--->>> UmengIntentService onMessage");
        super.onMessage(context, intent);
        try {
            String stringExtra = intent.getStringExtra("body");
            String stringExtra2 = intent.getStringExtra("id");
            String stringExtra3 = intent.getStringExtra(PushConstants.TASK_ID);
            final UMessage uMessage = new UMessage(new JSONObject(stringExtra));
            if ("pullapp".equals(uMessage.display_type)) {
                if (uMessage.isAction) {
                    uMessage.pulled_service = UmengMessageDeviceConfig.getServiceName(this, uMessage.pulled_service, uMessage.pulled_package);
                }
                if (UmengMessageDeviceConfig.isServiceWork(context, uMessage.pulled_service, uMessage.pulled_package)) {
                    UTrack.getInstance(context).trackMsgPulled(uMessage, 52);
                } else if (!UmengMessageDeviceConfig.getDataData(uMessage.pulled_package)) {
                    UTrack.getInstance(context).trackMsgPulled(uMessage, 53);
                } else {
                    Intent intent2 = new Intent();
                    intent2.setClassName(uMessage.pulled_package, uMessage.pulled_service);
                    a(intent2, uMessage);
                    ThreadPoolExecutorFactory.execute(new Runnable() {
                        public void run() {
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException unused) {
                            }
                            if (UmengMessageDeviceConfig.isServiceWork(context, uMessage.pulled_service, uMessage.pulled_package)) {
                                UTrack.getInstance(context).trackMsgPulled(uMessage, 51);
                            } else {
                                UTrack.getInstance(context).trackMsgPulled(uMessage, 50);
                            }
                        }
                    });
                }
            } else {
                if ("notificationpullapp".equals(uMessage.display_type)) {
                    MLog.i(f81128a, "--->>> UmengIntentSerivce display_type is DISPLAY_TYPE_NOTIFICATIONPULLAPP");
                    Intent intent3 = new Intent();
                    intent3.setPackage(context.getPackageName());
                    intent3.setAction("com.umeng.message.message.handler.action");
                    intent3.putExtra("body", stringExtra);
                    intent3.putExtra("id", stringExtra2);
                    intent3.putExtra(PushConstants.TASK_ID, stringExtra3);
                    UMJobIntentService.enqueueWork(context, UmengMessageCallbackHandlerService.class, intent3);
                } else {
                    String pushIntentServiceClass = MessageSharedPrefs.getInstance(context).getPushIntentServiceClass();
                    if (!pushIntentServiceClass.equalsIgnoreCase("")) {
                        String str = f81128a;
                        MLog.i(str, "--->>> UmengIntentSerivce display_type is " + pushIntentServiceClass + " service");
                        Intent intent4 = new Intent();
                        intent4.setClassName(context, pushIntentServiceClass);
                        intent4.setPackage(context.getPackageName());
                        intent4.putExtra("body", stringExtra);
                        intent4.putExtra("id", stringExtra2);
                        intent4.putExtra(PushConstants.TASK_ID, stringExtra3);
                        UMJobIntentService.enqueueWork(context, pushIntentServiceClass, intent4);
                    } else {
                        MLog.i(f81128a, "--->>> UmengIntentSerivce display_type is else");
                        Intent intent5 = new Intent();
                        intent5.setPackage(context.getPackageName());
                        intent5.setAction("com.umeng.message.message.handler.action");
                        intent5.putExtra("body", stringExtra);
                        intent5.putExtra("id", stringExtra2);
                        intent5.putExtra(PushConstants.TASK_ID, stringExtra3);
                        UMJobIntentService.enqueueWork(context, UmengMessageCallbackHandlerService.class, intent5);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
