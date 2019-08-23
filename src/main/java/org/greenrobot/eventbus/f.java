package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

public final class f extends Handler implements l {

    /* renamed from: a  reason: collision with root package name */
    private final k f84114a = new k();

    /* renamed from: b  reason: collision with root package name */
    private final int f84115b = 10;

    /* renamed from: c  reason: collision with root package name */
    private final c f84116c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f84117d;

    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                j a2 = this.f84114a.a();
                if (a2 == null) {
                    synchronized (this) {
                        a2 = this.f84114a.a();
                        if (a2 == null) {
                            this.f84117d = false;
                            this.f84117d = false;
                            return;
                        }
                    }
                }
                this.f84116c.a(a2);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f84115b));
            if (sendMessage(obtainMessage())) {
                this.f84117d = true;
                return;
            }
            throw new e("Could not send handler message");
        } catch (Throwable th) {
            this.f84117d = false;
            throw th;
        }
    }

    public final void a(p pVar, Object obj) {
        j a2 = j.a(pVar, obj);
        synchronized (this) {
            this.f84114a.a(a2);
            if (!this.f84117d) {
                this.f84117d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new e("Could not send handler message");
                }
            }
        }
    }

    protected f(c cVar, Looper looper, int i) {
        super(looper);
        this.f84116c = cVar;
    }
}
