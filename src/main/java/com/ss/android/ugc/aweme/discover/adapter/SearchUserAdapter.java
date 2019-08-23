package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.following.ui.adapter.a;

public class SearchUserAdapter extends SearchBaseAdapter<SearchUser> {
    public static ChangeQuickRedirect i;
    private a j;

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, i, false, 35917, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, i, false, 35917, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        SearchUserViewHolder a2 = SearchUserViewHolder.a(viewGroup, this.j);
        a2.a(this.g);
        return a2;
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 35916, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 35916, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((SearchUserViewHolder) viewHolder).a((SearchUser) this.mItems.get(i2));
    }

    public SearchUserAdapter(s sVar, String str, a aVar) {
        super(sVar, str);
        this.j = aVar;
    }
}
