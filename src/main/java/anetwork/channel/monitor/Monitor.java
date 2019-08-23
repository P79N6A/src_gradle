package anetwork.channel.monitor;

import android.content.Context;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.a;
import anet.channel.monitor.b;
import anet.channel.monitor.f;
import anet.channel.util.ALog;
import anetwork.channel.monitor.speed.NetworkSpeed;
import java.util.concurrent.atomic.AtomicBoolean;

public class Monitor {
    static AtomicBoolean isInit = new AtomicBoolean(false);

    public static double getNetSpeedValue() {
        return b.a().c();
    }

    @Deprecated
    public static NetworkSpeed getNetworkSpeed() {
        return NetworkSpeed.valueOfCode(getNetSpeed().getCode());
    }

    public static anet.channel.monitor.NetworkSpeed getNetSpeed() {
        anet.channel.monitor.NetworkSpeed networkSpeed = anet.channel.monitor.NetworkSpeed.Fast;
        try {
            return anet.channel.monitor.NetworkSpeed.valueOfCode(b.a().b());
        } catch (Throwable th) {
            ALog.e("anet.Monitor", "getNetworkSpeed failed", null, th, new Object[0]);
            return networkSpeed;
        }
    }

    public static synchronized void init() {
        synchronized (Monitor.class) {
            if (isInit.compareAndSet(false, true)) {
                b.a().d();
            }
        }
    }

    public static void start() {
        try {
            b.a().d();
        } catch (Throwable th) {
            ALog.e("anet.Monitor", "start failed", null, th, new Object[0]);
        }
    }

    public static void stop() {
        try {
            b.a().e();
        } catch (Throwable th) {
            ALog.e("anet.Monitor", "stop failed", null, th, new Object[0]);
        }
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        addListener(iNetworkQualityChangeListener, null);
    }

    public static void removeListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        a.a().a(iNetworkQualityChangeListener);
    }

    @Deprecated
    public static synchronized void init(Context context) {
        synchronized (Monitor.class) {
            init();
        }
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener, f fVar) {
        a.a().a(iNetworkQualityChangeListener, fVar);
    }
}
