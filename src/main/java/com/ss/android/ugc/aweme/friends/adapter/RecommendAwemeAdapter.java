package com.ss.android.ugc.aweme.friends.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem;

public class RecommendAwemeAdapter extends BaseAdapter<RecommendAwemeItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48744a;

    /* renamed from: b  reason: collision with root package name */
    public int f48745b;

    /* renamed from: c  reason: collision with root package name */
    public RecommendAwemeViewHolder.a f48746c;

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f48744a, false, 46325, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f48744a, false, 46325, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof RecommendAwemeViewHolder) {
            ((RecommendAwemeViewHolder) viewHolder2).a(true);
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f48744a, false, 46326, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f48744a, false, 46326, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder2 instanceof RecommendAwemeViewHolder) {
            ((RecommendAwemeViewHolder) viewHolder2).a(false);
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f48744a, false, 46323, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f48744a, false, 46323, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof RecommendAwemeViewHolder) {
            ((RecommendAwemeViewHolder) viewHolder2).a((RecommendAwemeItem) getData().get(i), this.f48745b);
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48744a, false, 46324, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48744a, false, 46324, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        RecommendAwemeViewHolder recommendAwemeViewHolder = new RecommendAwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.s7, viewGroup2, false));
        recommendAwemeViewHolder.f48749c = this.f48746c;
        int measuredWidth = (viewGroup.getMeasuredWidth() - u.a(8.0d)) / 3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(measuredWidth)}, recommendAwemeViewHolder, RecommendAwemeViewHolder.f48747a, false, 46328, new Class[]{Integer.TYPE}, Void.TYPE)) {
            RecommendAwemeViewHolder recommendAwemeViewHolder2 = recommendAwemeViewHolder;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(measuredWidth)}, recommendAwemeViewHolder2, RecommendAwemeViewHolder.f48747a, false, 46328, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            recommendAwemeViewHolder.f48748b = measuredWidth;
            if (recommendAwemeViewHolder.f48748b > 0) {
                ViewGroup.LayoutParams layoutParams = recommendAwemeViewHolder.itemView.getLayoutParams();
                layoutParams.width = recommendAwemeViewHolder.f48748b;
                layoutParams.height = recommendAwemeViewHolder.f48748b;
                recommendAwemeViewHolder.itemView.setLayoutParams(layoutParams);
            }
        }
        return recommendAwemeViewHolder;
    }
}
