package com.ss.android.ugc.aweme.feed.h;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;

public final class ag extends b<af> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45471a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45472b;
    private String g = "";
    private Fragment h;

    public ag(Fragment fragment) {
        this.h = fragment;
    }

    public final boolean a(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45471a, false, 42099, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f45471a, false, 42099, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        this.f45472b = super.a(objArr);
        return this.f45472b;
    }
}
