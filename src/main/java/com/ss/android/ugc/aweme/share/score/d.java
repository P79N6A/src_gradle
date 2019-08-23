package com.ss.android.ugc.aweme.share.score;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65268a;

    /* renamed from: b  reason: collision with root package name */
    static String[] f65269b = {"com.oppo.market", "com.tencent.android.qqdownloader", "com.qihoo.appstore", "com.wandoujia.phoenix2", "com.baidu.appsearch", "com.sogou.androidtool", "com.huawei.appmarket", "com.bbk.appstore", "com.xiaomi.market", "com.meizu.mstore", "com.sec.android.app.samsungapps", "com.yingyonghui.market", "cn.goapk.market"};

    static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f65268a, true, 73679, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f65268a, true, 73679, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "samsung");
    }

    static boolean a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f65268a, true, 73680, new Class[]{Context.class}, Boolean.TYPE)) {
            return a("com.sec.android.app.samsungapps", context.getPackageManager());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f65268a, true, 73680, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    static Intent b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f65268a, true, 73681, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, null, f65268a, true, 73681, new Class[]{Context.class}, Intent.class);
        }
        Uri parse = Uri.parse("http://www.samsungapps.com/appquery/appDetail.as?appId=" + context.getPackageName());
        Intent intent = new Intent();
        intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
        intent.setData(parse);
        return intent;
    }

    private static boolean a(String str, PackageManager packageManager) {
        String str2 = str;
        PackageManager packageManager2 = packageManager;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str2, packageManager2}, null, f65268a, true, 73682, new Class[]{String.class, PackageManager.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, packageManager2}, null, f65268a, true, 73682, new Class[]{String.class, PackageManager.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            packageManager2.getPackageInfo(str2, 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z;
    }
}
