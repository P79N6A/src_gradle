package com.ss.android.ugc.aweme.effect;

import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43748a;

    /* renamed from: b  reason: collision with root package name */
    public static final n f43749b = new i();

    private i() {
    }

    public final boolean apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f43748a, false, 38562, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((String) obj) != null;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f43748a, false, 38562, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
