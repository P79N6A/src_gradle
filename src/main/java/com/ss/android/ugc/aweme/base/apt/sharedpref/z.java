package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.u.y;

public final class z implements y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34630a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34631b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34632c = c.a(this.f34631b, "MetricsEventPreference", 0);

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34630a, false, 24332, new Class[0], Boolean.TYPE)) {
            return this.f34632c.getBoolean("hasReportSensorInfo", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34630a, false, 24332, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public z(Context context) {
        this.f34631b = context;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34630a, false, 24333, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34630a, false, 24333, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34632c.edit();
        edit.putBoolean("hasReportSensorInfo", true);
        edit.apply();
    }
}
