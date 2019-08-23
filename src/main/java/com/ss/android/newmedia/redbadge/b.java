package com.ss.android.newmedia.redbadge;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import android.text.format.DateUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.j;
import com.ss.android.newmedia.redbadge.b.a;
import com.ss.android.pushmanager.app.d;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import org.json.JSONObject;

public class b implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30305a;
    private static volatile b h;

    /* renamed from: b  reason: collision with root package name */
    public Context f30306b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f30307c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30308d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f30309e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30310f;
    public Runnable g = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30313a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f30313a, false, 18737, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f30313a, false, 18737, new Class[0], Void.TYPE);
            } else if (b.this.f30306b != null) {
                Logger.debug();
                if (b.this.f30310f) {
                    b.this.f30310f = false;
                    b.this.f30307c.sendEmptyMessage(1);
                }
            }
        }
    };
    private String i;
    private int j;
    private int k;
    private a l;
    private a m;
    private ContentObserver n = new ContentObserver(this.f30307c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30315a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30315a, false, 18738, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30315a, false, 18738, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            b.this.a();
        }
    };
    private ContentObserver o = new ContentObserver(this.f30307c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30317a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f30317a, false, 18739, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f30317a, false, 18739, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            b.this.a();
        }
    };

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30319a;

        /* renamed from: b  reason: collision with root package name */
        long f30320b;

        /* renamed from: c  reason: collision with root package name */
        long f30321c;

        /* renamed from: d  reason: collision with root package name */
        long f30322d;

        private a() {
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            if (PatchProxy.isSupport(new Object[0], this, f30319a, false, 18740, new Class[0], JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f30319a, false, 18740, new Class[0], JSONObject.class);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launch", this.f30320b);
                jSONObject.put("leave", this.f30321c);
                jSONObject.put("badge", this.f30322d);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        static a a(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, null, f30319a, true, 18741, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, f30319a, true, 18741, new Class[]{String.class}, a.class);
            }
            a aVar = new a();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                aVar.f30320b = jSONObject.optLong("launch", 0);
                aVar.f30321c = jSONObject.optLong("leave", 0);
                aVar.f30322d = jSONObject.optLong("badge", 0);
            } catch (Throwable unused) {
            }
            return aVar;
        }
    }

    private boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f30305a, false, 18721, new Class[0], Boolean.TYPE)) {
            return this.f30308d;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30305a, false, 18721, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30305a, false, 18720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30305a, false, 18720, new Class[0], Void.TYPE);
            return;
        }
        this.f30308d = a.a(this.f30306b).a();
        this.i = a.a(this.f30306b).b();
    }

    private void d() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f30305a, false, 18723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30305a, false, 18723, new Class[0], Void.TYPE);
            return;
        }
        try {
            a.a(this.f30306b).b(this.j);
            a.a(this.f30306b).c(this.k);
            a a2 = a.a(this.f30306b);
            if (this.l == null) {
                str = "";
            } else {
                str = this.l.a().toString();
            }
            a2.a(str);
            a a3 = a.a(this.f30306b);
            if (this.m == null) {
                str2 = "";
            } else {
                str2 = this.m.a().toString();
            }
            a3.b(str2);
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f30305a, false, 18731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30305a, false, 18731, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f30305a, false, 18725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30305a, false, 18725, new Class[0], Void.TYPE);
            return;
        }
        try {
            a.a(this.f30306b).c(d.b().e());
            ThreadPlus.submitRunnable(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f30311a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f30311a, false, 18736, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f30311a, false, 18736, new Class[0], Void.TYPE);
                        return;
                    }
                    a.a(b.this.f30306b).d(d.b().f());
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static b a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30305a, true, 18719, new Class[]{Context.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{context2}, null, f30305a, true, 18719, new Class[]{Context.class}, b.class);
        }
        if (h == null) {
            synchronized (b.class) {
                if (h == null) {
                    h = new b(context2);
                }
            }
        }
        return h;
    }

    private long b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30305a, false, 18726, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f30305a, false, 18726, new Class[]{String.class}, Long.TYPE)).longValue();
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

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f30305a, false, 18724, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f30305a, false, 18724, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.l == null) {
                this.l = new a((byte) 0);
            }
            if (this.m == null) {
                this.m = new a((byte) 0);
            }
            if (!DateUtils.isToday(this.l.f30320b)) {
                this.j = 0;
            }
            if (!DateUtils.isToday(this.l.f30322d)) {
                this.k = 0;
            }
            switch (i2) {
                case 0:
                    this.m.f30320b = this.l.f30320b;
                    this.m.f30321c = this.l.f30321c;
                    this.l.f30320b = currentTimeMillis;
                    this.l.f30321c = currentTimeMillis + 900000;
                    this.j++;
                    break;
                case 1:
                    this.l.f30321c = currentTimeMillis;
                    break;
                case 2:
                    this.m.f30322d = this.l.f30322d;
                    this.l.f30322d = currentTimeMillis;
                    this.k++;
                    break;
            }
            d();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30305a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 18732(0x492c, float:2.6249E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30305a
            r3 = 0
            r4 = 18732(0x492c, float:2.6249E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            if (r10 != 0) goto L_0x0033
            return
        L_0x0033:
            int r0 = r10.what     // Catch:{ Throwable -> 0x00a4 }
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x004c;
                case 2: goto L_0x0048;
                case 3: goto L_0x0039;
                default: goto L_0x0038;
            }     // Catch:{ Throwable -> 0x00a4 }
        L_0x0038:
            goto L_0x00a3
        L_0x0039:
            com.ss.android.newmedia.redbadge.f r0 = com.ss.android.newmedia.redbadge.f.a()     // Catch:{ Throwable -> 0x00a4 }
            android.content.Context r1 = r9.f30306b     // Catch:{ Throwable -> 0x00a4 }
            r0.a(r1)     // Catch:{ Throwable -> 0x00a4 }
            r9.f30309e = r8     // Catch:{ Throwable -> 0x00a4 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00a4 }
            goto L_0x00a3
        L_0x0048:
            r9.a((int) r7)     // Catch:{ Throwable -> 0x00a4 }
            goto L_0x00a4
        L_0x004c:
            r9.a((int) r7)     // Catch:{ Throwable -> 0x00a4 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00a4 }
            boolean r0 = r9.c()     // Catch:{ Throwable -> 0x00a4 }
            if (r0 == 0) goto L_0x00a3
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x00a4 }
            android.content.Context r1 = r9.f30306b     // Catch:{ Throwable -> 0x00a4 }
            com.ss.android.pushmanager.app.d$b r2 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x00a4 }
            java.lang.Class r2 = r2.b()     // Catch:{ Throwable -> 0x00a4 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x00a4 }
            java.lang.String r1 = "app_exit"
            r0.putExtra(r1, r7)     // Catch:{ Throwable -> 0x00a4 }
            android.content.Context r1 = r9.f30306b     // Catch:{ Throwable -> 0x00a4 }
            r1.startService(r0)     // Catch:{ Throwable -> 0x00a4 }
            goto L_0x00a4
        L_0x0072:
            r9.a((int) r8)     // Catch:{ Throwable -> 0x00a4 }
            com.ss.android.newmedia.redbadge.f r0 = com.ss.android.newmedia.redbadge.f.a()     // Catch:{ Throwable -> 0x00a4 }
            android.content.Context r1 = r9.f30306b     // Catch:{ Throwable -> 0x00a4 }
            r0.a(r1)     // Catch:{ Throwable -> 0x00a4 }
            r9.f30309e = r8     // Catch:{ Throwable -> 0x00a4 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00a4 }
            boolean r0 = r9.c()     // Catch:{ Throwable -> 0x00a4 }
            if (r0 == 0) goto L_0x00a3
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x00a4 }
            android.content.Context r1 = r9.f30306b     // Catch:{ Throwable -> 0x00a4 }
            com.ss.android.pushmanager.app.d$b r2 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x00a4 }
            java.lang.Class r2 = r2.b()     // Catch:{ Throwable -> 0x00a4 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x00a4 }
            java.lang.String r1 = "app_entrance"
            r0.putExtra(r1, r7)     // Catch:{ Throwable -> 0x00a4 }
            android.content.Context r1 = r9.f30306b     // Catch:{ Throwable -> 0x00a4 }
            r1.startService(r0)     // Catch:{ Throwable -> 0x00a4 }
            goto L_0x00a4
        L_0x00a3:
            return
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.b.handleMsg(android.os.Message):void");
    }

    private b(Context context) {
        boolean z;
        this.f30306b = context.getApplicationContext();
        this.f30307c = new WeakHandler(j.a().f2493b, this);
        if (PatchProxy.isSupport(new Object[0], this, f30305a, false, 18722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30305a, false, 18722, new Class[0], Void.TYPE);
        } else {
            try {
                this.j = a.a(this.f30306b).g();
                this.k = a.a(this.f30306b).h();
                String e2 = a.a(this.f30306b).e();
                if (!StringUtils.isEmpty(e2)) {
                    this.l = a.a(e2);
                }
                String f2 = a.a(this.f30306b).f();
                if (!StringUtils.isEmpty(f2)) {
                    this.m = a.a(f2);
                }
                if (this.l != null) {
                    if (!DateUtils.isToday(this.l.f30320b)) {
                        this.j = 0;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!DateUtils.isToday(this.l.f30322d)) {
                        this.k = 0;
                        z = true;
                    }
                    if (z) {
                        d();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (PatchProxy.isSupport(new Object[]{context}, this, f30305a, false, 18735, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f30305a, false, 18735, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "is_desktop_red_badge_show", "boolean"), true, this.n);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "desktop_red_badge_args", "string"), true, this.o);
            } catch (Throwable unused2) {
            }
        }
        a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1 = new java.util.Random().nextInt(5) + 1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30305a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 18728(0x4928, float:2.6244E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30305a
            r3 = 0
            r4 = 18728(0x4928, float:2.6244E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            if (r10 != 0) goto L_0x0033
            return
        L_0x0033:
            android.content.Context r0 = r9.f30306b
            if (r0 == 0) goto L_0x0124
            boolean r0 = r9.c()
            if (r0 != 0) goto L_0x003f
            goto L_0x0124
        L_0x003f:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0123 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0123 }
            r0.<init>(r10)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r1 = "show"
            int r1 = r0.optInt(r1)     // Catch:{ Throwable -> 0x0123 }
            if (r1 > 0) goto L_0x0050
            return
        L_0x0050:
            java.lang.String r1 = "content_type"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = "content"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ Throwable -> 0x0123 }
            long r2 = r9.b(r10)     // Catch:{ Throwable -> 0x0123 }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0123 }
            if (r4 != 0) goto L_0x0122
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0123 }
            if (r4 != 0) goto L_0x0122
            com.ss.android.pushmanager.setting.a r4 = com.ss.android.pushmanager.setting.a.a()     // Catch:{ Throwable -> 0x0123 }
            boolean r4 = r4.c()     // Catch:{ Throwable -> 0x0123 }
            if (r4 == 0) goto L_0x0078
            goto L_0x0122
        L_0x0078:
            java.lang.String r4 = "desktop_red_badge"
            boolean r4 = r4.equals(r1)     // Catch:{ Throwable -> 0x0123 }
            if (r4 == 0) goto L_0x00e2
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0085 }
            goto L_0x0090
        L_0x0085:
            java.util.Random r1 = new java.util.Random     // Catch:{ Throwable -> 0x0123 }
            r1.<init>()     // Catch:{ Throwable -> 0x0123 }
            r4 = 5
            int r1 = r1.nextInt(r4)     // Catch:{ Throwable -> 0x0123 }
            int r1 = r1 + r7
        L_0x0090:
            if (r1 <= 0) goto L_0x00d2
            com.ss.android.newmedia.redbadge.f r4 = com.ss.android.newmedia.redbadge.f.a()     // Catch:{ Throwable -> 0x0123 }
            android.content.Context r5 = r9.f30306b     // Catch:{ Throwable -> 0x0123 }
            r4.a(r5, r1)     // Catch:{ Throwable -> 0x0123 }
            r9.f30309e = r7     // Catch:{ Throwable -> 0x0123 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0123 }
            r4.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r5 = "content"
            r4.put(r5, r0)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r0 = "desktop_red_badge"
            long r5 = (long) r1     // Catch:{ Throwable -> 0x0123 }
            r9.a(r0, r5, r4)     // Catch:{ Throwable -> 0x0123 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Throwable -> 0x0123 }
            r0.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r4 = "badge_number"
            r0.putInt(r4, r1)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r1 = "red_badge_is_open"
            boolean r4 = r9.c()     // Catch:{ Throwable -> 0x0123 }
            r0.putInt(r1, r4)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r1 = "show_type"
            java.lang.String r4 = "request"
            r0.putString(r1, r4)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r1 = "rule_id"
            r0.putLong(r1, r2)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r1 = "red_badge_show"
            r9.a(r1, r0)     // Catch:{ Throwable -> 0x0123 }
            goto L_0x00dd
        L_0x00d2:
            com.ss.android.newmedia.redbadge.f r0 = com.ss.android.newmedia.redbadge.f.a()     // Catch:{ Throwable -> 0x0123 }
            android.content.Context r1 = r9.f30306b     // Catch:{ Throwable -> 0x0123 }
            r0.a(r1)     // Catch:{ Throwable -> 0x0123 }
            r9.f30309e = r8     // Catch:{ Throwable -> 0x0123 }
        L_0x00dd:
            r0 = 2
            r9.a((int) r0)     // Catch:{ Throwable -> 0x0123 }
            goto L_0x0123
        L_0x00e2:
            java.lang.String r2 = "notification"
            boolean r1 = r2.equals(r1)     // Catch:{ Throwable -> 0x0123 }
            if (r1 == 0) goto L_0x0121
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Throwable -> 0x0123 }
            com.ss.android.pushmanager.app.d$b r2 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = r2.d()     // Catch:{ Throwable -> 0x0123 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0123 }
            com.ss.android.pushmanager.app.d$b r2 = com.ss.android.pushmanager.app.d.b()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = r2.c()     // Catch:{ Throwable -> 0x0123 }
            r1.putExtra(r2, r0)     // Catch:{ Throwable -> 0x0123 }
            android.content.Context r2 = r9.f30306b     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x0123 }
            r1.setPackage(r2)     // Catch:{ Throwable -> 0x0123 }
            android.content.Context r2 = r9.f30306b     // Catch:{ Throwable -> 0x0123 }
            r2.startService(r1)     // Catch:{ Throwable -> 0x0123 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0123 }
            r1.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = "content"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r0 = "notification"
            r2 = 0
            r9.a(r0, r2, r1)     // Catch:{ Throwable -> 0x0123 }
        L_0x0121:
            return
        L_0x0122:
            return
        L_0x0123:
            return
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.b.a(java.lang.String):void");
    }

    private void a(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{str, bundle2}, this, f30305a, false, 18734, new Class[]{String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bundle2}, this, f30305a, false, 18734, new Class[]{String.class, Bundle.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle2.get(str2));
                }
            } catch (Throwable unused) {
            }
            d.b().a(this.f30306b, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    private void a(String str, long j2, JSONObject jSONObject) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j3), jSONObject}, this, f30305a, false, 18733, new Class[]{String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j3), jSONObject}, this, f30305a, false, 18733, new Class[]{String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        d.b().a(this.f30306b, "umeng", "red_badge", str, j2, 0, jSONObject);
    }
}
