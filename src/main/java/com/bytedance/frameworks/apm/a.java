package com.bytedance.frameworks.apm;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.WorkerThread;
import com.bytedance.apm.j.b;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.c;
import com.bytedance.services.apm.api.g;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

public abstract class a implements b.C0006b, c, g, com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19636a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19637b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f19638c;

    /* renamed from: d  reason: collision with root package name */
    private volatile JSONObject f19639d;

    /* renamed from: e  reason: collision with root package name */
    private volatile JSONObject f19640e;

    /* renamed from: f  reason: collision with root package name */
    private volatile JSONObject f19641f;

    public final void a(long j) {
    }

    @WorkerThread
    public void a(Context context) {
    }

    public final void c(Activity activity) {
    }

    public final void d(Activity activity) {
    }

    public void onReady() {
        this.f19636a = true;
    }

    @WorkerThread
    public void a() {
        IActivityLifeManager iActivityLifeManager = (IActivityLifeManager) com.bytedance.news.common.service.manager.c.a(IActivityLifeManager.class);
        if (iActivityLifeManager != null) {
            iActivityLifeManager.unregister(this);
        }
        IConfigManager iConfigManager = (IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class);
        if (iConfigManager != null) {
            iConfigManager.unregisterConfigListener(this);
        }
        b.a().b(this);
    }

    public final void b(Activity activity) {
        this.f19637b = true;
    }

    public final void a(Activity activity) {
        this.f19637b = false;
    }

    public void onRefresh(JSONObject jSONObject, boolean z) {
        this.f19638c = jSONObject;
        this.f19639d = jSONObject.optJSONObject("allow_log_type");
        this.f19640e = jSONObject.optJSONObject("allow_metric_type");
        this.f19641f = jSONObject.optJSONObject("allow_service_name");
    }
}
