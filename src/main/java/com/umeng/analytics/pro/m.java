package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class m {
    /* access modifiers changed from: private */
    public static Context k;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public h f80656a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public o f80657b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public p f80658c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f80659d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f80660e;

    /* renamed from: f  reason: collision with root package name */
    private long f80661f;
    private final String g;
    private final String h;
    private List<String> l;
    /* access modifiers changed from: private */
    public a m;
    private final Thread n;

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<m> f80678a;

        public a(m mVar) {
            this.f80678a = new WeakReference<>(mVar);
        }

        public void handleMessage(Message message) {
            if (this.f80678a != null) {
                switch (message.what) {
                    case 48:
                        sendEmptyMessageDelayed(48, q.c(System.currentTimeMillis()));
                        m.a(m.k).p();
                        return;
                    case 49:
                        sendEmptyMessageDelayed(49, q.d(System.currentTimeMillis()));
                        m.a(m.k).o();
                        break;
                }
            }
        }
    }

    static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final m f80679a = new m();

        private b() {
        }
    }

    public void d() {
        p();
    }

    public void e() {
        p();
    }

    public void f() {
        p();
    }

    /* access modifiers changed from: private */
    public void n() {
        this.f80658c.a(new f() {
            public void a(Object obj, boolean z) {
                p unused = m.this.f80658c = (p) obj;
            }
        }, "__ag_of");
    }

    /* access modifiers changed from: private */
    public void q() {
        List<String> b2 = this.f80657b.b();
        if (b2 != null) {
            this.l = b2;
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        long currentTimeMillis = System.currentTimeMillis();
        this.m.sendEmptyMessageDelayed(48, q.c(currentTimeMillis));
        this.m.sendEmptyMessageDelayed(49, q.d(currentTimeMillis));
    }

    private boolean i() {
        if (this.l.size() < n.a().d()) {
            return true;
        }
        return false;
    }

    private void k() {
        SharedPreferences.Editor edit = ba.a(k).edit();
        edit.putBoolean("main_fest_mode", false);
        edit.putLong("main_fest_timestamp", 0);
        edit.commit();
        this.f80660e = false;
    }

    /* access modifiers changed from: private */
    public void l() {
        SharedPreferences a2 = ba.a(k);
        this.f80660e = a2.getBoolean("main_fest_mode", false);
        this.f80661f = a2.getLong("main_fest_timestamp", 0);
    }

    private void j() {
        SharedPreferences a2 = ba.a(k);
        if (!a2.getBoolean("main_fest_mode", false)) {
            this.f80660e = true;
            SharedPreferences.Editor edit = a2.edit();
            edit.putBoolean("main_fest_mode", true);
            edit.putLong("main_fest_timestamp", System.currentTimeMillis());
            edit.commit();
        }
    }

    public JSONObject b() {
        JSONObject a2 = this.f80657b.a();
        JSONObject jSONObject = new JSONObject();
        if (a2 == null || a2.length() <= 0) {
            return null;
        }
        for (String next : this.l) {
            if (a2.has(next)) {
                try {
                    jSONObject.put(next, a2.opt(next));
                } catch (Exception unused) {
                }
            }
        }
        return jSONObject;
    }

    public JSONObject c() {
        if (this.f80658c.a().size() > 0) {
            this.f80657b.b(new f() {
                public void a(Object obj, boolean z) {
                    if (obj instanceof String) {
                        m.this.f80658c.b();
                    }
                }
            }, this.f80658c.a());
        }
        return this.f80657b.b(new f());
    }

    private m() {
        this.g = "main_fest_mode";
        this.h = "main_fest_timestamp";
        this.l = new ArrayList();
        this.m = null;
        this.n = new Thread(new Runnable() {
            public void run() {
                Looper.prepare();
                if (m.this.m == null) {
                    a unused = m.this.m = new a(m.this);
                }
                m.this.h();
            }
        });
        if (k != null) {
            if (this.f80656a == null) {
                this.f80656a = new h();
            }
            if (this.f80657b == null) {
                this.f80657b = o.a(k);
            }
            if (this.f80658c == null) {
                this.f80658c = new p();
            }
        }
        this.n.start();
    }

    /* access modifiers changed from: private */
    public void m() {
        for (Map.Entry key : this.f80656a.a().entrySet()) {
            List list = (List) key.getKey();
            if (!this.l.contains(list)) {
                this.l.add(d.a(list));
            }
        }
        if (this.l.size() > 0) {
            this.f80657b.a(new f(), this.l);
        }
    }

    /* access modifiers changed from: private */
    public void o() {
        try {
            if (this.f80656a.a().size() > 0) {
                this.f80657b.c(new f() {
                    public void a(Object obj, boolean z) {
                        if (obj instanceof String) {
                            m.this.f80656a.d();
                        }
                    }
                }, this.f80656a.a());
            }
            if (this.f80658c.a().size() > 0) {
                this.f80657b.b(new f() {
                    public void a(Object obj, boolean z) {
                        if (obj instanceof String) {
                            m.this.f80658c.b();
                        }
                    }
                }, this.f80658c.a());
            }
            if (this.l.size() > 0) {
                this.f80657b.a(new f(), this.l);
            }
        } catch (Throwable th) {
            by.b("converyMemoryToDataTable happen error: " + th.toString());
        }
    }

    /* access modifiers changed from: private */
    public void p() {
        try {
            if (this.f80656a.a().size() > 0) {
                this.f80657b.a((f) new f() {
                    public void a(Object obj, boolean z) {
                    }
                }, this.f80656a.a());
            }
            if (this.f80658c.a().size() > 0) {
                this.f80657b.b(new f() {
                    public void a(Object obj, boolean z) {
                        if (obj instanceof String) {
                            m.this.f80658c.b();
                        }
                    }
                }, this.f80658c.a());
            }
            if (this.l.size() > 0) {
                this.f80657b.a(new f(), this.l);
            }
        } catch (Throwable th) {
            by.b("convertMemoryToCacheTable happen error: " + th.toString());
        }
    }

    public boolean a() {
        return this.f80659d;
    }

    public static final m a(Context context) {
        k = context;
        return b.f80679a;
    }

    public void b(f fVar) {
        boolean z;
        if (this.f80660e) {
            if (this.f80661f == 0) {
                l();
            }
            z = q.a(System.currentTimeMillis(), this.f80661f);
        } else {
            z = false;
        }
        if (!z) {
            k();
            this.l.clear();
        }
        this.f80658c.b();
        this.f80657b.a((f) new f() {
            public void a(Object obj, boolean z) {
                if (obj.equals("success")) {
                    m.this.m();
                }
            }
        }, z);
    }

    public void a(final f fVar) {
        if (!this.f80659d) {
            bz.b(new cb() {
                public void a() {
                    try {
                        m.this.f80657b.a((f) new f() {
                            public void a(Object obj, boolean z) {
                                if (obj instanceof Map) {
                                    m.this.f80656a.a((Map) obj);
                                }
                                boolean unused = m.this.f80659d = true;
                            }
                        });
                        m.this.l();
                        m.this.q();
                        fVar.a("success", false);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void a(l lVar, List<String> list) {
        this.f80656a.a(new f() {
            public void a(Object obj, boolean z) {
                if (obj instanceof h) {
                    h unused = m.this.f80656a = (h) obj;
                    return;
                }
                if (obj instanceof Boolean) {
                    m.this.n();
                }
            }
        }, lVar, list, this.l);
    }

    public void a(final f fVar, Map<List<String>, l> map) {
        l lVar = (l) map.values().toArray()[0];
        List a2 = lVar.a();
        if (this.l.size() > 0 && this.l.contains(d.a(a2))) {
            this.f80656a.a((f) new f() {
                public void a(Object obj, boolean z) {
                    if (obj instanceof h) {
                        h unused = m.this.f80656a = (h) obj;
                    }
                    fVar.a("success", false);
                }
            }, lVar);
        } else if (this.f80660e) {
            a(lVar, a2);
        } else if (i()) {
            String a3 = d.a(a2);
            if (!this.l.contains(a3)) {
                this.l.add(a3);
            }
            this.f80656a.a((f) new f() {
                public void a(Object obj, boolean z) {
                    h unused = m.this.f80656a = (h) obj;
                }
            }, a2, lVar);
        } else {
            a(lVar, a2);
            j();
        }
    }

    public void a(long j, long j2, String str) {
        this.f80657b.a(new f() {
            public void a(Object obj, boolean z) {
                obj.equals("success");
            }
        }, str, j, j2);
    }
}
