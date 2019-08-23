package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class ActivityMonitor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61110a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f61111b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Activity> f61112c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d  reason: collision with root package name */
    public int f61113d = 2;

    /* renamed from: e  reason: collision with root package name */
    public int f61114e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f61115f = 0;
    private final List<Object> g = new ArrayList();
    private final List<Object> h = new ArrayList();

    public @interface AppState {
    }

    public ActivityMonitor(@NonNull Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61116a;

            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityResumed(Activity activity) {
                h hVar;
                Activity activity2 = activity;
                if (PatchProxy.isSupport(new Object[]{activity2}, this, f61116a, false, 67154, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2}, this, f61116a, false, 67154, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                ActivityMonitor activityMonitor = ActivityMonitor.this;
                if (PatchProxy.isSupport(new Object[]{activity2}, null, h.f61138a, true, 67139, new Class[]{Activity.class}, h.class)) {
                    hVar = (h) PatchProxy.accessDispatch(new Object[]{activity2}, null, h.f61138a, true, 67139, new Class[]{Activity.class}, h.class);
                } else {
                    hVar = new h(activity2, (byte) 5);
                }
                activityMonitor.a(hVar);
            }

            public final void onActivityStopped(Activity activity) {
                if (PatchProxy.isSupport(new Object[]{activity}, this, f61116a, false, 67155, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity}, this, f61116a, false, 67155, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                ActivityMonitor.this.f61115f--;
                if (ActivityMonitor.this.f61115f == 0) {
                    ActivityMonitor.this.a(2);
                }
            }

            public final void onActivityDestroyed(Activity activity) {
                h hVar;
                Activity activity2 = activity;
                if (PatchProxy.isSupport(new Object[]{activity2}, this, f61116a, false, 67156, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2}, this, f61116a, false, 67156, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                ActivityMonitor.this.f61114e--;
                ActivityMonitor activityMonitor = ActivityMonitor.this;
                if (PatchProxy.isSupport(new Object[]{activity2}, null, h.f61138a, true, 67140, new Class[]{Activity.class}, h.class)) {
                    hVar = (h) PatchProxy.accessDispatch(new Object[]{activity2}, null, h.f61138a, true, 67140, new Class[]{Activity.class}, h.class);
                } else {
                    hVar = new h(activity2, (byte) 2);
                }
                activityMonitor.a(hVar);
                ActivityMonitor.this.f61112c.remove(activity2);
                if (TextUtils.equals(activity.getClass().getSimpleName(), "LivePlayActivity")) {
                    ActivityMonitor.this.f61111b = false;
                }
            }

            public final void onActivityStarted(Activity activity) {
                h hVar;
                Activity activity2 = activity;
                if (PatchProxy.isSupport(new Object[]{activity2}, this, f61116a, false, 67153, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2}, this, f61116a, false, 67153, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                ActivityMonitor.this.f61115f++;
                if (ActivityMonitor.this.f61115f == 1) {
                    ActivityMonitor.this.a(1);
                }
                ActivityMonitor activityMonitor = ActivityMonitor.this;
                if (PatchProxy.isSupport(new Object[]{activity2}, null, h.f61138a, true, 67138, new Class[]{Activity.class}, h.class)) {
                    hVar = (h) PatchProxy.accessDispatch(new Object[]{activity2}, null, h.f61138a, true, 67138, new Class[]{Activity.class}, h.class);
                } else {
                    hVar = new h(activity2, (byte) 3);
                }
                activityMonitor.a(hVar);
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                h hVar;
                Activity activity2 = activity;
                if (PatchProxy.isSupport(new Object[]{activity2, bundle}, this, f61116a, false, 67152, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2, bundle}, this, f61116a, false, 67152, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
                    return;
                }
                ActivityMonitor.this.f61114e++;
                ActivityMonitor activityMonitor = ActivityMonitor.this;
                if (PatchProxy.isSupport(new Object[]{activity2}, null, h.f61138a, true, 67137, new Class[]{Activity.class}, h.class)) {
                    hVar = (h) PatchProxy.accessDispatch(new Object[]{activity2}, null, h.f61138a, true, 67137, new Class[]{Activity.class}, h.class);
                } else {
                    hVar = new h(activity2, (byte) 1);
                }
                activityMonitor.a(hVar);
                ActivityMonitor.this.f61112c.add(activity2);
                if (TextUtils.equals(activity.getClass().getSimpleName(), "LivePlayActivity")) {
                    ActivityMonitor.this.f61111b = true;
                }
            }
        });
    }

    public final void a(@AppState int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61110a, false, 67145, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61110a, false, 67145, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61113d = i;
        Iterator<Object> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public final void a(@NonNull h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f61110a, false, 67146, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f61110a, false, 67146, new Class[]{h.class}, Void.TYPE);
            return;
        }
        Iterator<Object> it2 = this.h.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public final boolean a(@NonNull n<Activity> nVar) {
        n<Activity> nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f61110a, false, 67151, new Class[]{n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar2}, this, f61110a, false, 67151, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
        }
        for (Activity apply : this.f61112c) {
            if (nVar2.apply(apply)) {
                return true;
            }
        }
        return false;
    }
}
