package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.r.a;

public final class t implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34612a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34613b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34614c = c.a(this.f34613b, "LeakDetectorSp", 0);

    public t(Context context) {
        this.f34613b = context;
    }

    public final Boolean a(Boolean bool) {
        if (!PatchProxy.isSupport(new Object[]{bool}, this, f34612a, false, 24232, new Class[]{Boolean.class}, Boolean.class)) {
            return Boolean.valueOf(this.f34614c.getBoolean("open_leak_detector_on_local_test", bool.booleanValue()));
        }
        return (Boolean) PatchProxy.accessDispatch(new Object[]{bool}, this, f34612a, false, 24232, new Class[]{Boolean.class}, Boolean.class);
    }

    public final void b(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, f34612a, false, 24233, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, f34612a, false, 24233, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34614c.edit();
        edit.putBoolean("open_leak_detector_on_local_test", bool.booleanValue());
        edit.apply();
    }
}
