package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
import anet.channel.entity.b;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

public abstract class Session implements Comparable<Session> {
    static ExecutorService v = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    public Context f1124a;

    /* renamed from: b  reason: collision with root package name */
    Map<EventCb, Integer> f1125b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public String f1126c;

    /* renamed from: d  reason: collision with root package name */
    public String f1127d;

    /* renamed from: e  reason: collision with root package name */
    public String f1128e;

    /* renamed from: f  reason: collision with root package name */
    public String f1129f;
    public int g;
    public String h;
    public int i;
    public ConnType j;
    public IConnStrategy k;
    public String l;
    public boolean m;
    public int n;
    protected Runnable o;
    public final String p;
    public final SessionStatistic q;
    public int r;
    public int s;
    public boolean t;
    protected boolean u;
    private boolean w;
    private Future<?> x;
    private List<Long> y;
    private long z;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final String[] f1130a = {"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};

        static String a(int i) {
            return f1130a[i];
        }
    }

    public abstract void close();

    public void connect() {
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public abstract boolean isAvailable();

    public void onDisconnect() {
    }

    public void ping(boolean z2) {
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i2, byte[] bArr, int i3) {
    }

    public IConnStrategy getConnStrategy() {
        return this.k;
    }

    public ConnType getConnType() {
        return this.j;
    }

    public String getHost() {
        return this.f1126c;
    }

    public String getIp() {
        return this.f1128e;
    }

    public int getPort() {
        return this.g;
    }

    public String getRealHost() {
        return this.f1127d;
    }

    public String getUnit() {
        return this.l;
    }

    public void checkAvailable() {
        ping(true);
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.o != null && this.x != null) {
            this.x.cancel(true);
        }
    }

    public void setPingTimeout() {
        if (this.o == null) {
            this.o = getRecvTimeOutRunnable();
        }
        a();
        if (this.o != null) {
            this.x = ThreadPoolExecutorFactory.submitScheduledTask(this.o, (long) this.s, TimeUnit.MILLISECONDS);
        }
    }

    public String toString() {
        return "Session@[" + this.p + '|' + this.j + ']';
    }

    public void close(boolean z2) {
        this.t = z2;
        close();
    }

    public int compareTo(Session session) {
        return ConnType.compare(this.j, session.j);
    }

    public void handleCallbacks(int i2, b bVar) {
        v.submit(new a(this, i2, bVar));
    }

    public void registerEventcb(int i2, EventCb eventCb) {
        if (this.f1125b != null) {
            this.f1125b.put(eventCb, Integer.valueOf(i2));
        }
    }

