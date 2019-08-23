package com.ss.android.ugc.aweme.challenge.model.mixfeed;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.newfollow.a.b;
import java.util.Iterator;
import java.util.List;

public class ChallengeMixFeedModel extends a<ChallengeMixFeed, ChallengeMixFeedList> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<ChallengeMixFeed> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeMixFeedList) this.mData).mItems;
    }

    public boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 25850, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 25850, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((ChallengeMixFeedList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    static final /* synthetic */ ChallengeMixFeedList lambda$loadChallengeMixFeedList$0$ChallengeMixFeedModel(i iVar) throws Exception {
        if (iVar.c()) {
            return null;
        }
        if (!iVar.d()) {
            return (ChallengeMixFeedList) iVar.e();
        }
        throw iVar.f();
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 25846, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 25846, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        loadChallengeMixFeedList(2, objArr[1].intValue(), objArr[2], objArr[3].booleanValue());
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 25845, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 25845, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        loadChallengeMixFeedList(1, objArr[1].intValue(), objArr[2], objArr[3].booleanValue());
    }

    public void handleData(ChallengeMixFeedList challengeMixFeedList) {
        boolean z;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{challengeMixFeedList}, this, changeQuickRedirect, false, 25849, new Class[]{ChallengeMixFeedList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeMixFeedList}, this, changeQuickRedirect, false, 25849, new Class[]{ChallengeMixFeedList.class}, Void.TYPE);
            return;
        }
        if (challengeMixFeedList == null || CollectionUtils.isEmpty(challengeMixFeedList.mItems)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((ChallengeMixFeedList) this.mData).mItems.clear();
            }
            int size = challengeMixFeedList.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                ChallengeMixFeed challengeMixFeed = challengeMixFeedList.mItems.get(i2);
                if (challengeMixFeed != null && challengeMixFeed.getFeedType() == 65280) {
                    Aweme aweme = challengeMixFeed.getAweme();
                    if (b.i(aweme)) {
                        Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(aweme);
                        com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                        a3.a(a2.getAid() + 9, challengeMixFeedList.getRequestId(), i2);
                        challengeMixFeed.setAweme(a2);
                        challengeMixFeedList.mItems.set(i2, challengeMixFeed);
                        if (a2.getAwemeType() == 13) {
                            Aweme forwardItem = a2.getForwardItem();
                            if (forwardItem != null) {
                                forwardItem.setRepostFromGroupId(a2.getAid());
                                forwardItem.setRepostFromUserId(a2.getAuthorUid());
                                Aweme a4 = com.ss.android.ugc.aweme.feed.a.a().a(forwardItem);
                                com.ss.android.ugc.aweme.feed.a a5 = com.ss.android.ugc.aweme.feed.a.a();
                                a5.a(a4.getAid() + 1, challengeMixFeedList.getRequestId(), i2);
                            }
                        }
                    }
                }
            }
            if (this.mListQueryType != 1) {
                Iterator<ChallengeMixFeed> it2 = challengeMixFeedList.mItems.iterator();
                while (it2.hasNext()) {
                    ChallengeMixFeed next = it2.next();
                    if (!isDataEmpty() && ((ChallengeMixFeedList) this.mData).mItems.indexOf(next) >= 0) {
                        it2.remove();
                    }
                }
            }
            ai.a().a(challengeMixFeedList.getRequestId(), challengeMixFeedList.logPb);
            int i3 = this.mListQueryType;
            if (i3 != 4) {
                switch (i3) {
                    case 1:
                        this.mData = challengeMixFeedList;
                        break;
                    case 2:
                        challengeMixFeedList.mItems.addAll(getItems());
                        ((ChallengeMixFeedList) this.mData).mItems = challengeMixFeedList.mItems;
                        break;
                }
            } else {
                ((ChallengeMixFeedList) this.mData).mItems.addAll(challengeMixFeedList.mItems);
                ChallengeMixFeedList challengeMixFeedList2 = (ChallengeMixFeedList) this.mData;
                if (!((ChallengeMixFeedList) this.mData).isHasMore() || !challengeMixFeedList.isHasMore()) {
                    i = 0;
                }
                challengeMixFeedList2.hasMore = i;
            }
            if (((ChallengeMixFeedList) this.mData).cursor != 0) {
                ((ChallengeMixFeedList) this.mData).cursor = challengeMixFeedList.cursor;
            }
            for (int i4 = 0; i4 < ((ChallengeMixFeedList) this.mData).mItems.size(); i4++) {
                if (((ChallengeMixFeedList) this.mData).mItems.get(i4).getFeedType() == 65280 && ((ChallengeMixFeedList) this.mData).mItems.get(i4).getAweme() != null) {
                    ((ChallengeMixFeedList) this.mData).mItems.get(i4).getAweme().setAwemePosition(i4);
                }
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = null;
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((ChallengeMixFeedList) this.mData).hasMore = 0;
        }
    }

    private void loadChallengeMixFeedList(int i, int i2, String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 25847, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Byte.valueOf(z)}, this, changeQuickRedirect, false, 25847, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        long j = 0;
        if (i == 2 && !isDataEmpty()) {
            j = ((ChallengeMixFeedList) this.mData).cursor;
        }
        getLoadTask(i, i2, str, j, z ? 1 : 0).a(ChallengeMixFeedModel$$Lambda$0.$instance).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public i<ChallengeMixFeedList> getLoadTask(int i, int i2, String str, long j, int i3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, new Long(j2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 25848, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Long.TYPE, Integer.TYPE}, i.class)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, new Long(j2), Integer.valueOf(i3)};
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 25848, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Long.TYPE, Integer.TYPE}, i.class);
        } else if (i2 == 13) {
            Object[] objArr2 = {Integer.valueOf(i), str, new Long(j2), 20, str, Integer.valueOf(i3)};
            if (!PatchProxy.isSupport(objArr2, null, ChallengeApi.f35343a, true, 25807, new Class[]{Integer.TYPE, String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE}, i.class)) {
                return ChallengeApi.f35344b.loadChallengeMixFeedList(i, str, j, 20, str, i3);
            }
            Object[] objArr3 = {Integer.valueOf(i), str, new Long(j2), 20, str, Integer.valueOf(i3)};
            return (i) PatchProxy.accessDispatch(objArr3, null, ChallengeApi.f35343a, true, 25807, new Class[]{Integer.TYPE, String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE}, i.class);
        } else {
            Object[] objArr4 = {Integer.valueOf(i), str, new Long(j2), 20, str, Integer.valueOf(i3)};
            if (!PatchProxy.isSupport(objArr4, null, ChallengeApi.f35343a, true, 25808, new Class[]{Integer.TYPE, String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE}, i.class)) {
                return ChallengeApi.f35344b.loadFreshChallengeMixFeedList(i, str, j, 20, str, i3);
            }
            Object[] objArr5 = {Integer.valueOf(i), str, new Long(j2), 20, str, Integer.valueOf(i3)};
            return (i) PatchProxy.accessDispatch(objArr5, null, ChallengeApi.f35343a, true, 25808, new Class[]{Integer.TYPE, String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE}, i.class);
        }
    }
}
