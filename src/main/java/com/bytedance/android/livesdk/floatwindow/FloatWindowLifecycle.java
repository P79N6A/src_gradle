package com.bytedance.android.livesdk.floatwindow;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FloatWindowLifecycle extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14533a;

    /* renamed from: b  reason: collision with root package name */
    public final c f14534b;

    /* renamed from: c  reason: collision with root package name */
    public int f14535c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14536d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14537e;

    /* renamed from: f  reason: collision with root package name */
    private final Class[] f14538f;
    private final Handler g = new Handler();
    private int h;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        this.h++;
    }

    public void onActivityStopped(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f14533a, false, 9063, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f14533a, false, 9063, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        this.h--;
        if (this.h == 0) {
            this.f14534b.a();
        }
    }

    public void onActivityPaused(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f14533a, false, 9062, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f14533a, false, 9062, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        this.f14535c--;
        this.g.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14539a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f14539a, false, 9065, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14539a, false, 9065, new Class[0], Void.TYPE);
                    return;
                }
                if (FloatWindowLifecycle.this.f14535c == 0) {
                    FloatWindowLifecycle.this.f14536d = true;
                    FloatWindowLifecycle.this.f14534b.a();
                }
            }
        }, 300);
    }

    public void onActivityResumed(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f14533a, false, 9061, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f14533a, false, 9061, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        this.f14535c++;
        if (PatchProxy.isSupport(new Object[]{activity}, this, f14533a, false, 9060, new Class[]{Activity.class}, Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, this, f14533a, false, 9060, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f14538f != null) {
            Class[] clsArr = this.f14538f;
            int length = clsArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    boolean z = this.f14537e;
                    break;
                } else if (clsArr[i].isInstance(activity)) {
                    boolean z2 = this.f14537e;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (this.f14536d) {
            this.f14536d = false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, this, f14533a, false, 9064, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent2}, this, f14533a, false, 9064, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(intent2.getStringExtra("reason"))) {
            this.f14534b.a();
        }
    }

    public FloatWindowLifecycle(Context context, boolean z, Class[] clsArr, c cVar) {
        this.f14537e = z;
        this.f14538f = clsArr;
        this.f14534b = cVar;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        context.registerReceiver(this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }
}
