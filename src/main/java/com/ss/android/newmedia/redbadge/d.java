package com.ss.android.newmedia.redbadge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.b.a;
import com.ss.android.pushmanager.c;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class d implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30330a;
    private static volatile d q;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30331b;

    /* renamed from: c  reason: collision with root package name */
    public c f30332c;

    /* renamed from: d  reason: collision with root package name */
    public Context f30333d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHandler f30334e = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: f  reason: collision with root package name */
    public boolean f30335f;
    public int g;
    public String h;
    public String i;
    public String j;
    public long k;
    public long l;
    public long m;
    public int n;
    final BroadcastReceiver o = new RedBadgeController$1(this);
    public AtomicBoolean p = new AtomicBoolean(false);
    private int r;
    private long s;
    private boolean t = false;
    private ContentObserver u = new ContentObserver(this.f30334e) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30339a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30339a, false, 18762, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30339a, false, 18762, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            d.this.a(d.this.f30333d);
        }
    };
    private ContentObserver v = new ContentObserver(this.f30334e) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30341a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30341a, false, 18763, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30341a, false, 18763, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            d.this.a(d.this.f30333d);
        }
    };
    private ContentObserver w = new ContentObserver(this.f30334e) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30343a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30343a, false, 18764, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30343a, false, 18764, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            d.this.b(d.this.f30333d);
        }
    };

    /* access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{str, bundle2}, this, f30330a, false, 18758, new Class[]{String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bundle2}, this, f30330a, false, 18758, new Class[]{String.class, Bundle.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle2.get(str2));
                }
            } catch (Throwable unused) {
            }
            com.ss.android.message.log.c.a(this.f30333d, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|28|(1:33)(1:32)|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0149 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r17 = this;
            r7 = r17
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 18757(0x4945, float:2.6284E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a
            r3 = 0
            r4 = 18757(0x4945, float:2.6284E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            android.content.Context r0 = r7.f30333d
            com.ss.android.newmedia.redbadge.b.a r0 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r0)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.newmedia.redbadge.b.a.f30323a
            r12 = 0
            r13 = 18852(0x49a4, float:2.6417E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r10 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x0052
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.newmedia.redbadge.b.a.f30323a
            r12 = 0
            r13 = 18852(0x49a4, float:2.6417E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r10 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x005c
        L_0x0052:
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r0 = r0.f30325b
            java.lang.String r1 = "red_badge_last_valid_response"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
        L_0x005c:
            android.content.Context r1 = r7.f30333d
            com.ss.android.newmedia.redbadge.b.a r1 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r1)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.newmedia.redbadge.b.a.f30323a
            r12 = 0
            r13 = 18854(0x49a6, float:2.642E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            r3 = 1
            if (r2 == 0) goto L_0x008c
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.newmedia.redbadge.b.a.f30323a
            r12 = 0
            r13 = 18854(0x49a6, float:2.642E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0094
        L_0x008c:
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r1 = r1.f30325b
            java.lang.String r2 = "red_badge_is_use_last_valid_response"
            boolean r1 = r1.a((java.lang.String) r2, (boolean) r3)
        L_0x0094:
            if (r1 == 0) goto L_0x016b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x016b
            android.content.Context r1 = r7.f30333d     // Catch:{ Exception -> 0x016b }
            com.ss.android.newmedia.redbadge.b.a r1 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r1)     // Catch:{ Exception -> 0x016b }
            int r1 = r1.h()     // Catch:{ Exception -> 0x016b }
            long r4 = r7.l     // Catch:{ Exception -> 0x016b }
            boolean r2 = android.text.format.DateUtils.isToday(r4)     // Catch:{ Exception -> 0x016b }
            if (r2 != 0) goto L_0x00b1
            if (r1 <= 0) goto L_0x00b1
            r1 = 0
        L_0x00b1:
            int r2 = r7.g     // Catch:{ Exception -> 0x016b }
            if (r1 < r2) goto L_0x00c9
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x016b }
            android.content.Context r9 = r7.f30333d     // Catch:{ Exception -> 0x016b }
            java.lang.String r10 = "umeng"
            java.lang.String r11 = "red_badge"
            java.lang.String r12 = "outdo_max_show_times"
            long r13 = (long) r1     // Catch:{ Exception -> 0x016b }
            int r0 = r7.g     // Catch:{ Exception -> 0x016b }
            long r0 = (long) r0     // Catch:{ Exception -> 0x016b }
            r15 = r0
            com.ss.android.message.log.c.a(r9, r10, r11, r12, r13, r15)     // Catch:{ Exception -> 0x016b }
            return
        L_0x00c9:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x016b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "success"
            java.lang.String r2 = "reason"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x016b }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x016b }
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = "content"
            int r0 = r1.optInt(r0, r8)     // Catch:{ Exception -> 0x016b }
            java.lang.String r2 = "content"
            int r0 = r0 + r3
            r1.put(r2, r0)     // Catch:{ Exception -> 0x016b }
            android.content.Context r0 = r7.f30333d     // Catch:{ Exception -> 0x016b }
            java.lang.String r2 = "red_badge"
            java.lang.String r4 = "use_last_valid_response"
            org.json.JSONObject[] r5 = new org.json.JSONObject[r3]     // Catch:{ Exception -> 0x016b }
            r5[r8] = r1     // Catch:{ Exception -> 0x016b }
            com.ss.android.message.log.c.a(r0, r2, r4, r5)     // Catch:{ Exception -> 0x016b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016b }
            r7.m = r4     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "next_query_interval"
            int r0 = r1.optInt(r0, r8)     // Catch:{ Exception -> 0x016b }
            int r0 = r0 + 600
            r7.n = r0     // Catch:{ Exception -> 0x016b }
            android.content.Context r0 = r7.f30333d     // Catch:{ Throwable -> 0x0149 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x0149 }
            java.lang.String r2 = r1.toString()     // Catch:{ Throwable -> 0x0149 }
            r0.e(r2)     // Catch:{ Throwable -> 0x0149 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x0149 }
            java.lang.String r2 = "com.ss.android.redbadge.message"
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0149 }
            java.lang.String r2 = "message_data"
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0149 }
            r0.putExtra(r2, r1)     // Catch:{ Throwable -> 0x0149 }
            android.content.Context r1 = r7.f30333d     // Catch:{ Throwable -> 0x0149 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Throwable -> 0x0149 }
            r0.setPackage(r1)     // Catch:{ Throwable -> 0x0149 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0149 }
            r2 = 26
            if (r1 < r2) goto L_0x0144
            int r1 = com.ss.android.message.a.b()     // Catch:{ Throwable -> 0x0149 }
            if (r1 < r2) goto L_0x0144
            android.content.Context r1 = r7.f30333d     // Catch:{ Throwable -> 0x0149 }
            com.ss.android.newmedia.redbadge.k r2 = new com.ss.android.newmedia.redbadge.k     // Catch:{ Throwable -> 0x0149 }
            android.content.Context r4 = r7.f30333d     // Catch:{ Throwable -> 0x0149 }
            r2.<init>(r0, r3, r4)     // Catch:{ Throwable -> 0x0149 }
            r1.bindService(r0, r2, r3)     // Catch:{ Throwable -> 0x0149 }
            goto L_0x0149
        L_0x0144:
            android.content.Context r1 = r7.f30333d     // Catch:{ Throwable -> 0x0149 }
            r1.startService(r0)     // Catch:{ Throwable -> 0x0149 }
        L_0x0149:
            android.content.Context r0 = r7.f30333d     // Catch:{ Exception -> 0x016b }
            com.ss.android.newmedia.redbadge.b.a r0 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r0)     // Catch:{ Exception -> 0x016b }
            long r1 = r7.m     // Catch:{ Exception -> 0x016b }
            r0.a((long) r1)     // Catch:{ Exception -> 0x016b }
            android.content.Context r0 = r7.f30333d     // Catch:{ Exception -> 0x016b }
            com.ss.android.newmedia.redbadge.b.a r0 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r0)     // Catch:{ Exception -> 0x016b }
            int r1 = r7.n     // Catch:{ Exception -> 0x016b }
            r0.a((int) r1)     // Catch:{ Exception -> 0x016b }
        L_0x015f:
            android.content.Context r0 = r7.f30333d     // Catch:{ Exception -> 0x016b }
            com.ss.android.newmedia.redbadge.b.a r0 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r0)     // Catch:{ Exception -> 0x016b }
            long r1 = r7.m     // Catch:{ Exception -> 0x016b }
            r0.a((long) r1)     // Catch:{ Exception -> 0x016b }
            return
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.d.a():void");
    }

    public static d a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f30330a, true, 18743, new Class[]{c.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f30330a, true, 18743, new Class[]{c.class}, d.class);
        }
        if (q == null) {
            synchronized (d.class) {
                if (q == null) {
                    q = new d(cVar2);
                }
            }
        }
        return q;
    }

    public final long b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30330a, false, 18756, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f30330a, false, 18756, new Class[]{String.class}, Long.TYPE)).longValue();
        } else if (str2 == null) {
            return 0;
        } else {
            try {
                return new JSONObject(str2).optLong("rule_id");
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    private d(c cVar) {
        this.f30332c = cVar;
        this.f30333d = cVar.a().getApplicationContext();
        a(this.f30333d);
        Context context = this.f30333d;
        if (PatchProxy.isSupport(new Object[]{context}, this, f30330a, false, 18759, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f30330a, false, 18759, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "is_desktop_red_badge_show", "boolean"), true, this.u);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "desktop_red_badge_args", "string"), true, this.v);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "red_badge_last_time_paras", "string"), true, this.w);
            } catch (Throwable unused) {
            }
        }
        if (this.f30335f) {
            this.f30333d.registerReceiver(this.o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            b(this.f30333d);
            this.f30334e.sendEmptyMessageDelayed(0, 10000);
        }
        this.f30331b = true;
    }

    public final void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f30330a, false, 18745, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f30330a, false, 18745, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            try {
                this.m = a.a(this.f30333d).c();
                this.n = a.a(this.f30333d).d();
                this.i = a.a(this.f30333d).e();
                this.j = a.a(this.f30333d).f();
                if (!StringUtils.isEmpty(this.i)) {
                    JSONObject jSONObject = new JSONObject(this.i);
                    this.k = jSONObject.optLong("launch");
                    this.s = jSONObject.optLong("leave");
                    this.l = jSONObject.optLong("badge");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (PatchProxy.isSupport(new Object[]{str}, this, f30330a, false, 18752, new Class[]{String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str}, this, f30330a, false, 18752, new Class[]{String.class}, JSONObject.class);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (StringUtils.isEmpty(str)) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(str);
            try {
                a(jSONObject, "launch");
                a(jSONObject, "leave");
                a(jSONObject, "badge");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0201, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r13) {
        /*
            r12 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 18748(0x493c, float:2.6272E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a
            r3 = 0
            r4 = 18748(0x493c, float:2.6272E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            if (r13 != 0) goto L_0x0033
            return
        L_0x0033:
            int r0 = r13.what     // Catch:{ Throwable -> 0x0202 }
            switch(r0) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x00b2;
                case 2: goto L_0x0075;
                case 3: goto L_0x005f;
                case 4: goto L_0x003a;
                default: goto L_0x0038;
            }     // Catch:{ Throwable -> 0x0202 }
        L_0x0038:
            goto L_0x0201
        L_0x003a:
            java.lang.Object r0 = r13.obj     // Catch:{ Throwable -> 0x0202 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Throwable -> 0x0202 }
            long r0 = r0.longValue()     // Catch:{ Throwable -> 0x0202 }
            int r2 = r12.n     // Catch:{ Throwable -> 0x0202 }
            int r2 = r2 * 1000
            long r2 = (long) r2     // Catch:{ Throwable -> 0x0202 }
            long r4 = r12.m     // Catch:{ Throwable -> 0x0202 }
            int r6 = r12.n     // Catch:{ Throwable -> 0x0202 }
            int r6 = r6 * 1000
            long r7 = (long) r6     // Catch:{ Throwable -> 0x0202 }
            long r4 = r4 + r7
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0055
            long r2 = r4 - r0
        L_0x0055:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            r0.sendEmptyMessageDelayed(r9, r2)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0202
        L_0x005f:
            java.lang.Object r0 = r13.obj     // Catch:{ Throwable -> 0x0202 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Throwable -> 0x0202 }
            r0.longValue()     // Catch:{ Throwable -> 0x0202 }
            int r0 = r12.n     // Catch:{ Throwable -> 0x0202 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r2 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            r2.sendEmptyMessageDelayed(r9, r0)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0201
        L_0x0075:
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18751(0x493f, float:2.6276E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x0098
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18751(0x493f, float:2.6276E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0201
        L_0x0098:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = r12.f30335f     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x0202
            r12.t = r9     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            r0.removeMessages(r9)     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            int r1 = r12.r     // Catch:{ Throwable -> 0x0202 }
            int r1 = r1 * 1000
            long r1 = (long) r1     // Catch:{ Throwable -> 0x0202 }
            r0.sendEmptyMessageDelayed(r9, r1)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0202
        L_0x00b2:
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18750(0x493e, float:2.6274E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x00d5
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18750(0x493e, float:2.6274E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0201
        L_0x00d5:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = r12.f30335f     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x0202
            r12.t = r8     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = r0.hasMessages(r9)     // Catch:{ Throwable -> 0x0202 }
            if (r0 != 0) goto L_0x0202
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            int r1 = r12.n     // Catch:{ Throwable -> 0x0202 }
            int r1 = r1 * 1000
            long r1 = (long) r1     // Catch:{ Throwable -> 0x0202 }
            r0.sendEmptyMessageDelayed(r9, r1)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0202
        L_0x00f2:
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18749(0x493d, float:2.6273E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x0115
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18749(0x493d, float:2.6273E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0201
        L_0x0115:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = r12.f30335f     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x0202
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            r0.removeMessages(r9)     // Catch:{ Throwable -> 0x0202 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0202 }
            long r0 = r12.m     // Catch:{ Throwable -> 0x0202 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x013f
            int r0 = r12.n     // Catch:{ Throwable -> 0x0202 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ Throwable -> 0x0202 }
            long r0 = r10 - r0
            r12.m = r0     // Catch:{ Throwable -> 0x0202 }
            android.content.Context r0 = r12.f30333d     // Catch:{ Throwable -> 0x0202 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.ss.android.newmedia.redbadge.b.a.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x0202 }
            long r1 = r12.m     // Catch:{ Throwable -> 0x0202 }
            r0.a((long) r1)     // Catch:{ Throwable -> 0x0202 }
        L_0x013f:
            com.ss.android.pushmanager.setting.a r0 = com.ss.android.pushmanager.setting.a.a()     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = r0.c()     // Catch:{ Throwable -> 0x0202 }
            r1 = 4
            if (r0 == 0) goto L_0x0168
            com.ss.android.pushmanager.app.d$b r0 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = r0.g()     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x0168
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r2 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Throwable -> 0x0202 }
            android.os.Message r1 = r2.obtainMessage(r1, r3)     // Catch:{ Throwable -> 0x0202 }
            r0.sendMessage(r1)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0202
        L_0x0168:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            long r2 = r12.s     // Catch:{ Throwable -> 0x0202 }
            long r4 = r12.k     // Catch:{ Throwable -> 0x0202 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0180
            long r2 = r12.k     // Catch:{ Throwable -> 0x0202 }
            r0 = 0
            long r2 = r10 - r2
            r4 = 900000(0xdbba0, double:4.44659E-318)
            long r2 = r2 - r4
            goto L_0x0185
        L_0x0180:
            long r2 = r12.s     // Catch:{ Throwable -> 0x0202 }
            r0 = 0
            long r2 = r10 - r2
        L_0x0185:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            int r0 = r12.r     // Catch:{ Throwable -> 0x0202 }
            int r0 = r0 * 1000
            long r4 = (long) r0     // Catch:{ Throwable -> 0x0202 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01f2
            long r2 = r12.m     // Catch:{ Throwable -> 0x0202 }
            r0 = 0
            long r2 = r10 - r2
            int r0 = r12.n     // Catch:{ Throwable -> 0x0202 }
            int r0 = r0 * 1000
            long r4 = (long) r0     // Catch:{ Throwable -> 0x0202 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01f2
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ Throwable -> 0x0202 }
            r1.<init>(r10)     // Catch:{ Throwable -> 0x0202 }
            r0[r9] = r1     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18755(0x4943, float:2.6281E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ Throwable -> 0x0202 }
            r5[r9] = r1     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x01d7
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ Throwable -> 0x0202 }
            r1.<init>(r10)     // Catch:{ Throwable -> 0x0202 }
            r0[r9] = r1     // Catch:{ Throwable -> 0x0202 }
            com.meituan.robust.ChangeQuickRedirect r2 = f30330a     // Catch:{ Throwable -> 0x0202 }
            r3 = 0
            r4 = 18755(0x4943, float:2.6281E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ Throwable -> 0x0202 }
            r5[r9] = r1     // Catch:{ Throwable -> 0x0202 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0202 }
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0201
        L_0x01d7:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0202 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.p     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = r0.get()     // Catch:{ Throwable -> 0x0202 }
            if (r0 != 0) goto L_0x0202
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.p     // Catch:{ Throwable -> 0x0202 }
            r0.getAndSet(r8)     // Catch:{ Throwable -> 0x0202 }
            com.ss.android.newmedia.redbadge.d$1 r0 = new com.ss.android.newmedia.redbadge.d$1     // Catch:{ Throwable -> 0x0202 }
            r0.<init>(r10)     // Catch:{ Throwable -> 0x0202 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.concurrent.AsyncTaskUtils.executeAsyncTask(r0, r1)     // Catch:{ Throwable -> 0x0202 }
            goto L_0x0202
        L_0x01f2:
            com.bytedance.common.utility.collection.WeakHandler r0 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.common.utility.collection.WeakHandler r2 = r12.f30334e     // Catch:{ Throwable -> 0x0202 }
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Throwable -> 0x0202 }
            android.os.Message r1 = r2.obtainMessage(r1, r3)     // Catch:{ Throwable -> 0x0202 }
            r0.sendMessage(r1)     // Catch:{ Throwable -> 0x0202 }
        L_0x0201:
            return
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.d.handleMsg(android.os.Message):void");
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f30330a, false, 18744, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f30330a, false, 18744, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            try {
                this.f30335f = a.a(this.f30333d).a();
                String b2 = a.a(this.f30333d).b();
                if (!StringUtils.isEmpty(b2)) {
                    JSONObject jSONObject = new JSONObject(b2);
                    this.g = jSONObject.optInt("max_show_times", 5);
                    this.r = jSONObject.optInt("query_waiting_duration", 30);
                    this.h = jSONObject.optString("strategy");
                    if (!this.f30335f) {
                        this.f30334e.removeMessages(0);
                        this.f30334e.removeMessages(1);
                        this.f30334e.removeMessages(2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, str2}, this, f30330a, false, 18753, new Class[]{JSONObject.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, str2}, this, f30330a, false, 18753, new Class[]{JSONObject.class, String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            try {
                jSONObject2.put(str2, jSONObject.optLong(str) / 1000);
            } catch (Throwable unused) {
            }
        }
    }
}
