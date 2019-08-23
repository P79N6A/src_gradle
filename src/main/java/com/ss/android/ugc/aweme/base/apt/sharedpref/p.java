package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.b;
import com.ss.android.ugc.aweme.q.c;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34601a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34602b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34603c = c.a(this.f34602b, "EditEffectConfig", 0);

    public p(Context context) {
        this.f34602b = context;
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{-1}, this, f34601a, false, 24220, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34603c.getInt("fallback_resource_version", -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{-1}, this, f34601a, false, 24220, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34601a, false, 24221, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34601a, false, 24221, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34603c.edit();
        edit.putInt("fallback_resource_version", i);
        edit.apply();
    }
}
