package com.bytedance.apm.battery;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.apm.battery.c.d;
import com.bytedance.apm.battery.c.e;
import com.bytedance.apm.battery.c.f;
import com.bytedance.apm.battery.c.g;
import com.bytedance.apm.battery.c.h;
import com.bytedance.apm.battery.c.i;
import com.bytedance.apm.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.j.b;
import com.ss.android.common.util.ToolUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.bytedance.apm.perf.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f1919a;

    /* renamed from: com.bytedance.apm.battery.a$a  reason: collision with other inner class name */
    static final class C0138a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18897a = new a((byte) 0);
    }

    public final void a(JSONObject jSONObject) {
    }

    public final boolean c() {
        return true;
    }

    public final long d() {
        return 600000;
    }

    public static a a() {
        return C0138a.f18897a;
    }

    private a() {
        this.f1919a = new ArrayList(6);
    }

    public final void onReady() {
        super.onReady();
        com.bytedance.apm.battery.b.a.a().b();
    }

    private void j() {
        if (c.d()) {
            new String[1][0] = "onChangeToBack, record data";
        }
        b.a().a((b.C0006b) this);
        com.bytedance.apm.battery.b.a.a().a(new com.bytedance.apm.f.b(false, System.currentTimeMillis()));
        for (i b2 : this.f1919a) {
            b2.b();
        }
    }

    private void i() {
        if (c.d()) {
            new String[1][0] = "onChangeToFront, record data";
        }
        com.bytedance.apm.battery.b.a.a().f18908b = ActivityLifeObserver.getInstance().getTopActivityClassName();
        b.a().b(this);
        com.bytedance.apm.battery.b.a.a().a(new com.bytedance.apm.f.b(true, System.currentTimeMillis()));
        for (i c2 : this.f1919a) {
            c2.c();
        }
    }

    public final void e() {
        if (c.d()) {
            new String[1][0] = "onTimer record, current is background? : " + ActivityLifeObserver.getInstance().isForeground();
        }
        if (this.f2059c) {
            com.bytedance.apm.battery.b.a.a().a(new com.bytedance.apm.f.b(false, System.currentTimeMillis()));
            for (i d2 : this.f1919a) {
                d2.d();
            }
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 27) {
            d dVar = new d();
            e eVar = new e();
            g gVar = new g();
            f fVar = new f();
            h hVar = new h();
            this.f1919a.add(dVar);
            this.f1919a.add(eVar);
            this.f1919a.add(gVar);
            this.f1919a.add(fVar);
            this.f1919a.add(hVar);
            try {
                com.bytedance.apm.battery.a.b bVar = new com.bytedance.apm.battery.a.b();
                bVar.a("alarm", dVar);
                bVar.a("location", fVar);
                bVar.a("power", hVar);
                if (bVar.f18901a.size() != 0) {
                    Class<?> cls = Class.forName("android.os.ServiceManager");
                    Method declaredMethod = cls.getDeclaredMethod("getService", new Class[]{String.class});
                    Field declaredField = cls.getDeclaredField("sCache");
                    declaredField.setAccessible(true);
                    Map map = (Map) declaredField.get(null);
                    for (Map.Entry next : bVar.f18901a.entrySet()) {
                        String str = (String) next.getKey();
                        IBinder iBinder = (IBinder) declaredMethod.invoke(null, new Object[]{str});
                        com.bytedance.apm.battery.a.c cVar = new com.bytedance.apm.battery.a.c(iBinder, (com.bytedance.apm.battery.a.d) next.getValue());
                        IBinder iBinder2 = (IBinder) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{IBinder.class}, cVar);
                        cVar.f18903b = iBinder2;
                        map.put(str, iBinder2);
                    }
                }
            } catch (Exception e2) {
                if (c.d()) {
                    new String[1][0] = "hook failed: " + e2.getMessage();
                }
            }
            if (ActivityLifeObserver.getInstance().isForeground()) {
                com.bytedance.apm.battery.b.a.a().a(new com.bytedance.apm.f.b(false, System.currentTimeMillis()));
                i();
            } else {
                j();
            }
            if (ToolUtils.isMainProcess(c.a()) && this.f2058b) {
                com.bytedance.apm.battery.b.a.a().b();
            }
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Activity activity) {
        super.a(activity);
        j();
    }

    public final void b(Activity activity) {
        super.b(activity);
        i();
    }
}
