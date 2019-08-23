package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.hitrank.e;
import com.ss.android.ugc.aweme.q.c;

public final class n implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34595a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34596b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34597c = c.a(this.f34596b, "RankSp", 0);

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34595a, false, 24215, new Class[0], Boolean.TYPE)) {
            return this.f34597c.getBoolean("hasShowToast", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34595a, false, 24215, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public n(Context context) {
        this.f34596b = context;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f34595a, false, 24216, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f34595a, false, 24216, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34597c.edit();
        edit.putBoolean("hasShowToast", true);
        edit.apply();
    }
}
