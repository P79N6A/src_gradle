package com.bytedance.android.livesdk.rank.fragment;

import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16972a;

    /* renamed from: b  reason: collision with root package name */
    private final CurrentUserRankListFragment f16973b;

    b(CurrentUserRankListFragment currentUserRankListFragment) {
        this.f16973b = currentUserRankListFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f16972a, false, 13017, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f16972a, false, 13017, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ((CurrentRankListResponse) this.f16973b.f16953b.f7871b).ranks = (List) obj;
    }
}
