package com.bytedance.android.livesdk.m.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f16355b;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f16355b, false, 12663, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16355b, false, 12663, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT == 23) {
            return true;
        } else {
            return super.a();
        }
    }

    public final Intent a(Context context) {
        String str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f16355b, false, 12664, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, this, f16355b, false, 12664, new Class[]{Context.class}, Intent.class);
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        if (PatchProxy.isSupport(new Object[]{context2}, this, f16355b, false, 12665, new Class[]{Context.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{context2}, this, f16355b, false, 12665, new Class[]{Context.class}, String.class);
        } else {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                str = applicationInfo.nonLocalizedLabel.toString();
            } else {
                str = context2.getString(i);
            }
        }
        intent.putExtra("app_name", str);
        intent.putExtra("class_name", f.class.getSimpleName());
        return intent;
    }
}
