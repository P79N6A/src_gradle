package com.ss.android.ad.splash.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class l extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f27852a;

    public interface a {
        void a(Message message);
    }

    public final void handleMessage(Message message) {
        a aVar = (a) this.f27852a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(com.ss.android.ad.splash.utils.l.a r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x000b
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            goto L_0x000f
        L_0x000b:
            android.os.Looper r0 = android.os.Looper.myLooper()
        L_0x000f:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.utils.l.<init>(com.ss.android.ad.splash.utils.l$a):void");
    }

    public l(Looper looper, a aVar) {
        super(looper);
        this.f27852a = new WeakReference<>(aVar);
    }
}
