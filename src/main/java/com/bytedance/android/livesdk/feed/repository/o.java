package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.IPlayable;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class o implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14361a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14362b;

    o(FeedRepository.a aVar) {
        this.f14362b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14361a, false, 8861, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14361a, false, 8861, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FeedRepository.a aVar = this.f14362b;
        Pair pair = (Pair) obj;
        if (pair != null && !Lists.isEmpty((List) pair.first)) {
            ArrayList arrayList = new ArrayList();
            for (FeedItem feedItem : (List) pair.first) {
                if (!(feedItem == null || feedItem.item == null || !(feedItem.item instanceof IPlayable) || ((IPlayable) feedItem.item).getVideoModel() == null || ((IPlayable) feedItem.item).getVideoModel().getCoverModel() == null)) {
                    arrayList.add(((IPlayable) feedItem.item).getVideoModel().getCoverModel());
                }
            }
            aVar.l.onNext(arrayList);
        }
    }
}
