package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import javax.annotation.Nullable;

public final class e implements f<SearchChallengeList, AVSearchChallengeList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68805a;

    @Nullable
    /* renamed from: a */
    public final AVSearchChallengeList apply(@Nullable SearchChallengeList searchChallengeList) {
        SearchChallengeList searchChallengeList2 = searchChallengeList;
        if (PatchProxy.isSupport(new Object[]{searchChallengeList2}, this, f68805a, false, 80103, new Class[]{SearchChallengeList.class}, AVSearchChallengeList.class)) {
            return (AVSearchChallengeList) PatchProxy.accessDispatch(new Object[]{searchChallengeList2}, this, f68805a, false, 80103, new Class[]{SearchChallengeList.class}, AVSearchChallengeList.class);
        } else if (searchChallengeList2 == null) {
            return null;
        } else {
            AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
            aVSearchChallengeList.items = f.a(searchChallengeList2.items);
            aVSearchChallengeList.cursor = searchChallengeList2.cursor;
            aVSearchChallengeList.hasMore = searchChallengeList2.hasMore;
            aVSearchChallengeList.isMatch = searchChallengeList2.isMatch;
            aVSearchChallengeList.isDisabled = searchChallengeList2.isDisabled;
            aVSearchChallengeList.keyword = searchChallengeList2.keyword;
            if (searchChallengeList2.logPb != null) {
                aVSearchChallengeList.logPb = new LogPbBean();
                aVSearchChallengeList.logPb.setImprId(searchChallengeList2.logPb.getImprId());
            }
            return aVSearchChallengeList;
        }
    }
}
