package com.ss.android.ugc.aweme.common.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;

public abstract class LoadMoreRecyclerViewAdapter extends RecyclerViewWithFooterAdapter {
    static final String TAG = "LoadMoreRecyclerViewAdapter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int loadEmptyTextResId;
    public int mCurStatus = -1;
    public String mLabel;
    public a mLoadMoreListener;
    private LoadMoreViewHolder mLoadMoreViewHolder;
    private long mLoadStartTime = -1;
    @Nullable
    private RecyclerView mRecyclerView;
    public int mTextColor;
    public GridLayoutManager.SpanSizeLookup spanSizeLookup;
    private TextView textView;

    public interface a {
        void loadMore();
    }

    public class LoadMoreViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40176a;

        /* renamed from: b  reason: collision with root package name */
        PullUpLoadMoreHelper f40177b;

        /* renamed from: c  reason: collision with root package name */
        TextView f40178c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f40176a, false, 33397, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40176a, false, 33397, new Class[0], Void.TYPE);
                return;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            dmtStatusView.setStatus(LoadMoreRecyclerViewAdapter.this.mCurStatus);
            if (dmtStatusView.c() && LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore();
            }
        }

        public LoadMoreViewHolder(View view, TextView textView) {
            super(view);
            this.f40178c = textView;
            textView.setOnClickListener(new c(this));
        }
    }

    public void setLoadingPadding(View view) {
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33389, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33389, new Class[0], Integer.TYPE)).intValue();
        } else if (getBasicItemCount() == 0) {
            return 0;
        } else {
            return super.getItemCount();
        }
    }

    @Deprecated
    public void showLoadMoreError() {
        if (this.mLoadMoreViewHolder != null) {
            LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
            if (PatchProxy.isSupport(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33399, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33399, new Class[0], Void.TYPE);
            } else {
                ((DmtStatusView) loadMoreViewHolder.itemView).f();
            }
        }
        this.mCurStatus = 2;
    }

    public void showPullUpLoadMore() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33391, new Class[0], Void.TYPE);
            return;
        }
        if (this.mRecyclerView != null) {
            showPullUpLoadMore(this.mRecyclerView, true);
        }
    }

    public void resetLoadMoreState() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33394, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLoadMoreViewHolder != null) {
            LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
            if (PatchProxy.isSupport(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33402, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33402, new Class[0], Void.TYPE);
            } else {
                ((DmtStatusView) loadMoreViewHolder.itemView).b();
            }
        }
        this.mCurStatus = -1;
        this.mLoadStartTime = -1;
    }

    public void showLoadMoreEmpty() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33393, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLoadMoreViewHolder != null) {
            LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
            if (PatchProxy.isSupport(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33401, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33401, new Class[0], Void.TYPE);
            } else {
                ((DmtStatusView) loadMoreViewHolder.itemView).e();
            }
        }
        this.mCurStatus = 1;
    }

    public void showLoadMoreLoading() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33390, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLoadMoreViewHolder != null) {
            LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
            if (PatchProxy.isSupport(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33398, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33398, new Class[0], Void.TYPE);
            } else {
                ((DmtStatusView) loadMoreViewHolder.itemView).d();
            }
        }
        this.mCurStatus = 0;
        if (this.mLoadStartTime == -1) {
            this.mLoadStartTime = System.currentTimeMillis();
        }
    }

    public void setLoadMoreListener(a aVar) {
        this.mLoadMoreListener = aVar;
    }

    public void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, changeQuickRedirect, false, 33383, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, changeQuickRedirect, false, 33383, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ((LoadMoreViewHolder) viewHolder).a();
    }

    public int getLoadMoreHeight(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 33388, new Class[]{View.class}, Integer.TYPE)) {
            return view.getResources().getDimensionPixelSize(C0906R.dimen.di);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 33388, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, changeQuickRedirect, false, 33384, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, changeQuickRedirect, false, 33384, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40173a;

                public int getSpanSize(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40173a, false, 33396, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40173a, false, 33396, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                    } else if (LoadMoreRecyclerViewAdapter.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.getSpanCount();
                    } else {
                        if (LoadMoreRecyclerViewAdapter.this.spanSizeLookup != null) {
                            return LoadMoreRecyclerViewAdapter.this.spanSizeLookup.getSpanSize(i);
                        }
                        return 1;
                    }
                }
            });
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, changeQuickRedirect, false, 33386, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, changeQuickRedirect, false, 33386, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder2.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) != Integer.MIN_VALUE) {
                z = false;
            }
            layoutParams2.setFullSpan(z);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, changeQuickRedirect, false, 33385, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, changeQuickRedirect, false, 33385, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (this.mLoadStartTime != -1 && !TextUtils.isEmpty(this.mLabel)) {
            n.b("aweme_feed_load_more_duration", this.mLabel, (float) (System.currentTimeMillis() - this.mLoadStartTime));
            this.mLoadStartTime = -1;
        }
    }

    public void setLoadEmptyTextResId(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 33395, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 33395, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.textView != null) {
            this.textView.setText(i);
        }
        this.loadEmptyTextResId = i;
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, changeQuickRedirect, false, 33387, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, changeQuickRedirect, false, 33387, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        int loadMoreHeight = getLoadMoreHeight(viewGroup);
        setLoadingPadding(dmtStatusView);
        dmtStatusView.setLayoutParams(new RecyclerView.LayoutParams(-1, loadMoreHeight));
        this.textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqm, null);
        if (this.mTextColor != 0) {
            this.textView.setTextColor(this.mTextColor);
        }
        if (this.loadEmptyTextResId != 0) {
            this.textView.setText(this.loadEmptyTextResId);
        }
        this.textView.setGravity(17);
        TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqo, null);
        textView2.setText(C0906R.string.b6x);
        textView2.setGravity(17);
        dmtStatusView.setBuilder(DmtStatusView.a.a(viewGroup.getContext()).b((View) this.textView).c((View) textView2));
        this.mLoadMoreViewHolder = new LoadMoreViewHolder(dmtStatusView, textView2);
        return this.mLoadMoreViewHolder;
    }

    public void showPullUpLoadMore(RecyclerView recyclerView, boolean z) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 33392, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 33392, new Class[]{RecyclerView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mLoadMoreViewHolder != null) {
            LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
            if (PatchProxy.isSupport(new Object[]{recyclerView2}, loadMoreViewHolder, LoadMoreViewHolder.f40176a, false, 33400, new Class[]{RecyclerView.class}, Void.TYPE)) {
                LoadMoreViewHolder loadMoreViewHolder2 = loadMoreViewHolder;
                PatchProxy.accessDispatch(new Object[]{recyclerView2}, loadMoreViewHolder2, LoadMoreViewHolder.f40176a, false, 33400, new Class[]{RecyclerView.class}, Void.TYPE);
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) loadMoreViewHolder.itemView;
                if (!TextUtils.equals(loadMoreViewHolder.f40178c.getText(), loadMoreViewHolder.f40178c.getResources().getString(C0906R.string.btk))) {
                    loadMoreViewHolder.f40178c.setText(C0906R.string.btk);
                }
                dmtStatusView.f();
                if (loadMoreViewHolder.f40177b == null) {
                    loadMoreViewHolder.f40177b = new PullUpLoadMoreHelper(recyclerView2, LoadMoreRecyclerViewAdapter.this.mLoadMoreListener);
                }
                loadMoreViewHolder.f40177b.f40181b = true;
            }
        }
        this.mCurStatus = 2;
        if (z) {
            com.bytedance.ies.dmt.ui.d.a.b(recyclerView.getContext(), (int) C0906R.string.b6w).a();
        }
    }
}
