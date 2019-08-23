package com.bytedance.android.livesdk.rank.viewbinder;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.d;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankItemViewBinder;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17070a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankItemViewBinder.DailyRankItemViewHolder f17071b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.android.livesdk.rank.model.b f17072c;

    b(DailyRankItemViewBinder.DailyRankItemViewHolder dailyRankItemViewHolder, com.bytedance.android.livesdk.rank.model.b bVar) {
        this.f17071b = dailyRankItemViewHolder;
        this.f17072c = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17070a, false, 13088, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17070a, false, 13088, new Class[]{View.class}, Void.TYPE);
            return;
        }
        DailyRankItemViewBinder.DailyRankItemViewHolder dailyRankItemViewHolder = this.f17071b;
        com.bytedance.android.livesdk.rank.model.b bVar = this.f17072c;
        if (bVar.f17025b != null) {
            a a2 = a.a();
            d dVar = new d(bVar.f17025b, bVar.a(), dailyRankItemViewHolder.f17043b, bVar.f17027d);
            a2.a((Object) dVar);
        }
    }
}
