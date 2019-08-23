package anet.channel;

import android.content.Context;
import anet.channel.Config;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.e.a;
import anet.channel.entity.ENV;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anetwork.channel.aidl.adapter.d;
import anetwork.channel.config.NetworkConfigCenter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class TaobaoNetworkAdapter implements Serializable {
    public static AtomicBoolean isInited = new AtomicBoolean();

    public static void init(Context context, HashMap<String, Object> hashMap) {
        if (isInited.compareAndSet(false, true)) {
            ALog.setLog(new a());
            NetworkConfigCenter.setRemoteConfig(new anet.channel.c.a());
            AppMonitor.setInstance(new anet.channel.appmonitor.a());
            NetworkAnalysis.setInstance(new anet.channel.a.a());
            ThreadPoolExecutorFactory.submitPriorityTask(new h(), ThreadPoolExecutorFactory.Priority.NORMAL);
            if (hashMap != null) {
                try {
                    Integer num = (Integer) hashMap.get("outline");
                    if (num != null && num.intValue() == -1) {
                        ALog.e("awcn.TaobaoNetworkAdapter", "taobao speed mode enable.", null, new Object[0]);
                        GlobalAppRuntimeInfo.addBucketInfo("tbspeed", "speed");
                        if (NetworkConfigCenter.isRemoteNetworkServiceEnable()) {
                            d.a(context, false);
                        }
                        AwcnConfig.setAsyncLoadStrategyEnable(true);
                    }
                } catch (Exception unused) {
                }
            }
            if (hashMap != null) {
                try {
                    if ("com.taobao.taobao".equals((String) hashMap.get("process"))) {
                        String str = (String) hashMap.get("onlineAppKey");
                        a("guide-acs.m.taobao.com", str, ConnProtocol.valueOf("http2", "0rtt", "acs"), true);
                        ConnProtocol valueOf = ConnProtocol.valueOf("http2", "0rtt", "cdn");
                        a("gw.alicdn.com", str, valueOf, false);
                        a("dorangesource.alicdn.com", str, valueOf, false);
                        a("ossgw.alicdn.com", str, valueOf, false);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    private static void a(String str, String str2, ConnProtocol connProtocol, boolean z) {
        StrategyTemplate.getInstance().registerConnProtocol(str, connProtocol);
        if (z) {
            SessionCenter.getInstance(new Config.Builder().setAppkey(str2).setEnv(ENV.ONLINE).build()).registerSessionInfo(SessionInfo.create(str, z, false, null, null, null));
        }
    }
}
