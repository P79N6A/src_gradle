package com.huawei.android.pushselfshow;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.c.d;
import com.huawei.android.pushselfshow.permission.RequestPermissionsActivity;
import com.huawei.android.pushselfshow.utils.b.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;

public class SelfShowReceiver {

    static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        Context f25196a;

        /* renamed from: b  reason: collision with root package name */
        String f25197b;

        public a(Context context, String str) {
            this.f25196a = context;
            this.f25197b = str;
        }

        public void run() {
            ArrayList a2 = com.huawei.android.pushselfshow.utils.a.a.a(this.f25196a, this.f25197b);
            int size = a2.size();
            e.e("PushSelfShowLog", "receive package add ,arrSize " + size);
            for (int i = 0; i < size; i++) {
                com.huawei.android.pushselfshow.utils.a.a(this.f25196a, "16", (String) a2.get(i), PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
            }
            if (size > 0) {
                com.huawei.android.pushselfshow.utils.a.a.b(this.f25196a, this.f25197b);
            }
            com.huawei.android.pushselfshow.utils.a.b(new File(b.a(this.f25196a)));
        }
    }

    public void a(Context context, Intent intent, com.huawei.android.pushselfshow.b.a aVar) {
        e.a("PushSelfShowLog", "receive a selfshow message ,the type is" + aVar.p);
        if (!com.huawei.android.pushselfshow.a.a.a(aVar.p)) {
            com.huawei.android.pushselfshow.utils.a.a(context, "3", aVar);
            return;
        }
        long b2 = com.huawei.android.pushselfshow.utils.a.b(aVar.l);
        if (b2 == 0) {
            new d(context, aVar).start();
            return;
        }
        e.a("PushSelfShowLog", "waiting ……");
        intent.setPackage(context.getPackageName());
        com.huawei.android.pushselfshow.utils.a.a(context, intent, b2);
    }

    public void a(Context context, Intent intent, String str, com.huawei.android.pushselfshow.b.a aVar, int i) {
        e.a("PushSelfShowLog", "receive a selfshow userhandle message");
        if (!"-1".equals(str)) {
            com.huawei.android.pushselfshow.c.b.a(context, intent);
        } else {
            com.huawei.android.pushselfshow.c.b.a(context, i);
        }
        if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str)) {
            new com.huawei.android.pushselfshow.a.a(context, aVar).a();
            if (aVar.o != null) {
                try {
                    JSONArray jSONArray = new JSONArray(aVar.o);
                    Intent intent2 = new Intent("com.huawei.android.push.intent.CLICK");
                    intent2.putExtra("click", jSONArray.toString()).setPackage(aVar.n).setFlags(32);
                    context.sendBroadcast(intent2);
                } catch (Exception e2) {
                    e.d("PushSelfShowLog", "message.extras is not a json format,err info " + e2.toString());
                }
            }
        }
        if (!TextUtils.isEmpty(aVar.f25201a)) {
            String str2 = aVar.n + aVar.f25201a;
            e.a("PushSelfShowLog", "groupMap key is " + str2);
            if (com.huawei.android.pushselfshow.c.b.f25214a.containsKey(str2)) {
                com.huawei.android.pushselfshow.c.b.f25214a.remove(str2);
                e.a("PushSelfShowLog", "after remove, groupMap.size is:" + com.huawei.android.pushselfshow.c.b.f25214a.get(str2));
            }
        }
        com.huawei.android.pushselfshow.utils.a.a(context, str, aVar);
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        if (context == null || intent == null) {
            e.a("PushSelfShowLog", "enter SelfShowReceiver receiver, context or intent is null");
            return;
        }
        try {
            e.a(context);
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                Uri data = intent.getData();
                if (data != null) {
                    String schemeSpecificPart = data.getSchemeSpecificPart();
                    e.e("PushSelfShowLog", "receive package add ,the pkgName is " + schemeSpecificPart);
                    if (!TextUtils.isEmpty(schemeSpecificPart)) {
                        new a(context, schemeSpecificPart).start();
                    }
                }
                return;
            }
            if ("com.huawei.intent.action.PUSH".equals(action)) {
                if (RequestPermissionsActivity.a(context)) {
                    e.b("PushSelfShowLog", "needStartPermissionActivity");
                    RequestPermissionsActivity.a(context, intent);
                    return;
                }
                String str = null;
                if (intent.hasExtra("selfshow_info")) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("selfshow_info");
                    if (intent.hasExtra("selfshow_token")) {
                        byte[] byteArrayExtra2 = intent.getByteArrayExtra("selfshow_token");
                        if (intent.hasExtra("selfshow_event_id")) {
                            str = intent.getStringExtra("selfshow_event_id");
                        }
                        String str2 = str;
                        if (intent.hasExtra("selfshow_notify_id")) {
                            int intExtra = intent.getIntExtra("selfshow_notify_id", 0);
                            e.b("PushSelfShowLog", "get notifyId:" + intExtra);
                            i = intExtra;
                        } else {
                            i = 0;
                        }
                        com.huawei.android.pushselfshow.b.a aVar = new com.huawei.android.pushselfshow.b.a(byteArrayExtra, byteArrayExtra2);
                        if (!aVar.b()) {
                            e.a("PushSelfShowLog", "parseMessage failed");
                            return;
                        }
                        e.a("PushSelfShowLog", " onReceive the msg id = " + aVar.m + ",and cmd is" + aVar.p + ",and the eventId is " + str2);
                        if (str2 == null) {
                            a(context, intent, aVar);
                        } else {
                            a(context, intent, str2, aVar, i);
                        }
                        com.huawei.android.pushselfshow.utils.a.b(new File(b.a(context)));
                    }
                }
            }
        } catch (Exception e2) {
            e.a("PushSelfShowLog", e2.toString(), (Throwable) e2);
        }
    }
}
