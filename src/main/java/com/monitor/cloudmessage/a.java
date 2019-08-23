package com.monitor.cloudmessage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import com.monitor.cloudmessage.a.a.e;
import com.monitor.cloudmessage.a.a.j;
import com.monitor.cloudmessage.a.a.k;
import com.monitor.cloudmessage.a.a.l;
import com.monitor.cloudmessage.a.a.m;
import com.monitor.cloudmessage.a.a.n;
import com.monitor.cloudmessage.a.a.o;
import com.monitor.cloudmessage.a.a.p;
import com.monitor.cloudmessage.a.a.q;
import com.monitor.cloudmessage.a.b;
import com.monitor.cloudmessage.callback.ITemplateConsumer;
import com.monitor.cloudmessage.callback.c;
import com.monitor.cloudmessage.callback.d;
import com.monitor.cloudmessage.callback.f;
import com.monitor.cloudmessage.callback.g;
import com.monitor.cloudmessage.callback.h;
import com.monitor.cloudmessage.callback.i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public static volatile Context f27301b = null;

    /* renamed from: c  reason: collision with root package name */
    static f f27302c = null;

    /* renamed from: d  reason: collision with root package name */
    static volatile boolean f27303d = false;

    /* renamed from: e  reason: collision with root package name */
    static volatile boolean f27304e = false;
    private static volatile a i = null;
    private static h k = null;
    private static g l = null;
    private static com.monitor.cloudmessage.callback.a m = null;
    private static c n = null;
    private static i o = null;
    private static ITemplateConsumer p = null;
    private static volatile String q = "";
    private static volatile String r = "";
    private static volatile String s = "";
    private static volatile String t;
    private static volatile String[] u = null;

    /* renamed from: a  reason: collision with root package name */
    public Vector f27305a = new Vector(10);

    /* renamed from: f  reason: collision with root package name */
    public volatile HashMap<String, String> f27306f = new HashMap<>();
    public volatile WeakReference<d> g = null;
    private List<b> h;
    private final ExecutorService j = ((ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR);

    public static Context b() {
        return f27301b;
    }

    public static String c() {
        return q;
    }

    public static String d() {
        return r;
    }

    public static String e() {
        return s;
    }

    public static String f() {
        return t;
    }

    public static String[] g() {
        return u;
    }

    public final void a(final String str) {
        this.j.execute(new Runnable() {
            public final void run() {
                com.monitor.cloudmessage.entity.a aVar;
                try {
                    String str = str;
                    if (TextUtils.isEmpty(str)) {
                        aVar = null;
                    } else {
                        com.monitor.cloudmessage.entity.a aVar2 = new com.monitor.cloudmessage.entity.a();
                        JSONObject jSONObject = new JSONObject(str);
                        aVar2.f27362d = jSONObject.optString("command_id");
                        aVar2.f27360b = jSONObject.optString("type", "");
                        aVar2.f27361c = jSONObject.optLong("send_time");
                        aVar2.f27359a = jSONObject.optString("params");
                        aVar = aVar2;
                    }
                    if (aVar != null) {
                        a.this.a(aVar);
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }

    public final void a(com.monitor.cloudmessage.entity.a aVar) {
        d dVar = this.g == null ? null : (d) this.g.get();
        if (dVar != null) {
            dVar.a(aVar);
        }
        for (b a2 : this.h) {
            if (a2.a(aVar)) {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar) {
        if (fVar != null) {
            for (b next : this.h) {
                if (next instanceof com.monitor.cloudmessage.a.a.h) {
                    ((com.monitor.cloudmessage.a.a.h) next).f27320a = fVar;
                    return;
                }
            }
        }
    }

    public static a a() {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    if (f27304e) {
                        i = new a();
                    } else {
                        throw new RuntimeException("call CloudMessageManager.init() first");
                    }
                }
            }
        }
        return i;
    }

    static {
        StringBuilder sb = new StringBuilder();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/monitor");
        if (!file.exists()) {
            file.mkdir();
        }
        sb.append(file.getAbsolutePath());
        sb.append("/dump.hprof");
        t = sb.toString();
    }

    private a() {
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new com.monitor.cloudmessage.a.a.f());
        arrayList.add(new com.monitor.cloudmessage.a.a.c());
        arrayList.add(new p());
        arrayList.add(new com.monitor.cloudmessage.a.a.i());
        arrayList.add(new n());
        arrayList.add(new q());
        arrayList.add(new com.monitor.cloudmessage.a.a.d());
        arrayList.add(new o());
        arrayList.add(new l());
        arrayList.add(new com.monitor.cloudmessage.a.a.h());
        arrayList.add(new com.monitor.cloudmessage.a.a.b());
        arrayList.add(new com.monitor.cloudmessage.a.a.a());
        arrayList.add(new k());
        arrayList.add(new m());
        arrayList.add(new com.monitor.cloudmessage.a.a.g());
        arrayList.add(new e());
        arrayList.add(new j());
        this.h = Collections.unmodifiableList(arrayList);
        if (k != null) {
            b(k);
            k = null;
        }
        if (l != null) {
            b(l);
            l = null;
        }
        if (m != null) {
            b(m);
            m = null;
        }
        if (n != null) {
            b(n);
            n = null;
        }
        if (f27302c != null) {
            a(f27302c);
            f27302c = null;
        }
        if (o != null) {
            b(o);
            o = null;
        }
        if (p != null) {
            b(p);
            p = null;
        }
        this.j.execute(new Runnable() {
            public final void run() {
                try {
                    Context context = a.f27301b;
                    com.monitor.cloudmessage.e.b.a(context.getApplicationInfo().dataDir + File.separator + "dbFiles");
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void b(String str) {
        q = str;
    }

    public static void c(String str) {
        t = str;
    }

    public static void a(Context context) {
        f27304e = true;
        f27301b = context.getApplicationContext();
        a();
    }

    public static void a(ITemplateConsumer iTemplateConsumer) {
        if (f27304e) {
            a().b(iTemplateConsumer);
        } else {
            p = iTemplateConsumer;
        }
    }

    private void b(ITemplateConsumer iTemplateConsumer) {
        if (iTemplateConsumer != null) {
            for (b next : this.h) {
                if (next instanceof q) {
                    ((q) next).f27335a = iTemplateConsumer;
                    return;
                }
            }
        }
    }

    private void b(com.monitor.cloudmessage.callback.a aVar) {
        if (aVar != null) {
            for (b next : this.h) {
                if (next instanceof com.monitor.cloudmessage.a.a.a) {
                    ((com.monitor.cloudmessage.a.a.a) next).f27311a = aVar;
                    return;
                }
            }
        }
    }

    public static void a(com.monitor.cloudmessage.callback.a aVar) {
        if (f27304e) {
            a().b(aVar);
        } else {
            m = aVar;
        }
    }

    private void b(c cVar) {
        if (cVar != null) {
            for (b next : this.h) {
                if (next instanceof com.monitor.cloudmessage.a.a.b) {
                    ((com.monitor.cloudmessage.a.a.b) next).f27312a = cVar;
                    return;
                }
            }
        }
    }

    public static void a(c cVar) {
        if (f27304e) {
            a().b(cVar);
        } else {
            n = cVar;
        }
    }

    private void b(g gVar) {
        if (gVar != null) {
            for (b next : this.h) {
                if (next instanceof k) {
                    ((k) next).f27329a = gVar;
                    return;
                }
            }
        }
    }

    public static void a(g gVar) {
        if (f27304e) {
            a().b(gVar);
        } else {
            l = gVar;
        }
    }

    private void b(h hVar) {
        if (hVar != null) {
            for (b next : this.h) {
                if (next instanceof m) {
                    ((m) next).f27331a = hVar;
                    return;
                }
            }
        }
    }

    public static void a(h hVar) {
        if (f27304e) {
            a().b(hVar);
        } else {
            k = hVar;
        }
    }

    private void b(i iVar) {
        if (iVar != null) {
            for (b next : this.h) {
                if (next instanceof n) {
                    ((n) next).f27332a = iVar;
                    return;
                }
            }
        }
    }

    public static void a(i iVar) {
        if (f27304e) {
            a().b(iVar);
        } else {
            o = iVar;
        }
    }
}
