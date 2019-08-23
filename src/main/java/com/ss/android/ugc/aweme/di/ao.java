package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dagger.android.a;

public final /* synthetic */ class ao implements a.C0872a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41407a;

    /* renamed from: b  reason: collision with root package name */
    static final a.C0872a f41408b = new ao();

    private ao() {
    }

    public final a a(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f41407a, false, 35322, new Class[]{Object.class}, a.class)) {
            return null;
        }
        return (a) PatchProxy.accessDispatch(new Object[]{obj}, this, f41407a, false, 35322, new Class[]{Object.class}, a.class);
    }
}
