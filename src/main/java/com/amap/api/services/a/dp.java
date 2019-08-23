package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Random;

public class dp {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<dk> f6840a;

    public static void a(final Context context) {
        ca.c().submit(new Runnable() {
            public final void run() {
                try {
                    dk a2 = dq.a(dp.f6840a);
                    dq.a(context, a2, by.h, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 307200, PushConstants.PUSH_TYPE_UPLOAD_LOG);
                    if (a2.g == null) {
                        a2.g = new dr(new dv(context, new ds(new dw(new dy()))));
                    }
                    a2.h = 3600000;
                    if (TextUtils.isEmpty(a2.i)) {
                        a2.i = by.a(context, "c.log");
                    }
                    if (a2.f6828f == null) {
                        a2.f6828f = new eb(a2.h, a2.i, new dz(30, a2.f6823a, new ed(context, false)));
                    }
                    dl.a(a2);
                } catch (Throwable th) {
                    ca.c(th, "stm", "usd");
                }
            }
        });
    }

    public static synchronized void a(final Cdo doVar, final Context context) {
        synchronized (dp.class) {
            ca.c().submit(new Runnable() {
                public final void run() {
                    try {
                        synchronized (dp.class) {
                            dp.b(context, doVar.a());
                        }
                    } catch (Throwable th) {
                        ca.c(th, "stm", AdvanceSetting.ADVANCE_SETTING);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static void b(Context context, byte[] bArr) throws IOException {
        dk a2 = dq.a(f6840a);
        dq.a(context, a2, by.h, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 307200, PushConstants.PUSH_TYPE_UPLOAD_LOG);
        if (a2.f6827e == null) {
            a2.f6827e = new bt();
        }
        new Random();
        try {
            dl.a(Integer.toString(r7.nextInt(100)) + Long.toString(System.nanoTime()), bArr, a2);
        } catch (Throwable th) {
            ca.c(th, "stm", "wts");
        }
    }
}
