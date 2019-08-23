package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.b.a;
import com.ss.android.ugc.aweme.q.c;

public final class q implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34604a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34605b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34606c = c.a(this.f34605b, "OpenGps", 0);

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34604a, false, 24222, new Class[0], Boolean.TYPE)) {
            return this.f34606c.getBoolean("OpenGpsGuide", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34604a, false, 24222, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public q(Context context) {
        this.f34605b = context;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34604a, false, 24223, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34604a, false, 24223, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34606c.edit();
        edit.putBoolean("OpenGpsGuide", true);
        edit.apply();
    }
}
