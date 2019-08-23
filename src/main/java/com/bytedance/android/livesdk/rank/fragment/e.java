package com.bytedance.android.livesdk.rank.fragment;

import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16978a;

    /* renamed from: b  reason: collision with root package name */
    private final PeriodUserRankListFragment f16979b;

    e(PeriodUserRankListFragment periodUserRankListFragment) {
        this.f16979b = periodUserRankListFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f16978a, false, 13027, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f16978a, false, 13027, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ((CurrentRankListResponse) this.f16979b.f16955b.f7871b).ranks = (List) obj;
    }
}
