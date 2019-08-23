package com.bytedance.android.livesdk.rank.fragment;

import com.bytedance.android.livesdk.rank.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class d implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16976a;

    /* renamed from: b  reason: collision with root package name */
    private final PeriodUserRankListFragment f16977b;

    d(PeriodUserRankListFragment periodUserRankListFragment) {
        this.f16977b = periodUserRankListFragment;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f16976a, false, 13026, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f16976a, false, 13026, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        b bVar = (b) obj;
        return (bVar == null || bVar.f17025b == null || !this.f16977b.a(bVar)) ? false : true;
    }
}
