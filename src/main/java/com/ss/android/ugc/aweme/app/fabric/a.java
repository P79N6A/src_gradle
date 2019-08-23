package com.ss.android.ugc.aweme.app.fabric;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.a.b;
import java.util.Iterator;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34184a;

    public final void onActivityDestroyed(Activity activity) {
    }

    public static long a(Context context) throws Exception {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f34184a, true, 23505, new Class[]{Context.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{context2}, null, f34184a, true, 23505, new Class[]{Context.class}, Long.TYPE)).longValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public final void onActivityPaused(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f34184a, false, 23502, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f34184a, false, 23502, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("onActivityPaused() called with: activity = [" + activity.getClass().getName() + "]");
    }

    public final void onActivityResumed(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f34184a, false, 23501, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f34184a, false, 23501, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("onActivityResumed() called with: activity = [" + activity.getClass().getName() + "]");
    }

    public final void onActivityStarted(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f34184a, false, 23500, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f34184a, false, 23500, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("onActivityStarted() called with: activity = [" + activity.getClass().getName() + "]");
    }

    public final void onActivityStopped(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f34184a, false, 23503, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f34184a, false, 23503, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("onActivityStopped() called with: activity = [" + activity.getClass().getName() + "]");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{activity, bundle}, this, f34184a, false, 23504, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, bundle}, this, f34184a, false, 23504, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("onActivitySaveInstanceState() called with: activity = [" + activity.getClass().getName() + "]");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Activity activity2 = activity;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle}, this, f34184a, false, 23499, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle}, this, f34184a, false, 23499, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
            return;
        }
        try {
            String name = activity.getClass().getName();
            if (PatchProxy.isSupport(new Object[]{"current_activity", name}, null, com.ss.android.ugc.aweme.framework.a.a.f3298a, true, 45881, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{"current_activity", name}, null, com.ss.android.ugc.aweme.framework.a.a.f3298a, true, 45881, new Class[]{String.class, String.class}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.framework.a.a.f3299b && com.ss.android.ugc.aweme.framework.a.a.f3300c != null) {
                Iterator<b> it2 = com.ss.android.ugc.aweme.framework.a.a.f3300c.iterator();
                while (it2.hasNext()) {
                    b next = it2.next();
                    if (next != null && next.a()) {
                        next.a("current_activity", (Object) name);
                    }
                }
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder("onActivityCreated() called with: activity = [");
        sb.append(activity.getClass().getName());
        sb.append("], savedInstanceState null = [");
        if (bundle == null) {
            z = true;
        }
        sb.append(z);
        sb.append("]");
        com.ss.android.ugc.aweme.framework.a.a.a(sb.toString());
        if (activity2 instanceof FragmentActivity) {
            ((FragmentActivity) activity2).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FabricFragmentLifecycleCallbacks(), true);
        }
        try {
            long a2 = a(activity.getApplicationContext());
            com.ss.android.ugc.aweme.framework.a.a.a(activity.getClass().getName() + "   freeMem :" + ((a2 / 1024) / 1024));
        } catch (Exception unused2) {
        }
    }
}
