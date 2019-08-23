package com.ss.android.downloadlib;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.download.api.b.a.a;
import com.ss.android.download.api.b.b;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.downloadlib.addownload.f;
import com.ss.android.downloadlib.addownload.h;
import com.ss.android.downloadlib.addownload.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class e implements d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile e f29047c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, h> f29048a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f29049b = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final List<h> f29050d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private long f29051e;

    private e() {
    }

    public static e a() {
        if (f29047c == null) {
            synchronized (e.class) {
                if (f29047c == null) {
                    f29047c = new e();
                }
            }
        }
        return f29047c;
    }

    private void b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f29051e >= 120000) {
            this.f29051e = currentTimeMillis;
            if (!this.f29050d.isEmpty()) {
                c();
            }
        }
    }

    private void c() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (h next : this.f29050d) {
            if (!next.b() && currentTimeMillis - next.d() > 600000) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f29050d.removeAll(arrayList);
        }
    }

    public final void b(a aVar) {
        this.f29049b.remove(aVar);
    }

    private static boolean d(String str) {
        return g.a().d(str);
    }

    public final void a(a aVar) {
        this.f29049b.add(aVar);
    }

    public final void b(String str) {
        h hVar = this.f29048a.get(str);
        if (hVar != null) {
            hVar.a(false);
        }
    }

    public final boolean c(String str) {
        h hVar = this.f29048a.get(str);
        if (hVar == null || !hVar.c()) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        a(str, 0);
    }

    public final void a(String str, int i) {
        h hVar = this.f29048a.get(str);
        if (hVar != null) {
            if (hVar.a(i)) {
                this.f29050d.add(hVar);
                this.f29048a.remove(str);
            }
            b();
        }
    }

    public final void a(String str, long j) {
        a(str, 0, 2, (b) null);
    }

    public final void a(Activity activity, d dVar, c cVar) {
        a(activity, 0, dVar, cVar);
    }

    public final void a(Activity activity, int i, d dVar, c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.a())) {
            h hVar = this.f29048a.get(cVar.a());
            if (hVar != null) {
                hVar.a(activity).a(i, dVar).a(cVar).a();
            } else if (!this.f29050d.isEmpty()) {
                b(activity, i, dVar, cVar);
            } else {
                c(activity, i, dVar, cVar);
            }
        }
    }

    private void c(Activity activity, int i, d dVar, c cVar) {
        h hVar;
        if (cVar != null) {
            if (d(cVar.q())) {
                hVar = new l();
            } else {
                hVar = new f();
            }
            hVar.a(activity).a(i, dVar).a(cVar).a();
            this.f29048a.put(cVar.a(), hVar);
        }
    }

    private void b(Activity activity, int i, d dVar, c cVar) {
        h hVar;
        if (this.f29050d.isEmpty()) {
            c(activity, i, dVar, cVar);
            return;
        }
        h hVar2 = null;
        if (d(cVar.q())) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f29050d.size()) {
                    i2 = 0;
                    break;
                } else if (this.f29050d.get(i2).e()) {
                    hVar2 = this.f29050d.get(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (hVar == null) {
                hVar = new l();
            } else {
                this.f29050d.remove(i2);
            }
        } else {
            do {
                if (!this.f29050d.isEmpty()) {
                    hVar = this.f29050d.get(0);
                    this.f29050d.remove(0);
                } else {
                    hVar = new f();
                }
            } while (hVar.e());
        }
        hVar.a(activity).a(i, dVar).a(cVar).a();
        this.f29048a.put(cVar.a(), hVar);
    }

    public final void a(String str, long j, int i, b bVar) {
        a(str, j, i, bVar, null);
    }

    public final void a(String str, long j, int i, b bVar, com.ss.android.download.api.b.a aVar) {
        h hVar = this.f29048a.get(str);
        if (hVar != null) {
            hVar.a(bVar).a(aVar).a(j, i);
        }
    }
}
