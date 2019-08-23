package com.bytedance.common.httpdns;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class DnsRecord {
    private List<InetAddress> addrList;
    private long fetchTime;
    public String host;
    private String[] ipList;
    private Handler mHandler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && message.what == 0) {
                LogUtil.d("get MSG_EXPIRE for " + DnsRecord.this.host);
                HttpDnsService inst = HttpDns.inst();
                if (inst != null) {
                    inst.getAddrsByHostAsync(DnsRecord.this.host);
                }
            }
        }
    };
    private long ttl;

    /* access modifiers changed from: package-private */
    public List<InetAddress> getAddrList() {
        return this.addrList;
    }

    /* access modifiers changed from: package-private */
    public long getFetchTime() {
        return this.fetchTime;
    }

    /* access modifiers changed from: package-private */
    public String[] getIpList() {
        return this.ipList;
    }

    /* access modifiers changed from: package-private */
    public long getTtl() {
        return this.ttl;
    }

    /* access modifiers changed from: package-private */
    public void removeExpireMessage() {
        this.mHandler.removeMessages(0);
    }

    /* access modifiers changed from: package-private */
    public boolean isExpired() {
        if (getFetchTime() + getTtl() >= System.currentTimeMillis() / 1000) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = "host: " + this.host + " ip cnt: " + this.ipList.length + " ttl: " + this.ttl;
        for (int i = 0; i < this.ipList.length; i++) {
            str = str + "\n ip: " + this.ipList[i];
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public void setExpireMessage(boolean z) {
        this.mHandler.removeMessages(0);
        if (z) {
            this.mHandler.sendEmptyMessageDelayed(0, getTtl() * 1000);
        }
    }

    DnsRecord(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.host = jSONObject.getString("host");
            JSONArray jSONArray = jSONObject.getJSONArray("ips");
            int length = jSONArray.length();
            this.ipList = new String[length];
            this.addrList = new ArrayList();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                this.ipList[i] = string;
                if (Utils.isNumericAddress(string)) {
                    this.addrList.add(InetAddress.getByAddress(this.host, InetAddress.getByName(string).getAddress()));
                }
            }
            this.ttl = jSONObject.getLong("ttl");
            this.fetchTime = System.currentTimeMillis() / 1000;
            setExpireMessage(z);
        } catch (Exception e2) {
            LogUtil.a(e2);
        }
    }

    DnsRecord(String str, long j, boolean z) {
        this.host = str;
        this.ttl = j;
        this.fetchTime = System.currentTimeMillis() / 1000;
        setExpireMessage(z);
    }
}
