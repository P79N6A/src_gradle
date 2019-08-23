package com.ss.android.ugc.aweme.zhima;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76951a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f76951a, true, 90156, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76951a, true, 90156, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (d.a().getCurUser() == null || d.a().getCurUser().getBindPhone() == null || !d.a().getCurUser().getBindPhone().isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f76951a, true, 90157, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f76951a, true, 90157, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        if (!CollectionUtils.isEmpty(packageManager.queryIntentActivities(intent, 64))) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f76951a, true, 90158, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f76951a, true, 90158, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!a(context)) {
            return false;
        } else {
            if ("live".equals(str2) && c.a().b()) {
                return true;
            }
            if ((!"commerce".equals(str2) || !c.a().c()) && !"other".equals(str2)) {
                return false;
            }
            return true;
        }
    }
}
