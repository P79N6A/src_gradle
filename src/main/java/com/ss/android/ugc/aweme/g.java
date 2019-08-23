package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.utils.RocketActivityProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.util.d;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49493a;
    public static WeakReference<Activity> i = new WeakReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    public int f49494b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f49495c = true;

    /* renamed from: d  reason: collision with root package name */
    public long f49496d;

    /* renamed from: e  reason: collision with root package name */
    public a f49497e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f49498f = true;
    public long g;
    public boolean h;

    public interface a {
        void a();

        void b();

        void c();
    }

    public g(Application application) {
        if (PatchProxy.isSupport(new Object[]{application}, this, f49493a, false, 19419, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, this, f49493a, false, 19419, new Class[]{Application.class}, Void.TYPE);
        } else if (application == null) {
            this.f49495c = false;
        } else {
            application.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49499a;

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityDestroyed(Activity activity) {
                    if (activity instanceof MainActivity) {
                        g.this.h = false;
                    }
                }

                public final void onActivityPaused(Activity activity) {
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity2}, this, f49499a, false, 19422, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, this, f49499a, false, 19422, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{activity2}, null, ForegroundActivityMonitor.f31557a, true, 19458, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, null, ForegroundActivityMonitor.f31557a, true, 19458, new Class[]{Activity.class}, Void.TYPE);
                    } else if (activity2 != null) {
                        ForegroundActivityMonitor.f31559c.a(activity2);
                    }
                    g.this.f49498f = true;
                    g.this.g = System.currentTimeMillis();
                    if (PatchProxy.isSupport(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32542, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32542, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    RocketActivityProxy.f39621b.a(activity2, new RocketActivityProxy.a(RocketActivityProxy.ActivityProxy.f39623b));
                }

                public final void onActivityResumed(Activity activity) {
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity2}, this, f49499a, false, 19421, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, this, f49499a, false, 19421, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{activity2}, null, ForegroundActivityMonitor.f31557a, true, 19457, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, null, ForegroundActivityMonitor.f31557a, true, 19457, new Class[]{Activity.class}, Void.TYPE);
                    } else if (activity2 != null) {
                        ForegroundActivityMonitor.f31559c.a(activity2);
                        ForegroundActivityMonitor.f31558b.addFirst(new WeakReference(activity2));
                    }
                    if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needCallbackOnActivityResumed(activity2) && g.this.f49497e != null) {
                        g.this.f49497e.c();
                    }
                    g.this.f49498f = false;
                    g.i = new WeakReference<>(activity2);
                    if (PatchProxy.isSupport(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32543, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32543, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    RocketActivityProxy.f39621b.a(activity2, new RocketActivityProxy.b(RocketActivityProxy.ActivityProxy.f39623b));
                }

                public final void onActivityStarted(Activity activity) {
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity2}, this, f49499a, false, 19420, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, this, f49499a, false, 19420, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32544, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32544, new Class[]{Activity.class}, Void.TYPE);
                    } else {
                        RocketActivityProxy.f39621b.a(activity2, new RocketActivityProxy.c(RocketActivityProxy.ActivityProxy.f39623b));
                    }
                    if (com.ss.android.g.a.a() || !com.ss.android.di.push.a.a().isSswoAct(activity2)) {
                        g.this.f49494b++;
                        if (g.this.f49494b == 1) {
                            g.this.f49495c = false;
                            if (g.this.f49497e != null) {
                                g.this.f49497e.a();
                            }
                            if (PatchProxy.isSupport(new Object[]{activity2}, null, d.f75427a, true, 87783, new Class[]{Activity.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{activity2}, null, d.f75427a, true, 87783, new Class[]{Activity.class}, Void.TYPE);
                            } else if (d.b()) {
                                if (PatchProxy.isSupport(new Object[0], null, d.f75427a, true, 87779, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], null, d.f75427a, true, 87779, new Class[0], Void.TYPE);
                                } else if (d.b()) {
                                    d.a();
                                }
                            }
                        }
                    }
                }

                public final void onActivityStopped(Activity activity) {
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity2}, this, f49499a, false, 19423, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, this, f49499a, false, 19423, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32545, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity2}, null, RocketActivityProxy.f39620a, true, 32545, new Class[]{Activity.class}, Void.TYPE);
                    } else {
                        RocketActivityProxy.f39621b.a(activity2, new RocketActivityProxy.d(RocketActivityProxy.ActivityProxy.f39623b));
                    }
                    if (com.ss.android.g.a.a() || !com.ss.android.di.push.a.a().isSswoAct(activity2)) {
                        g.this.f49494b--;
                        if (g.this.f49494b == 0) {
                            g.this.f49495c = true;
                            g.this.f49496d = System.currentTimeMillis();
                            if (g.this.f49497e != null) {
                                g.this.f49497e.b();
                            }
                            if (PatchProxy.isSupport(new Object[0], null, d.f75427a, true, 87784, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, d.f75427a, true, 87784, new Class[0], Void.TYPE);
                            } else if (d.b()) {
                                if (PatchProxy.isSupport(new Object[0], null, d.f75427a, true, 87780, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], null, d.f75427a, true, 87780, new Class[0], Void.TYPE);
                                } else if (d.b()) {
                                    d.a();
                                }
                            }
                        }
                    }
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    if (activity instanceof MainActivity) {
                        g.this.h = true;
                    }
                }
            });
        }
    }
}
