package com.bytedance.common.httpdns;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public interface HttpDnsService {
    void clear();

    List<InetAddress> getAddrsByHost(String str, long j);

    List<InetAddress> getAddrsByHostAsync(String str);

    String getIpByHost(String str);

    String getIpByHostAsync(String str);

    String[] getIpsByHost(String str);

    String[] getIpsByHostAsync(String str);

    void setDegradationFilter(DegradationFilter degradationFilter);

    void setExpiredIPEnabled(boolean z);

    void setLogEnabled(boolean z);

    void setPreResolveAfterNetworkChanged(boolean z);

    void setPreResolveHosts(ArrayList<String> arrayList);
}
