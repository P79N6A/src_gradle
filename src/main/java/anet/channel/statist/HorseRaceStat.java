package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.l;

@Monitor(module = "networkPrefer", monitorPoint = "horseRace")
public class HorseRaceStat extends StatObject {
    @Dimension
    public volatile String bssid = NetworkStatusHelper.getWifiBSSID();
    @Dimension
    public volatile int connErrorCode;
    @Dimension
    public volatile int connRet;
    @Measure
    public volatile long connTime;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String ip;
    @Dimension
    public volatile String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public volatile String nettype = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public volatile String path;
    @Dimension
    public volatile int port;
    @Dimension
    public volatile String protocol;
    @Dimension
    public volatile int reqErrorCode;
    @Dimension
    public volatile int reqRet;
    @Measure
    public volatile long reqTime;

    public HorseRaceStat(String str, l.e eVar) {
        this.host = str;
        this.ip = eVar.f1412a;
        this.port = eVar.f1413b.f1392a;
        this.protocol = ConnProtocol.valueOf(eVar.f1413b).name;
        this.path = eVar.f1414c;
    }
}
