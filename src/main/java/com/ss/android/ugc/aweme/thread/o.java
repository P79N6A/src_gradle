package com.ss.android.ugc.aweme.thread;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4261a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, WeakReference<ExecutorService>> f4262b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<p, AtomicInteger> f4263c = new HashMap();

    o() {
    }

    @NonNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f4261a, false, 86922, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4261a, false, 86922, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : this.f4262b.entrySet()) {
            String str = (String) next.getKey();
            if (((WeakReference) next.getValue()).get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) ((WeakReference) next.getValue()).get();
                sb.append("pool=");
                sb.append(str);
                sb.append(", core.size=");
                sb.append(threadPoolExecutor.getCorePoolSize());
                sb.append(", pool.size=");
                sb.append(threadPoolExecutor.getPoolSize());
                sb.append(", largest.pool.size=");
                sb.append(threadPoolExecutor.getLargestPoolSize());
                sb.append(", queue.size=");
                sb.append(threadPoolExecutor.getQueue().size());
                sb.append(", task.count=");
                sb.append(threadPoolExecutor.getTaskCount());
                sb.append(", task.completed.count=");
                sb.append(threadPoolExecutor.getCompletedTaskCount());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void a(p pVar, ExecutorService executorService, boolean z) {
        p pVar2 = pVar;
        ExecutorService executorService2 = executorService;
        if (PatchProxy.isSupport(new Object[]{pVar2, executorService2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4261a, false, 86919, new Class[]{p.class, ExecutorService.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2, executorService2, Byte.valueOf(z)}, this, f4261a, false, 86919, new Class[]{p.class, ExecutorService.class, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f4262b.put(pVar.name(), new WeakReference(executorService2));
        } else {
            if (this.f4263c.get(pVar) == null) {
                this.f4263c.put(pVar, new AtomicInteger(0));
            }
            Map<String, WeakReference<ExecutorService>> map = this.f4262b;
            map.put(pVar.name() + "_" + this.f4263c.get(pVar).incrementAndGet(), new WeakReference(executorService2));
        }
    }
}
