package com.bytedance.common.utility.collection;

import android.database.DataSetObserver;
import java.util.Iterator;

public class WeakDataSetObservable<T extends DataSetObserver> {
    protected final WeakContainer<T> mObservers = new WeakContainer<>();

    public void unregisterAll() {
        synchronized (this.mObservers) {
            this.mObservers.clear();
        }
    }

    public void notifyChanged() {
        synchronized (this.mObservers) {
            Iterator it2 = this.mObservers.iterator();
            while (it2.hasNext()) {
                ((DataSetObserver) it2.next()).onChanged();
            }
        }
    }

    public void notifyInvalidated() {
        synchronized (this.mObservers) {
            Iterator it2 = this.mObservers.iterator();
            while (it2.hasNext()) {
                ((DataSetObserver) it2.next()).onInvalidated();
            }
        }
    }

    public void registerObserver(T t) {
        if (t != null) {
            synchronized (this.mObservers) {
                this.mObservers.add(t);
            }
            return;
        }
        throw new IllegalArgumentException("The observer is null.");
    }

    public void unregisterObserver(T t) {
        if (t != null) {
            synchronized (this.mObservers) {
                this.mObservers.remove(t);
            }
            return;
        }
        throw new IllegalArgumentException("The observer is null.");
    }
}
