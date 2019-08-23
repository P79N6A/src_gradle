package anet.channel;

import android.content.Context;
import android.content.Intent;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.session.TnetSpdySession;
import anet.channel.session.d;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class SessionRequest {

    /* renamed from: a  reason: collision with root package name */
    SessionCenter f1139a;

    /* renamed from: b  reason: collision with root package name */
    d f1140b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f1141c;

    /* renamed from: d  reason: collision with root package name */
    volatile Session f1142d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f1143e;

    /* renamed from: f  reason: collision with root package name */
    HashMap<SessionGetCallback, c> f1144f = new HashMap<>();
    SessionConnStat g = null;
    private String h;
    private String i;
    private SessionInfo j;
    private volatile Future k;
    private Object l = new Object();

    interface IConnCb {
        void onDisConnect(Session session, long j, int i);

        void onFailed(Session session, long j, int i, int i2);

        void onSuccess(Session session, long j);
    }

    class a implements IConnCb {

        /* renamed from: a  reason: collision with root package name */
        boolean f1145a;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Context f1147c;

        /* renamed from: d  reason: collision with root package name */
        private List<anet.channel.entity.a> f1148d;

        /* renamed from: e  reason: collision with root package name */
        private anet.channel.entity.a f1149e;

        public void onSuccess(Session session, long j) {
            ALog.d("awcn.SessionRequest", "Connect Success", this.f1149e.h(), "session", session, "host", SessionRequest.this.a());
            try {
                if (SessionRequest.this.f1143e) {
                    SessionRequest.this.f1143e = false;
                    session.close(false);
                    SessionRequest.this.c();
                    return;
                }
                SessionRequest.this.f1140b.a(SessionRequest.this, session);
                SessionRequest.this.a(session);
                synchronized (SessionRequest.this.f1144f) {
                    for (Map.Entry next : SessionRequest.this.f1144f.entrySet()) {
                        c cVar = (c) next.getValue();
                        if (cVar.f1153b.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(cVar);
                            ((SessionGetCallback) next.getKey()).onSessionGetSuccess(session);
                        }
                    }
                    SessionRequest.this.f1144f.clear();
                }
                SessionRequest.this.c();
            } catch (Exception e2) {
                try {
                    ALog.e("awcn.SessionRequest", "[onSuccess]:", this.f1149e.h(), e2, new Object[0]);
                } finally {
                    SessionRequest.this.c();
                }
            }
        }

        public void onDisConnect(Session session, long j, int i) {
            boolean isAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            ALog.d("awcn.SessionRequest", "Connect Disconnect", this.f1149e.h(), "session", session, "host", SessionRequest.this.a(), "appIsBg", Boolean.valueOf(isAppBackground), "isHandleFinish", Boolean.valueOf(this.f1145a));
            SessionRequest.this.f1140b.b(SessionRequest.this, session);
            if (!this.f1145a) {
                this.f1145a = true;
                if (session.t) {
                    if (isAppBackground) {
                        ALog.e("awcn.SessionRequest", "[onDisConnect]app background, don't Recreate", this.f1149e.h(), "session", session);
                    } else if (!NetworkStatusHelper.isConnected()) {
                        ALog.e("awcn.SessionRequest", "[onDisConnect]no network, don't Recreate", this.f1149e.h(), "session", session);
                    } else {
                        try {
                            ALog.d("awcn.SessionRequest", "session disconnected, try to recreate session", this.f1149e.h(), new Object[0]);
                            ThreadPoolExecutorFactory.submitScheduledTask(new g(this, session), (long) (Math.random() * 10.0d * 1000.0d), TimeUnit.MILLISECONDS);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        a(Context context, List<anet.channel.entity.a> list, anet.channel.entity.a aVar) {
            this.f1147c = context;
            this.f1148d = list;
            this.f1149e = aVar;
        }

        public void onFailed(Session session, long j, int i, int i2) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.SessionRequest", "Connect failed", this.f1149e.h(), "session", session, "host", SessionRequest.this.a(), "isHandleFinish", Boolean.valueOf(this.f1145a));
            }
            if (SessionRequest.this.f1143e) {
                SessionRequest.this.f1143e = false;
            } else if (!this.f1145a) {
                this.f1145a = true;
                SessionRequest.this.f1140b.b(SessionRequest.this, session);
                if (!session.u || !NetworkStatusHelper.isConnected() || this.f1148d.isEmpty()) {
                    SessionRequest.this.c();
                    SessionRequest.this.a(session, i, i2);
                    synchronized (SessionRequest.this.f1144f) {
                        for (Map.Entry next : SessionRequest.this.f1144f.entrySet()) {
                            c cVar = (c) next.getValue();
                            if (cVar.f1153b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(cVar);
                                ((SessionGetCallback) next.getKey()).onSessionGetFail();
                            }
                        }
                        SessionRequest.this.f1144f.clear();
                    }
                    return;
                }
                if (ALog.isPrintLog(1)) {
                    ALog.d("awcn.SessionRequest", "use next connInfo to create session", this.f1149e.h(), "host", SessionRequest.this.a());
                }
                if (this.f1149e.f1204b == this.f1149e.f1205c && (i2 == -2003 || i2 == -2410)) {
                    ListIterator<anet.channel.entity.a> listIterator = this.f1148d.listIterator();
                    while (listIterator.hasNext()) {
                        if (session.getIp().equals(listIterator.next().f1203a.getIp())) {
                            listIterator.remove();
                        }
                    }
                }
                if (anet.channel.strategy.utils.c.b(session.getIp())) {
                    ListIterator<anet.channel.entity.a> listIterator2 = this.f1148d.listIterator();
                    while (listIterator2.hasNext()) {
                        if (anet.channel.strategy.utils.c.b(listIterator2.next().f1203a.getIp())) {
                            listIterator2.remove();
                        }
                    }
                }
                if (this.f1148d.isEmpty()) {
                    SessionRequest.this.c();
                    SessionRequest.this.a(session, i, i2);
                    return;
                }
                anet.channel.entity.a remove = this.f1148d.remove(0);
                SessionRequest.this.a(this.f1147c, remove, new a(this.f1147c, this.f1148d, remove), remove.h());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        String f1150a;

        public void run() {
            if (SessionRequest.this.f1141c) {
                ALog.e("awcn.SessionRequest", "Connecting timeout!!! reset status!", this.f1150a, new Object[0]);
                SessionRequest.this.g.ret = 2;
                SessionRequest.this.g.totalTime = System.currentTimeMillis() - SessionRequest.this.g.start;
                if (SessionRequest.this.f1142d != null) {
                    SessionRequest.this.f1142d.u = false;
                    SessionRequest.this.f1142d.close();
                    SessionRequest.this.g.syncValueFromSession(SessionRequest.this.f1142d);
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.g);
                SessionRequest.this.a(false);
            }
        }

        b(String str) {
            this.f1150a = str;
        }
    }

    protected class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        SessionGetCallback f1152a;

        /* renamed from: b  reason: collision with root package name */
        AtomicBoolean f1153b = new AtomicBoolean(false);

        public void run() {
            if (this.f1153b.compareAndSet(false, true)) {
                ALog.e("awcn.SessionRequest", "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.this.f1144f) {
                    SessionRequest.this.f1144f.remove(this.f1152a);
                }
                this.f1152a.onSessionGetFail();
            }
        }

        protected c(SessionGetCallback sessionGetCallback) {
            this.f1152a = sessionGetCallback;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f1141c = z;
        if (!z) {
            if (this.k != null) {
                this.k.cancel(true);
                this.k = null;
            }
            this.f1142d = null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        ALog.d("awcn.SessionRequest", "reCreateSession", str, "host", this.h);
        b(true);
    }

    /* access modifiers changed from: package-private */
    public void a(Session session, int i2, String str) {
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context != null && this.j != null && this.j.isAccs) {
            try {
                Intent intent = new Intent("com.taobao.accs.intent.action.RECEIVE");
                intent.setPackage(context.getPackageName());
                intent.setClassName(context, "com.taobao.accs.data.MsgDistributeService");
                intent.putExtra("command", 103);
                intent.putExtra("host", session.getHost());
                intent.putExtra("is_center_host", true);
                boolean isAvailable = session.isAvailable();
                if (!isAvailable) {
                    intent.putExtra("errorCode", i2);
                    intent.putExtra("errorDetail", str);
                }
                intent.putExtra("connect_avail", isAvailable);
                intent.putExtra("type_inapp", true);
                context.startService(intent);
            } catch (Throwable th) {
                ALog.e("awcn.SessionRequest", "sendConnectInfoBroadCastToAccs", null, th, new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String a() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public int b() {
        Session session = this.f1142d;
        if (session != null) {
            return session.j.getType();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a(false);
        synchronized (this.l) {
            this.l.notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Session session) {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.h;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.g.syncValueFromSession(session);
        this.g.ret = 1;
        this.g.totalTime = System.currentTimeMillis() - this.g.start;
        AppMonitor.getInstance().commitStat(this.g);
    }

    /* access modifiers changed from: protected */
    public void b(boolean z) {
        ALog.d("awcn.SessionRequest", "closeSessions", this.f1139a.f1133c, "host", this.h, "autoCreate", Boolean.valueOf(z));
        if (!z && this.f1142d != null) {
            this.f1142d.u = false;
            this.f1142d.close(false);
        }
        List<Session> a2 = this.f1140b.a(this);
        if (a2 != null) {
            for (Session session : a2) {
                if (session != null) {
                    session.close(z);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j2) throws InterruptedException, TimeoutException {
        ALog.d("awcn.SessionRequest", "[await]", null, "timeoutMs", Long.valueOf(j2));
        if (j2 > 0) {
            synchronized (this.l) {
                long currentTimeMillis = System.currentTimeMillis() + j2;
                while (this.f1141c) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 >= currentTimeMillis) {
                        break;
                    }
                    this.l.wait(currentTimeMillis - currentTimeMillis2);
                }
                if (this.f1141c) {
                    throw new TimeoutException();
                }
            }
        }
    }

    SessionRequest(String str, SessionCenter sessionCenter) {
        this.h = str;
        this.i = this.h.substring(this.h.indexOf("://") + 3);
        this.f1139a = sessionCenter;
        this.j = sessionCenter.g.b(this.i);
        this.f1140b = sessionCenter.f1135e;
    }

    private List<anet.channel.entity.a> a(List<IConnStrategy> list, String str) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            IConnStrategy iConnStrategy = list.get(i2);
            int retryTimes = iConnStrategy.getRetryTimes();
            int i4 = i3;
            for (int i5 = 0; i5 <= retryTimes; i5++) {
                i4++;
                String a2 = a();
                anet.channel.entity.a aVar = new anet.channel.entity.a(a2, str + "_" + i4, iConnStrategy);
                aVar.f1204b = i5;
                aVar.f1205c = retryTimes;
                arrayList.add(aVar);
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    private List<IConnStrategy> a(int i2, String str) {
        List<IConnStrategy> list;
        try {
            HttpUrl parse = HttpUrl.parse(a());
            if (parse == null) {
                return Collections.EMPTY_LIST;
            }
            list = StrategyCenter.getInstance().getConnStrategyListByHost(parse.host());
            try {
                if (!list.isEmpty()) {
                    boolean equalsIgnoreCase = "https".equalsIgnoreCase(parse.scheme());
                    boolean b2 = anet.channel.util.c.b();
                    ListIterator<IConnStrategy> listIterator = list.listIterator();
                    while (listIterator.hasNext()) {
                        IConnStrategy next = listIterator.next();
                        ConnType valueOf = ConnType.valueOf(next.getProtocol());
                        if (valueOf != null) {
                            if (!(valueOf.isSSL() == equalsIgnoreCase && (i2 == anet.channel.entity.c.f1213c || valueOf.getType() == i2))) {
                                listIterator.remove();
                            }
                            if (b2 && anet.channel.strategy.utils.c.b(next.getIp())) {
                                listIterator.remove();
                            }
                        }
                    }
                }
                if (ALog.isPrintLog(1)) {
                    ALog.d("awcn.SessionRequest", "[getAvailStrategy]", str, "strategies", list);
                }
            } catch (Throwable th) {
                th = th;
                ALog.e("awcn.SessionRequest", "", str, th, new Object[0]);
                return list;
            }
            return list;
        } catch (Throwable th2) {
            th = th2;
            list = Collections.EMPTY_LIST;
            ALog.e("awcn.SessionRequest", "", str, th, new Object[0]);
            return list;
        }
    }

    private void a(Session session, IConnCb iConnCb, long j2) {
        if (iConnCb != null) {
            session.registerEventcb(4095, new e(this, iConnCb, j2));
            session.registerEventcb(1792, new f(this, session));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Session session, int i2, int i3) {
        if (256 == i2 && i3 != -2613 && i3 != -2601) {
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "networkPrefer";
            alarmObject.modulePoint = "policy";
            alarmObject.arg = this.h;
            alarmObject.errorCode = String.valueOf(i3);
            alarmObject.isSuccess = false;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            this.g.ret = 0;
            this.g.appendErrorTrace(i3);
            this.g.errorCode = String.valueOf(i3);
            this.g.totalTime = System.currentTimeMillis() - this.g.start;
            this.g.syncValueFromSession(session);
            AppMonitor.getInstance().commitStat(this.g);
        }
    }

    /* access modifiers changed from: private */
    public void a(Context context, anet.channel.entity.a aVar, IConnCb iConnCb, String str) {
        ConnType c2 = aVar.c();
        if (context == null || c2.isHttpType()) {
            this.f1142d = new d(context, aVar);
        } else {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, aVar);
            tnetSpdySession.initConfig(this.f1139a.f1134d);
            tnetSpdySession.initSessionInfo(this.j);
            tnetSpdySession.setTnetPublicKey(this.f1139a.g.c(this.i));
            this.f1142d = tnetSpdySession;
        }
        ALog.i("awcn.SessionRequest", "create connection...", str, "Host", a(), "Type", aVar.c(), "IP", aVar.a(), "Port", Integer.valueOf(aVar.b()), "heartbeat", Integer.valueOf(aVar.g()), "session", this.f1142d);
        a(this.f1142d, iConnCb, System.currentTimeMillis());
        this.f1142d.connect();
        this.g.retryTimes++;
        this.g.startConnect = System.currentTimeMillis();
        if (this.g.retryTimes == 0) {
            this.g.putExtra("firstIp", aVar.a());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0109, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x010a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(android.content.Context r10, int r11, java.lang.String r12, anet.channel.SessionGetCallback r13, long r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            anet.channel.d r0 = r9.f1140b     // Catch:{ all -> 0x0135 }
            anet.channel.Session r0 = r0.a((anet.channel.SessionRequest) r9, (int) r11)     // Catch:{ all -> 0x0135 }
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.String r10 = "awcn.SessionRequest"
            java.lang.String r11 = "Available Session exist!!!"
            java.lang.Object[] r14 = new java.lang.Object[r1]     // Catch:{ all -> 0x0135 }
            anet.channel.util.ALog.d(r10, r11, r12, r14)     // Catch:{ all -> 0x0135 }
            if (r13 == 0) goto L_0x0018
            r13.onSessionGetSuccess(r0)     // Catch:{ all -> 0x0135 }
        L_0x0018:
            monitor-exit(r9)
            return
        L_0x001a:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0025
            r12 = 0
            java.lang.String r12 = anet.channel.util.i.a(r12)     // Catch:{ all -> 0x0135 }
        L_0x0025:
            java.lang.String r0 = "awcn.SessionRequest"
            java.lang.String r2 = "SessionRequest start"
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = "host"
            r4[r1] = r5     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = r9.h     // Catch:{ all -> 0x0135 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = "type"
            r7 = 2
            r4[r7] = r5     // Catch:{ all -> 0x0135 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0135 }
            r8 = 3
            r4[r8] = r5     // Catch:{ all -> 0x0135 }
            anet.channel.util.ALog.d(r0, r2, r12, r4)     // Catch:{ all -> 0x0135 }
            boolean r0 = r9.f1141c     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r10 = "awcn.SessionRequest"
            java.lang.String r0 = "session connecting"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x0135 }
            java.lang.String r3 = "host"
            r2[r1] = r3     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = r9.a()     // Catch:{ all -> 0x0135 }
            r2[r6] = r1     // Catch:{ all -> 0x0135 }
            anet.channel.util.ALog.d(r10, r0, r12, r2)     // Catch:{ all -> 0x0135 }
            if (r13 == 0) goto L_0x007e
            int r10 = r9.b()     // Catch:{ all -> 0x0135 }
            if (r10 != r11) goto L_0x007b
            anet.channel.SessionRequest$c r10 = new anet.channel.SessionRequest$c     // Catch:{ all -> 0x0135 }
            r10.<init>(r13)     // Catch:{ all -> 0x0135 }
            java.util.HashMap<anet.channel.SessionGetCallback, anet.channel.SessionRequest$c> r11 = r9.f1144f     // Catch:{ all -> 0x0135 }
            monitor-enter(r11)     // Catch:{ all -> 0x0135 }
            java.util.HashMap<anet.channel.SessionGetCallback, anet.channel.SessionRequest$c> r12 = r9.f1144f     // Catch:{ all -> 0x0078 }
            r12.put(r13, r10)     // Catch:{ all -> 0x0078 }
            monitor-exit(r11)     // Catch:{ all -> 0x0078 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0135 }
            anet.channel.thread.ThreadPoolExecutorFactory.submitScheduledTask(r10, r14, r11)     // Catch:{ all -> 0x0135 }
            monitor-exit(r9)
            return
        L_0x0078:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0078 }
            throw r10     // Catch:{ all -> 0x0135 }
        L_0x007b:
            r13.onSessionGetFail()     // Catch:{ all -> 0x0135 }
        L_0x007e:
            monitor-exit(r9)
            return
        L_0x0080:
            r9.a((boolean) r6)     // Catch:{ all -> 0x0135 }
            anet.channel.SessionRequest$b r0 = new anet.channel.SessionRequest$b     // Catch:{ all -> 0x0135 }
            r0.<init>(r12)     // Catch:{ all -> 0x0135 }
            r4 = 45
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0135 }
            java.util.concurrent.Future r0 = anet.channel.thread.ThreadPoolExecutorFactory.submitScheduledTask(r0, r4, r2)     // Catch:{ all -> 0x0135 }
            r9.k = r0     // Catch:{ all -> 0x0135 }
            anet.channel.statist.SessionConnStat r0 = new anet.channel.statist.SessionConnStat     // Catch:{ all -> 0x0135 }
            r0.<init>()     // Catch:{ all -> 0x0135 }
            r9.g = r0     // Catch:{ all -> 0x0135 }
            anet.channel.statist.SessionConnStat r0 = r9.g     // Catch:{ all -> 0x0135 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0135 }
            r0.start = r4     // Catch:{ all -> 0x0135 }
            boolean r0 = anet.channel.status.NetworkStatusHelper.isConnected()     // Catch:{ all -> 0x0135 }
            if (r0 != 0) goto L_0x00cf
            boolean r10 = anet.channel.util.ALog.isPrintLog(r6)     // Catch:{ all -> 0x0135 }
            if (r10 == 0) goto L_0x00c4
            java.lang.String r10 = "awcn.SessionRequest"
            java.lang.String r11 = "network is not available, can't create session"
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0135 }
            java.lang.String r14 = "isConnected"
            r13[r1] = r14     // Catch:{ all -> 0x0135 }
            boolean r14 = anet.channel.status.NetworkStatusHelper.isConnected()     // Catch:{ all -> 0x0135 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x0135 }
            r13[r6] = r14     // Catch:{ all -> 0x0135 }
            anet.channel.util.ALog.d(r10, r11, r12, r13)     // Catch:{ all -> 0x0135 }
        L_0x00c4:
            r9.c()     // Catch:{ all -> 0x0135 }
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = "no network"
            r10.<init>(r11)     // Catch:{ all -> 0x0135 }
            throw r10     // Catch:{ all -> 0x0135 }
        L_0x00cf:
            java.util.List r0 = r9.a((int) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0135 }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0135 }
            if (r2 != 0) goto L_0x010f
            java.util.List r11 = r9.a((java.util.List<anet.channel.strategy.IConnStrategy>) r0, (java.lang.String) r12)     // Catch:{ all -> 0x0135 }
            java.lang.Object r12 = r11.remove(r1)     // Catch:{ Throwable -> 0x010a }
            anet.channel.entity.a r12 = (anet.channel.entity.a) r12     // Catch:{ Throwable -> 0x010a }
            anet.channel.SessionRequest$a r0 = new anet.channel.SessionRequest$a     // Catch:{ Throwable -> 0x010a }
            r0.<init>(r10, r11, r12)     // Catch:{ Throwable -> 0x010a }
            java.lang.String r11 = r12.h()     // Catch:{ Throwable -> 0x010a }
            r9.a(r10, r12, r0, r11)     // Catch:{ Throwable -> 0x010a }
            if (r13 == 0) goto L_0x0108
            anet.channel.SessionRequest$c r10 = new anet.channel.SessionRequest$c     // Catch:{ Throwable -> 0x010a }
            r10.<init>(r13)     // Catch:{ Throwable -> 0x010a }
            java.util.HashMap<anet.channel.SessionGetCallback, anet.channel.SessionRequest$c> r11 = r9.f1144f     // Catch:{ Throwable -> 0x010a }
            monitor-enter(r11)     // Catch:{ Throwable -> 0x010a }
            java.util.HashMap<anet.channel.SessionGetCallback, anet.channel.SessionRequest$c> r12 = r9.f1144f     // Catch:{ all -> 0x0105 }
            r12.put(r13, r10)     // Catch:{ all -> 0x0105 }
            monitor-exit(r11)     // Catch:{ all -> 0x0105 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x010a }
            anet.channel.thread.ThreadPoolExecutorFactory.submitScheduledTask(r10, r14, r11)     // Catch:{ Throwable -> 0x010a }
            goto L_0x0108
        L_0x0105:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0105 }
            throw r10     // Catch:{ Throwable -> 0x010a }
        L_0x0108:
            monitor-exit(r9)
            return
        L_0x010a:
            r9.c()     // Catch:{ all -> 0x0135 }
            monitor-exit(r9)
            return
        L_0x010f:
            java.lang.String r10 = "awcn.SessionRequest"
            java.lang.String r13 = "no avalible strategy, can't create session"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x0135 }
            java.lang.String r15 = "host"
            r14[r1] = r15     // Catch:{ all -> 0x0135 }
            java.lang.String r15 = r9.h     // Catch:{ all -> 0x0135 }
            r14[r6] = r15     // Catch:{ all -> 0x0135 }
            java.lang.String r15 = "type"
            r14[r7] = r15     // Catch:{ all -> 0x0135 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0135 }
            r14[r8] = r11     // Catch:{ all -> 0x0135 }
            anet.channel.util.ALog.i(r10, r13, r12, r14)     // Catch:{ all -> 0x0135 }
            r9.c()     // Catch:{ all -> 0x0135 }
            anet.channel.NoAvailStrategyException r10 = new anet.channel.NoAvailStrategyException     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = "no avalible strategy"
            r10.<init>(r11)     // Catch:{ all -> 0x0135 }
            throw r10     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionRequest.a(android.content.Context, int, java.lang.String, anet.channel.SessionGetCallback, long):void");
    }
}
