package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@Monitor(module = "networkPrefer", monitorPoint = "network")
public class RequestStatistic extends StatObject {
    @Dimension
    public float accuracy = -1.0f;
    @Dimension
    public volatile String bizId;
    @Dimension
    public volatile String bssid;
    @Measure
    public volatile long cacheTime;
    @Measure
    public volatile long callbackTime;
    @Measure
    public volatile long connWaitTime;
    @Dimension
    public volatile String contentEncoding;
    public volatile long contentLength = 0;
    @Dimension
    public volatile String contentType;
    @Dimension
    public volatile int degraded;
    @Dimension
    public volatile StringBuilder errorTrace;
    @Dimension
    public JSONObject extra;
    @Dimension
    public volatile String f_refer;
    @Measure
    public volatile long firstDataTime;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String ip;
    @Dimension
    public volatile int ipRefer;
    @Dimension
    public volatile int ipType = 1;
    @Dimension
    public volatile String isBg = "";
    @Dimension
    public volatile boolean isDNS;
    public final AtomicBoolean isDone = new AtomicBoolean(false);
    @Dimension
    public volatile boolean isProxy;
    @Dimension
    public volatile boolean isSSL;
    @Measure
    public volatile long lastProcessTime;
    @Dimension
    public double lat = 90000.0d;
    @Dimension
    public double lng = 90000.0d;
    @Dimension
    public String mnc = PushConstants.PUSH_TYPE_NOTIFY;
    @Dimension(name = "errorMsg")
    public volatile String msg = "";
    @Dimension
    public volatile String netType = "";
    @Measure(max = 60000.0d)
    public volatile long oneWayTime;
    @Dimension
    public volatile int port;
    @Measure
    public volatile long processTime;
    @Dimension
    public volatile String protocolType;
    @Dimension
    public volatile String proxyType = "";
    @Measure
    public volatile long recDataSize;
    @Measure
    public volatile long recDataTime;
    @Measure
    public volatile long reqBodyDeflateSize;
    @Measure
    public volatile long reqBodyInflateSize;
    @Measure
    public volatile long reqHeadDeflateSize;
    @Measure
    public volatile long reqHeadInflateSize;
    public volatile long reqStart = 0;
    @Dimension
    public volatile int ret;
    @Measure
    public volatile long retryCostTime;
    @Dimension
    public volatile int retryTimes;
    @Dimension
    public int roaming;
    @Measure
    public volatile long rspBodyDeflateSize;
    @Measure
    public volatile long rspBodyInflateSize;
    public volatile long rspEnd = 0;
    @Measure
    public volatile long rspHeadDeflateSize;
    @Measure
    public volatile long rspHeadInflateSize;
    public volatile long rspStart = 0;
    @Measure
    public volatile long sendBeforeTime;
    @Measure
    public volatile long sendDataSize;
    @Measure
    public volatile long sendDataTime;
    public volatile long sendEnd = 0;
    public volatile long sendStart = 0;
    @Measure
    public volatile long serverRT;
    public volatile boolean spdyRequestSend = false;
    public volatile long start = 0;
    @Dimension(name = "errorCode")
    public volatile int statusCode;
    public volatile int tnetErrorCode = 0;
    @Dimension
    public String unit;
    @Dimension(name = "URL")
    public volatile String url;
    @Deprecated
    public volatile long waitingTime;

    public boolean beforeCommit() {
        if (this.statusCode != -200) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("[RequestStatistic]ret=");
        sb.append(this.ret);
        sb.append(",statusCode=");
        sb.append(this.statusCode);
        sb.append(",msg=");
        sb.append(this.msg);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",ip=");
        sb.append(this.ip);
        sb.append(",port=");
        sb.append(this.port);
        sb.append(",protocolType=");
        sb.append(this.protocolType);
        sb.append(",retryTime=");
        sb.append(this.retryTimes);
        sb.append(",retryCostTime=");
        sb.append(this.retryCostTime);
        sb.append(",processTime=");
        sb.append(this.processTime);
        sb.append(",connWaitTime=");
        sb.append(this.connWaitTime);
        sb.append(",cacheTime=");
        sb.append(this.cacheTime);
        sb.append(",sendDataTime=");
        sb.append(this.sendDataTime);
        sb.append(",firstDataTime=");
        sb.append(this.firstDataTime);
        sb.append(",recDataTime=");
        sb.append(this.recDataTime);
        sb.append(",lastProcessTime=");
        sb.append(this.lastProcessTime);
        sb.append(",oneWayTime=");
        sb.append(this.oneWayTime);
        sb.append(",callbackTime=");
        sb.append(this.callbackTime);
        sb.append(",serverRT=");
        sb.append(this.serverRT);
        sb.append(",sendSize=");
        sb.append(this.sendDataSize);
        sb.append(",recDataSize=");
        sb.append(this.recDataSize);
        sb.append(",originalDataSize=");
        sb.append(this.rspBodyDeflateSize);
        if (this.extra != null) {
            sb.append(",extra=");
            sb.append(this.extra.toString());
        }
        sb.append(",url=");
        sb.append(this.url);
        return sb.toString();
    }

    public void setConnType(ConnType connType) {
        this.isSSL = connType.isSSL();
        this.protocolType = connType.toString();
    }

    public void appendErrorTrace(String str) {
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        if (this.errorTrace.length() != 0) {
            this.errorTrace.append(",");
        }
        StringBuilder sb = this.errorTrace;
        sb.append(str);
        sb.append("=");
        sb.append(System.currentTimeMillis() - this.reqStart);
    }

    public void setIpInfo(int i, int i2) {
        this.ipRefer = i;
        this.ipType = i2;
    }

    public void putExtra(String str, Object obj) {
        try {
            if (this.extra == null) {
                this.extra = new JSONObject();
            }
            this.extra.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    public void recordRedirect(int i, String str) {
        this.url = str;
        appendErrorTrace(String.valueOf(i));
        long currentTimeMillis = System.currentTimeMillis();
        this.retryCostTime += currentTimeMillis - this.start;
        this.start = currentTimeMillis;
    }

    public void setIPAndPort(String str, int i) {
        this.ip = str;
        this.port = i;
        if (str != null) {
            this.isDNS = true;
        }
        if (this.retryTimes == 0 && str != null) {
            putExtra("firstIp", str);
        }
    }

    public RequestStatistic(String str, String str2) {
        String str3;
        this.host = str;
        this.proxyType = NetworkStatusHelper.getProxyType();
        this.isProxy = !this.proxyType.isEmpty();
        this.netType = NetworkStatusHelper.getNetworkSubType();
        this.bssid = NetworkStatusHelper.getWifiBSSID();
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            str3 = "bg";
        } else {
            str3 = "fg";
        }
        this.isBg = str3;
        this.roaming = NetworkStatusHelper.isRoaming() ? 1 : 0;
        this.mnc = NetworkStatusHelper.getSimOp();
        this.bizId = str2;
    }
}
