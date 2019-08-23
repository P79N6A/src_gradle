package com.bytedance.common.httpdns;

import android.content.Context;
import com.bytedance.common.utility.concurrent.TTExecutors;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class HttpDns implements HttpDnsService {
    private static DegradationFilter degradationFilter;
    static HttpDns instance;
    private final String account;
    private final Context context;
    private final HostManager hostManager;
    private boolean isExpiredIPEnabled;
    private ConcurrentHashMap<String, Future<DnsRecord>> resolveingMap = new ConcurrentHashMap<>();
    private final long ttl;

    public void setPreResolveAfterNetworkChanged(boolean z) {
    }

    public static HttpDnsService inst() {
        return instance;
    }

    public void clear() {
        if (this.hostManager != null) {
            this.hostManager.clear();
        }
    }

    public void setDegradationFilter(DegradationFilter degradationFilter2) {
        degradationFilter = degradationFilter2;
    }

    public void setExpiredIPEnabled(boolean z) {
        this.isExpiredIPEnabled = z;
    }

    public void setLogEnabled(boolean z) {
        LogUtil.setLogEnabled(z);
    }

    public List<InetAddress> getAddrsByHostAsync(String str) {
        DnsRecord byHostAsync = getByHostAsync(str);
        if (byHostAsync != null) {
            return byHostAsync.getAddrList();
        }
        return null;
    }

    public String getIpByHost(String str) {
        String[] ipsByHost = getIpsByHost(str);
        if (ipsByHost.length > 0) {
            return ipsByHost[0];
        }
        return null;
    }

    public String getIpByHostAsync(String str) {
        String[] ipsByHostAsync = getIpsByHostAsync(str);
        if (ipsByHostAsync.length > 0) {
            return ipsByHostAsync[0];
        }
        return null;
    }

    public String[] getIpsByHost(String str) {
        DnsRecord byHost = getByHost(str, -1);
        if (byHost != null) {
            return byHost.getIpList();
        }
        return null;
    }

    public String[] getIpsByHostAsync(String str) {
        DnsRecord byHostAsync = getByHostAsync(str);
        if (byHostAsync != null) {
            return byHostAsync.getIpList();
        }
        return null;
    }

    public void setPreResolveHosts(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!this.hostManager.isResolving(str)) {
                submitResolve(str);
            }
        }
    }

    private Future<DnsRecord> submitResolve(String str) {
        try {
            ExecutorService normalExecutor = TTExecutors.getNormalExecutor();
            ResolveCall resolveCall = new ResolveCall(str, this.context, this.account, this.hostManager, this.ttl);
            Future<DnsRecord> submit = normalExecutor.submit(resolveCall);
            this.hostManager.addResolve(str);
            this.resolveingMap.put(str, submit);
            return submit;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    private DnsRecord getByHostAsync(String str) {
        if (!Utils.isValidHost(str) || Utils.isNumericAddress(str)) {
            return null;
        }
        if ((degradationFilter != null && degradationFilter.shouldDegradeHttpDNS(str)) || !Utils.isWifiOrMobile(this.context)) {
            return null;
        }
        DnsRecord record = this.hostManager.getRecord(str);
        if (record != null) {
            boolean isExpired = record.isExpired();
            LogUtil.d("refresh host sync: " + str + " expired: " + isExpired);
        }
        if ((record == null || record.isExpired()) && !this.hostManager.isResolving(str)) {
            submitResolve(str);
        }
        if (record == null || (record.isExpired() && (!record.isExpired() || !this.isExpiredIPEnabled))) {
            return null;
        }
        return record;
    }

    public List<InetAddress> getAddrsByHost(String str, long j) {
        DnsRecord byHost = getByHost(str, j);
        if (byHost != null) {
            return byHost.getAddrList();
        }
        return null;
    }

    private DnsRecord getByHost(String str, long j) {
        DnsRecord dnsRecord;
        if (!Utils.isValidHost(str) || Utils.isNumericAddress(str)) {
            return null;
        }
        if ((degradationFilter != null && degradationFilter.shouldDegradeHttpDNS(str)) || !Utils.isWifiOrMobile(this.context)) {
            return null;
        }
        DnsRecord record = this.hostManager.getRecord(str);
        if (record == null || !record.isExpired() || !this.isExpiredIPEnabled) {
            if (record != null) {
                boolean isExpired = record.isExpired();
                LogUtil.d("refresh host sync: " + str + " expired: " + isExpired);
            }
            if (record != null && !record.isExpired()) {
                return record;
            }
            try {
                Future<DnsRecord> future = this.resolveingMap.get(str);
                if (future == null) {
                    LogUtil.d(str + " future not exist");
                    future = submitResolve(str);
                } else {
                    LogUtil.d(str + " future exist");
                }
                if (j > 0) {
                    dnsRecord = future.get(j, TimeUnit.MILLISECONDS);
                } else {
                    dnsRecord = future.get();
                }
                this.resolveingMap.remove(str);
                return dnsRecord;
            } catch (Exception e2) {
                LogUtil.a(e2);
                return null;
            }
        } else {
            if (!this.hostManager.isResolving(str)) {
                LogUtil.d("refresh host async as expired: " + str);
                submitResolve(str);
            }
            return record;
        }
    }

    private HttpDns(Context context2, String str, long j, boolean z) {
        this.context = context2;
        this.account = str;
        this.hostManager = new HostManager(context2, z);
        if (j > 300) {
            this.ttl = j;
        } else {
            this.ttl = 300;
        }
    }

    public static HttpDnsService getService(Context context2, String str, long j, boolean z) {
        if (instance == null) {
            synchronized (HttpDns.class) {
                if (instance == null) {
                    HttpDns httpDns = new HttpDns(context2.getApplicationContext(), str, j, z);
                    instance = httpDns;
                }
            }
        }
        return instance;
    }
}
