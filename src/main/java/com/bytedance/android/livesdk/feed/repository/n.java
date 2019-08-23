package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class n implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14359a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f14360b = new n();

    private n() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14359a, false, 8860, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14359a, false, 8860, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Pair pair = (Pair) obj;
        if (pair != null && !Lists.isEmpty((List) pair.first)) {
            for (FeedItem feedItem : (List) pair.first) {
                if (((Extra) pair.second).logPb != null) {
                    feedItem.logPb = ((Extra) pair.second).logPb.toString();
                }
            }
        }
    }
}
