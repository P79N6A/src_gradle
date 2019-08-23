package com.huawei.android.pushagent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.b;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.f;
import com.huawei.android.pushagent.utils.a.h;
import com.huawei.android.pushagent.utils.tools.PushServiceTools;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class PushReceiver extends BroadcastReceiver {

    public static class BOUND_KEY {
    }

    public enum Event {
        NOTIFICATION_OPENED,
        PLUGINRSP,
        NOTIFICATION_CLICK_BTN
    }

    class EventThread extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private Context f24927b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f24928c;

        public EventThread(Context context, Bundle bundle) {
            super("EventRunable");
            this.f24927b = context;
            this.f24928c = bundle;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
            r0.onEvent(r1, r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                android.os.Bundle r0 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                android.os.Bundle r0 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                java.lang.String r1 = "receiveType"
                int r0 = r0.getInt(r1)     // Catch:{ Exception -> 0x0093 }
                if (r0 < 0) goto L_0x007f
                com.huawei.android.pushagent.PushReceiver$ReceiveType[] r1 = com.huawei.android.pushagent.PushReceiver.ReceiveType.values()     // Catch:{ Exception -> 0x0093 }
                int r1 = r1.length     // Catch:{ Exception -> 0x0093 }
                if (r0 < r1) goto L_0x0017
                goto L_0x007f
            L_0x0017:
                com.huawei.android.pushagent.PushReceiver$ReceiveType[] r1 = com.huawei.android.pushagent.PushReceiver.ReceiveType.values()     // Catch:{ Exception -> 0x0093 }
                r0 = r1[r0]     // Catch:{ Exception -> 0x0093 }
                int[] r1 = com.huawei.android.pushagent.PushReceiver.AnonymousClass1.f24924a     // Catch:{ Exception -> 0x0093 }
                int r0 = r0.ordinal()     // Catch:{ Exception -> 0x0093 }
                r0 = r1[r0]     // Catch:{ Exception -> 0x0093 }
                switch(r0) {
                    case 1: goto L_0x006c;
                    case 2: goto L_0x005a;
                    case 3: goto L_0x004a;
                    case 4: goto L_0x0041;
                    case 5: goto L_0x0035;
                    case 6: goto L_0x0029;
                    default: goto L_0x0028;
                }     // Catch:{ Exception -> 0x0093 }
            L_0x0028:
                goto L_0x007e
            L_0x0029:
                com.huawei.android.pushagent.PushReceiver r0 = com.huawei.android.pushagent.PushReceiver.this     // Catch:{ Exception -> 0x0093 }
                android.content.Context r1 = r4.f24927b     // Catch:{ Exception -> 0x0093 }
                com.huawei.android.pushagent.PushReceiver$Event r2 = com.huawei.android.pushagent.PushReceiver.Event.PLUGINRSP     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r3 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                r0.onEvent(r1, r2, r3)     // Catch:{ Exception -> 0x0093 }
                goto L_0x007e
            L_0x0035:
                com.huawei.android.pushagent.PushReceiver r0 = com.huawei.android.pushagent.PushReceiver.this     // Catch:{ Exception -> 0x0093 }
                android.content.Context r1 = r4.f24927b     // Catch:{ Exception -> 0x0093 }
                com.huawei.android.pushagent.PushReceiver$Event r2 = com.huawei.android.pushagent.PushReceiver.Event.NOTIFICATION_CLICK_BTN     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r3 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
            L_0x003d:
                r0.onEvent(r1, r2, r3)     // Catch:{ Exception -> 0x0093 }
                goto L_0x00ab
            L_0x0041:
                com.huawei.android.pushagent.PushReceiver r0 = com.huawei.android.pushagent.PushReceiver.this     // Catch:{ Exception -> 0x0093 }
                android.content.Context r1 = r4.f24927b     // Catch:{ Exception -> 0x0093 }
                com.huawei.android.pushagent.PushReceiver$Event r2 = com.huawei.android.pushagent.PushReceiver.Event.NOTIFICATION_OPENED     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r3 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                goto L_0x003d
            L_0x004a:
                com.huawei.android.pushagent.PushReceiver r0 = com.huawei.android.pushagent.PushReceiver.this     // Catch:{ Exception -> 0x0093 }
                android.content.Context r1 = r4.f24927b     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r2 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                java.lang.String r3 = "pushState"
                boolean r2 = r2.getBoolean(r3)     // Catch:{ Exception -> 0x0093 }
                r0.onPushState(r1, r2)     // Catch:{ Exception -> 0x0093 }
                goto L_0x00ab
            L_0x005a:
                com.huawei.android.pushagent.PushReceiver r0 = com.huawei.android.pushagent.PushReceiver.this     // Catch:{ Exception -> 0x0093 }
                android.content.Context r1 = r4.f24927b     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r2 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                java.lang.String r3 = "pushMsg"
                byte[] r2 = r2.getByteArray(r3)     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r3 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                r0.onPushMsg((android.content.Context) r1, (byte[]) r2, (android.os.Bundle) r3)     // Catch:{ Exception -> 0x0093 }
                goto L_0x00ab
            L_0x006c:
                com.huawei.android.pushagent.PushReceiver r0 = com.huawei.android.pushagent.PushReceiver.this     // Catch:{ Exception -> 0x0093 }
                android.content.Context r1 = r4.f24927b     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r2 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                java.lang.String r3 = "deviceToken"
                java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x0093 }
                android.os.Bundle r3 = r4.f24928c     // Catch:{ Exception -> 0x0093 }
                r0.onToken(r1, r2, r3)     // Catch:{ Exception -> 0x0093 }
                goto L_0x00ab
            L_0x007e:
                return
            L_0x007f:
                java.lang.String r1 = "PushLogAC2815"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
                java.lang.String r3 = "invalid receiverType:"
                r2.<init>(r3)     // Catch:{ Exception -> 0x0093 }
                r2.append(r0)     // Catch:{ Exception -> 0x0093 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0093 }
                com.huawei.android.pushagent.utils.a.e.d(r1, r0)     // Catch:{ Exception -> 0x0093 }
                return
            L_0x0093:
                r0 = move-exception
                java.lang.String r1 = "PushLogAC2815"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "call EventThread(ReceiveType cause:"
                r2.<init>(r3)
                java.lang.String r3 = r0.toString()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.huawei.android.pushagent.utils.a.e.c(r1, r2, r0)
            L_0x00ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.PushReceiver.EventThread.run():void");
        }
    }

    static class HandlePushTokenThread extends Thread {

        /* renamed from: a  reason: collision with root package name */
        Context f24929a;

        /* renamed from: b  reason: collision with root package name */
        String f24930b;

        public HandlePushTokenThread(Context context, String str) {
            this.f24929a = context;
            this.f24930b = str;
        }

        public void run() {
            h hVar = new h(this.f24929a, "push_client_self_info");
            hVar.a("hasRequestToken", false);
            hVar.f("token_info");
            f.a(this.f24929a, "push_client_self_info", "token_info", this.f24930b);
        }
    }

    enum ReceiveType {
        ReceiveType_Init,
        ReceiveType_Token,
        ReceiveType_Msg,
        ReceiveType_PushState,
        ReceiveType_NotifyClick,
        ReceiveType_PluginRsp,
        ReceiveType_ClickBtn
    }

    private static int a() {
        int i;
        try {
            Class<?> cls = Class.forName("android.os.UserHandle");
            i = ((Integer) cls.getDeclaredMethod("myUserId", new Class[0]).invoke(cls, new Object[0])).intValue();
            try {
                e.a("PushLogAC2815", "getUserId:" + i);
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
            i = -999;
            e.a("PushLogAC2815", " getUserId wrong");
            return i;
        }
        return i;
    }

    private static void a(Context context, String str) {
        if (context == null) {
            e.c("PushLogAC2815", "the context is null when adding or deleting tags from file.");
            return;
        }
        try {
            JSONArray b2 = b.b(str);
            if (b2 != null) {
                h hVar = new h(context, "tags_info");
                int length = b2.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = b2.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("tagKey");
                        int optInt = optJSONObject.optInt("opType");
                        if (1 == optInt) {
                            hVar.a(optString, (Object) optJSONObject.optString("tagValue"));
                        } else if (2 == optInt) {
                            hVar.f(optString);
                            e.a("PushLogAC2815", "delete local tags:" + optJSONObject.toString());
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e.c("PushLogAC2815", "when adding or deleting tags from file excepiton," + e2.getMessage());
        }
    }

    private void b(Context context, Intent intent) throws UnsupportedEncodingException {
        g(context, intent);
        boolean a2 = new h(context, "push_switch").a("normal_msg_enable");
        e.a("PushLogAC2815", "closePush_Normal:" + a2);
        if (a2) {
            e.b("PushLogAC2815", "close switch is true, message not dispatch");
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("msg_data");
        String str = new String(intent.getByteArrayExtra("device_token"), "UTF-8");
        e.a("PushLogAC2815", "PushReceiver receive a message success");
        Bundle bundle = new Bundle();
        bundle.putString("deviceToken", str);
        bundle.putByteArray("pushMsg", byteArrayExtra);
        bundle.putInt("receiveType", ReceiveType.ReceiveType_Msg.ordinal());
        new EventThread(context, bundle).start();
    }

    private void c(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("click");
        Bundle bundle = new Bundle();
        bundle.putString("pushMsg", stringExtra);
        bundle.putInt("receiveType", ReceiveType.ReceiveType_NotifyClick.ordinal());
        new EventThread(context, bundle).start();
    }

    private void d(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("clickBtn");
        int intExtra = intent.getIntExtra("notifyId", 0);
        Bundle bundle = new Bundle();
        bundle.putString("pushMsg", stringExtra);
        bundle.putInt("pushNotifyId", intExtra);
        bundle.putInt("receiveType", ReceiveType.ReceiveType_ClickBtn.ordinal());
        new EventThread(context, bundle).start();
    }

    private void e(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("push_state", false);
        Bundle bundle = new Bundle();
        bundle.putBoolean("pushState", booleanExtra);
        bundle.putInt("receiveType", ReceiveType.ReceiveType_PushState.ordinal());
        new EventThread(context, bundle).start();
    }

    private void f(Context context, Intent intent) {
        boolean z;
        int intExtra = intent.getIntExtra("reportType", -1);
        Bundle bundleExtra = intent.getBundleExtra("reportExtra");
        int intExtra2 = intent.getIntExtra("reportRetCode", -1);
        String stringExtra = intent.getStringExtra("reportTagContent");
        e.a("PushLogAC2815", "report tag completely, retcode is:" + intExtra2);
        if (907122001 == intExtra2) {
            e.a("PushLogAC2815", "report tag success.");
            a(context, stringExtra);
            z = true;
        } else {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isReportSuccess", z);
        bundle.putInt("reportType", intExtra);
        bundle.putBundle("reportExtra", bundleExtra);
        bundle.putInt("receiveType", ReceiveType.ReceiveType_PluginRsp.ordinal());
        new EventThread(context, bundle).start();
    }

    private void g(Context context, Intent intent) {
        if (context != null && intent != null) {
            String stringExtra = intent.getStringExtra("msgIdStr");
            if (!TextUtils.isEmpty(stringExtra) && a.o(context)) {
                Intent intent2 = new Intent("com.huawei.android.push.intent.MSG_RESPONSE");
                intent2.putExtra("msgIdStr", stringExtra);
                intent2.setPackage("android");
                intent2.setFlags(32);
                e.a("PushLogAC2815", "send msg response broadcast to frameworkPush");
                context.sendBroadcast(intent2);
            }
        }
    }

    public static void getPushState(Context context) {
        e.a("PushLogAC2815", "enter PushEntity:getPushState() pkgName" + context.getPackageName());
        if (TextUtils.isEmpty(a.r(context))) {
            if (a.o(context)) {
                e.a("PushLogAC2815", "votedPackage is null, getPushState from frameworkPush");
            } else {
                e.a("PushLogAC2815", "votedPackage is null and not exist frameworkPush, can not getPushState");
                return;
            }
        }
        Intent intent = new Intent("com.huawei.android.push.intent.GET_PUSH_STATE");
        intent.putExtra("pkg_name", context.getPackageName());
        intent.setFlags(32);
        PushServiceTools.broadcastOrStartSelfService(context, intent);
    }

    public static final void getToken(Context context) {
        e.a("PushLogAC2815", "enter PushEntity:getToken() pkgName" + context.getPackageName());
        new h(context, "push_client_self_info").a("hasRequestToken", true);
        Intent intent = new Intent("com.huawei.android.push.intent.REGISTER");
        intent.putExtra("pkg_name", context.getPackageName());
        int a2 = a();
        if (-999 != a2) {
            intent.putExtra("userid", String.valueOf(a2));
        }
        intent.setFlags(32);
        PushServiceTools.broadcastOrStartSelfService(context, intent);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, Intent intent) throws UnsupportedEncodingException {
        String str = new String(intent.getByteArrayExtra("device_token"), "UTF-8");
        e.a("PushLogAC2815", "get a deviceToken:" + com.huawei.android.pushagent.utils.a.a.e.a(str));
        if (TextUtils.isEmpty(str)) {
            e.c("PushLogAC2815", "get a deviceToken, but it is null");
            return;
        }
        boolean a2 = new h(context, "push_client_self_info").a("hasRequestToken");
        String a3 = f.a(context, "push_client_self_info", "token_info");
        e.a("PushLogAC2815", "my oldtoken is :" + com.huawei.android.pushagent.utils.a.a.e.a(a3));
        if (a2 || !str.equals(a3)) {
            e.b("PushLogAC2815", "push client begin to receive the token");
            new HandlePushTokenThread(context, str).start();
            Bundle bundle = new Bundle();
            bundle.putString("deviceToken", str);
            bundle.putByteArray("pushMsg", null);
            bundle.putInt("receiveType", ReceiveType.ReceiveType_Token.ordinal());
            if (intent.getExtras() != null) {
                bundle.putAll(intent.getExtras());
            }
            new EventThread(context, bundle).start();
            return;
        }
        e.c("PushLogAC2815", "get a deviceToken, but do not requested token, and new token is equals old token");
    }

    public void onEvent(Context context, Event event, Bundle bundle) {
    }

    public void onPushMsg(Context context, byte[] bArr, String str) {
    }

    public boolean onPushMsg(Context context, byte[] bArr, Bundle bundle) {
        String str = "";
        if (bundle != null) {
            str = bundle.getString("deviceToken");
        }
        onPushMsg(context, bArr, str);
        return true;
    }

    public void onPushState(Context context, boolean z) {
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            e.a("PushLogAC2815", "enter PushMsgReceiver:onReceive(Intent:" + intent.getAction() + " pkgName:" + context.getPackageName() + ")");
            String action = intent.getAction();
            if ("com.huawei.android.push.intent.REGISTRATION".equals(action) && intent.hasExtra("device_token")) {
                a(context, intent);
            } else if ("com.huawei.android.push.intent.RECEIVE".equals(action) && intent.hasExtra("msg_data")) {
                b(context, intent);
            } else if ("com.huawei.android.push.intent.CLICK".equals(action) && intent.hasExtra("click")) {
                c(context, intent);
            } else if (!"com.huawei.android.push.intent.CLICK".equals(action) || !intent.hasExtra("clickBtn")) {
                if ("com.huawei.intent.action.PUSH_STATE".equals(action)) {
                    e(context, intent);
                } else if ("com.huawei.android.push.plugin.RESPONSE".equals(action)) {
                    f(context, intent);
                } else {
                    e.b("PushLogAC2815", "message can't be recognised:" + intent.toUri(0));
                }
            } else {
                d(context, intent);
            }
        } catch (Exception e2) {
            e.c("PushLogAC2815", "call onReceive(intent:" + intent + ") cause:" + e2.toString(), e2);
        }
    }

    public void onToken(Context context, String str) {
    }

    public void onToken(Context context, String str, Bundle bundle) {
        onToken(context, str);
    }
}
