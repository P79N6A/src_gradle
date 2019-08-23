package com.bytedance.android.livesdk.rank.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16998a;

    /* renamed from: b  reason: collision with root package name */
    private final UserRankListFragment f16999b;

    o(UserRankListFragment userRankListFragment) {
        this.f16999b = userRankListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16998a, false, 13059, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16998a, false, 13059, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f16999b.b();
    }
}
