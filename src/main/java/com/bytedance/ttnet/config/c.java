package com.bytedance.ttnet.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.frameworks.baselib.network.dispatcher.ApiThread;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.frameworks.baselib.network.http.util.g;
import com.bytedance.ttnet.TTNetInit;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements WeakHandler.IHandler {
    private static c l;
    private static final Queue<Pair<String, JSONObject>> o = new LinkedBlockingQueue();
    private static boolean p = true;

    /* renamed from: a  reason: collision with root package name */
    int f22599a = 1800;

    /* renamed from: b  reason: collision with root package name */
    int f22600b = 60;

    /* renamed from: c  reason: collision with root package name */
    public int f22601c = 2;

    /* renamed from: d  reason: collision with root package name */
    long f22602d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, a> f22603e = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: f  reason: collision with root package name */
    public a f22604f;
    a g;
    AtomicLong h = new AtomicLong(-1);
    String i = null;
    int j = -1;
    AtomicBoolean k = new AtomicBoolean(false);
    private final Context m;
    private final WeakHandler n = new WeakHandler(Looper.getMainLooper(), this);

    class a {

        /* renamed from: a  reason: collision with root package name */
        String f22609a;

        /* renamed from: b  reason: collision with root package name */
        int f22610b;

        /* renamed from: c  reason: collision with root package name */
        int f22611c;

        /* renamed from: d  reason: collision with root package name */
        int f22612d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f22613e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f22614f = -1;
        int g = -1;
        long h = -1;
        int i = -1;
        String j = "";

        public final int b() {
            if (this.f22612d != -1) {
                return this.f22612d + this.f22611c;
            }
            if (this.g != -1) {
                return this.g + this.f22611c;
            }
            return Integer.MAX_VALUE;
        }

        public final boolean a() {
            if (this.f22612d != -1) {
                if (this.f22612d <= this.f22610b) {
                    return true;
                }
            } else if (this.g != -1 && this.g <= this.f22610b) {
                return true;
            }
            return false;
        }

        public final JSONObject c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", this.f22609a);
            jSONObject.put("max_time", this.f22610b);
            jSONObject.put("weight_time", this.f22611c);
            jSONObject.put("https_select_cost", this.f22612d);
            jSONObject.put("https_select_time", this.f22613e);
            jSONObject.put("https_status", this.f22614f);
            jSONObject.put("http_select_cost", this.g);
            jSONObject.put("http_select_time", this.h);
            jSONObject.put("http_status", this.i);
            jSONObject.put("scheme", this.j);
            return jSONObject;
        }

        public final String toString() {
            return "NetChannel{host='" + this.f22609a + '\'' + ", maxTime=" + this.f22610b + ", weightTime=" + this.f22611c + ", httpsSelectCost=" + this.f22612d + ", httpsSelectTime=" + this.f22613e + ", httpsStatus=" + this.f22614f + ", httpSelectCost=" + this.g + ", httpSelectTime=" + this.h + ", httpStatus=" + this.i + ", scheme='" + this.j + '\'' + '}';
        }

        a() {
        }

        public final void a(a aVar) {
            if (aVar != null) {
                this.f22612d = aVar.f22612d;
                this.f22613e = aVar.f22613e;
                this.f22614f = aVar.f22614f;
                this.g = aVar.g;
                this.h = aVar.h;
                this.i = aVar.i;
                this.j = aVar.j;
            }
        }
    }

    public final void a(String str, Context context, boolean z, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                jSONObject2.put("from", str);
                a(context, "ss_net_channel_select", jSONObject2);
            } catch (Throwable unused) {
            }
        } else if (!z || this.f22604f == null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", this.h.get());
            Object obj = jSONObject;
            if (jSONObject == null) {
                obj = "";
            }
            jSONObject3.put("pre", obj);
            jSONObject3.put("all", b());
            jSONObject3.put("from", str);
            a(context, "ss_net_channel_select", jSONObject3);
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("id", this.h.get());
            Object obj2 = jSONObject;
            if (jSONObject == null) {
                obj2 = "";
            }
            jSONObject4.put("pre", obj2);
            jSONObject4.put("cur", this.f22604f.c());
            jSONObject4.put("from", str);
            a(context, "ss_net_channel_select", jSONObject4);
        }
    }

    private JSONObject b() {
        if (this.f22603e == null || this.f22603e.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (c.class) {
            for (Map.Entry next : this.f22603e.entrySet()) {
                if (next != null) {
                    try {
                        jSONArray.put(((a) next.getValue()).c());
                    } catch (Exception unused) {
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("i_host_list", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public final Pair<String, String> a() {
        synchronized (c.class) {
            if (this.f22604f == null) {
                return null;
            }
            Logger.debug();
            Pair<String, String> pair = new Pair<>(this.f22604f.j, this.f22604f.f22609a);
            return pair;
        }
    }

    public final void a(a aVar) {
        this.f22604f = aVar;
        this.g = b(aVar);
    }

    public static c a(Context context) {
        if (l == null) {
            synchronized (c.class) {
                if (l == null) {
                    l = new c(context);
                }
            }
        }
        return l;
    }

    private a b(a aVar) {
        if (aVar == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.f22609a = aVar.f22609a;
        aVar2.f22610b = aVar.f22610b;
        aVar2.f22611c = aVar.f22611c;
        aVar2.a(aVar);
        return aVar2;
    }

    public static int d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Throwable unused) {
            return -2;
        }
    }

    static String e(Context context) {
        try {
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getBSSID();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void c(Context context) {
        if (context != null) {
            try {
                synchronized (a.class) {
                    SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "ss_app_config", 0).edit();
                    a(edit);
                    SharedPrefsEditorCompat.apply(edit);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 105) {
                    Logger.debug();
                    b(this.m);
                    this.n.sendEmptyMessageDelayed(105, (long) (this.f22599a * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private c(Context context) {
        this.m = context;
    }

    public final void b(Context context) {
        if (context != null) {
            try {
                if (System.currentTimeMillis() - this.f22602d > ((long) (this.f22599a * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
                    Logger.debug();
                    a(context, "onActivityResume");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(SharedPreferences.Editor editor) {
        if (editor != null) {
            try {
                JSONObject b2 = b();
                Logger.debug();
                if (b2 != null) {
                    editor.putString("i_host_select", b2.toString());
                    if (this.f22604f != null) {
                        editor.putString("i_host_select_netchannel_host", this.f22604f.f22609a);
                    } else {
                        editor.putString("i_host_select_netchannel_host", "");
                    }
                    editor.putInt("i_host_select_interval", this.f22599a);
                    editor.putInt("i_host_select_interval_http_timeout", this.f22600b);
                    editor.putInt("i_host_max_fail", this.f22601c);
                    editor.putLong("i_host_last_select_time", this.f22602d);
                    editor.putLong("i_host_atomic_long", this.h.longValue());
                    editor.putString("i_host_last_bssid", this.i);
                    editor.putInt("i_host_last_net_type", this.j);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Context context, String str) {
        boolean z;
        if (!this.k.get() && this.f22603e != null && this.f22603e.size() > 0 && context != null) {
            try {
                if (g.a(context) && a.a(context).n()) {
                    Logger.debug();
                    if (NetworkUtils.isNetworkAvailable(context)) {
                        a a2 = a.a(context);
                        if (a2.k == null || !a2.k.a(a2.l)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            final LinkedList linkedList = new LinkedList();
                            synchronized (c.class) {
                                for (Map.Entry<String, a> value : this.f22603e.entrySet()) {
                                    linkedList.add(value.getValue());
                                }
                            }
                            this.k.getAndSet(true);
                            this.f22602d = System.currentTimeMillis();
                            this.n.removeMessages(105);
                            this.n.sendEmptyMessageDelayed(105, (long) (this.f22599a * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                            this.j = d(context);
                            if (this.j == 1) {
                                this.i = e(context);
                            }
                            if (this.h.get() >= Long.MAX_VALUE) {
                                this.h.getAndSet(-1);
                            }
                            this.h.getAndIncrement();
                            final Context context2 = context;
                            final String str2 = str;
                            AnonymousClass1 r3 = new ApiThread("SelectThread", IRequest.Priority.NORMAL) {
                                /* JADX WARNING: Can't wrap try/catch for region: R(5:187|188|(3:190|(1:192)(1:193)|194)(3:195|196|197)|198|199) */
                                /* JADX WARNING: Can't wrap try/catch for region: R(5:94|95|(3:97|(1:99)(1:100)|101)(3:102|103|104)|105|106) */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01e4 */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:198:0x0348 */
                                /* JADX WARNING: Removed duplicated region for block: B:126:0x0206 A[Catch:{ Throwable -> 0x03a1 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:129:0x021a A[Catch:{ Throwable -> 0x03a1 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:130:0x0225 A[Catch:{ Throwable -> 0x03a1 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:132:0x0231 A[SYNTHETIC, Splitter:B:132:0x0231] */
                                /* JADX WARNING: Removed duplicated region for block: B:134:0x0234 A[Catch:{ Throwable -> 0x025f }] */
                                /* JADX WARNING: Removed duplicated region for block: B:137:0x023c A[Catch:{ Throwable -> 0x025f }] */
                                /* JADX WARNING: Removed duplicated region for block: B:138:0x023f A[Catch:{ Throwable -> 0x025f }] */
                                /* JADX WARNING: Removed duplicated region for block: B:141:0x0245 A[Catch:{ Throwable -> 0x025f }] */
                                /* JADX WARNING: Removed duplicated region for block: B:142:0x0248 A[Catch:{ Throwable -> 0x025f }] */
                                /* JADX WARNING: Removed duplicated region for block: B:148:0x0262 A[SYNTHETIC] */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void run() {
                                    /*
                                        r26 = this;
                                        r1 = r26
                                        java.util.List r0 = r7     // Catch:{ Throwable -> 0x03a1 }
                                        if (r0 == 0) goto L_0x0391
                                        java.util.List r0 = r7     // Catch:{ Throwable -> 0x03a1 }
                                        int r0 = r0.size()     // Catch:{ Throwable -> 0x03a1 }
                                        if (r0 > 0) goto L_0x0010
                                        goto L_0x0391
                                    L_0x0010:
                                        r3 = 0
                                    L_0x0011:
                                        r0 = 2
                                        if (r3 >= r0) goto L_0x0360
                                        java.lang.String r0 = "https"
                                        r5 = 1
                                        if (r3 != r5) goto L_0x001e
                                        java.lang.String r0 = "http"
                                        r5 = r0
                                        r6 = 0
                                        goto L_0x0020
                                    L_0x001e:
                                        r5 = r0
                                        r6 = 1
                                    L_0x0020:
                                        java.util.List r0 = r7     // Catch:{ Throwable -> 0x03a1 }
                                        java.util.Iterator r7 = r0.iterator()     // Catch:{ Throwable -> 0x03a1 }
                                        r8 = 0
                                        r13 = 0
                                    L_0x0028:
                                        boolean r0 = r7.hasNext()     // Catch:{ Throwable -> 0x03a1 }
                                        if (r0 == 0) goto L_0x02b3
                                        java.lang.Object r0 = r7.next()     // Catch:{ Throwable -> 0x03a1 }
                                        r9 = r0
                                        com.bytedance.ttnet.config.c$a r9 = (com.bytedance.ttnet.config.c.a) r9     // Catch:{ Throwable -> 0x03a1 }
                                        java.lang.String r0 = r9.f22609a     // Catch:{ Throwable -> 0x03a1 }
                                        java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03a1 }
                                        r10.<init>()     // Catch:{ Throwable -> 0x03a1 }
                                        r10.append(r5)     // Catch:{ Throwable -> 0x03a1 }
                                        java.lang.String r11 = "://"
                                        r10.append(r11)     // Catch:{ Throwable -> 0x03a1 }
                                        r10.append(r0)     // Catch:{ Throwable -> 0x03a1 }
                                        java.lang.String r11 = "/network/get_network/"
                                        r10.append(r11)     // Catch:{ Throwable -> 0x03a1 }
                                        java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x03a1 }
                                        long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x03a1 }
                                        r14 = -1
                                        java.lang.String r15 = "onErr"
                                        java.lang.String r2 = r9     // Catch:{ Throwable -> 0x01fd }
                                        boolean r2 = r15.equals(r2)     // Catch:{ Throwable -> 0x01fd }
                                        if (r2 == 0) goto L_0x009b
                                        com.bytedance.ttnet.config.c r2 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x01fd }
                                        com.bytedance.ttnet.config.c$a r2 = r2.f22604f     // Catch:{ Throwable -> 0x01fd }
                                        if (r2 == 0) goto L_0x009b
                                        com.bytedance.ttnet.config.c r2 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x01fd }
                                        com.bytedance.ttnet.config.c$a r2 = r2.f22604f     // Catch:{ Throwable -> 0x01fd }
                                        java.lang.String r2 = r2.f22609a     // Catch:{ Throwable -> 0x01fd }
                                        boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x01fd }
                                        if (r0 == 0) goto L_0x009b
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x01fd }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ Throwable -> 0x01fd }
                                        java.lang.String r0 = r0.j     // Catch:{ Throwable -> 0x01fd }
                                        boolean r0 = r5.equals(r0)     // Catch:{ Throwable -> 0x01fd }
                                        if (r0 == 0) goto L_0x009b
                                        r16 = r5
                                        r4 = -1
                                        if (r6 == 0) goto L_0x008e
                                        r9.f22612d = r14     // Catch:{ Throwable -> 0x01fb }
                                        r9.f22613e = r4     // Catch:{ Throwable -> 0x01fb }
                                        r9.f22614f = r14     // Catch:{ Throwable -> 0x01fb }
                                        java.lang.String r0 = "https"
                                        r9.j = r0     // Catch:{ Throwable -> 0x01fb }
                                        goto L_0x0098
                                    L_0x008e:
                                        r9.g = r14     // Catch:{ Throwable -> 0x01fb }
                                        r9.h = r4     // Catch:{ Throwable -> 0x01fb }
                                        r9.i = r14     // Catch:{ Throwable -> 0x01fb }
                                        java.lang.String r0 = "http"
                                        r9.j = r0     // Catch:{ Throwable -> 0x01fb }
                                    L_0x0098:
                                        r5 = r16
                                        goto L_0x0028
                                    L_0x009b:
                                        r16 = r5
                                        android.content.Context r0 = r8     // Catch:{ Throwable -> 0x01fb }
                                        boolean r0 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r0)     // Catch:{ Throwable -> 0x01fb }
                                        if (r0 != 0) goto L_0x00a7
                                        goto L_0x02b3
                                    L_0x00a7:
                                        com.bytedance.ttnet.c r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x01fb }
                                        r0.a((int) r14, (java.lang.String) r10)     // Catch:{ Throwable -> 0x01fb }
                                        com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x01fb }
                                        long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01fb }
                                        r0 = 0
                                        long r4 = r4 - r11
                                        int r0 = (int) r4     // Catch:{ Throwable -> 0x01fb }
                                        com.bytedance.ttnet.config.c r2 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x01fb }
                                        com.bytedance.ttnet.config.c$a r2 = r2.f22604f     // Catch:{ Throwable -> 0x01fb }
                                        if (r2 == 0) goto L_0x00c7
                                        com.bytedance.ttnet.config.c r2 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x01fb }
                                        com.bytedance.ttnet.config.c$a r2 = r2.f22604f     // Catch:{ Throwable -> 0x01fb }
                                        org.json.JSONObject r2 = r2.c()     // Catch:{ Throwable -> 0x01fb }
                                        goto L_0x00c8
                                    L_0x00c7:
                                        r2 = r13
                                    L_0x00c8:
                                        r4 = 200(0xc8, float:2.8E-43)
                                        if (r6 == 0) goto L_0x00d7
                                        r9.f22612d = r0     // Catch:{ Throwable -> 0x00d3 }
                                        r9.f22613e = r11     // Catch:{ Throwable -> 0x00d3 }
                                        r9.f22614f = r4     // Catch:{ Throwable -> 0x00d3 }
                                        goto L_0x00dd
                                    L_0x00d3:
                                        r0 = move-exception
                                        r13 = r2
                                        goto L_0x0200
                                    L_0x00d7:
                                        r9.g = r0     // Catch:{ Throwable -> 0x00d3 }
                                        r9.h = r11     // Catch:{ Throwable -> 0x00d3 }
                                        r9.i = r4     // Catch:{ Throwable -> 0x00d3 }
                                    L_0x00dd:
                                        if (r6 == 0) goto L_0x00e2
                                        long r4 = r9.f22613e     // Catch:{ Throwable -> 0x0114 }
                                        goto L_0x00e4
                                    L_0x00e2:
                                        long r4 = r9.h     // Catch:{ Throwable -> 0x0114 }
                                    L_0x00e4:
                                        r20 = r4
                                        java.lang.String r0 = r9.f22609a     // Catch:{ Throwable -> 0x0114 }
                                        if (r6 == 0) goto L_0x00ed
                                        int r4 = r9.f22612d     // Catch:{ Throwable -> 0x0114 }
                                        goto L_0x00ef
                                    L_0x00ed:
                                        int r4 = r9.g     // Catch:{ Throwable -> 0x0114 }
                                    L_0x00ef:
                                        r23 = r4
                                        if (r6 == 0) goto L_0x00f6
                                        java.lang.String r4 = "https"
                                        goto L_0x00f8
                                    L_0x00f6:
                                        java.lang.String r4 = "http"
                                    L_0x00f8:
                                        r24 = r4
                                        if (r6 == 0) goto L_0x00ff
                                        int r4 = r9.f22614f     // Catch:{ Throwable -> 0x0114 }
                                        goto L_0x0101
                                    L_0x00ff:
                                        int r4 = r9.i     // Catch:{ Throwable -> 0x0114 }
                                    L_0x0101:
                                        r25 = r4
                                        com.bytedance.ttnet.config.c r4 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x0114 }
                                        android.content.Context r5 = r8     // Catch:{ Throwable -> 0x0114 }
                                        java.lang.String r10 = r9     // Catch:{ Throwable -> 0x0114 }
                                        r17 = r4
                                        r18 = r5
                                        r19 = r10
                                        r22 = r0
                                        r17.a(r18, r19, r20, r22, r23, r24, r25)     // Catch:{ Throwable -> 0x0114 }
                                    L_0x0114:
                                        java.lang.Class<com.bytedance.ttnet.config.c> r4 = com.bytedance.ttnet.config.c.class
                                        monitor-enter(r4)     // Catch:{ Throwable -> 0x00d3 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f8 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x01f8 }
                                        if (r0 == 0) goto L_0x0143
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f8 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x01f8 }
                                        java.lang.String r0 = r0.f22609a     // Catch:{ all -> 0x01f8 }
                                        if (r0 == 0) goto L_0x0143
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f8 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x01f8 }
                                        java.lang.String r0 = r0.f22609a     // Catch:{ all -> 0x01f8 }
                                        java.lang.String r5 = r9.f22609a     // Catch:{ all -> 0x01f8 }
                                        boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x01f8 }
                                        if (r0 == 0) goto L_0x0143
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f8 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x01f8 }
                                        boolean r0 = r0.a()     // Catch:{ all -> 0x01f8 }
                                        if (r0 != 0) goto L_0x0143
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f8 }
                                        r5 = 0
                                        r0.a((com.bytedance.ttnet.config.c.a) r5)     // Catch:{ all -> 0x01f8 }
                                    L_0x0143:
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f8 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x01f8 }
                                        java.lang.String r5 = r9.f22609a     // Catch:{ all -> 0x01f8 }
                                        boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x01f8 }
                                        if (r0 == 0) goto L_0x0160
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f8 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x01f8 }
                                        java.lang.String r5 = r9.f22609a     // Catch:{ all -> 0x01f8 }
                                        java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x01f8 }
                                        com.bytedance.ttnet.config.c$a r0 = (com.bytedance.ttnet.config.c.a) r0     // Catch:{ all -> 0x01f8 }
                                        if (r0 == r9) goto L_0x0160
                                        r0.a(r9)     // Catch:{ all -> 0x01f8 }
                                    L_0x0160:
                                        monitor-exit(r4)     // Catch:{ all -> 0x01f8 }
                                        android.content.Context r0 = r8     // Catch:{ Throwable -> 0x00d3 }
                                        boolean r0 = com.bytedance.common.utility.NetworkUtils.is2G(r0)     // Catch:{ Throwable -> 0x00d3 }
                                        if (r0 != 0) goto L_0x0173
                                        boolean r0 = r9.a()     // Catch:{ Throwable -> 0x00d3 }
                                        if (r0 == 0) goto L_0x0170
                                        goto L_0x0173
                                    L_0x0170:
                                        r13 = r2
                                        goto L_0x0098
                                    L_0x0173:
                                        java.lang.Class<com.bytedance.ttnet.config.c> r4 = com.bytedance.ttnet.config.c.class
                                        monitor-enter(r4)     // Catch:{ Throwable -> 0x00d3 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f5 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x01f5 }
                                        java.lang.String r5 = r9.f22609a     // Catch:{ all -> 0x01f5 }
                                        boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x01f5 }
                                        if (r0 == 0) goto L_0x01b4
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f5 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x01f5 }
                                        java.lang.String r5 = r9.f22609a     // Catch:{ all -> 0x01f5 }
                                        java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x01f5 }
                                        com.bytedance.ttnet.config.c$a r0 = (com.bytedance.ttnet.config.c.a) r0     // Catch:{ all -> 0x01f5 }
                                        if (r6 == 0) goto L_0x0195
                                        java.lang.String r5 = "https"
                                        r0.j = r5     // Catch:{ all -> 0x01f5 }
                                        goto L_0x0199
                                    L_0x0195:
                                        java.lang.String r5 = "http"
                                        r0.j = r5     // Catch:{ all -> 0x01f5 }
                                    L_0x0199:
                                        com.bytedance.ttnet.config.c r5 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f5 }
                                        r5.a((com.bytedance.ttnet.config.c.a) r0)     // Catch:{ all -> 0x01f5 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f5 }
                                        java.lang.String r5 = r9     // Catch:{ all -> 0x01f5 }
                                        android.content.Context r10 = r8     // Catch:{ all -> 0x01f5 }
                                        r20 = 1
                                        r22 = 0
                                        r17 = r0
                                        r18 = r5
                                        r19 = r10
                                        r21 = r2
                                        r17.a(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01f5 }
                                        goto L_0x01e4
                                    L_0x01b4:
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x01f5 }
                                        r5 = 0
                                        r0.a((com.bytedance.ttnet.config.c.a) r5)     // Catch:{ all -> 0x01f5 }
                                        org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01e4 }
                                        r0.<init>()     // Catch:{ Throwable -> 0x01e4 }
                                        java.lang.String r5 = "net_channel"
                                        org.json.JSONObject r10 = r9.c()     // Catch:{ Throwable -> 0x01e4 }
                                        r0.put(r5, r10)     // Catch:{ Throwable -> 0x01e4 }
                                        java.lang.String r5 = "map_net_channel"
                                        java.lang.String r10 = "null"
                                        r0.put(r5, r10)     // Catch:{ Throwable -> 0x01e4 }
                                        com.bytedance.ttnet.config.c r5 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x01e4 }
                                        java.lang.String r10 = r9     // Catch:{ Throwable -> 0x01e4 }
                                        android.content.Context r13 = r8     // Catch:{ Throwable -> 0x01e4 }
                                        r20 = 0
                                        r17 = r5
                                        r18 = r10
                                        r19 = r13
                                        r21 = r2
                                        r22 = r0
                                        r17.a(r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x01e4 }
                                    L_0x01e4:
                                        monitor-exit(r4)     // Catch:{ all -> 0x01f5 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x00d3 }
                                        android.content.Context r4 = r8     // Catch:{ Throwable -> 0x00d3 }
                                        r0.c(r4)     // Catch:{ Throwable -> 0x00d3 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x00d3 }
                                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.k     // Catch:{ Throwable -> 0x00d3 }
                                        r4 = 0
                                        r0.getAndSet(r4)     // Catch:{ Throwable -> 0x00d3 }
                                        return
                                    L_0x01f5:
                                        r0 = move-exception
                                        monitor-exit(r4)     // Catch:{ all -> 0x01f5 }
                                        throw r0     // Catch:{ Throwable -> 0x00d3 }
                                    L_0x01f8:
                                        r0 = move-exception
                                        monitor-exit(r4)     // Catch:{ all -> 0x01f8 }
                                        throw r0     // Catch:{ Throwable -> 0x00d3 }
                                    L_0x01fb:
                                        r0 = move-exception
                                        goto L_0x0200
                                    L_0x01fd:
                                        r0 = move-exception
                                        r16 = r5
                                    L_0x0200:
                                        com.bytedance.ttnet.config.c r2 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c$a r2 = r2.f22604f     // Catch:{ Throwable -> 0x03a1 }
                                        if (r2 == 0) goto L_0x020f
                                        com.bytedance.ttnet.config.c r2 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c$a r2 = r2.f22604f     // Catch:{ Throwable -> 0x03a1 }
                                        org.json.JSONObject r2 = r2.c()     // Catch:{ Throwable -> 0x03a1 }
                                        r13 = r2
                                    L_0x020f:
                                        com.bytedance.ttnet.c r2 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x03a1 }
                                        r4 = 0
                                        int r0 = r2.a((java.lang.Throwable) r0, (java.lang.String[]) r4)     // Catch:{ Throwable -> 0x03a1 }
                                        if (r6 == 0) goto L_0x0225
                                        r9.f22612d = r14     // Catch:{ Throwable -> 0x03a1 }
                                        r9.f22613e = r11     // Catch:{ Throwable -> 0x03a1 }
                                        r9.f22614f = r0     // Catch:{ Throwable -> 0x03a1 }
                                        java.lang.String r2 = "https"
                                        r9.j = r2     // Catch:{ Throwable -> 0x03a1 }
                                        goto L_0x022f
                                    L_0x0225:
                                        r9.g = r14     // Catch:{ Throwable -> 0x03a1 }
                                        r9.h = r11     // Catch:{ Throwable -> 0x03a1 }
                                        r9.i = r0     // Catch:{ Throwable -> 0x03a1 }
                                        java.lang.String r2 = "http"
                                        r9.j = r2     // Catch:{ Throwable -> 0x03a1 }
                                    L_0x022f:
                                        if (r6 == 0) goto L_0x0234
                                        long r4 = r9.f22613e     // Catch:{ Throwable -> 0x025f }
                                        goto L_0x0236
                                    L_0x0234:
                                        long r4 = r9.h     // Catch:{ Throwable -> 0x025f }
                                    L_0x0236:
                                        r20 = r4
                                        java.lang.String r2 = r9.f22609a     // Catch:{ Throwable -> 0x025f }
                                        if (r6 == 0) goto L_0x023f
                                        int r4 = r9.f22612d     // Catch:{ Throwable -> 0x025f }
                                        goto L_0x0241
                                    L_0x023f:
                                        int r4 = r9.g     // Catch:{ Throwable -> 0x025f }
                                    L_0x0241:
                                        r23 = r4
                                        if (r6 == 0) goto L_0x0248
                                        java.lang.String r4 = "https"
                                        goto L_0x024a
                                    L_0x0248:
                                        java.lang.String r4 = "http"
                                    L_0x024a:
                                        r24 = r4
                                        com.bytedance.ttnet.config.c r4 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x025f }
                                        android.content.Context r5 = r8     // Catch:{ Throwable -> 0x025f }
                                        java.lang.String r10 = r9     // Catch:{ Throwable -> 0x025f }
                                        r17 = r4
                                        r18 = r5
                                        r19 = r10
                                        r22 = r2
                                        r25 = r0
                                        r17.a(r18, r19, r20, r22, r23, r24, r25)     // Catch:{ Throwable -> 0x025f }
                                    L_0x025f:
                                        java.lang.Class<com.bytedance.ttnet.config.c> r2 = com.bytedance.ttnet.config.c.class
                                        monitor-enter(r2)     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x02b0 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x02b0 }
                                        if (r0 == 0) goto L_0x028e
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x02b0 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x02b0 }
                                        java.lang.String r0 = r0.f22609a     // Catch:{ all -> 0x02b0 }
                                        if (r0 == 0) goto L_0x028e
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x02b0 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x02b0 }
                                        java.lang.String r0 = r0.f22609a     // Catch:{ all -> 0x02b0 }
                                        java.lang.String r4 = r9.f22609a     // Catch:{ all -> 0x02b0 }
                                        boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x02b0 }
                                        if (r0 == 0) goto L_0x028e
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x02b0 }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x02b0 }
                                        boolean r0 = r0.a()     // Catch:{ all -> 0x02b0 }
                                        if (r0 != 0) goto L_0x028e
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x02b0 }
                                        r4 = 0
                                        r0.a((com.bytedance.ttnet.config.c.a) r4)     // Catch:{ all -> 0x02b0 }
                                    L_0x028e:
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x02b0 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x02b0 }
                                        java.lang.String r4 = r9.f22609a     // Catch:{ all -> 0x02b0 }
                                        boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x02b0 }
                                        if (r0 == 0) goto L_0x02ab
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x02b0 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x02b0 }
                                        java.lang.String r4 = r9.f22609a     // Catch:{ all -> 0x02b0 }
                                        java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x02b0 }
                                        com.bytedance.ttnet.config.c$a r0 = (com.bytedance.ttnet.config.c.a) r0     // Catch:{ all -> 0x02b0 }
                                        if (r0 == r9) goto L_0x02ab
                                        r0.a(r9)     // Catch:{ all -> 0x02b0 }
                                    L_0x02ab:
                                        monitor-exit(r2)     // Catch:{ all -> 0x02b0 }
                                        int r8 = r8 + 1
                                        goto L_0x0098
                                    L_0x02b0:
                                        r0 = move-exception
                                        monitor-exit(r2)     // Catch:{ all -> 0x02b0 }
                                        throw r0     // Catch:{ Throwable -> 0x03a1 }
                                    L_0x02b3:
                                        if (r6 == 0) goto L_0x02bd
                                        java.util.List r0 = r7     // Catch:{ Throwable -> 0x03a1 }
                                        int r0 = r0.size()     // Catch:{ Throwable -> 0x03a1 }
                                        if (r8 == r0) goto L_0x035c
                                    L_0x02bd:
                                        java.util.List r0 = r7     // Catch:{ Throwable -> 0x03a1 }
                                        java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x03a1 }
                                        r2 = 0
                                    L_0x02c4:
                                        boolean r4 = r0.hasNext()     // Catch:{ Throwable -> 0x03a1 }
                                        if (r4 == 0) goto L_0x02ea
                                        java.lang.Object r4 = r0.next()     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c$a r4 = (com.bytedance.ttnet.config.c.a) r4     // Catch:{ Throwable -> 0x03a1 }
                                        if (r2 != 0) goto L_0x02dd
                                        int r5 = r4.b()     // Catch:{ Throwable -> 0x03a1 }
                                        r7 = 2147483647(0x7fffffff, float:NaN)
                                        if (r5 >= r7) goto L_0x02dd
                                    L_0x02db:
                                        r2 = r4
                                        goto L_0x02c4
                                    L_0x02dd:
                                        if (r2 == 0) goto L_0x02c4
                                        int r5 = r4.b()     // Catch:{ Throwable -> 0x03a1 }
                                        int r7 = r2.b()     // Catch:{ Throwable -> 0x03a1 }
                                        if (r5 >= r7) goto L_0x02c4
                                        goto L_0x02db
                                    L_0x02ea:
                                        if (r2 == 0) goto L_0x035c
                                        java.lang.Class<com.bytedance.ttnet.config.c> r3 = com.bytedance.ttnet.config.c.class
                                        monitor-enter(r3)     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x0359 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x0359 }
                                        java.lang.String r4 = r2.f22609a     // Catch:{ all -> 0x0359 }
                                        boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0359 }
                                        if (r0 == 0) goto L_0x0323
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x0359 }
                                        java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r0 = r0.f22603e     // Catch:{ all -> 0x0359 }
                                        java.lang.String r2 = r2.f22609a     // Catch:{ all -> 0x0359 }
                                        java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0359 }
                                        com.bytedance.ttnet.config.c$a r0 = (com.bytedance.ttnet.config.c.a) r0     // Catch:{ all -> 0x0359 }
                                        if (r6 == 0) goto L_0x030e
                                        java.lang.String r2 = "https"
                                        r0.j = r2     // Catch:{ all -> 0x0359 }
                                        goto L_0x0312
                                    L_0x030e:
                                        java.lang.String r2 = "http"
                                        r0.j = r2     // Catch:{ all -> 0x0359 }
                                    L_0x0312:
                                        com.bytedance.ttnet.config.c r2 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x0359 }
                                        r2.a((com.bytedance.ttnet.config.c.a) r0)     // Catch:{ all -> 0x0359 }
                                        com.bytedance.ttnet.config.c r9 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x0359 }
                                        java.lang.String r10 = r9     // Catch:{ all -> 0x0359 }
                                        android.content.Context r11 = r8     // Catch:{ all -> 0x0359 }
                                        r12 = 1
                                        r14 = 0
                                        r9.a(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0359 }
                                        goto L_0x0348
                                    L_0x0323:
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x0359 }
                                        r4 = 0
                                        r0.a((com.bytedance.ttnet.config.c.a) r4)     // Catch:{ all -> 0x0359 }
                                        org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0348 }
                                        r14.<init>()     // Catch:{ Throwable -> 0x0348 }
                                        java.lang.String r0 = "net_channel"
                                        org.json.JSONObject r2 = r2.c()     // Catch:{ Throwable -> 0x0348 }
                                        r14.put(r0, r2)     // Catch:{ Throwable -> 0x0348 }
                                        java.lang.String r0 = "map_net_channel"
                                        java.lang.String r2 = "null"
                                        r14.put(r0, r2)     // Catch:{ Throwable -> 0x0348 }
                                        com.bytedance.ttnet.config.c r9 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x0348 }
                                        java.lang.String r10 = r9     // Catch:{ Throwable -> 0x0348 }
                                        android.content.Context r11 = r8     // Catch:{ Throwable -> 0x0348 }
                                        r12 = 0
                                        r9.a(r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x0348 }
                                    L_0x0348:
                                        monitor-exit(r3)     // Catch:{ all -> 0x0359 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x03a1 }
                                        android.content.Context r2 = r8     // Catch:{ Throwable -> 0x03a1 }
                                        r0.c(r2)     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x03a1 }
                                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.k     // Catch:{ Throwable -> 0x03a1 }
                                        r2 = 0
                                        r0.getAndSet(r2)     // Catch:{ Throwable -> 0x03a1 }
                                        return
                                    L_0x0359:
                                        r0 = move-exception
                                        monitor-exit(r3)     // Catch:{ all -> 0x0359 }
                                        throw r0     // Catch:{ Throwable -> 0x03a1 }
                                    L_0x035c:
                                        int r3 = r3 + 1
                                        goto L_0x0011
                                    L_0x0360:
                                        java.lang.Class<com.bytedance.ttnet.config.c> r2 = com.bytedance.ttnet.config.c.class
                                        monitor-enter(r2)     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x038e }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x038e }
                                        if (r0 == 0) goto L_0x0373
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x038e }
                                        com.bytedance.ttnet.config.c$a r0 = r0.f22604f     // Catch:{ all -> 0x038e }
                                        org.json.JSONObject r4 = r0.c()     // Catch:{ all -> 0x038e }
                                        r9 = r4
                                        goto L_0x0374
                                    L_0x0373:
                                        r9 = 0
                                    L_0x0374:
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x038e }
                                        r3 = 0
                                        r0.a((com.bytedance.ttnet.config.c.a) r3)     // Catch:{ all -> 0x038e }
                                        com.bytedance.ttnet.config.c r5 = com.bytedance.ttnet.config.c.this     // Catch:{ all -> 0x038e }
                                        java.lang.String r6 = r9     // Catch:{ all -> 0x038e }
                                        android.content.Context r7 = r8     // Catch:{ all -> 0x038e }
                                        r8 = 0
                                        r10 = 0
                                        r5.a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x038e }
                                        monitor-exit(r2)     // Catch:{ all -> 0x038e }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x03a1 }
                                        android.content.Context r2 = r8     // Catch:{ Throwable -> 0x03a1 }
                                        r0.c(r2)     // Catch:{ Throwable -> 0x03a1 }
                                        goto L_0x03a1
                                    L_0x038e:
                                        r0 = move-exception
                                        monitor-exit(r2)     // Catch:{ all -> 0x038e }
                                        throw r0     // Catch:{ Throwable -> 0x03a1 }
                                    L_0x0391:
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x03a1 }
                                        android.content.Context r2 = r8     // Catch:{ Throwable -> 0x03a1 }
                                        r0.c(r2)     // Catch:{ Throwable -> 0x03a1 }
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this     // Catch:{ Throwable -> 0x03a1 }
                                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.k     // Catch:{ Throwable -> 0x03a1 }
                                        r2 = 0
                                        r0.getAndSet(r2)     // Catch:{ Throwable -> 0x03a1 }
                                        return
                                    L_0x03a1:
                                        com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.this
                                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.k
                                        r2 = 0
                                        r0.getAndSet(r2)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.c.AnonymousClass1.run():void");
                                }
                            };
                            r3.start();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Context context, JSONObject jSONObject) {
        if (context != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("i_host_list");
                Logger.debug();
                if (jSONObject.has("i_host_last_select_time")) {
                    this.f22602d = jSONObject.optLong("i_host_last_select_time");
                }
                this.f22599a = jSONObject.optInt("i_host_select_interval", 1800);
                this.f22600b = jSONObject.optInt("i_host_select_interval_http_timeout", 60);
                this.f22601c = jSONObject.optInt("i_host_max_fail", 2);
                int length = optJSONArray.length();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        a aVar = new a();
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            aVar.f22609a = optJSONObject.optString("host");
                            aVar.f22610b = optJSONObject.optInt("max_time");
                            aVar.f22611c = optJSONObject.optInt("weight_time");
                            aVar.f22612d = optJSONObject.optInt("https_select_cost", -1);
                            aVar.f22613e = optJSONObject.optLong("https_select_time", -1);
                            aVar.f22614f = optJSONObject.optInt("https_status", -1);
                            aVar.g = optJSONObject.optInt("http_select_cost", -1);
                            aVar.h = optJSONObject.optLong("http_select_time", -1);
                            aVar.i = optJSONObject.optInt("http_status", -1);
                            aVar.j = optJSONObject.optString("scheme");
                        }
                        a aVar2 = this.f22603e.get(aVar.f22609a);
                        if (aVar2 != null) {
                            aVar.a(aVar2);
                        }
                        linkedHashMap.put(aVar.f22609a, aVar);
                    } catch (Exception unused) {
                    }
                }
                synchronized (c.class) {
                    this.f22603e.clear();
                    this.f22603e.putAll(linkedHashMap);
                    if (this.f22604f != null) {
                        if (!this.f22603e.containsKey(this.f22604f.f22609a)) {
                            Logger.debug();
                            a(context, "onUpdate");
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private static void a(Context context, String str, JSONObject jSONObject) {
        if (context != null && !StringUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (p) {
                    Logger.debug();
                    TTNetInit.getTTNetDepend().a(str, jSONObject);
                    return;
                }
                Logger.debug();
                o.offer(new Pair(str, jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Context context, String str, long j2, String str2, int i2, String str3, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.h.get());
            jSONObject.put("from", str);
            jSONObject.put("time", j2);
            jSONObject.put("host", str2);
            jSONObject.put("cost", i2);
            jSONObject.put("scheme", str3);
            jSONObject.put("status", i3);
            a(context, "ss_net_channel_select_result", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
