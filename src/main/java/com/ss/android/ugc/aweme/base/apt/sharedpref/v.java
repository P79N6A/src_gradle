package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.b;
import com.ss.android.ugc.aweme.q.c;

public final class v implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34618a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34619b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34620c = c.a(this.f34619b, "DeviceSettingSp", 0);

    public v(Context context) {
        this.f34619b = context;
    }

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34618a, false, 24244, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34620c.getBoolean("support_douyidou", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34618a, false, 24244, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34618a, false, 24245, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34618a, false, 24245, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34620c.edit();
        edit.putBoolean("support_douyidou", z);
        edit.apply();
    }
}
