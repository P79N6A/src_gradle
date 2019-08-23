package com.bytedance.frameworks.plugin.c;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e.b;
import com.bytedance.frameworks.plugin.f.g;
import java.lang.reflect.Method;

public final class e extends j {

    static class a extends i {
        a() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 21 && objArr != null && objArr.length > 0 && (objArr[0] instanceof JobInfo)) {
                JobInfo jobInfo = objArr[0];
                ComponentName service = jobInfo.getService();
                if (service != null && !TextUtils.equals(service.getPackageName(), com.bytedance.frameworks.plugin.e.a().getPackageName())) {
                    try {
                        com.bytedance.frameworks.plugin.e.a.a((Object) jobInfo, "service", (Object) new ComponentName(com.bytedance.frameworks.plugin.e.a().getPackageName(), service.getClassName()));
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
            return super.a(obj, method, objArr);
        }
    }

    static {
        f2174b.put("schedule", new a());
    }

    public final void a() {
        b bVar = new b("jobscheduler", this);
        bVar.a();
        try {
            b(b.a(Class.forName("android.app.job.IJobScheduler$Stub"), "asInterface", (Class<?>[]) new Class[]{IBinder.class}).invoke(null, new Object[]{bVar.f2178e}));
        } catch (Exception e2) {
            g.a("Hook proxy JobScheduler Failed!!!", (Throwable) e2);
        }
    }
}
