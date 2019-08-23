package com.ss.android.ugc.aweme.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.q.c;
import java.util.Locale;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75433a;

    /* renamed from: b  reason: collision with root package name */
    private static Resources f75434b;

    public static String a(Context context, @IdRes int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f75433a, true, 87801, new Class[]{Context.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f75433a, true, 87801, new Class[]{Context.class, Integer.TYPE}, String.class);
        }
        Resources a2 = a(context.getApplicationContext().getPackageManager(), context.getPackageName(), new Locale("zh", "CN"));
        if (a2 == null) {
            return "";
        }
        try {
            return a2.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(String str, Context context) {
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, null, f75433a, true, 87800, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context2}, null, f75433a, true, 87800, new Class[]{String.class, Context.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            AwemeAppData.p().f(str2);
            c.a(context2, "test_data", 0).edit().putString("host", str2).apply();
            a.c(context.getApplicationContext(), (int) C0906R.string.abu).a();
        } else {
            AwemeAppData.p().f("");
            c.a(context2, "test_data", 0).edit().putString("host", "").apply();
            a.c(context.getApplicationContext(), (int) C0906R.string.abr).a();
        }
    }

    public static boolean a(String str, Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{str, activity2}, null, f75433a, true, 87798, new Class[]{String.class, Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, activity2}, null, f75433a, true, 87798, new Class[]{String.class, Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.g.a.a()) {
            return false;
        } else {
            try {
                Uri parse = Uri.parse(str);
                if (10304 == parse.getPort() && "/bytedance/log/".equals(parse.getPath())) {
                    a(parse.getHost() + ":" + parse.getPort(), (Context) activity2);
                    activity.finish();
                    return true;
                } else if (!TextUtils.equals("/aweme/commercialize/debug/start_app_log_verify_client", parse.getPath()) || !d.a(activity)) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
    }

    private static Resources a(PackageManager packageManager, String str, Locale locale) {
        Locale locale2 = locale;
        if (PatchProxy.isSupport(new Object[]{packageManager, str, locale2}, null, f75433a, true, 87802, new Class[]{PackageManager.class, String.class, Locale.class}, Resources.class)) {
            return (Resources) PatchProxy.accessDispatch(new Object[]{packageManager, str, locale2}, null, f75433a, true, 87802, new Class[]{PackageManager.class, String.class, Locale.class}, Resources.class);
        }
        try {
            Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
            f75434b = resourcesForApplication;
            if (PatchProxy.isSupport(new Object[]{resourcesForApplication, locale2}, null, f75433a, true, 87803, new Class[]{Resources.class, Locale.class}, Void.TYPE)) {
                Object[] objArr = {resourcesForApplication, locale2};
                PatchProxy.accessDispatch(objArr, null, f75433a, true, 87803, new Class[]{Resources.class, Locale.class}, Void.TYPE);
            } else {
                Configuration configuration = resourcesForApplication.getConfiguration();
                configuration.locale = locale2;
                resourcesForApplication.updateConfiguration(configuration, null);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return f75434b;
    }
}
