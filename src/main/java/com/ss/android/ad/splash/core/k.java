package com.ss.android.ad.splash.core;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.core.b.a;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.c.g;
import com.ss.android.ad.splash.d.a;
import com.ss.android.ad.splash.utils.d;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.i;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class k {

    /* renamed from: d  reason: collision with root package name */
    private static volatile k f27702d;

    /* renamed from: a  reason: collision with root package name */
    public long f27703a;

    /* renamed from: b  reason: collision with root package name */
    public String f27704b = "";

    /* renamed from: c  reason: collision with root package name */
    public long f27705c;

    /* renamed from: e  reason: collision with root package name */
    private b f27706e;

    private boolean a(long j) {
        return j - this.f27703a < h.a().f27697d;
    }

    private void a(boolean z) {
        a(0, false, z, false);
    }

    private k() {
    }

    public static k a() {
        if (f27702d == null) {
            synchronized (k.class) {
                if (f27702d == null) {
                    f27702d = new k();
                }
            }
        }
        return f27702d;
    }

    private int d() {
        if (f.a()) {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c_3));
            }
            a(2);
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (e.a() && Math.abs(currentTimeMillis - e.c()) > 10000) {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c_1));
            }
            a(3);
            return 3;
        } else if (Math.abs(currentTimeMillis - e.w()) < h.a().f27698e) {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c_2));
            }
            a(4);
            return 1;
        } else if (!a(currentTimeMillis)) {
            return 4;
        } else {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c_6));
            }
            a(5);
            return 2;
        }
    }

    @NonNull
    private List<b> e() {
        ArrayList arrayList = new ArrayList();
        List<b> list = h.a().f27695b;
        if (!d.a(list)) {
            Iterator<b> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                b next = it2.next();
                if (next.u()) {
                    arrayList.add(next);
                    new StringBuilder("成功回捞 ad: ").append(next.l());
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).putOpt("log_extra", next.n());
                    } catch (Exception unused) {
                    }
                    e.a(next.l(), "splash_ad", "launch_miss", jSONObject);
                    r.a().a(false).d();
                    break;
                }
                new StringBuilder("回捞失败——ad过期 ad: ").append(next.l());
            }
        }
        if (arrayList.size() > 0) {
            this.f27705c = ((b) arrayList.get(0)).l();
        }
        return arrayList;
    }

    private b c() {
        b bVar;
        if (s.a().h) {
            return null;
        }
        b b2 = d.a().b();
        if (b2 != null) {
            d.a().c();
            return b2;
        }
        int d2 = d();
        if (d2 != 4) {
            if (d2 == 0) {
                a.a().a(true);
                com.ss.android.ad.splash.core.b.b.a();
                com.ss.android.ad.splash.core.b.b.d(new a.C0321a().a(84378473382L).a(h.a().i).a(6).a());
            } else {
                com.ss.android.ad.splash.core.b.b.a();
                com.ss.android.ad.splash.core.b.b.b(new a.C0321a().a(84378473382L).a(2).a(h.a().i).a());
            }
            return null;
        }
        com.ss.android.ad.splash.d.a.a().a(false);
        StringBuilder sb = new StringBuilder("getCurrentSplashAd ");
        sb.append(System.currentTimeMillis());
        sb.append("result :");
        sb.append(s.a().f27735b);
        if (s.a().f27735b != -1) {
            long j = s.a().g;
            if (s.a().f27735b == 1) {
                a(j, true);
                return null;
            } else if (s.a().f27735b == 2) {
                a(j, false);
            }
        } else {
            if (!s.a().e()) {
                long j2 = h.a().f27699f;
                long j3 = h.a().g;
                if (f.a(j2, j3)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                        if (e.P()) {
                            a(true);
                        }
                        return null;
                    }
                }
            }
            if (e.P()) {
                a(false);
            }
        }
        com.ss.android.ad.splash.core.b.b.a().b();
        List<b> list = h.a().f27694a;
        if (e.V() || !d.a(list) || !r.a().m()) {
            List<b> b3 = b(list);
            if (!d.a(b3) || e.V()) {
                if (!e.x()) {
                    e(b3);
                    bVar = a(b3);
                } else if (!r.a().b()) {
                    r.a().b(true).d();
                    List<b> g = g(b3);
                    e(g);
                    bVar = a(g);
                } else {
                    List<b> h = h(b3);
                    e(h);
                    bVar = a(h);
                }
                com.ss.android.ad.splash.core.b.b.a().d();
                if (!(this.f27706e == null || bVar == null)) {
                    com.ss.android.ad.splash.core.b.b.a();
                    com.ss.android.ad.splash.core.b.b.a(this.f27706e, bVar);
                }
                if (e.V() && r.a().m()) {
                    com.ss.android.ad.splash.core.b.b.a();
                    com.ss.android.ad.splash.core.b.b.b(new a.C0321a().a(84378473382L).a(3).a(h.a().i).a());
                    com.ss.android.ad.splash.b.b.a();
                    com.ss.android.ad.splash.b.b.a(1);
                }
                return bVar;
            }
            com.ss.android.ad.splash.core.b.b.a().a(false);
            return null;
        }
        com.ss.android.ad.splash.core.b.b.a();
        com.ss.android.ad.splash.core.b.b.b(new a.C0321a().a(84378473382L).a(3).a(h.a().i).a());
        com.ss.android.ad.splash.b.b.a();
        com.ss.android.ad.splash.b.b.a(1);
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final b b() {
        List<b> list;
        if (e.R()) {
            return c();
        }
        if (s.a().h) {
            return null;
        }
        b b2 = d.a().b();
        if (b2 != null) {
            d.a().c();
            return b2;
        }
        int d2 = d();
        int i = 4;
        if (d2 != 4) {
            if (d2 == 0) {
                com.ss.android.ad.splash.d.a.a().a(true);
                com.ss.android.ad.splash.core.b.b.a();
                com.ss.android.ad.splash.core.b.b.d(new a.C0321a().a(84378473382L).a(h.a().i).a(6).a());
            } else {
                com.ss.android.ad.splash.core.b.b.a();
                com.ss.android.ad.splash.core.b.b.b(new a.C0321a().a(84378473382L).a(2).a(h.a().i).a());
            }
            return null;
        }
        com.ss.android.ad.splash.d.a.a().a(false);
        com.ss.android.ad.splash.core.b.b.a().b();
        StringBuilder sb = new StringBuilder("getCurrentSplashAd ");
        sb.append(System.currentTimeMillis());
        sb.append("result :");
        sb.append(s.a().f27735b);
        if (s.a().f27735b != -1) {
            long j = s.a().g;
            if (s.a().f27735b == 1) {
                a(j, true);
                return null;
            } else if (s.a().f27735b == 2) {
                a(j, false);
            }
        } else {
            if (!s.a().d()) {
                long j2 = h.a().f27699f;
                long j3 = h.a().g;
                if (f.a(j2, j3)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= j2 && currentTimeMillis <= j3) {
                        if (e.P()) {
                            a(true);
                        }
                        return null;
                    }
                }
            }
            if (e.P()) {
                a(false);
            }
        }
        com.ss.android.ad.splash.core.c.f fVar = h.a().f27696c;
        if (fVar == null) {
            return null;
        }
        if (!fVar.f27637e || !s.a().d()) {
            if (e.H()) {
                com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 3, (JSONObject) null);
            }
            list = fVar.f27634b;
            if (d.a(list)) {
                com.ss.android.ad.splash.core.b.b.a();
                com.ss.android.ad.splash.core.b.b.b(new a.C0321a().a(84378473382L).a(3).a(h.a().i).a());
                com.ss.android.ad.splash.b.b.a();
                com.ss.android.ad.splash.b.b.a(1);
                return null;
            }
        } else {
            List<g> b3 = s.a().b();
            list = f.a(fVar.f27635c, b3);
            if (d.a(list)) {
                if (d.a(b3)) {
                    com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 2, (JSONObject) null);
                } else {
                    i = 5;
                    com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 1, (JSONObject) null);
                }
                com.ss.android.ad.splash.core.b.b.a();
                com.ss.android.ad.splash.core.b.b.b(new a.C0321a().a(84378473382L).a(i).a(h.a().i).a());
                com.ss.android.ad.splash.b.b.a();
                com.ss.android.ad.splash.b.b.a(1);
                return null;
            }
            com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 0, (JSONObject) null);
        }
        if (e.x()) {
            if (!r.a().b()) {
                r.a().b(true).d();
                list = g(list);
            } else {
                list = h(list);
            }
        }
        List<b> f2 = f(list);
        if (d.a(f2)) {
            return null;
        }
        b i2 = i(f2);
        com.ss.android.ad.splash.core.b.b.a().d();
        if (!(this.f27706e == null || i2 == null)) {
            com.ss.android.ad.splash.core.b.b.a();
            com.ss.android.ad.splash.core.b.b.a(this.f27706e, i2);
        }
        return i2;
    }

    private static void a(int i) {
        com.ss.android.ad.splash.b.b.a();
        com.ss.android.ad.splash.b.b.a(i);
    }

    @Nullable
    private b a(List<b> list) {
        if (d.a(list)) {
            return null;
        }
        if (s.a().d()) {
            return d(list);
        }
        com.ss.android.ad.splash.b.a.a().a("service_real_time_show", 3, (JSONObject) null);
        return c(list);
    }

    private static void e(List<b> list) {
        if (!d.a(list)) {
            b bVar = list.get(0);
            if (bVar != null && bVar.a()) {
                HashMap hashMap = new HashMap();
                hashMap.put("show_expected", Integer.valueOf(bVar.f27610b));
                e.a(bVar.l(), "splash_ad", "should_show", bVar.n(), hashMap);
            }
        }
    }

    @Nullable
    private List<b> g(List<b> list) {
        if (d.a(list)) {
            if (!e.V()) {
                return null;
            }
            list = new ArrayList<>();
        }
        List<b> arrayList = new ArrayList<>();
        for (b next : list) {
            if (next.m == 1) {
                arrayList.add(next);
            }
        }
        if (d.a(arrayList) && e.V()) {
            arrayList = e();
        }
        for (b next2 : list) {
            if (next2.m == 3) {
                arrayList.add(next2);
            }
        }
        if (e.d() && d.a(list)) {
            i.a(e.F().getString(C0906R.string.c9y));
        }
        return arrayList;
    }

    @Nullable
    private static List<b> h(List<b> list) {
        if (d.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b next : list) {
            if (next.m != 1) {
                arrayList.add(next);
            } else {
                com.ss.android.ad.splash.core.b.b.a().a(new a.C0321a().a(next.l()).b(5005).a());
            }
        }
        if (e.d() && d.a(arrayList)) {
            i.a(e.F().getString(C0906R.string.c_5));
        }
        return arrayList;
    }

    private static int a(b bVar) {
        if (bVar == null) {
            return 5006;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar.d() > currentTimeMillis) {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c_7, new Object[]{Long.valueOf(bVar.l())}));
            }
            return 5001;
        } else if (bVar.e() < currentTimeMillis) {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c9x, new Object[]{Long.valueOf(bVar.l())}));
            }
            return 5002;
        } else if (!bVar.l) {
            return 5000;
        } else {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c9w, new Object[]{Long.valueOf(bVar.l())}));
            }
            return 5003;
        }
    }

    private boolean b(@NonNull b bVar) {
        boolean z;
        int p = bVar.p();
        if (p != 0) {
            switch (p) {
                case 2:
                    boolean c2 = f.c(bVar.k);
                    if (c2) {
                        return c2;
                    }
                    a(bVar, 2);
                    if (!e.d()) {
                        return c2;
                    }
                    i.a(e.F().getString(C0906R.string.c_8, new Object[]{Long.valueOf(bVar.l())}));
                    return c2;
                case 3:
                    boolean c3 = f.c(bVar.f27609a);
                    if (!c3) {
                        a(bVar, 1);
                    }
                    boolean c4 = f.c(bVar.k);
                    if (!c4) {
                        a(bVar, 2);
                    }
                    if (!c3 || !c4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || !e.d()) {
                        return z;
                    }
                    i.a(e.F().getString(C0906R.string.c_0, new Object[]{Long.valueOf(bVar.l())}));
                    return z;
                case 4:
                    break;
                default:
                    return false;
            }
        }
        boolean c5 = f.c(bVar.f27609a);
        if (c5) {
            return c5;
        }
        a(bVar, 1);
        if (!e.d()) {
            return c5;
        }
        i.a(e.F().getString(C0906R.string.c9z, new Object[]{Long.valueOf(bVar.l())}));
        return c5;
    }

    private b c(List<b> list) {
        for (b next : list) {
            if (next != null) {
                if (next.s() == 1) {
                    if (!com.ss.android.ad.splash.utils.g.a(next.t()) && e.D() != null) {
                        if (e.D().a(next, false)) {
                            this.f27703a = System.currentTimeMillis();
                            return next;
                        }
                        if (this.f27706e == null) {
                            this.f27706e = next;
                        }
                        com.ss.android.ad.splash.core.b.b.a().a(next);
                    }
                } else if (!next.a()) {
                    continue;
                } else if (b(next)) {
                    return next;
                } else {
                    if (this.f27705c == next.l()) {
                        com.ss.android.ad.splash.core.b.b.a();
                        com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(next.l()).b(4004).a(next.n()).a(1).a());
                    }
                }
            }
        }
        com.ss.android.ad.splash.b.b.a();
        com.ss.android.ad.splash.b.b.a(6);
        return null;
    }

    @Nullable
    private b i(List<b> list) {
        b bVar;
        Iterator<b> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it2.next();
            if (bVar != null) {
                if (bVar.s() != 1) {
                    boolean a2 = bVar.a();
                    boolean b2 = b(bVar);
                    if (a2 && b2) {
                        break;
                    } else if (!b2 && !TextUtils.isEmpty(bVar.w()) && !TextUtils.isEmpty(this.f27704b) && bVar.w().equals(this.f27704b)) {
                        com.ss.android.ad.splash.core.b.b.a();
                        com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(4004).a(bVar.n()).a(1).a());
                    }
                } else if (!com.ss.android.ad.splash.utils.g.a(bVar.t()) && e.D() != null) {
                    if (e.D().a(bVar, false)) {
                        this.f27703a = System.currentTimeMillis();
                        return bVar;
                    }
                    if (this.f27706e == null) {
                        this.f27706e = bVar;
                    }
                    com.ss.android.ad.splash.core.b.b.a().a(bVar);
                }
            }
        }
        return bVar;
    }

    @Nullable
    @MainThread
    private List<b> b(@Nullable List<b> list) {
        if (d.a(list)) {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c_4));
            }
            return null;
        }
        this.f27705c = list.get(0).l();
        com.ss.android.ad.splash.core.b.b a2 = com.ss.android.ad.splash.core.b.b.a();
        if (a2.f27578a == null) {
            a2.f27578a = new ArrayList();
        }
        a2.f27578a.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar != null) {
                if (bVar.j != null && !bVar.j.isEmpty()) {
                    for (int i2 = 0; i2 < bVar.j.size(); i2++) {
                        b bVar2 = bVar.j.get(i2);
                        if (bVar2 != null) {
                            int b2 = bVar.b();
                            if (b2 != 2000) {
                                a(bVar2, b2, i + "_" + i2);
                                if (i == 0) {
                                    com.ss.android.ad.splash.core.b.b.a();
                                    com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(b2).a(bVar.n()).a(1).a());
                                }
                            } else {
                                int a3 = a(bVar2);
                                if (a3 == 5000) {
                                    arrayList.add(bVar2);
                                } else if (i == 0) {
                                    com.ss.android.ad.splash.core.b.b.a();
                                    com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(a3).a(bVar.n()).a(1).a());
                                }
                            }
                        }
                    }
                }
                int b3 = bVar.b();
                if (bVar.s() != 0 || b3 == 2000) {
                    int a4 = a(bVar);
                    if (a4 == 5000) {
                        arrayList.add(bVar);
                    } else if (i == 0) {
                        com.ss.android.ad.splash.core.b.b.a();
                        com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(a4).a(bVar.n()).a(1).a());
                    }
                } else {
                    a(bVar, b3, String.valueOf(i));
                    if (i == 0) {
                        com.ss.android.ad.splash.core.b.b.a();
                        com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(b3).a(bVar.n()).a(1).a());
                    }
                }
            }
        }
        return arrayList;
    }

    private b d(List<b> list) {
        LinkedHashMap<Long, String> c2 = s.a().c();
        if (c2 != null && c2.size() > 0) {
            boolean z = false;
            for (Map.Entry next : c2.entrySet()) {
                Long l = (Long) next.getKey();
                String str = (String) next.getValue();
                Iterator<b> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    b next2 = it2.next();
                    if (next2 != null && next2.l() == l.longValue()) {
                        if (next2.s() != 1) {
                            boolean a2 = next2.a();
                            boolean b2 = b(next2);
                            if (!a2 || !b2) {
                                if (!b2 && this.f27705c == next2.l()) {
                                    com.ss.android.ad.splash.core.b.b.a();
                                    com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(next2.l()).b(4004).a(next2.n()).a(1).a());
                                }
                                z = true;
                            } else {
                                b bVar = (b) next2.clone();
                                bVar.r = true;
                                bVar.f27613e = str;
                                com.ss.android.ad.splash.b.a.a().a("service_real_time_show", 0, (JSONObject) null);
                                return bVar;
                            }
                        } else if (!com.ss.android.ad.splash.utils.g.a(next2.t()) && e.D() != null) {
                            if (e.D().a(next2, false)) {
                                this.f27703a = System.currentTimeMillis();
                                return next2;
                            }
                            if (this.f27706e == null) {
                                this.f27706e = next2;
                            }
                            com.ss.android.ad.splash.core.b.b.a().a(next2);
                        }
                    }
                }
            }
            if (!z) {
                a(1, 1, true);
            }
        } else if (c2 != null) {
            a(4, 2, true);
        }
        return null;
    }

    @Nullable
    @MainThread
    private List<b> f(@Nullable List<b> list) {
        if (d.a(list)) {
            if (e.d()) {
                i.a(e.F().getString(C0906R.string.c_4));
            }
            return null;
        }
        if (!TextUtils.isEmpty(list.get(0).w())) {
            this.f27704b = list.get(0).w();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar != null) {
                if (bVar.j != null && !bVar.j.isEmpty()) {
                    for (int i2 = 0; i2 < bVar.j.size(); i2++) {
                        b bVar2 = bVar.j.get(i2);
                        if (bVar2 != null) {
                            int b2 = bVar.b();
                            if (b2 != 2000) {
                                a(bVar2, b2, i + "_" + i2);
                                if (i == 0) {
                                    com.ss.android.ad.splash.core.b.b.a();
                                    com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(b2).a(bVar.n()).a(1).a());
                                }
                            } else {
                                int a2 = a(bVar2);
                                if (a2 == 5000) {
                                    arrayList.add(bVar2);
                                } else if (i == 0) {
                                    com.ss.android.ad.splash.core.b.b.a();
                                    com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(a2).a(bVar.n()).a(1).a());
                                }
                            }
                        }
                    }
                }
                int b3 = bVar.b();
                if (bVar.s() != 0 || b3 == 2000) {
                    int a3 = a(bVar);
                    if (a3 == 5000) {
                        arrayList.add(bVar);
                    } else if (i == 0) {
                        com.ss.android.ad.splash.core.b.b.a();
                        com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(a3).a(bVar.n()).a(1).a());
                    }
                } else {
                    a(bVar, b3, String.valueOf(i));
                    if (i == 0) {
                        com.ss.android.ad.splash.core.b.b.a();
                        com.ss.android.ad.splash.core.b.b.c(new a.C0321a().a(bVar.l()).b(b3).a(bVar.n()).a(1).a());
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(long j, boolean z) {
        a(j, true, false, z);
    }

    private static void a(@NonNull b bVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).putOpt("log_extra", bVar.n());
            JSONObject jSONObject2 = new JSONObject();
            String str = "";
            String str2 = "";
            switch (i) {
                case 1:
                    str = "not_download_image";
                    str2 = f.a(bVar.f27609a);
                    break;
                case 2:
                    str = "not_download_video";
                    str2 = f.a(bVar.k);
                    break;
            }
            jSONObject2.putOpt("reason", str);
            jSONObject2.putOpt(PushConstants.WEB_URL, str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
        } catch (Exception unused) {
        }
        e.a(bVar.l(), "splash_ad", "not_showing_reason", jSONObject);
    }

    private static void a(int i, int i2, boolean z) {
        com.ss.android.ad.splash.core.b.b.a();
        com.ss.android.ad.splash.core.b.b.d(new a.C0321a().a(84378473382L).a(i).a("{}").a());
        com.ss.android.ad.splash.core.b.b.a().c();
        com.ss.android.ad.splash.b.a.a().a("service_real_time_show", i2, (JSONObject) null);
    }

    private static void a(@NonNull b bVar, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("log_extra", bVar.n()).putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ad_position", str);
            jSONObject2.putOpt("error_code", Integer.valueOf(i));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
        } catch (Exception unused) {
        }
        e.a(bVar.l(), "splash_ad", "data_invalid", jSONObject);
    }

    private static void a(long j, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (z) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            jSONObject2.putOpt("status", str);
            if (z) {
                jSONObject2.putOpt("duration", Long.valueOf(j));
                if (z3) {
                    str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str3 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                jSONObject2.putOpt("stop_show", str3);
            } else {
                if (z2) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                jSONObject2.putOpt("is_penalty_period", str2);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception unused) {
        }
        e.a(84378473382L, "splash_ad", "stop_showing_monitor", jSONObject);
    }
}
