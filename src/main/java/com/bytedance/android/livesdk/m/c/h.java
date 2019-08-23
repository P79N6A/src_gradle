package com.bytedance.android.livesdk.m.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f16357b;

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f16357b, false, 12668, new Class[0], Boolean.TYPE)) {
            return super.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16357b, false, 12668, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final Intent a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16357b, false, 12669, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, this, f16357b, false, 12669, new Class[]{Context.class}, Intent.class);
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }
}
