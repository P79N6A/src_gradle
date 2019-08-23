package com.ss.android.ugc.aweme.thread;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.g.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4244a;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f4244a, false, 86905, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4244a, false, 86905, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MonitorUtils.getLogTypeSwitch("startup_thread_info") || a.a()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f4244a, false, 86907, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4244a, false, 86907, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MonitorUtils.getLogTypeSwitch("task_wait_timeout") || a.a()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f4244a, false, 86909, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4244a, false, 86909, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MonitorUtils.getLogTypeSwitch("task_execute_timeout") || a.a()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f4244a, false, 86911, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4244a, false, 86911, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MonitorUtils.getLogTypeSwitch("task_blocked") || a.a()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f4244a, false, 86913, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4244a, false, 86913, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MonitorUtils.getLogTypeSwitch("task_rejected") || a.a()) {
            return true;
        } else {
            return false;
        }
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f4244a, false, 86908, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f4244a, false, 86908, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            n.a("task_wait_timeout", jSONObject2);
        }
    }

    public final void c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f4244a, false, 86910, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f4244a, false, 86910, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            n.a("task_execute_timeout", jSONObject2);
        }
    }

    public final void d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f4244a, false, 86912, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f4244a, false, 86912, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        n.a("task_blocked", jSONObject2);
    }

    public final void e(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f4244a, false, 86914, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f4244a, false, 86914, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        n.a("task_rejected", jSONObject2);
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f4244a, false, 86906, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f4244a, false, 86906, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            try {
                jSONObject2.put("cpu_core_count", Runtime.getRuntime().availableProcessors());
                jSONObject2.put("active_thread_count_in_feed", Thread.getAllStackTraces().size());
            } catch (JSONException unused) {
            }
            n.a("startup_thread_info", jSONObject2);
        }
    }
}
