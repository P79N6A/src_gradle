package com.ss.android.ugc.aweme.feed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedTimeLineFragment;
import com.ss.android.ugc.aweme.feed.ui.RecommendCellFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.StubFragment;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44638a;

    public static Fragment a(@Constants.FeedListType int i, String str) {
        Fragment fragment;
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f44638a, true, 40142, new Class[]{Integer.TYPE, String.class}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f44638a, true, 40142, new Class[]{Integer.TYPE, String.class}, Fragment.class);
        }
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", i2);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str2);
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f44638a, true, 40141, new Class[]{Integer.TYPE}, Fragment.class)) {
            switch (i2) {
                case 1:
                    fragment = new FeedFollowFragment();
                    break;
                case 2:
                    fragment = new FeedTimeLineFragment();
                    break;
                case e.l:
                    fragment = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getNearbyFragment();
                    break;
                case 8:
                    fragment = new StubFragment();
                    break;
                case 11:
                    fragment = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getPoiTypeFeedsFragment();
                    break;
                default:
                    if (AbTestManager.a().v() == 0) {
                        fragment = new FeedRecommendFragment();
                        break;
                    } else {
                        fragment = new RecommendCellFragment();
                        break;
                    }
            }
        } else {
            fragment = (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f44638a, true, 40141, new Class[]{Integer.TYPE}, Fragment.class);
        }
        fragment.setArguments(bundle);
        return fragment;
    }
}
