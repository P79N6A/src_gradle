package com.bytedance.android.livesdk.m.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f16349b;

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f16349b, false, 12656, new Class[0], Boolean.TYPE)) {
            return super.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16349b, false, 12656, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final Intent a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16349b, false, 12657, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, this, f16349b, false, 12657, new Class[]{Context.class}, Intent.class);
        }
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
        return intent;
    }
}
