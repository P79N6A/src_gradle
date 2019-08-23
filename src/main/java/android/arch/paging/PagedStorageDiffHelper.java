package android.arch.paging;

import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;

public class PagedStorageDiffHelper {

    static class OffsettingListUpdateCallback implements ListUpdateCallback {
        private final ListUpdateCallback mCallback;
        private final int mOffset;

        private OffsettingListUpdateCallback(int i, ListUpdateCallback listUpdateCallback) {
            this.mOffset = i;
            this.mCallback = listUpdateCallback;
        }

        public void onInserted(int i, int i2) {
            this.mCallback.onInserted(i + this.mOffset, i2);
        }

        public void onMoved(int i, int i2) {
            this.mCallback.onMoved(i + this.mOffset, i2 + this.mOffset);
        }

        public void onRemoved(int i, int i2) {
            this.mCallback.onRemoved(i + this.mOffset, i2);
        }

        public void onChanged(int i, int i2, Object obj) {
            this.mCallback.onChanged(i + this.mOffset, i2, obj);
        }
    }

    private PagedStorageDiffHelper() {
    }

    static <T> DiffUtil.DiffResult computeDiff(PagedStorage<T> pagedStorage, PagedStorage<T> pagedStorage2, DiffUtil.ItemCallback<T> itemCallback) {
        final int computeLeadingNulls = pagedStorage.computeLeadingNulls();
        int computeLeadingNulls2 = pagedStorage2.computeLeadingNulls();
        final int size = (pagedStorage.size() - computeLeadingNulls) - pagedStorage.computeTrailingNulls();
        final int size2 = (pagedStorage2.size() - computeLeadingNulls2) - pagedStorage2.computeTrailingNulls();
        final PagedStorage<T> pagedStorage3 = pagedStorage;
        final PagedStorage<T> pagedStorage4 = pagedStorage2;
        final DiffUtil.ItemCallback<T> itemCallback2 = itemCallback;
        AnonymousClass1 r0 = new DiffUtil.Callback() {
            public final int getNewListSize() {
                return size2;
            }

            public final int getOldListSize() {
                return size;
            }

            public final boolean areContentsTheSame(int i, int i2) {
                Object obj = pagedStorage3.get(i + computeLeadingNulls);
                PagedStorage pagedStorage = pagedStorage4;
                Object obj2 = pagedStorage.get(i2 + pagedStorage.getLeadingNullCount());
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return itemCallback2.areContentsTheSame(obj, obj2);
            }

            public final boolean areItemsTheSame(int i, int i2) {
                Object obj = pagedStorage3.get(i + computeLeadingNulls);
                PagedStorage pagedStorage = pagedStorage4;
                Object obj2 = pagedStorage.get(i2 + pagedStorage.getLeadingNullCount());
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return itemCallback2.areItemsTheSame(obj, obj2);
            }

            @Nullable
            public final Object getChangePayload(int i, int i2) {
                Object obj = pagedStorage3.get(i + computeLeadingNulls);
                PagedStorage pagedStorage = pagedStorage4;
                Object obj2 = pagedStorage.get(i2 + pagedStorage.getLeadingNullCount());
                if (obj == null || obj2 == null) {
                    return null;
                }
                return itemCallback2.getChangePayload(obj, obj2);
            }
        };
        return DiffUtil.calculateDiff(r0, true);
    }

    static <T> void dispatchDiff(ListUpdateCallback listUpdateCallback, PagedStorage<T> pagedStorage, PagedStorage<T> pagedStorage2, DiffUtil.DiffResult diffResult) {
        int computeTrailingNulls = pagedStorage.computeTrailingNulls();
        int computeTrailingNulls2 = pagedStorage2.computeTrailingNulls();
        int computeLeadingNulls = pagedStorage.computeLeadingNulls();
        int computeLeadingNulls2 = pagedStorage2.computeLeadingNulls();
        if (computeTrailingNulls == 0 && computeTrailingNulls2 == 0 && computeLeadingNulls == 0 && computeLeadingNulls2 == 0) {
            diffResult.dispatchUpdatesTo(listUpdateCallback);
            return;
        }
        if (computeTrailingNulls > computeTrailingNulls2) {
            int i = computeTrailingNulls - computeTrailingNulls2;
            listUpdateCallback.onRemoved(pagedStorage.size() - i, i);
        } else if (computeTrailingNulls < computeTrailingNulls2) {
            listUpdateCallback.onInserted(pagedStorage.size(), computeTrailingNulls2 - computeTrailingNulls);
        }
        if (computeLeadingNulls > computeLeadingNulls2) {
            listUpdateCallback.onRemoved(0, computeLeadingNulls - computeLeadingNulls2);
        } else if (computeLeadingNulls < computeLeadingNulls2) {
            listUpdateCallback.onInserted(0, computeLeadingNulls2 - computeLeadingNulls);
        }
        if (computeLeadingNulls2 != 0) {
            diffResult.dispatchUpdatesTo((ListUpdateCallback) new OffsettingListUpdateCallback(computeLeadingNulls2, listUpdateCallback));
        } else {
            diffResult.dispatchUpdatesTo(listUpdateCallback);
        }
    }
}
