package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.setting.j;

public final class af implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34544a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34545b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34546c = c.a(this.f34545b, "Player", 0);

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34544a, false, 24394, new Class[0], Integer.TYPE)) {
            return this.f34546c.getInt("testPlayerType", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34544a, false, 24394, new Class[0], Integer.TYPE)).intValue();
    }

    public af(Context context) {
        this.f34545b = context;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34544a, false, 24395, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34544a, false, 24395, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34546c.edit();
        edit.putInt("testPlayerType", i);
        edit.apply();
    }
}
