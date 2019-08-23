package com.bytedance.common.httpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class HostManager {
    private Context context;
    public ConcurrentMap<String, DnsRecord> hostMap = new ConcurrentHashMap();
    private boolean isNeedRefetchOnExpire;
    public String lastBSSID;
    public int lastNet = -2;
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int netType = Utils.getNetType(context);
                boolean z = false;
                String str = null;
                if (netType == 1) {
                    HostManager.this.stopMap(HostManager.this.hostMap);
                    str = Utils.getBSSID(context);
                    if (str != null && !str.equals(HostManager.this.lastBSSID)) {
                        HostManager.this.reFetchMap(HostManager.this.wifiHostMap);
                        HostManager.this.wifiHostMap.clear();
                        HostManager.this.lastBSSID = str;
                        z = true;
                    }
                    if (!z && HostManager.this.lastNet != netType) {
                        HostManager.this.reFetchMap(HostManager.this.wifiHostMap);
                    }
                }
                LogUtil.d("connectivity change: " + netType + " clear: " + z + ", bssid:" + str);
                if (Utils.isWifiOrMobile(context)) {
                    HostManager.this.stopMap(HostManager.this.wifiHostMap);
                    if (HostManager.this.lastNet != netType) {
                        HostManager.this.reFetchMap(HostManager.this.hostMap);
                    }
                }
                HostManager.this.lastNet = netType;
            }
        }
    };
    private ConcurrentSkipListSet<String> resolvingSet = new ConcurrentSkipListSet<>();
    public ConcurrentMap<String, DnsRecord> wifiHostMap = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    public boolean isNeedRefetchOnExpire() {
        return this.isNeedRefetchOnExpire;
    }

    /* access modifiers changed from: package-private */
    public int getRecordSize() {
        return this.hostMap.size();
    }

    private ConcurrentMap<String, DnsRecord> getCurrentMap() {
        if (Utils.getNetType(this.context) == 0) {
            return this.hostMap;
        }
        return this.wifiHostMap;
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        stopMap(this.hostMap);
        this.hostMap.clear();
        stopMap(this.wifiHostMap);
        this.wifiHostMap.clear();
        this.resolvingSet.clear();
    }

    /* access modifiers changed from: package-private */
    public void addResolve(String str) {
        this.resolvingSet.add(str);
    }

    /* access modifiers changed from: package-private */
    public boolean isResolving(String str) {
        return this.resolvingSet.contains(str);
    }

    /* access modifiers changed from: package-private */
    public void removeResolve(String str) {
        this.resolvingSet.remove(str);
    }

    /* access modifiers changed from: package-private */
    public DnsRecord getRecord(String str) {
        return (DnsRecord) getCurrentMap().get(str);
    }

    /* access modifiers changed from: package-private */
    public void reFetchMap(Map<String, DnsRecord> map) {
        if (!(map == null || map == null)) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    HttpDnsService inst = HttpDns.inst();
                    if (inst != null) {
                        ((DnsRecord) next.getValue()).removeExpireMessage();
                        inst.getAddrsByHostAsync((String) next.getKey());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void stopMap(Map<String, DnsRecord> map) {
        if (!(map == null || map == null)) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    if (next != null) {
                        ((DnsRecord) next.getValue()).removeExpireMessage();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addRecord(String str, DnsRecord dnsRecord) {
        try {
            DnsRecord dnsRecord2 = (DnsRecord) getCurrentMap().get(str);
            if (dnsRecord2 != null) {
                dnsRecord2.removeExpireMessage();
            }
        } catch (Throwable unused) {
        }
        getCurrentMap().put(str, dnsRecord);
    }

    HostManager(Context context2, boolean z) {
        this.context = context2;
        this.isNeedRefetchOnExpire = z;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context2.registerReceiver(this.receiver, intentFilter);
    }
}
