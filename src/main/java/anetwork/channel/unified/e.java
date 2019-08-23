package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ENV;
import anet.channel.entity.c;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.d;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.http.NetworkSdkSetting;
import anetwork.channel.interceptor.Callback;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class e implements IUnifiedTask {

    /* renamed from: a  reason: collision with root package name */
    j f1566a;

    /* renamed from: b  reason: collision with root package name */
    Cache f1567b;

    /* renamed from: c  reason: collision with root package name */
    Cache.Entry f1568c;

    /* renamed from: d  reason: collision with root package name */
    ByteArrayOutputStream f1569d;

    /* renamed from: e  reason: collision with root package name */
    String f1570e = "other";

    /* renamed from: f  reason: collision with root package name */
    volatile Cancelable f1571f;
    volatile boolean g;
    volatile AtomicBoolean h;
    int i;
    int j;
    boolean k;
    boolean l;
    a m;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1572a;

        /* renamed from: b  reason: collision with root package name */
        Map<String, List<String>> f1573b;

        /* renamed from: c  reason: collision with root package name */
        List<ByteArray> f1574c = new ArrayList();

        /* access modifiers changed from: package-private */
        public void a() {
            for (ByteArray recycle : this.f1574c) {
                recycle.recycle();
            }
        }

        a(int i, Map<String, List<String>> map) {
            this.f1572a = i;
            this.f1573b = map;
        }

        /* access modifiers changed from: package-private */
        public int a(Callback callback, int i) {
            callback.onResponseCode(this.f1572a, this.f1573b);
            int i2 = 1;
            for (ByteArray onDataReceiveSize : this.f1574c) {
                callback.onDataReceiveSize(i2, i, onDataReceiveSize);
                i2++;
            }
            return i2;
        }
    }

    public void cancel() {
        this.g = true;
        if (this.f1571f != null) {
            this.f1571f.cancel();
        }
    }

    private Session b() {
        Session session;
        SessionCenter a2 = a();
        HttpUrl f2 = this.f1566a.f1591a.f();
        boolean containsNonDefaultPort = f2.containsNonDefaultPort();
        RequestStatistic requestStatistic = this.f1566a.f1591a.f1548b;
        if (this.f1566a.f1591a.f1552f != 1 || !NetworkConfigCenter.isSpdyEnabled() || this.f1566a.f1591a.f1547a != 0 || containsNonDefaultPort) {
            return a(null, a2, f2, containsNonDefaultPort);
        }
        HttpUrl a3 = a(f2);
        try {
            session = a2.getThrowsException(a3, c.f1211a, 0);
        } catch (NoAvailStrategyException unused) {
            return a(null, a2, f2, containsNonDefaultPort);
        } catch (Exception unused2) {
            session = null;
        }
        if (session == null) {
            g gVar = new g(this, a2, a3, requestStatistic, f2, containsNonDefaultPort);
            ThreadPoolExecutorFactory.submitPriorityTask(gVar, ThreadPoolExecutorFactory.Priority.NORMAL);
            return null;
        }
        ALog.i("anet.NetworkTask", "tryGetSession", this.f1566a.f1593c, "Session", session);
        requestStatistic.spdyRequestSend = true;
        return session;
    }

    private void c() {
        SessionCenter a2 = a();
        HttpUrl f2 = this.f1566a.f1591a.f();
        boolean containsNonDefaultPort = f2.containsNonDefaultPort();
        RequestStatistic requestStatistic = this.f1566a.f1591a.f1548b;
        Request a3 = this.f1566a.f1591a.a();
        if (this.f1566a.f1591a.f1552f != 1 || !NetworkConfigCenter.isSpdyEnabled() || this.f1566a.f1591a.f1547a != 0 || containsNonDefaultPort) {
            a(a(null, a2, f2, containsNonDefaultPort), a3);
            return;
        }
        HttpUrl a4 = a(f2);
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = c.f1211a;
        h hVar = new h(this, requestStatistic, currentTimeMillis, a3, a2, f2, containsNonDefaultPort);
        a2.asyncGet(a4, i2, 3000, hVar);
    }

    private SessionCenter a() {
        String a2 = this.f1566a.f1591a.a("APPKEY");
        if (TextUtils.isEmpty(a2)) {
            return SessionCenter.getInstance();
        }
        ENV env = ENV.ONLINE;
        String a3 = this.f1566a.f1591a.a("ENVIRONMENT");
        if ("pre".equalsIgnoreCase(a3)) {
            env = ENV.PREPARE;
        } else if ("test".equalsIgnoreCase(a3)) {
            env = ENV.TEST;
        }
        if (env != NetworkSdkSetting.CURRENT_ENV) {
            NetworkSdkSetting.CURRENT_ENV = env;
            SessionCenter.switchEnvironment(env);
        }
        Config config = Config.getConfig(a2, env);
        if (config == null) {
            config = new Config.Builder().setAppkey(a2).setEnv(env).setAuthCode(this.f1566a.f1591a.a("AuthCode")).build();
        }
        return SessionCenter.getInstance(config);
    }

    public void run() {
        if (!this.g) {
            RequestStatistic requestStatistic = this.f1566a.f1591a.f1548b;
            requestStatistic.f_refer = this.f1570e;
            if (!NetworkStatusHelper.isConnected()) {
                if (!NetworkConfigCenter.isRequestDelayRetryForNoNetwork() || requestStatistic.statusCode == -200) {
                    if (ALog.isPrintLog(2)) {
                        ALog.i("anet.NetworkTask", "network unavailable", this.f1566a.f1593c, "NetworkStatus", NetworkStatusHelper.getStatus());
                    }
                    this.h.set(true);
                    this.f1566a.a();
                    requestStatistic.isDone.set(true);
                    requestStatistic.statusCode = -200;
                    requestStatistic.msg = ErrorConstant.getErrMsg(-200);
                    requestStatistic.rspEnd = System.currentTimeMillis();
                    this.f1566a.f1592b.onFinish(new DefaultFinishEvent(-200, null, requestStatistic));
                    return;
                }
                requestStatistic.statusCode = -200;
                ThreadPoolExecutorFactory.submitScheduledTask(new f(this), 1000, TimeUnit.MILLISECONDS);
            } else if (!NetworkConfigCenter.isBgRequestForbidden() || !GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0 || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= ((long) NetworkConfigCenter.getBgForbidRequestThreshold()) || NetworkConfigCenter.isUrlInWhiteList(this.f1566a.f1591a.f())) {
                if (ALog.isPrintLog(2)) {
                    ALog.i("anet.NetworkTask", "exec request", this.f1566a.f1593c, "retryTimes", Integer.valueOf(this.f1566a.f1591a.f1547a));
                }
                if (NetworkConfigCenter.isGetSessionAsyncEnable()) {
                    c();
                    return;
                }
                try {
                    Session b2 = b();
                    if (b2 != null) {
                        a(b2, this.f1566a.f1591a.a());
                    }
                } catch (Exception e2) {
                    ALog.e("anet.NetworkTask", "send request failed.", this.f1566a.f1593c, e2, new Object[0]);
                }
            } else {
                this.h.set(true);
                this.f1566a.a();
                if (ALog.isPrintLog(2)) {
                    ALog.i("anet.NetworkTask", "request forbidden in background", this.f1566a.f1593c, PushConstants.WEB_URL, this.f1566a.f1591a.f());
                }
                requestStatistic.isDone.set(true);
                requestStatistic.statusCode = -205;
                requestStatistic.msg = ErrorConstant.getErrMsg(-205);
                requestStatistic.rspEnd = System.currentTimeMillis();
                this.f1566a.f1592b.onFinish(new DefaultFinishEvent(-205, null, requestStatistic));
                ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-205, null, "rt");
                exceptionStatistic.host = this.f1566a.f1591a.f().host();
                exceptionStatistic.url = this.f1566a.f1591a.g();
                AppMonitor.getInstance().commitStat(exceptionStatistic);
            }
        }
    }

    private HttpUrl a(HttpUrl httpUrl) {
        String str = this.f1566a.f1591a.h().get("x-host-cname");
        if (TextUtils.isEmpty(str)) {
            return httpUrl;
        }
        HttpUrl parse = HttpUrl.parse(httpUrl.urlString().replaceFirst(httpUrl.host(), str));
        if (parse != null) {
            return parse;
        }
        return httpUrl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private anet.channel.request.Request a(anet.channel.request.Request r7) {
        /*
            r6 = this;
            anetwork.channel.unified.j r0 = r6.f1566a
            anetwork.channel.entity.g r0 = r0.f1591a
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x003e
            anetwork.channel.unified.j r0 = r6.f1566a
            anetwork.channel.entity.g r0 = r0.f1591a
            java.lang.String r0 = r0.g()
            java.lang.String r0 = anetwork.channel.cookie.CookieManager.getCookie(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x003e
            anet.channel.request.Request$Builder r1 = r7.newBuilder()
            java.util.Map r2 = r7.getHeaders()
            java.lang.String r3 = "Cookie"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0038
            java.lang.String r3 = "; "
            java.lang.String r0 = anet.channel.util.StringUtils.concatString(r2, r3, r0)
        L_0x0038:
            java.lang.String r2 = "Cookie"
            r1.addHeader(r2, r0)
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            anetwork.channel.cache.Cache$Entry r0 = r6.f1568c
            if (r0 == 0) goto L_0x006f
            if (r1 != 0) goto L_0x0049
            anet.channel.request.Request$Builder r1 = r7.newBuilder()
        L_0x0049:
            anetwork.channel.cache.Cache$Entry r0 = r6.f1568c
            java.lang.String r0 = r0.etag
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "If-None-Match"
            anetwork.channel.cache.Cache$Entry r2 = r6.f1568c
            java.lang.String r2 = r2.etag
            r1.addHeader(r0, r2)
        L_0x0058:
            anetwork.channel.cache.Cache$Entry r0 = r6.f1568c
            long r2 = r0.lastModified
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            java.lang.String r0 = "If-Modified-Since"
            anetwork.channel.cache.Cache$Entry r2 = r6.f1568c
            long r2 = r2.lastModified
            java.lang.String r2 = anetwork.channel.cache.a.a((long) r2)
            r1.addHeader(r0, r2)
        L_0x006f:
            anetwork.channel.unified.j r0 = r6.f1566a
            anetwork.channel.entity.g r0 = r0.f1591a
            int r0 = r0.f1547a
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "weex"
            java.lang.String r2 = r6.f1570e
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x008c
            if (r1 != 0) goto L_0x0087
            anet.channel.request.Request$Builder r1 = r7.newBuilder()
        L_0x0087:
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.setReadTimeout(r0)
        L_0x008c:
            if (r1 != 0) goto L_0x008f
            return r7
        L_0x008f:
            anet.channel.request.Request r7 = r1.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.e.a(anet.channel.request.Request):anet.channel.request.Request");
    }

    /* access modifiers changed from: private */
    public void a(Session session, Request request) {
        if (session != null && !this.g) {
            Request a2 = a(request);
            RequestStatistic requestStatistic = this.f1566a.f1591a.f1548b;
            requestStatistic.reqStart = System.currentTimeMillis();
            this.f1571f = session.request(a2, new i(this, a2, requestStatistic));
        }
    }

    e(j jVar, Cache cache, Cache.Entry entry) {
        this.f1566a = jVar;
        this.h = jVar.f1594d;
        this.f1567b = cache;
        this.f1568c = entry;
        this.f1570e = jVar.f1591a.h().get("f-refer");
    }

    /* access modifiers changed from: private */
    public Session a(d dVar, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z) {
        RequestStatistic requestStatistic = this.f1566a.f1591a.f1548b;
        if (dVar == null && this.f1566a.f1591a.e() && !z && !NetworkStatusHelper.isProxy()) {
            dVar = sessionCenter.get(httpUrl, c.f1212b, 0);
        }
        if (dVar == null) {
            ALog.i("anet.NetworkTask", "create HttpSession with local DNS", this.f1566a.f1593c, new Object[0]);
            dVar = new d(GlobalAppRuntimeInfo.getContext(), new anet.channel.entity.a(StringUtils.concatString(httpUrl.scheme(), "://", httpUrl.host()), this.f1566a.f1593c, null));
        }
        if (requestStatistic.spdyRequestSend) {
            requestStatistic.degraded = 1;
        }
        ALog.i("anet.NetworkTask", "tryGetHttpSession", this.f1566a.f1593c, "Session", dVar);
        return dVar;
    }
}
