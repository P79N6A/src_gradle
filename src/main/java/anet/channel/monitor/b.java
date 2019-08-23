package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static int f1240a = 0;

    /* renamed from: b  reason: collision with root package name */
    static long f1241b = 0;

    /* renamed from: c  reason: collision with root package name */
    static long f1242c = 0;

    /* renamed from: d  reason: collision with root package name */
    static long f1243d = 0;

    /* renamed from: e  reason: collision with root package name */
    static long f1244e = 0;

    /* renamed from: f  reason: collision with root package name */
    static long f1245f = 0;
    static double g = 0.0d;
    static double h = 0.0d;
    static double i = 0.0d;
    static double j = 40.0d;
    private static volatile boolean k;
    /* access modifiers changed from: private */
    public int l;
    /* access modifiers changed from: private */
    public int m;
    /* access modifiers changed from: private */
    public e n;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static b f1246a = new b(null);

        a() {
        }
    }

    public void e() {
        k = false;
    }

    public static b a() {
        return a.f1246a;
    }

    public double c() {
        return i;
    }

    public int b() {
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            return 1;
        }
        return this.l;
    }

    private b() {
        this.l = 5;
        this.n = new e();
        NetworkStatusHelper.addStatusChangeListener(new c(this));
    }

    public synchronized void d() {
        try {
            ALog.i("awcn.BandWidthSampler", "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
            if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
                k = false;
            } else {
                k = true;
            }
        } catch (Exception e2) {
            ALog.w("awcn.BandWidthSampler", "startNetworkMeter fail.", null, e2, new Object[0]);
        }
    }

    /* synthetic */ b(c cVar) {
        this();
    }

    public void a(long j2, long j3, long j4) {
        if (k) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.BandWidthSampler", "onDataReceived", null, "mRequestStartTime", Long.valueOf(j2), "mRequestFinishedTime", Long.valueOf(j3), "mRequestDataSize", Long.valueOf(j4));
            }
            if (j4 > 3000 && j2 < j3) {
                d dVar = new d(this, j4, j3, j2);
                ThreadPoolExecutorFactory.submitScheduledTask(dVar);
            }
        }
    }
}
