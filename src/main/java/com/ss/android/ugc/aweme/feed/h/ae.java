package com.ss.android.ugc.aweme.feed.h;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public final class ae extends g {
    public static ChangeQuickRedirect h;
    private boolean i = true;

    public final boolean a() {
        return this.i;
    }

    public ae() {
    }

    public ae(int i2) {
        super(20);
    }

    /* renamed from: a */
    public final void handleData(FeedItemList feedItemList) {
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, h, false, 42090, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, h, false, 42090, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        if (feedItemList == null || CollectionUtils.isEmpty(feedItemList.items) || isDataEmpty()) {
            this.i = true;
        } else {
            Aweme aweme = ((FeedItemList) this.mData).items.get(0);
            Aweme aweme2 = feedItemList.items.get(0);
            if (aweme == null || aweme2 == null || !StringUtils.equal(aweme.getAid(), aweme2.getAid())) {
                this.i = true;
            } else {
                this.i = false;
            }
        }
        super.handleData(feedItemList);
    }

    public ae(int i2, int i3) {
        super(20, i3);
    }
}
