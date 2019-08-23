package anet.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.entity.c;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.IAmdcSign;
import anet.channel.strategy.l;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import anet.channel.util.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

public class SessionCenter {

    /* renamed from: a  reason: collision with root package name */
    static Map<Config, SessionCenter> f1131a = new HashMap();
    /* access modifiers changed from: private */
    public static boolean j = false;

    /* renamed from: b  reason: collision with root package name */
    Context f1132b = GlobalAppRuntimeInfo.getContext();

    /* renamed from: c  reason: collision with root package name */
    String f1133c;

    /* renamed from: d  reason: collision with root package name */
    Config f1134d;

    /* renamed from: e  reason: collision with root package name */
    final d f1135e = new d();

    /* renamed from: f  reason: collision with root package name */
    final LruCache<String, SessionRequest> f1136f = new LruCache<>(32);
    final b g = new b();
    final AccsSessionManager h;
    final a i = new a(this, null);

    class a implements NetworkStatusHelper.INetworkStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f1137a;

        /* access modifiers changed from: package-private */
        public void a() {
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
        }

        public void background() {
            ALog.i("awcn.SessionCenter", "[background]", SessionCenter.this.f1133c, new Object[0]);
            if (!SessionCenter.j) {
                ALog.e("awcn.SessionCenter", "background not inited!", SessionCenter.this.f1133c, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if ("OPPO".equalsIgnoreCase(Build.BRAND)) {
                    ALog.i("awcn.SessionCenter", "close session for OPPO", SessionCenter.this.f1133c, new Object[0]);
                    SessionCenter.this.h.forceCloseSession(false);
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0057 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void forground() {
            /*
                r7 = this;
                java.lang.String r0 = "awcn.SessionCenter"
                java.lang.String r1 = "[forground]"
                anet.channel.SessionCenter r2 = anet.channel.SessionCenter.this
                java.lang.String r2 = r2.f1133c
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                anet.channel.util.ALog.i(r0, r1, r2, r4)
                anet.channel.SessionCenter r0 = anet.channel.SessionCenter.this
                android.content.Context r0 = r0.f1132b
                if (r0 != 0) goto L_0x0015
                return
            L_0x0015:
                boolean r0 = r7.f1137a
                if (r0 == 0) goto L_0x001a
                return
            L_0x001a:
                r0 = 1
                r7.f1137a = r0
                boolean r1 = anet.channel.SessionCenter.j
                if (r1 != 0) goto L_0x0031
                java.lang.String r0 = "awcn.SessionCenter"
                java.lang.String r1 = "forground not inited!"
                anet.channel.SessionCenter r2 = anet.channel.SessionCenter.this
                java.lang.String r2 = r2.f1133c
                java.lang.Object[] r3 = new java.lang.Object[r3]
                anet.channel.util.ALog.e(r0, r1, r2, r3)
                return
            L_0x0031:
                long r1 = anet.channel.util.AppLifecycle.lastEnterBackgroundTime     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                r4 = 0
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x0050
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                long r4 = anet.channel.util.AppLifecycle.lastEnterBackgroundTime     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                r6 = 0
                long r1 = r1 - r4
                r4 = 60000(0xea60, double:2.9644E-319)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0050
                anet.channel.SessionCenter r1 = anet.channel.SessionCenter.this     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                anet.channel.AccsSessionManager r1 = r1.h     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                r1.forceCloseSession(r0)     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                goto L_0x0057
            L_0x0050:
                anet.channel.SessionCenter r0 = anet.channel.SessionCenter.this     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                anet.channel.AccsSessionManager r0 = r0.h     // Catch:{ Exception -> 0x0057, all -> 0x005a }
                r0.checkAndStartSession()     // Catch:{ Exception -> 0x0057, all -> 0x005a }
            L_0x0057:
                r7.f1137a = r3     // Catch:{ Exception -> 0x005e }
                goto L_0x005e
            L_0x005a:
                r0 = move-exception
                r7.f1137a = r3     // Catch:{ Exception -> 0x005e }
                throw r0     // Catch:{ Exception -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionCenter.a.forground():void");
        }

        private a() {
        }

        public void onStrategyUpdated(l.d dVar) {
            SessionCenter.this.a(dVar);
            SessionCenter.this.h.checkAndStartSession();
        }

        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            ALog.e("awcn.SessionCenter", "onNetworkStatusChanged.", SessionCenter.this.f1133c, "networkStatus", networkStatus);
            List<SessionRequest> a2 = SessionCenter.this.f1135e.a();
            if (!a2.isEmpty()) {
                for (SessionRequest a3 : a2) {
                    ALog.d("awcn.SessionCenter", "network change, try recreate session", SessionCenter.this.f1133c, new Object[0]);
                    a3.a((String) null);
                }
            }
            SessionCenter.this.h.checkAndStartSession();
        }

        /* synthetic */ a(SessionCenter sessionCenter, c cVar) {
            this();
        }
    }

    @Deprecated
    public void enterBackground() {
        AppLifecycle.onBackground();
    }

    @Deprecated
    public void enterForeground() {
        AppLifecycle.onForeground();
    }

    public void forceRecreateAccsSession() {
        this.h.forceCloseSession(true);
    }

    public static void checkAndStartAccsSession() {
        for (SessionCenter sessionCenter : f1131a.values()) {
            sessionCenter.h.checkAndStartSession();
        }
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        synchronized (SessionCenter.class) {
            if (!j) {
                Context appContext = Utils.getAppContext();
                if (appContext != null) {
                    init(appContext);
                }
            }
            SessionCenter sessionCenter = null;
            for (Map.Entry next : f1131a.entrySet()) {
                SessionCenter sessionCenter2 = (SessionCenter) next.getValue();
                if (next.getKey() != Config.DEFAULT_CONFIG) {
                    return sessionCenter2;
                }
                sessionCenter = sessionCenter2;
            }
            return sessionCenter;
        }
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        this.g.a(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.h.checkAndStartSession();
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        switchEnvironment(env);
    }

    public static synchronized SessionCenter getInstance(String str) {
        SessionCenter instance;
        synchronized (SessionCenter.class) {
            Config configByTag = Config.getConfigByTag(str);
            if (configByTag != null) {
                instance = getInstance(configByTag);
            } else {
                throw new RuntimeException("tag not exist!");
            }
        }
        return instance;
    }

    public void unregisterSessionInfo(String str) {
        SessionInfo a2 = this.g.a(str);
        if (a2 != null && a2.isKeepAlive) {
            this.h.checkAndStartSession();
        }
    }

    private SessionRequest a(HttpUrl httpUrl) {
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String scheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            scheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, scheme);
        }
        return a(StringUtils.concatString(scheme, "://", cNameByHost));
    }

    private SessionCenter(Config config) {
        this.f1134d = config;
        this.f1133c = config.getAppkey();
        this.i.a();
        this.h = new AccsSessionManager(this);
        if (!config.getAppkey().equals("[default]")) {
            anet.channel.strategy.dispatch.a.a((IAmdcSign) new c(this, config.getAppkey(), config.getSecurity()));
        }
    }

    private void a(l.b bVar) {
        for (Session session : this.f1135e.a(a(StringUtils.buildKey(bVar.f1400c, bVar.f1398a)))) {
            if (!StringUtils.isStringEqual(session.l, bVar.f1402e)) {
                ALog.i("awcn.SessionCenter", "unit change", session.p, "session unit", session.l, "unit", bVar.f1402e);
                session.close(true);
            }
        }
    }

    public static synchronized SessionCenter getInstance(Config config) {
        SessionCenter sessionCenter;
        synchronized (SessionCenter.class) {
            if (config != null) {
                if (!j) {
                    Context appContext = Utils.getAppContext();
                    if (appContext != null) {
                        init(appContext);
                    }
                }
                sessionCenter = f1131a.get(config);
                if (sessionCenter == null) {
                    sessionCenter = new SessionCenter(config);
                    f1131a.put(config, sessionCenter);
                }
            } else {
                throw new NullPointerException("config is null!");
            }
        }
        return sessionCenter;
    }

    public static synchronized void init(Context context) {
        synchronized (SessionCenter.class) {
            if (context != null) {
                GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
                if (!j) {
                    f1131a.put(Config.DEFAULT_CONFIG, new SessionCenter(Config.DEFAULT_CONFIG));
                    AppLifecycle.initialize();
                    NetworkStatusHelper.startListener(context);
                    StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                    if (GlobalAppRuntimeInfo.isTargetProcess()) {
                        anet.channel.d.a.a();
                        anet.channel.f.a.a();
                    }
                    j = true;
                }
            } else {
                ALog.e("awcn.SessionCenter", "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(l.d dVar) {
        try {
            l.b[] bVarArr = dVar.f1407b;
            for (l.b bVar : bVarArr) {
                if (bVar.k) {
                    b(bVar);
                }
                if (bVar.f1402e != null) {
                    a(bVar);
                }
            }
        } catch (Exception e2) {
            ALog.e("awcn.SessionCenter", "checkStrategy failed", this.f1133c, e2, new Object[0]);
        }
    }

    private void b(l.b bVar) {
        boolean z;
        boolean z2;
        ALog.i("awcn.SessionCenter", "find effectNow", this.f1133c, "host", bVar.f1398a);
        l.a[] aVarArr = bVar.h;
        String[] strArr = bVar.f1403f;
        for (Session session : this.f1135e.a(a(StringUtils.buildKey(bVar.f1400c, bVar.f1398a)))) {
            if (!session.getConnType().isHttpType()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        z = false;
                        break;
                    } else if (session.getIp().equals(strArr[i2])) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    if (ALog.isPrintLog(2)) {
                        ALog.i("awcn.SessionCenter", "ip not match", session.p, "session ip", session.getIp(), "ips", Arrays.toString(strArr));
                    }
                    session.close(true);
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 < aVarArr.length) {
                            if (session.getPort() == aVarArr[i3].f1392a && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(aVarArr[i3])))) {
                                z2 = true;
                                break;
                            }
                            i3++;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        if (ALog.isPrintLog(2)) {
                            ALog.i("awcn.SessionCenter", "aisle not match", session.p, "port", Integer.valueOf(session.getPort()), "connType", session.getConnType(), "aisle", Arrays.toString(aVarArr));
                        }
                        session.close(true);
                    }
                }
            }
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        int i2;
        synchronized (SessionCenter.class) {
            try {
                if (GlobalAppRuntimeInfo.getEnv() != env) {
                    ALog.i("awcn.SessionCenter", "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                    GlobalAppRuntimeInfo.setEnv(env);
                    StrategyCenter.getInstance().switchEnv();
                    SpdyAgent instance = SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
                    if (env == ENV.TEST) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    instance.switchAccsServer(i2);
                }
                Iterator<Map.Entry<Config, SessionCenter>> it2 = f1131a.entrySet().iterator();
                while (it2.hasNext()) {
                    SessionCenter sessionCenter = (SessionCenter) it2.next().getValue();
                    if (sessionCenter.f1134d.getEnv() != env) {
                        ALog.i("awcn.SessionCenter", "remove instance", sessionCenter.f1133c, "ENVIRONMENT", sessionCenter.f1134d.getEnv());
                        sessionCenter.h.forceCloseSession(false);
                        sessionCenter.i.b();
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                ALog.e("awcn.SessionCenter", "switch env error.", null, th, new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public SessionRequest a(String str) {
        SessionRequest sessionRequest;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f1136f) {
            sessionRequest = this.f1136f.get(str);
            if (sessionRequest == null) {
                sessionRequest = new SessionRequest(str, this);
                this.f1136f.put(str, sessionRequest);
            }
        }
        return sessionRequest;
    }

    public void registerPublicKey(String str, int i2) {
        this.g.a(str, i2);
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (SessionCenter.class) {
            init(context, str, GlobalAppRuntimeInfo.getEnv());
        }
    }

    public Session get(String str, long j2) {
        return get(HttpUrl.parse(str), c.f1213c, j2);
    }

    public Session getThrowsException(String str, long j2) throws Exception {
        return a(HttpUrl.parse(str), c.f1213c, j2, null);
    }

    public static synchronized void init(Context context, Config config) {
        synchronized (SessionCenter.class) {
            if (context == null) {
                ALog.e("awcn.SessionCenter", "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            } else if (config != null) {
                init(context);
                if (!f1131a.containsKey(config)) {
                    f1131a.put(config, new SessionCenter(config));
                }
            } else {
                ALog.e("awcn.SessionCenter", "paramter config is null!", null, new Object[0]);
                throw new NullPointerException("init failed. config is null");
            }
        }
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j2) {
        int i2;
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i2 = c.f1211a;
        } else {
            i2 = c.f1212b;
        }
        return get(httpUrl, i2, j2);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i2, long j2) throws Exception {
        return a(httpUrl, i2, j2, null);
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j2) throws Exception {
        int i2;
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i2 = c.f1211a;
        } else {
            i2 = c.f1212b;
        }
        return a(httpUrl, i2, j2, null);
    }

    public static synchronized void init(Context context, String str, ENV env) {
        synchronized (SessionCenter.class) {
            if (context != null) {
                Config config = Config.getConfig(str, env);
                if (config == null) {
                    config = new Config.Builder().setAppkey(str).setEnv(env).build();
                }
                init(context, config);
            } else {
                ALog.e("awcn.SessionCenter", "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j2) {
        int i2;
        HttpUrl parse = HttpUrl.parse(str);
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i2 = c.f1211a;
        } else {
            i2 = c.f1212b;
        }
        return get(parse, i2, j2);
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j2) throws Exception {
        int i2;
        HttpUrl parse = HttpUrl.parse(str);
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i2 = c.f1211a;
        } else {
            i2 = c.f1212b;
        }
        return a(parse, i2, j2, null);
    }

    public Session get(HttpUrl httpUrl, int i2, long j2) {
        try {
            return a(httpUrl, i2, j2, null);
        } catch (InvalidParameterException e2) {
            ALog.e("awcn.SessionCenter", "[Get]param url is invalid", this.f1133c, e2, PushConstants.WEB_URL, httpUrl);
            return null;
        } catch (TimeoutException e3) {
            ALog.e("awcn.SessionCenter", "[Get]timeout exception", this.f1133c, e3, PushConstants.WEB_URL, httpUrl.urlString());
            return null;
        } catch (ConnectException e4) {
            ALog.e("awcn.SessionCenter", "[Get]connect exception", this.f1133c, "errMsg", e4.getMessage(), PushConstants.WEB_URL, httpUrl.urlString());
            return null;
        } catch (NoAvailStrategyException e5) {
            ALog.i("awcn.SessionCenter", "[Get]" + e5.getMessage(), this.f1133c, null, PushConstants.WEB_URL, httpUrl.urlString());
            return null;
        } catch (Exception e6) {
            ALog.e("awcn.SessionCenter", "[Get]" + e6.getMessage(), this.f1133c, null, PushConstants.WEB_URL, httpUrl.urlString());
            return null;
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i2, long j2, SessionGetCallback sessionGetCallback) {
        if (sessionGetCallback == null) {
            throw new NullPointerException("cb is null");
        } else if (j2 > 0) {
            try {
                Session a2 = a(httpUrl, i2, j2, sessionGetCallback);
                if (a2 != null) {
                    sessionGetCallback.onSessionGetSuccess(a2);
                }
            } catch (Exception unused) {
                sessionGetCallback.onSessionGetFail();
            }
        } else {
            throw new InvalidParameterException("timeout must > 0");
        }
    }

    /* access modifiers changed from: protected */
    public Session a(HttpUrl httpUrl, int i2, long j2, SessionGetCallback sessionGetCallback) throws Exception {
        String str;
        int i3 = i2;
        long j3 = j2;
        if (!j) {
            ALog.e("awcn.SessionCenter", "getInternal not inited!", this.f1133c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        } else if (httpUrl != null) {
            String str2 = this.f1133c;
            Object[] objArr = new Object[6];
            objArr[0] = "u";
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            if (i3 == c.f1211a) {
                str = "LongLink";
            } else {
                str = "ShortLink";
            }
            objArr[3] = str;
            objArr[4] = "timeout";
            objArr[5] = Long.valueOf(j2);
            ALog.d("awcn.SessionCenter", "getInternal", str2, objArr);
            SessionRequest a2 = a(httpUrl);
            Session a3 = this.f1135e.a(a2, i3);
            if (a3 != null) {
                ALog.d("awcn.SessionCenter", "get internal hit cache session", this.f1133c, "session", a3);
            } else if (this.f1134d != Config.DEFAULT_CONFIG || i3 == c.f1212b) {
                if (GlobalAppRuntimeInfo.isAppBackground() && i3 == c.f1211a && AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                    SessionInfo b2 = this.g.b(httpUrl.host());
                    if (b2 != null && b2.isAccs) {
                        ALog.w("awcn.SessionCenter", "app background, forbid to create accs session", this.f1133c, new Object[0]);
                        throw new ConnectException("accs session connecting forbidden in background");
                    }
                }
                a2.a(this.f1132b, i2, i.a(this.f1133c), sessionGetCallback, j2);
                if (sessionGetCallback == null && j3 > 0 && (i3 == c.f1213c || a2.b() == i3)) {
                    a2.a(j3);
                    a3 = this.f1135e.a(a2, i3);
                    if (a3 == null) {
                        throw new ConnectException("session connecting failed or timeout");
                    }
                }
            } else {
                if (sessionGetCallback != null) {
                    sessionGetCallback.onSessionGetFail();
                }
                return null;
            }
            return a3;
        } else {
            throw new InvalidParameterException("httpUrl is null");
        }
    }
}
