package com.taobao.accs.net;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.DataFrameCb;
import anet.channel.IAuth;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionInfo;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.ut.a.c;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class j extends b implements DataFrameCb {
    private boolean n = true;
    /* access modifiers changed from: private */
    public long o = 3600000;
    private ScheduledFuture p;
    private Runnable q = new k(this);
    private Runnable r = new p(this);
    private Set<String> s = Collections.synchronizedSet(new HashSet());

    public static class a implements IAuth {

        /* renamed from: a  reason: collision with root package name */
        private String f79011a;

        /* renamed from: b  reason: collision with root package name */
        private int f79012b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f79013c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public b f79014d;

        public a(b bVar, String str) {
            this.f79013c = bVar.d();
            this.f79011a = bVar.c("https://" + str + "/accs/");
            this.f79012b = bVar.f78991c;
            this.f79014d = bVar;
        }

        public void auth(Session session, IAuth.AuthCallback authCallback) {
            ALog.e(this.f79013c, "auth", "URL", this.f79011a);
            session.request(new Request.Builder().setUrl(this.f79011a).build(), new q(this, authCallback));
        }
    }

    public void a(boolean z, boolean z2) {
    }

    public c c() {
        return null;
    }

    public void b() {
        this.f78994f = 0;
    }

    public void e() {
        ALog.e(d(), "shut down", new Object[0]);
        this.n = false;
    }

    public synchronized void a() {
        ALog.d(d(), "start", new Object[0]);
        this.n = true;
        a(this.f78992d);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "InAppConn_" + this.m;
    }

    /* access modifiers changed from: private */
    public void l() {
        if (this.i.isAccsHeartbeatEnable()) {
            ALog.e(d(), "startAccsHeartBeat", new Object[0]);
            this.p = ThreadPoolExecutorFactory.getScheduledExecutor().scheduleAtFixedRate(this.q, this.o, this.o, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        boolean z;
        try {
            if (!this.g) {
                super.a(context);
                String inappHost = this.i.getInappHost();
                if (!h() || !this.i.isKeepalive()) {
                    ALog.d(d(), "initAwcn close keepalive", new Object[0]);
                    z = false;
                } else {
                    z = true;
                }
                a(SessionCenter.getInstance(this.i.getAppKey()), inappHost, z);
                this.g = true;
                ALog.i(d(), "initAwcn success!", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.e(d(), "initAwcn", th, new Object[0]);
        }
    }

    public void a(AccsClientConfig accsClientConfig) {
        if (accsClientConfig == null) {
            ALog.i(d(), "updateConfig null", new Object[0]);
        } else if (accsClientConfig.equals(this.i)) {
            ALog.w(d(), "updateConfig not any changed", new Object[0]);
        } else {
            try {
                boolean z = true;
                ALog.w(d(), "updateConfig", "old", this.i, "new", accsClientConfig);
                String inappHost = this.i.getInappHost();
                String inappHost2 = accsClientConfig.getInappHost();
                SessionCenter instance = SessionCenter.getInstance(this.i.getAppKey());
                if (instance == null) {
                    ALog.w(d(), "updateConfig not need update", new Object[0]);
                    return;
                }
                instance.unregisterSessionInfo(inappHost);
                ALog.w(d(), "updateConfig unregisterSessionInfo", "host", inappHost);
                if (this.s.contains(inappHost)) {
                    this.s.remove(inappHost);
                    ALog.w(d(), "updateConfig removeSessionRegistered", "oldHost", inappHost);
                }
                this.i = accsClientConfig;
                this.f78990b = this.i.getAppKey();
                this.m = this.i.getTag();
                if (!h() || !this.i.isKeepalive()) {
                    ALog.i(d(), "updateConfig close keepalive", new Object[0]);
                    z = false;
                }
                a(instance, inappHost2, z);
            } catch (Throwable th) {
                ALog.e(d(), "updateConfig", th, new Object[0]);
            }
        }
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            ALog.e(d(), "onReceiveAccsHeartbeatResp response data is null", new Object[0]);
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(d(), "onReceiveAccsHeartbeatResp", "data", jSONObject2);
        }
        try {
            int i = jSONObject2.getInt("timeInterval");
            if (i != -1) {
                long j = this.o;
                long j2 = (long) (i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                if (j != j2) {
                    if (i == 0) {
                        j2 = 3600000;
                    }
                    this.o = j2;
                    this.p = ThreadPoolExecutorFactory.getScheduledExecutor().scheduleAtFixedRate(this.q, this.o, this.o, TimeUnit.MILLISECONDS);
                }
            } else if (this.p != null) {
                this.p.cancel(true);
            }
        } catch (JSONException e2) {
            ALog.e(d(), "onReceiveAccsHeartbeatResp", "e", e2.getMessage());
        }
    }

    public boolean a(String str) {
        boolean z;
        if (str == null) {
            return false;
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f78993e.f78944a.get(str);
        if (scheduledFuture != null) {
            z = scheduledFuture.cancel(false);
        } else {
            z = false;
        }
        if (z) {
            ALog.e(d(), "cancel", "customDataId", str);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void a(Message message, boolean z) {
        if (!this.n || message == null) {
            String d2 = d();
            ALog.e(d2, "not running or msg null! " + this.n, new Object[0]);
            return;
        }
        try {
            if (ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size() <= 1000) {
                ScheduledFuture<?> schedule = ThreadPoolExecutorFactory.getSendScheduledExecutor().schedule(new l(this, message), message.Q, TimeUnit.MILLISECONDS);
                if (message.a() == 1 && message.O != null) {
                    if (message.c() && a(message.O)) {
                        this.f78993e.b(message);
                    }
                    this.f78993e.f78944a.put(message.O, schedule);
                }
                NetPerformanceMonitor e2 = message.e();
                if (e2 != null) {
                    e2.setDeviceId(UtilityImpl.l(this.f78992d));
                    e2.setConnType(this.f78991c);
                    e2.onEnterQueueData();
                }
                return;
            }
            throw new RejectedExecutionException("accs");
        } catch (RejectedExecutionException unused) {
            this.f78993e.a(message, 70008);
            String d3 = d();
            ALog.e(d3, "send queue full count:" + ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size(), new Object[0]);
        } catch (Throwable th) {
            this.f78993e.a(message, -8);
            ALog.e(d(), "send error", th, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, boolean z, long j) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new m(this, str, z), j, TimeUnit.MILLISECONDS);
    }

    public void a(SessionCenter sessionCenter, String str, boolean z) {
        if (!this.s.contains(str)) {
            sessionCenter.registerSessionInfo(SessionInfo.create(str, z, true, new a(this, str), null, this));
            sessionCenter.registerPublicKey(str, this.i.getInappPubKey());
            this.s.add(str);
            ALog.i(d(), "registerSessionInfo", "host", str);
        }
    }

    public j(Context context, int i, String str) {
        super(context, i, str);
        if (!h.a(true)) {
            String c2 = UtilityImpl.c(this.f78992d, "inapp");
            String d2 = d();
            ALog.d(d2, "config tnet log path:" + c2, new Object[0]);
            if (!TextUtils.isEmpty(c2)) {
                Session.configTnetALog(context, c2, 5242880, 5);
            }
        }
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.r, 120000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void a(String str, boolean z, String str2) {
        try {
            Message b2 = this.f78993e.b(str);
            if (!(b2 == null || b2.f78931f == null)) {
                Session session = SessionCenter.getInstance(this.i.getAppKey()).get(b2.f78931f.toString(), 0);
                if (session != null) {
                    if (z) {
                        session.close(true);
                        return;
                    }
                    session.ping(true);
                }
            }
        } catch (Exception e2) {
            ALog.e(d(), "onTimeOut", e2, new Object[0]);
        }
    }

    public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i, int i2) {
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new n(this, i2, bArr, tnetSpdySession));
    }

    public void onException(int i, int i2, boolean z, String str) {
        String d2 = d();
        ALog.e(d2, "errorId:" + i2 + "detail:" + str + " dataId:" + i + " needRetry:" + z, new Object[0]);
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new o(this, i, z, i2));
    }
}
