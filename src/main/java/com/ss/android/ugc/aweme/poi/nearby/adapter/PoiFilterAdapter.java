package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassFilterOptionStruct;
import java.util.List;

public class PoiFilterAdapter extends RecyclerView.Adapter<PoiFilterViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59954a;

    /* renamed from: b  reason: collision with root package name */
    private List<PoiClassFilterOptionStruct> f59955b;

    /* renamed from: c  reason: collision with root package name */
    private a f59956c;

    static class PoiFilterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59957a;

        /* renamed from: b  reason: collision with root package name */
        View f59958b;

        /* renamed from: c  reason: collision with root package name */
        a f59959c;

        /* renamed from: d  reason: collision with root package name */
        DmtTextView f59960d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f59961e;

        PoiFilterViewHolder(View view, a aVar) {
            super(view);
            this.f59958b = view;
            this.f59959c = aVar;
            this.f59960d = (DmtTextView) view.findViewById(C0906R.id.adu);
            this.f59961e = (ImageView) view.findViewById(C0906R.id.ayn);
        }
    }

    public interface a {
        void a(PoiClassFilterOptionStruct poiClassFilterOptionStruct, int i);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f59954a, false, 65184, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59954a, false, 65184, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f59955b == null) {
            return 0;
        } else {
            return this.f59955b.size();
        }
    }

    public PoiFilterAdapter(a aVar) {
        this.f59956c = aVar;
    }

    public final void a(List<PoiClassFilterOptionStruct> list) {
        List<PoiClassFilterOptionStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f59954a, false, 65181, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f59954a, false, 65181, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f59955b = list2;
        notifyDataSetChanged();
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59954a, false, 65182, new Class[]{ViewGroup.class, Integer.TYPE}, PoiFilterViewHolder.class)) {
            return (PoiFilterViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59954a, false, 65182, new Class[]{ViewGroup.class, Integer.TYPE}, PoiFilterViewHolder.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yl, viewGroup2, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int b2 = p.b(viewGroup.getContext());
        if (viewGroup.getMeasuredWidth() > 0) {
            b2 = viewGroup.getMeasuredWidth();
        }
        int i2 = 4;
        if (getItemCount() != 0 && getItemCount() <= 4) {
            i2 = getItemCount();
        }
        layoutParams.width = b2 / i2;
        inflate.setLayoutParams(layoutParams);
        return new PoiFilterViewHolder(inflate, this.f59956c);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        PoiFilterViewHolder poiFilterViewHolder = (PoiFilterViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{poiFilterViewHolder, Integer.valueOf(i)}, this, f59954a, false, 65183, new Class[]{PoiFilterViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiFilterViewHolder, Integer.valueOf(i)}, this, f59954a, false, 65183, new Class[]{PoiFilterViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PoiClassFilterOptionStruct poiClassFilterOptionStruct = this.f59955b.get(i2);
        if (PatchProxy.isSupport(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i)}, poiFilterViewHolder, PoiFilterViewHolder.f59957a, false, 65185, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i)}, poiFilterViewHolder, PoiFilterViewHolder.f59957a, false, 65185, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(poiClassFilterOptionStruct.subTitle)) {
            poiFilterViewHolder.f59960d.setText(poiClassFilterOptionStruct.subTitle);
            poiFilterViewHolder.f59960d.setTextColor(poiFilterViewHolder.f59958b.getContext().getResources().getColor(C0906R.color.a6i));
            poiFilterViewHolder.f59961e.setImageResource(2130839199);
        } else {
            poiFilterViewHolder.f59960d.setText(poiClassFilterOptionStruct.title);
            poiFilterViewHolder.f59960d.setTextColor(poiFilterViewHolder.f59958b.getContext().getResources().getColor(C0906R.color.a6m));
            poiFilterViewHolder.f59961e.setImageResource(2130839198);
        }
        if (CollectionUtils.isEmpty(poiClassFilterOptionStruct.optionStructList)) {
            poiFilterViewHolder.f59961e.setVisibility(8);
            if (poiClassFilterOptionStruct.singleSelected) {
                poiFilterViewHolder.f59960d.setTextColor(poiFilterViewHolder.f59958b.getContext().getResources().getColor(C0906R.color.a6i));
            } else {
                poiFilterViewHolder.f59960d.setTextColor(poiFilterViewHolder.f59958b.getContext().getResources().getColor(C0906R.color.a6m));
            }
        } else {
            poiFilterViewHolder.f59961e.setVisibility(0);
        }
        poiFilterViewHolder.f59958b.setOnClickListener(new b(poiFilterViewHolder, poiClassFilterOptionStruct, i2));
    }
}
