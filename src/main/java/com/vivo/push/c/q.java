package com.vivo.push.c;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.b.i;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p;
import com.vivo.push.util.o;
import com.vivo.push.util.r;
import com.vivo.push.w;
import com.vivo.push.y;
import java.util.HashMap;

public final class q extends aa {
    q(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        boolean isEnablePush = ClientConfigManagerImpl.getInstance(this.f81705a).isEnablePush();
        com.vivo.push.b.q qVar = (com.vivo.push.b.q) yVar;
        if (!r.c(this.f81705a, this.f81705a.getPackageName())) {
            com.vivo.push.b.y yVar2 = new com.vivo.push.b.y(2101);
            HashMap hashMap = new HashMap();
            hashMap.put("messageID", String.valueOf(qVar.f()));
            String b2 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put("remoteAppId", b2);
            }
            yVar2.a(hashMap);
            p.a().a((y) yVar2);
            return;
        }
        p.a().a((y) new i(String.valueOf(qVar.f())));
        o.d("OnNotificationArrivedTask", "PushMessageReceiver " + this.f81705a.getPackageName() + " isEnablePush :" + isEnablePush);
        if (!isEnablePush) {
            com.vivo.push.b.y yVar3 = new com.vivo.push.b.y(1020);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("messageID", String.valueOf(qVar.f()));
            String b3 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
            if (!TextUtils.isEmpty(b3)) {
                hashMap2.put("remoteAppId", b3);
            }
            yVar3.a(hashMap2);
            p.a().a((y) yVar3);
        } else if (!p.a().g() || a(com.vivo.push.util.y.d(this.f81705a), qVar.e(), qVar.i())) {
            if (Build.VERSION.SDK_INT >= 24) {
                NotificationManager notificationManager = (NotificationManager) this.f81705a.getSystemService("notification");
                if (notificationManager != null && !notificationManager.areNotificationsEnabled()) {
                    o.b("OnNotificationArrivedTask", "pkg name : " + this.f81705a.getPackageName() + " notify switch is false");
                    o.b(this.f81705a, "通知开关关闭，导致通知无法展示，请到设置页打开应用通知开关");
                    com.vivo.push.b.y yVar4 = new com.vivo.push.b.y(2104);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("messageID", String.valueOf(qVar.f()));
                    String b4 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
                    if (!TextUtils.isEmpty(b4)) {
                        hashMap3.put("remoteAppId", b4);
                    }
                    yVar4.a(hashMap3);
                    p.a().a((y) yVar4);
                    return;
                }
            }
            InsideNotificationItem d2 = qVar.d();
            if (d2 != null) {
                int targetType = d2.getTargetType();
                String tragetContent = d2.getTragetContent();
                o.d("OnNotificationArrivedTask", "tragetType is " + targetType + " ; target is " + tragetContent);
                w.b(new r(this, d2, qVar));
                return;
            }
            o.a("OnNotificationArrivedTask", "notify is null");
            Context context = this.f81705a;
            o.c(context, "通知内容为空，" + qVar.f());
            Context context2 = this.f81705a;
            long f2 = qVar.f();
            o.d("ClientReportUtil", "report message: " + f2 + ", reportType: 1027");
            com.vivo.push.b.y yVar5 = new com.vivo.push.b.y(1027);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("messageID", String.valueOf(f2));
            String b5 = com.vivo.push.util.y.b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(b5)) {
                hashMap4.put("remoteAppId", b5);
            }
            yVar5.a(hashMap4);
            p.a().a((y) yVar5);
        } else {
            com.vivo.push.b.y yVar6 = new com.vivo.push.b.y(1021);
            HashMap hashMap5 = new HashMap();
            hashMap5.put("messageID", String.valueOf(qVar.f()));
            String b6 = com.vivo.push.util.y.b(this.f81705a, this.f81705a.getPackageName());
            if (!TextUtils.isEmpty(b6)) {
                hashMap5.put("remoteAppId", b6);
            }
            yVar6.a(hashMap5);
            p.a().a((y) yVar6);
        }
    }
}
