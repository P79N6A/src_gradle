package com.bytedance.android.livesdk.rank.fragment;

import com.bytedance.android.livesdk.rank.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class a implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16970a;

    /* renamed from: b  reason: collision with root package name */
    private final CurrentUserRankListFragment f16971b;

    a(CurrentUserRankListFragment currentUserRankListFragment) {
        this.f16971b = currentUserRankListFragment;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f16970a, false, 13016, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f16970a, false, 13016, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        b bVar = (b) obj;
        return (bVar == null || bVar.f17025b == null || !this.f16971b.a(bVar)) ? false : true;
    }
}
