package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.b;
import com.ss.android.ugc.aweme.q.c;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34577a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34578b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34579c = c.a(this.f34578b, "TeenageModeSetting", 0);

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34577a, false, 24158, new Class[0], String.class)) {
            return this.f34579c.getString("teenage_mode_setting", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34577a, false, 24158, new Class[0], String.class);
    }

    public h(Context context) {
        this.f34578b = context;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34577a, false, 24159, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34577a, false, 24159, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34579c.edit();
        edit.putString("teenage_mode_setting", str2);
        edit.apply();
    }
}
