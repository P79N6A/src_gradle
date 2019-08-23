package android.arch.paging;

import android.arch.paging.AsyncPagedListDiffer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;

public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagedListDiffer<T> mDiffer;
    private final AsyncPagedListDiffer.PagedListListener<T> mListener = new AsyncPagedListDiffer.PagedListListener<T>() {
        public void onCurrentListChanged(@Nullable PagedList<T> pagedList) {
            PagedListAdapter.this.onCurrentListChanged(pagedList);
        }
    };

    public void onCurrentListChanged(@Nullable PagedList<T> pagedList) {
    }

    @Nullable
    public PagedList<T> getCurrentList() {
        return this.mDiffer.getCurrentList();
    }

    public int getItemCount() {
        return this.mDiffer.getItemCount();
    }

    /* access modifiers changed from: protected */
    @Nullable
    public T getItem(int i) {
        return this.mDiffer.getItem(i);
    }

    public void submitList(PagedList<T> pagedList) {
        this.mDiffer.submitList(pagedList);
    }

    protected PagedListAdapter(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.mDiffer = new AsyncPagedListDiffer<>((ListUpdateCallback) new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.mDiffer.mListener = this.mListener;
    }

    protected PagedListAdapter(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
        this.mDiffer = new AsyncPagedListDiffer<>((RecyclerView.Adapter) this, itemCallback);
        this.mDiffer.mListener = this.mListener;
    }
}
