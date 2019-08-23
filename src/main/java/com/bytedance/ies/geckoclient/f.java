package com.bytedance.ies.geckoclient;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.event.ConnectEvent;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.geckoclient.d.b;
import com.bytedance.ies.geckoclient.e.e;
import com.bytedance.ies.geckoclient.f.a;
import com.bytedance.ies.geckoclient.model.PackageStatisticModel;
import com.bytedance.ies.geckoclient.model.c;
import com.bytedance.ies.geckoclient.model.d;
import com.bytedance.ies.geckoclient.model.g;
import com.bytedance.ies.geckoclient.model.j;
import com.bytedance.ies.geckoclient.model.l;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class f implements OnMessageReceiveListener, g, i, j {
    public static Context l;

    /* renamed from: a  reason: collision with root package name */
    c f20736a;

    /* renamed from: b  reason: collision with root package name */
    public String f20737b;

    /* renamed from: c  reason: collision with root package name */
    public String f20738c;

    /* renamed from: d  reason: collision with root package name */
    public String f20739d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, d> f20740e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f20741f;
    Executor g;
    Queue<b> h;
    public Handler i;
    public l j;
    public com.bytedance.ies.geckoclient.a.a k;
    public com.bytedance.ies.geckoclient.d.a m;
    public b n;
    public a o;
    public o p;
    public Map<String, String> q;
    private Map<String, h> r;
    private Map<String, com.bytedance.ies.geckoclient.c.a> s;
    private boolean t;
    private Queue<String> u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private ConnectionState z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private f f20764a;

        /* renamed from: b  reason: collision with root package name */
        private String f20765b;

        public final f a() {
            n.a(f.l, "bspatch");
            f fVar = this.f20764a;
            if (fVar.n == null) {
                com.bytedance.ies.geckoclient.d.c.f20724a = new com.bytedance.ies.geckoclient.d.c(new com.bytedance.ies.geckoclient.d.d());
            } else {
                com.bytedance.ies.geckoclient.d.c.f20724a = new com.bytedance.ies.geckoclient.d.c(fVar.n);
            }
            f fVar2 = this.f20764a;
            if (!fVar2.f20740e.isEmpty()) {
                fVar2.g.execute(new m(fVar2.j, fVar2.f20740e, fVar2));
            } else {
                fVar2.d();
            }
            f fVar3 = this.f20764a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(fVar3.c());
            fVar3.a(com.bytedance.ies.geckoclient.b.b.a().f20720a.toJson((Object) new g(arrayList, 0, 1)), 100);
            f fVar4 = this.f20764a;
            o oVar = new o(this.f20764a);
            o.f20831a = oVar;
            fVar4.p = oVar;
            return this.f20764a;
        }

        public final a a(b bVar) {
            this.f20764a.n = bVar;
            return this;
        }

        public final a a(com.bytedance.ies.geckoclient.f.a aVar) {
            this.f20764a.o = aVar;
            return this;
        }

        public final a a(com.bytedance.ies.geckoclient.a.a aVar) {
            this.f20764a.k = aVar;
            if (aVar != null) {
                com.bytedance.ies.geckoclient.a.b bVar = aVar.f20701b;
                Context context = f.l;
                bVar.a(context, aVar, this.f20765b + "_" + this.f20764a.c(), this.f20764a.f20737b, this.f20764a.f20738c);
            }
            return this;
        }

        public final a a(h hVar) {
            this.f20764a.f20741f.add(hVar);
            return this;
        }

        public final a a(d dVar) {
            this.f20764a.a(dVar);
            return this;
        }

        public final a a(String str) {
            com.bytedance.ies.geckoclient.d.a aVar = this.f20764a.m;
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            aVar.f20722a = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f20764a.q = map;
            return this;
        }

        public final a a(long j, TimeUnit timeUnit) {
            com.bytedance.ies.geckoclient.d.d.f20727b.readTimeout(60, timeUnit).connectTimeout(60, timeUnit);
            return this;
        }

        public final a b(long j, TimeUnit timeUnit) {
            com.bytedance.ies.geckoclient.d.d.f20726a.readTimeout(60, timeUnit).connectTimeout(60, timeUnit);
            return this;
        }

        public a(String str, Context context, String str2, String str3, String str4, String str5, int i) {
            this.f20765b = str2;
            f fVar = new f(str, str2, context, new c(str3, str4, str5, i), (byte) 0);
            this.f20764a = fVar;
        }
    }

    public static void a() {
        e.f20730a = true;
    }

    public final boolean a(String str, com.bytedance.ies.geckoclient.c.a aVar) {
        return a(str, 5000, aVar);
    }

    public final boolean a(final String str, int i2, final com.bytedance.ies.geckoclient.c.a aVar) {
        if (this.r.containsKey(str)) {
            aVar.a("", null);
            return false;
        }
        if (!this.f20740e.containsKey(str)) {
            a(new d(str));
        }
        final AnonymousClass1 r0 = new h() {
            public final void a(int i, d dVar) {
            }

            public final void a(d dVar, boolean z) {
            }

            public final void a(List<d> list, List<j> list2) {
            }

            public final void b(int i, d dVar) {
                aVar.a();
                f.this.a(str, (h) this);
            }

            public final void a(List<d> list, Exception exc) {
                aVar.a("onCheckServerVersionFail", exc);
                f.this.a(str, (h) this);
            }

            public final void a(int i, d dVar, Exception exc) {
                aVar.a("onDownloadPackageFail", exc);
                f.this.a(str, (h) this);
            }

            public final void b(int i, d dVar, Exception exc) {
                aVar.a("onActivatePackageFail", exc);
                f.this.a(str, (h) this);
            }
        };
        this.f20741f.add(r0);
        this.r.put(str, r0);
        this.s.put(str, aVar);
        a(str);
        if (i2 > 0 && i2 <= 10000) {
            this.i.postDelayed(new Runnable() {
                public final void run() {
                    if (f.this.f20741f.contains(r0)) {
                        aVar.a("timeout", null);
                        f.this.a(str, r0);
                    }
                }
            }, (long) i2);
        }
        return true;
    }

    public final void a(String str, h hVar) {
        this.r.remove(str);
        this.s.remove(str);
        this.f20741f.remove(hVar);
    }

    public final void a(String... strArr) {
        a(false, strArr);
    }

    public final void a(final String str, com.bytedance.ies.geckoclient.e.a<Boolean> aVar) {
        this.g.execute(new Runnable(null) {
            public final void run() {
                final boolean a2 = f.this.j.a(f.this.f20738c, str);
                if (a2 && f.this.f20740e != null && f.this.f20740e.containsKey(str)) {
                    f.this.f20740e.get(str).f20789a = 0;
                }
                f.this.i.post(new Runnable() {
                    public final void run() {
                        if (null != null) {
                            Boolean.valueOf(a2);
                        }
                    }
                });
            }
        });
    }

    public final void a(final List<d> list, final List<j> list2, boolean z2) {
        new StringBuilder("on check update done:").append(list2.size());
        Iterator<d> it2 = list.iterator();
        while (true) {
            int i2 = 0;
            if (it2.hasNext()) {
                String str = it2.next().f20791c;
                if (list2.size() == 0) {
                    if (this.s.containsKey(str)) {
                        this.s.get(str).a();
                        a(str, this.r.get(str));
                    }
                    return;
                }
                for (j jVar : list2) {
                    if (TextUtils.equals(str, jVar.f20812b)) {
                        i2 = 1;
                    }
                }
                if (i2 == 0 && this.s.containsKey(str)) {
                    this.s.get(str).a();
                    a(str, this.r.get(str));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                while (i2 < list2.size()) {
                    j jVar2 = list2.get(i2);
                    d dVar = this.f20740e.get(jVar2.f20812b);
                    if (dVar != null) {
                        dVar.j = jVar2;
                        if (jVar2 != null) {
                            dVar.g = jVar2.f20813c;
                        }
                    }
                    if (jVar2.a() != null) {
                        if (jVar2.c().f20809b) {
                            this.j.a(this.f20738c, jVar2.f20812b);
                        }
                        r rVar = new r(this.m, dVar, this.f20738c, z2, this);
                        arrayList.add(rVar);
                    }
                    i2++;
                }
                this.g.execute(new s(this.m, arrayList, this.g));
                this.i.post(new Runnable() {
                    public final void run() {
                        if (!f.a(f.this.f20741f)) {
                            for (h a2 : f.this.f20741f) {
                                a2.a(list, list2);
                            }
                        }
                    }
                });
                return;
            }
        }
    }

    public final void a(boolean z2, int i2, d dVar) {
        this.j.a(i2, dVar);
        if (i2 == 1 && !a(this.f20741f)) {
            for (h a2 : this.f20741f) {
                a2.a(dVar, z2);
            }
        }
    }

    public final void a(boolean z2, int i2, d dVar, j jVar) {
        Message obtain = Message.obtain();
        dVar.k = null;
        obtain.obj = dVar;
        if (z2) {
            obtain.arg2 = jVar.b().f20820a;
        } else {
            obtain.arg2 = jVar.a().f20820a;
        }
        switch (i2) {
            case 1:
                obtain.what = 2;
                if (z2) {
                    obtain.arg1 = 100;
                } else {
                    obtain.arg1 = 0;
                }
                this.i.sendMessage(obtain);
                a(dVar.j.a().f20820a, obtain.arg1, dVar.j.b() != null ? dVar.j.b().f20820a : 0, "", "", dVar.f20791c);
                return;
            case 2:
                if (z2) {
                    obtain.arg1 = 102;
                } else {
                    obtain.arg1 = 2;
                }
                obtain.what = 3;
                this.i.sendMessage(obtain);
                a(dVar.j.a().f20820a, obtain.arg1, dVar.j.b() != null ? dVar.j.b().f20820a : 0, "", "", dVar.f20791c);
                break;
        }
    }

    public final void a(boolean z2, int i2, d dVar, j jVar, Exception exc, int i3) {
        Message obtain = Message.obtain();
        if (z2) {
            obtain.arg2 = jVar.b().f20820a;
        } else {
            if (jVar.c().f20808a) {
                this.j.a(this.f20738c, jVar.f20812b);
            }
            obtain.arg2 = jVar.a().f20820a;
        }
        switch (i2) {
            case 1:
                obtain.what = 2;
                if (z2) {
                    obtain.arg1 = BaseLoginOrRegisterActivity.o;
                } else {
                    obtain.arg1 = 1;
                }
                dVar.k = exc;
                dVar.l = i3;
                obtain.obj = dVar;
                this.i.sendMessage(obtain);
                String str = "";
                String str2 = "";
                int i4 = dVar.j.a().f20820a;
                int i5 = dVar.j.b() != null ? dVar.j.b().f20820a : 0;
                if (dVar.l != 0) {
                    str = dVar.l;
                }
                String str3 = str;
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    com.google.a.a.a.a.a.a.a((Throwable) exc, new PrintWriter(stringWriter));
                    str2 = stringWriter.toString();
                }
                a(i4, obtain.arg1, i5, str3, str2, dVar.f20791c);
                return;
            case 2:
                obtain.what = 3;
                if (z2) {
                    obtain.arg1 = 103;
                } else {
                    obtain.arg1 = 3;
                }
                dVar.k = exc;
                dVar.l = i3;
                obtain.obj = dVar;
                this.i.sendMessage(obtain);
                String str4 = "";
                String str5 = "";
                int i6 = dVar.j.a().f20820a;
                int i7 = dVar.j.b() != null ? dVar.j.b().f20820a : 0;
                if (dVar.l != 0) {
                    str4 = dVar.l;
                }
                String str6 = str4;
                if (exc != null) {
                    StringWriter stringWriter2 = new StringWriter();
                    com.google.a.a.a.a.a.a.a((Throwable) exc, new PrintWriter(stringWriter2));
                    str5 = stringWriter2.toString();
                }
                a(i6, obtain.arg1, i7, str6, str5, dVar.f20791c);
                break;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i2) {
        if (this.o == null || !this.o.a()) {
            if (this.u.size() < 10) {
                this.u.add(str);
            }
            return;
        }
        this.o.a(str, i2);
    }

    public final String c() {
        return this.f20736a.f20785a;
    }

    public final List<d> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20740e.values());
        return arrayList;
    }

    public final void d() {
        this.t = true;
        Message obtain = Message.obtain();
        obtain.what = 0;
        this.i.sendMessage(obtain);
    }

    public final void e() {
        while (this.u.size() > 0 && this.o != null && this.o.a()) {
            a(this.u.poll(), (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }

    public final f a(d dVar) {
        return a(dVar, false);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d(String str) {
        if (this.o == null || this.o.a(str)) {
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        return new File(str + "gecko_activate_done").exists();
    }

    public final void b(d dVar) {
        if (dVar != null) {
            new StringBuilder("update done:").append(dVar.f20791c);
            if (dVar.i) {
                this.j.b(dVar);
            } else {
                this.j.a(dVar);
            }
            if (this.k != null) {
                this.k.f20701b.a();
            }
        }
    }

    public void onReceiveMsg(WsChannelMsg wsChannelMsg) {
        int b2 = this.o.b();
        if (wsChannelMsg != null && wsChannelMsg.getChannelId() == b2 && e.a(wsChannelMsg.getService())) {
            a(new l(wsChannelMsg.getMethod(), new String(wsChannelMsg.getPayload())));
        }
    }

    private static void e(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalArgumentException("invalid gecko dir:" + str + ", can't create directory at this path");
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("invalid gecko dir:" + str + " is not a directory");
        }
    }

    public final boolean b(String str) {
        d dVar = this.f20740e.get(str);
        if (dVar == null) {
            return false;
        }
        String str2 = dVar.f20792d;
        return new File(this.f20738c + str2).exists();
    }

    private com.bytedance.ies.geckoclient.model.f b(l lVar) {
        com.bytedance.ies.geckoclient.model.f fVar = new com.bytedance.ies.geckoclient.model.f((byte) 0);
        fVar.f20800d = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        try {
            com.bytedance.ies.geckoclient.model.e eVar = (com.bytedance.ies.geckoclient.model.e) com.bytedance.ies.geckoclient.b.b.a().f20720a.fromJson(lVar.f20829b, com.bytedance.ies.geckoclient.model.e.class);
            if (eVar == null) {
                return fVar;
            }
            fVar.f20797a = eVar.f20796b;
            fVar.h = 2;
            fVar.f20798b = this.f20736a.f20787c;
            fVar.f20799c = 0;
            fVar.f20801e = this.f20736a.f20786b;
            fVar.f20802f = String.valueOf(com.bytedance.ies.geckoclient.e.c.c(l));
            fVar.g = com.bytedance.ies.geckoclient.e.c.a();
            List<String> list = eVar.f20795a;
            if (list == null || list.size() == 0) {
                return fVar;
            }
            switch (lVar.f20828a) {
                case 1:
                    if (list.size() != 1 || !"*".equals(list.get(0))) {
                        a(true, (String[]) list.toArray(new String[0]));
                    } else {
                        a(true, new String[0]);
                    }
                    fVar.f20800d = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    break;
                case 2:
                    for (final String next : eVar.f20795a) {
                        this.g.execute(new Runnable() {
                            public final void run() {
                                f fVar = f.this;
                                fVar.j.a(fVar.f20738c, next);
                            }
                        });
                    }
                    fVar.f20800d = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    break;
            }
            return fVar;
        } catch (Exception unused) {
            return fVar;
        }
    }

    public final d a(String str) {
        return this.f20740e.get(str);
    }

    public final void a(l lVar) {
        int i2 = lVar.f20828a;
        boolean z2 = true;
        if (!(i2 == 2 || i2 == 1)) {
            z2 = false;
        }
        if (z2) {
            final com.bytedance.ies.geckoclient.model.f b2 = b(lVar);
            this.g.execute(new Runnable() {
                public final void run() {
                    try {
                        com.bytedance.ies.geckoclient.d.a aVar = f.this.m;
                        com.bytedance.ies.geckoclient.model.f fVar = b2;
                        if (fVar != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Pair.create("msg_type", PushConstants.PUSH_TYPE_UPLOAD_LOG));
                            arrayList.add(Pair.create("device_id", aVar.f20723b.f20787c));
                            arrayList.add(Pair.create("os", PushConstants.PUSH_TYPE_NOTIFY));
                            arrayList.add(Pair.create("status", fVar.f20800d));
                            arrayList.add(Pair.create("app_version", aVar.f20723b.f20786b));
                            arrayList.add(Pair.create("sdk_version", fVar.f20802f));
                            arrayList.add(Pair.create("device_model", fVar.g));
                            com.bytedance.ies.geckoclient.d.c.a().f20725b.a("https://" + aVar.f20722a + String.format("gecko/server/push_task/%s/stats", new Object[]{Long.valueOf(fVar.f20797a)}), (List<Pair<String, String>>) arrayList);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            a(com.bytedance.ies.geckoclient.b.b.a().f20720a.toJson((Object) b2), (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }

    public final void a(final Exception exc) {
        this.i.post(new Runnable() {
            public final void run() {
                if (!f.a(f.this.f20741f)) {
                    ArrayList arrayList = new ArrayList(f.this.f20740e.values());
                    for (h a2 : f.this.f20741f) {
                        a2.a((List<d>) arrayList, exc);
                    }
                }
            }
        });
    }

    public void onReceiveConnectEvent(ConnectEvent connectEvent, JSONObject jSONObject) {
        if (this.z != connectEvent.connectionState && connectEvent.connectionState == ConnectionState.CONNECTED) {
            e();
        }
    }

    private f a(d dVar, boolean z2) {
        if (dVar != null && !this.f20740e.containsKey(dVar.f20791c)) {
            this.f20740e.put(dVar.f20791c, dVar);
        }
        return this;
    }

    private void a(boolean z2, String... strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr == null || strArr.length == 0) {
            for (Map.Entry next : this.f20740e.entrySet()) {
                if (next.getValue() != null) {
                    arrayList.add(next.getValue());
                }
            }
        } else {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (this.f20740e.get(strArr[i2]) != null) {
                    arrayList.add(this.f20740e.get(strArr[i2]));
                }
            }
        }
        if (arrayList.size() != 0) {
            b bVar = new b(l, this.m, arrayList, this.j, this.f20736a, z2, this, this.f20739d, this.f20738c, this.q);
            if (!this.t) {
                this.h.add(bVar);
            } else {
                this.g.execute(bVar);
            }
        }
    }

    private f(String str, String str2, Context context, c cVar) {
        this.f20740e = new ConcurrentHashMap();
        this.f20741f = new CopyOnWriteArrayList();
        this.r = new HashMap();
        this.g = (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(3).a());
        this.s = new HashMap();
        this.h = new LinkedBlockingQueue();
        this.u = new LinkedBlockingQueue();
        this.v = 0;
        this.w = 2;
        this.x = 3;
        this.y = 4;
        this.z = null;
        this.f20736a = cVar;
        if (!TextUtils.isEmpty(str)) {
            String str3 = cVar.f20785a;
            this.f20737b = str;
            if (this.f20737b.charAt(this.f20737b.length() - 1) != '/') {
                this.f20737b += '/';
            }
            this.f20738c = this.f20737b + str3 + '/';
            e(this.f20738c);
            this.f20739d = this.f20738c + ".inactive/";
            e(this.f20739d);
            this.i = new Handler(Looper.getMainLooper()) {
                public final void handleMessage(Message message) {
                    f fVar = f.this;
                    int i = message.what;
                    if (i != 0) {
                        switch (i) {
                            case 2:
                                d dVar = (d) message.obj;
                                Exception exc = dVar.k;
                                dVar.k = null;
                                if (!f.a(fVar.f20741f) && !f.a(fVar.f20741f)) {
                                    for (h next : fVar.f20741f) {
                                        if (message.obj instanceof d) {
                                            if (exc != null) {
                                                next.a(message.arg2, dVar, exc);
                                            } else {
                                                next.a(message.arg2, dVar);
                                            }
                                        }
                                    }
                                    return;
                                }
                            case 3:
                                d dVar2 = (d) message.obj;
                                Exception exc2 = dVar2.k;
                                dVar2.k = null;
                                HashMap hashMap = new HashMap();
                                hashMap.put("key_channel", dVar2.f20791c);
                                if (dVar2.l != 0) {
                                    hashMap.put("key_error_code", String.valueOf(dVar2.l));
                                    String.valueOf(dVar2.l);
                                }
                                if (exc2 != null) {
                                    StringWriter stringWriter = new StringWriter();
                                    com.google.a.a.a.a.a.a.a((Throwable) exc2, new PrintWriter(stringWriter));
                                    hashMap.put("key_error_msg", stringWriter.toString());
                                }
                                if (!f.a(fVar.f20741f) && (message.obj instanceof d)) {
                                    d dVar3 = (d) message.obj;
                                    for (h next2 : fVar.f20741f) {
                                        if (exc2 != null) {
                                            next2.b(message.arg2, dVar3, exc2);
                                        } else {
                                            next2.b(message.arg2, dVar3);
                                        }
                                    }
                                    break;
                                }
                        }
                    } else {
                        if (!fVar.h.isEmpty()) {
                            while (fVar.h.peek() != null) {
                                fVar.g.execute(fVar.h.poll());
                            }
                        }
                        if (!f.a(fVar.f20741f)) {
                            Iterator<h> it2 = fVar.f20741f.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                                fVar.b();
                            }
                        }
                    }
                }
            };
            this.m = new com.bytedance.ies.geckoclient.d.a(cVar);
            l = context;
            com.bytedance.ies.geckoclient.e.d a2 = com.bytedance.ies.geckoclient.e.d.a(context);
            String str4 = this.f20737b;
            String str5 = this.f20738c;
            a2.f20732a = str2 + "_" + c();
            a2.f20734c = str5;
            a2.f20733b = str4;
            a2.f20735d = "create table if not exists " + r7 + " (id integer primary key autoincrement,channel" + " text,version" + " integer,update_when_launch" + " integer,zip" + " text,package_dir" + " text,patch_zip" + " text,update_done" + " integer,update_zip" + " text,update_zip_dir" + " text,extra" + " text,package_type" + " integer)";
            a2.getWritableDatabase().execSQL(a2.f20735d);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("_");
            sb.append(c());
            this.j = new l(context, sb.toString(), this.f20737b, this.f20738c);
            return;
        }
        throw new IllegalArgumentException("invalid gecko dir:" + str);
    }

    /* synthetic */ f(String str, String str2, Context context, c cVar, byte b2) {
        this(str, str2, context, cVar);
    }

    private void a(int i2, int i3, int i4, String str, String str2, String str3) {
        o oVar = this.p;
        PackageStatisticModel packageStatisticModel = new PackageStatisticModel(i2, i3, i4, str, str2, str3, this.f20736a.f20785a);
        oVar.a(packageStatisticModel);
    }

    public static a a(Context context, String str, String str2, String str3, String str4, String str5, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("empty access key or app version");
        }
        a aVar = new a(str4, context, str5, str, str2, str3, 1128);
        return aVar;
    }
}
