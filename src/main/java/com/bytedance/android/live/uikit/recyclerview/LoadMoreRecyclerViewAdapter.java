package com.bytedance.android.live.uikit.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class LoadMoreRecyclerViewAdapter extends RecyclerViewWithFooterAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8576a;

    /* renamed from: b  reason: collision with root package name */
    public LoadMoreViewHolder f8577b;

    /* renamed from: c  reason: collision with root package name */
    public a f8578c;

    public class LoadMoreViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8581a;

        public LoadMoreViewHolder(View view) {
            super(view);
        }
    }

    public interface a {
        void a(boolean z);
    }

    public final int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f8576a, false, 2119, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8576a, false, 2119, new Class[0], Integer.TYPE)).intValue();
        } else if (a() == 0) {
            return 0;
        } else {
            return super.getItemCount();
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f8576a, false, 2115, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f8576a, false, 2115, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else if (viewHolder2 instanceof LoadMoreViewHolder) {
            LoadMoreViewHolder loadMoreViewHolder = (LoadMoreViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f8581a, false, 2125, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f8581a, false, 2125, new Class[0], Void.TYPE);
            } else {
                if (((LoadingStatusView) loadMoreViewHolder.itemView).f8585c == -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && LoadMoreRecyclerViewAdapter.this.f8578c != null) {
                    LoadMoreRecyclerViewAdapter.this.f8578c.a(false);
                }
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.f8577b.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            this.f8577b.itemView.setLayoutParams(layoutParams);
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        int dimensionPixelSize;
        RecyclerView.LayoutParams layoutParams;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f8576a, false, 2116, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f8576a, false, 2116, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f8576a, false, 2118, new Class[]{View.class}, Integer.TYPE)) {
            dimensionPixelSize = ((Integer) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f8576a, false, 2118, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else {
            dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(C0906R.dimen.di);
        }
        int i = dimensionPixelSize;
        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(C0906R.dimen.dj);
        if (PatchProxy.isSupport(new Object[]{-1, Integer.valueOf(i)}, this, f8576a, false, 2117, new Class[]{Integer.TYPE, Integer.TYPE}, RecyclerView.LayoutParams.class)) {
            layoutParams = (RecyclerView.LayoutParams) PatchProxy.accessDispatch(new Object[]{-1, Integer.valueOf(i)}, this, f8576a, false, 2117, new Class[]{Integer.TYPE, Integer.TYPE}, RecyclerView.LayoutParams.class);
        } else {
            layoutParams = new RecyclerView.LayoutParams(-1, i);
        }
        loadingStatusView.setLayoutParams(layoutParams);
        LoadingStatusView.a aVar = new LoadingStatusView.a(viewGroup.getContext());
        aVar.a(dimensionPixelSize2).a(C0906R.string.b6x, new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8579a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f8579a, false, 2123, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f8579a, false, 2123, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (LoadMoreRecyclerViewAdapter.this.f8578c != null) {
                    LoadMoreRecyclerViewAdapter.this.f8578c.a(true);
                }
            }
        });
        aVar.a(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a_d, viewGroup2, false));
        loadingStatusView.setBuilder(aVar);
        this.f8577b = new LoadMoreViewHolder(loadingStatusView);
        return this.f8577b;
    }
}
