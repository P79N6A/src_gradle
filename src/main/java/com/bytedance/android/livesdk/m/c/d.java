package com.bytedance.android.livesdk.m.c;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f16350b;

    public final boolean a() {
        return true;
    }

    public final Intent a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16350b, false, 12658, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, this, f16350b, false, 12658, new Class[]{Context.class}, Intent.class);
        }
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
        return intent;
    }
}
