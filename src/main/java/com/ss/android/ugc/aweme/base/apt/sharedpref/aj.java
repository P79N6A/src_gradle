package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d;

public final class aj implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34556a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34557b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34558c = c.a(this.f34557b, "AudioEffect", 0);

    public aj(Context context) {
        this.f34557b = context;
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34556a, false, 24406, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34558c.getInt("resource_version", i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34556a, false, 24406, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34556a, false, 24407, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34556a, false, 24407, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34558c.edit();
        edit.putInt("resource_version", i);
        edit.apply();
    }
}
