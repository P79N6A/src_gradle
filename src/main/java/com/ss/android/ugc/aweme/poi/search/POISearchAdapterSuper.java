package com.ss.android.ugc.aweme.poi.search;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.List;

public class POISearchAdapterSuper extends BaseAdapter<PoiStruct> implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60310a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f60311b;

    /* renamed from: c  reason: collision with root package name */
    private String f60312c;

    /* renamed from: d  reason: collision with root package name */
    private PoiStruct f60313d;

    /* renamed from: e  reason: collision with root package name */
    private int f60314e;

    public final void a(PoiStruct poiStruct) {
        this.f60313d = poiStruct;
    }

    public final void a(String str) {
        this.f60312c = str;
    }

    public int getBasicItemViewType(int i) {
        if (!this.f60311b && i == this.f60314e && this.f60313d != null) {
            return 1;
        }
        return 0;
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f60310a, false, 65712, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f60310a, false, 65712, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        this.mTextColor = ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zx);
        return super.onCreateFooterViewHolder(viewGroup);
    }

    public void setData(List<PoiStruct> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f60310a, false, 65713, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f60310a, false, 65713, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f60313d != null && (CollectionUtils.isEmpty(list) || !this.f60313d.poiId.equals(list.get(0).poiId))) {
            list.add(this.f60314e, this.f60313d);
        }
        super.setData(list);
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60310a, false, 65711, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f60310a, false, 65711, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 0) {
            return new POISearchViewHolderSuper(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yv, viewGroup, false), this.f60311b);
        } else {
            return new POISearchOtherViewHolderSuper(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yw, viewGroup, false), this.f60311b);
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        SpannableString spannableString;
        int i4 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f60310a, false, 65710, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f60310a, false, 65710, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getBasicItemViewType(i4) == 0) {
            POISearchViewHolderSuper pOISearchViewHolderSuper = (POISearchViewHolderSuper) viewHolder;
            PoiStruct poiStruct = (PoiStruct) this.mItems.get(i4);
            String str = this.f60312c;
            if (PatchProxy.isSupport(new Object[]{poiStruct, Integer.valueOf(i), str}, pOISearchViewHolderSuper, POISearchViewHolderSuper.f60321a, false, 65736, new Class[]{PoiStruct.class, Integer.TYPE, String.class}, Void.TYPE)) {
                POISearchViewHolderSuper pOISearchViewHolderSuper2 = pOISearchViewHolderSuper;
                PatchProxy.accessDispatch(new Object[]{poiStruct, Integer.valueOf(i), str}, pOISearchViewHolderSuper2, POISearchViewHolderSuper.f60321a, false, 65736, new Class[]{PoiStruct.class, Integer.TYPE, String.class}, Void.TYPE);
            } else {
                if (poiStruct != null) {
                    pOISearchViewHolderSuper.f60326f = poiStruct;
                    pOISearchViewHolderSuper.g = str;
                    pOISearchViewHolderSuper.h = i4;
                    if (i4 != 0 || !StringUtils.isEmpty(str)) {
                        pOISearchViewHolderSuper.f60325e.setVisibility(8);
                    } else {
                        pOISearchViewHolderSuper.f60325e.setVisibility(0);
                    }
                    if (pOISearchViewHolderSuper.i) {
                        pOISearchViewHolderSuper.f60325e.setVisibility(8);
                    }
                    if (StringUtils.isEmpty(str) || StringUtils.isEmpty(pOISearchViewHolderSuper.f60326f.poiName) || !pOISearchViewHolderSuper.f60326f.poiName.contains(str)) {
                        pOISearchViewHolderSuper.f60322b.setText(pOISearchViewHolderSuper.f60326f.poiName);
                    } else {
                        TextView textView = pOISearchViewHolderSuper.f60322b;
                        String str2 = pOISearchViewHolderSuper.f60326f.poiName;
                        if (PatchProxy.isSupport(new Object[]{str2, str}, pOISearchViewHolderSuper, POISearchViewHolderSuper.f60321a, false, 65737, new Class[]{String.class, String.class}, SpannableString.class)) {
                            POISearchViewHolderSuper pOISearchViewHolderSuper3 = pOISearchViewHolderSuper;
                            spannableString = (SpannableString) PatchProxy.accessDispatch(new Object[]{str2, str}, pOISearchViewHolderSuper3, POISearchViewHolderSuper.f60321a, false, 65737, new Class[]{String.class, String.class}, SpannableString.class);
                        } else {
                            SpannableString spannableString2 = new SpannableString(str2);
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(GlobalContext.getContext().getResources().getColor(C0906R.color.a1s));
                            int indexOf = str2.indexOf(str);
                            int indexOf2 = str2.indexOf(str) + str.length();
                            if (PatchProxy.isSupport(new Object[]{spannableString2, foregroundColorSpan, Integer.valueOf(indexOf), Integer.valueOf(indexOf2), 0}, null, j.f60347a, true, 65739, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{spannableString2, foregroundColorSpan, Integer.valueOf(indexOf), Integer.valueOf(indexOf2), 0}, null, j.f60347a, true, 65739, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            } else {
                                spannableString2.setSpan(foregroundColorSpan, indexOf, indexOf2, 0);
                            }
                            spannableString = spannableString2;
                        }
                        textView.setText(spannableString);
                    }
                    if (pOISearchViewHolderSuper.f60326f.address == null || TextUtils.isEmpty(pOISearchViewHolderSuper.f60326f.address.getSimpleAddr())) {
                        i3 = 8;
                        pOISearchViewHolderSuper.f60323c.setVisibility(8);
                    } else {
                        pOISearchViewHolderSuper.f60323c.setText(pOISearchViewHolderSuper.f60326f.address.getSimpleAddr());
                        pOISearchViewHolderSuper.f60323c.setVisibility(0);
                        i3 = 8;
                    }
                    if (!TextUtils.isEmpty(pOISearchViewHolderSuper.g)) {
                        pOISearchViewHolderSuper.f60324d.setVisibility(i3);
                    } else {
                        pOISearchViewHolderSuper.f60324d.setVisibility(0);
                        pOISearchViewHolderSuper.f60324d.setText(pOISearchViewHolderSuper.f60326f.distance);
                    }
                }
            }
        } else {
            POISearchOtherViewHolderSuper pOISearchOtherViewHolderSuper = (POISearchOtherViewHolderSuper) viewHolder;
            PoiStruct poiStruct2 = (PoiStruct) this.mItems.get(i4);
            String str3 = this.f60312c;
            if (PatchProxy.isSupport(new Object[]{poiStruct2, Integer.valueOf(i), str3}, pOISearchOtherViewHolderSuper, POISearchOtherViewHolderSuper.f60315a, false, 65733, new Class[]{PoiStruct.class, Integer.TYPE, String.class}, Void.TYPE)) {
                Object[] objArr = {poiStruct2, Integer.valueOf(i), str3};
                ChangeQuickRedirect changeQuickRedirect = POISearchOtherViewHolderSuper.f60315a;
                POISearchOtherViewHolderSuper pOISearchOtherViewHolderSuper2 = pOISearchOtherViewHolderSuper;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, pOISearchOtherViewHolderSuper2, changeQuickRedirect2, false, 65733, new Class[]{PoiStruct.class, Integer.TYPE, String.class}, Void.TYPE);
            } else if (poiStruct2 != null) {
                pOISearchOtherViewHolderSuper.i = i4;
                pOISearchOtherViewHolderSuper.g = poiStruct2;
                pOISearchOtherViewHolderSuper.h = str3;
                pOISearchOtherViewHolderSuper.f60317c.setText(poiStruct2.getPoiName());
                if (i4 != 0 || !StringUtils.isEmpty(str3)) {
                    i2 = 8;
                    pOISearchOtherViewHolderSuper.f60320f.setVisibility(8);
                } else {
                    pOISearchOtherViewHolderSuper.f60320f.setVisibility(0);
                    i2 = 8;
                }
                if (pOISearchOtherViewHolderSuper.j) {
                    pOISearchOtherViewHolderSuper.f60320f.setVisibility(i2);
                }
                pOISearchOtherViewHolderSuper.f60316b.setVisibility(i2);
                pOISearchOtherViewHolderSuper.f60318d.setVisibility(i2);
                pOISearchOtherViewHolderSuper.f60319e.setVisibility(0);
            }
        }
    }
}
