package com.ss.android.ugc.aweme.app.host;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.apm.agent.instrumentation.AppInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.di.AppComponent;
import com.ss.android.ugc.aweme.di.DaggerAppComponent;
import com.ss.android.ugc.aweme.di.an;
import com.ss.android.ugc.dagger.android.compat.a;
import com.ss.android.ugc.graph.d;
import com.ss.android.ugc.graph.e;
import dagger.android.b;
import dagger.android.c;
import javax.inject.Inject;

public class HostApplication extends k implements c {
    public static ChangeQuickRedirect i;
    @Inject
    public b<Activity> j;
    @Inject
    public a k;

    public void attachBaseContext(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, i, false, 23519, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, i, false, 23519, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        AppInstrumentation.attachBaseContextStart();
        super.attachBaseContext(context);
        AppInstrumentation.attachBaseContextEnd();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 23518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 23518, new Class[0], Void.TYPE);
            return;
        }
        AppInstrumentation.onCreateStart();
        super.onCreate();
        AppInstrumentation.onCreateEnd();
    }

    public final dagger.android.a<Activity> j() {
        return this.j;
    }

    public HostApplication() {
        AppInstrumentation.initStart();
        AppInstrumentation.initEnd();
    }

    public final void i() {
        AppComponent appComponent;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 23516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 23516, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.di.a.f3022a, true, 35173, new Class[]{HostApplication.class}, AppComponent.class)) {
            appComponent = (AppComponent) PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.di.a.f3022a, true, 35173, new Class[]{HostApplication.class}, AppComponent.class);
        } else {
            AppComponent a2 = DaggerAppComponent.builder().a((Application) this).a(new an(this)).a();
            e.b bVar = new e.b();
            bVar.f4331a = a2;
            bVar.f4332b = new d();
            e eVar = new e(bVar.f4331a, bVar.f4332b, (byte) 0);
            if (e.f4328a == null) {
                e.f4328a = eVar;
            }
            e eVar2 = e.f4328a;
            appComponent = a2;
        }
        appComponent.inject(this);
    }
}
