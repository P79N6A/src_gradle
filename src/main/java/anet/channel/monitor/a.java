package anet.channel.monitor;

import anet.channel.util.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f1237a;

    /* renamed from: b  reason: collision with root package name */
    private Map<INetworkQualityChangeListener, f> f1238b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private f f1239c = new f();

    private a() {
    }

    public static a a() {
        if (f1237a == null) {
            synchronized (a.class) {
                if (f1237a == null) {
                    f1237a = new a();
                }
            }
        }
        return f1237a;
    }

    public void a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        this.f1238b.remove(iNetworkQualityChangeListener);
    }

    public void a(double d2) {
        NetworkSpeed networkSpeed;
        for (Map.Entry next : this.f1238b.entrySet()) {
            INetworkQualityChangeListener iNetworkQualityChangeListener = (INetworkQualityChangeListener) next.getKey();
            f fVar = (f) next.getValue();
            if (!(iNetworkQualityChangeListener == null || fVar == null || fVar.b())) {
                boolean a2 = fVar.a(d2);
                if (fVar.f1258a != a2) {
                    fVar.f1258a = a2;
                    if (a2) {
                        networkSpeed = NetworkSpeed.Slow;
                    } else {
                        networkSpeed = NetworkSpeed.Fast;
                    }
                    iNetworkQualityChangeListener.onNetworkQualityChanged(networkSpeed);
                }
            }
        }
    }

    public void a(INetworkQualityChangeListener iNetworkQualityChangeListener, f fVar) {
        if (iNetworkQualityChangeListener == null) {
            ALog.e("BandWidthListenerHelp", "listener is null", null, new Object[0]);
        } else if (fVar == null) {
            this.f1239c.f1259b = System.currentTimeMillis();
            this.f1238b.put(iNetworkQualityChangeListener, this.f1239c);
        } else {
            fVar.f1259b = System.currentTimeMillis();
            this.f1238b.put(iNetworkQualityChangeListener, fVar);
        }
    }
}
