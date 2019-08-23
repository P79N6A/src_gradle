package com.ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.al;
import com.ss.android.ugc.aweme.poi.preview.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RecommendImageAdapter extends RecyclerView.Adapter<CoverViewHolder> implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59443a;

    /* renamed from: b  reason: collision with root package name */
    private Context f59444b;

    /* renamed from: c  reason: collision with root package name */
    private List<al> f59445c;

    /* renamed from: d  reason: collision with root package name */
    private a f59446d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f59447e;

    /* renamed from: f  reason: collision with root package name */
    private c f59448f;

    protected static class CoverViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59449a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f59450b;

        /* renamed from: c  reason: collision with root package name */
        TextView f59451c;

        /* renamed from: d  reason: collision with root package name */
        TextView f59452d;

        /* renamed from: e  reason: collision with root package name */
        b f59453e;

        public CoverViewHolder(View view, b bVar) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f59453e = bVar;
            this.f59451c = (TextView) view.findViewById(C0906R.id.c1q);
            this.f59450b = (RemoteImageView) view.findViewById(C0906R.id.c1o);
            this.f59452d = (TextView) view.findViewById(C0906R.id.c1p);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f59443a, false, 64779, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59443a, false, 64779, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f59445c == null) {
            return 0;
        } else {
            return this.f59445c.size();
        }
    }

    public final void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59443a, false, 64780, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59443a, false, 64780, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a.a("recommend", this.f59445c.get(i2).getTagType(), this.f59448f);
        if (this.f59446d == null) {
            this.f59446d = a.a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (al next : this.f59445c) {
                arrayList.add(next.getMedium());
                arrayList2.add(next.getLarge());
                arrayList3.add(next.title);
                sb.append(next.getTagType());
                sb.append("-");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "poi_page");
            hashMap.put("poi_id", this.f59448f.getPoiId());
            hashMap.put("page_type", "recommend");
            hashMap.put("poi_type", this.f59448f.getPoiType());
            hashMap.put("group_id", this.f59448f.getAwemeId());
            hashMap.put("previous_page", this.f59448f.getPreviousPage());
            hashMap.put("pic_tag", sb.toString());
            h.a(hashMap, this.f59448f);
            this.f59446d.a(this.f59444b, arrayList, arrayList2, arrayList3, this.f59447e, C0906R.id.c1o, this.f59448f.getPoiId(), "recommend", hashMap);
        }
        this.f59446d.a("tag_poi_picture", i2, getItemCount());
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59443a, false, 64777, new Class[]{ViewGroup.class, Integer.TYPE}, CoverViewHolder.class)) {
            return new CoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yn, viewGroup2, false), this);
        }
        return (CoverViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59443a, false, 64777, new Class[]{ViewGroup.class, Integer.TYPE}, CoverViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        CoverViewHolder coverViewHolder = (CoverViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{coverViewHolder, Integer.valueOf(i)}, this, f59443a, false, 64778, new Class[]{CoverViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coverViewHolder, Integer.valueOf(i)}, this, f59443a, false, 64778, new Class[]{CoverViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        al alVar = this.f59445c.get(i2);
        if (PatchProxy.isSupport(new Object[]{alVar, Integer.valueOf(i)}, coverViewHolder, CoverViewHolder.f59449a, false, 64781, new Class[]{al.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{alVar, Integer.valueOf(i)}, coverViewHolder, CoverViewHolder.f59449a, false, 64781, new Class[]{al.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (alVar != null) {
            com.ss.android.ugc.aweme.base.c.a(coverViewHolder.f59450b, alVar.getPicMedium(), 400, 270);
            coverViewHolder.f59451c.setText(alVar.title);
            coverViewHolder.f59450b.setOnClickListener(new e(coverViewHolder, i2));
            if (TextUtils.isEmpty(alVar.getTagName())) {
                coverViewHolder.f59452d.setVisibility(8);
            } else {
                coverViewHolder.f59452d.setVisibility(0);
                coverViewHolder.f59452d.setText(alVar.getTagName());
            }
        }
    }

    public RecommendImageAdapter(Context context, RecyclerView recyclerView, List<al> list, c cVar) {
        this.f59444b = context;
        this.f59445c = list;
        this.f59447e = recyclerView;
        this.f59448f = cVar;
    }
}
