package com.benchmark.bl;

import a.g;
import android.os.RemoteException;
import com.benchmark.Benchmark;
import com.benchmark.b;
import com.benchmark.i;
import com.bytedance.common.utility.Lists;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.thread.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public static BenchmarkAPI f7474a = ((BenchmarkAPI) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(BenchmarkAPI.class));
    private static a g = new a();

    /* renamed from: b  reason: collision with root package name */
    boolean f7475b;

    /* renamed from: c  reason: collision with root package name */
    List<Benchmark> f7476c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f7477d;

    /* renamed from: e  reason: collision with root package name */
    private List<Benchmark> f7478e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<Benchmark> f7479f = new ArrayList();
    private b h = b.a(GlobalContext.getContext());

    public static a b() {
        return g;
    }

    public final void a() {
        c(this.f7476c);
    }

    private a() {
        this.h.f7460b = this;
    }

    public final void c() {
        a.i.a(c.f7482a, (Executor) h.c()).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this), a.i.f1052b);
        f7474a.getBenchmarks().b(e.f7484a).a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(this), a.i.f1052b);
    }

    private void c(List<Benchmark> list) {
        d(list);
        this.h.a();
    }

    private void d(List<Benchmark> list) {
        if (!Lists.isEmpty(list)) {
            a.i.a((Callable<TResult>) new i<TResult>(new ArrayList(list))).a((g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(this), a.i.f1052b);
        }
    }

    static final /* synthetic */ a.i a(a.i iVar) throws Exception {
        if (iVar.d()) {
            com.benchmark.a.a((Throwable) iVar.f());
        } else if (iVar.b() && iVar.e() != null) {
            com.ss.android.ugc.aweme.aj.b.b().b(GlobalContext.getContext(), "benchmark", iVar.e());
            return iVar;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(List list) {
        try {
            b bVar = this.h;
            if (bVar.g == null) {
                if (bVar.f7463e == null) {
                    bVar.f7463e = new b.C0053b(bVar.f7461c);
                }
                b.C0053b bVar2 = bVar.f7463e;
                bVar2.f7467a.clear();
                bVar2.f7467a.addAll(list);
                bVar.a(0, bVar.f7463e);
            } else {
                bVar.g.a(list, bVar.f7461c);
            }
            this.f7475b = true;
            this.f7479f.clear();
            this.f7479f.addAll(list);
        } catch (RemoteException unused) {
        }
    }

    static final /* synthetic */ Boolean a(List list) throws Exception {
        JSONObject jSONObject = new JSONObject();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Benchmark benchmark = (Benchmark) it2.next();
            JSONObject jSONObject2 = new JSONObject();
            try {
                long[] jArr = benchmark.consumedTime;
                if (jArr != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (long put : jArr) {
                        jSONArray.put(put);
                    }
                    jSONObject2.put("consumeTime", jSONArray);
                }
                jSONObject2.put("failedReason", benchmark.failedReason);
                jSONObject2.put("when", benchmark.when);
                jSONObject.put(benchmark.name, jSONObject2);
            } catch (JSONException unused) {
            }
        }
        r.a("benchmark", jSONObject);
        com.ss.android.ugc.aweme.aj.b.b().a(GlobalContext.getContext(), "benchmark", (String) null);
        return Boolean.TRUE;
    }

    public final void a(int i) {
        ArrayList arrayList;
        Object obj;
        List<Benchmark> list = this.f7478e;
        if (Lists.isEmpty(list)) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Benchmark next : list) {
                if (next.when == i) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        StringBuilder sb = new StringBuilder("startBenchmarkTest called from ");
        sb.append(i);
        sb.append(" with run benchmark ");
        if (arrayList == null) {
            obj = " no task ";
        } else {
            obj = Integer.valueOf(arrayList.size());
        }
        sb.append(obj);
        if (!Lists.isEmpty(arrayList) && !this.f7475b) {
            a((List<Benchmark>) arrayList, (Runnable) new b(this, arrayList));
        }
    }

    private static void a(List<Benchmark> list, Runnable runnable) {
        Object obj;
        StringBuilder sb = new StringBuilder("checkTestResource called with list ");
        if (list == null) {
            obj = " no task ";
        } else {
            obj = Integer.valueOf(list.size());
        }
        sb.append(obj);
        if (!Lists.isEmpty(list)) {
            a.i.a((Callable<TResult>) new g<TResult>(list.get(0).imageUrl, list.get(0).h264VideoUrl, list.get(0).h265VideoUrl), (Executor) h.c()).a((g<TResult, TContinuationResult>) new h<TResult,TContinuationResult>(runnable), a.i.f1052b);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(BenchmarkResponse benchmarkResponse, boolean z) {
        Object obj;
        StringBuilder sb = new StringBuilder("onBenchmarkResponse called from local ");
        sb.append(z);
        sb.append(" benchmark list ");
        if (benchmarkResponse.benchmarks == null) {
            obj = " no task ";
        } else {
            obj = Integer.valueOf(benchmarkResponse.benchmarks.size());
        }
        sb.append(obj);
        if (benchmarkResponse != null && benchmarkResponse.benchmarks != null && !this.f7475b && (!this.f7477d || this.f7478e.isEmpty())) {
            List<Benchmark> list = benchmarkResponse.benchmarks;
            this.f7478e.clear();
            this.f7478e.addAll(list);
            this.f7477d = z;
            a(this.f7478e, (Runnable) null);
        }
    }

    public final void a(int i, int i2, String str) {
        a(i, (long[]) null, str);
    }

    public final void a(int i, int i2, long[] jArr) {
        a(i, jArr, "");
    }

    private void a(int i, long[] jArr, String str) {
        ListIterator<Benchmark> listIterator = this.f7479f.listIterator();
        while (listIterator.hasNext()) {
            Benchmark next = listIterator.next();
            if (next.id == i) {
                if (jArr != null) {
                    next.consumedTime = jArr;
                    next.failedReason = "";
                } else {
                    next.consumedTime = null;
                    next.failedReason = str;
                }
                this.f7476c.add(next);
                listIterator.remove();
                this.f7478e.remove(next);
            }
        }
        if (this.f7479f.isEmpty()) {
            c(this.f7476c);
        }
    }
}
