package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.d.c;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75910a;

    public static boolean a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f75910a, true, 87902, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, null, f75910a, true, 87902, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (ToolUtils.isInstalledApp(context, str) || c(context, str)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean c(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f75910a, true, 87901, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f75910a, true, 87901, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || TextUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
                if (!CollectionUtils.isEmpty(installedPackages)) {
                    for (PackageInfo next : installedPackages) {
                        if (next != null && str2.equals(next.packageName)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static int b(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f75910a, true, 87904, new Class[]{Context.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f75910a, true, 87904, new Class[]{Context.class, String.class}, Integer.TYPE)).intValue();
        }
        String str3 = "";
        int i = -1;
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                if (packageInfo != null) {
                    i = packageInfo.versionCode;
                }
            } catch (Exception e2) {
                str3 = e2.getMessage();
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            com.ss.android.ugc.aweme.app.n.a("get_app_info", "", c.a().a("errorMsg", str3).b());
        }
        return i;
    }
}
