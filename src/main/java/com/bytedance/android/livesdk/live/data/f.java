package com.bytedance.android.livesdk.live.data;

import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15847a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f15848b = new f();

    private f() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15847a, false, 10320, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15847a, false, 10320, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Pair pair = (Pair) obj;
        if (!(pair == null || Lists.isEmpty((List) pair.first) || pair.second == null)) {
            for (FeedItem feedItem : (List) pair.first) {
                if (!(feedItem == null || ((Extra) pair.second).logPb == null)) {
                    feedItem.logPb = ((Extra) pair.second).logPb.toString();
                }
            }
        }
    }
}
