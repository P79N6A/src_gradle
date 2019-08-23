package com.ss.android.ugc.aweme.hotsearch.b;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.discover.api.HotSearchListAPI;
import com.ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a<Aweme, HotVideoListResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49674a;

    /* renamed from: b  reason: collision with root package name */
    public int f49675b = 0;

    /* renamed from: c  reason: collision with root package name */
    public List<Aweme> f49676c = new ArrayList();

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean isHasMore() {
        return false;
    }

    public final void loadMoreList(Object... objArr) {
    }

    public final List<Aweme> getItems() {
        return this.f49676c;
    }

    public b() {
    }

    public b(int i) {
    }

    public final void refreshList(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f49674a, false, 49718, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f49674a, false, 49718, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49677a;

            public final /* synthetic */ Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f49677a, false, 49722, new Class[0], HotVideoListResponse.class)) {
                    return (HotVideoListResponse) PatchProxy.accessDispatch(new Object[0], this, f49677a, false, 49722, new Class[0], HotVideoListResponse.class);
                }
                if (objArr.length > 1) {
                    b.this.f49675b = ((Integer) objArr[1]).intValue();
                }
                if (b.this.f49675b == 1) {
                    return HotSearchListAPI.b();
                }
                return HotSearchListAPI.a();
            }
        }, 0);
    }

    /* renamed from: a */
    public final void handleData(HotVideoListResponse hotVideoListResponse) {
        HotSearchInfo hotSearchInfo;
        if (PatchProxy.isSupport(new Object[]{hotVideoListResponse}, this, f49674a, false, 49720, new Class[]{HotVideoListResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotVideoListResponse}, this, f49674a, false, 49720, new Class[]{HotVideoListResponse.class}, Void.TYPE);
            return;
        }
        this.f49676c.clear();
        if (hotVideoListResponse != null) {
            List<HotVideoItem> list = hotVideoListResponse.mHotVideoItemList;
            if (!CollectionUtils.isEmpty(list)) {
                for (int i = 0; i < list.size(); i++) {
                    HotVideoItem hotVideoItem = list.get(i);
                    if (hotVideoItem != null) {
                        Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(hotVideoItem.getAweme());
                        if (a2 != null) {
                            if (this.f49675b == 0) {
                                String hotValue = hotVideoItem.getHotValue();
                                if (a2.getHotSearchInfo() == null) {
                                    hotSearchInfo = new HotSearchInfo();
                                } else {
                                    hotSearchInfo = a2.getHotSearchInfo();
                                }
                                hotSearchInfo.setVideoRank(i + 1);
                                hotSearchInfo.setVideoRankVV(Long.valueOf(hotValue).longValue());
                                a2.setHotSearchInfo(hotSearchInfo);
                                a2 = com.ss.android.ugc.aweme.feed.a.a().a(a2);
                            }
                            this.f49676c.add(a2);
                            hotVideoItem.setAweme(a2);
                            list.set(i, hotVideoItem);
                        }
                    }
                }
                hotVideoListResponse.mHotVideoItemList = list;
            }
        }
        super.handleData(hotVideoListResponse);
    }
}
