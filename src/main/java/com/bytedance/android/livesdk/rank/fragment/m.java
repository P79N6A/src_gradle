package com.bytedance.android.livesdk.rank.fragment;

import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16994a;

    /* renamed from: b  reason: collision with root package name */
    private final UserRankListFragment f16995b;

    m(UserRankListFragment userRankListFragment) {
        this.f16995b = userRankListFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16994a, false, 13057, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16994a, false, 13057, new Class[]{View.class}, Void.TYPE);
            return;
        }
        UserRankListFragment userRankListFragment = this.f16995b;
        TTLiveSDKContext.getHostService().k().a(userRankListFragment.getContext(), i.a().a(ac.a((int) C0906R.string.csf)).a(0).d("live_detail").e("audience_list").c("live").a()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) userRankListFragment.A);
    }
}
