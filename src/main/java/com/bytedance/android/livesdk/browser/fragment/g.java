package com.bytedance.android.livesdk.browser.fragment;

import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.base.model.user.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class g implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9382a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f9383b = new g();

    private g() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f9382a, false, 3541, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((l) obj).f7776a == i.a.Login;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f9382a, false, 3541, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
