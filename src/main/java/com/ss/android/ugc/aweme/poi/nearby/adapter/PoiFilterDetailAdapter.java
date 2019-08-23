package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import java.util.List;

public class PoiFilterDetailAdapter extends RecyclerView.Adapter<PoiFilterDetailViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59962a;

    /* renamed from: b  reason: collision with root package name */
    public List<PoiOptionStruct> f59963b;

    /* renamed from: c  reason: collision with root package name */
    private a f59964c;

    static class PoiFilterDetailViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59965a;

        /* renamed from: b  reason: collision with root package name */
        a f59966b;

        /* renamed from: c  reason: collision with root package name */
        DmtTextView f59967c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f59968d;

        /* renamed from: e  reason: collision with root package name */
        View f59969e;

        /* renamed from: f  reason: collision with root package name */
        View f59970f;

        public PoiFilterDetailViewHolder(View view, a aVar) {
            super(view);
            this.f59967c = (DmtTextView) view.findViewById(C0906R.id.c1l);
            this.f59968d = (ImageView) view.findViewById(C0906R.id.c1n);
            this.f59969e = view.findViewById(C0906R.id.d5u);
            this.f59970f = view.findViewById(C0906R.id.ms);
            this.f59966b = aVar;
        }
    }

    public interface a {
        void a(int i, PoiOptionStruct poiOptionStruct);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f59962a, false, 65190, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59962a, false, 65190, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f59963b == null) {
            return 0;
        } else {
            return this.f59963b.size();
        }
    }

    public PoiFilterDetailAdapter(a aVar) {
        this.f59964c = aVar;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59962a, false, 65188, new Class[]{ViewGroup.class, Integer.TYPE}, PoiFilterDetailViewHolder.class)) {
            return new PoiFilterDetailViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ym, viewGroup2, false), this.f59964c);
        }
        return (PoiFilterDetailViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59962a, false, 65188, new Class[]{ViewGroup.class, Integer.TYPE}, PoiFilterDetailViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        PoiFilterDetailViewHolder poiFilterDetailViewHolder = (PoiFilterDetailViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{poiFilterDetailViewHolder, Integer.valueOf(i)}, this, f59962a, false, 65189, new Class[]{PoiFilterDetailViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiFilterDetailViewHolder, Integer.valueOf(i)}, this, f59962a, false, 65189, new Class[]{PoiFilterDetailViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int itemCount = getItemCount();
        PoiOptionStruct poiOptionStruct = this.f59963b.get(i2);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(itemCount), poiOptionStruct}, poiFilterDetailViewHolder, PoiFilterDetailViewHolder.f59965a, false, 65191, new Class[]{Integer.TYPE, Integer.TYPE, PoiOptionStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(itemCount), poiOptionStruct}, poiFilterDetailViewHolder, PoiFilterDetailViewHolder.f59965a, false, 65191, new Class[]{Integer.TYPE, Integer.TYPE, PoiOptionStruct.class}, Void.TYPE);
            return;
        }
        poiFilterDetailViewHolder.f59967c.setText(poiOptionStruct.getName());
        if (poiOptionStruct.isSelected()) {
            poiFilterDetailViewHolder.f59968d.setVisibility(0);
        } else {
            poiFilterDetailViewHolder.f59968d.setVisibility(8);
        }
        if (i2 == 0) {
            poiFilterDetailViewHolder.f59969e.setVisibility(0);
        } else {
            poiFilterDetailViewHolder.f59969e.setVisibility(8);
        }
        if (i2 == itemCount - 1) {
            poiFilterDetailViewHolder.f59970f.setVisibility(0);
        } else {
            poiFilterDetailViewHolder.f59970f.setVisibility(8);
        }
        poiFilterDetailViewHolder.itemView.setOnClickListener(new c(poiFilterDetailViewHolder, i2, poiOptionStruct));
    }
}
