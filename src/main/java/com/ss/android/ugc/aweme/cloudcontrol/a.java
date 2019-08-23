package com.ss.android.ugc.aweme.cloudcontrol;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.y;
import com.ss.android.ugc.aweme.utils.dt;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36202a = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f36203c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f36204d = false;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f36205e = true;

    /* renamed from: b  reason: collision with root package name */
    private int f36206b;

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f36202a, false, 27030, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f36202a, false, 27030, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (this.f36206b == 0) {
            f36203c = true;
            MonitorUtils.setIsBackGround(false);
        }
        this.f36206b++;
    }

    public final void onActivityStopped(Activity activity) {
        String str;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f36202a, false, 27032, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f36202a, false, 27032, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        this.f36206b--;
        if (this.f36206b == 0) {
            MonitorUtils.setIsBackGround(true);
            if (PatchProxy.isSupport(new Object[]{activity2}, null, dt.f75776a, true, 88548, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, dt.f75776a, true, 88548, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            try {
                y yVar = (y) c.a(activity2, y.class);
                if (yVar == null || !yVar.a()) {
                    Sensor defaultSensor = ((SensorManager) activity2.getSystemService("sensor")).getDefaultSensor(4);
                    d a2 = d.a();
                    if (defaultSensor == null) {
                        str = PushConstants.PUSH_TYPE_NOTIFY;
                    } else {
                        str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    }
                    r.a("sensor_info", aa.a(a2.a("has_gyroscope", str).f34114b));
                    if (yVar != null) {
                        yVar.a(true);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        String str;
        final String str2;
        boolean z;
        final Activity activity2 = activity;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f36202a, false, 27031, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f36202a, false, 27031, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (f36203c) {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27055, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27055, new Class[0], String.class);
            } else {
                str = com.ss.android.ugc.aweme.cloudcontrol.b.c.f36231b.getString("message", null);
            }
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27056, new Class[0], String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27056, new Class[0], String.class);
            } else {
                str2 = com.ss.android.ugc.aweme.cloudcontrol.b.c.f36231b.getString("uri", null);
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27058, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27058, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    int i = com.ss.android.ugc.aweme.cloudcontrol.b.c.f36231b.getInt("version", -1);
                    if (i == -1 || i == i.a().getUpdateVersionCode()) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27059, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27059, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (System.currentTimeMillis() >= com.ss.android.ugc.aweme.cloudcontrol.b.c.f36231b.getLong("time-end", 0)) {
                        z2 = false;
                    }
                    if (z2) {
                        if (f36204d || !com.ss.android.ugc.aweme.cloudcontrol.b.c.f36232c.booleanValue()) {
                            com.ss.android.a.a.a(activity).setTitle((int) C0906R.string.do6).setMessage((CharSequence) str).setPositiveButton((int) C0906R.string.b4h, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f36207a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36207a, false, 27033, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36207a, false, 27033, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    activity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                                }
                            }).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).show();
                            com.ss.android.ugc.aweme.cloudcontrol.b.c.a(Boolean.TRUE);
                        }
                        f36204d = false;
                        f36203c = false;
                    }
                }
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27057, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27057, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.cloudcontrol.b.c.f36231b.edit().clear().apply();
                }
            }
            f36204d = false;
            f36203c = false;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (f36205e) {
            f36205e = false;
            f36204d = true;
        }
    }
}
