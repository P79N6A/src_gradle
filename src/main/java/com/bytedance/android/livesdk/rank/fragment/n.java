package com.bytedance.android.livesdk.rank.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16996a;

    /* renamed from: b  reason: collision with root package name */
    private final UserRankListFragment f16997b;

    n(UserRankListFragment userRankListFragment) {
        this.f16997b = userRankListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16996a, false, 13058, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16996a, false, 13058, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f16997b.e();
    }
}
