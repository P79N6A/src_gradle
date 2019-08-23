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

public class RankingListVideoAdapter extends BaseHotSearchAdapter<HotVideoItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49661f;
    private f<Aweme> g;
    private int h;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b() {
        if (!PatchProxy.isSupport(new Object[0], this, f49661f, false, 49603, new Class[0], HotVideoItem.class)) {
            return new HotVideoItem();
        }
        return (HotVideoItem) PatchProxy.accessDispatch(new Object[0], this, f49661f, false, 49603, new Class[0], HotVideoItem.class);
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup}, this, f49661f, false, 49602, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new RankingListVideoItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vo, viewGroup, false), this.g, this.h);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f49661f, false, 49602, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f49661f, false, 49604, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f49661f, false, 49604, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            ((RankingListVideoItemViewHolder) viewHolder).d(true);
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f49661f, false, 49605, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f49661f, false, 49605, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            ((RankingListVideoItemViewHolder) viewHolder).d(false);
        }
    }

    public RankingListVideoAdapter(Context context, f<Aweme> fVar, int i) {
        super(context);
        this.g = fVar;
        this.h = i;
    }
}
