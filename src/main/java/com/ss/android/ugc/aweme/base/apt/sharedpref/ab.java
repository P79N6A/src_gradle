package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.notification.c.d;
import com.ss.android.ugc.aweme.q.c;

public final class ab implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34532a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34533b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34534c = c.a(this.f34533b, "IMPreferences", 0);

    public ab(Context context) {
        this.f34533b = context;
    }

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f34532a, false, 24336, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f34534c.getBoolean("stick_game_assistant", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f34532a, false, 24336, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34532a, false, 24337, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34532a, false, 24337, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34534c.edit();
        edit.putBoolean("stick_game_assistant", z);
        edit.apply();
    }
}
