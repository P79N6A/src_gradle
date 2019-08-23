package com.ss.android.ugc.effectmanager;

import a.i;
import com.bef.effectsdk.RequirementResourceMapper;
import com.ss.android.ugc.effectmanager.b;
import com.ss.android.ugc.effectmanager.common.d;
import com.ss.android.ugc.effectmanager.common.f.f;
import com.ss.android.ugc.effectmanager.common.g;
import com.ss.android.ugc.effectmanager.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.link.LinkSelector;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.android.ugc.effectmanager.model.DownloadableModelResponse;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f77251a;

    /* renamed from: b  reason: collision with root package name */
    static e f77252b = new e.a();

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.effectmanager.d.a f77253c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Host> f77254d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.effectmanager.common.d.c f77255e;

    /* renamed from: f  reason: collision with root package name */
    final Executor f77256f;
    public final String g;
    public final String h;
    public final b.C0809b i;
    f j = new f(this.l, this.h);
    private final a k;
    private final String l;
    private final a m;
    private final b n;
    private d o;
    private DownloadableModelSupportResourceFinder p;
    private l q;

    public interface a {
        void a(Effect effect, ModelInfo modelInfo, long j);

        void a(Effect effect, ModelInfo modelInfo, Exception exc);

        void a(Effect effect, Exception exc);
    }

    public static boolean a() {
        if (f77251a != null) {
            return true;
        }
        return false;
    }

    public final DownloadableModelSupportResourceFinder d() {
        return f();
    }

    public static c b() {
        if (f77251a != null) {
            return f77251a;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    private void e() {
        this.q = new l(new g<i<n>>() {
            public final /* synthetic */ Object a() {
                c cVar = c.this;
                return i.a((Callable<TResult>) new Callable<n>() {
                    public final /* synthetic */ Object call() throws Exception {
                        HashMap hashMap = new HashMap();
                        hashMap.put("sdk_version", c.this.h);
                        hashMap.put("device_type", c.this.g);
                        hashMap.put("status", String.valueOf(c.this.i.ordinal()));
                        DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) c.this.f77255e.a(c.this.f77253c.a(new com.ss.android.ugc.effectmanager.common.a("GET", f.a(hashMap, c.this.f77254d.get(0).getItemName() + "/model/api/arithmetics"))), DownloadableModelResponse.class);
                        d dVar = new d();
                        if (downloadableModelResponse == null || downloadableModelResponse.getData() == null) {
                            throw new IllegalStateException("get net data failed");
                        }
                        for (String str : downloadableModelResponse.getData().getArithmetics().keySet()) {
                            for (ModelInfo a2 : (List) downloadableModelResponse.getData().getArithmetics().get(str)) {
                                dVar.a(str, a2);
                            }
                        }
                        return new n(dVar);
                    }
                }, cVar.f77256f);
            }
        });
    }

    private DownloadableModelSupportResourceFinder f() {
        if (this.p == null) {
            this.p = new DownloadableModelSupportResourceFinder(this.q, this.j, this.k, this.m);
        }
        return this.p;
    }

    public final d c() {
        if (this.o == null) {
            d dVar = new d(this.n, this.k, this.j, this.f77253c, this.q, this.m);
            this.o = dVar;
        }
        return this.o;
    }

    public static void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        } else if (f77251a == null) {
            c cVar = new c(bVar);
            f77251a = cVar;
            cVar.e();
        } else {
            throw new IllegalStateException("Duplicate initialization");
        }
    }

    private c(b bVar) {
        this.k = new a(bVar.f77206a, bVar.i);
        this.l = bVar.f77207b;
        this.f77253c = new com.ss.android.ugc.effectmanager.d.a(bVar.f77208c);
        this.f77253c.f77348b = new LinkSelector(null);
        this.f77254d = bVar.f77209d;
        this.f77255e = bVar.f77210e;
        this.f77256f = bVar.f77211f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.m = bVar.j;
        this.i = bVar.k;
        this.n = bVar;
    }

    public final boolean a(h hVar, Effect effect) {
        if (!hVar.a(effect)) {
            return false;
        }
        List<String> list = effect.requirements;
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list.isEmpty()) {
            return true;
        }
        for (String isResourceAvailable : RequirementResourceMapper.a((String[]) list.toArray(new String[list.size()]))) {
            if (!f().isResourceAvailable(isResourceAvailable)) {
                return false;
            }
        }
        return true;
    }
}
