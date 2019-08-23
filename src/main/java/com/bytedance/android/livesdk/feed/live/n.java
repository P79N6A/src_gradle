package com.bytedance.android.livesdk.feed.live;

import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class n implements LiveTabIndicator.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14286a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveTabViewHolder f14287b;

    n(LiveTabViewHolder liveTabViewHolder) {
        this.f14287b = liveTabViewHolder;
    }

    public final void a(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f14286a, false, 8760, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f14286a, false, 8760, new Class[]{g.class}, Void.TYPE);
            return;
        }
        LiveTabViewHolder liveTabViewHolder = this.f14287b;
        if (PatchProxy.isSupport(new Object[]{gVar2}, liveTabViewHolder, LiveTabViewHolder.f14252a, false, 8758, new Class[]{g.class}, Void.TYPE)) {
            LiveTabViewHolder liveTabViewHolder2 = liveTabViewHolder;
            PatchProxy.accessDispatch(new Object[]{gVar2}, liveTabViewHolder2, LiveTabViewHolder.f14252a, false, 8758, new Class[]{g.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_page", "live");
        hashMap.put("event_type", "click");
        hashMap.put("event_module", gVar2.h);
        b.a().a("subtab_click", hashMap);
        liveTabViewHolder.f14253d.a(gVar2);
    }
}
