package com.ss.android.common.d;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.c.b;
import com.ss.android.common.c.c;
import com.ss.android.common.c.d;
import com.ss.android.common.util.NetworkUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class e implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28272a = null;

    /* renamed from: b  reason: collision with root package name */
    static String f28273b = "ib.snssdk.com";

    /* renamed from: c  reason: collision with root package name */
    static String f28274c = ("https://" + f28273b + "/location/sulite/");

    /* renamed from: d  reason: collision with root package name */
    static String f28275d = ("https://" + f28273b + "/location/suusci/");

    /* renamed from: e  reason: collision with root package name */
    static String f28276e = ("https://" + f28273b + "/location/cancel/");
    private static e t;
    private static final WeakContainer<Object> v = new WeakContainer<>();

    /* renamed from: f  reason: collision with root package name */
    public final c f28277f;
    public final b g;
    public final i h;
    final WeakHandler i;
    public Context j;
    public boolean k;
    public boolean l = true;
    public boolean m = true;
    public long n;
    public long o;
    public int p = 600;
    public boolean q;
    public int r;
    long s;
    private boolean u;

    class a {

        /* renamed from: a  reason: collision with root package name */
        int f28281a;

        /* renamed from: b  reason: collision with root package name */
        String f28282b;

        /* renamed from: c  reason: collision with root package name */
        String f28283c;

        private a() {
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }
    }

    public final void a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f28272a, false, 15877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28272a, false, 15877, new Class[0], Void.TYPE);
        } else if ((this.l || this.m) && NetworkUtils.isNetworkAvailable(this.j) && !this.k) {
            if (PatchProxy.isSupport(new Object[0], this, f28272a, false, 15879, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f28272a, false, 15879, new Class[0], Void.TYPE);
            } else {
                this.k = false;
                this.i.removeCallbacksAndMessages(null);
            }
            if (!this.q) {
                if (PatchProxy.isSupport(new Object[0], this, f28272a, false, 15878, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f28272a, false, 15878, new Class[0], Boolean.TYPE)).booleanValue();
                } else if ((!this.l || this.f28277f.a(this.n)) && (!this.m || this.g.a(this.n))) {
                    z = true;
                }
                if (!z) {
                    this.k = true;
                    this.i.sendEmptyMessage(1);
                    this.i.sendEmptyMessageDelayed(2, 60000);
                    return;
                }
            }
            this.k = true;
            this.i.sendEmptyMessage(2);
        }
    }

    private e(Context context) {
        this.j = context;
        this.f28277f = c.a(this.j);
        this.g = b.a(this.j);
        this.h = new i(this.j);
        this.i = new WeakHandler(Looper.getMainLooper(), this);
    }

    public static synchronized e a(Context context) {
        synchronized (e.class) {
            if (PatchProxy.isSupport(new Object[]{context}, null, f28272a, true, 15876, new Class[]{Context.class}, e.class)) {
                e eVar = (e) PatchProxy.accessDispatch(new Object[]{context}, null, f28272a, true, 15876, new Class[]{Context.class}, e.class);
                return eVar;
            }
            if (t == null) {
                t = new e(context.getApplicationContext());
            }
            e eVar2 = t;
            return eVar2;
        }
    }

    public static String d(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, null, f28272a, true, 15892, new Class[]{JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, f28272a, true, 15892, new Class[]{JSONObject.class}, String.class);
        } else if (jSONObject.length() == 0) {
            return null;
        } else {
            try {
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                int length = bytes.length;
                for (int i2 = 0; i2 < length; i2++) {
                    bytes[i2] = (byte) (bytes[i2] ^ -99);
                }
                return Base64.encodeToString(bytes, 10);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final void c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f28272a, false, 15884, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f28272a, false, 15884, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            try {
                long optLong = jSONObject2.optLong("loc_time");
                if (optLong > 0) {
                    jSONObject2.put("loc_time", optLong / 1000);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f28272a, false, 15882, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f28272a, false, 15882, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        List<com.ss.android.common.c.a> c2 = b.a().c();
        com.ss.android.common.c.a b2 = b.a().b();
        JSONArray jSONArray = new JSONArray();
        if (c2 != null) {
            try {
                for (com.ss.android.common.c.a next : c2) {
                    if (next != null) {
                        JSONObject a2 = next.a();
                        if (b2 == null || !TextUtils.equals(b2.f28233c, next.f28233c)) {
                            a2.put("is_current", 0);
                        } else {
                            a2.put("is_current", 1);
                        }
                        jSONArray.put(a2);
                    }
                }
                jSONObject2.put("bt_info", jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f28272a, false, 15885, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f28272a, false, 15885, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        int i2 = message.what;
        if (i2 != 5) {
            switch (i2) {
                case 1:
                    if (this.l) {
                        this.f28277f.c(this.u);
                    }
                    if (this.m) {
                        this.g.a(this.u, false);
                        return;
                    }
                    break;
                case 2:
                    if (PatchProxy.isSupport(new Object[0], this, f28272a, false, 15880, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f28272a, false, 15880, new Class[0], Void.TYPE);
                        break;
                    } else {
                        final long currentTimeMillis = System.currentTimeMillis();
                        this.o = currentTimeMillis;
                        new ThreadPlus(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f28278a;

                            /* JADX WARNING: Can't wrap try/catch for region: R(5:61|(1:63)(1:(6:65|66|67|(1:69)(1:70)|71|(1:73)(1:74)))|75|76|(1:78)(1:79)) */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0350 */
                            /* JADX WARNING: Removed duplicated region for block: B:78:0x0384 A[Catch:{ Exception -> 0x03c5 }] */
                            /* JADX WARNING: Removed duplicated region for block: B:79:0x03ab A[Catch:{ Exception -> 0x03c5 }] */
                            /* JADX WARNING: Unknown top exception splitter block from list: {B:95:0x03ed=Splitter:B:95:0x03ed, B:80:0x03be=Splitter:B:80:0x03be} */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void run() {
                                /*
                                    r22 = this;
                                    r8 = r22
                                    r9 = 0
                                    java.lang.Object[] r1 = new java.lang.Object[r9]
                                    com.meituan.robust.ChangeQuickRedirect r3 = f28278a
                                    java.lang.Class[] r6 = new java.lang.Class[r9]
                                    java.lang.Class r7 = java.lang.Void.TYPE
                                    r4 = 0
                                    r5 = 15896(0x3e18, float:2.2275E-41)
                                    r2 = r22
                                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                                    if (r0 == 0) goto L_0x0027
                                    java.lang.Object[] r1 = new java.lang.Object[r9]
                                    com.meituan.robust.ChangeQuickRedirect r3 = f28278a
                                    r4 = 0
                                    r5 = 15896(0x3e18, float:2.2275E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r9]
                                    java.lang.Class r7 = java.lang.Void.TYPE
                                    r2 = r22
                                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                                    return
                                L_0x0027:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    boolean r0 = r0.l     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r1 = 0
                                    if (r0 == 0) goto L_0x003c
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.c r0 = r0.f28277f     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.e r2 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    long r2 = r2.n     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    boolean r0 = r0.a((long) r2)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r0 != 0) goto L_0x0042
                                L_0x003c:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    boolean r0 = r0.q     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r0 == 0) goto L_0x004b
                                L_0x0042:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.c r0 = r0.f28277f     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    org.json.JSONObject r0 = r0.c()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x004c
                                L_0x004b:
                                    r0 = r1
                                L_0x004c:
                                    com.ss.android.common.d.e r2 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    boolean r2 = r2.m     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r2 == 0) goto L_0x0060
                                    com.ss.android.common.d.e r2 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.b r2 = r2.g     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.e r3 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    long r3 = r3.n     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    boolean r2 = r2.a((long) r3)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r2 != 0) goto L_0x0066
                                L_0x0060:
                                    com.ss.android.common.d.e r2 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    boolean r2 = r2.q     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r2 == 0) goto L_0x006e
                                L_0x0066:
                                    com.ss.android.common.d.e r1 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.b r1 = r1.g     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    org.json.JSONObject r1 = r1.a()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x006e:
                                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r2.<init>()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.e r3 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r3.c(r0)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.e r3 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r3.c(r1)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r3.<init>()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "cmd"
                                    com.ss.android.common.d.e r5 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.i r5 = r5.h     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r13 = 0
                                    r14 = 15914(0x3e2a, float:2.23E-41)
                                    java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r11 = r5
                                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r6 == 0) goto L_0x00b1
                                    java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r13 = 0
                                    r14 = 15914(0x3e2a, float:2.23E-41)
                                    java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r11 = r5
                                    java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    int r5 = r5.intValue()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x00b9
                                L_0x00b1:
                                    android.content.SharedPreferences r5 = r5.f28286b     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r6 = "last_alert_command"
                                    int r5 = r5.getInt(r6, r9)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x00b9:
                                    r3.put(r4, r5)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "last_interval"
                                    long r5 = r0     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.e r7 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.i r7 = r7.h     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r13 = 0
                                    r14 = 15915(0x3e2b, float:2.2302E-41)
                                    java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r16 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r11 = r7
                                    boolean r10 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r14 = 0
                                    if (r10 == 0) goto L_0x00fa
                                    java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r13 = 0
                                    r16 = 15915(0x3e2b, float:2.2302E-41)
                                    java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r17 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r18 = r11
                                    r11 = r7
                                    r14 = r16
                                    r15 = r18
                                    r16 = r17
                                    java.lang.Object r7 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    long r10 = r7.longValue()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r13 = r10
                                    r11 = 0
                                    goto L_0x0104
                                L_0x00fa:
                                    android.content.SharedPreferences r7 = r7.f28286b     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r10 = "last_alert_time"
                                    r11 = 0
                                    long r13 = r7.getLong(r10, r11)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x0104:
                                    r7 = 0
                                    long r5 = r5 - r13
                                    r13 = 1000(0x3e8, double:4.94E-321)
                                    long r5 = r5 / r13
                                    r3.put(r4, r5)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "loc_id"
                                    com.ss.android.common.d.e r5 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.i r5 = r5.h     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r18 = 0
                                    r19 = 15919(0x3e2f, float:2.2307E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class<java.lang.String> r21 = java.lang.String.class
                                    r16 = r5
                                    r20 = r6
                                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r6 == 0) goto L_0x013f
                                    java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r18 = 0
                                    r19 = 15919(0x3e2f, float:2.2307E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class<java.lang.String> r21 = java.lang.String.class
                                    r16 = r5
                                    r20 = r6
                                    java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x0149
                                L_0x013f:
                                    android.content.SharedPreferences r5 = r5.f28286b     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r6 = "last_alert_id"
                                    java.lang.String r7 = ""
                                    java.lang.String r5 = r5.getString(r6, r7)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x0149:
                                    r3.put(r4, r5)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "op_type"
                                    com.ss.android.common.d.e r5 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.i r5 = r5.h     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r18 = 0
                                    r19 = 15917(0x3e2d, float:2.2304E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r21 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r16 = r5
                                    r20 = r6
                                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r6 == 0) goto L_0x0183
                                    java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r18 = 0
                                    r19 = 15917(0x3e2d, float:2.2304E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r21 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r16 = r5
                                    r20 = r6
                                    java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    int r5 = r5.intValue()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x018b
                                L_0x0183:
                                    android.content.SharedPreferences r5 = r5.f28286b     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r6 = "last_op_command"
                                    int r5 = r5.getInt(r6, r9)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x018b:
                                    r3.put(r4, r5)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "op_time"
                                    com.ss.android.common.d.e r5 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.i r5 = r5.h     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r18 = 0
                                    r19 = 15918(0x3e2e, float:2.2306E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r21 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r16 = r5
                                    r20 = r6
                                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r6 == 0) goto L_0x01c5
                                    java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r18 = 0
                                    r19 = 15918(0x3e2e, float:2.2306E-41)
                                    java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Class r21 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r16 = r5
                                    r20 = r6
                                    java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    long r5 = r5.longValue()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x01cd
                                L_0x01c5:
                                    android.content.SharedPreferences r5 = r5.f28286b     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r6 = "last_op_time"
                                    long r5 = r5.getLong(r6, r11)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x01cd:
                                    long r5 = r5 / r13
                                    r3.put(r4, r5)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "last_time"
                                    com.ss.android.common.d.e r5 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    long r5 = r5.n     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    long r5 = r5 / r13
                                    r3.put(r4, r5)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "location_feedback"
                                    r2.put(r4, r3)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r3 = "sys_location"
                                    r2.put(r3, r0)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r0 = "amap_location"
                                    r2.put(r0, r1)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    android.content.Context r0 = r0.j     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r1 = "location"
                                    java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r1 = 1
                                    if (r0 == 0) goto L_0x022f
                                    java.util.List r3 = r0.getProviders(r1)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r3 == 0) goto L_0x022a
                                    boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r3 != 0) goto L_0x022a
                                    java.lang.String r3 = "location_setting"
                                    r2.put(r3, r1)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r3 = "gps"
                                    boolean r3 = r0.isProviderEnabled(r3)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "network"
                                    boolean r4 = r0.isProviderEnabled(r4)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r4 == 0) goto L_0x021a
                                    r3 = r3 | 2
                                L_0x021a:
                                    java.lang.String r4 = "passive"
                                    boolean r0 = r0.isProviderEnabled(r4)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    if (r0 == 0) goto L_0x0224
                                    r3 = r3 | 4
                                L_0x0224:
                                    java.lang.String r0 = "location_mode"
                                    r2.put(r0, r3)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x022f
                                L_0x022a:
                                    java.lang.String r0 = "location_setting"
                                    r2.put(r0, r9)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x022f:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r0.a((org.json.JSONObject) r2)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r0.b(r2)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r0.<init>()     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    com.ss.android.http.a.b.e r3 = new com.ss.android.http.a.b.e     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    java.lang.String r4 = "dwinfo"
                                    java.lang.String r2 = com.ss.android.common.d.e.d(r2)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r3.<init>(r4, r2)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r0.add(r3)     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r2 = 20480(0x5000, float:2.8699E-41)
                                    java.lang.String r3 = com.ss.android.common.d.e.f28274c     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.String r0 = com.ss.android.common.util.NetworkUtils.executePost((int) r2, (java.lang.String) r3, (java.util.List) r0)     // Catch:{ Exception -> 0x03c5 }
                                    boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x03c5 }
                                    if (r2 != 0) goto L_0x03be
                                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x03c5 }
                                    r2.<init>(r0)     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.String r0 = "err_no"
                                    int r0 = r2.optInt(r0)     // Catch:{ Exception -> 0x03c5 }
                                    if (r0 != 0) goto L_0x03be
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.String r3 = "data"
                                    org.json.JSONObject r2 = r2.optJSONObject(r3)     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x03c5 }
                                    r13[r9] = r2     // Catch:{ Exception -> 0x03c5 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.e.f28272a     // Catch:{ Exception -> 0x03c5 }
                                    r16 = 0
                                    r17 = 15883(0x3e0b, float:2.2257E-41)
                                    java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
                                    r3[r9] = r4     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r14 = r0
                                    r18 = r3
                                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x03c5 }
                                    if (r3 == 0) goto L_0x02a4
                                    java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x03c5 }
                                    r13[r9] = r2     // Catch:{ Exception -> 0x03c5 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.e.f28272a     // Catch:{ Exception -> 0x03c5 }
                                    r16 = 0
                                    r17 = 15883(0x3e0b, float:2.2257E-41)
                                    java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
                                    r2[r9] = r3     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r14 = r0
                                    r18 = r2
                                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x03c5 }
                                    goto L_0x0350
                                L_0x02a4:
                                    if (r2 == 0) goto L_0x0350
                                    java.lang.String r3 = "cmd"
                                    int r3 = r2.optInt(r3)     // Catch:{ Exception -> 0x0350 }
                                    java.lang.String r4 = "curr_city"
                                    java.lang.String r4 = r2.optString(r4)     // Catch:{ Exception -> 0x0350 }
                                    java.lang.String r5 = "alert_title"
                                    java.lang.String r5 = r2.optString(r5)     // Catch:{ Exception -> 0x0350 }
                                    com.ss.android.common.d.i r6 = r0.h     // Catch:{ Exception -> 0x0350 }
                                    java.lang.String r7 = "loc_id"
                                    java.lang.String r2 = r2.optString(r7)     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0350 }
                                    r13[r9] = r2     // Catch:{ Exception -> 0x0350 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x0350 }
                                    r16 = 0
                                    r17 = 15920(0x3e30, float:2.2309E-41)
                                    java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class<java.lang.String> r10 = java.lang.String.class
                                    r7[r9] = r10     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0350 }
                                    r14 = r6
                                    r18 = r7
                                    boolean r7 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0350 }
                                    if (r7 == 0) goto L_0x02f4
                                    java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0350 }
                                    r13[r9] = r2     // Catch:{ Exception -> 0x0350 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x0350 }
                                    r16 = 0
                                    r17 = 15920(0x3e30, float:2.2309E-41)
                                    java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                                    r2[r9] = r7     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0350 }
                                    r14 = r6
                                    r18 = r2
                                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0350 }
                                    goto L_0x0303
                                L_0x02f4:
                                    android.content.SharedPreferences r6 = r6.f28286b     // Catch:{ Exception -> 0x0350 }
                                    android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ Exception -> 0x0350 }
                                    java.lang.String r7 = "last_alert_id"
                                    android.content.SharedPreferences$Editor r2 = r6.putString(r7, r2)     // Catch:{ Exception -> 0x0350 }
                                    r2.apply()     // Catch:{ Exception -> 0x0350 }
                                L_0x0303:
                                    com.ss.android.common.d.e$a r2 = new com.ss.android.common.d.e$a     // Catch:{ Exception -> 0x0350 }
                                    r2.<init>(r0, r9)     // Catch:{ Exception -> 0x0350 }
                                    r2.f28281a = r3     // Catch:{ Exception -> 0x0350 }
                                    r2.f28282b = r4     // Catch:{ Exception -> 0x0350 }
                                    r2.f28283c = r5     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0350 }
                                    r13[r9] = r2     // Catch:{ Exception -> 0x0350 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.e.f28272a     // Catch:{ Exception -> 0x0350 }
                                    r16 = 0
                                    r17 = 15891(0x3e13, float:2.2268E-41)
                                    java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class<com.ss.android.common.d.e$a> r4 = com.ss.android.common.d.e.a.class
                                    r3[r9] = r4     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0350 }
                                    r14 = r0
                                    r18 = r3
                                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0350 }
                                    if (r3 == 0) goto L_0x0342
                                    java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0350 }
                                    r13[r9] = r2     // Catch:{ Exception -> 0x0350 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.e.f28272a     // Catch:{ Exception -> 0x0350 }
                                    r16 = 0
                                    r17 = 15891(0x3e13, float:2.2268E-41)
                                    java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class<com.ss.android.common.d.e$a> r3 = com.ss.android.common.d.e.a.class
                                    r2[r9] = r3     // Catch:{ Exception -> 0x0350 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0350 }
                                    r14 = r0
                                    r18 = r2
                                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0350 }
                                    goto L_0x0350
                                L_0x0342:
                                    com.bytedance.common.utility.collection.WeakHandler r3 = r0.i     // Catch:{ Exception -> 0x0350 }
                                    r4 = 5
                                    android.os.Message r3 = r3.obtainMessage(r4)     // Catch:{ Exception -> 0x0350 }
                                    r3.obj = r2     // Catch:{ Exception -> 0x0350 }
                                    com.bytedance.common.utility.collection.WeakHandler r0 = r0.i     // Catch:{ Exception -> 0x0350 }
                                    r0.sendMessage(r3)     // Catch:{ Exception -> 0x0350 }
                                L_0x0350:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03c5 }
                                    long r2 = r0     // Catch:{ Exception -> 0x03c5 }
                                    r0.n = r2     // Catch:{ Exception -> 0x03c5 }
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03c5 }
                                    com.ss.android.common.d.i r0 = r0.h     // Catch:{ Exception -> 0x03c5 }
                                    r2 = 2
                                    java.lang.Object[] r13 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x03c5 }
                                    r13[r9] = r3     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x03c5 }
                                    r13[r1] = r3     // Catch:{ Exception -> 0x03c5 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03c5 }
                                    r16 = 0
                                    r17 = 15916(0x3e2c, float:2.2303E-41)
                                    java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r3[r9] = r4     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r3[r1] = r4     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r14 = r0
                                    r18 = r3
                                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x03c5 }
                                    if (r3 == 0) goto L_0x03ab
                                    java.lang.Object[] r13 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x03c5 }
                                    r13[r9] = r3     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x03c5 }
                                    r13[r1] = r3     // Catch:{ Exception -> 0x03c5 }
                                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.d.i.f28285a     // Catch:{ Exception -> 0x03c5 }
                                    r16 = 0
                                    r17 = 15916(0x3e2c, float:2.2303E-41)
                                    java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r2[r9] = r3     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r2[r1] = r3     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x03c5 }
                                    r14 = r0
                                    r18 = r2
                                    com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x03c5 }
                                    goto L_0x03be
                                L_0x03ab:
                                    android.content.SharedPreferences r0 = r0.f28286b     // Catch:{ Exception -> 0x03c5 }
                                    android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.String r2 = "last_op_command"
                                    r0.putInt(r2, r9)     // Catch:{ Exception -> 0x03c5 }
                                    java.lang.String r2 = "last_op_time"
                                    r0.putLong(r2, r11)     // Catch:{ Exception -> 0x03c5 }
                                    r0.apply()     // Catch:{ Exception -> 0x03c5 }
                                L_0x03be:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x03c0:
                                    r0.k = r9     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x03f0
                                L_0x03c3:
                                    r0 = move-exception
                                    goto L_0x03f5
                                L_0x03c5:
                                    r0 = move-exception
                                    boolean r0 = r0 instanceof com.ss.android.http.a.a.b     // Catch:{ all -> 0x03c3 }
                                    if (r0 != 0) goto L_0x03ed
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ all -> 0x03c3 }
                                    long r2 = r0     // Catch:{ all -> 0x03c3 }
                                    long r4 = r0.s     // Catch:{ all -> 0x03c3 }
                                    r6 = 900000(0xdbba0, double:4.44659E-318)
                                    long r4 = r4 + r6
                                    int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                                    if (r6 <= 0) goto L_0x03de
                                    r0.q = r1     // Catch:{ all -> 0x03c3 }
                                    r0.r = r9     // Catch:{ all -> 0x03c3 }
                                    r0.s = r2     // Catch:{ all -> 0x03c3 }
                                L_0x03de:
                                    int r2 = r0.r     // Catch:{ all -> 0x03c3 }
                                    r3 = 3
                                    if (r2 >= r3) goto L_0x03eb
                                    int r2 = r0.r     // Catch:{ all -> 0x03c3 }
                                    int r2 = r2 + r1
                                    r0.r = r2     // Catch:{ all -> 0x03c3 }
                                    r0.q = r1     // Catch:{ all -> 0x03c3 }
                                    goto L_0x03ed
                                L_0x03eb:
                                    r0.q = r9     // Catch:{ all -> 0x03c3 }
                                L_0x03ed:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    goto L_0x03c0
                                L_0x03f0:
                                    com.ss.android.common.d.e r0 = com.ss.android.common.d.e.this
                                    r0.k = r9
                                    return
                                L_0x03f5:
                                    com.ss.android.common.d.e r1 = com.ss.android.common.d.e.this     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    r1.k = r9     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                    throw r0     // Catch:{ Exception -> 0x03f0, all -> 0x03fa }
                                L_0x03fa:
                                    r0 = move-exception
                                    com.ss.android.common.d.e r1 = com.ss.android.common.d.e.this
                                    r1.k = r9
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.d.e.AnonymousClass1.run():void");
                            }
                        }, "loc_uplode", true).start();
                        return;
                    }
            }
        } else if (message.obj instanceof a) {
            Object obj = message.obj;
            Iterator it2 = v.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        List<c> list;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f28272a, false, 15881, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f28272a, false, 15881, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        d a2 = d.a(this.j);
        if (PatchProxy.isSupport(new Object[0], a2, d.f28248a, false, 15797, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], a2, d.f28248a, false, 15797, new Class[0], List.class);
        } else {
            list = a2.a(a2.b());
        }
        c a3 = d.a(this.j).a();
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            try {
                for (c next : list) {
                    if (next != null) {
                        JSONObject a4 = next.a();
                        if (a3 == null || !TextUtils.equals(next.f28242c, a3.f28242c)) {
                            a4.put("is_current", 0);
                        } else {
                            a4.put("is_current", 1);
                        }
                        jSONArray.put(a4);
                    }
                }
                jSONObject2.put("wifi_info", jSONArray);
            } catch (Exception unused) {
            }
        }
    }
}
