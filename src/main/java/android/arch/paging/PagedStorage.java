package android.arch.paging;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public final class PagedStorage<T> extends AbstractList<T> {
    private static final List PLACEHOLDER_LIST = new ArrayList();
    private int mLeadingNullCount;
    private int mNumberAppended;
    private int mNumberPrepended;
    private int mPageSize;
    private final ArrayList<List<T>> mPages;
    private int mPositionOffset;
    private int mStorageCount;
    private int mTrailingNullCount;

    interface Callback {
        void onInitialized(int i);

        void onPageAppended(int i, int i2, int i3);

        void onPageInserted(int i, int i2);

        void onPagePlaceholderInserted(int i);

        void onPagePrepended(int i, int i2, int i3);
    }

    /* access modifiers changed from: package-private */
    public final int getLeadingNullCount() {
        return this.mLeadingNullCount;
    }

    /* access modifiers changed from: package-private */
    public final int getNumberAppended() {
        return this.mNumberAppended;
    }

    /* access modifiers changed from: package-private */
    public final int getNumberPrepended() {
        return this.mNumberPrepended;
    }

    /* access modifiers changed from: package-private */
    public final int getPositionOffset() {
        return this.mPositionOffset;
    }

    /* access modifiers changed from: package-private */
    public final int getStorageCount() {
        return this.mStorageCount;
    }

    /* access modifiers changed from: package-private */
    public final int getTrailingNullCount() {
        return this.mTrailingNullCount;
    }

    /* access modifiers changed from: package-private */
    public final int getPageCount() {
        return this.mPages.size();
    }

    /* access modifiers changed from: package-private */
    public final boolean isTiled() {
        if (this.mPageSize > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final PagedStorage<T> snapshot() {
        return new PagedStorage<>(this);
    }

    /* access modifiers changed from: package-private */
    public final T getFirstLoadedItem() {
        return this.mPages.get(0).get(0);
    }

    public final int size() {
        return this.mLeadingNullCount + this.mStorageCount + this.mTrailingNullCount;
    }

    PagedStorage() {
        this.mPages = new ArrayList<>();
        this.mTrailingNullCount = 0;
        this.mPositionOffset = 0;
        this.mStorageCount = 0;
        this.mPageSize = 1;
        this.mNumberPrepended = 0;
        this.mNumberAppended = 0;
    }

    /* access modifiers changed from: package-private */
    public final int computeLeadingNulls() {
        int i = this.mLeadingNullCount;
        int size = this.mPages.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = this.mPages.get(i2);
            if (list != null && list != PLACEHOLDER_LIST) {
                break;
            }
            i += this.mPageSize;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final T getLastLoadedItem() {
        List list = this.mPages.get(this.mPages.size() - 1);
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public final int computeTrailingNulls() {
        int i = this.mTrailingNullCount;
        for (int size = this.mPages.size() - 1; size >= 0; size--) {
            List list = this.mPages.get(size);
            if (list != null && list != PLACEHOLDER_LIST) {
                break;
            }
            i += this.mPageSize;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading " + this.mLeadingNullCount + ", storage " + this.mStorageCount + ", trailing " + getTrailingNullCount());
        for (int i = 0; i < this.mPages.size(); i++) {
            sb.append(" ");
            sb.append(this.mPages.get(i));
        }
        return sb.toString();
    }

    private PagedStorage(PagedStorage<T> pagedStorage) {
        this.mLeadingNullCount = pagedStorage.mLeadingNullCount;
        this.mPages = new ArrayList<>(pagedStorage.mPages);
        this.mTrailingNullCount = pagedStorage.mTrailingNullCount;
        this.mPositionOffset = pagedStorage.mPositionOffset;
        this.mStorageCount = pagedStorage.mStorageCount;
        this.mPageSize = pagedStorage.mPageSize;
        this.mNumberPrepended = pagedStorage.mNumberPrepended;
        this.mNumberAppended = pagedStorage.mNumberAppended;
    }

    public final T get(int i) {
        int i2;
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
        }
        int i3 = i - this.mLeadingNullCount;
        if (i3 < 0 || i3 >= this.mStorageCount) {
            return null;
        }
        if (isTiled()) {
            i2 = i3 / this.mPageSize;
            i3 %= this.mPageSize;
        } else {
            int size = this.mPages.size();
            int i4 = 0;
            while (i4 < size) {
                int size2 = this.mPages.get(i4).size();
                if (size2 > i3) {
                    break;
                }
                i3 -= size2;
                i4++;
            }
            i2 = i4;
        }
        List list = this.mPages.get(i2);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(i3);
    }

    public final boolean hasPage(int i, int i2) {
        int i3 = this.mLeadingNullCount / i;
        boolean z = false;
        if (i2 < i3 || i2 >= this.mPages.size() + i3) {
            return false;
        }
        List list = this.mPages.get(i2 - i3);
        if (!(list == null || list == PLACEHOLDER_LIST)) {
            z = true;
        }
        return z;
    }

    private void allocatePageRange(int i, int i2) {
        int i3;
        int i4 = this.mLeadingNullCount / this.mPageSize;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                this.mPages.add(0, null);
                i5++;
            }
            int i6 = i3 * this.mPageSize;
            this.mStorageCount += i6;
            this.mLeadingNullCount -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.mPages.size() + i) {
            int min = Math.min(this.mTrailingNullCount, ((i2 + 1) - (this.mPages.size() + i)) * this.mPageSize);
            for (int size = this.mPages.size(); size <= i2 - i; size++) {
                this.mPages.add(this.mPages.size(), null);
            }
            this.mStorageCount += min;
            this.mTrailingNullCount -= min;
        }
    }

    /* access modifiers changed from: package-private */
    public final void appendPage(@NonNull List<T> list, @NonNull Callback callback) {
        int size = list.size();
        if (size != 0) {
            if (this.mPageSize > 0 && (this.mPages.get(this.mPages.size() - 1).size() != this.mPageSize || size > this.mPageSize)) {
                this.mPageSize = -1;
            }
            this.mPages.add(list);
            this.mStorageCount += size;
            int min = Math.min(this.mTrailingNullCount, size);
            int i = size - min;
            if (min != 0) {
                this.mTrailingNullCount -= min;
            }
            this.mNumberAppended += size;
            callback.onPageAppended((this.mLeadingNullCount + this.mStorageCount) - size, min, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void prependPage(@NonNull List<T> list, @NonNull Callback callback) {
        int size = list.size();
        if (size != 0) {
            if (this.mPageSize > 0 && size != this.mPageSize) {
                if (this.mPages.size() != 1 || size <= this.mPageSize) {
                    this.mPageSize = -1;
                } else {
                    this.mPageSize = size;
                }
            }
            this.mPages.add(0, list);
            this.mStorageCount += size;
            int min = Math.min(this.mLeadingNullCount, size);
            int i = size - min;
            if (min != 0) {
                this.mLeadingNullCount -= min;
            }
            this.mPositionOffset -= i;
            this.mNumberPrepended += size;
            callback.onPagePrepended(this.mLeadingNullCount, min, i);
        }
    }

    PagedStorage(int i, List<T> list, int i2) {
        this();
        init(i, list, i2, 0);
    }

    public final void insertPage(int i, @NonNull List<T> list, @Nullable Callback callback) {
        boolean z;
        int size = list.size();
        if (size != this.mPageSize) {
            int size2 = size();
            boolean z2 = false;
            if (i != size2 - (size2 % this.mPageSize) || size >= this.mPageSize) {
                z = false;
            } else {
                z = true;
            }
            if (this.mTrailingNullCount == 0 && this.mPages.size() == 1 && size > this.mPageSize) {
                z2 = true;
            }
            if (!z2 && !z) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (z2) {
                this.mPageSize = size;
            }
        }
        int i2 = i / this.mPageSize;
        allocatePageRange(i2, i2);
        int i3 = i2 - (this.mLeadingNullCount / this.mPageSize);
        List list2 = this.mPages.get(i3);
        if (list2 == null || list2 == PLACEHOLDER_LIST) {
            this.mPages.set(i3, list);
            if (callback != null) {
                callback.onPageInserted(i, list.size());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid position " + i + ": data already loaded");
    }

    private void init(int i, List<T> list, int i2, int i3) {
        this.mLeadingNullCount = i;
        this.mPages.clear();
        this.mPages.add(list);
        this.mTrailingNullCount = i2;
        this.mPositionOffset = i3;
        this.mStorageCount = list.size();
        this.mPageSize = list.size();
        this.mNumberPrepended = 0;
        this.mNumberAppended = 0;
    }

    public final void allocatePlaceholders(int i, int i2, int i3, Callback callback) {
        if (i3 != this.mPageSize) {
            if (i3 < this.mPageSize) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (this.mPages.size() == 1 && this.mTrailingNullCount == 0) {
                this.mPageSize = i3;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        int size = ((size() + this.mPageSize) - 1) / this.mPageSize;
        int max = Math.max((i - i2) / this.mPageSize, 0);
        int min = Math.min((i + i2) / this.mPageSize, size - 1);
        allocatePageRange(max, min);
        int i4 = this.mLeadingNullCount / this.mPageSize;
        while (max <= min) {
            int i5 = max - i4;
            if (this.mPages.get(i5) == null) {
                this.mPages.set(i5, PLACEHOLDER_LIST);
                callback.onPagePlaceholderInserted(max);
            }
            max++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void init(int i, @NonNull List<T> list, int i2, int i3, @NonNull Callback callback) {
        init(i, list, i2, i3);
        callback.onInitialized(size());
    }

    /* access modifiers changed from: package-private */
    public final void initAndSplit(int i, @NonNull List<T> list, int i2, int i3, int i4, @NonNull Callback callback) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List<T> subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                init(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                insertPage(i6 + i, subList, null);
            }
            i5 = i7;
        }
        callback.onInitialized(size());
    }
}
