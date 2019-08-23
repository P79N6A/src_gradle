package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52580a;

    public static String a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f52580a, true, 53326, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f52580a, true, 53326, new Class[]{Context.class}, String.class);
        }
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f52580a, true, 53327, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f52580a, true, 53327, new Class[]{Context.class}, String.class);
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
