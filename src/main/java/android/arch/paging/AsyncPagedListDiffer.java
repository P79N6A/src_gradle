package android.arch.paging;

import android.arch.core.executor.ArchTaskExecutor;
import android.arch.paging.PagedList;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.Executor;

public class AsyncPagedListDiffer<T> {
    public final AsyncDifferConfig<T> mConfig;
    private boolean mIsContiguous;
    @Nullable
    PagedListListener<T> mListener;
    Executor mMainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
    public int mMaxScheduledGeneration;
    private PagedList<T> mPagedList;
    private PagedList.Callback mPagedListCallback = new PagedList.Callback() {
        public void onInserted(int i, int i2) {
            AsyncPagedListDiffer.this.mUpdateCallback.onInserted(i, i2);
        }

        public void onRemoved(int i, int i2) {
            AsyncPagedListDiffer.this.mUpdateCallback.onRemoved(i, i2);
        }

        public void onChanged(int i, int i2) {
            AsyncPagedListDiffer.this.mUpdateCallback.onChanged(i, i2, null);
        }
    };
    private PagedList<T> mSnapshot;
    public final ListUpdateCallback mUpdateCallback;

    interface PagedListListener<T> {
        void onCurrentListChanged(@Nullable PagedList<T> pagedList);
    }

    @Nullable
    public PagedList<T> getCurrentList() {
        if (this.mSnapshot != null) {
            return this.mSnapshot;
        }
        return this.mPagedList;
    }

    public int getItemCount() {
        if (this.mPagedList != null) {
            return this.mPagedList.size();
        }
        if (this.mSnapshot == null) {
            return 0;
        }
        return this.mSnapshot.size();
    }

    @Nullable
    public T getItem(int i) {
        if (this.mPagedList != null) {
            this.mPagedList.loadAround(i);
            return this.mPagedList.get(i);
        } else if (this.mSnapshot != null) {
            return this.mSnapshot.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
    }

    public void submitList(PagedList<T> pagedList) {
        if (pagedList != null) {
            if (this.mPagedList == null && this.mSnapshot == null) {
                this.mIsContiguous = pagedList.isContiguous();
            } else if (pagedList.isContiguous() != this.mIsContiguous) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        if (pagedList != this.mPagedList) {
            final int i = this.mMaxScheduledGeneration + 1;
            this.mMaxScheduledGeneration = i;
            if (pagedList == null) {
                int itemCount = getItemCount();
                if (this.mPagedList != null) {
                    this.mPagedList.removeWeakCallback(this.mPagedListCallback);
                    this.mPagedList = null;
                } else if (this.mSnapshot != null) {
                    this.mSnapshot = null;
                }
                this.mUpdateCallback.onRemoved(0, itemCount);
                if (this.mListener != null) {
                    this.mListener.onCurrentListChanged(null);
                }
            } else if (this.mPagedList == null && this.mSnapshot == null) {
                this.mPagedList = pagedList;
                pagedList.addWeakCallback(null, this.mPagedListCallback);
                this.mUpdateCallback.onInserted(0, pagedList.size());
                if (this.mListener != null) {
                    this.mListener.onCurrentListChanged(pagedList);
                }
            } else {
                if (this.mPagedList != null) {
                    this.mPagedList.removeWeakCallback(this.mPagedListCallback);
                    this.mSnapshot = (PagedList) this.mPagedList.snapshot();
                    this.mPagedList = null;
                }
                if (this.mSnapshot == null || this.mPagedList != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                final PagedList<T> pagedList2 = this.mSnapshot;
                final PagedList pagedList3 = (PagedList) pagedList.snapshot();
                Executor backgroundThreadExecutor = this.mConfig.getBackgroundThreadExecutor();
                final PagedList<T> pagedList4 = pagedList;
                AnonymousClass2 r1 = new Runnable() {
                    public void run() {
                        final DiffUtil.DiffResult computeDiff = PagedStorageDiffHelper.computeDiff(pagedList2.mStorage, pagedList3.mStorage, AsyncPagedListDiffer.this.mConfig.getDiffCallback());
                        AsyncPagedListDiffer.this.mMainThreadExecutor.execute(new Runnable() {
                            public void run() {
                                if (AsyncPagedListDiffer.this.mMaxScheduledGeneration == i) {
                                    AsyncPagedListDiffer.this.latchPagedList(pagedList4, pagedList3, computeDiff);
                                }
                            }
                        });
                    }
                };
                backgroundThreadExecutor.execute(r1);
            }
        }
    }

    public AsyncPagedListDiffer(@NonNull ListUpdateCallback listUpdateCallback, @NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.mUpdateCallback = listUpdateCallback;
        this.mConfig = asyncDifferConfig;
    }

    public AsyncPagedListDiffer(@NonNull RecyclerView.Adapter adapter, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
        this.mUpdateCallback = new AdapterListUpdateCallback(adapter);
        this.mConfig = new AsyncDifferConfig.Builder(itemCallback).build();
    }

    public void latchPagedList(PagedList<T> pagedList, PagedList<T> pagedList2, DiffUtil.DiffResult diffResult) {
        if (this.mSnapshot == null || this.mPagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        PagedList<T> pagedList3 = this.mSnapshot;
        this.mPagedList = pagedList;
        this.mSnapshot = null;
        PagedStorageDiffHelper.dispatchDiff(this.mUpdateCallback, pagedList3.mStorage, pagedList.mStorage, diffResult);
        pagedList.addWeakCallback(pagedList2, this.mPagedListCallback);
        if (this.mListener != null) {
            this.mListener.onCurrentListChanged(this.mPagedList);
        }
    }
}
