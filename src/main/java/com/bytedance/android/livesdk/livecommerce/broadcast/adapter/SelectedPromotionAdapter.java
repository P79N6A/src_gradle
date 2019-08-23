package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livecommerce.b.a;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.SelectedPromotionViewModel;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class SelectedPromotionAdapter extends RecyclerView.Adapter<SelectedPromotionViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16017a;

    /* renamed from: b  reason: collision with root package name */
    public List<e> f16018b;

    /* renamed from: c  reason: collision with root package name */
    private SelectedPromotionViewModel f16019c;

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f16017a, false, 10525, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16017a, false, 10525, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f16018b != null) {
            return this.f16018b.size();
        } else {
            return 0;
        }
    }

    public SelectedPromotionAdapter(SelectedPromotionViewModel selectedPromotionViewModel) {
        this.f16019c = selectedPromotionViewModel;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f16017a, false, 10523, new Class[]{ViewGroup.class, Integer.TYPE}, SelectedPromotionViewHolder.class)) {
            return new SelectedPromotionViewHolder(viewGroup2, this.f16019c);
        }
        return (SelectedPromotionViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f16017a, false, 10523, new Class[]{ViewGroup.class, Integer.TYPE}, SelectedPromotionViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        SelectedPromotionViewHolder selectedPromotionViewHolder = (SelectedPromotionViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{selectedPromotionViewHolder, Integer.valueOf(i)}, this, f16017a, false, 10524, new Class[]{SelectedPromotionViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{selectedPromotionViewHolder, Integer.valueOf(i)}, this, f16017a, false, 10524, new Class[]{SelectedPromotionViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        e eVar = this.f16018b.get(i2);
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, selectedPromotionViewHolder, SelectedPromotionViewHolder.f16020a, false, 10527, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, selectedPromotionViewHolder, SelectedPromotionViewHolder.f16020a, false, 10527, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (eVar != null) {
            selectedPromotionViewHolder.g = eVar;
            selectedPromotionViewHolder.f16025f = i2;
            a.a(selectedPromotionViewHolder.f16022c, eVar.n, selectedPromotionViewHolder.g.f16130e);
            selectedPromotionViewHolder.f16023d.setText(eVar.f16126a);
            selectedPromotionViewHolder.f16024e.setPriceText(eVar.o);
            selectedPromotionViewHolder.f16021b.setNum(eVar.h);
        }
    }
}
