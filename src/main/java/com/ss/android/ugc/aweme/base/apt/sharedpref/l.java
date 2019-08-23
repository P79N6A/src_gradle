package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.e;
import com.ss.android.ugc.aweme.q.c;

public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34589a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34590b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34591c = c.a(this.f34590b, "LoftSp", 0);

    public l(Context context) {
        this.f34590b = context;
    }

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34589a, false, 24201, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34591c.getBoolean("hasShowGuide", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34589a, false, 24201, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34589a, false, 24202, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34589a, false, 24202, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34591c.edit();
        edit.putBoolean("hasShowGuide", true);
        edit.apply();
    }
}
