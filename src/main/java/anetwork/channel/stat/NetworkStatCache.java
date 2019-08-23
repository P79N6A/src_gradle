package anetwork.channel.stat;

import anet.channel.util.StringUtils;
import anetwork.channel.statist.StatisticData;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class NetworkStatCache implements INetworkStat {
    private Map<String, String> lruCache;

    static class holder {
        public static NetworkStatCache instance = new NetworkStatCache();

        private holder() {
        }
    }

    public static NetworkStatCache getInstance() {
        return holder.instance;
    }

    private NetworkStatCache() {
        this.lruCache = Collections.synchronizedMap(new LinkedHashMap<String, String>() {
            /* access modifiers changed from: protected */
            public boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() > 100) {
                    return true;
                }
                return false;
            }
        });
    }

    public String get(String str) {
        return this.lruCache.get(str);
    }

    public void reset(String str) {
        if (this.lruCache.containsKey(str)) {
            this.lruCache.put(str, "{\"oneWayTime\" : 0, \"totalSize\" : 0}");
        }
    }

    public void put(String str, StatisticData statisticData) {
        if (!StringUtils.isBlank(str)) {
            StringBuilder sb = new StringBuilder(48);
            sb.append("{\"oneWayTime\" : ");
            sb.append(statisticData.oneWayTime_ANet);
            sb.append(", \"totalSize\" : ");
            sb.append(statisticData.totalSize);
            sb.append("}");
            this.lruCache.put(str, sb.toString());
        }
    }
}
