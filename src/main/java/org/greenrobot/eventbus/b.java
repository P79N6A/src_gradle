package org.greenrobot.eventbus;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.logging.Level;

public final class b implements Runnable, l {

    /* renamed from: a  reason: collision with root package name */
    private final k f84091a = new k();

    /* renamed from: b  reason: collision with root package name */
    private final c f84092b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f84093c;

    public final void run() {
        while (true) {
            try {
                j a2 = this.f84091a.a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                if (a2 == null) {
                    synchronized (this) {
                        a2 = this.f84091a.a();
                        if (a2 == null) {
                            this.f84093c = false;
                            this.f84093c = false;
                            return;
                        }
                    }
                }
                this.f84092b.a(a2);
            } catch (InterruptedException e2) {
                try {
                    g gVar = this.f84092b.f84099d;
                    Level level = Level.WARNING;
                    gVar.a(level, Thread.currentThread().getName() + " was interruppted", e2);
                    return;
                } finally {
                    this.f84093c = false;
                }
            }
        }
    }

    b(c cVar) {
        this.f84092b = cVar;
    }

    public final void a(p pVar, Object obj) {
        j a2 = j.a(pVar, obj);
        synchronized (this) {
            this.f84091a.a(a2);
            if (!this.f84093c) {
                this.f84093c = true;
                this.f84092b.f84098c.execute(this);
            }
        }
    }
}
