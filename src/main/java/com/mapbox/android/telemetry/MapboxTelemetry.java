package com.mapbox.android.telemetry;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ProcessLifecycleOwner;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.VisibleForTesting;
import com.mapbox.android.core.b.a;
import com.mapbox.android.telemetry.TelemetryService;
import com.mapbox.android.telemetry.bn;
import com.mapbox.android.telemetry.bo;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class MapboxTelemetry implements LifecycleObserver, aa, be, s, Callback {
    public static Context g;

    /* renamed from: a  reason: collision with root package name */
    public t f2361a;

    /* renamed from: b  reason: collision with root package name */
    public TelemetryService f2362b;

    /* renamed from: c  reason: collision with root package name */
    public final bn f2363c;

    /* renamed from: d  reason: collision with root package name */
    public final bo f2364d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2365e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2366f;
    private String h;
    private String i;
    private bj j;
    private Callback k;
    private final bb l;
    private i m;
    private ServiceConnection n;
    private Intent o;
    private az p;
    private CopyOnWriteArraySet<Object> q;
    private final e r;
    private CopyOnWriteArraySet<Object> s;
    private final n t;

    private void n() {
        o().run();
    }

    public void f() {
        this.l.b();
    }

    private void j() {
        g.bindService(d(), this.n, 0);
    }

    private void k() {
        if (this.j == null) {
            this.j = c(this.h, this.i);
        }
    }

    private boolean m() {
        if (a.a(g)) {
            return true;
        }
        n();
        return false;
    }

    private az o() {
        if (this.p == null) {
            this.p = new az(g, this);
        }
        return this.p;
    }

    private static boolean p() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        i();
        j();
        return this.f2365e;
    }

    public void g() {
        g.stopService(d());
    }

    private static boolean l() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) g.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Intent d() {
        if (this.o == null) {
            this.o = new Intent(g, TelemetryService.class);
        }
        return this.o;
    }

    public final void e() {
        boolean z;
        List a2 = this.f2361a.a();
        if (a2.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b(a2);
        }
    }

    public boolean h() {
        if (!bp.a(TelemetryService.class, g)) {
            return false;
        }
        g.unbindService(this.n);
        return true;
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onEnterForeground() {
        a(p());
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
    }

    private void i() {
        if (bo.a.DISABLED.equals(this.f2364d.a(g)) && m()) {
            a(p());
            this.f2365e = true;
        }
    }

    public final void a() {
        e();
        f();
        if (a(TelemetryService.class)) {
            if (this.f2366f && this.f2362b != null) {
                this.f2362b.d();
                h();
            }
            if (this.f2362b != null) {
                bo.a a2 = this.f2364d.a(g);
                if (this.f2362b.e() == 0 && bo.a.ENABLED.equals(a2)) {
                    g();
                }
            }
        }
    }

    public final boolean b() {
        if (!bn.a(g)) {
            return false;
        }
        if (bn.a.ENABLED.equals(this.f2363c.b())) {
            this.l.a();
            if (this.m == null) {
                this.m = new i();
            }
            i iVar = this.m;
            this.l.a(SystemClock.elapsedRealtime());
            c();
        }
        return true;
    }

    public void onEventReceived(r rVar) {
        b(rVar);
    }

    private boolean a(String str) {
        if (bp.a(str)) {
            return false;
        }
        this.h = str;
        return true;
    }

    private void b(List<r> list) {
        if (l()) {
            c(list);
        }
    }

    private boolean b(r rVar) {
        if (bn.a.ENABLED.equals(this.f2363c.b())) {
            return this.f2361a.a(rVar);
        }
        return false;
    }

    @VisibleForTesting
    private void a(boolean z) {
        if (!z || ProcessLifecycleOwner.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            try {
                g.startService(d());
            } catch (IllegalStateException unused) {
            }
        } else {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        }
    }

    private boolean b(String str) {
        if (bp.a(str)) {
            return false;
        }
        this.i = str;
        return true;
    }

    private void c(List<r> list) {
        if (a(this.h, this.i)) {
            this.j.a(list, this.k);
        }
    }

    private static boolean a(Class<?> cls) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) g.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public final void a(List<r> list) {
        if (bn.a.ENABLED.equals(this.f2363c.b()) && !bp.e(g)) {
            b(list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.mapbox.android.telemetry.r r5) {
        /*
            r4 = this;
            com.mapbox.android.telemetry.r$a r0 = com.mapbox.android.telemetry.r.a.TURNSTILE
            com.mapbox.android.telemetry.r$a r1 = r5.a()
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r0.add(r5)
            r4.b((java.util.List<com.mapbox.android.telemetry.r>) r0)
        L_0x0019:
            r1 = 1
            goto L_0x0045
        L_0x001b:
            com.mapbox.android.telemetry.r$a r0 = com.mapbox.android.telemetry.r.a.VIS_ATTACHMENT
            com.mapbox.android.telemetry.r$a r3 = r5.a()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0045
            boolean r0 = l()
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r4.h
            java.lang.String r3 = r4.i
            boolean r0 = r4.a(r0, r3)
            if (r0 == 0) goto L_0x0038
            r1 = 1
        L_0x0038:
            if (r1 == 0) goto L_0x0019
            com.mapbox.android.telemetry.bj r0 = r4.j
            r1 = r5
            com.mapbox.android.telemetry.c r1 = (com.mapbox.android.telemetry.c) r1
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Object> r3 = r4.s
            r0.a((com.mapbox.android.telemetry.c) r1, (java.util.concurrent.CopyOnWriteArraySet<java.lang.Object>) r3)
            goto L_0x0019
        L_0x0045:
            if (r1 == 0) goto L_0x0048
            return r2
        L_0x0048:
            boolean r5 = r4.b((com.mapbox.android.telemetry.r) r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.telemetry.MapboxTelemetry.a(com.mapbox.android.telemetry.r):boolean");
    }

    private boolean a(String str, String str2) {
        boolean b2 = b(str, str2);
        if (b2) {
            k();
            this.f2361a.f26126b = true;
        }
        return b2;
    }

    private bj c(String str, String str2) {
        this.j = new bl(str, bp.a(str2, g), new ag(), this.r).a(g);
        return this.j;
    }

    public void onFailure(Call call, IOException iOException) {
        Iterator<Object> it2 = this.q.iterator();
        while (it2.hasNext()) {
            it2.next();
            iOException.getMessage();
        }
    }

    public void onResponse(Call call, Response response) {
        response.body().close();
        Iterator<Object> it2 = this.q.iterator();
        while (it2.hasNext()) {
            it2.next();
            response.isSuccessful();
            response.code();
        }
    }

    private boolean b(String str, String str2) {
        if (!a(str) || !b(str2)) {
            return false;
        }
        return true;
    }

    public MapboxTelemetry(Context context, String str, String str2) {
        if (g == null) {
            if (context == null || context.getApplicationContext() == null) {
                throw new IllegalArgumentException("Non-null application context required.");
            }
            g = context.getApplicationContext();
        }
        this.f2361a = new t(new ab(this));
        this.t = new n(context, bp.a(str2, context), str, new OkHttpClient());
        this.r = new e(context, this.t);
        a(str, str2);
        this.k = this;
        bc bcVar = new bc(g, new AlarmReceiver(new ba() {
            public final void a() {
                MapboxTelemetry.this.e();
            }
        }));
        this.l = new a(bcVar.f26054b, (AlarmManager) bcVar.f26054b.getSystemService("alarm"), bcVar.f26055c);
        this.n = new ServiceConnection() {
            public final void onServiceDisconnected(ComponentName componentName) {
                MapboxTelemetry.this.f2362b = null;
                MapboxTelemetry.this.f2366f = false;
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (iBinder instanceof TelemetryService.a) {
                    MapboxTelemetry.this.f2362b = TelemetryService.this;
                    MapboxTelemetry.this.f2362b.f25972c.add(MapboxTelemetry.this);
                    if (MapboxTelemetry.this.f2362b.e() == 0) {
                        MapboxTelemetry.this.f2362b.f25970a = MapboxTelemetry.this.f2361a;
                    }
                    TelemetryService telemetryService = MapboxTelemetry.this.f2362b;
                    synchronized (telemetryService) {
                        telemetryService.f25971b++;
                    }
                    MapboxTelemetry.this.f2366f = true;
                    return;
                }
                MapboxTelemetry.g.stopService(MapboxTelemetry.this.d());
            }
        };
        this.f2363c = new bn(true);
        this.f2364d = new bo(true);
        this.q = new CopyOnWriteArraySet<>();
        this.s = new CopyOnWriteArraySet<>();
        Context applicationContext = context.getApplicationContext();
        if (!a(TelemetryService.class)) {
            this.f2364d.a(bo.a.DISABLED, applicationContext);
        }
    }
}
