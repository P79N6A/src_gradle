package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.HashMap;
import java.util.List;

public class InfoStickerAdapterV2 extends AbstractInfoStickerAdapter<EffectCategoryResponse> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f69678d;

    /* renamed from: e  reason: collision with root package name */
    protected FragmentActivity f69679e;

    /* renamed from: f  reason: collision with root package name */
    protected String f69680f;
    protected SparseBooleanArray g = new SparseBooleanArray();
    public SparseArray<ah> h = new SparseArray<>();
    public HashMap<String, InfoStickerHolder> i = new HashMap<>();
    public g j;

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f69678d, false, 79250, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69678d, false, 79250, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f69672b) {
            return 1;
        } else {
            return this.g.size() + 2;
        }
    }

    public int a(int i2) {
        int i3 = 1;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69678d, false, 79249, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69678d, false, 79249, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.g.get(i2 - 1)) {
            i3 = 3;
        }
        return i3;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f69678d, false, 79251, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f69678d, false, 79251, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69681a;

                public int getSpanSize(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69681a, false, 79253, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69681a, false, 79253, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    } else if (InfoStickerAdapterV2.this.getBasicItemViewType(i) == -2 || InfoStickerAdapterV2.this.getBasicItemViewType(i) == -5 || InfoStickerAdapterV2.this.getBasicItemViewType(i) == -4 || InfoStickerAdapterV2.this.getBasicItemViewType(i) == 3 || InfoStickerAdapterV2.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.getSpanCount();
                    } else {
                        return 1;
                    }
                }
            });
        }
    }

    public void setData(List<EffectCategoryResponse> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f69678d, false, 79248, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f69678d, false, 79248, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setData(list);
        if (!Lists.isEmpty(list)) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                EffectCategoryResponse effectCategoryResponse = list.get(i3);
                if (effectCategoryResponse != null && !Lists.isEmpty(effectCategoryResponse.totalEffects)) {
                    int i4 = i2;
                    for (int i5 = 0; i5 < effectCategoryResponse.totalEffects.size(); i5++) {
                        ah a2 = ah.a(effectCategoryResponse.totalEffects.get(i5), effectCategoryResponse.name);
                        if (this.j == null || !this.j.a(a2.f69295b)) {
                            this.g.put(i4, false);
                            this.h.put(i4, a2);
                            i4++;
                        }
                    }
                    if (i3 != size - 1) {
                        this.g.put(i4, true);
                        i2 = i4 + 1;
                    } else {
                        i2 = i4;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull EffectChannelResponse effectChannelResponse) {
        if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f69678d, false, 79247, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f69678d, false, 79247, new Class[]{EffectChannelResponse.class}, Void.TYPE);
        } else if (Lists.isEmpty(effectChannelResponse.categoryResponseList)) {
            int i2 = 0;
            for (int i3 = 0; i3 < effectChannelResponse.allCategoryEffects.size(); i3++) {
                ah a2 = ah.a(effectChannelResponse.allCategoryEffects.get(i3), this.f69680f);
                if (this.j == null || !this.j.a(a2.f69295b)) {
                    this.g.put(i2, false);
                    this.h.put(i2, a2);
                    i2++;
                }
            }
            notifyDataSetChanged();
        } else {
            setData(effectChannelResponse.categoryResponseList);
        }
    }

    InfoStickerAdapterV2(FragmentActivity fragmentActivity, String str) {
        this.f69679e = fragmentActivity;
        this.f69680f = str;
    }

    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f69678d, false, 79243, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f69678d, false, 79243, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        InfoStickerHolder infoStickerHolder = new InfoStickerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ff, viewGroup, false), this);
        infoStickerHolder.f69699d = this.f69673c;
        return infoStickerHolder;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f69678d, false, 79246, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f69678d, false, 79246, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i2 != 3) {
            return super.onCreateBasicViewHolder(viewGroup, i2);
        } else {
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f69678d, false, 79245, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return new InfoStickerDividerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.s4, viewGroup2, false));
            }
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f69678d, false, 79245, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
    }

    public void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f69678d, false, 79244, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f69678d, false, 79244, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (a(i2) == 1) {
            InfoStickerHolder infoStickerHolder = (InfoStickerHolder) viewHolder;
            int i3 = i2 - 1;
            infoStickerHolder.a(this.f69679e, this.h.get(i3), this.f69680f);
            infoStickerHolder.g = i2;
            this.i.put(this.h.get(i3).f69295b.effect_id, infoStickerHolder);
        }
    }
}
