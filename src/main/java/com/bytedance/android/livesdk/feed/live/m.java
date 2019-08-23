package com.bytedance.android.livesdk.feed.live;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.feed.b.b;
import com.bytedance.android.livesdk.feed.f.c;
import com.bytedance.android.livesdk.feed.f.d;
import com.bytedance.android.livesdk.feed.live.HorFollowLiveFeedViewHolder;
import com.bytedance.android.livesdkapi.depend.d.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14283a;

    /* renamed from: b  reason: collision with root package name */
    private final HorFollowLiveFeedViewHolder.ItemViewHolder f14284b;

    /* renamed from: c  reason: collision with root package name */
    private final FeedItem f14285c;

    m(HorFollowLiveFeedViewHolder.ItemViewHolder itemViewHolder, FeedItem feedItem) {
        this.f14284b = itemViewHolder;
        this.f14285c = feedItem;
    }

    public final void onClick(View view) {
        g gVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f14283a, false, 8752, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14283a, false, 8752, new Class[]{View.class}, Void.TYPE);
            return;
        }
        HorFollowLiveFeedViewHolder.ItemViewHolder itemViewHolder = this.f14284b;
        FeedItem feedItem = this.f14285c;
        if (!NetworkUtils.isNetworkAvailable(HorFollowLiveFeedViewHolder.this.f14241f)) {
            a.a(HorFollowLiveFeedViewHolder.this.f14241f, (int) C0906R.string.cwz);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (FeedItem next : HorFollowLiveFeedViewHolder.this.f14240e) {
            if (next.item instanceof Room) {
                Room room = (Room) next.item;
                room.setRequestId(next.requestId());
                room.setLog_pb(next.logPb());
                arrayList.add(room);
            }
        }
        int max = Math.max(arrayList.indexOf(feedItem.item), 0);
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, d.f14119a, true, 8708, new Class[]{List.class}, g.class)) {
            gVar = (g) PatchProxy.accessDispatch(new Object[]{arrayList}, null, d.f14119a, true, 8708, new Class[]{List.class}, g.class);
        } else {
            gVar = new c(arrayList);
        }
        h.b().a(gVar);
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", "live");
        bundle.putString("source", "");
        bundle.putLong("live.intent.extra.USER_FROM", 2);
        bundle.putString("request_id", ((Room) arrayList.get(max)).getRequestId());
        bundle.putString("log_pb", ((Room) arrayList.get(max)).getLog_pb());
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "follow_live");
        Bundle a2 = p.a(HorFollowLiveFeedViewHolder.this.f14241f, max, "live", null, 2, false, bundle);
        if (a2 != null && a2.get("live.intent.extra.USER_ID") == null) {
            a2.putString("live.intent.extra.USER_ID", String.valueOf(((Room) arrayList.get(max)).getOwnerUserId()));
        }
        b.c().k().a(HorFollowLiveFeedViewHolder.this.f14241f, ((Room) arrayList.get(max)).getId(), a2);
    }
}
