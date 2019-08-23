package anet.channel.entity;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.ConnProtocol;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.HashMap;
import java.util.Map;

public class ConnType {
    public static ConnType HTTP = new ConnType("http");
    public static ConnType HTTPS = new ConnType("https");
    private static Map<ConnProtocol, ConnType> connTypeMap = new HashMap();
    private String name = "";
    private String publicKey;
    private int spdyProtocol;

    @Deprecated
    public enum TypeLevel {
        SPDY,
        HTTP
    }

    public int getTnetConType() {
        return this.spdyProtocol;
    }

    public String toString() {
        return this.name;
    }

    @Deprecated
    public TypeLevel getTypeLevel() {
        if (isHttpType()) {
            return TypeLevel.HTTP;
        }
        return TypeLevel.SPDY;
    }

    public boolean isH2S() {
        if (this.spdyProtocol == 40) {
            return true;
        }
        return false;
    }

    public boolean isPublicKeyAuto() {
        return "auto".equals(this.publicKey);
    }

    public boolean isQuic() {
        if ((this.spdyProtocol & 4) != 0) {
            return true;
        }
        return false;
    }

    private int getPriority() {
        if ((this.spdyProtocol & 8) != 0) {
            return 0;
        }
        if ((this.spdyProtocol & 2) != 0) {
            return 1;
        }
        return 2;
    }

    public int getType() {
        if (equals(HTTP) || equals(HTTPS)) {
            return c.f1212b;
        }
        return c.f1211a;
    }

    public boolean isHttpType() {
        if (equals(HTTP) || equals(HTTPS)) {
            return true;
        }
        return false;
    }

    public boolean isSSL() {
        if ((this.spdyProtocol & SearchJediMixFeedAdapter.f42517f) != 0 || (this.spdyProtocol & 32) != 0 || this.spdyProtocol == 12 || equals(HTTPS)) {
            return true;
        }
        return false;
    }

    private ConnType(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ConnType)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.name.equals(((ConnType) obj).name);
    }

    public int getTnetPublicKey(boolean z) {
        if ("cdn".equals(this.publicKey)) {
            return 1;
        }
        if (GlobalAppRuntimeInfo.getEnv() == ENV.TEST) {
            return 0;
        }
        if ("open".equals(this.publicKey)) {
            if (z) {
                return 11;
            }
            return 10;
        } else if (!"acs".equals(this.publicKey)) {
            return -1;
        } else {
            if (z) {
                return 4;
            }
            return 3;
        }
    }

    public static ConnType valueOf(ConnProtocol connProtocol) {
        if (connProtocol == null) {
            return null;
        }
        if ("http".equalsIgnoreCase(connProtocol.protocol)) {
            return HTTP;
        }
        if ("https".equalsIgnoreCase(connProtocol.protocol)) {
            return HTTPS;
        }
        synchronized (connTypeMap) {
            if (connTypeMap.containsKey(connProtocol)) {
                ConnType connType = connTypeMap.get(connProtocol);
                return connType;
            }
            ConnType connType2 = new ConnType(connProtocol.toString());
            connType2.publicKey = connProtocol.publicKey;
            if ("http2".equalsIgnoreCase(connProtocol.protocol)) {
                connType2.spdyProtocol |= 8;
            } else if ("spdy".equalsIgnoreCase(connProtocol.protocol)) {
                connType2.spdyProtocol |= 2;
            } else if ("h2s".equals(connProtocol.protocol)) {
                connType2.spdyProtocol = 40;
            } else if ("quic".equalsIgnoreCase(connProtocol.protocol)) {
                connType2.spdyProtocol = 12;
            } else if ("quicplain".equalsIgnoreCase(connProtocol.protocol)) {
                connType2.spdyProtocol = 32780;
            }
            if (connType2.spdyProtocol == 0) {
                return null;
            }
            if (!TextUtils.isEmpty(connProtocol.publicKey)) {
                connType2.spdyProtocol |= SearchJediMixFeedAdapter.f42517f;
                if ("1rtt".equalsIgnoreCase(connProtocol.rtt)) {
                    connType2.spdyProtocol |= 8192;
                } else if (!"0rtt".equalsIgnoreCase(connProtocol.rtt)) {
                    return null;
                } else {
                    connType2.spdyProtocol |= 4096;
                }
            }
            connTypeMap.put(connProtocol, connType2);
            return connType2;
        }
    }

    public static int compare(ConnType connType, ConnType connType2) {
        return connType.getPriority() - connType2.getPriority();
    }
}
