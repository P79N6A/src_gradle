package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.live.base.model.user.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class m implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14499a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f14500b = new m();

    private m() {
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14499a, false, 9016, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f14499a, false, 9016, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        i.a aVar = (i.a) obj;
        return aVar == i.a.Login || aVar == i.a.Logout;
    }
}
