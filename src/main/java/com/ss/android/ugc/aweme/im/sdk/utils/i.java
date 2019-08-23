package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52597a;

    public static boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f52597a, true, 53378, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f52597a, true, 53378, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            context2.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f52597a, true, 53379, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f52597a, true, 53379, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            context2.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f52597a, true, 53377, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f52597a, true, 53377, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intent intent = null;
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") && Build.VERSION.SDK_INT <= 23) {
                if (PatchProxy.isSupport(new Object[]{context2}, null, f52597a, true, 53380, new Class[]{Context.class}, Intent.class)) {
                    intent = (Intent) PatchProxy.accessDispatch(new Object[]{context2}, null, f52597a, true, 53380, new Class[]{Context.class}, Intent.class);
                } else {
                    intent = new Intent();
                    intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
                    intent.putExtra("pkg_name", context.getPackageName());
                    intent.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
                    intent.putExtra("class_name", i.class.getName());
                    intent.addFlags(268435456);
                }
            } else if (TextUtils.equals(lowerCase, "huawei")) {
                if (PatchProxy.isSupport(new Object[0], null, f52597a, true, 53382, new Class[0], Intent.class)) {
                    intent = (Intent) PatchProxy.accessDispatch(new Object[0], null, f52597a, true, 53382, new Class[0], Intent.class);
                } else {
                    intent = new Intent();
                    intent.setFlags(268435456);
                    intent.putExtra("packageName", "com.ss.android.ugc.aweme.im.sdk");
                    intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                }
            } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                if (PatchProxy.isSupport(new Object[0], null, f52597a, true, 53383, new Class[0], Intent.class)) {
                    intent = (Intent) PatchProxy.accessDispatch(new Object[0], null, f52597a, true, 53383, new Class[0], Intent.class);
                } else {
                    intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                    intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                    intent.putExtra("extra_pkgname", "com.ss.android.ugc.aweme.im.sdk");
                }
            } else if (TextUtils.equals(lowerCase, "meizu")) {
                if (PatchProxy.isSupport(new Object[0], null, f52597a, true, 53381, new Class[0], Intent.class)) {
                    intent = (Intent) PatchProxy.accessDispatch(new Object[0], null, f52597a, true, 53381, new Class[0], Intent.class);
                } else {
                    intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.putExtra("packageName", "com.ss.android.ugc.aweme.im.sdk");
                }
            }
            if (intent != null) {
                context2.startActivity(intent);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
