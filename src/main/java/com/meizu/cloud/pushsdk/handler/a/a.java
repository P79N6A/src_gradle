package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.c;
import com.meizu.cloud.pushsdk.notification.c.b;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class a<T> implements c {

    /* renamed from: a  reason: collision with root package name */
    private com.meizu.cloud.pushsdk.handler.a f27192a;

    /* renamed from: b  reason: collision with root package name */
    private Context f27193b;

    /* renamed from: c  reason: collision with root package name */
    private Map<Integer, String> f27194c;

    protected a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        if (context != null) {
            this.f27193b = context.getApplicationContext();
            this.f27192a = aVar;
            this.f27194c = new HashMap();
            this.f27194c.put(2, "MESSAGE_TYPE_PUSH_SERVICE_V2");
            this.f27194c.put(4, "MESSAGE_TYPE_PUSH_SERVICE_V3");
            this.f27194c.put(16, "MESSAGE_TYPE_REGISTER");
            this.f27194c.put(32, "MESSAGE_TYPE_UNREGISTER");
            this.f27194c.put(8, "MESSAGE_TYPE_THROUGH");
            this.f27194c.put(64, "MESSAGE_TYPE_NOTIFICATION_CLICK");
            this.f27194c.put(Integer.valueOf(SearchJediMixFeedAdapter.f42517f), "MESSAGE_TYPE_NOTIFICATION_DELETE");
            this.f27194c.put(256, "MESSAGE_TYPE_PUSH_SWITCH_STATUS");
            this.f27194c.put(512, "MESSAGE_TYPE_PUSH_REGISTER_STATUS");
            this.f27194c.put(2048, "MESSAGE_TYPE_PUSH_SUBTAGS_STATUS");
            this.f27194c.put(1024, "MESSAGE_TYPE_PUSH_UNREGISTER_STATUS");
            this.f27194c.put(4096, "MESSAGE_TYPE_PUSH_SUBALIAS_STATUS");
            this.f27194c.put(8192, "MESSAGE_TYPE_SCHEDULE_NOTIFICATION");
            this.f27194c.put(16384, "MESSAGE_TYPE_RECEIVE_NOTIFY_MESSAGE");
            this.f27194c.put(32768, "MESSAGE_TYPE_NOTIFICATION_STATE");
            this.f27194c.put(65536, "MESSAGE_TYPE_UPLOAD_FILE_LOG");
            this.f27194c.put(131072, "MESSAGE_TYPE_NOTIFICATION_ARRIVED");
            this.f27194c.put(262144, "MESSAGE_TYPE_NOTIFICATION_WITHDRAW");
            return;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    private String a(int i) {
        return this.f27194c.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public com.meizu.cloud.pushsdk.notification.c a(T t) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.notification.model.a a2 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a2 != null) {
            DebugLogger.e("AbstractMessageHandler", "delete notifyKey " + a2.b() + " notifyId " + a2.a());
            if (!TextUtils.isEmpty(a2.b())) {
                b.a(c(), messageV3.getUploadDataPackageName(), a2.b());
                return;
            }
            b.c(c(), messageV3.getUploadDataPackageName(), a2.a());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, com.meizu.cloud.pushsdk.notification.c cVar);

    /* access modifiers changed from: protected */
    public boolean a(int i, String str) {
        boolean z = true;
        if (i == 0) {
            z = com.meizu.cloud.pushsdk.util.b.e(c(), str);
        } else if (i == 1) {
            z = com.meizu.cloud.pushsdk.util.b.h(c(), str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i == 0 ? " canNotificationMessage " : " canThroughMessage ");
        sb.append(z);
        DebugLogger.e("AbstractMessageHandler", sb.toString());
        return z;
    }

    public boolean a(String str) {
        try {
            return c().getPackageName().equals(new JSONObject(str).getString("appId"));
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse notification error");
            return false;
        }
    }

    public com.meizu.cloud.pushsdk.handler.a b() {
        return this.f27192a;
    }

    public String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("launcher");
            return (!jSONObject.has("pkg") || TextUtils.isEmpty(jSONObject.getString("pkg"))) ? "" : jSONObject.getString("pkg");
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse desk top json error");
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public void b(MessageV3 messageV3) {
        if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            b().b(c(), MzPushMessage.fromMessageV3(messageV3));
            return;
        }
        if (MzSystemUtils.isRunningProcess(c(), messageV3.getUploadDataPackageName())) {
            DebugLogger.i("AbstractMessageHandler", "send notification arrived message to " + messageV3.getUploadDataPackageName());
            Intent intent = new Intent();
            intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
            intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_ARRIVED);
            MzSystemUtils.sendMessageFromBroadcast(c(), intent, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getUploadDataPackageName());
        }
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0067, code lost:
        r0 = f((T) r7);
        com.meizu.cloud.pushinternal.DebugLogger.e("AbstractMessageHandler", "can send message " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007e, code lost:
        if (r1 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        if (r2 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
        if (r0 == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        a((T) r7, a((T) r7));
        c((T) r7);
        com.meizu.cloud.pushinternal.DebugLogger.e("AbstractMessageHandler", "send message end ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0044, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e(r0, r1);
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.content.Intent r7) {
        /*
            r6 = this;
            boolean r0 = r6.a(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "AbstractMessageHandler"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "current message Type "
            r2.<init>(r3)
            int r3 = r6.a()
            java.lang.String r3 = r6.a((int) r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r0, r2)
            java.lang.Object r7 = r6.c((android.content.Intent) r7)
            java.lang.String r0 = "AbstractMessageHandler"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "current Handler message "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r0, r2)
            r6.b((T) r7)
            int r0 = r6.d((T) r7)
            r2 = 1
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x0057;
                case 2: goto L_0x0052;
                case 3: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            r2 = 0
            goto L_0x0067
        L_0x0046:
            java.lang.String r0 = "AbstractMessageHandler"
            java.lang.String r3 = "schedule notification"
            com.meizu.cloud.pushinternal.DebugLogger.e(r0, r3)
            r6.e((T) r7)
            r1 = 1
            goto L_0x0044
        L_0x0052:
            java.lang.String r0 = "AbstractMessageHandler"
            java.lang.String r1 = "notification on time ,show message"
            goto L_0x0063
        L_0x0057:
            java.lang.String r0 = "AbstractMessageHandler"
            java.lang.String r2 = "expire notification, dont show message"
            com.meizu.cloud.pushinternal.DebugLogger.e(r0, r2)
            goto L_0x0044
        L_0x005f:
            java.lang.String r0 = "AbstractMessageHandler"
            java.lang.String r1 = "schedule send message off, send message directly"
        L_0x0063:
            com.meizu.cloud.pushinternal.DebugLogger.e(r0, r1)
            r1 = 1
        L_0x0067:
            boolean r0 = r6.f((T) r7)
            java.lang.String r3 = "AbstractMessageHandler"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "can send message "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r3, r4)
            if (r1 == 0) goto L_0x0095
            if (r2 == 0) goto L_0x0095
            if (r0 == 0) goto L_0x0095
            com.meizu.cloud.pushsdk.notification.c r0 = r6.a((T) r7)
            r6.a((T) r7, (com.meizu.cloud.pushsdk.notification.c) r0)
            r6.c((T) r7)
            java.lang.String r7 = "AbstractMessageHandler"
            java.lang.String r0 = "send message end "
            com.meizu.cloud.pushinternal.DebugLogger.e(r7, r0)
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.handler.a.a.b(android.content.Intent):boolean");
    }

    public Context c() {
        return this.f27193b;
    }

    /* access modifiers changed from: protected */
    public abstract T c(Intent intent);

    /* access modifiers changed from: protected */
    public void c(T t) {
    }

    /* access modifiers changed from: protected */
    public int d(T t) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public String d(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY) : null;
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        String deviceId = MzSystemUtils.getDeviceId(c());
        DebugLogger.e("AbstractMessageHandler", "force get deviceId " + deviceId);
        return deviceId;
    }

    /* access modifiers changed from: protected */
    public String e(Intent intent) {
        return intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_TASK_ID);
    }

    /* access modifiers changed from: protected */
    public void e(T t) {
    }

    /* access modifiers changed from: protected */
    public String f(Intent intent) {
        return intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
    }

    /* access modifiers changed from: protected */
    public boolean f(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    public String g(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SERVICE_DEFAULT_PACKAGE_NAME);
        return TextUtils.isEmpty(stringExtra) ? c().getPackageName() : stringExtra;
    }

    /* access modifiers changed from: protected */
    public String h(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_TASK_TIMES_TAMP);
        DebugLogger.e("AbstractMessageHandler", "receive push timestamp from pushservice " + stringExtra);
        return TextUtils.isEmpty(stringExtra) ? String.valueOf(System.currentTimeMillis() / 1000) : stringExtra;
    }

    public String i(Intent intent) {
        return intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD);
    }
}
