package com.bytedance.apm.d;

import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.d;
import com.bytedance.apm.d.c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.k.j;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public abstract class a<T extends c> implements b, com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.apm.g.a f1948a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedList<T> f1949b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f1950c;

    /* access modifiers changed from: protected */
    public boolean b(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void c(T t) {
    }

    /* access modifiers changed from: protected */
    public abstract void d(T t);

    public void onRefresh(JSONObject jSONObject, boolean z) {
    }

    protected a() {
    }

    public static boolean a() {
        if (ActivityLifeObserver.getInstance() != null && ActivityLifeObserver.getInstance().isForeground()) {
            return false;
        }
        return true;
    }

    public void onReady() {
        LinkedList linkedList;
        this.f1950c = true;
        synchronized (this.f1949b) {
            linkedList = new LinkedList(this.f1949b);
            this.f1949b.clear();
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            d((c) it2.next());
        }
    }

    public final void a(com.bytedance.apm.g.a aVar) {
        this.f1948a = aVar;
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(this);
    }

    public final boolean b(String str) {
        return ApmDelegate.getInstance().getServiceNameSwitch(str);
    }

    public final boolean c(String str) {
        return ApmDelegate.getInstance().getMetricsTypeSwitch(str);
    }

    public final boolean a(String str) {
        return ApmDelegate.getInstance().getLogTypeSwitch(str);
    }

    public final void a(T t) {
        if (b(t)) {
            c(t);
            if (this.f1950c) {
                d(t);
            } else if (t != null) {
                synchronized (this.f1949b) {
                    if (this.f1949b.size() > 1000) {
                        this.f1949b.poll();
                        d a2 = d.a();
                        if (a2.f1946a != null && !a2.f1947b.contains("apm_cache_buffer_full")) {
                            a2.f1947b.add("apm_cache_buffer_full");
                            d.a aVar = a2.f1946a;
                            aVar.a("apm_" + "apm_cache_buffer_full");
                        }
                        if (com.bytedance.apm.c.d()) {
                            throw new RuntimeException("apm_cache_buffer_full");
                        }
                    }
                    this.f1949b.add(t);
                }
            }
        }
    }

    public final void a(final String str, final String str2, final JSONObject jSONObject, boolean z, boolean z2) {
        JSONObject jSONObject2;
        if (!TextUtils.equals(str, "timer")) {
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = jSONObject;
            }
            try {
                String b2 = com.bytedance.apm.c.g().b();
                if (!TextUtils.isEmpty(b2)) {
                    jSONObject2.put("session_id", b2);
                }
                if (jSONObject2.isNull("network_type")) {
                    jSONObject2.put("network_type", j.c(com.bytedance.apm.c.a()).getValue());
                }
                int a2 = j.a(com.bytedance.apm.c.a());
                if (a2 != -10000) {
                    jSONObject2.put("network_type_code", a2);
                }
                if (jSONObject2.isNull("timestamp") || jSONObject2.optInt("timestamp") <= 0) {
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                }
                jSONObject2.put("sid", com.bytedance.apm.c.c());
            } catch (Exception unused) {
            }
        }
        d.a().a(str, str2, jSONObject, z, false);
        if (this.f1948a != null) {
            ApmDelegate.getInstance().submitTask(new Runnable() {
                public final void run() {
                }
            });
        }
    }
}
