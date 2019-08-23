package com.ss.android.ugc.aweme.favorites.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder;
import com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectViewHolder;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.f;

public class CollectPoiAdapter extends BaseAdapter<PoiStruct> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44245a;

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44245a, false, 39400, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new PoiCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yo, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44245a, false, 39400, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SimplePoiInfoStruct simplePoiInfoStruct;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44245a, false, 39399, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44245a, false, 39399, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PoiCollectViewHolder poiCollectViewHolder = (PoiCollectViewHolder) viewHolder;
        PoiStruct poiStruct = (PoiStruct) getData().get(i);
        if (PatchProxy.isSupport(new Object[]{poiStruct}, poiCollectViewHolder, PoiCollectViewHolder.f44390a, false, 39702, new Class[]{PoiStruct.class}, Void.TYPE)) {
            PoiCollectViewHolder poiCollectViewHolder2 = poiCollectViewHolder;
            PatchProxy.accessDispatch(new Object[]{poiStruct}, poiCollectViewHolder2, PoiCollectViewHolder.f44390a, false, 39702, new Class[]{PoiStruct.class}, Void.TYPE);
            return;
        }
        poiCollectViewHolder.f44392c = poiStruct;
        PoiItemViewHolder poiItemViewHolder = poiCollectViewHolder.f44391b;
        if (PatchProxy.isSupport(new Object[]{-1, poiStruct}, poiItemViewHolder, PoiItemViewHolder.f41697a, false, 35701, new Class[]{Integer.TYPE, PoiStruct.class}, Void.TYPE)) {
            ChangeQuickRedirect changeQuickRedirect = PoiItemViewHolder.f41697a;
            PoiItemViewHolder poiItemViewHolder2 = poiItemViewHolder;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(new Object[]{-1, poiStruct}, poiItemViewHolder2, changeQuickRedirect2, false, 35701, new Class[]{Integer.TYPE, PoiStruct.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[]{poiStruct}, poiItemViewHolder, PoiItemViewHolder.f41697a, false, 35705, new Class[]{PoiStruct.class}, SimplePoiInfoStruct.class)) {
                PoiItemViewHolder poiItemViewHolder3 = poiItemViewHolder;
                ChangeQuickRedirect changeQuickRedirect3 = PoiItemViewHolder.f41697a;
                simplePoiInfoStruct = (SimplePoiInfoStruct) PatchProxy.accessDispatch(new Object[]{poiStruct}, poiItemViewHolder3, changeQuickRedirect3, false, 35705, new Class[]{PoiStruct.class}, SimplePoiInfoStruct.class);
            } else {
                simplePoiInfoStruct = new SimplePoiInfoStruct();
                simplePoiInfoStruct.poiId = poiStruct.getPoiId();
                simplePoiInfoStruct.poiName = poiStruct.getPoiName();
                simplePoiInfoStruct.cover = poiStruct.getCoverItem();
                simplePoiInfoStruct.latitude = poiStruct.getPoiLatitude();
                simplePoiInfoStruct.longitude = poiStruct.getPoiLongitude();
                simplePoiInfoStruct.rating = poiStruct.getPoiRating();
                simplePoiInfoStruct.cost = poiStruct.getPoiCost();
                simplePoiInfoStruct.businessAreaName = poiStruct.getPoiBusinessAreaName();
                simplePoiInfoStruct.optionName = poiStruct.getPoiOptionName();
                simplePoiInfoStruct.poiRankDesc = poiStruct.getPoiRankDesc();
                simplePoiInfoStruct.poiVoucher = poiStruct.getPoiVoucher();
                simplePoiInfoStruct.voucherReleaseAreas = poiStruct.getVoucherReleaseAreas();
                if (poiStruct.address != null) {
                    simplePoiInfoStruct.poiAddress = new f(poiStruct.address.getCity());
                    if (TextUtils.isEmpty(poiStruct.getPoiBusinessAreaName())) {
                        simplePoiInfoStruct.businessAreaName = poiStruct.address.getAddress();
                    }
                }
            }
            poiItemViewHolder.a(-1, simplePoiInfoStruct);
        }
        poiCollectViewHolder.a();
    }
}
