package anet.channel.d;

import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.request.Request;
import anet.channel.session.b;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.l;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpUrl;
import anet.channel.util.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.net.Socket;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final TreeMap<String, l.c> f1186a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicInteger f1187b = new AtomicInteger(1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f1188c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Condition f1189d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Condition f1190e = f1188c.newCondition();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static volatile Thread f1191f = null;
    /* access modifiers changed from: private */
    public static final Runnable g = new b();

    public static void a() {
        ALog.i("awcn.NetworkDetector", "registerListener", null, new Object[0]);
        StrategyCenter.getInstance().registerListener(new c());
        AppLifecycle.registerLifecycleListener(new d());
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f1188c = reentrantLock;
        f1189d = reentrantLock.newCondition();
    }

    /* access modifiers changed from: private */
    public static void b(l.c cVar) {
        if (cVar.f1405b != null && cVar.f1405b.length != 0) {
            String str = cVar.f1404a;
            for (l.e eVar : cVar.f1405b) {
                String str2 = eVar.f1413b.f1393b;
                if (str2.equalsIgnoreCase("http") || str2.equalsIgnoreCase("https")) {
                    a(str, eVar);
                } else if (str2.equalsIgnoreCase("http2") || str2.equalsIgnoreCase("spdy") || str2.equalsIgnoreCase("quic")) {
                    b(str, eVar);
                } else if (str2.equalsIgnoreCase("tcp")) {
                    c(str, eVar);
                }
            }
        }
    }

    private static IConnStrategy a(ConnProtocol connProtocol, l.e eVar) {
        return new g(eVar, connProtocol);
    }

    private static void a(String str, l.e eVar) {
        HttpUrl parse = HttpUrl.parse(eVar.f1413b.f1393b + "://" + str + eVar.f1414c);
        if (parse != null) {
            int i = 1;
            ALog.i("awcn.NetworkDetector", "startShortLinkTask", null, PushConstants.WEB_URL, parse);
            Request.Builder sslSocketFactory = new Request.Builder().setUrl(parse).addHeader("Connection", "close").setConnectTimeout(eVar.f1413b.f1394c).setReadTimeout(eVar.f1413b.f1395d).setRedirectEnable(false).setSslSocketFactory(new j(str));
            Request build = sslSocketFactory.setSeq("HR" + f1187b.getAndIncrement()).build();
            build.setDnsOptimize(eVar.f1412a, eVar.f1413b.f1392a);
            long currentTimeMillis = System.currentTimeMillis();
            b.a a2 = b.a(build, (RequestCb) null);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
            horseRaceStat.connTime = currentTimeMillis2;
            if (a2.f1290a <= 0) {
                horseRaceStat.connErrorCode = a2.f1290a;
            } else {
                horseRaceStat.connRet = 1;
                if (a2.f1290a != 200) {
                    i = 0;
                }
                horseRaceStat.reqRet = i;
                horseRaceStat.reqErrorCode = a2.f1290a;
                horseRaceStat.reqTime = horseRaceStat.connTime;
            }
            AppMonitor.getInstance().commitStat(horseRaceStat);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.lang.String r15, anet.channel.strategy.l.e r16) {
        /*
            r0 = r15
            r7 = r16
            anet.channel.strategy.l$a r1 = r7.f1413b
            anet.channel.strategy.ConnProtocol r1 = anet.channel.strategy.ConnProtocol.valueOf(r1)
            anet.channel.entity.ConnType r2 = anet.channel.entity.ConnType.valueOf(r1)
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r3 = "awcn.NetworkDetector"
            java.lang.String r4 = "startLongLinkTask"
            r5 = 0
            r6 = 8
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r8 = "host"
            r9 = 0
            r6[r9] = r8
            r8 = 1
            r6[r8] = r0
            r8 = 2
            java.lang.String r10 = "ip"
            r6[r8] = r10
            r8 = 3
            java.lang.String r10 = r7.f1412a
            r6[r8] = r10
            r8 = 4
            java.lang.String r10 = "port"
            r6[r8] = r10
            r8 = 5
            anet.channel.strategy.l$a r10 = r7.f1413b
            int r10 = r10.f1392a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r8] = r10
            r8 = 6
            java.lang.String r10 = "protocol"
            r6[r8] = r10
            r8 = 7
            r6[r8] = r1
            anet.channel.util.ALog.i(r3, r4, r5, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "HR"
            r3.<init>(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = f1187b
            int r4 = r4.getAndIncrement()
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            anet.channel.session.TnetSpdySession r8 = new anet.channel.session.TnetSpdySession
            android.content.Context r3 = anet.channel.GlobalAppRuntimeInfo.getContext()
            anet.channel.entity.a r5 = new anet.channel.entity.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            boolean r2 = r2.isSSL()
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = "https://"
            goto L_0x0072
        L_0x0070:
            java.lang.String r2 = "http://"
        L_0x0072:
            r6.append(r2)
            r6.append(r15)
            java.lang.String r2 = r6.toString()
            anet.channel.strategy.IConnStrategy r1 = a((anet.channel.strategy.ConnProtocol) r1, (anet.channel.strategy.l.e) r7)
            r5.<init>(r2, r4, r1)
            r8.<init>(r3, r5)
            anet.channel.statist.HorseRaceStat r10 = new anet.channel.statist.HorseRaceStat
            r10.<init>(r15, r7)
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 257(0x101, float:3.6E-43)
            anet.channel.d.e r14 = new anet.channel.d.e
            r0 = r14
            r1 = r10
            r2 = r11
            r5 = r16
            r6 = r8
            r0.<init>(r1, r2, r4, r5, r6)
            r8.registerEventcb(r13, r14)
            r8.connect()
            monitor-enter(r10)
            anet.channel.strategy.l$a r0 = r7.f1413b     // Catch:{ InterruptedException -> 0x00ce }
            int r0 = r0.f1394c     // Catch:{ InterruptedException -> 0x00ce }
            if (r0 != 0) goto L_0x00ac
            r0 = 10000(0x2710, float:1.4013E-41)
            goto L_0x00b0
        L_0x00ac:
            anet.channel.strategy.l$a r0 = r7.f1413b     // Catch:{ InterruptedException -> 0x00ce }
            int r0 = r0.f1394c     // Catch:{ InterruptedException -> 0x00ce }
        L_0x00b0:
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00ce }
            r10.wait(r0)     // Catch:{ InterruptedException -> 0x00ce }
            long r0 = r10.connTime     // Catch:{ InterruptedException -> 0x00ce }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00c4
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x00ce }
            r2 = 0
            long r0 = r0 - r11
            r10.connTime = r0     // Catch:{ InterruptedException -> 0x00ce }
        L_0x00c4:
            anet.channel.appmonitor.IAppMonitor r0 = anet.channel.appmonitor.AppMonitor.getInstance()     // Catch:{ InterruptedException -> 0x00ce }
            r0.commitStat(r10)     // Catch:{ InterruptedException -> 0x00ce }
            goto L_0x00ce
        L_0x00cc:
            r0 = move-exception
            goto L_0x00d3
        L_0x00ce:
            monitor-exit(r10)     // Catch:{ all -> 0x00cc }
            r8.close(r9)
            return
        L_0x00d3:
            monitor-exit(r10)     // Catch:{ all -> 0x00cc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.d.a.b(java.lang.String, anet.channel.strategy.l$e):void");
    }

    private static void c(String str, l.e eVar) {
        int i;
        String str2 = "HR" + f1187b.getAndIncrement();
        ALog.i("awcn.NetworkDetector", "startTcpTask", str2, "ip", eVar.f1412a, "port", Integer.valueOf(eVar.f1413b.f1392a));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(eVar.f1412a, eVar.f1413b.f1392a);
            if (eVar.f1413b.f1394c == 0) {
                i = 10000;
            } else {
                i = eVar.f1413b.f1394c;
            }
            socket.setSoTimeout(i);
            ALog.i("awcn.NetworkDetector", "socket connect success", str2, new Object[0]);
            horseRaceStat.connRet = 1;
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            socket.close();
        } catch (IOException unused) {
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            horseRaceStat.connErrorCode = -404;
        }
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }
}
