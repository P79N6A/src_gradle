package com.ss.android.ugc.aweme.challenge.c;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.challenge.data.c;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class d extends a<Challenge, ChallengeList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35371a;

    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeList) this.mData).items;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f35371a, false, 25873, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f35371a, false, 25873, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        AbTestManager.a();
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f35371a, false, 25872, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f35371a, false, 25872, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], this, f35371a, false, 25875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35371a, false, 25875, new Class[0], Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35372a;

            public final Object call() {
                if (PatchProxy.isSupport(new Object[0], this, f35372a, false, 25878, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f35372a, false, 25878, new Class[0], Object.class);
                } else if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.challenge.data.d.f35397a, true, 25827, new Class[0], ChallengeList.class)) {
                    return (ChallengeList) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.challenge.data.d.f35397a, true, 25827, new Class[0], ChallengeList.class);
                } else {
                    ChallengeList challengeList = new ChallengeList();
                    ArrayList arrayList = new ArrayList();
                    List<c> a2 = com.ss.android.ugc.aweme.challenge.data.d.a();
                    if (a2 != null) {
                        for (c cVar : a2) {
                            Challenge challenge = new Challenge();
                            challenge.setChallengeName(cVar.f35395a);
                            arrayList.add(challenge);
                        }
                    }
                    challengeList.items = arrayList;
                    return challengeList;
                }
            }
        }, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ChallengeList challengeList = (ChallengeList) obj;
        if (PatchProxy.isSupport(new Object[]{challengeList}, this, f35371a, false, 25876, new Class[]{ChallengeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeList}, this, f35371a, false, 25876, new Class[]{ChallengeList.class}, Void.TYPE);
            return;
        }
        if (challengeList == null || CollectionUtils.isEmpty(challengeList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = challengeList;
            } else if (i == 4) {
                ((ChallengeList) this.mData).items.addAll(challengeList.items);
                ((ChallengeList) this.mData).maxCursor = Math.min(((ChallengeList) this.mData).maxCursor, challengeList.maxCursor);
                ((ChallengeList) this.mData).hasMore = ((ChallengeList) this.mData).hasMore;
            }
        } else {
            if (this.mData != null) {
                ((ChallengeList) this.mData).hasMore = false;
            }
        }
    }
}
