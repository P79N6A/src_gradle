package com.ss.android.ugc.aweme.miniapp.b.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppBrandLogger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55516a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f55517b = "h";

    static void a(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, null, f55516a, true, 59296, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, null, f55516a, true, 59296, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        intent2.setAction("android.intent.action.MAIN");
        intent2.setClassName("com.android.settings", "com.android.settings.ManageApplications");
    }

    static void a(Intent intent, String str) {
        Intent intent2 = intent;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{intent2, str2}, null, f55516a, true, 59297, new Class[]{Intent.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, str2}, null, f55516a, true, 59297, new Class[]{Intent.class, String.class}, Void.TYPE);
            return;
        }
        intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent2.setData(Uri.parse("package://" + str2));
        intent2.putExtra("package", str2);
        intent2.setClassName("com.android.settings", "com.android.settings.applications.InstalledAppDetails");
    }

    @TargetApi(19)
    private static boolean b(Context context, String str) {
        String str2;
        Context context2 = context;
        String str3 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context2, str3}, null, f55516a, true, 59293, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3}, null, f55516a, true, 59293, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if ("android.permission.ACCESS_COARSE_LOCATION".equals(str3)) {
                str2 = "COARSE_LOCATION";
            } else if ("android.permission.ACCESS_FINE_LOCATION".equals(str3)) {
                str2 = "FINE_LOCATION";
            } else {
                str2 = str3.replaceFirst("android.permission.", "");
            }
            AppOpsManager appOpsManager = (AppOpsManager) context2.getSystemService("appops");
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            Class<AppOpsManager> cls = AppOpsManager.class;
            Field field = cls.getField("OP_" + str2);
            Method declaredMethod = cls.getDeclaredMethod("checkOp", new Class[]{Integer.TYPE, Integer.TYPE, String.class});
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(appOpsManager, new Object[]{Integer.valueOf(field.getInt(appOpsManager)), Integer.valueOf(packageInfo.applicationInfo.uid), packageInfo.packageName})).intValue();
            if (intValue == 2 || intValue == 1 || intValue == 4) {
                z = false;
            }
        } catch (Exception e2) {
            AppBrandLogger.e(f55517b, "权限检查出错时默认返回有权限，异常代码：", e2);
        }
        return z;
    }

    public static boolean a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f55516a, true, 59292, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f55516a, true, 59292, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 19) {
            return b(context, str);
        } else {
            if (PatchProxy.isSupport(new Object[]{context, str2}, null, f55516a, true, 59294, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f55516a, true, 59294, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
            } else if (context.getPackageManager().checkPermission(str2, context.getPackageName()) == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    static boolean a(Intent intent, Activity activity) {
        Intent intent2 = intent;
        Activity activity2 = activity;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{intent2, activity2}, null, f55516a, true, 59298, new Class[]{Intent.class, Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2, activity2}, null, f55516a, true, 59298, new Class[]{Intent.class, Activity.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            activity2.startActivity(intent2);
            z = true;
        } catch (ActivityNotFoundException unused) {
        }
        return z;
    }
}
