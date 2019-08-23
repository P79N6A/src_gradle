package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.k;
import com.ss.android.ugc.aweme.q.c;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34575a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34576b;

    public g(Context context) {
        this.f34576b = context;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34575a, false, 24154, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34575a, false, 24154, new Class[]{String.class}, Void.TYPE);
            return;
        }
        e.a(null, c.a(this.f34576b, "LoginSharePreferences", 0), "latest_login_info", "java.lang.String", new Object[]{str});
    }

    public final String b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34575a, false, 24155, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f34575a, false, 24155, new Class[]{String.class}, String.class);
        }
        return (String) e.a(null, null, c.a(this.f34576b, "LoginSharePreferences", 0), "latest_login_info", "java.lang.String", "java.lang.String", new Object[]{str});
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34575a, false, 24156, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34575a, false, 24156, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e.a(null, c.a(this.f34576b, "LoginSharePreferences", 0), "save_login_info", "boolean", new Object[]{Boolean.valueOf(z)});
    }

    public final boolean b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34575a, false, 24157, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34575a, false, 24157, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return ((Boolean) e.a(null, null, c.a(this.f34576b, "LoginSharePreferences", 0), "save_login_info", "boolean", "boolean", new Object[]{Boolean.TRUE})).booleanValue();
    }
}
