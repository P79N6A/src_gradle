package com.loc;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Random;

public class av {

    /* renamed from: a  reason: collision with root package name */
    static WeakReference<an> f25500a;

    static /* synthetic */ void a(Context context, byte[] bArr) throws IOException {
        an a2 = aw.a(f25500a);
        aw.a(context, a2, g.h, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 307200, PushConstants.PUSH_TYPE_UPLOAD_LOG);
        if (a2.f25480e == null) {
            a2.f25480e = new b();
        }
        new Random();
        try {
            aq.a(Integer.toString(r7.nextInt(100)) + Long.toString(System.nanoTime()), bArr, a2);
        } catch (Throwable th) {
            i.b(th, "stm", "wts");
        }
    }

    public static synchronized void a(final au auVar, final Context context) {
        synchronized (av.class) {
            i.d().submit(new Runnable() {
                public final void run() {
                    try {
                        synchronized (av.class) {
                            av.a(context, auVar.a());
                        }
                    } catch (Throwable th) {
                        i.b(th, "stm", AdvanceSetting.ADVANCE_SETTING);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(final java.util.List<com.loc.au> r3, final android.content.Context r4) {
        /*
            java.lang.Class<com.loc.av> r0 = com.loc.av.class
            monitor-enter(r0)
            int r1 = r3.size()     // Catch:{ Throwable -> 0x000d }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000b:
            r3 = move-exception
            goto L_0x001b
        L_0x000d:
            java.util.concurrent.ExecutorService r1 = com.loc.i.d()     // Catch:{ all -> 0x000b }
            com.loc.av$2 r2 = new com.loc.av$2     // Catch:{ all -> 0x000b }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x000b }
            r1.submit(r2)     // Catch:{ all -> 0x000b }
            monitor-exit(r0)
            return
        L_0x001b:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.av.a(java.util.List, android.content.Context):void");
    }
}
