package com.bytedance.crash.runtime.assembly;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.crash.event.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f19515a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<Long> f19516b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f19517c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<Long> f19518d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public String f19519e;

    /* renamed from: f  reason: collision with root package name */
    public long f19520f;
    public String g;
    public long h;
    public String i;
    public long j;
    public String k;
    public long l;
    public String m;
    public long n;
    public int o;
    private Application p;
    private Context q;
    private final Application.ActivityLifecycleCallbacks r = new Application.ActivityLifecycleCallbacks() {
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityResumed(Activity activity) {
            b.this.i = activity.getClass().getName();
            b.this.j = System.currentTimeMillis();
            b.this.o++;
        }

        public final void onActivityStarted(Activity activity) {
            b.this.g = activity.getClass().getName();
            b.this.h = System.currentTimeMillis();
        }

        public final void onActivityStopped(Activity activity) {
            b.this.m = activity.getClass().getName();
            b.this.n = System.currentTimeMillis();
        }

        public final void onActivityPaused(Activity activity) {
            b.this.k = activity.getClass().getName();
            b.this.l = System.currentTimeMillis();
            b bVar = b.this;
            bVar.o--;
            if (b.this.o <= 0) {
                c.a();
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            int indexOf = b.this.f19515a.indexOf(name);
            if (indexOf >= 0 && indexOf < b.this.f19515a.size()) {
                b.this.f19515a.remove(indexOf);
                b.this.f19516b.remove(indexOf);
            }
            b.this.f19517c.add(name);
            b.this.f19518d.add(Long.valueOf(System.currentTimeMillis()));
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            b.this.f19519e = activity.getClass().getName();
            b.this.f19520f = System.currentTimeMillis();
            b.this.f19515a.add(b.this.f19519e);
            b.this.f19516b.add(Long.valueOf(b.this.f19520f));
        }
    };

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        if (this.f19515a == null || this.f19515a.isEmpty()) {
            return jSONArray;
        }
        int i2 = 0;
        while (i2 < this.f19515a.size()) {
            try {
                jSONArray.put(a(this.f19515a.get(i2), this.f19516b.get(i2).longValue()));
                i2++;
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    private JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        if (this.f19517c == null || this.f19517c.isEmpty()) {
            return jSONArray;
        }
        int i2 = 0;
        while (i2 < this.f19517c.size()) {
            try {
                jSONArray.put(a(this.f19517c.get(i2), this.f19518d.get(i2).longValue()));
                i2++;
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.f19519e, this.f19520f));
            jSONObject.put("last_start_activity", a(this.g, this.h));
            jSONObject.put("last_resume_activity", a(this.i, this.j));
            jSONObject.put("last_pause_activity", a(this.k, this.l));
            jSONObject.put("last_stop_activity", a(this.m, this.n));
            jSONObject.put("alive_activities", c());
            jSONObject.put("finish_activities", d());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            ActivityManager activityManager = (ActivityManager) this.q.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager == null) {
                return jSONArray;
            }
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(5);
            if (runningTasks == null) {
                return jSONArray;
            }
            for (ActivityManager.RunningTaskInfo next : runningTasks) {
                if (!(next == null || next.baseActivity == null)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", next.id);
                        jSONObject.put("package_name", next.baseActivity.getPackageName());
                        jSONObject.put("description", next.description);
                        jSONObject.put("number_of_activities", next.numActivities);
                        jSONObject.put("number_of_running_activities", next.numRunning);
                        jSONObject.put("topActivity", next.topActivity.toString());
                        jSONObject.put("baseActivity", next.baseActivity.toString());
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Exception unused2) {
        }
    }

    b(@NonNull Context context) {
        this.q = context;
        if (this.q instanceof Application) {
            this.p = (Application) context;
        }
        if (Build.VERSION.SDK_INT >= 14 && this.p != null) {
            this.p.registerActivityLifecycleCallbacks(this.r);
        }
    }

    private static JSONObject a(String str, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
