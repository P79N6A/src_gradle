package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bizactivity.m;
import com.ss.android.ugc.aweme.q.c;

public final class j implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34582a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34583b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34584c = c.a(this.f34583b, "IActivityStateSp", 0);

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34582a, false, 24162, new Class[0], Boolean.TYPE)) {
            return this.f34584c.getBoolean("hasClickH5Url", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34582a, false, 24162, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public j(Context context) {
        this.f34583b = context;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34582a, false, 24163, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34582a, false, 24163, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34584c.edit();
        edit.putBoolean("hasClickH5Url", z);
        edit.apply();
    }
}
