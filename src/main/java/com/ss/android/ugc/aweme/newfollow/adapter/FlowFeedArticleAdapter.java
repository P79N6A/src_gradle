package com.ss.android.ugc.aweme.newfollow.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.newfollow.e.a;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedArticleItemViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedArticleViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.l;

public class FlowFeedArticleAdapter extends BaseAdapter<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57065a;

    /* renamed from: b  reason: collision with root package name */
    private FlowFeedArticleViewHolder.a f57066b;

    public FlowFeedArticleAdapter(FlowFeedArticleViewHolder.a aVar) {
        this.f57066b = aVar;
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f57065a, false, 61058, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f57065a, false, 61058, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        FlowFeedArticleItemViewHolder flowFeedArticleItemViewHolder = (FlowFeedArticleItemViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[0], flowFeedArticleItemViewHolder, FlowFeedArticleItemViewHolder.f57516a, false, 62150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], flowFeedArticleItemViewHolder, FlowFeedArticleItemViewHolder.f57516a, false, 62150, new Class[0], Void.TYPE);
            return;
        }
        if (flowFeedArticleItemViewHolder.f57517b != null) {
            flowFeedArticleItemViewHolder.f57517b.b(flowFeedArticleItemViewHolder.f57518c, flowFeedArticleItemViewHolder.getAdapterPosition());
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f57065a, false, 61057, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new FlowFeedArticleItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ub, viewGroup2, false), this.f57066b);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f57065a, false, 61057, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f57065a, false, 61056, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f57065a, false, 61056, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(viewHolder == null || getData() == null)) {
            FlowFeedArticleItemViewHolder flowFeedArticleItemViewHolder = (FlowFeedArticleItemViewHolder) viewHolder;
            a aVar = (a) getData().get(i);
            if (PatchProxy.isSupport(new Object[]{aVar}, flowFeedArticleItemViewHolder, FlowFeedArticleItemViewHolder.f57516a, false, 62149, new Class[]{a.class}, Void.TYPE)) {
                FlowFeedArticleItemViewHolder flowFeedArticleItemViewHolder2 = flowFeedArticleItemViewHolder;
                PatchProxy.accessDispatch(new Object[]{aVar}, flowFeedArticleItemViewHolder2, FlowFeedArticleItemViewHolder.f57516a, false, 62149, new Class[]{a.class}, Void.TYPE);
            } else if (aVar != null) {
                flowFeedArticleItemViewHolder.f57518c = aVar;
                if (flowFeedArticleItemViewHolder.f57518c.f57096b == null || TextUtils.isEmpty(flowFeedArticleItemViewHolder.f57518c.f57096b.getUri()) || CollectionUtils.isEmpty(flowFeedArticleItemViewHolder.f57518c.f57096b.getUrlList())) {
                    flowFeedArticleItemViewHolder.mImgCover.setVisibility(8);
                } else {
                    flowFeedArticleItemViewHolder.mImgCover.setVisibility(0);
                    c.b(flowFeedArticleItemViewHolder.mImgCover, flowFeedArticleItemViewHolder.f57518c.f57096b);
                }
                flowFeedArticleItemViewHolder.mTvTitle.setText(flowFeedArticleItemViewHolder.f57518c.f57097c);
                flowFeedArticleItemViewHolder.mTvSource.setText(flowFeedArticleItemViewHolder.f57518c.f57099e);
                flowFeedArticleItemViewHolder.mTvReadCount.setText(flowFeedArticleItemViewHolder.mTvReadCount.getResources().getString(C0906R.string.g1, new Object[]{b.a((long) flowFeedArticleItemViewHolder.f57518c.f57100f)}));
                flowFeedArticleItemViewHolder.itemView.setOnClickListener(new l(flowFeedArticleItemViewHolder));
            }
        }
    }
}
