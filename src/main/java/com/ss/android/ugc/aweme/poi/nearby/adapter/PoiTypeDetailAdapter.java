package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;

public class PoiTypeDetailAdapter extends BaseAdapter<SimplePoiInfoStruct> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59989a;

    /* renamed from: b  reason: collision with root package name */
    private a f59990b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.poi.a f59991c = af.a(d.a()).f();

    /* renamed from: d  reason: collision with root package name */
    private boolean f59992d;

    static class PoiTypeDetailViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59993a;

        /* renamed from: b  reason: collision with root package name */
        Context f59994b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f59995c;

        /* renamed from: d  reason: collision with root package name */
        PoiItemViewHolder f59996d;

        /* renamed from: e  reason: collision with root package name */
        a f59997e;

        /* renamed from: f  reason: collision with root package name */
        String f59998f = PushConstants.PUSH_TYPE_NOTIFY;
        SimplePoiInfoStruct g;

        PoiTypeDetailViewHolder(View view, a aVar, com.ss.android.ugc.aweme.poi.a aVar2) {
            super(view);
            this.f59997e = aVar;
            this.f59994b = view.getContext();
            this.f59995c = (ImageView) view.findViewById(C0906R.id.c2l);
            this.f59996d = new PoiItemViewHolder(view, aVar2);
            view.setOnClickListener(new d(this, aVar));
        }
    }

    public interface a {
        void a(SimplePoiInfoStruct simplePoiInfoStruct, String str);
    }

    public PoiTypeDetailAdapter(a aVar, boolean z) {
        this.f59990b = aVar;
        this.f59992d = z;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59989a, false, 65202, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new PoiTypeDetailViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.z1, viewGroup, false), this.f59990b, this.f59991c);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59989a, false, 65202, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f59989a, false, 65203, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f59989a, false, 65203, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PoiTypeDetailViewHolder poiTypeDetailViewHolder = (PoiTypeDetailViewHolder) viewHolder;
        int i2 = i;
        SimplePoiInfoStruct simplePoiInfoStruct = (SimplePoiInfoStruct) this.mItems.get(i2);
        boolean z = this.f59992d;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), simplePoiInfoStruct, Byte.valueOf(z ? (byte) 1 : 0)}, poiTypeDetailViewHolder, PoiTypeDetailViewHolder.f59993a, false, 65204, new Class[]{Integer.TYPE, SimplePoiInfoStruct.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), simplePoiInfoStruct, Byte.valueOf(z)};
            ChangeQuickRedirect changeQuickRedirect = PoiTypeDetailViewHolder.f59993a;
            PoiTypeDetailViewHolder poiTypeDetailViewHolder2 = poiTypeDetailViewHolder;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr, poiTypeDetailViewHolder2, changeQuickRedirect2, false, 65204, new Class[]{Integer.TYPE, SimplePoiInfoStruct.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        poiTypeDetailViewHolder.g = simplePoiInfoStruct;
        poiTypeDetailViewHolder.f59995c.setVisibility(8);
        PoiItemViewHolder poiItemViewHolder = poiTypeDetailViewHolder.f59996d;
        if (!z) {
            i2 = -1;
        }
        poiItemViewHolder.a(i2, simplePoiInfoStruct);
        poiTypeDetailViewHolder.f59998f = PushConstants.PUSH_TYPE_NOTIFY;
    }
}
