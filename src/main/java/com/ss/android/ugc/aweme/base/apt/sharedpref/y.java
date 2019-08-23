package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.guide.c;

public final class y implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34627a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34628b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34629c = com.ss.android.ugc.aweme.q.c.a(this.f34628b, "IVVSp", 0);

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34627a, false, 24330, new Class[0], String.class)) {
            return this.f34629c.getString("vvCountInfoCurrentDay", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34627a, false, 24330, new Class[0], String.class);
    }

    public y(Context context) {
        this.f34628b = context;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34627a, false, 24331, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34627a, false, 24331, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34629c.edit();
        edit.putString("vvCountInfoCurrentDay", str2);
        edit.apply();
    }
}
