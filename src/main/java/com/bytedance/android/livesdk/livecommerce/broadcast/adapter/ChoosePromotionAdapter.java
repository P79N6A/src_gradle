package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.ChoosePromotionViewModel;
import com.bytedance.android.livesdk.livecommerce.c.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class ChoosePromotionAdapter extends RecyclerView.Adapter<PromotionViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15985a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends f> f15986b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private ChoosePromotionViewModel f15987c;

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f15985a, false, 10499, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15985a, false, 10499, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15986b != null) {
            return this.f15986b.size();
        } else {
            return 0;
        }
    }

    public ChoosePromotionAdapter(ChoosePromotionViewModel choosePromotionViewModel) {
        this.f15987c = choosePromotionViewModel;
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f15985a, false, 10500, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f15985a, false, 10500, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == this.f15986b.size() - 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        PromotionViewHolder promotionViewHolder = (PromotionViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{promotionViewHolder, Integer.valueOf(i)}, this, f15985a, false, 10497, new Class[]{PromotionViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{promotionViewHolder, Integer.valueOf(i)}, this, f15985a, false, 10497, new Class[]{PromotionViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        promotionViewHolder.a((f) this.f15986b.get(i2), i2, false);
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f15985a, false, 10496, new Class[]{ViewGroup.class, Integer.TYPE}, PromotionViewHolder.class)) {
            return (PromotionViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f15985a, false, 10496, new Class[]{ViewGroup.class, Integer.TYPE}, PromotionViewHolder.class);
        } else if (i == 2) {
            return new FooterHolder(viewGroup2);
        } else {
            return new ChoosePromotionViewHolder(viewGroup2, this.f15987c);
        }
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List list) {
        int i2 = i;
        List list2 = list;
        PromotionViewHolder promotionViewHolder = (PromotionViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{promotionViewHolder, Integer.valueOf(i), list2}, this, f15985a, false, 10498, new Class[]{PromotionViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{promotionViewHolder, Integer.valueOf(i), list2}, this, f15985a, false, 10498, new Class[]{PromotionViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        super.onBindViewHolder(promotionViewHolder, i2, list2);
        promotionViewHolder.a((f) this.f15986b.get(i2), i2, true);
    }
}
