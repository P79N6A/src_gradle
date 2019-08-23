package anet.channel.strategy.dispatch;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static Random f1369b = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f1370a;

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f1372b;

        public void run() {
            Map<String, Object> a2;
            try {
                Map<String, Object> map = this.f1372b;
                if (map == null) {
                    synchronized (b.class) {
                        a2 = b.this.f1370a;
                        Map unused = b.this.f1370a = null;
                    }
                    map = a2;
                }
                if (NetworkStatusHelper.isConnected()) {
                    if (GlobalAppRuntimeInfo.getEnv() != map.get("Env")) {
                        ALog.w("awcn.AmdcThreadPoolExecutor", "task's env changed", null, new Object[0]);
                    } else {
                        c.a(e.a(map));
                    }
                }
            } catch (Exception e2) {
                ALog.e("awcn.AmdcThreadPoolExecutor", "exec amdc task failed.", null, e2, new Object[0]);
            }
        }

        a() {
        }

        a(Map<String, Object> map) {
            this.f1372b = map;
        }
    }

    b() {
    }

    public void a(Map<String, Object> map) {
        try {
            map.put("Env", GlobalAppRuntimeInfo.getEnv());
            synchronized (this) {
                if (this.f1370a == null) {
                    this.f1370a = map;
                    int nextInt = f1369b.nextInt(PushConstants.WORK_RECEIVER_EVENTCORE_ERROR) + 2000;
                    ALog.i("awcn.AmdcThreadPoolExecutor", "merge amdc request", null, "delay", Integer.valueOf(nextInt));
                    anet.channel.strategy.utils.a.a(new a(), (long) nextInt);
                } else {
                    Set set = (Set) this.f1370a.get("hosts");
                    Set set2 = (Set) map.get("hosts");
                    if (map.get("Env") != this.f1370a.get("Env")) {
                        this.f1370a = map;
                    } else if (set.size() + set2.size() <= 40) {
                        set2.addAll(set);
                        this.f1370a = map;
                    } else {
                        anet.channel.strategy.utils.a.a(new a(map));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
