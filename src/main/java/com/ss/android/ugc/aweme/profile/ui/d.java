package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.presenter.b;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62621a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeListFragment f62622b;

    d(AwemeListFragment awemeListFragment) {
        this.f62622b = awemeListFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62621a, false, 67807, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62621a, false, 67807, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        AwemeListFragment awemeListFragment = this.f62622b;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (CollectionUtils.isEmpty(feedItemList.items)) {
            awemeListFragment.x();
            return;
        }
        ((b) awemeListFragment.p.i()).a(feedItemList);
        if (NetworkUtils.isNetworkAvailable(awemeListFragment.getActivity())) {
            awemeListFragment.x();
        }
    }
}
