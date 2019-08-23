package anet.channel.f;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static String f1216a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, Long> f1217b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static AtomicBoolean f1218c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static IStrategyFilter f1219d = new b();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static AtomicInteger f1220e = new AtomicInteger(1);

    public static void a() {
        ALog.e("awcn.QuicConnDetector", "registerListener", null, new Object[0]);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
        f1216a = defaultSharedPreferences.getString("quic_detector_host", "");
        NetworkStatusHelper.addStatusChangeListener(new e());
        StrategyCenter.getInstance().registerListener(new f(defaultSharedPreferences));
    }

    public static void a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (!AwcnConfig.isQuicEnable()) {
            ALog.i("awcn.QuicConnDetector", "startDetect", null, "quic global config close.");
        } else if (NetworkStatusHelper.isConnected()) {
            if (TextUtils.isEmpty(f1216a)) {
                ALog.e("awcn.QuicConnDetector", "startDetect", null, "host is null");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = f1217b.get(networkStatus.getType());
            if (l == null || l.longValue() + 1800000 <= currentTimeMillis) {
                List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(f1216a, f1219d);
                if (connStrategyListByHost.isEmpty()) {
                    ALog.e("awcn.QuicConnDetector", "startDetect", null, "quic strategy is null.");
                    return;
                }
                f1217b.put(networkStatus.getType(), Long.valueOf(currentTimeMillis));
                ThreadPoolExecutorFactory.submitPriorityTask(new c(connStrategyListByHost), ThreadPoolExecutorFactory.Priority.LOW);
            }
        }
    }
}
