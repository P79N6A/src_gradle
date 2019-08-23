package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.message.model.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class eo implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13232a;

    /* renamed from: b  reason: collision with root package name */
    private final TopRankWidget f13233b;

    /* renamed from: c  reason: collision with root package name */
    private final n f13234c;

    eo(TopRankWidget topRankWidget, n nVar) {
        this.f13233b = topRankWidget;
        this.f13234c = nVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13232a, false, 7518, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13232a, false, 7518, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13233b.a(this.f13234c, "hourly_rank_top");
    }
}
