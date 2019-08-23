package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.ies.uikit.util.IESUIUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.update.m;
import com.ss.android.ugc.aweme.utils.bl;
import java.io.File;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

public final class d extends c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52975a;

    /* renamed from: f  reason: collision with root package name */
    private static volatile d f52976f;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<Activity> f52977b;

    /* renamed from: e  reason: collision with root package name */
    AlertDialog f52978e;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    private d(c cVar) {
        super(cVar);
        k.a().registerActivityLifecycleCallbacks(this);
        if (a.b().a() != null) {
            this.f52977b = new WeakReference<>(a.b().a());
        }
    }

    public final void onActivityResumed(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f52975a, false, 55019, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f52975a, false, 55019, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        this.f52977b = new WeakReference<>(activity2);
    }

    public static d a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f52975a, true, 55017, new Class[]{c.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f52975a, true, 55017, new Class[]{c.class}, d.class);
        }
        if (f52976f == null) {
            synchronized (d.class) {
                if (f52976f == null) {
                    f52976f = new d(cVar2);
                }
            }
        }
        return f52976f;
    }

    /* access modifiers changed from: package-private */
    @NotNull
    public final c.a a(e eVar, Request request, SsResponse ssResponse) {
        boolean z;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, request, ssResponse}, this, f52975a, false, 55020, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{eVar2, request, ssResponse}, this, f52975a, false, 55020, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f52975a, false, 55018, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52975a, false, 55018, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (this.f52977b != null) {
                Activity activity = (Activity) this.f52977b.get();
                if (activity != null && !(activity instanceof SplashActivity) && (activity instanceof AbsActivity) && ((AbsActivity) activity).isActive() && (this.f52978e == null || !this.f52978e.isShowing())) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z || eVar2.f52987a.f52989a != 10 || TextUtils.isEmpty(eVar2.f52987a.f52990b)) {
            return b.f52968b;
        }
        final String str = eVar2.f52987a.f52990b;
        if (PatchProxy.isSupport(new Object[]{str}, this, f52975a, false, 55021, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52975a, false, 55021, new Class[]{String.class}, Void.TYPE);
        } else {
            final Activity activity2 = (Activity) this.f52977b.get();
            activity2.runOnUiThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52979a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f52979a, false, 55022, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f52979a, false, 55022, new Class[0], Void.TYPE);
                        return;
                    }
                    if (d.this.f52978e == null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                        builder.setMessage((CharSequence) str).setPositiveButton((int) C0906R.string.ahb, (DialogInterface.OnClickListener) null).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f52983a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52983a, false, 55023, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52983a, false, 55023, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                com.ss.android.common.lib.a.a(activity2, "force_update_popup", "cancel");
                                LocalBroadcastManager.getInstance(activity2).sendBroadcast(new Intent("com.ss.android.common.app.action.exit_app"));
                                d.this.f52978e = null;
                            }
                        });
                        d.this.f52978e = builder.create();
                        d.this.f52978e.setCancelable(false);
                    }
                    if (d.this.f52978e != null) {
                        com.ss.android.common.lib.a.a(activity2, "force_update_popup", "show");
                        d.this.f52978e.show();
                        d.this.f52978e.getButton(-1).setOnClickListener(new View.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f52985a;

                            public final void onClick(View view) {
                                if (PatchProxy.isSupport(new Object[]{view}, this, f52985a, false, 55024, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view}, this, f52985a, false, 55024, new Class[]{View.class}, Void.TYPE);
                                    return;
                                }
                                ClickInstrumentation.onClick(view);
                                com.ss.android.common.lib.a.a(activity2, "force_update_popup", "confirm");
                                m a2 = m.a();
                                a2.b();
                                File q = a2.q();
                                if (q != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setDataAndType(bl.a(activity2, q), "application/vnd.android.package-archive");
                                    activity2.startActivity(intent);
                                    return;
                                }
                                a2.v();
                                IESUIUtils.displayToast((Context) activity2, (int) C0906R.string.aha);
                            }
                        });
                    }
                }
            });
        }
        return new c.a(true, false);
    }
}
