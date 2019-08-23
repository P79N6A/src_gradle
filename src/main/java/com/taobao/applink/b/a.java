package com.taobao.applink.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f79155a;

    /* renamed from: b  reason: collision with root package name */
    private static String f79156b;

    /* renamed from: c  reason: collision with root package name */
    private static String f79157c;

    public static String a(Context context) {
        if (TextUtils.isEmpty(f79155a)) {
            f79155a = context.getPackageName();
        }
        return f79155a;
    }

    public static String b(Context context) {
        if (TextUtils.isEmpty(f79156b)) {
            try {
                f79156b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
            } catch (Exception unused) {
            }
        }
        return f79156b;
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(f79157c) && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.taobao.taobao", 0);
                if (packageInfo != null) {
                    f79157c = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return f79157c;
    }
}
