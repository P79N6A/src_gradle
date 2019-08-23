package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder;
import com.ss.android.ugc.aweme.discover.c.a;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

public final /* synthetic */ class d implements DiscoverExpandViewHolder.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43158a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverDetailPageFragment f43159b;

    d(DiscoverDetailPageFragment discoverDetailPageFragment) {
        this.f43159b = discoverDetailPageFragment;
    }

    public final void a(View view, int i) {
        String str;
        String str2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f43158a, false, 37449, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f43158a, false, 37449, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        DiscoverDetailPageFragment discoverDetailPageFragment = this.f43159b;
        if (discoverDetailPageFragment.f3013d instanceof a) {
            VerticalViewPager verticalViewPager = ((a) discoverDetailPageFragment.f3013d).mViewPager;
            FeedPagerAdapter be = discoverDetailPageFragment.f3013d.be();
            if (be != null && i2 < be.getCount()) {
                Aweme o = discoverDetailPageFragment.o();
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", discoverDetailPageFragment.f3012c.getEventType());
                if (discoverDetailPageFragment.j == null) {
                    str = "";
                } else {
                    str = discoverDetailPageFragment.j.getPlayListType();
                }
                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("playlist_type", str).a(discoverDetailPageFragment.getPlayListIdKey(), discoverDetailPageFragment.getPlayListId());
                if (o == null) {
                    str2 = "";
                } else {
                    str2 = o.getAid();
                }
                r.a("choose_playlist_video", (Map) a3.a("group_id", str2).f34114b);
                if (verticalViewPager.getCurrentItem() != i2) {
                    verticalViewPager.a(i2, true);
                }
            }
        }
    }
}
