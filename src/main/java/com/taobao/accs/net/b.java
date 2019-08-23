package com.taobao.accs.net;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.d;
import com.taobao.accs.ut.a.c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public String f78989a;

    /* renamed from: b  reason: collision with root package name */
    public String f78990b = "";

    /* renamed from: c  reason: collision with root package name */
    protected int f78991c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f78992d;

    /* renamed from: e  reason: collision with root package name */
    protected d f78993e;

    /* renamed from: f  reason: collision with root package name */
    protected int f78994f;
    protected volatile boolean g;
    public com.taobao.accs.client.b h;
    public AccsClientConfig i;
    protected String j;
    protected String k;
    protected LinkedHashMap<Integer, Message> l = new BaseConnection$1(this);
    public String m;
    private long n;
    private Runnable o;
    private ScheduledFuture<?> p;

    /* access modifiers changed from: protected */
    public String a(int i2) {
        switch (i2) {
            case 1:
                return "CONNECTED";
            case 2:
                return "CONNECTING";
            case 3:
                return "DISCONNECTED";
            case 4:
                return "DISCONNECTING";
            default:
                return "DISCONNECTED";
        }
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(Message message, boolean z);

    /* access modifiers changed from: protected */
    public abstract void a(String str, boolean z, String str2);

    public abstract void a(boolean z, boolean z2);

    public abstract boolean a(String str);

    public abstract void b();

    public abstract c c();

    /* access modifiers changed from: protected */
    public abstract String d();

    public void e() {
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return true;
    }

    public String i() {
        return this.f78990b;
    }

    /* access modifiers changed from: protected */
    public void g() {
        if (this.p != null) {
            this.p.cancel(true);
        }
    }

    public boolean k() {
        if (2 == this.i.getSecurity()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void f() {
        if (this.o == null) {
            this.o = new d(this);
        }
        g();
        this.p = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.o, 40000, TimeUnit.MILLISECONDS);
    }

    public com.taobao.accs.client.b j() {
        if (this.h == null) {
            ALog.d(d(), "new ClientManager", "configTag", this.m);
            this.h = new com.taobao.accs.client.b(this.f78992d, this.m);
        }
        return this.h;
    }

    public void b(Context context) {
        try {
            ThreadPoolExecutorFactory.schedule(new e(this, context), 10000, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ALog.w(d(), "startChannelService", th, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void b(int i2) {
        if (i2 < 0) {
            ALog.e(d(), "reSendAck", "dataId", Integer.valueOf(i2));
            Message message = this.l.get(Integer.valueOf(i2));
            if (message != null) {
                a(message, 5000);
                com.taobao.accs.utl.b.a("accs", "resend", "ack", 0.0d);
            }
        }
    }

    public String b(String str) {
        String str2;
        String inappHost = this.i.getInappHost();
        StringBuilder sb = new StringBuilder("https://");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        sb.append(str2);
        sb.append(inappHost);
        String sb2 = sb.toString();
        try {
            StringBuilder sb3 = new StringBuilder("https://");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb3.append(str);
            sb3.append(inappHost);
            return sb3.toString();
        } catch (Throwable th) {
            ALog.e("InAppConnection", "getHost", th, new Object[0]);
            return sb2;
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        try {
            ENV env = ENV.ONLINE;
            if (AccsClientConfig.mEnv == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (AccsClientConfig.mEnv == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.f78990b).setAppSecret(this.i.getAppSecret()).setAuthCode(this.i.getAuthCode()).setEnv(env).setTag(this.i.getAppKey()).build());
            String str = "acs";
            if (this.i.getInappPubKey() == 10 || this.i.getInappPubKey() == 11) {
                str = "open";
            }
            StrategyTemplate.getInstance().registerConnProtocol(this.i.getInappHost(), ConnProtocol.valueOf("http2", "0rtt", str, false));
        } catch (Throwable th) {
            ALog.e(d(), "initAwcn", th, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public String c(String str) {
        int i2;
        String l2 = UtilityImpl.l(this.f78992d);
        try {
            l2 = URLEncoder.encode(l2);
        } catch (Throwable th) {
            ALog.e(d(), "buildAuthUrl", th, new Object[0]);
        }
        String a2 = UtilityImpl.a(this.f78992d, i(), this.i.getAppSecret(), UtilityImpl.l(this.f78992d), this.m);
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append("auth?1=");
        sb.append(l2);
        sb.append("&2=");
        sb.append(a2);
        sb.append("&3=");
        sb.append(i());
        if (this.k != null) {
            sb.append("&4=");
            sb.append(this.k);
        }
        sb.append("&5=");
        sb.append(this.f78991c);
        sb.append("&6=");
        sb.append(UtilityImpl.g(this.f78992d));
        sb.append("&7=");
        sb.append(UtilityImpl.m(this.f78992d));
        sb.append("&8=");
        if (this.f78991c == 1) {
            i2 = "1.1.2";
        } else {
            i2 = 221;
        }
        sb.append(i2);
        sb.append("&9=");
        sb.append(System.currentTimeMillis());
        sb.append("&10=1");
        sb.append("&11=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&12=");
        sb.append(this.f78992d.getPackageName());
        sb.append("&13=");
        sb.append(UtilityImpl.o(this.f78992d));
        sb.append("&14=");
        sb.append(this.f78989a);
        sb.append("&15=");
        sb.append(UtilityImpl.c(Build.MODEL));
        sb.append("&16=");
        sb.append(UtilityImpl.c(Build.BRAND));
        sb.append("&17=221");
        sb.append("&19=");
        sb.append(k() ^ true ? 1 : 0);
        sb.append("&20=");
        sb.append(this.i.getStoreId());
        return sb.toString();
    }

    public void b(Message message, int i2) {
        this.f78993e.a(message, i2);
    }

    /* access modifiers changed from: protected */
    public boolean a(Message message, int i2) {
        boolean z = true;
        try {
            if (message.R > 3) {
                return false;
            }
            message.R++;
            message.Q = (long) i2;
            ALog.e(d(), "reSend dataid:" + message.q + " retryTimes:" + message.R, new Object[0]);
            b(message, true);
            try {
                if (message.e() != null) {
                    message.e().take_date = 0;
                    message.e().to_tnet_date = 0;
                    message.e().retry_times = message.R;
                    if (message.R == 1) {
                        com.taobao.accs.utl.b.a("accs", "resend", "total", 0.0d);
                    }
                }
            } catch (Throwable th) {
                th = th;
                this.f78993e.a(message, -8);
                ALog.e(d(), "reSend error", th, new Object[0]);
                return z;
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            z = false;
            this.f78993e.a(message, -8);
            ALog.e(d(), "reSend error", th, new Object[0]);
            return z;
        }
    }

    public void b(Message message, boolean z) {
        long j2;
        Message message2 = message;
        if (message2.f78928c || UtilityImpl.k(this.f78992d)) {
            if (message.a() != 2) {
                j2 = this.f78993e.f78947d.a(message2.H, message2.V);
            } else {
                j2 = 0;
            }
            if (j2 == -1) {
                ALog.e(d(), "sendMessage ready server limit high", "dataId", message2.q);
                this.f78993e.a(message2, 70021);
            } else if (j2 == -1000) {
                ALog.e(d(), "sendMessage ready server limit high for brush", "dataId", message2.q);
                this.f78993e.a(message2, 70023);
            } else {
                if (j2 > 0) {
                    if (System.currentTimeMillis() > this.n) {
                        message2.Q = j2;
                    } else {
                        message2.Q = (this.n + j2) - System.currentTimeMillis();
                    }
                    this.n = System.currentTimeMillis() + message2.Q;
                    ALog.e(d(), "sendMessage ready", "dataId", message2.q, "type", Message.c.b(message.a()), "delay", Long.valueOf(message2.Q));
                } else if ("accs".equals(message2.H)) {
                    ALog.e(d(), "sendMessage ready", "dataId", message2.q, "type", Message.c.b(message.a()), "delay", Long.valueOf(message2.Q));
                } else if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(d(), "sendMessage ready", "dataId", message2.q, "type", Message.c.b(message.a()), "delay", Long.valueOf(message2.Q));
                }
                try {
                    if (TextUtils.isEmpty(this.j)) {
                        this.j = UtilityImpl.l(this.f78992d);
                    }
                    if (!message.g()) {
                        a(message, z);
                    } else {
                        this.f78993e.a(message2, -9);
                    }
                } catch (RejectedExecutionException unused) {
                    this.f78993e.a(message2, 70008);
                    ALog.e(d(), "sendMessage ready queue full", "size", Integer.valueOf(ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size()));
                }
            }
        } else {
            ALog.e(d(), "sendMessage ready no network", "dataId", message2.q);
            this.f78993e.a(message2, -13);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, boolean z, long j2) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new c(this, str, z), j2, TimeUnit.MILLISECONDS);
    }

    protected b(Context context, int i2, String str) {
        this.f78991c = i2;
        this.f78992d = context.getApplicationContext();
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            ALog.e(d(), "BaseConnection config null!!", new Object[0]);
            try {
                configByTag = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setTag(str).build();
            } catch (AccsException e2) {
                ALog.e(d(), "BaseConnection build config", e2, new Object[0]);
            }
        }
        this.m = configByTag.getTag();
        this.f78990b = configByTag.getAppKey();
        this.i = configByTag;
        this.f78993e = new d(context, this);
        this.f78993e.f78945b = this.f78991c;
        ALog.d(d(), "new connection", new Object[0]);
    }
}
