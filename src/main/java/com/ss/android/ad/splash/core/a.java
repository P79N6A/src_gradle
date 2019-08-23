package com.ss.android.ad.splash.core;

import android.os.Looper;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.c.f;
import com.ss.android.ad.splash.core.c.h;
import com.ss.android.ad.splash.o;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ad.splash.utils.d;
import com.ss.android.ad.splash.utils.g;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f27528a;

    public static a a() {
        if (f27528a == null) {
            synchronized (a.class) {
                if (f27528a == null) {
                    f27528a = new a();
                }
            }
        }
        return f27528a;
    }

    static void c() {
        if (e.R()) {
            n.a();
            if (!e.q()) {
                long currentTimeMillis = System.currentTimeMillis();
                e.r();
                try {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String string = r.a().f27732a.getString("splash_ad_data", "");
                    new StringBuilder("load splashAdData from local time : ").append(System.currentTimeMillis() - currentTimeMillis2);
                    List<b> a2 = n.a(string);
                    if (!e.h()) {
                        h a3 = h.a();
                        if (e.V()) {
                            a3.f27695b = n.b();
                        }
                        long g = r.a().g();
                        long h = r.a().h();
                        String o = r.a().o();
                        String p = r.a().p();
                        boolean k = r.a().k();
                        if (!TextUtils.isEmpty(o)) {
                            JSONArray jSONArray = new JSONArray(o);
                            if (jSONArray.length() == 2) {
                                h.a().a(jSONArray.getLong(0) * 1000);
                                h.a().b(1000 * jSONArray.getLong(1));
                            }
                        }
                        a3.f27694a = a2;
                        a3.f27698e = g;
                        a3.f27697d = h;
                        a3.i = p;
                        a3.h = k;
                        e.i();
                        long currentTimeMillis3 = System.currentTimeMillis();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration_load_local_data_time", currentTimeMillis3 - currentTimeMillis);
                        com.ss.android.ad.splash.b.a.a().a("service_ad_load_local_sync_data", jSONObject, (JSONObject) null);
                    }
                } catch (Exception e2) {
                    com.ss.android.ad.splash.b.a.a().a(e2, "key_exception_local_data");
                }
            }
            return;
        }
        n a4 = n.a();
        if (!e.q()) {
            long currentTimeMillis4 = System.currentTimeMillis();
            e.r();
            try {
                f c2 = a4.c();
                if (!e.h()) {
                    h a5 = h.a();
                    a5.f27696c = c2;
                    long g2 = r.a().g();
                    long h2 = r.a().h();
                    String o2 = r.a().o();
                    String p2 = r.a().p();
                    boolean k2 = r.a().k();
                    if (!TextUtils.isEmpty(o2)) {
                        JSONArray jSONArray2 = new JSONArray(o2);
                        if (jSONArray2.length() == 2) {
                            h.a().a(jSONArray2.getLong(0) * 1000);
                            h.a().b(1000 * jSONArray2.getLong(1));
                        }
                    }
                    a5.f27698e = g2;
                    a5.f27697d = h2;
                    a5.f27696c = c2;
                    a5.i = p2;
                    a5.h = k2;
                    e.i();
                    long currentTimeMillis5 = System.currentTimeMillis();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duration_load_local_data_time", currentTimeMillis5 - currentTimeMillis4);
                    com.ss.android.ad.splash.b.a.a().a("service_ad_load_local_sync_data", jSONObject2, (JSONObject) null);
                }
            } catch (Exception e3) {
                com.ss.android.ad.splash.b.a.a().a(e3, "key_exception_local_data");
            }
        }
    }

    @WorkerThread
    static void b() {
        JSONObject jSONObject;
        long j;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        q qVar;
        List<h> list;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        int i;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        b bVar;
        boolean z;
        b bVar2;
        if (e.R()) {
            q a2 = q.a();
            if (!s.a().h && NetworkUtils.b(e.F()) && a2.b()) {
                long currentTimeMillis = System.currentTimeMillis();
                com.ss.android.ad.splash.b.b.a().c();
                Future future = e.x;
                long j2 = currentTimeMillis;
                a2.f27726a = System.currentTimeMillis();
                if (!(!e.T() || future == null || Looper.getMainLooper().getThread() == Thread.currentThread())) {
                    do {
                    } while (!future.isDone());
                    e.a((Future) null);
                }
                Future submit = e.s().submit(new Callable<o>() {
                    public final /* synthetic */ Object call() throws Exception {
                        if (e.t() != null) {
                            String c2 = com.ss.android.ad.splash.utils.f.c();
                            String d2 = com.ss.android.ad.splash.utils.f.d();
                            if (!g.a(c2)) {
                                return e.t().a(c2, d2);
                            }
                        }
                        return null;
                    }
                });
                try {
                    JSONObject jSONObject5 = new JSONObject();
                    o oVar = (o) submit.get(30, TimeUnit.SECONDS);
                    if (oVar == null || !oVar.f22832b || oVar.f22831a == null) {
                        jSONObject3 = jSONObject5;
                    } else {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        JSONObject optJSONObject = oVar.f22831a.optJSONObject("data");
                        if (optJSONObject != null) {
                            long optLong = optJSONObject.optLong("leave_interval", 300) * 1000;
                            long optLong2 = optJSONObject.optLong("splash_interval", 1800) * 1000;
                            a2.f27727b = optJSONObject.optLong("splash_load_interval", 20000) * 1000;
                            String optString = optJSONObject.optString("log_extra", "{}");
                            boolean optBoolean = optJSONObject.optBoolean("is_need_ack", false);
                            JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                            if (optJSONArray == null || optJSONArray.length() != 2) {
                                jSONObject4 = jSONObject5;
                            } else {
                                jSONObject4 = jSONObject5;
                                h.a().a(optJSONArray.getLong(0) * 1000);
                                h.a().b(1000 * optJSONArray.getLong(1));
                            }
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                            }
                            int optInt = optJSONObject.optInt("show_limit", 0);
                            long currentTimeMillis3 = System.currentTimeMillis();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                            if (optJSONArray2 == null) {
                                optJSONArray2 = new JSONArray();
                            }
                            h a3 = h.a();
                            List<b> a4 = com.ss.android.ad.splash.utils.f.a(optJSONArray2, currentTimeMillis3, false);
                            List<b> list2 = a3.f27694a;
                            if (e.V()) {
                                List<b> a5 = com.ss.android.ad.splash.utils.f.a(a3.f27695b, a4);
                                JSONArray b2 = com.ss.android.ad.splash.utils.f.b(a5);
                                a3.f27695b = a5;
                                r a6 = r.a();
                                jSONArray3 = optJSONArray;
                                String jSONArray4 = b2.toString();
                                jSONArray2 = optJSONArray2;
                                if (a6.f27733b == null) {
                                    a6.f27733b = a6.f27732a.edit();
                                }
                                i = optInt;
                                a6.f27733b.putString("splash_ad_first_show_data", jSONArray4);
                                a6.d();
                                if (!r.a().b()) {
                                    a2.d(list2);
                                    q.a((b) null);
                                }
                            } else {
                                i = optInt;
                                jSONArray2 = optJSONArray2;
                                jSONArray3 = optJSONArray;
                            }
                            if (!d.a(a4)) {
                                bVar = a4.get(0);
                                z = false;
                            } else {
                                z = true;
                                bVar = null;
                            }
                            if (!d.a(list2)) {
                                bVar2 = list2.get(0);
                            } else {
                                bVar2 = null;
                            }
                            q.a(bVar, bVar2);
                            a3.f27694a = a4;
                            a3.f27698e = optLong;
                            a3.f27697d = optLong2;
                            a3.i = optString;
                            a3.h = optBoolean;
                            e.r();
                            r.a().a(currentTimeMillis3).b(optLong).a(i).c(optLong2).a(jSONArray2.toString()).i(jSONArray3.toString()).a(z).j(optString).c(optBoolean).d();
                            e.i();
                            a2.b(a4);
                            jSONObject3 = jSONObject4;
                            jSONObject3.put("durarion_ad_request_total_times", currentTimeMillis2 - j2);
                            a2.c(a4);
                        }
                    }
                    com.ss.android.ad.splash.b.a.a().a("service_ad_request_status", 0, jSONObject3, null);
                } catch (Exception e2) {
                    com.ss.android.ad.splash.b.a.a().a(e2, "key_exception_request");
                }
            }
            return;
        }
        q a7 = q.a();
        if (!s.a().h && NetworkUtils.b(e.F()) && a7.b()) {
            long currentTimeMillis4 = System.currentTimeMillis();
            com.ss.android.ad.splash.b.b.a().c();
            Future submit2 = e.s().submit(new Callable<o>() {
                public final /* synthetic */ Object call() throws Exception {
                    if (e.t() != null) {
                        String c2 = com.ss.android.ad.splash.utils.f.c();
                        String d2 = com.ss.android.ad.splash.utils.f.d();
                        if (!g.a(c2)) {
                            return e.t().a(c2, d2);
                        }
                    }
                    return null;
                }
            });
            try {
                JSONObject jSONObject6 = new JSONObject();
                o oVar2 = (o) submit2.get(30, TimeUnit.SECONDS);
                a7.f27726a = System.currentTimeMillis();
                if (oVar2 == null || !oVar2.f22832b || oVar2.f22831a == null) {
                    jSONObject = jSONObject6;
                } else {
                    long currentTimeMillis5 = System.currentTimeMillis();
                    JSONObject optJSONObject2 = oVar2.f22831a.optJSONObject("data");
                    if (optJSONObject2 != null) {
                        long optLong3 = optJSONObject2.optLong("leave_interval", 300) * 1000;
                        long optLong4 = optJSONObject2.optLong("splash_interval", 1800) * 1000;
                        a7.f27727b = optJSONObject2.optLong("splash_load_interval", 20000) * 1000;
                        String optString2 = optJSONObject2.optString("log_extra", "{}");
                        boolean optBoolean2 = optJSONObject2.optBoolean("is_need_ack", false);
                        JSONArray optJSONArray3 = optJSONObject2.optJSONArray("penalty_period");
                        if (optJSONArray3 != null) {
                            jSONObject2 = jSONObject6;
                            if (optJSONArray3.length() == 2) {
                                j = currentTimeMillis5;
                                long j3 = optJSONArray3.getLong(0) * 1000;
                                long j4 = 1000 * optJSONArray3.getLong(1);
                                h.a().a(j3);
                                h.a().b(j4);
                            } else {
                                j = currentTimeMillis5;
                            }
                        } else {
                            j = currentTimeMillis5;
                            jSONObject2 = jSONObject6;
                        }
                        if (optJSONArray3 == null) {
                            optJSONArray3 = new JSONArray();
                        }
                        int optInt2 = optJSONObject2.optInt("show_limit", 0);
                        long currentTimeMillis6 = System.currentTimeMillis();
                        JSONArray optJSONArray4 = optJSONObject2.optJSONArray("splash");
                        JSONArray optJSONArray5 = optJSONObject2.optJSONArray("show_queue");
                        if (optJSONArray4 == null) {
                            optJSONArray4 = new JSONArray();
                        }
                        h a8 = h.a();
                        long j5 = currentTimeMillis4;
                        String e3 = r.a().e();
                        if (TextUtils.isEmpty(e3)) {
                            jSONArray = new JSONArray();
                        } else {
                            jSONArray = new JSONArray(e3);
                        }
                        f a9 = com.ss.android.ad.splash.utils.f.a(jSONArray, optJSONArray4, currentTimeMillis6);
                        List<h> a10 = com.ss.android.ad.splash.utils.f.a(optJSONArray5);
                        List<b> a11 = com.ss.android.ad.splash.utils.f.a(a9.f27635c, a10);
                        a9.f27634b = a11;
                        List<b> list3 = a9.f27633a;
                        JSONArray b3 = com.ss.android.ad.splash.utils.f.b(list3);
                        JSONArray b4 = com.ss.android.ad.splash.utils.f.b(a11);
                        if (e.D() != null) {
                            list = a10;
                            qVar = a7;
                            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                                Thread.sleep(2500);
                            }
                        } else {
                            qVar = a7;
                            list = a10;
                        }
                        a8.f27698e = optLong3;
                        a8.f27697d = optLong4;
                        a8.f27696c = a9;
                        a8.i = optString2;
                        a8.h = optBoolean2;
                        if (!d.a(a11)) {
                            a9.f27637e = f.a(a11);
                        } else {
                            a9.f27637e = f.a(list3);
                        }
                        e.r();
                        r b5 = r.a().a(currentTimeMillis6).b(optLong3).a(optInt2).c(optLong4).b(b3.toString());
                        String jSONArray5 = b4.toString();
                        if (b5.f27733b == null) {
                            b5.f27733b = b5.f27732a.edit();
                        }
                        b5.f27733b.putString("splash_ad_data", jSONArray5);
                        b5.a(d.a(list3)).i(optJSONArray3.toString()).j(optString2).c(optBoolean2).d();
                        e.i();
                        q qVar2 = qVar;
                        qVar2.b(a9.f27636d);
                        jSONObject = jSONObject2;
                        jSONObject.put("durarion_ad_request_total_times", j - j5);
                        qVar2.c(a9.f27636d);
                        q.a(list);
                        j.a();
                        j.d();
                    } else {
                        return;
                    }
                }
                com.ss.android.ad.splash.b.a.a().a("service_ad_request_status", 0, jSONObject, null);
            } catch (Exception e4) {
                com.ss.android.ad.splash.b.a.a().a(e4, "key_exception_request");
            }
        }
    }
}
