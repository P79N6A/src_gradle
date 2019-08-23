package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.b.a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.g;
import com.taobao.accs.net.b;
import com.taobao.accs.net.s;
import com.taobao.accs.ut.a.c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.e;
import java.net.URL;
import java.util.Map;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.android.agoo.common.Config;
import org.android.agoo.service.IMessageService;

public class ServiceImpl extends a {

    /* renamed from: e  reason: collision with root package name */
    private static a f78977e;

    /* renamed from: b  reason: collision with root package name */
    private Service f78978b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Context f78979c;

    /* renamed from: d  reason: collision with root package name */
    private long f78980d;

    /* renamed from: f  reason: collision with root package name */
    private String f78981f = "unknown";
    private final IMessageService.Stub g = new IMessageService.Stub() {
        public boolean ping() throws RemoteException {
            return true;
        }

        public void probe() throws RemoteException {
            ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao begin......messageServiceBinder [probe]", new Object[0]);
            ThreadPoolExecutorFactory.execute(new b(this));
        }
    };

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                Process.killProcess(i);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + i);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void onCreate() {
        super.onCreate();
        a();
    }

    private void c() {
        if (f78982a != null && f78982a.size() != 0) {
            for (Map.Entry value : f78982a.entrySet()) {
                ((b) value.getValue()).b();
            }
        }
    }

    private void d() {
        if (f78982a != null && f78982a.size() != 0) {
            for (Map.Entry value : f78982a.entrySet()) {
                c c2 = ((b) value.getValue()).c();
                if (c2 != null) {
                    c2.h = this.f78980d;
                    c2.a();
                }
            }
        }
    }

    private void e() {
        if (f78982a != null && f78982a.size() != 0) {
            for (Map.Entry value : f78982a.entrySet()) {
                ((b) value.getValue()).e();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ALog.e("ServiceImpl", "Service onDestroy", new Object[0]);
        UtilityImpl.a(this.f78979c, "service_end", System.currentTimeMillis());
        this.f78978b = null;
        this.f78979c = null;
        e();
        _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
    }

    private void a() {
        ALog.d("ServiceImpl", "init start", new Object[0]);
        GlobalClientInfo.getInstance(this.f78979c);
        com.taobao.accs.client.a.g.incrementAndGet();
        this.f78980d = System.currentTimeMillis();
        this.f78981f = UtilityImpl.h(this.f78979c);
        if (Config.f(this.f78979c)) {
            a.c(this.f78979c);
            a a2 = a.a(this.f78979c, 600, false);
            f78977e = a2;
            if (a2 != null) {
                f78977e.a();
            }
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("ServiceImpl", "init", "sdkVersion", 221, "procStart", Integer.valueOf(com.taobao.accs.client.a.g.intValue()));
        }
        UTMini.getInstance().commitEvent(66001, "START", UtilityImpl.d(), "PROXY");
        long n = UtilityImpl.n(this.f78979c);
        ALog.d("ServiceImpl", "getServiceAliveTime", "aliveTime", Long.valueOf(n));
        if (n > 20000) {
            com.taobao.accs.utl.b.a("accs", "service_alive", "", (double) (n / 1000));
        }
        UtilityImpl.a(this.f78979c, "service_start", System.currentTimeMillis());
        UTMini.getInstance().commitEvent(66001, "NOTIFY", UtilityImpl.r(this.f78979c));
    }

    private synchronized void b() {
        if (f78982a != null) {
            if (f78982a.size() != 0) {
                for (Map.Entry entry : f78982a.entrySet()) {
                    b bVar = (b) entry.getValue();
                    if (bVar == null) {
                        ALog.e("ServiceImpl", "tryConnect connection null", "appkey", bVar.i());
                        return;
                    }
                    ALog.i("ServiceImpl", "tryConnect", "appkey", bVar.i(), "configTag", entry.getKey());
                    if (!bVar.k() || !TextUtils.isEmpty(bVar.i.getAppSecret())) {
                        bVar.a();
                    } else {
                        ALog.e("ServiceImpl", "tryConnect secret is null", new Object[0]);
                    }
                }
                return;
            }
        }
        ALog.w("ServiceImpl", "tryConnect no connections", new Object[0]);
    }

    public ServiceImpl(Service service) {
        super(service);
        this.f78978b = service;
        this.f78979c = service.getApplicationContext();
    }

    private void b(Intent intent) {
        b bVar;
        Message message;
        Message.ReqType reqType;
        URL url;
        Intent intent2 = intent;
        int intExtra = intent2.getIntExtra("command", -1);
        ALog.i("ServiceImpl", "handleCommand", "command", Integer.valueOf(intExtra));
        String stringExtra = intent2.getStringExtra("packageName");
        String stringExtra2 = intent2.getStringExtra("serviceId");
        String stringExtra3 = intent2.getStringExtra("userInfo");
        String stringExtra4 = intent2.getStringExtra("appKey");
        String stringExtra5 = intent2.getStringExtra("configTag");
        String stringExtra6 = intent2.getStringExtra("ttid");
        intent2.getStringExtra("sid");
        intent2.getStringExtra("anti_brush_cookie");
        if (intExtra == 201) {
            a(Message.a(true, 0), true);
            d();
        }
        if (intExtra > 0 && !TextUtils.isEmpty(stringExtra)) {
            b a2 = a(this.f78979c, stringExtra5, true);
            if (a2 != null) {
                a2.a();
                Message message2 = null;
                if (intExtra != 1) {
                    bVar = a2;
                    if (intExtra == 2) {
                        ALog.e("ServiceImpl", "onHostStartCommand COMMAND_UNBIND_APP", new Object[0]);
                        if (bVar.j().d(stringExtra)) {
                            Message a3 = Message.a(bVar, stringExtra);
                            ALog.i("ServiceImpl", stringExtra + " isAppUnbinded", new Object[0]);
                            bVar.b(a3, 200);
                            return;
                        }
                    } else if (intExtra == 5) {
                        message2 = Message.a(stringExtra, stringExtra2);
                    } else if (intExtra == 6) {
                        message2 = Message.b(stringExtra, stringExtra2);
                    } else if (intExtra == 3) {
                        message = Message.c(stringExtra, stringExtra3);
                        if (bVar.j().b(stringExtra, stringExtra3) && !intent2.getBooleanExtra("fouce_bind", false)) {
                            ALog.i("ServiceImpl", stringExtra + "/" + stringExtra3 + " isUserBinded", new Object[0]);
                            if (message != null) {
                                bVar.b(message, 200);
                            }
                            return;
                        }
                    } else if (intExtra == 4) {
                        message2 = Message.a(stringExtra);
                    } else if (intExtra == 100) {
                        byte[] byteArrayExtra = intent2.getByteArrayExtra("data");
                        String stringExtra7 = intent2.getStringExtra("dataId");
                        String stringExtra8 = intent2.getStringExtra("target");
                        String stringExtra9 = intent2.getStringExtra("businessId");
                        String stringExtra10 = intent2.getStringExtra("extTag");
                        try {
                            reqType = (Message.ReqType) intent2.getSerializableExtra("send_type");
                        } catch (Exception unused) {
                            reqType = null;
                        }
                        if (byteArrayExtra != null) {
                            try {
                                url = new URL("https://" + ((s) bVar).m());
                            } catch (Exception unused2) {
                                url = null;
                            }
                            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(stringExtra3, stringExtra2, byteArrayExtra, stringExtra7, stringExtra8, url, stringExtra9);
                            accsRequest.setTag(stringExtra10);
                            if (reqType == null) {
                                message2 = Message.a(bVar, this.f78979c, stringExtra, accsRequest, false);
                            } else if (reqType == Message.ReqType.REQ) {
                                message2 = Message.a(bVar, this.f78979c, stringExtra, "2|", accsRequest, false);
                            }
                        }
                    } else if (intExtra == 106) {
                        intent2.setAction("com.taobao.accs.intent.action.RECEIVE");
                        intent2.putExtra("command", -1);
                        g.a(this.f78979c, intent2);
                        return;
                    }
                    message = message2;
                } else if (!stringExtra.equals(this.f78979c.getPackageName())) {
                    ALog.e("ServiceImpl", "handleCommand bindapp pkg error", new Object[0]);
                    return;
                } else {
                    bVar = a2;
                    Message a4 = Message.a(this.f78979c, stringExtra5, stringExtra4, intent2.getStringExtra("app_sercet"), stringExtra, stringExtra6, intent2.getStringExtra("appVersion"));
                    bVar.f78989a = stringExtra6;
                    UtilityImpl.d(this.f78979c, stringExtra4);
                    if (!bVar.j().c(stringExtra) || intent2.getBooleanExtra("fouce_bind", false)) {
                        message = a4;
                    } else {
                        ALog.i("ServiceImpl", stringExtra + " isAppBinded", new Object[0]);
                        bVar.b(a4, 200);
                        return;
                    }
                }
                if (message != null) {
                    ALog.d("ServiceImpl", "try send message", new Object[0]);
                    if (message.e() != null) {
                        message.e().onSend();
                    }
                    bVar.b(message, true);
                    return;
                }
                ALog.e("ServiceImpl", "message is null", new Object[0]);
                bVar.b(Message.a(stringExtra, intExtra), -2);
            } else {
                ALog.e("ServiceImpl", "no connection", "configTag", stringExtra5, "command", Integer.valueOf(intExtra));
            }
        }
    }

    public int a(Intent intent) {
        String str;
        int i = 1;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("ServiceImpl", "onHostStartCommand", "intent", intent);
        }
        try {
            if (ALog.isPrintLog(ALog.Level.D) && intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    for (String str2 : extras.keySet()) {
                        ALog.d("ServiceImpl", "onHostStartCommand", "key", str2, " value", extras.get(str2));
                    }
                }
            }
            int c2 = e.c();
            if (c2 > 3) {
                try {
                    ALog.e("ServiceImpl", "onHostStartCommand load SO fail 4 times, don't auto restart", new Object[0]);
                    com.taobao.accs.utl.b.a("accs", "sofail", UtilityImpl.a(c2), 0.0d);
                    i = 2;
                } catch (Throwable th) {
                    th = th;
                    i = 2;
                    try {
                        ALog.e("ServiceImpl", "onHostStartCommand", th, new Object[0]);
                        com.taobao.accs.client.a.g.incrementAndGet();
                        return i;
                    } catch (Throwable th2) {
                        com.taobao.accs.client.a.g.incrementAndGet();
                        throw th2;
                    }
                }
            }
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if (TextUtils.isEmpty(str)) {
                b();
                a(false, false);
                com.taobao.accs.client.a.g.incrementAndGet();
                return i;
            }
            a(intent, str);
            com.taobao.accs.client.a.g.incrementAndGet();
            return i;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a(Message message, boolean z) {
        if (f78982a != null && f78982a.size() != 0) {
            for (Map.Entry value : f78982a.entrySet()) {
                ((b) value.getValue()).b(message, z);
            }
        }
    }

    private void a(boolean z, boolean z2) {
        if (f78982a != null && f78982a.size() != 0) {
            for (Map.Entry value : f78982a.entrySet()) {
                b bVar = (b) value.getValue();
                bVar.a(z, z2);
                ALog.i("ServiceImpl", "ping connection", "appkey", bVar.i());
            }
        }
    }

    private void a(Intent intent, String str) {
        ALog.d("ServiceImpl", "handleAction", "action", str);
        try {
            if (!TextUtils.isEmpty(str) && "org.agoo.android.intent.action.PING_V4".equals(str)) {
                String stringExtra = intent.getStringExtra("source");
                ALog.i("ServiceImpl", "org.agoo.android.intent.action.PING_V4,start channel by brothers", "serviceStart", Integer.valueOf(com.taobao.accs.client.a.g.intValue()), "source" + stringExtra);
                com.taobao.accs.utl.b.a("accs", "startChannel", stringExtra, 0.0d);
                if (com.taobao.accs.client.a.c()) {
                    com.taobao.accs.utl.b.a("accs", "createChannel", stringExtra, 0.0d);
                }
            }
            b();
            if (!TextUtils.equals(str, "android.intent.action.PACKAGE_REMOVED")) {
                if (TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                    String h = UtilityImpl.h(this.f78979c);
                    boolean k = UtilityImpl.k(this.f78979c);
                    ALog.i("ServiceImpl", "network change:" + this.f78981f + " to " + h, new Object[0]);
                    if (k) {
                        this.f78981f = h;
                        c();
                        a(true, false);
                        UTMini.getInstance().commitEvent(66001, "CONNECTIVITY_CHANGE", h, UtilityImpl.d(), PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    if (h.equals("unknown")) {
                        c();
                        this.f78981f = h;
                    }
                } else if (TextUtils.equals(str, "android.intent.action.BOOT_COMPLETED")) {
                    a(true, false);
                } else if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
                    ALog.d("ServiceImpl", "action android.intent.action.USER_PRESENT", new Object[0]);
                    a(true, false);
                } else if (str.equals("com.taobao.accs.intent.action.COMMAND")) {
                    b(intent);
                } else if (str.equals("com.taobao.accs.intent.action.START_FROM_AGOO")) {
                    ALog.i("ServiceImpl", "ACTION_START_FROM_AGOO", new Object[0]);
                }
            }
        } catch (Throwable th) {
            ALog.e("ServiceImpl", "handleAction", th, new Object[0]);
        }
    }
}
