package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerifyAndLive;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;

public class SearchUserViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41908a;

    /* renamed from: b  reason: collision with root package name */
    private SearchUserViewHolder f41909b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41908a, false, 35946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41908a, false, 35946, new Class[0], Void.TYPE);
            return;
        }
        SearchUserViewHolder searchUserViewHolder = this.f41909b;
        if (searchUserViewHolder != null) {
            this.f41909b = null;
            searchUserViewHolder.mIvAvator = null;
            searchUserViewHolder.mLiveCircle = null;
            searchUserViewHolder.mBtnFollow = null;
            searchUserViewHolder.mTvUsername = null;
            searchUserViewHolder.mTvAwemeId = null;
            searchUserViewHolder.mTvFansCnt = null;
            searchUserViewHolder.mTvDesc = null;
            searchUserViewHolder.mTvRecommendReason = null;
            searchUserViewHolder.cardViewStub = null;
            searchUserViewHolder.mLiveTag = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SearchUserViewHolder_ViewBinding(SearchUserViewHolder searchUserViewHolder, View view) {
        this.f41909b = searchUserViewHolder;
        searchUserViewHolder.mIvAvator = (AvatarImageWithVerifyAndLive) Utils.findRequiredViewAsType(view, C0906R.id.ayr, "field 'mIvAvator'", AvatarImageWithVerifyAndLive.class);
        searchUserViewHolder.mLiveCircle = (LiveCircleView) Utils.findRequiredViewAsType(view, C0906R.id.awh, "field 'mLiveCircle'", LiveCircleView.class);
        searchUserViewHolder.mBtnFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, C0906R.id.o2, "field 'mBtnFollow'", FollowUserBtn.class);
        searchUserViewHolder.mTvUsername = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dli, "field 'mTvUsername'", TextView.class);
        searchUserViewHolder.mTvAwemeId = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d9c, "field 'mTvAwemeId'", TextView.class);
        searchUserViewHolder.mTvFansCnt = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dbm, "field 'mTvFansCnt'", TextView.class);
        searchUserViewHolder.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dau, "field 'mTvDesc'", TextView.class);
        searchUserViewHolder.mTvRecommendReason = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dh6, "field 'mTvRecommendReason'", TextView.class);
        searchUserViewHolder.cardViewStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cl3, "field 'cardViewStub'", ViewStub.class);
        searchUserViewHolder.mLiveTag = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.aqe, "field 'mLiveTag'", ImageView.class);
    }
}
