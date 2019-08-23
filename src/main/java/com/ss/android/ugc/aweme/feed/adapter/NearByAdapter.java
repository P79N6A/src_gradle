package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;

public class NearByAdapter extends CellFeedAdapter {
    public static ChangeQuickRedirect i;

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, i, false, 40571, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, i, false, 40571, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder2.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            if (this.f35105d != null && viewHolder.getLayoutPosition() == 0) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    public final void a(NearbyCities.CityBean cityBean, boolean z) {
        NearbyCities.CityBean cityBean2 = cityBean;
        if (PatchProxy.isSupport(new Object[]{cityBean2, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 40572, new Class[]{NearbyCities.CityBean.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cityBean2, Byte.valueOf(z)}, this, i, false, 40572, new Class[]{NearbyCities.CityBean.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (cityBean2 != null) {
            t tVar = (t) this.f35105d;
            if (PatchProxy.isSupport(new Object[]{cityBean2, Byte.valueOf(z)}, tVar, t.f44958a, false, 40578, new Class[]{NearbyCities.CityBean.class, Boolean.TYPE}, Void.TYPE)) {
                t tVar2 = tVar;
                PatchProxy.accessDispatch(new Object[]{cityBean2, Byte.valueOf(z)}, tVar2, t.f44958a, false, 40578, new Class[]{NearbyCities.CityBean.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (c.c() == null || TextUtils.equals(c.c().code, cityBean2.code)) {
                if (af.b(tVar.getContext())) {
                    tVar.f44960c.setText(C0906R.string.a3o);
                } else {
                    tVar.f44960c.setText(C0906R.string.a3n);
                }
            } else if (!af.b(tVar.getContext()) || z) {
                tVar.f44960c.setText(C0906R.string.a3m);
            } else {
                tVar.f44960c.setText(C0906R.string.a3o);
            }
            tVar.f44959b.setText(cityBean2.name);
            tVar.b();
        }
    }

    public NearByAdapter(CellFeedFragmentPanel cellFeedFragmentPanel, String str, d dVar, b<AbsCellViewHolder> bVar, int i2, int i3) {
        super(cellFeedFragmentPanel, str, dVar, bVar, i2, i3);
    }
}
