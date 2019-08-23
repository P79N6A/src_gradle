package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.utl.BaseMonitor;

@Monitor(module = "accs", monitorPoint = "netperformance")
public class NetPerformanceMonitor extends BaseMonitor {

    /* renamed from: a  reason: collision with root package name */
    private long f79073a;
    @Dimension
    public int accs_sdk_version;
    @Dimension
    public int accs_type;

    /* renamed from: b  reason: collision with root package name */
    private long f79074b;

    /* renamed from: c  reason: collision with root package name */
    private long f79075c;

    /* renamed from: d  reason: collision with root package name */
    private long f79076d;
    public String data_id;
    public String device_id;

    /* renamed from: e  reason: collision with root package name */
    private long f79077e;
    @Dimension
    public int error_code;

    /* renamed from: f  reason: collision with root package name */
    private long f79078f;
    @Dimension
    public String fail_reasons;
    private long g;
    @Dimension
    public String host;
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long in_queue_time;
    @Dimension
    public int msgType;
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long receive_accs_to_call_time;
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long receive_agoo_to_call_time;
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long receive_to_call_back_time;
    @Dimension
    public String ret;
    @Dimension
    public int retry_times;
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long send_to_receive_time;
    @Dimension
    public String service_id = "none";
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long start_to_enter_queue_time;
    public long take_date;
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long talk_to_send_time;
    public long to_tnet_date;
    @Measure(constantValue = 0.0d, max = 60000.0d, min = 0.0d)
    public long total_time;

    private long a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0;
        }
        return j2 - j;
    }

    public void onEnterQueueData() {
        this.f79074b = System.currentTimeMillis();
    }

    public void onRecAck() {
        this.f79075c = System.currentTimeMillis();
    }

    public void onReceiveData() {
        this.f79077e = System.currentTimeMillis();
    }

    public void onSend() {
        this.f79073a = System.currentTimeMillis();
    }

    public void onSendData() {
        this.to_tnet_date = System.currentTimeMillis();
    }

    public void onTakeFromQueue() {
        this.take_date = System.currentTimeMillis();
    }

    public void onToAccsTime() {
        this.f79078f = System.currentTimeMillis();
    }

    public void onToAgooTime() {
        this.g = System.currentTimeMillis();
    }

    public void onToBizDate() {
        this.f79076d = System.currentTimeMillis();
    }

    public boolean beforeCommit() {
        this.accs_sdk_version = 221;
        this.total_time = a(this.f79073a, this.f79076d);
        this.start_to_enter_queue_time = a(this.f79073a, this.f79074b);
        this.in_queue_time = a(this.f79074b, this.take_date);
        this.talk_to_send_time = a(this.take_date, this.to_tnet_date);
        this.send_to_receive_time = a(this.to_tnet_date, this.f79075c);
        this.receive_to_call_back_time = a(this.f79075c, this.f79076d);
        this.receive_accs_to_call_time = a(this.f79077e, this.f79078f);
        this.receive_agoo_to_call_time = a(this.f79077e, this.g);
        return super.beforeCommit();
    }

    public void setConnType(int i) {
        this.accs_type = i;
    }

    public void setDataId(String str) {
        this.data_id = str;
    }

    public void setDeviceId(String str) {
        this.device_id = str;
    }

    public void setFailReason(String str) {
        this.fail_reasons = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setServiceId(String str) {
        this.service_id = str;
    }

    public void setRet(boolean z) {
        String str;
        if (z) {
            str = "y";
        } else {
            str = "n";
        }
        this.ret = str;
    }

    public void setFailReason(int i) {
        this.error_code = i;
        if (i == 200) {
            return;
        }
        if (i != 300) {
            switch (i) {
                case -4:
                    setFailReason("msg too large");
                    return;
                case -3:
                    setFailReason("service not available");
                    return;
                case -2:
                    setFailReason("param error");
                    return;
                case -1:
                    setFailReason("network fail");
                    return;
                default:
                    setFailReason(String.valueOf(i));
                    return;
            }
        } else {
            setFailReason("app not bind");
        }
    }
}
