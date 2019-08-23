package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.widget.RankScrollView;
import java.util.Map;

public final /* synthetic */ class w implements RankScrollView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41996a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListCoverViewHolder f41997b;

    public w(RankingListCoverViewHolder rankingListCoverViewHolder) {
        this.f41997b = rankingListCoverViewHolder;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41996a, false, 35720, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41996a, false, 35720, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f41997b;
        if (!rankingListCoverViewHolder.j && rankingListCoverViewHolder.i && rankingListCoverViewHolder.f41704c != null && rankingListCoverViewHolder.f41704c.getVisibility() == 0 && rankingListCoverViewHolder.h != null) {
            rankingListCoverViewHolder.f41704c.getGlobalVisibleRect(rankingListCoverViewHolder.h);
            if (rankingListCoverViewHolder.h.right < p.b(rankingListCoverViewHolder.itemView.getContext())) {
                rankingListCoverViewHolder.i = false;
                r.a("show_hot_list_entrance", (Map) d.a().a("enter_from", "discovery").f34114b);
            }
        }
        if (!rankingListCoverViewHolder.j && rankingListCoverViewHolder.v && rankingListCoverViewHolder.l != null && rankingListCoverViewHolder.l.getVisibility() == 0 && rankingListCoverViewHolder.u != null) {
            rankingListCoverViewHolder.l.getGlobalVisibleRect(rankingListCoverViewHolder.u);
            if (rankingListCoverViewHolder.u.right < p.b(rankingListCoverViewHolder.itemView.getContext())) {
                rankingListCoverViewHolder.v = false;
                r.a("show_brand_list_entrance", (Map) d.a().a("enter_from", "discovery").f34114b);
            }
        }
    }
}
