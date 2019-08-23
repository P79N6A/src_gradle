package com.bytedance.android.livesdk.rank.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16992a;

    /* renamed from: b  reason: collision with root package name */
    private final UserRankListFragment f16993b;

    l(UserRankListFragment userRankListFragment) {
        this.f16993b = userRankListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16992a, false, 13056, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16992a, false, 13056, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f16993b.f();
    }
}
