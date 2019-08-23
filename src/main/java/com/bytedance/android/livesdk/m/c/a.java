package com.bytedance.android.livesdk.m.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16348a;

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public Intent a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16348a, false, 12655, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, this, f16348a, false, 12655, new Class[]{Context.class}, Intent.class);
        }
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
    }
}
