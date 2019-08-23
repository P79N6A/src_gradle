package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.poi.a;

public class SearchPoiAdapter extends SearchBaseAdapter<SearchPoi> {
    public static ChangeQuickRedirect i;
    private a j;

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, i, false, 35867, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, i, false, 35867, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        SearchPoiViewHolder a2 = SearchPoiViewHolder.a(viewGroup, this.h, this.j, false);
        a2.a(this.g);
        return a2;
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 35866, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, i, false, 35866, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((SearchPoiViewHolder) viewHolder).a((SearchPoi) this.mItems.get(i2), this.h);
    }

    public SearchPoiAdapter(Context context, s sVar, String str) {
        super(sVar, str);
        this.j = af.a(context).f();
    }
}
