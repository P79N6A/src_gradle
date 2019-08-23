package com.ss.android.ugc.aweme.poi.e;

import a.g;
import a.i;
import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59816a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f59825a;

        /* renamed from: b  reason: collision with root package name */
        public long f59826b;

        /* renamed from: c  reason: collision with root package name */
        public String f59827c;
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f59816a, true, 66865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f59816a, true, 66865, new Class[0], Void.TYPE);
            return;
        }
        c a2 = c.a();
        a2.a("status", (Integer) 0);
        n.a("poi_log", "get_poi_detail", a2.b());
    }

    public static i<Void> a(Collection<? extends i<?>> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, null, f59816a, true, 66863, new Class[]{Collection.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{collection}, null, f59816a, true, 66863, new Class[]{Collection.class}, i.class);
        } else if (collection.size() == 0) {
            return i.a(null);
        } else {
            j jVar = new j();
            ArrayList arrayList = new ArrayList();
            Object obj = new Object();
            AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<? extends i<?>> it2 = collection.iterator();
            while (it2.hasNext()) {
                final long j = currentTimeMillis;
                final Object obj2 = obj;
                final ArrayList arrayList2 = arrayList;
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                final AtomicInteger atomicInteger2 = atomicInteger;
                Iterator<? extends i<?>> it3 = it2;
                AnonymousClass2 r0 = r1;
                final j jVar2 = jVar;
                AnonymousClass2 r1 = new g<Object, Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f59819a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(i<Object> iVar) {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f59819a, false, 66873, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f59819a, false, 66873, new Class[]{i.class}, Void.class);
                        }
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        if (PatchProxy.isSupport(new Object[]{iVar, new Long(currentTimeMillis)}, null, o.f59816a, true, 66864, new Class[]{i.class, Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{iVar, new Long(currentTimeMillis)}, null, o.f59816a, true, 66864, new Class[]{i.class, Long.TYPE}, Void.TYPE);
                        } else {
                            Object e2 = iVar.e();
                            if (e2 != null) {
                                if (e2 instanceof PoiDetail) {
                                    ((PoiDetail) e2).setDuration(currentTimeMillis);
                                } else if (e2 instanceof com.ss.android.ugc.aweme.poi.model.i) {
                                    ((com.ss.android.ugc.aweme.poi.model.i) e2).f59923e = currentTimeMillis;
                                }
                            }
                        }
                        if (iVar.d()) {
                            synchronized (obj2) {
                                arrayList2.add(iVar.f());
                            }
                        }
                        if (iVar.c()) {
                            atomicBoolean2.set(true);
                        }
                        if (atomicInteger2.decrementAndGet() == 0) {
                            if (arrayList2.size() != 0) {
                                if (arrayList2.size() == 1) {
                                    jVar2.b((Exception) arrayList2.get(0));
                                } else {
                                    jVar2.b((Exception) new a.a(String.format("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList2.size())}), (List) arrayList2));
                                }
                            } else if (atomicBoolean2.get()) {
                                jVar2.b();
                            } else {
                                jVar2.b(null);
                            }
                        }
                        return null;
                    }
                };
                ((i) it2.next()).a((g<TResult, TContinuationResult>) r0);
                it2 = it3;
            }
            return jVar.f1091a;
        }
    }

    public static void a(List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f59816a, true, 66866, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, null, f59816a, true, 66866, new Class[]{List.class}, Void.TYPE);
        } else if (list.size() == 2) {
            c a2 = c.a();
            long j = 0;
            for (a next : list) {
                if (j <= next.f59826b) {
                    j = next.f59826b;
                }
                if ("poi_aweme".equalsIgnoreCase(next.f59825a)) {
                    a2.a("ame_request_id", next.f59827c);
                    a2.a("api_aweme", Long.valueOf(next.f59826b));
                } else {
                    a2.a("poi_request_id", next.f59827c);
                    a2.a("api_detail", Long.valueOf(next.f59826b));
                }
            }
            a2.a("api_join", Long.valueOf(j));
            a2.a("status", (Integer) 1);
            n.a("poi_log", "get_poi_detail", a2.b());
        }
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f59816a, true, 66870, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f59816a, true, 66870, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        n.a("poi_log", "poi_city", jSONObject2);
    }

    public static void a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, null, f59816a, true, 66869, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, null, f59816a, true, 66869, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a("poi_log", str2, jSONObject2);
    }

    public static void a(String str, long j, String str2) {
        String str3 = str;
        long j2 = j;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), str4}, null, f59816a, true, 66868, new Class[]{String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, new Long(j2), str4}, null, f59816a, true, 66868, new Class[]{String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        c a2 = c.a();
        a2.a("api_join", Long.valueOf(j));
        a2.a("status", str4);
        n.a("poi_log", str3, a2.b());
    }
}
