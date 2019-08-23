package anet.channel.heartbeat;

import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

public class b implements IHeartbeat, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Session f1231a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f1232b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f1233c = System.currentTimeMillis();

    public void stop() {
        this.f1232b = true;
    }

    public void reSchedule() {
        this.f1233c = System.currentTimeMillis() + 45000;
    }

    public void run() {
        if (!this.f1232b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.f1233c - 1000) {
                ThreadPoolExecutorFactory.submitScheduledTask(this, this.f1233c - currentTimeMillis, TimeUnit.MILLISECONDS);
            } else {
                this.f1231a.close(false);
            }
        }
    }

    public void start(Session session) {
        if (session != null) {
            this.f1231a = session;
            this.f1233c = System.currentTimeMillis() + 45000;
            ThreadPoolExecutorFactory.submitScheduledTask(this, 45000, TimeUnit.MILLISECONDS);
            return;
        }
        throw new NullPointerException("session is null");
    }
}
