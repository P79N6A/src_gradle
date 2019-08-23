package com.bytedance.ies.uikit.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.recyclerview.LoadingStatusView;
import com.ss.android.ugc.aweme.C0906R;

public abstract class LoadMoreRecyclerViewAdapter extends RecyclerViewWithFooterAdapter {
    public ILoadMore mLoadMoreListener;
    private LoadMoreViewHolder mLoadMoreViewHolder;

    public interface ILoadMore {
        void loadMore(boolean z);
    }

    class LoadMoreViewHolder extends RecyclerView.ViewHolder {
        public void reset() {
            ((LoadingStatusView) this.itemView).reset();
        }

        public void showError() {
            ((LoadingStatusView) this.itemView).showError();
        }

        public void showLoading() {
            ((LoadingStatusView) this.itemView).showLoading();
        }

        public void bind() {
            if (((LoadingStatusView) this.itemView).isReset() && LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(false);
            }
        }

        public LoadMoreViewHolder(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: protected */
    public int getErrorLayoutForLoadMore() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getLoadingLayoutForLoadMore() {
        return C0906R.layout.a5r;
    }

    public final int getItemCount() {
        if (getBasicItemCount() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    public void resetLoadMoreState() {
        if (this.mLoadMoreViewHolder != null) {
            this.mLoadMoreViewHolder.reset();
        }
    }

    public void showLoadMoreError() {
        if (this.mLoadMoreViewHolder != null) {
            this.mLoadMoreViewHolder.showError();
        }
    }

    public void showLoadMoreLoading() {
        if (this.mLoadMoreViewHolder != null) {
            this.mLoadMoreViewHolder.showLoading();
        }
    }

    public void setLoadMoreListener(ILoadMore iLoadMore) {
        this.mLoadMoreListener = iLoadMore;
    }

    /* access modifiers changed from: protected */
    public int getFooterHeight(View view) {
        return view.getResources().getDimensionPixelSize(C0906R.dimen.di);
    }

    public void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof LoadMoreViewHolder) {
            ((LoadMoreViewHolder) viewHolder).bind();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.mLoadMoreViewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            this.mLoadMoreViewHolder.itemView.setLayoutParams(layoutParams);
        }
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        int footerHeight = getFooterHeight(viewGroup);
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(C0906R.dimen.dj);
        loadingStatusView.setLayoutParams(getFooterLayoutParams(-1, footerHeight));
        LoadingStatusView.Builder builder = new LoadingStatusView.Builder(viewGroup.getContext());
        builder.setUseProgressBar(dimensionPixelSize).setErrorText(C0906R.string.b6x, new View.OnClickListener() {
            public void onClick(View view) {
                if (LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                    LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(true);
                }
            }
        });
        if (getErrorLayoutForLoadMore() > 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(getErrorLayoutForLoadMore(), viewGroup, false);
            inflate.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                        LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(true);
                    }
                }
            });
            builder.setErrorView(inflate);
        }
        builder.setLoadingView(LayoutInflater.from(viewGroup.getContext()).inflate(getLoadingLayoutForLoadMore(), viewGroup, false));
        loadingStatusView.setBuilder(builder);
        this.mLoadMoreViewHolder = new LoadMoreViewHolder(loadingStatusView);
        return this.mLoadMoreViewHolder;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.LayoutParams getFooterLayoutParams(int i, int i2) {
        return new RecyclerView.LayoutParams(i, i2);
    }
}
