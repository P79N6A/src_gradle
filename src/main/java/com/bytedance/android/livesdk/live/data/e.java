package com.bytedance.android.livesdk.live.data;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import java.util.ArrayList;

public final /* synthetic */ class e implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15845a;

    /* renamed from: b  reason: collision with root package name */
    private final d f15846b;

    public e(d dVar) {
        this.f15846b = dVar;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15845a, false, 10319, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f15845a, false, 10319, new Class[]{Object.class}, Object.class);
        }
        d dVar = this.f15846b;
        c cVar = (c) obj;
        ArrayList<FeedItem> arrayList = new ArrayList<>(cVar.f7867b);
        dVar.a(arrayList);
        if (!Lists.isEmpty(arrayList)) {
            for (FeedItem feedItem : arrayList) {
                if (PatchProxy.isSupport(new Object[]{feedItem}, dVar, d.f15842a, false, 10317, new Class[]{FeedItem.class}, Void.TYPE)) {
                    d dVar2 = dVar;
                    PatchProxy.accessDispatch(new Object[]{feedItem}, dVar2, d.f15842a, false, 10317, new Class[]{FeedItem.class}, Void.TYPE);
                } else if (feedItem != null && ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room))) {
                    Room room = (Room) feedItem.item;
                    room.setLog_pb(feedItem.logPb);
                    room.getOwner().setLogPb(feedItem.logPb);
                    room.setRequestId(feedItem.resId);
                }
            }
        }
        return Pair.create(arrayList, cVar.f7868c);
    }
}
