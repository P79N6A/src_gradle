package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.poi.PoiVerticalEntranceStruct;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ed;
import java.util.List;
import java.util.Map;

public class PoiTypeEntranceAdapter extends RecyclerView.Adapter<PoiTypeViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44758a;

    /* renamed from: b  reason: collision with root package name */
    List<PoiVerticalEntranceStruct> f44759b;

    /* renamed from: c  reason: collision with root package name */
    private a f44760c;

    static class PoiTypeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44761a;

        /* renamed from: b  reason: collision with root package name */
        a f44762b;

        /* renamed from: c  reason: collision with root package name */
        View f44763c;

        /* renamed from: d  reason: collision with root package name */
        RemoteImageView f44764d;

        /* renamed from: e  reason: collision with root package name */
        DmtTextView f44765e;

        PoiTypeViewHolder(View view, a aVar) {
            super(view);
            this.f44763c = view;
            this.f44762b = aVar;
            this.f44764d = (RemoteImageView) view.findViewById(C0906R.id.aqm);
            this.f44765e = (DmtTextView) view.findViewById(C0906R.id.bpr);
        }
    }

    public interface a {
        void a(PoiVerticalEntranceStruct poiVerticalEntranceStruct);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f44758a, false, 40606, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44758a, false, 40606, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f44759b == null) {
            return 0;
        } else {
            return this.f44759b.size();
        }
    }

    public PoiTypeEntranceAdapter(a aVar) {
        this.f44760c = aVar;
    }

    public /* synthetic */ void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        PoiTypeViewHolder poiTypeViewHolder = (PoiTypeViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{poiTypeViewHolder}, this, f44758a, false, 40607, new Class[]{PoiTypeViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiTypeViewHolder}, this, f44758a, false, 40607, new Class[]{PoiTypeViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(poiTypeViewHolder);
        int adapterPosition = poiTypeViewHolder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < this.f44759b.size()) {
            r.a("icon_show", (Map) d.a().a("city_info", aa.a()).a("enter_method", aa.f75006c).a("poi_channel", this.f44759b.get(adapterPosition).code).f34114b);
        }
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        PoiTypeViewHolder poiTypeViewHolder = (PoiTypeViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{poiTypeViewHolder, Integer.valueOf(i)}, this, f44758a, false, 40605, new Class[]{PoiTypeViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiTypeViewHolder, Integer.valueOf(i)}, this, f44758a, false, 40605, new Class[]{PoiTypeViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PoiVerticalEntranceStruct poiVerticalEntranceStruct = this.f44759b.get(i);
        if (PatchProxy.isSupport(new Object[]{poiVerticalEntranceStruct}, poiTypeViewHolder, PoiTypeViewHolder.f44761a, false, 40608, new Class[]{PoiVerticalEntranceStruct.class}, Void.TYPE)) {
            PoiTypeViewHolder poiTypeViewHolder2 = poiTypeViewHolder;
            PatchProxy.accessDispatch(new Object[]{poiVerticalEntranceStruct}, poiTypeViewHolder2, PoiTypeViewHolder.f44761a, false, 40608, new Class[]{PoiVerticalEntranceStruct.class}, Void.TYPE);
            return;
        }
        c.b(poiTypeViewHolder.f44764d, poiVerticalEntranceStruct.iconUrl);
        poiTypeViewHolder.f44765e.setText(poiVerticalEntranceStruct.name);
        poiTypeViewHolder.f44763c.setOnTouchListener(ed.a(0.75f, 1.0f));
        poiTypeViewHolder.f44763c.setOnClickListener(new y(poiTypeViewHolder, poiVerticalEntranceStruct));
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44758a, false, 40604, new Class[]{ViewGroup.class, Integer.TYPE}, PoiTypeViewHolder.class)) {
            return (PoiTypeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44758a, false, 40604, new Class[]{ViewGroup.class, Integer.TYPE}, PoiTypeViewHolder.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.y1, viewGroup2, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int b2 = p.b(viewGroup.getContext());
        if (getItemCount() <= 4) {
            layoutParams.width = b2 / 4;
        } else {
            layoutParams.width = (b2 * 2) / 9;
        }
        inflate.setLayoutParams(layoutParams);
        return new PoiTypeViewHolder(inflate, this.f44760c);
    }
}
