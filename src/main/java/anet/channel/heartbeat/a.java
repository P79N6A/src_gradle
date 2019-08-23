package anet.channel.heartbeat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.util.concurrent.TimeUnit;

public class a implements IHeartbeat, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Session f1227a;

    /* renamed from: b  reason: collision with root package name */
    private volatile long f1228b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f1229c;

    /* renamed from: d  reason: collision with root package name */
    private long f1230d;

    a() {
    }

    public void reSchedule() {
        this.f1228b = System.currentTimeMillis() + this.f1230d;
    }

    public void stop() {
        if (this.f1227a != null) {
            ALog.i("awcn.DefaultHeartbeatImpl", "heartbeat stop", this.f1227a.p, "session", this.f1227a);
            this.f1229c = true;
        }
    }

    public void run() {
        if (!this.f1229c) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.f1228b - 1000) {
                a(this.f1228b - currentTimeMillis);
            } else if (!GlobalAppRuntimeInfo.isAppBackground()) {
                if (ALog.isPrintLog(1)) {
                    ALog.d("awcn.DefaultHeartbeatImpl", "heartbeat", this.f1227a.p, "session", this.f1227a);
                }
                this.f1227a.ping(true);
                a(this.f1230d);
            } else {
                ALog.e("awcn.DefaultHeartbeatImpl", "close session in background", this.f1227a.p, "session", this.f1227a);
                this.f1227a.close(false);
            }
        }
    }

    private void a(long j) {
        try {
            this.f1228b = System.currentTimeMillis() + j;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            ALog.e("awcn.DefaultHeartbeatImpl", "Submit heartbeat task failed.", this.f1227a.p, e2, new Object[0]);
        }
    }

    public void start(Session session) {
        if (session != null) {
            this.f1227a = session;
            this.f1230d = (long) session.getConnStrategy().getHeartbeat();
            if (this.f1230d <= 0) {
                this.f1230d = 45000;
            }
            ALog.i("awcn.DefaultHeartbeatImpl", "heartbeat start", session.p, "session", session, "interval", Long.valueOf(this.f1230d));
            a(this.f1230d);
            return;
        }
        throw new NullPointerException("session is null");
    }
}
