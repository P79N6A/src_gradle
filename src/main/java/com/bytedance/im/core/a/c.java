package com.bytedance.im.core.a;

import android.app.Application;
import android.os.SystemClock;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.a.f;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.b.a.aa;
import com.bytedance.im.core.b.b.a.ab;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.c.a.b;
import com.bytedance.im.core.b.c.g;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.i;
import com.bytedance.im.core.b.e.j;
import com.bytedance.im.core.b.e.k;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.q;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Response;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    private static c f20876f;

    /* renamed from: a  reason: collision with root package name */
    public Application f20877a;

    /* renamed from: b  reason: collision with root package name */
    public e f20878b;

    /* renamed from: c  reason: collision with root package name */
    public a f20879c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.im.core.c.a f20880d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f20881e;

    static class a implements a {
        public final long a() {
            return -1;
        }

        public final void a(int i) {
        }

        public final void a(int i, long j, String str, byte[] bArr) {
        }

        public final void a(b bVar, com.bytedance.im.core.b.c.a.a aVar) {
        }

        public final void a(List<n> list) {
        }

        public final String b() {
            return "";
        }

        public final String c() {
            return "";
        }

        public final boolean d() {
            return false;
        }

        public final b e() {
            return null;
        }

        public final Map<String, String> f() {
            return null;
        }

        public final void g() {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c() {
    }

    public final e b() {
        if (this.f20878b != null) {
            return this.f20878b;
        }
        return e.a();
    }

    public final synchronized void e() {
        b(6);
    }

    public static c a() {
        if (f20876f == null) {
            synchronized (c.class) {
                if (f20876f == null) {
                    f20876f = new c();
                }
            }
        }
        return f20876f;
    }

    public final synchronized void d() {
        this.f20881e = false;
        m.a();
        new aa();
        m a2 = m.a();
        a2.f21067b = false;
        a2.f21066a.removeCallbacksAndMessages(null);
        f();
    }

    private synchronized void f() {
        k.a();
        if (com.bytedance.im.core.b.d.a.f21178a != null) {
            com.bytedance.im.core.b.d.a.f21178a.shutdown();
            com.bytedance.im.core.b.d.a.f21178a = null;
        }
        if (com.bytedance.im.core.b.d.a.f21179b != null) {
            com.bytedance.im.core.b.d.a.f21179b.shutdown();
            com.bytedance.im.core.b.d.a.f21179b = null;
        }
        com.bytedance.im.core.b.b.a.f20946a.clear();
        com.bytedance.im.core.b.b.a.f20947b.clear();
        com.bytedance.im.core.b.b.a.f20948c.clear();
        com.bytedance.im.core.b.b.a.f20949d.clear();
        com.bytedance.im.core.b.b.a.f20951f.clear();
        com.bytedance.im.core.b.b.a.f20950e.clear();
        com.bytedance.im.core.b.b.a.g.clear();
        d a2 = d.a();
        a2.f21258a.clear();
        a2.f21259b = false;
        com.bytedance.im.core.b.a.b.b a3 = com.bytedance.im.core.b.a.b.b.a();
        a3.f20905a.removeMessages(BaseLoginOrRegisterActivity.o);
        a3.f20905a.removeMessages(102);
        a3.f20905a.removeMessages(103);
        a3.f20905a.removeMessages(104);
        a3.f20905a.removeMessages(105);
        q a4 = q.a();
        a4.f21307a = 0;
        a4.f21308b = 0;
        a4.f21309c = true;
        a4.f21310d.clear();
        a4.f21311e = null;
        com.bytedance.im.core.b.c.b a5 = com.bytedance.im.core.b.c.b.a();
        a5.f21151a.a();
        a5.f21152b.a();
    }

    public final synchronized void c() {
        this.f20881e = true;
        f();
        d a2 = d.a();
        if (a().b().D) {
            e.a(new com.bytedance.im.core.b.d.d<Boolean>() {
                public final /* synthetic */ Object a() {
                    j.a();
                    List b2 = j.b();
                    if (b2 == null || b2.size() <= 0) {
                        return Boolean.FALSE;
                    }
                    d.this.b((b[]) b2.toArray(new b[0]));
                    return Boolean.TRUE;
                }
            }, new com.bytedance.im.core.b.d.c<Boolean>() {
                public final /* synthetic */ void a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (!d.this.f21261d.isEmpty() && bool.booleanValue()) {
                        com.bytedance.im.core.b.e.d.c("snapshot onCallback");
                        for (g a2 : d.this.f21261d) {
                            a2.a(d.this.f21258a);
                        }
                    }
                }
            });
        } else if (a().b().B) {
            e.a(new com.bytedance.im.core.b.d.d<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Boolean a() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    com.bytedance.im.core.b.a.k.a();
                    List a2 = com.bytedance.im.core.b.a.k.a(c.a().b().C);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        com.bytedance.im.core.c.d.a("im_init_conversation_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    if (a2.size() <= 0) {
                        return Boolean.FALSE;
                    }
                    d.this.b((b[]) a2.toArray(new b[0]));
                    return Boolean.TRUE;
                }
            }, new com.bytedance.im.core.b.d.c<Boolean>() {
                public final /* synthetic */ void a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (!d.this.f21261d.isEmpty() && bool.booleanValue()) {
                        com.bytedance.im.core.b.e.d.c("fastLoad onCallback");
                        for (g a2 : d.this.f21261d) {
                            a2.a(d.this.f21258a);
                        }
                    }
                }
            });
        }
        m.a();
        new ab();
        int[] iArr = a().b().p;
        if (iArr == null) {
            iArr = a().b().o;
        }
        for (int nVar : iArr) {
            m.a();
            com.bytedance.im.core.b.b.a.n nVar2 = new com.bytedance.im.core.b.b.a.n(nVar);
            nVar2.f21069b = false;
            if (!com.bytedance.im.core.b.b.a.e(nVar2.f21068a)) {
                if (i.a().c(nVar2.f21068a)) {
                    e.a(new com.bytedance.im.core.b.d.d<Object>() {
                        public final Object a() {
                            o.a();
                            long a2 = c.a().f20879c.a();
                            String str = "update msg set " + f.COLUMN_STATUS.key + "=3" + " where " + f.COLUMN_SENDER.key + "='" + a2 + "' AND " + f.COLUMN_STATUS.key + "<'2" + "'";
                            com.bytedance.im.core.b.a.a.d.a();
                            return Boolean.valueOf(com.bytedance.im.core.b.a.a.d.c(str));
                        }
                    }, new com.bytedance.im.core.b.d.c<Object>() {
                        public final void a(Object obj) {
                            c.a();
                            n.this.b();
                        }
                    });
                } else {
                    int i = nVar2.f21068a;
                    if (a().b().t == 2) {
                        com.bytedance.im.core.b.b.a.f20946a.add(Integer.valueOf(i));
                        a();
                    }
                    com.bytedance.im.core.b.b.a.f20949d.add(Integer.valueOf(nVar2.f21068a));
                    a();
                    nVar2.a(i.a().f21240a.getLong(i.a(nVar2.f21068a, "im_init_page_cursor"), 0));
                    com.bytedance.im.core.c.d.a("im_total_pull", "get_session", 1.0f);
                }
            }
        }
        m.a().f21067b = true;
    }

    public static boolean a(int i) {
        return i.a().c(i);
    }

    public final void a(a aVar) {
        if (aVar == null) {
            aVar = new a((byte) 0);
        }
        this.f20879c = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(final int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f20881e     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00ac
            com.bytedance.im.core.a.c r0 = a()     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.a.e r0 = r0.b()     // Catch:{ all -> 0x00ae }
            int[] r0 = r0.p     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x001b
            com.bytedance.im.core.a.c r0 = a()     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.a.e r0 = r0.b()     // Catch:{ all -> 0x00ae }
            int[] r0 = r0.o     // Catch:{ all -> 0x00ae }
        L_0x001b:
            if (r0 != 0) goto L_0x001f
            monitor-exit(r10)
            return
        L_0x001f:
            com.bytedance.im.core.a.c r1 = a()     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.a.e r1 = r1.b()     // Catch:{ all -> 0x00ae }
            boolean r2 = r1.q     // Catch:{ all -> 0x00ae }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            int[] r2 = r1.p     // Catch:{ all -> 0x00ae }
            if (r2 != 0) goto L_0x0033
            int[] r2 = r1.o     // Catch:{ all -> 0x00ae }
        L_0x0033:
            if (r2 == 0) goto L_0x003a
            int r1 = r2.length     // Catch:{ all -> 0x00ae }
            if (r1 <= r3) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 != 0) goto L_0x0042
            a((int[]) r0, (int) r11)     // Catch:{ all -> 0x00ae }
            monitor-exit(r10)
            return
        L_0x0042:
            com.bytedance.im.core.b.b.a.m.a()     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.a.c$1 r1 = new com.bytedance.im.core.a.c$1     // Catch:{ all -> 0x00ae }
            r1.<init>(r0, r11)     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.b.b.a.c r11 = new com.bytedance.im.core.b.b.a.c     // Catch:{ all -> 0x00ae }
            r11.<init>(r1)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00aa
            int r1 = r0.length     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x0055
            goto L_0x00aa
        L_0x0055:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ae }
            r1.<init>()     // Catch:{ all -> 0x00ae }
            int r2 = r0.length     // Catch:{ all -> 0x00ae }
            r5 = 0
        L_0x005c:
            if (r5 >= r2) goto L_0x0087
            r6 = r0[r5]     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.InboxMessagesPerUser$Builder r7 = new com.bytedance.im.core.proto.InboxMessagesPerUser$Builder     // Catch:{ all -> 0x00ae }
            r7.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.InboxMessagesPerUser$Builder r7 = r7.inbox_type(r8)     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.b.e.i r8 = com.bytedance.im.core.b.e.i.a()     // Catch:{ all -> 0x00ae }
            long r8 = r8.a((int) r6)     // Catch:{ all -> 0x00ae }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.InboxMessagesPerUser$Builder r6 = r7.cursor(r6)     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.InboxMessagesPerUser r6 = r6.build()     // Catch:{ all -> 0x00ae }
            r1.add(r6)     // Catch:{ all -> 0x00ae }
            int r5 = r5 + 1
            goto L_0x005c
        L_0x0087:
            com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder r2 = new com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder     // Catch:{ all -> 0x00ae }
            r2.<init>()     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder r1 = r2.checks(r1)     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.CheckMessagePerUserRequestBody r1 = r1.build()     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.RequestBody$Builder r2 = new com.bytedance.im.core.proto.RequestBody$Builder     // Catch:{ all -> 0x00ae }
            r2.<init>()     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.RequestBody$Builder r1 = r2.check_messages_per_user_body(r1)     // Catch:{ all -> 0x00ae }
            com.bytedance.im.core.proto.RequestBody r1 = r1.build()     // Catch:{ all -> 0x00ae }
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ae }
            r3[r4] = r0     // Catch:{ all -> 0x00ae }
            r11.a(r4, r1, r2, r3)     // Catch:{ all -> 0x00ae }
            goto L_0x00ac
        L_0x00aa:
            monitor-exit(r10)
            return
        L_0x00ac:
            monitor-exit(r10)
            return
        L_0x00ae:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.a.c.b(int):void");
    }

    public static void a(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    m.a();
                    m.a(i2, i);
                }
            }
        }
    }

    public final void a(String str, byte[] bArr) {
        Response response;
        if (this.f20881e) {
            com.bytedance.im.core.b.c.b a2 = com.bytedance.im.core.b.c.b.a();
            try {
                response = g.a(str, bArr);
            } catch (com.bytedance.im.core.b.c.a e2) {
                com.bytedance.im.core.b.e.d.a("readFromQueue", (Throwable) e2);
                com.bytedance.im.core.c.d.a("im_pbdecode_error", "decode", 1.0f);
                com.bytedance.im.core.c.c.a().a("network").b("ws").a("error", e2).a("error_stack", com.bytedance.im.core.c.d.b(e2)).b();
                response = null;
            }
            if (response != null) {
                if (response.cmd.intValue() == IMCMD.SEND_MESSAGE.getValue()) {
                    a2.f21151a.a(response);
                    return;
                }
                a2.f21152b.a(response);
            }
        }
    }
}
