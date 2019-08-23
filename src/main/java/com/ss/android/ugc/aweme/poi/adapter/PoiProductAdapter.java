package com.ss.android.ugc.aweme.poi.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.d;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.am;
import com.ss.android.ugc.aweme.poi.model.x;
import java.util.List;

public class PoiProductAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59427a;

    /* renamed from: b  reason: collision with root package name */
    private am f59428b;

    /* renamed from: c  reason: collision with root package name */
    private List<x> f59429c;

    /* renamed from: d  reason: collision with root package name */
    private c f59430d;

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f59427a, false, 64771, new Class[0], Integer.TYPE)) {
            return this.f59429c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59427a, false, 64771, new Class[0], Integer.TYPE)).intValue();
    }

    public PoiProductAdapter(am amVar, c cVar) {
        this.f59428b = amVar;
        this.f59429c = amVar.products;
        this.f59430d = cVar;
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59427a, false, 64769, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59427a, false, 64769, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (this.f59428b.isDcd()) {
            i2 = C0906R.layout.yr;
        } else {
            i2 = C0906R.layout.ys;
        }
        return new PoiDcdProductViewHolder(from.inflate(i2, viewGroup2, false));
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f59427a, false, 64770, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f59427a, false, 64770, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PoiDcdProductViewHolder poiDcdProductViewHolder = (PoiDcdProductViewHolder) viewHolder;
        x xVar = this.f59429c.get(i);
        String str = this.f59428b.supplierSource;
        c cVar = this.f59430d;
        if (PatchProxy.isSupport(new Object[]{xVar, str, cVar}, poiDcdProductViewHolder, PoiDcdProductViewHolder.f59558a, false, 64827, new Class[]{x.class, String.class, c.class}, Void.TYPE)) {
            Object[] objArr = {xVar, str, cVar};
            PoiDcdProductViewHolder poiDcdProductViewHolder2 = poiDcdProductViewHolder;
            ChangeQuickRedirect changeQuickRedirect = PoiDcdProductViewHolder.f59558a;
            PatchProxy.accessDispatch(objArr, poiDcdProductViewHolder2, changeQuickRedirect, false, 64827, new Class[]{x.class, String.class, c.class}, Void.TYPE);
        } else if (xVar != null) {
            if (xVar.imageUrl != null) {
                com.ss.android.ugc.aweme.base.c.b(poiDcdProductViewHolder.mImage, xVar.imageUrl);
            }
            poiDcdProductViewHolder.mName.setText(xVar.name);
            poiDcdProductViewHolder.mPrice.setText(xVar.price);
            if (!TextUtils.isEmpty(xVar.onSale)) {
                poiDcdProductViewHolder.mSalesPromotion.setVisibility(0);
                poiDcdProductViewHolder.mSalesPromotion.setText(xVar.onSale);
            } else {
                poiDcdProductViewHolder.mSalesPromotion.setVisibility(4);
            }
            poiDcdProductViewHolder.mSubmitButton.setText(xVar.buttonText);
            poiDcdProductViewHolder.mSubmitButton.setOnClickListener(new com.ss.android.ugc.aweme.poi.adapter.viewholder.c(poiDcdProductViewHolder, xVar, cVar, str));
            poiDcdProductViewHolder.itemView.setOnClickListener(new d(poiDcdProductViewHolder, xVar, cVar, str));
        }
        h.a(this.f59430d, "project_card_show", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "poi_page").a("product_id", xVar.extId).a("poi_id", this.f59430d.getPoiId()).a("content_type", this.f59428b.supplierSource));
    }
}
