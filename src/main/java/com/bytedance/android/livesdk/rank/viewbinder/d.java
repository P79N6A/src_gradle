package com.bytedance.android.livesdk.rank.viewbinder;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.rank.model.b;
import com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17075a;

    /* renamed from: b  reason: collision with root package name */
    private final RankItemViewBinder.RankItemViewHolder f17076b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17077c;

    d(RankItemViewBinder.RankItemViewHolder rankItemViewHolder, b bVar) {
        this.f17076b = rankItemViewHolder;
        this.f17077c = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17075a, false, 13102, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17075a, false, 13102, new Class[]{View.class}, Void.TYPE);
            return;
        }
        RankItemViewBinder.RankItemViewHolder rankItemViewHolder = this.f17076b;
        b bVar = this.f17077c;
        if (RankItemViewBinder.this.f17054c) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "live_take_detail");
            hashMap.put("path", "rank_pic");
            a.a().a("pm_live_take_anchor_c_audience", hashMap, new k());
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(bVar.f17025b.getId());
        if (RankItemViewBinder.this.f17055d == 17) {
            userProfileEvent.setClickUserPosition("single_room_rank");
        } else if (RankItemViewBinder.this.f17055d == 7) {
            userProfileEvent.setClickUserPosition("weekly_rank");
        } else if (RankItemViewBinder.this.f17055d == 9) {
            userProfileEvent.setClickUserPosition("totally_rank");
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) userProfileEvent);
    }
}
