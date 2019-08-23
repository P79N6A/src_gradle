package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;
import com.ss.android.ugc.aweme.views.m;
import java.util.List;

public class PoiTypeRecyclerAdapter extends RecyclerView.Adapter<PoiTypeRecyclerViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60002a;

    /* renamed from: b  reason: collision with root package name */
    private a f60003b;

    /* renamed from: c  reason: collision with root package name */
    private List<SimplePoiInfoStruct> f60004c;

    static class PoiTypeRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60005a;

        /* renamed from: b  reason: collision with root package name */
        a f60006b;

        /* renamed from: c  reason: collision with root package name */
        Context f60007c;

        /* renamed from: d  reason: collision with root package name */
        SmartAnimatedImageView f60008d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f60009e;

        /* renamed from: f  reason: collision with root package name */
        DmtTextView f60010f;
        DmtTextView g;
        DmtTextView h;
        DmtTextView i;
        DmtTextView j;

        PoiTypeRecyclerViewHolder(View view, a aVar) {
            super(view);
            this.f60006b = aVar;
            this.f60007c = view.getContext();
            this.f60008d = (SmartAnimatedImageView) view.findViewById(C0906R.id.c1w);
            this.f60009e = (ImageView) view.findViewById(C0906R.id.c1y);
            this.f60010f = (DmtTextView) view.findViewById(C0906R.id.c29);
            this.g = (DmtTextView) view.findViewById(C0906R.id.c2d);
            this.h = (DmtTextView) view.findViewById(C0906R.id.c2j);
            this.i = (DmtTextView) view.findViewById(C0906R.id.c20);
            this.j = (DmtTextView) view.findViewById(C0906R.id.c3y);
        }
    }

    public interface a {
        void a(SimplePoiInfoStruct simplePoiInfoStruct);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f60002a, false, 65212, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60002a, false, 65212, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f60004c == null) {
            return 0;
        } else {
            return this.f60004c.size();
        }
    }

    public PoiTypeRecyclerAdapter(a aVar, List<SimplePoiInfoStruct> list) {
        this.f60003b = aVar;
        this.f60004c = list;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f60002a, false, 65210, new Class[]{ViewGroup.class, Integer.TYPE}, PoiTypeRecyclerViewHolder.class)) {
            return new PoiTypeRecyclerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zo, viewGroup2, false), this.f60003b);
        }
        return (PoiTypeRecyclerViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f60002a, false, 65210, new Class[]{ViewGroup.class, Integer.TYPE}, PoiTypeRecyclerViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        PoiTypeRecyclerViewHolder poiTypeRecyclerViewHolder = (PoiTypeRecyclerViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{poiTypeRecyclerViewHolder, Integer.valueOf(i)}, this, f60002a, false, 65211, new Class[]{PoiTypeRecyclerViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiTypeRecyclerViewHolder, Integer.valueOf(i)}, this, f60002a, false, 65211, new Class[]{PoiTypeRecyclerViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SimplePoiInfoStruct simplePoiInfoStruct = this.f60004c.get(i);
        if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct}, poiTypeRecyclerViewHolder, PoiTypeRecyclerViewHolder.f60005a, false, 65213, new Class[]{SimplePoiInfoStruct.class}, Void.TYPE)) {
            PoiTypeRecyclerViewHolder poiTypeRecyclerViewHolder2 = poiTypeRecyclerViewHolder;
            PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct}, poiTypeRecyclerViewHolder2, PoiTypeRecyclerViewHolder.f60005a, false, 65213, new Class[]{SimplePoiInfoStruct.class}, Void.TYPE);
            return;
        }
        if (simplePoiInfoStruct.cover == null || CollectionUtils.isEmpty(simplePoiInfoStruct.cover.getUrlList())) {
            poiTypeRecyclerViewHolder.f60008d.setImageResource(C0906R.color.a0i);
            poiTypeRecyclerViewHolder.f60009e.setVisibility(0);
        } else {
            SmartAnimatedImageView smartAnimatedImageView = poiTypeRecyclerViewHolder.f60008d;
            UrlModel urlModel = simplePoiInfoStruct.cover;
            if (PatchProxy.isSupport(new Object[]{smartAnimatedImageView, urlModel, "poi"}, null, m.f76469a, true, 89547, new Class[]{SmartImageView.class, UrlModel.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{smartAnimatedImageView, urlModel, "poi"}, null, m.f76469a, true, 89547, new Class[]{SmartImageView.class, UrlModel.class, String.class}, Void.TYPE);
            } else {
                m.a((SmartImageView) smartAnimatedImageView, urlModel, -1, -1, "poi");
            }
            poiTypeRecyclerViewHolder.f60009e.setVisibility(8);
        }
        poiTypeRecyclerViewHolder.f60010f.setText(simplePoiInfoStruct.poiName);
        int i2 = (int) simplePoiInfoStruct.cost;
        if (i2 == 0) {
            poiTypeRecyclerViewHolder.g.setVisibility(8);
        } else {
            poiTypeRecyclerViewHolder.g.setText(String.format(poiTypeRecyclerViewHolder.f60007c.getResources().getString(C0906R.string.bo9), new Object[]{String.valueOf(i2)}));
            poiTypeRecyclerViewHolder.g.setVisibility(0);
        }
        if (TextUtils.isEmpty(simplePoiInfoStruct.poiRankDesc)) {
            poiTypeRecyclerViewHolder.h.setVisibility(8);
            if (!TextUtils.isEmpty(simplePoiInfoStruct.businessAreaName)) {
                poiTypeRecyclerViewHolder.i.setText(simplePoiInfoStruct.businessAreaName);
                poiTypeRecyclerViewHolder.i.setVisibility(0);
            } else {
                poiTypeRecyclerViewHolder.i.setVisibility(8);
            }
            if (!TextUtils.isEmpty(simplePoiInfoStruct.optionName)) {
                poiTypeRecyclerViewHolder.j.setText(simplePoiInfoStruct.optionName);
                poiTypeRecyclerViewHolder.j.setVisibility(0);
            } else {
                poiTypeRecyclerViewHolder.j.setVisibility(8);
            }
        } else {
            poiTypeRecyclerViewHolder.h.setVisibility(0);
            poiTypeRecyclerViewHolder.h.setText(simplePoiInfoStruct.poiRankDesc);
            poiTypeRecyclerViewHolder.i.setVisibility(8);
            poiTypeRecyclerViewHolder.j.setVisibility(8);
        }
        poiTypeRecyclerViewHolder.itemView.setOnClickListener(new e(poiTypeRecyclerViewHolder, simplePoiInfoStruct));
    }
}
