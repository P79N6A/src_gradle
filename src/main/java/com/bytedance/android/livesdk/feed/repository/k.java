package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import java.util.ArrayList;

public final /* synthetic */ class k implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14352a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository.a f14353b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14354c;

    k(FeedRepository.a aVar, boolean z) {
        this.f14353b = aVar;
        this.f14354c = z;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14352a, false, 8857, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f14352a, false, 8857, new Class[]{Object.class}, Object.class);
        }
        FeedRepository.a aVar = this.f14353b;
        boolean z = this.f14354c;
        c cVar = (c) obj;
        ArrayList<FeedItem> arrayList = new ArrayList<>(cVar.f7867b);
        if (aVar.j != 0 && !arrayList.isEmpty()) {
            FeedItem feedItem = (FeedItem) arrayList.get(0);
            if (feedItem.item != null && feedItem.item.getId() == aVar.j) {
                feedItem.repeatDisable = true;
            }
        }
        Extra extra = cVar.f7868c;
        if (!Lists.isEmpty(arrayList)) {
            for (FeedItem feedItem2 : arrayList) {
                if (PatchProxy.isSupport(new Object[]{feedItem2, extra}, aVar, FeedRepository.a.f14328a, false, 8850, new Class[]{FeedItem.class, Extra.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{feedItem2, extra}, aVar, FeedRepository.a.f14328a, false, 8850, new Class[]{FeedItem.class, Extra.class}, Void.TYPE);
                } else if (!(feedItem2 == null || extra == null)) {
                    if (feedItem2.type == 1 || feedItem2.type == 2) {
                        Room room = (Room) feedItem2.item;
                        if (extra.logPb != null) {
                            room.setLog_pb(extra.logPb.toString());
                            if (room.getOwner() != null) {
                                room.getOwner().setLogPb(extra.logPb.toString());
                            }
                        }
                        room.setRequestId(feedItem2.resId);
                    }
                }
            }
        }
        if (aVar.f14333f != null) {
            aVar.f14333f.a(arrayList, z);
        }
        aVar.g.a(aVar.f14330c, arrayList, extra, z);
        if (z) {
            aVar.f14329b = arrayList.size();
        } else {
            aVar.f14329b += arrayList.size();
        }
        aVar.k.a(z ? a.C0099a.REFRESH : a.C0099a.LOAD_MORE, z ? aVar.f14331d : aVar.f14332e, extra);
        return Pair.create(arrayList, cVar.f7868c);
    }
}
