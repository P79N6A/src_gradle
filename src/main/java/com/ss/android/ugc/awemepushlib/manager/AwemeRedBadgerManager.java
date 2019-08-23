package com.ss.android.ugc.awemepushlib.manager;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.newmedia.redbadge.e;
import com.ss.android.newmedia.redbadge.f;
import com.ss.android.ugc.awemepushlib.a.c;
import org.json.JSONObject;

public class AwemeRedBadgerManager implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77048a;

    /* renamed from: c  reason: collision with root package name */
    private static AwemeRedBadgerManager f77049c = new AwemeRedBadgerManager();

    /* renamed from: b  reason: collision with root package name */
    f f77050b = f.a();

    public static AwemeRedBadgerManager a() {
        return f77049c;
    }

    private static String a(Context context) {
        ResolveInfo resolveInfo;
        if (PatchProxy.isSupport(new Object[]{context}, null, f77048a, true, 90304, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f77048a, true, 90304, new Class[]{Context.class}, String.class);
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            return "";
        }
        return resolveInfo.activityInfo.packageName;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event event2 = event;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2}, this, f77048a, false, 90306, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2}, this, f77048a, false, 90306, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        if (event2 == Lifecycle.Event.ON_START) {
            a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f77051a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f77051a, false, 90308, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f77051a, false, 90308, new Class[0], Void.TYPE);
                        return;
                    }
                    AwemeRedBadgerManager.this.f77050b.a(com.ss.android.ugc.aweme.framework.e.a.a());
                }
            });
        }
    }

    private void a(Context context, int i) throws e {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f77048a, false, 90300, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f77048a, false, 90300, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f77050b.b(context2, i);
    }

    public final boolean a(Context context, c cVar) {
        String str;
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{context, cVar}, this, f77048a, false, 90301, new Class[]{Context.class, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, cVar}, this, f77048a, false, 90301, new Class[]{Context.class, c.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (1 != cVar.extra.redBadgeOnly || cVar.extra.badgeCount < 0) {
                if (cVar.extra.badgeCount >= 0) {
                    String str2 = "";
                    try {
                        a(context, cVar.extra.badgeCount);
                    } catch (e e2) {
                        str2 = Log.getStackTraceString(e2);
                        z2 = false;
                    }
                    a(context, cVar.extra.badgeCount, z2, str2, cVar);
                    b(context, cVar.extra.badgeCount, z2, str2, cVar);
                }
                return false;
            }
            a(context, cVar.extra.badgeCount);
            str = "";
            z = true;
            a(context, cVar.extra.badgeCount, z, str, cVar);
            b(context, cVar.extra.badgeCount, z, str, cVar);
            return true;
        } catch (e e3) {
            str = Log.getStackTraceString(e3);
            z = false;
        } catch (Throwable unused) {
        }
    }

    private void b(Context context, int i, boolean z, String str, c cVar) {
        String str2;
        int i2 = i;
        boolean z2 = z;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), str, cVar2}, this, f77048a, false, 90303, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, String.class, c.class}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z), str, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f77048a, false, 90303, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, String.class, c.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            try {
                com.ss.android.pushmanager.f.a().a(context, "umeng", "red_badge", "destop_red_badge", (long) i2, 0, new JSONObject());
            } catch (Throwable unused) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("badge_number", i2);
        bundle.putInt("success", z2 ? 1 : 0);
        if (!z2) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            bundle.putString("stack_info", str2);
        }
        String a2 = a(context);
        if (a2 == null) {
            a2 = "";
        }
        bundle.putString("launcher_package", a2);
        bundle.putString("show_type", "receive");
        long j = (long) cVar2.id;
        try {
            if (!StringUtils.isEmpty(cVar2.openUrl)) {
                Uri parse = Uri.parse(cVar2.openUrl);
                if (parse != null) {
                    long parseLong = Long.parseLong(parse.getQueryParameter("push_id"));
                    if (parseLong > 0) {
                        j = parseLong;
                    }
                }
            }
        } catch (NumberFormatException unused2) {
        }
        bundle.putLong("rule_id", j);
        AppLogNewUtils.onEventV3Bundle("red_badge_show", bundle);
    }

    private void a(Context context, int i, boolean z, String str, c cVar) {
        String str2;
        boolean z2 = z;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), str, cVar2}, this, f77048a, false, 90302, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, String.class, c.class}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z), str, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f77048a, false, 90302, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, String.class, c.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("success", z2 ? 1 : 0);
        if (!z2) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            bundle.putString("stack_info", str2);
        }
        String a2 = a(context);
        if (a2 == null) {
            a2 = "";
        }
        bundle.putString("launcher_package", a2);
        long j = (long) cVar2.id;
        try {
            if (!StringUtils.isEmpty(cVar2.openUrl)) {
                Uri parse = Uri.parse(cVar2.openUrl);
                if (parse != null) {
                    long parseLong = Long.parseLong(parse.getQueryParameter("push_id"));
                    if (parseLong > 0) {
                        j = parseLong;
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        bundle.putLong("rule_id", j);
        AppLogNewUtils.onEventV3Bundle("red_badge_receive", bundle);
    }
}
