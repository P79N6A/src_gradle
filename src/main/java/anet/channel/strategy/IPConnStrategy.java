package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.l;
import java.io.Serializable;

public class IPConnStrategy implements IConnStrategy, Serializable {

    /* renamed from: a  reason: collision with root package name */
    volatile int f1317a = 1;

    /* renamed from: b  reason: collision with root package name */
    volatile int f1318b = 1;

    /* renamed from: c  reason: collision with root package name */
    transient boolean f1319c;
    public volatile int cto;
    public volatile int heartbeat;
    public final String ip;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;

    public int getConnectionTimeout() {
        return this.cto;
    }

    public int getHeartbeat() {
        return this.heartbeat;
    }

    public String getIp() {
        return this.ip;
    }

    public int getIpSource() {
        return this.f1318b;
    }

    public int getIpType() {
        return this.f1317a;
    }

    public int getPort() {
        return this.port;
    }

    public ConnProtocol getProtocol() {
        return this.protocol;
    }

    public int getReadTimeout() {
        return this.rto;
    }

    public int getRetryTimes() {
        return this.retry;
    }

    public int getUniqueId() {
        return hashCode();
    }

    public int hashCode() {
        return ((((this.ip.hashCode() + 527) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        sb.append(this.ip);
        if (this.f1317a == 0) {
            sb.append("(*)");
        }
        sb.append(' ');
        sb.append(this.port);
        sb.append(' ');
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IPConnStrategy)) {
            return false;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
        if (this.port != iPConnStrategy.port || !this.ip.equals(iPConnStrategy.ip) || !this.protocol.equals(iPConnStrategy.protocol)) {
            return false;
        }
        return true;
    }

    static IPConnStrategy a(String str, l.a aVar) {
        ConnProtocol valueOf = ConnProtocol.valueOf(aVar);
        if (valueOf == null) {
            return null;
        }
        return a(str, aVar.f1392a, valueOf, aVar.f1394c, aVar.f1395d, aVar.f1396e, aVar.f1397f);
    }

    private IPConnStrategy(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5) {
        this.ip = str;
        this.port = i;
        this.protocol = connProtocol;
        this.cto = i2;
        this.rto = i3;
        this.retry = i4;
        this.heartbeat = i5;
    }

    static IPConnStrategy a(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5) {
        if (TextUtils.isEmpty(str) || connProtocol == null || i <= 0) {
            return null;
        }
        IPConnStrategy iPConnStrategy = new IPConnStrategy(str, i, connProtocol, i2, i3, i4, i5);
        return iPConnStrategy;
    }
}
