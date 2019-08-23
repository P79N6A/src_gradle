package com.ss.android.ugc.aweme.utils;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class cx {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75713a;

    public static void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f75713a, true, 88454, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f75713a, true, 88454, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null && !c(context)) {
            d(context);
        }
    }

    private static boolean c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75713a, true, 88456, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75713a, true, 88456, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            if (!a(intent, context2)) {
                return false;
            }
            context2.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean d(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75713a, true, 88457, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75713a, true, 88457, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!a(intent, context2)) {
                return false;
            }
            context2.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @TargetApi(19)
    public static int a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75713a, true, 88453, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f75713a, true, 88453, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context2 == null) {
            return -1;
        } else {
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Reflect on = Reflect.on((Object) (AppOpsManager) context2.getSystemService("appops"));
                int intValue = ((Integer) on.field("OP_POST_NOTIFICATION", Integer.TYPE).get()).intValue();
                if (((Integer) on.call("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(intValue), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                    return 1;
                }
                return 0;
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    private static boolean a(Intent intent, Context context) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, context}, null, f75713a, true, 88458, new Class[]{Intent.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2, context}, null, f75713a, true, 88458, new Class[]{Intent.class, Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null) {
            return false;
        } else {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            return true;
        }
    }
}
