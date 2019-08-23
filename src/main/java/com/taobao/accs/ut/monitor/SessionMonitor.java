package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.utl.BaseMonitor;

@Monitor(module = "accs", monitorPoint = "session")
public class SessionMonitor extends BaseMonitor {

    /* renamed from: a  reason: collision with root package name */
    private long f79079a;
    @Measure(constantValue = 0.0d, max = 15000.0d, min = 0.0d)
    public long auth_time;

    /* renamed from: b  reason: collision with root package name */
    private long f79080b;
    @Dimension
    public int close_connection_type = 2;
    @Dimension
    public String close_reasons = "none";
    @Dimension
    public String connect_type = "none";
    public long connection_stop_date;
    @Dimension
    public int fail_reasons;
    @Dimension
    public boolean isProxy;
    @Measure(constantValue = 0.0d, max = 86400.0d, min = 0.0d)
    public long live_time;
    @Measure(constantValue = 0.0d)
    public int ping_rec_times;
    @Measure(constantValue = 0.0d)
    public int ping_send_times;
    @Dimension
    public boolean ret;
    @Dimension
    public int retry_times;
    @Dimension
    public String sdkv = "221";
    @Measure(constantValue = 0.0d, max = 15000.0d, min = 0.0d)
    public long ssl_time;
    @Measure(constantValue = 0.0d, max = 15000.0d, min = 0.0d)
    public long tcp_time;

    public String getCloseReason() {
        return this.close_reasons;
    }

    public long getConCloseDate() {
        return this.f79080b;
    }

    public long getConStopDate() {
        return this.connection_stop_date;
    }

    public boolean getRet() {
        return this.ret;
    }

    public void onCloseConnect() {
        this.f79080b = System.currentTimeMillis();
    }

    public void onConnectStop() {
        this.connection_stop_date = System.currentTimeMillis();
    }

    public void onPingCBReceive() {
        this.ping_rec_times++;
    }

    public void onSendPing() {
        this.ping_send_times++;
    }

    public void onStartConnect() {
        this.f79079a = System.currentTimeMillis();
    }

    public void setCloseReason(String str) {
        this.close_reasons = str;
    }

    public void setCloseType(int i) {
        this.close_connection_type = i;
    }

    public void setConnectType(String str) {
        this.connect_type = str;
    }

    public void setFailReason(int i) {
        this.fail_reasons = i;
    }

    public void setRet(boolean z) {
        this.ret = z;
    }

    public void setRetryTimes(int i) {
        this.retry_times = i;
    }
}
