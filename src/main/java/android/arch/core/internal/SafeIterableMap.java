package android.arch.core.internal;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    private Entry<K, V> mEnd;
    private WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap<>();
    private int mSize = 0;
    public Entry<K, V> mStart;

    static class AscendingIterator<K, V> extends ListIterator<K, V> {
        /* access modifiers changed from: package-private */
        public Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mPrevious;
        }

        /* access modifiers changed from: package-private */
        public Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mNext;
        }

        AscendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }
    }

    static class DescendingIterator<K, V> extends ListIterator<K, V> {
        /* access modifiers changed from: package-private */
        public Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mNext;
        }

        /* access modifiers changed from: package-private */
        public Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mPrevious;
        }

        DescendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }
    }

    static class Entry<K, V> implements Map.Entry<K, V> {
        @NonNull
        final K mKey;
        Entry<K, V> mNext;
        Entry<K, V> mPrevious;
        @NonNull
        final V mValue;

        @NonNull
        public K getKey() {
            return this.mKey;
        }

        @NonNull
        public V getValue() {
            return this.mValue;
        }

        public String toString() {
            return this.mKey + "=" + this.mValue;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.mKey.equals(entry.mKey) || !this.mValue.equals(entry.mValue)) {
                return false;
            }
            return true;
        }

        Entry(@NonNull K k, @NonNull V v) {
            this.mKey = k;
            this.mValue = v;
        }
    }

    public class IteratorWithAdditions implements SupportRemove<K, V>, Iterator<Map.Entry<K, V>> {
        private boolean mBeforeStart;
        private Entry<K, V> mCurrent;

        public boolean hasNext() {
            if (this.mBeforeStart) {
                if (SafeIterableMap.this.mStart != null) {
                    return true;
                }
                return false;
            } else if (this.mCurrent == null || this.mCurrent.mNext == null) {
                return false;
            } else {
                return true;
            }
        }

        public Map.Entry<K, V> next() {
            Entry<K, V> entry;
            if (this.mBeforeStart) {
                this.mBeforeStart = false;
                entry = SafeIterableMap.this.mStart;
            } else if (this.mCurrent != null) {
                entry = this.mCurrent.mNext;
            } else {
                entry = null;
            }
            this.mCurrent = entry;
            return this.mCurrent;
        }

        private IteratorWithAdditions() {
            this.mBeforeStart = true;
        }

        public void supportRemove(@NonNull Entry<K, V> entry) {
            boolean z;
            if (entry == this.mCurrent) {
                this.mCurrent = this.mCurrent.mPrevious;
                if (this.mCurrent == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.mBeforeStart = z;
            }
        }
    }

    static abstract class ListIterator<K, V> implements SupportRemove<K, V>, Iterator<Map.Entry<K, V>> {
        Entry<K, V> mExpectedEnd;
        Entry<K, V> mNext;

        /* access modifiers changed from: package-private */
        public abstract Entry<K, V> backward(Entry<K, V> entry);

        /* access modifiers changed from: package-private */
        public abstract Entry<K, V> forward(Entry<K, V> entry);

        public boolean hasNext() {
            if (this.mNext != null) {
                return true;
            }
            return false;
        }

        public Map.Entry<K, V> next() {
            Entry<K, V> entry = this.mNext;
            this.mNext = nextNode();
            return entry;
        }

        private Entry<K, V> nextNode() {
            if (this.mNext == this.mExpectedEnd || this.mExpectedEnd == null) {
                return null;
            }
            return forward(this.mNext);
        }

        public void supportRemove(@NonNull Entry<K, V> entry) {
            if (this.mExpectedEnd == entry && entry == this.mNext) {
                this.mNext = null;
                this.mExpectedEnd = null;
            }
            if (this.mExpectedEnd == entry) {
                this.mExpectedEnd = backward(this.mExpectedEnd);
            }
            if (this.mNext == entry) {
                this.mNext = nextNode();
            }
        }

        ListIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            this.mExpectedEnd = entry2;
            this.mNext = entry;
        }
    }

    interface SupportRemove<K, V> {
        void supportRemove(@NonNull Entry<K, V> entry);
    }

    public Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    public int size() {
        return this.mSize;
    }

    public IteratorWithAdditions iteratorWithAdditions() {
        IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions<>();
        this.mIterators.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.mEnd, this.mStart);
        this.mIterators.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.mStart, this.mEnd);
        this.mIterators.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            sb.append(((Map.Entry) it2.next()).toString());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public Entry<K, V> get(K k) {
        Entry<K, V> entry = this.mStart;
        while (entry != null && !entry.mKey.equals(k)) {
            entry = entry.mNext;
        }
        return entry;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator it2 = iterator();
        Iterator it3 = safeIterableMap.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object next = it3.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it2.hasNext() || it3.hasNext()) {
            return false;
        }
        return true;
    }

    public V remove(@NonNull K k) {
        Entry entry = get(k);
        if (entry == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            for (SupportRemove<K, V> supportRemove : this.mIterators.keySet()) {
                supportRemove.supportRemove(entry);
            }
        }
        if (entry.mPrevious != null) {
            entry.mPrevious.mNext = entry.mNext;
        } else {
            this.mStart = entry.mNext;
        }
        if (entry.mNext != null) {
            entry.mNext.mPrevious = entry.mPrevious;
        } else {
            this.mEnd = entry.mPrevious;
        }
        entry.mNext = null;
        entry.mPrevious = null;
        return entry.mValue;
    }

    public V putIfAbsent(@NonNull K k, @NonNull V v) {
        Entry entry = get(k);
        if (entry != null) {
            return entry.mValue;
        }
        put(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    public Entry<K, V> put(@NonNull K k, @NonNull V v) {
        Entry<K, V> entry = new Entry<>(k, v);
        this.mSize++;
        if (this.mEnd == null) {
            this.mStart = entry;
            this.mEnd = this.mStart;
            return entry;
        }
        this.mEnd.mNext = entry;
        entry.mPrevious = this.mEnd;
        this.mEnd = entry;
        return entry;
    }
}
