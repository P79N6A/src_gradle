package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.vivo.push.b.aa;
import com.vivo.push.b.ab;
import com.vivo.push.b.b;
import com.vivo.push.b.c;
import com.vivo.push.b.d;
import com.vivo.push.b.f;
import com.vivo.push.b.g;
import com.vivo.push.b.h;
import com.vivo.push.b.n;
import com.vivo.push.b.w;
import com.vivo.push.b.x;
import com.vivo.push.b.z;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.o;
import com.vivo.push.util.r;
import com.vivo.push.util.v;
import com.vivo.push.util.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f81617a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile p f81618b;

    /* renamed from: c  reason: collision with root package name */
    private long f81619c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f81620d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f81621e = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f81622f = -1;
    private long g = -1;
    private long h = -1;
    private Context i;
    private boolean j = true;
    /* access modifiers changed from: private */
    public com.vivo.push.util.a k;
    /* access modifiers changed from: private */
    public String l;
    private String m;
    private SparseArray<a> n = new SparseArray<>();
    private int o = 0;
    private boolean p;
    private long q;
    private boolean r;
    private IPushClientFactory s = new o();
    private int t;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private IPushActionListener f81623a;

        /* renamed from: b  reason: collision with root package name */
        private c f81624b;

        /* renamed from: c  reason: collision with root package name */
        private IPushActionListener f81625c;

        /* renamed from: d  reason: collision with root package name */
        private Runnable f81626d;

        /* renamed from: e  reason: collision with root package name */
        private Object[] f81627e;

        public final Object[] b() {
            return this.f81627e;
        }

        public final void a() {
            if (this.f81626d == null) {
                o.a("PushClientManager", "task is null");
            } else {
                this.f81626d.run();
            }
        }

        public final void a(IPushActionListener iPushActionListener) {
            this.f81625c = iPushActionListener;
        }

        public final void a(Runnable runnable) {
            this.f81626d = runnable;
        }

        public a(c cVar, IPushActionListener iPushActionListener) {
            this.f81624b = cVar;
            this.f81623a = iPushActionListener;
        }

        public final void a(int i, Object... objArr) {
            this.f81627e = objArr;
            if (this.f81625c != null) {
                this.f81625c.onStateChanged(i);
            }
            if (this.f81623a != null) {
                this.f81623a.onStateChanged(i);
            }
        }
    }

    public final boolean e() {
        return this.r;
    }

    public final boolean g() {
        return this.j;
    }

    public final Context h() {
        return this.i;
    }

    public final String l() {
        return this.m;
    }

    public final int s() {
        return this.t;
    }

    public final void a(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() > 0) {
                String a2 = this.k.a("APP_TAGS");
                if (TextUtils.isEmpty(a2)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(a2);
                }
                for (String put : list) {
                    jSONObject.put(put, System.currentTimeMillis());
                }
                String jSONObject2 = jSONObject.toString();
                if (TextUtils.isEmpty(jSONObject2)) {
                    this.k.c("APP_TAGS");
                } else {
                    this.k.a("APP_TAGS", jSONObject2);
                }
            }
        } catch (JSONException e2) {
            com.google.a.a.a.a.a.a.b(e2);
            this.k.c("APP_TAGS");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        this.j = z;
    }

    public final void a(String str, int i2, Object... objArr) {
        a c2 = c(str);
        if (c2 != null) {
            c2.a(i2, objArr);
        } else {
            o.d("PushClientManager", "notifyApp token is null");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (this.i != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            com.vivo.push.b.a aVar = new com.vivo.push.b.a(true, str, this.i.getPackageName(), arrayList);
            aVar.a(100);
            a((y) aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, IPushActionListener iPushActionListener) {
        if (this.i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (TextUtils.isEmpty(this.m) || !this.m.equals(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            com.vivo.push.b.a aVar = new com.vivo.push.b.a(true, null, this.i.getPackageName(), arrayList);
            aVar.a(100);
            if (!this.r) {
                a((y) aVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            } else if (!this.p) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(BaseLoginOrRegisterActivity.o);
                }
            } else if (!a(this.f81621e)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
                }
            } else {
                this.f81621e = SystemClock.elapsedRealtime();
                String a2 = a(new a(aVar, iPushActionListener));
                aVar.b(a2);
                if (TextUtils.isEmpty(this.l)) {
                    a(a2, 30001);
                } else if (TextUtils.isEmpty(str)) {
                    a(a2, 30002);
                } else if (((long) str.length()) > 70) {
                    a(a2, 30003);
                } else {
                    a((y) aVar);
                    d(a2);
                }
            }
        } else {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
            }
        }
    }

    public final void a(String str, int i2) {
        a c2 = c(str);
        if (c2 != null) {
            c2.a(i2, new Object[0]);
        } else {
            o.d("PushClientManager", "notifyStatusChanged token is null");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        if (this.i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
            return;
        }
        ab abVar = new ab(true, null, this.i.getPackageName(), arrayList);
        abVar.a(500);
        if (!this.r) {
            a((y) abVar);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
            }
        } else if (!this.p) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(BaseLoginOrRegisterActivity.o);
            }
        } else if (!a(this.g)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
            }
        } else {
            this.g = SystemClock.elapsedRealtime();
            String a2 = a(new a(abVar, iPushActionListener));
            abVar.b(a2);
            if (TextUtils.isEmpty(this.l)) {
                a(a2, 20001);
            } else if (arrayList.size() < 0) {
                a(a2, 20002);
            } else {
                if (arrayList.size() + c().size() > 500) {
                    a(a2, 20004);
                    return;
                }
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((long) it2.next().length()) > 70) {
                        a(a2, 20003);
                        return;
                    }
                }
                a((y) abVar);
                d(a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, ArrayList<String> arrayList) {
        if (this.i != null) {
            ab abVar = new ab(true, str, this.i.getPackageName(), arrayList);
            abVar.a(500);
            a((y) abVar);
        }
    }

    public final void b(boolean z) {
        o.a(z);
        x xVar = new x();
        xVar.a(z ? 1 : 0);
        a((y) xVar);
    }

    public final void k() {
        this.k.a();
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> t() {
        return y.f(this.i);
    }

    /* access modifiers changed from: private */
    public void u() {
        this.m = null;
        this.k.c("APP_ALIAS");
    }

    /* access modifiers changed from: protected */
    public final void b() throws VivoPushException {
        if (this.i != null) {
            y.c(this.i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        a((y) new f());
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        a((y) new aa());
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        a((y) new z());
    }

    public final void n() {
        a((y) new d(true));
    }

    public final void o() {
        a((y) new d(false));
    }

    public final void p() {
        a((y) new w());
    }

    public final void r() {
        a((y) new h());
    }

    public static p a() {
        if (f81618b == null) {
            synchronized (f81617a) {
                if (f81618b == null) {
                    f81618b = new p();
                }
            }
        }
        return f81618b;
    }

    public final boolean q() {
        if (this.i.getPackageManager().getComponentEnabledSetting(new ComponentName(this.i, "com.vivo.push.sdk.service.PushService")) != 2) {
            return true;
        }
        return false;
    }

    private p() {
    }

    public final List<String> c() {
        String a2 = this.k.a("APP_TAGS");
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(a2)) {
                return arrayList;
            }
            Iterator<String> keys = new JSONObject(a2).keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            return arrayList;
        } catch (JSONException unused) {
            this.k.c("APP_TAGS");
            arrayList.clear();
            o.d("PushClientManager", "getTags error");
        }
    }

    public final boolean d() {
        boolean z = false;
        if (this.i == null) {
            o.d("PushClientManager", "support:context is null");
            return false;
        }
        this.q = y.b(this.i);
        if (this.q >= 1230 && y.e(this.i)) {
            z = true;
        }
        this.p = z;
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public final String f() {
        String a2 = this.k.a("APP_TOKEN");
        if (TextUtils.isEmpty(a2) || !y.a(this.i, this.i.getPackageName(), a2)) {
            return a2;
        }
        this.k.a();
        return null;
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        w.a((Runnable) new u(this, str));
    }

    public final void a(String str) {
        this.l = str;
        this.k.a("APP_TOKEN", this.l);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.vivo.push.p.a c(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0019
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            android.util.SparseArray<com.vivo.push.p$a> r0 = r2.n     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            com.vivo.push.p$a r0 = (com.vivo.push.p.a) r0     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            android.util.SparseArray<com.vivo.push.p$a> r1 = r2.n     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            r1.delete(r3)     // Catch:{ Exception -> 0x0019, all -> 0x0016 }
            monitor-exit(r2)
            return r0
        L_0x0016:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0019:
            r3 = 0
            monitor-exit(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.p.c(java.lang.String):com.vivo.push.p$a");
    }

    public final void b(int i2) {
        this.t = i2;
    }

    private synchronized String a(a aVar) {
        int i2;
        this.n.put(this.o, aVar);
        i2 = this.o;
        this.o = i2 + 1;
        return Integer.toString(i2);
    }

    public final void b(String str) {
        this.m = str;
        this.k.a("APP_ALIAS", str);
    }

    private static boolean a(long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j2 == -1 || elapsedRealtime <= j2 || elapsedRealtime >= j2 + 2000) {
            return true;
        }
        return false;
    }

    public final void c(List<String> list) {
        if (list.contains(this.m)) {
            u();
        }
    }

    public final void a(int i2) {
        boolean z;
        if (i2 < 4 || this.q >= 1260) {
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            o.a(z);
            x xVar = new x();
            xVar.a(i2);
            a((y) xVar);
            return;
        }
        o.b("PushClientManager", "current push version " + this.q + " is not support this mode");
    }

    /* access modifiers changed from: package-private */
    public final void b(IPushActionListener iPushActionListener) {
        if (this.i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if ("".equals(this.l)) {
            iPushActionListener.onStateChanged(0);
        } else if (!a(this.f81620d)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
            }
        } else {
            this.f81620d = SystemClock.elapsedRealtime();
            String packageName = this.i.getPackageName();
            a aVar = null;
            if (this.i != null) {
                b bVar = new b(false, packageName);
                bVar.d();
                bVar.e();
                bVar.g();
                bVar.a(100);
                if (!this.r) {
                    a((y) bVar);
                    if (iPushActionListener != null) {
                        iPushActionListener.onStateChanged(0);
                    }
                } else if (this.p) {
                    aVar = new a(bVar, iPushActionListener);
                    String a2 = a(aVar);
                    bVar.b(a2);
                    aVar.a((Runnable) new t(this, bVar, a2));
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(BaseLoginOrRegisterActivity.o);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
            if (aVar != null) {
                aVar.a((IPushActionListener) new s(this));
                aVar.a();
            }
        }
    }

    public final void a(Context context) {
        boolean z;
        if (this.i == null) {
            this.i = context.getApplicationContext();
            this.q = y.b(context);
            if (this.q < 1230 || !y.e(this.i)) {
                z = false;
            } else {
                z = true;
            }
            this.p = z;
            this.r = r.b(context, context.getPackageName());
            v.b().a(this.i);
            a((y) new g());
            this.k = new com.vivo.push.util.a();
            this.k.a(context, "com.vivo.push_preferences.appconfig_v1");
            this.l = f();
            this.m = this.k.a("APP_ALIAS");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(IPushActionListener iPushActionListener) {
        if (this.i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
            return;
        }
        this.l = f();
        if (!TextUtils.isEmpty(this.l)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
            }
        } else if (!a(this.f81619c)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
            }
        } else {
            this.f81619c = SystemClock.elapsedRealtime();
            String packageName = this.i.getPackageName();
            a aVar = null;
            if (this.i != null) {
                b bVar = new b(true, packageName);
                bVar.g();
                bVar.d();
                bVar.e();
                bVar.a(100);
                if (!this.r) {
                    a((y) bVar);
                    if (iPushActionListener != null) {
                        iPushActionListener.onStateChanged(0);
                    }
                } else if (this.p) {
                    aVar = new a(bVar, iPushActionListener);
                    String a2 = a(aVar);
                    bVar.b(a2);
                    aVar.a((Runnable) new r(this, bVar, a2));
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(BaseLoginOrRegisterActivity.o);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
            if (aVar != null) {
                aVar.a((IPushActionListener) new q(this, aVar));
                aVar.a();
            }
        }
    }

    public final void a(y yVar) {
        Context context = a().i;
        if (yVar == null) {
            o.a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                o.c(context, "[执行指令失败]指令空！");
            }
            return;
        }
        v createTask = this.s.createTask(yVar);
        if (createTask == null) {
            o.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(yVar)));
            if (context != null) {
                o.c(context, "[执行指令失败]指令" + yVar + "任务空！");
            }
            return;
        }
        o.d("PushClientManager", "client--sendCommand, command = ".concat(String.valueOf(yVar)));
        w.a(createTask);
    }

    public final void b(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() > 0) {
                String a2 = this.k.a("APP_TAGS");
                if (TextUtils.isEmpty(a2)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(a2);
                }
                for (String remove : list) {
                    jSONObject.remove(remove);
                }
                String jSONObject2 = jSONObject.toString();
                if (TextUtils.isEmpty(jSONObject2)) {
                    this.k.c("APP_TAGS");
                } else {
                    this.k.a("APP_TAGS", jSONObject2);
                }
            }
        } catch (JSONException e2) {
            com.google.a.a.a.a.a.a.b(e2);
            this.k.c("APP_TAGS");
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2) {
        if (this.i != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            com.vivo.push.b.a aVar = new com.vivo.push.b.a(false, str, this.i.getPackageName(), arrayList);
            aVar.a(100);
            a((y) aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, IPushActionListener iPushActionListener) {
        if (this.i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (TextUtils.isEmpty(this.m)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            com.vivo.push.b.a aVar = new com.vivo.push.b.a(false, null, this.i.getPackageName(), arrayList);
            aVar.a(100);
            if (!this.r) {
                a((y) aVar);
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(0);
                }
            } else if (!this.p) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(BaseLoginOrRegisterActivity.o);
                }
            } else if (!a(this.f81622f)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
                }
            } else {
                this.f81622f = SystemClock.elapsedRealtime();
                String a2 = a(new a(aVar, iPushActionListener));
                aVar.b(a2);
                if (TextUtils.isEmpty(this.l)) {
                    a(a2, 30001);
                } else if (TextUtils.isEmpty(str)) {
                    a(a2, 30002);
                } else if (((long) str.length()) > 70) {
                    a(a2, 30003);
                } else {
                    a((y) aVar);
                    d(a2);
                }
            }
        }
    }

    public final void a(Intent intent, PushMessageCallback pushMessageCallback) {
        y createReceiverCommand = this.s.createReceiverCommand(intent);
        Context context = a().i;
        if (createReceiverCommand == null) {
            o.a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                o.c(context, "[执行指令失败]指令空！");
            }
            return;
        }
        com.vivo.push.c.aa createReceiveTask = this.s.createReceiveTask(createReceiverCommand);
        if (createReceiveTask == null) {
            o.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(createReceiverCommand)));
            if (context != null) {
                o.c(context, "[执行指令失败]指令" + createReceiverCommand + "任务空！");
            }
            return;
        }
        if (context != null && !(createReceiverCommand instanceof n)) {
            o.a(context, "[接收指令]".concat(String.valueOf(createReceiverCommand)));
        }
        createReceiveTask.a(pushMessageCallback);
        w.a((v) createReceiveTask);
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, ArrayList<String> arrayList) {
        if (this.i != null) {
            ab abVar = new ab(false, str, this.i.getPackageName(), arrayList);
            abVar.a(500);
            a((y) abVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(ArrayList<String> arrayList, IPushActionListener iPushActionListener) {
        if (this.i == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
            return;
        }
        ab abVar = new ab(false, null, this.i.getPackageName(), arrayList);
        abVar.a(500);
        if (!this.r) {
            a((y) abVar);
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
            }
        } else if (!this.p) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(BaseLoginOrRegisterActivity.o);
            }
        } else if (!a(this.h)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
            }
        } else {
            this.h = SystemClock.elapsedRealtime();
            String a2 = a(new a(abVar, iPushActionListener));
            abVar.b(a2);
            if (TextUtils.isEmpty(this.l)) {
                a(a2, 20001);
            } else if (arrayList.size() < 0) {
                a(a2, 20002);
            } else if (arrayList.size() > 500) {
                a(a2, 20004);
            } else {
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((long) it2.next().length()) > 70) {
                        a(a2, 20003);
                        return;
                    }
                }
                a((y) abVar);
                d(a2);
            }
        }
    }
}
