package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import java.io.File;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1354a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StrategyInfoHolder f1355b;

    public void run() {
        try {
            ALog.i("awcn.StrategyInfoHolder", "start loading strategy files", null, new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                ALog.i("awcn.StrategyInfoHolder", "load strategy async", null, new Object[0]);
                if (!TextUtils.isEmpty(this.f1354a)) {
                    this.f1355b.a(this.f1354a, true);
                }
                StrategyConfig strategyConfig = (StrategyConfig) m.a("StrategyConfig", null);
                if (strategyConfig != null) {
                    strategyConfig.a();
                    strategyConfig.a(this.f1355b);
                    synchronized (this.f1355b) {
                        this.f1355b.f1330b = strategyConfig;
                    }
                }
            }
            File[] b2 = m.b();
            if (b2 != null) {
                int i = 0;
                for (int i2 = 0; i2 < b2.length && i < 2; i2++) {
                    File file = b2[i2];
                    if (!file.isDirectory()) {
                        String name = file.getName();
                        if (!name.equals(this.f1354a) && !name.startsWith("StrategyConfig")) {
                            this.f1355b.a(name, false);
                            i++;
                        }
                    }
                }
                ALog.i("awcn.StrategyInfoHolder", "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Exception unused) {
        }
    }

    d(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f1355b = strategyInfoHolder;
        this.f1354a = str;
    }
}
