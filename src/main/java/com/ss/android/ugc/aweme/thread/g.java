package com.ss.android.ugc.aweme.thread;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4197a;

    /* renamed from: b  reason: collision with root package name */
    static ExecutorService f4198b;

    /* renamed from: c  reason: collision with root package name */
    Object f4199c;

    /* renamed from: d  reason: collision with root package name */
    public Map<b, Object> f4200d;

    /* renamed from: e  reason: collision with root package name */
    public ReentrantLock f4201e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static g f4219a = new g((byte) 0);
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4220a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f4220a, false, 86888, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4220a, false, 86888, new Class[0], Void.TYPE);
            } else if (h.b().d()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList<b> arrayList = new ArrayList<>();
                g.this.f4201e.lock();
                try {
                    if (g.this.f4200d.size() <= 0) {
                        g.this.f4201e.unlock();
                        return;
                    }
                    Iterator<Map.Entry<b, Object>> it2 = g.this.f4200d.entrySet().iterator();
                    while (it2.hasNext()) {
                        b bVar = (b) it2.next().getKey();
                        if (uptimeMillis - bVar.f4179d >= h.a().g) {
                            arrayList.add(bVar);
                            it2.remove();
                        }
                    }
                    g.this.f4201e.unlock();
                    for (b bVar2 : arrayList) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String a2 = q.a((Object) bVar2.f4177b);
                            if (!h.a(a2)) {
                                jSONObject.put("task_name", a2);
                                jSONObject.put("pool_type", bVar2.f4178c.f4175b.name());
                                jSONObject.put("pool_size", bVar2.f4178c.getPoolSize());
                                jSONObject.put("queue_size", bVar2.f4178c.getQueue().size());
                                jSONObject.put("duration", uptimeMillis - bVar2.f4179d);
                                if (bVar2.f4180e != null) {
                                    jSONObject.put("task_stack", q.a(bVar2.f4180e.getStackTrace()));
                                }
                                h.b().d(jSONObject);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    arrayList.clear();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    g.this.f4201e.unlock();
                    throw th;
                }
            }
        }

        b() {
        }
    }

    static g a() {
        return a.f4219a;
    }

    private g() {
        this.f4199c = new Object();
        this.f4201e = new ReentrantLock();
        this.f4200d = new WeakHashMap();
        ExecutorService a2 = h.a(m.a(p.SCHEDULED).a(1).a("TaskMonitor").a());
        f4198b = a2;
        ((ScheduledExecutorService) a2).scheduleAtFixedRate(new b(), h.a().g, h.a().g, TimeUnit.MILLISECONDS);
    }

    /* synthetic */ g(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4197a, false, 86884, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f4197a, false, 86884, new Class[]{b.class}, Void.TYPE);
        } else if (h.b().d()) {
            this.f4201e.lock();
            try {
                this.f4200d.remove(bVar);
            } finally {
                this.f4201e.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        final Runnable runnable2 = runnable;
        final ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
        if (PatchProxy.isSupport(new Object[]{runnable2, threadPoolExecutor2}, this, f4197a, false, 86881, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2, threadPoolExecutor2}, this, f4197a, false, 86881, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE);
        } else if (h.b().e()) {
            final Exception exc = new Exception();
            f4198b.execute(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f4214a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f4214a, false, 86887, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f4214a, false, 86887, new Class[0], Void.TYPE);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (runnable2 instanceof b) {
                            jSONObject.put("task_name", ((b) runnable2).f4177b);
                        } else {
                            jSONObject.put("task_name", runnable2);
                        }
                        if (threadPoolExecutor2 instanceof a) {
                            jSONObject.put("pool_type", ((a) threadPoolExecutor2).f4175b.name());
                            jSONObject.put("pool_size", threadPoolExecutor2.getPoolSize());
                            jSONObject.put("task_stack", q.a((Throwable) exc));
                        }
                    } catch (Exception unused) {
                    }
                    h.b().e(jSONObject);
                }
            });
        }
    }

    public static JSONObject a(WeakReference<Object> weakReference, String str, int i, int i2, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{weakReference, str2, Integer.valueOf(i), Integer.valueOf(i2), new Long(j2)}, null, f4197a, true, 86882, new Class[]{WeakReference.class, String.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, JSONObject.class)) {
            Object[] objArr = {weakReference, str2, Integer.valueOf(i), Integer.valueOf(i2), new Long(j2)};
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, f4197a, true, 86882, new Class[]{WeakReference.class, String.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, JSONObject.class);
        }
        Object obj = weakReference.get();
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String a2 = q.a(obj);
            if (h.a(a2)) {
                return null;
            }
            jSONObject.put("task_name", a2);
            jSONObject.put("pool_type", str2);
            jSONObject.put("pool_size", i);
            jSONObject.put("queue_size", i2);
            jSONObject.put("duration", j2);
            return jSONObject;
        } catch (Exception unused) {
        }
    }
}
