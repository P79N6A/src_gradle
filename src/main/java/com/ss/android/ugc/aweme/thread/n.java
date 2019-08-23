package com.ss.android.ugc.aweme.thread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4257a;

    /* renamed from: b  reason: collision with root package name */
    private o f4258b;

    /* renamed from: c  reason: collision with root package name */
    private a f4259c;

    public interface a {
        ExecutorService a(m mVar);
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final n f4260a = new n((byte) 0);
    }

    public static n a() {
        return b.f4260a;
    }

    private n() {
        this.f4258b = new o();
        this.f4259c = new d();
    }

    public final JSONObject b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f4257a, false, 86918, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f4257a, false, 86918, new Class[0], JSONObject.class);
        }
        if (h.a().f4229b) {
            try {
                o oVar = this.f4258b;
                if (PatchProxy.isSupport(new Object[0], oVar, o.f4261a, false, 86921, new Class[0], JSONObject.class)) {
                    return (JSONObject) PatchProxy.accessDispatch(new Object[0], oVar, o.f4261a, false, 86921, new Class[0], JSONObject.class);
                }
                JSONObject jSONObject = new JSONObject();
                int i2 = 0;
                for (Map.Entry next : oVar.f4262b.entrySet()) {
                    String str = (String) next.getKey();
                    if (((WeakReference) next.getValue()).get() != null) {
                        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) ((WeakReference) next.getValue()).get();
                        if (str.equals(p.IO.name())) {
                            jSONObject.put("immediate_pool_largest_size", threadPoolExecutor.getLargestPoolSize());
                            jSONObject.put("immediate_pool_task_count", threadPoolExecutor.getTaskCount());
                            jSONObject.put("immediate_pool_queue_size", threadPoolExecutor.getQueue().size());
                        } else if (str.equals(p.DEFAULT.name())) {
                            jSONObject.put("normal_pool_largest_size", threadPoolExecutor.getLargestPoolSize());
                            jSONObject.put("normal_pool_task_count", threadPoolExecutor.getTaskCount());
                            jSONObject.put("normal_pool_queue_size", threadPoolExecutor.getQueue().size());
                        } else if (str.equals(p.BACKGROUND.name())) {
                            jSONObject.put("background_pool_largest_size", threadPoolExecutor.getLargestPoolSize());
                            jSONObject.put("background_pool_task_count", threadPoolExecutor.getTaskCount());
                            jSONObject.put("background_pool_queue_size", threadPoolExecutor.getQueue().size());
                        } else if (str.contains(p.FIXED.name())) {
                            jSONObject.put("fixed_pool_largest_size", threadPoolExecutor.getLargestPoolSize() + jSONObject.optInt("fixed_pool_largest_size"));
                            jSONObject.put("fixed_pool_task_count", threadPoolExecutor.getTaskCount() + ((long) jSONObject.optInt("fixed_pool_task_count")));
                            jSONObject.put("fixed_pool_queue_size", threadPoolExecutor.getQueue().size() + jSONObject.optInt("fixed_pool_queue_size"));
                        } else if (str.contains(p.SCHEDULED.name())) {
                            jSONObject.put("schedule_pool_largest_size", threadPoolExecutor.getLargestPoolSize() + jSONObject.optInt("schedule_pool_largest_size"));
                            jSONObject.put("schedule_pool_task_count", threadPoolExecutor.getTaskCount() + ((long) jSONObject.optInt("schedule_pool_task_count")));
                            jSONObject.put("schedule_pool_queue_size", threadPoolExecutor.getQueue().size() + jSONObject.optInt("schedule_pool_queue_size"));
                        } else if (str.contains(p.SERIAL.name())) {
                            jSONObject.put("serial_pool_largest_size", threadPoolExecutor.getLargestPoolSize() + jSONObject.optInt("serial_pool_largest_size"));
                            jSONObject.put("serial_pool_task_count", threadPoolExecutor.getTaskCount() + ((long) jSONObject.optInt("serial_pool_task_count")));
                            jSONObject.put("serial_pool_queue_size", threadPoolExecutor.getQueue().size() + jSONObject.optInt("serial_pool_queue_size"));
                        }
                        i += threadPoolExecutor.getLargestPoolSize();
                        i2 = (int) (((long) i2) + threadPoolExecutor.getTaskCount());
                    }
                }
                jSONObject.put("total_thread_count", i);
                jSONObject.put("total_task_count", i2);
                return jSONObject;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* synthetic */ n(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final ExecutorService a(m mVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{mVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4257a, false, 86917, new Class[]{m.class, Boolean.TYPE}, ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[]{mVar, Byte.valueOf(z)}, this, f4257a, false, 86917, new Class[]{m.class, Boolean.TYPE}, ExecutorService.class);
        }
        ExecutorService a2 = this.f4259c.a(mVar);
        if (h.a().f4229b) {
            this.f4258b.a(mVar.f4246b, a2, z);
        }
        return a2;
    }
}
