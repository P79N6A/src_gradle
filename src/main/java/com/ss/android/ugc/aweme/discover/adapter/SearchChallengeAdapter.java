package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;

public class SearchChallengeAdapter extends SearchBaseAdapter<SearchChallenge> {
    public static ChangeQuickRedirect i;

    public SearchChallengeAdapter(s sVar, String str) {
        super(sVar, str);
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, i, false, 35771, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, i, false, 35771, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        SearchChallengeViewHolder a2 = SearchChallengeViewHolder.a(viewGroup2, this.h, null, "chanllenge_tab");
        a2.f41781f = "search_result";
        return a2;
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 35770, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 35770, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((SearchChallengeViewHolder) viewHolder).a((SearchChallenge) this.mItems.get(i2), this.h);
    }
}
