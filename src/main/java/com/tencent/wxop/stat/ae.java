package com.tencent.wxop.stat;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.wxop.stat.a.n;
import java.util.Timer;
import java.util.TimerTask;

public class ae {

    /* renamed from: c  reason: collision with root package name */
    private static volatile ae f79836c;

    /* renamed from: a  reason: collision with root package name */
    Context f79837a;

    /* renamed from: b  reason: collision with root package name */
    private Timer f79838b = new Timer(false);

    private ae(Context context) {
        this.f79837a = context.getApplicationContext();
    }

    public static ae a(Context context) {
        if (f79836c == null) {
            synchronized (ae.class) {
                if (f79836c == null) {
                    f79836c = new ae(context);
                }
            }
        }
        return f79836c;
    }

    private void a(TimerTask timerTask, long j) {
        if (this.f79838b != null) {
            if (d.b()) {
                n.c().a("setupPeriodTimer schedule delay:".concat(String.valueOf(j)));
            }
            this.f79838b.schedule(timerTask, j);
            return;
        }
        if (d.b()) {
            n.c().c("setupPeriodTimer schedule timer == null");
        }
    }

    public final void a() {
        if (d.a() == e.PERIOD) {
            long h = (long) (d.h() * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            if (d.b()) {
                n.c().a("setupPeriodTimer delay:".concat(String.valueOf(h)));
            }
            a(new af(this), h);
        }
    }
}
