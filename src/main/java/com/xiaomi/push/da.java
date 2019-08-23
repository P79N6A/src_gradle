package com.xiaomi.push;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.dh;
import java.lang.ref.WeakReference;

public class da implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private String f81924a;

    /* renamed from: a  reason: collision with other field name */
    private WeakReference<Context> f251a;

    public da(String str, WeakReference<Context> weakReference) {
        this.f81924a = str;
        this.f251a = weakReference;
    }

    public void run() {
        if (this.f251a != null) {
            Context context = (Context) this.f251a.get();
            if (context != null) {
                if (dn.a(this.f81924a) > cz.f249a) {
                    dd a2 = dd.a(this.f81924a);
                    dc a3 = dc.a(this.f81924a);
                    a2.a((dh.a) a3);
                    a3.a((dh.a) db.a(context, this.f81924a, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                    dh.a(context).a((dh.a) a2);
                    return;
                }
                b.b("=====> do not need clean db");
            }
        }
    }
}
