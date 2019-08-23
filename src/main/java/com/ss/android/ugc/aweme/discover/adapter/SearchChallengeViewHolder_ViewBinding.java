package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SearchChallengeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41791a;

    /* renamed from: b  reason: collision with root package name */
    private SearchChallengeViewHolder f41792b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41791a, false, 35782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41791a, false, 35782, new Class[0], Void.TYPE);
            return;
        }
        SearchChallengeViewHolder searchChallengeViewHolder = this.f41792b;
        if (searchChallengeViewHolder != null) {
            this.f41792b = null;
            searchChallengeViewHolder.mTvChallengeName = null;
            searchChallengeViewHolder.mTvPartCnt = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SearchChallengeViewHolder_ViewBinding(SearchChallengeViewHolder searchChallengeViewHolder, View view) {
        this.f41792b = searchChallengeViewHolder;
        searchChallengeViewHolder.mTvChallengeName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d_1, "field 'mTvChallengeName'", TextView.class);
        searchChallengeViewHolder.mTvPartCnt = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfu, "field 'mTvPartCnt'", TextView.class);
    }
}