    public void handleResponseHeaders(Request request, Map<String, List<String>> map) {
        try {
            if (map.containsKey("x-switch-unit")) {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "x-switch-unit");
                if (TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    singleHeaderFieldByKey = null;
                }
                if (!StringUtils.isStringEqual(this.l, singleHeaderFieldByKey)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.z > 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.z = currentTimeMillis;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void handleResponseCode(Request request, int i2) {
        if (request.getHeaders().containsKey("x-pv") && i2 >= 500 && i2 < 600) {
            synchronized (this) {
                if (this.y == null) {
                    this.y = new LinkedList();
                }
                if (this.y.size() < 5) {
                    this.y.add(Long.valueOf(System.currentTimeMillis()));
                } else {
                    long longValue = this.y.remove(0).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - longValue <= 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.y.clear();
                    } else {
                        this.y.add(Long.valueOf(currentTimeMillis));
                    }
                }
            }
        }
    }

    public Session(Context context, anet.channel.entity.a aVar) {
        boolean z2 = false;
        this.w = false;
        this.l = null;
        this.m = false;
        this.n = 6;
        this.t = false;
        this.u = true;
        this.y = null;
        this.z = 0;
        this.f1124a = context;
        this.f1128e = aVar.a();
        this.f1129f = this.f1128e;
        this.g = aVar.b();
        this.j = aVar.c();
        this.f1126c = aVar.f();
        this.f1127d = this.f1126c.substring(this.f1126c.indexOf("://") + 3);
        this.s = aVar.e();
        this.r = aVar.d();
        this.k = aVar.f1203a;
        if (this.k != null && this.k.getIpType() == -1) {
            z2 = true;
        }
        this.m = z2;
        this.p = aVar.h();
        this.q = new SessionStatistic(aVar);
        this.q.host = this.f1127d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void notifyStatus(int r9, anet.channel.entity.b r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "awcn.Session"
            java.lang.String r1 = "notifyStatus"
            java.lang.String r2 = r8.p     // Catch:{ all -> 0x006b }
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "status"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x006b }
            java.lang.String r5 = anet.channel.Session.a.a(r9)     // Catch:{ all -> 0x006b }
            r7 = 1
            r4[r7] = r5     // Catch:{ all -> 0x006b }
            anet.channel.util.ALog.e(r0, r1, r2, r4)     // Catch:{ all -> 0x006b }
            int r0 = r8.n     // Catch:{ all -> 0x006b }
            if (r9 != r0) goto L_0x002a
            java.lang.String r9 = "awcn.Session"
            java.lang.String r10 = "ignore notifyStatus"
            java.lang.String r0 = r8.p     // Catch:{ all -> 0x006b }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x006b }
            anet.channel.util.ALog.i(r9, r10, r0, r1)     // Catch:{ all -> 0x006b }
            monitor-exit(r8)
            return
        L_0x002a:
            r8.n = r9     // Catch:{ all -> 0x006b }
            int r9 = r8.n     // Catch:{ all -> 0x006b }
            switch(r9) {
                case 0: goto L_0x0064;
                case 1: goto L_0x0062;
                case 2: goto L_0x005b;
                case 3: goto L_0x0059;
                case 4: goto L_0x0046;
                case 5: goto L_0x0040;
                case 6: goto L_0x0034;
                case 7: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0069
        L_0x0032:
            monitor-exit(r8)
            return
        L_0x0034:
            r8.onDisconnect()     // Catch:{ all -> 0x006b }
            boolean r9 = r8.w     // Catch:{ all -> 0x006b }
            if (r9 != 0) goto L_0x0069
            r8.handleCallbacks(r3, r10)     // Catch:{ all -> 0x006b }
            monitor-exit(r8)
            return
        L_0x0040:
            r9 = 1024(0x400, float:1.435E-42)
            r8.handleCallbacks(r9, r10)     // Catch:{ all -> 0x006b }
            goto L_0x0069
        L_0x0046:
            anet.channel.strategy.IStrategyInstance r9 = anet.channel.strategy.StrategyCenter.getInstance()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r8.f1127d     // Catch:{ all -> 0x006b }
            java.lang.String r9 = r9.getUnitByHost(r0)     // Catch:{ all -> 0x006b }
            r8.l = r9     // Catch:{ all -> 0x006b }
            r9 = 512(0x200, float:7.175E-43)
            r8.handleCallbacks(r9, r10)     // Catch:{ all -> 0x006b }
            monitor-exit(r8)
            return
        L_0x0059:
            monitor-exit(r8)
            return
        L_0x005b:
            r9 = 256(0x100, float:3.59E-43)
            r8.handleCallbacks(r9, r10)     // Catch:{ all -> 0x006b }
            monitor-exit(r8)
            return
        L_0x0062:
            monitor-exit(r8)
            return
        L_0x0064:
            r8.handleCallbacks(r7, r10)     // Catch:{ all -> 0x006b }
            monitor-exit(r8)
            return
        L_0x0069:
            monitor-exit(r8)
            return
        L_0x006b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.Session.notifyStatus(int, anet.channel.entity.b):void");
    }

    public static void configTnetALog(Context context, String str, int i2, int i3) {
        SpdyAgent instance = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (instance == null || !SpdyAgent.checkLoadSucc()) {
            ALog.e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
            return;
        }
        instance.configLogFile(str, i2, i3);
    }
}
