package com.taobao.applink.util;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TBAppLinkUtil {
    private static Application sApplication;

    public static synchronized Application getApplication() {
        Application application;
        synchronized (TBAppLinkUtil.class) {
            if (sApplication == null) {
                sApplication = getSystemApp();
            }
            application = sApplication;
        }
        return application;
    }

    public static String getClientUrl() {
        return String.format("https://wgo.mmstat.com/%s", new Object[]{"minitrade.1.200.1"});
    }

    public static String getConfigUrl() {
        return String.format("https://wgo.mmstat.com/%s", new Object[]{"minitrade.1.200.2"});
    }

    public static String getCrashUrl() {
        return String.format("https://wgo.mmstat.com/%s", new Object[]{"minitrade.1.200.3"});
    }

    public static String getNoneClientUrl() {
        return String.format("https://wgo.mmstat.com/%s", new Object[]{"minitrade.1.200.4"});
    }

    public static String getPackageName(String str) {
        String str2 = "com.taobao.taobao";
        if ("taobao_scheme".equals(str)) {
            return str2;
        }
        if ("tmall_scheme".equals(str)) {
            str2 = "com.tmall.wireless";
        }
        return str2;
    }

    public static String getServerAction(String str) {
        String str2 = "com.taobao.open.intent.action.AUTH";
        if ("taobao_scheme".equals(str)) {
            return str2;
        }
        if ("tmall_scheme".equals(str)) {
            str2 = "com.tmall.wireless.intent.action.AUTH";
        }
        return str2;
    }

    private static Application getSystemApp() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isSupportAppLinkSDK(Context context, String str) {
        boolean isSupportTaobao = isSupportTaobao(context);
        if ("taobao_scheme".equals(str)) {
            return isSupportTaobao;
        }
        if ("tmall_scheme".equals(str)) {
            isSupportTaobao = isSupportTmall(context);
            if (!isSupportTaobao) {
                isSupportTaobao = isSupportTaobao(context);
            }
        }
        return isSupportTaobao;
    }

    private static boolean isSupportTaobao(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        Uri parse = Uri.parse("tbopen://m.taobao.com/tbopen/index.html?");
        intent.setAction("com.taobao.open.intent.action.GETWAY");
        intent.setData(parse);
        try {
            if (packageManager.getPackageInfo("com.taobao.taobao", 0) != null && packageManager.queryIntentActivities(intent, 65536).size() > 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean isSupportTmall(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("com.tmall.wireless.intent.action.APPLINK");
        intent.setData(Uri.parse("tmall://page.tm/appLink?"));
        try {
            if (packageManager.getPackageInfo("com.tmall.wireless", 0) != null && packageManager.queryIntentActivities(intent, 65536).size() > 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void setApplication(Context context) {
        if (sApplication == null) {
            sApplication = (Application) context.getApplicationContext();
        }
    }
}
