package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.f;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;
import com.ss.android.ugc.aweme.views.m;

public class PoiItemViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41697a;

    /* renamed from: b  reason: collision with root package name */
    a f41698b;

    /* renamed from: c  reason: collision with root package name */
    private Context f41699c;
    @BindView(2131493811)
    ViewGroup mPoiCouponContainer;
    @BindView(2131493813)
    DmtTextView mPoiCouponDesc;
    @BindView(2131496274)
    DmtTextView mPoiDistance;
    @BindView(2131496290)
    SmartAnimatedImageView mPoiImg;
    @BindView(2131496292)
    ImageView mPoiImgPlaceHolder;
    @BindView(2131496303)
    DmtTextView mPoiName;
    @BindView(2131496306)
    DmtTextView mPoiOption;
    @BindView(2131496308)
    DmtTextView mPoiPerPrice;
    @BindView(2131496313)
    DmtTextView mPoiRankDesc;
    @BindView(2131496366)
    DmtTextView mPoiType;
    @BindView(2131496369)
    View mPoiTypeLayout;
    @BindView(2131497206)
    View spaceView;

    private boolean a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f41697a, false, 35703, new Class[]{f.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fVar2}, this, f41697a, false, 35703, new Class[]{f.class}, Boolean.TYPE)).booleanValue();
        }
        NearbyCities.CityBean c2 = c.c();
        if (c2 == null) {
            return false;
        }
        if (!TextUtils.isEmpty(fVar2.cityCode) && TextUtils.equals(fVar2.cityCode, c2.code)) {
            return true;
        }
        if (TextUtils.isEmpty(fVar2.city) || TextUtils.isEmpty(c2.name)) {
            return false;
        }
        if (fVar2.city.contains(c2.name) || c2.name.contains(fVar2.city)) {
            return true;
        }
        return false;
    }

    private void a(SimplePoiInfoStruct simplePoiInfoStruct) {
        if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct}, this, f41697a, false, 35704, new Class[]{SimplePoiInfoStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct}, this, f41697a, false, 35704, new Class[]{SimplePoiInfoStruct.class}, Void.TYPE);
            return;
        }
        this.mPoiTypeLayout.setVisibility(8);
        if (!TextUtils.isEmpty(simplePoiInfoStruct.businessAreaName)) {
            this.mPoiType.setText(com.ss.android.ugc.aweme.base.utils.a.a(this.f41699c, simplePoiInfoStruct.businessAreaName, simplePoiInfoStruct.getPositionInAddress()));
            this.mPoiType.setVisibility(0);
            this.mPoiTypeLayout.setVisibility(0);
        } else {
            this.mPoiType.setVisibility(8);
        }
        if (!TextUtils.isEmpty(simplePoiInfoStruct.optionName)) {
            this.mPoiOption.setText(simplePoiInfoStruct.optionName);
            this.mPoiOption.setVisibility(0);
            this.mPoiTypeLayout.setVisibility(0);
            return;
        }
        this.mPoiOption.setVisibility(8);
    }

    public PoiItemViewHolder(View view, a aVar) {
        this.f41699c = view.getContext();
        this.f41698b = aVar;
        ButterKnife.bind((Object) this, view);
    }

    public final void a(int i, SimplePoiInfoStruct simplePoiInfoStruct) {
        SimplePoiInfoStruct simplePoiInfoStruct2 = simplePoiInfoStruct;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), simplePoiInfoStruct2}, this, f41697a, false, 35702, new Class[]{Integer.TYPE, SimplePoiInfoStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), simplePoiInfoStruct2}, this, f41697a, false, 35702, new Class[]{Integer.TYPE, SimplePoiInfoStruct.class}, Void.TYPE);
            return;
        }
        if (i == 0) {
            this.spaceView.setVisibility(0);
        } else {
            this.spaceView.setVisibility(8);
        }
        if (simplePoiInfoStruct2.cover == null || CollectionUtils.isEmpty(simplePoiInfoStruct2.cover.getUrlList())) {
            this.mPoiImg.setImageResource(C0906R.color.a0i);
            this.mPoiImgPlaceHolder.setVisibility(0);
        } else {
            m.a((SmartImageView) this.mPoiImg, simplePoiInfoStruct2.cover, 288, 192, "poi");
            this.mPoiImgPlaceHolder.setVisibility(8);
        }
        String str = simplePoiInfoStruct2.poiName;
        if (!TextUtils.isEmpty(str)) {
            this.mPoiName.setText(com.ss.android.ugc.aweme.base.utils.a.a(this.f41699c, str, simplePoiInfoStruct.getPositionInName()));
        }
        int i2 = (int) simplePoiInfoStruct2.cost;
        if (i2 == 0) {
            this.mPoiPerPrice.setVisibility(8);
        } else {
            this.mPoiPerPrice.setText(String.format(this.f41699c.getResources().getString(C0906R.string.bo9), new Object[]{String.valueOf(i2)}));
            this.mPoiPerPrice.setVisibility(0);
        }
        this.mPoiTypeLayout.setVisibility(8);
        if (TextUtils.isEmpty(simplePoiInfoStruct2.poiRankDesc)) {
            this.mPoiRankDesc.setVisibility(8);
            a(simplePoiInfoStruct2);
        } else {
            this.mPoiRankDesc.setVisibility(0);
            this.mPoiRankDesc.setText(simplePoiInfoStruct2.poiRankDesc);
        }
        if (simplePoiInfoStruct2.poiAddress == null || a(simplePoiInfoStruct2.poiAddress)) {
            if (this.f41698b != null && this.f41698b.isValid() && !TextUtils.isEmpty(simplePoiInfoStruct2.latitude) && !TextUtils.isEmpty(simplePoiInfoStruct2.longitude)) {
                this.mPoiDistance.setText(com.ss.android.ugc.aweme.poi.e.c.a(this.f41699c, this.f41698b.latitude, this.f41698b.longitude, Double.valueOf(simplePoiInfoStruct2.latitude).doubleValue(), Double.valueOf(simplePoiInfoStruct2.longitude).doubleValue()));
                this.mPoiDistance.setVisibility(0);
            } else if (TextUtils.isEmpty(simplePoiInfoStruct.getCity())) {
                this.mPoiDistance.setVisibility(8);
            } else {
                this.mPoiDistance.setText(simplePoiInfoStruct.getCity());
                this.mPoiDistance.setVisibility(0);
            }
        } else if (TextUtils.isEmpty(simplePoiInfoStruct.getCity())) {
            this.mPoiDistance.setVisibility(8);
        } else {
            this.mPoiDistance.setText(simplePoiInfoStruct.getCity());
            this.mPoiDistance.setVisibility(0);
        }
        if (TextUtils.isEmpty(simplePoiInfoStruct2.poiVoucher) || !p.a(simplePoiInfoStruct2.voucherReleaseAreas)) {
            this.mPoiCouponContainer.setVisibility(8);
            return;
        }
        this.mPoiCouponContainer.setVisibility(0);
        this.mPoiCouponDesc.setText(simplePoiInfoStruct2.poiVoucher);
    }
}
