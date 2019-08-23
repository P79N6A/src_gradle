package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.statist.StrategyStatObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.l;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.a;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    Map<String, StrategyTable> f1329a = new LruStrategyMap();

    /* renamed from: b  reason: collision with root package name */
    volatile StrategyConfig f1330b = null;

    /* renamed from: c  reason: collision with root package name */
    final a f1331c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final StrategyTable f1332d = new StrategyTable("Unknown");

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f1333e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private volatile String f1334f = "";

    static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public LruStrategyMap() {
            super(3);
        }

        public boolean entryRemoved(Map.Entry<String, StrategyTable> entry) {
            a.a(new f(this, entry));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        NetworkStatusHelper.removeStatusChangeListener(this);
    }

    public static StrategyInfoHolder a() {
        return new StrategyInfoHolder();
    }

    private void e() {
        NetworkStatusHelper.addStatusChangeListener(this);
        this.f1334f = a(NetworkStatusHelper.getStatus());
    }

    private StrategyInfoHolder() {
        try {
            e();
            g();
        } catch (Throwable unused) {
        } finally {
            f();
        }
    }

    private void f() {
        for (Map.Entry<String, StrategyTable> value : this.f1329a.entrySet()) {
            ((StrategyTable) value.getValue()).a();
        }
        synchronized (this) {
            if (this.f1330b == null) {
                StrategyConfig strategyConfig = new StrategyConfig();
                strategyConfig.a();
                strategyConfig.a(this);
                this.f1330b = strategyConfig;
            }
        }
    }

    private void g() {
        ALog.i("awcn.StrategyInfoHolder", "restore", null, new Object[0]);
        String str = this.f1334f;
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (!TextUtils.isEmpty(str)) {
                a(str, true);
            }
            this.f1330b = (StrategyConfig) m.a("StrategyConfig", null);
        }
        a.a(new d(this, str));
    }

    /* access modifiers changed from: package-private */
    public void c() {
        synchronized (this) {
            for (StrategyTable next : this.f1329a.values()) {
                if (next.f1344e) {
                    StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                    strategyStatObject.writeStrategyFileId = next.f1340a;
                    m.a(next, next.f1340a, strategyStatObject);
                    next.f1344e = false;
                }
            }
            m.a(this.f1330b, "StrategyConfig", null);
        }
    }

    /* access modifiers changed from: package-private */
    public StrategyTable d() {
        StrategyTable strategyTable = this.f1332d;
        String str = this.f1334f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f1329a) {
                strategyTable = this.f1329a.get(str);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(str);
                    this.f1329a.put(str, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    /* access modifiers changed from: package-private */
    public void a(l.d dVar) {
        if (dVar.g != 0) {
            anet.channel.strategy.dispatch.a.a(dVar.g, dVar.h);
        }
        d().update(dVar);
        this.f1330b.a(dVar);
    }

    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f1334f = a(networkStatus);
        String str = this.f1334f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f1329a) {
                if (!this.f1329a.containsKey(str)) {
                    a.a(new e(this, str));
                }
            }
        }
    }

    private String a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(NetworkStatusHelper.getWifiBSSID());
            if (TextUtils.isEmpty(md5ToHex)) {
                md5ToHex = "";
            }
            return "WIFI$".concat(String.valueOf(md5ToHex));
        } else if (!networkStatus.isMobile()) {
            return "";
        } else {
            return networkStatus.getType() + ClassUtils.INNER_CLASS_SEPARATOR + NetworkStatusHelper.getApn();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = (anet.channel.strategy.StrategyTable) anet.channel.strategy.m.a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r2 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r2.a();
        r3 = r6.f1329a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.f1329a.put(r2.f1340a, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r3 = r6.f1333e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.f1333e.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r8 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        r0.isSucceed = r1;
        anet.channel.appmonitor.AppMonitor.getInstance().commitStat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r0 = null;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r8 == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = new anet.channel.statist.StrategyStatObject(0);
        r0.readStrategyFileId = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            java.util.Set<java.lang.String> r0 = r6.f1333e
            monitor-enter(r0)
            java.util.Set<java.lang.String> r1 = r6.f1333e     // Catch:{ all -> 0x0053 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            java.util.Set<java.lang.String> r1 = r6.f1333e     // Catch:{ all -> 0x0053 }
            r1.add(r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x001c
            anet.channel.statist.StrategyStatObject r0 = new anet.channel.statist.StrategyStatObject
            r0.<init>(r1)
            r0.readStrategyFileId = r7
        L_0x001c:
            java.lang.Object r2 = anet.channel.strategy.m.a(r7, r0)
            anet.channel.strategy.StrategyTable r2 = (anet.channel.strategy.StrategyTable) r2
            if (r2 == 0) goto L_0x0036
            r2.a()
            java.util.Map<java.lang.String, anet.channel.strategy.StrategyTable> r3 = r6.f1329a
            monitor-enter(r3)
            java.util.Map<java.lang.String, anet.channel.strategy.StrategyTable> r4 = r6.f1329a     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r2.f1340a     // Catch:{ all -> 0x0033 }
            r4.put(r5, r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r7
        L_0x0036:
            java.util.Set<java.lang.String> r3 = r6.f1333e
            monitor-enter(r3)
            java.util.Set<java.lang.String> r4 = r6.f1333e     // Catch:{ all -> 0x004e }
            r4.remove(r7)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            if (r8 == 0) goto L_0x004d
            if (r2 == 0) goto L_0x0044
            r1 = 1
        L_0x0044:
            r0.isSucceed = r1
            anet.channel.appmonitor.IAppMonitor r7 = anet.channel.appmonitor.AppMonitor.getInstance()
            r7.commitStat(r0)
        L_0x004d:
            return
        L_0x004e:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r7
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0053:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyInfoHolder.a(java.lang.String, boolean):void");
    }
}
