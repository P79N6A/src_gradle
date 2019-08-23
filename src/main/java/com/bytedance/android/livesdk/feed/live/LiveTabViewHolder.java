package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.d.i;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;

public class LiveTabViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14252a;

    /* renamed from: d  reason: collision with root package name */
    final FeedLiveFragment f14253d;

    /* renamed from: e  reason: collision with root package name */
    LiveTabIndicator f14254e;

    public final boolean b() {
        return true;
    }

    public LiveTabViewHolder(View view, FeedLiveFragment feedLiveFragment) {
        super(view);
        this.f14254e = (LiveTabIndicator) view.findViewById(C0906R.id.cyu);
        this.f14253d = feedLiveFragment;
    }

    public final /* synthetic */ void a(Object obj, int i) {
        FeedItem feedItem = (FeedItem) obj;
        if (PatchProxy.isSupport(new Object[]{feedItem, Integer.valueOf(i)}, this, f14252a, false, 8759, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItem, Integer.valueOf(i)}, this, f14252a, false, 8759, new Class[]{FeedItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        i iVar = (i) feedItem.item;
        this.f14254e.setTitles(iVar.f14088b);
        this.f14254e.setOnTabClickListener(new n(this));
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_page", "live");
        hashMap.put("event_type", "show");
        b.a().a("subtab_show", hashMap);
        for (g next : iVar.f14088b) {
            if (next.k) {
                this.f14254e.a(next);
            }
        }
    }
}
