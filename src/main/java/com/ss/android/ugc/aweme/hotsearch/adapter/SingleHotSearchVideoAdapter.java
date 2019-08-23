package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.viewholder.RankingListVideoItemViewHolder;
import com.ss.android.ugc.aweme.hotsearch.viewholder.a;

public class SingleHotSearchVideoAdapter extends BaseHotSearchAdapter<HotVideoItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49665f;
    private f<Aweme> g;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b() {
        if (!PatchProxy.isSupport(new Object[0], this, f49665f, false, 49619, new Class[0], HotVideoItem.class)) {
            return new HotVideoItem();
        }
        return (HotVideoItem) PatchProxy.accessDispatch(new Object[0], this, f49665f, false, 49619, new Class[0], HotVideoItem.class);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f49665f, false, 49620, new Class[0], Integer.TYPE)) {
            return this.f49653b.size() + 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49665f, false, 49620, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f49665f, false, 49618, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new RankingListVideoItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vo, viewGroup2, false), this.g);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f49665f, false, 49618, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49665f, false, 49623, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49665f, false, 49623, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == this.f49653b.size()) {
            return 3;
        } else {
            return 0;
        }
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f49665f, false, 49621, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f49665f, false, 49621, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            ((RankingListVideoItemViewHolder) viewHolder).d(true);
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f49665f, false, 49622, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f49665f, false, 49622, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            ((RankingListVideoItemViewHolder) viewHolder).d(false);
        }
    }

    public SingleHotSearchVideoAdapter(Context context, f<Aweme> fVar) {
        super(context);
        this.g = fVar;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49665f, false, 49624, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49665f, false, 49624, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i) == 0) {
            a aVar = (a) viewHolder;
            aVar.a_(a(i), i);
            if (this.f49655d) {
                aVar.a(i);
            }
        }
    }
}
