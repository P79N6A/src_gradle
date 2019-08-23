package com.ss.android.ugc.aweme.util.crony;

import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75421a;

    /* renamed from: b  reason: collision with root package name */
    static Application f75422b;

    /* renamed from: c  reason: collision with root package name */
    static String f75423c;

    /* renamed from: d  reason: collision with root package name */
    static c f75424d;

    private static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f75421a, true, 87824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75421a, true, 87824, new Class[0], Void.TYPE);
        } else {
            f75422b.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75425a;

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                public final void onActivityDestroyed(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityPaused(Activity activity) {
                    a.f75423c = null;
                }

                public final void onActivityResumed(Activity activity) {
                    if (PatchProxy.isSupport(new Object[]{activity}, this, f75425a, false, 87825, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity}, this, f75425a, false, 87825, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    a.f75423c = activity.getClass().getCanonicalName();
                }
            });
        }
    }

    private static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f75421a, true, 87823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75421a, true, 87823, new Class[0], Void.TYPE);
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_clipboard");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_clipboard_put");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_activity");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_info");
        f75422b.registerReceiver(new CronyReceiver(), intentFilter);
    }

    public static void a(c cVar) {
        f75424d = cVar;
    }

    public static void a(Application application) {
        if (PatchProxy.isSupport(new Object[]{application}, null, f75421a, true, 87822, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, null, f75421a, true, 87822, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        f75422b = application;
        a();
        b();
    }
}
