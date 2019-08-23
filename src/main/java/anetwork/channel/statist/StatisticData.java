package anetwork.channel.statist;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.StringUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Serializable;

public class StatisticData implements Serializable, Cloneable {
    private static final long serialVersionUID = -3538602124202475612L;
    @Deprecated
    public String api_v = "";
    public long cacheTime;
    public String connectionType = "";
    public long dataSpeed;
    @Deprecated
    public int dnsTime;
    public long firstDataTime;
    public String host = "";
    public String ip_port = "";
    @Deprecated
    public int isDNSTimeout;
    public boolean isRequestSuccess;
    public boolean isSSL;
    @Deprecated
    public boolean isSpdy;
    public String netStatSum;
    @Deprecated
    public long netTime;
    @Deprecated
    public long oneWayTime_AEngine;
    public long oneWayTime_ANet;
    @Deprecated
    public long oneWayTime_Jni;
    public long postBodyTime;
    public long processTime;
    public long recDataTime;
    @Deprecated
    public long receiveDataTime;
    @Deprecated
    public int redirectTime;
    @Deprecated
    public long responseBodySize;
    public int resultCode;
    public int retryTime;
    public long rtt;
    public long sendBeforeTime;
    public long sendSize;
    public long serverRT;
    @Deprecated
    public long spdyWaitTime;
    @Deprecated
    public long tcpConnTime;
    @Deprecated
    public long tcpLinkDate;
    @Deprecated
    public String timeoutType = "";
    public long totalSize;

    public String toString() {
        if (StringUtils.isBlank(this.netStatSum)) {
            this.netStatSum = sumNetStat();
        }
        return "StatisticData [" + this.netStatSum + "]";
    }

    public String sumNetStat() {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append("isSuccess=");
        sb.append(this.isRequestSuccess);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",resultCode=");
        sb.append(this.resultCode);
        sb.append(",connType=");
        sb.append(this.connectionType);
        sb.append(",oneWayTime_ANet=");
        sb.append(this.oneWayTime_ANet);
        sb.append(",ip_port=");
        sb.append(this.ip_port);
        sb.append(",isSSL=");
        sb.append(this.isSSL);
        sb.append(",cacheTime=");
        sb.append(this.cacheTime);
        sb.append(",processTime=");
        sb.append(this.processTime);
        sb.append(",sendBeforeTime=");
        sb.append(this.sendBeforeTime);
        sb.append(",postBodyTime=");
        sb.append(this.postBodyTime);
        sb.append(",firstDataTime=");
        sb.append(this.firstDataTime);
        sb.append(",recDataTime=");
        sb.append(this.recDataTime);
        sb.append(",serverRT=");
        sb.append(this.serverRT);
        sb.append(",rtt=");
        sb.append(this.rtt);
        sb.append(",sendSize=");
        sb.append(this.sendSize);
        sb.append(",totalSize=");
        sb.append(this.totalSize);
        sb.append(",dataSpeed=");
        sb.append(this.dataSpeed);
        sb.append(",retryTime=");
        sb.append(this.retryTime);
        return sb.toString();
    }

    public void filledBy(RequestStatistic requestStatistic) {
        boolean z;
        long j;
        if (requestStatistic != null) {
            this.resultCode = requestStatistic.statusCode;
            this.connectionType = requestStatistic.protocolType;
            if (requestStatistic.ret == 1) {
                z = true;
            } else {
                z = false;
            }
            this.isRequestSuccess = z;
            this.host = requestStatistic.host;
            if (!(requestStatistic.ip == null || requestStatistic.port == 0)) {
                this.ip_port = String.format("%s:%d", new Object[]{requestStatistic.ip, Integer.valueOf(requestStatistic.port)});
            }
            this.retryTime = requestStatistic.retryTimes;
            this.isSSL = requestStatistic.isSSL;
            this.oneWayTime_ANet = requestStatistic.oneWayTime;
            this.cacheTime = requestStatistic.cacheTime;
            this.processTime = requestStatistic.processTime;
            this.sendBeforeTime = requestStatistic.sendBeforeTime;
            this.firstDataTime = requestStatistic.firstDataTime;
            this.recDataTime = requestStatistic.recDataTime;
            this.sendSize = requestStatistic.sendDataSize;
            this.totalSize = requestStatistic.recDataSize;
            this.serverRT = requestStatistic.serverRT;
            if (this.recDataTime != 0) {
                j = this.totalSize / this.recDataTime;
            } else {
                j = this.totalSize;
            }
            this.dataSpeed = j;
        }
    }
}
