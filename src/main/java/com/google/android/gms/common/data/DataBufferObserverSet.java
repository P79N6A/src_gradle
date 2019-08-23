package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    private HashSet<DataBufferObserver> zzaFw = new HashSet<>();

    public final void addObserver(DataBufferObserver dataBufferObserver) {
        this.zzaFw.add(dataBufferObserver);
    }

    public final void clear() {
        this.zzaFw.clear();
    }

    public final boolean hasObservers() {
        return !this.zzaFw.isEmpty();
    }

    public final void onDataChanged() {
        Iterator<DataBufferObserver> it2 = this.zzaFw.iterator();
        while (it2.hasNext()) {
            it2.next().onDataChanged();
        }
    }

    public final void onDataRangeChanged(int i, int i2) {
        Iterator<DataBufferObserver> it2 = this.zzaFw.iterator();
        while (it2.hasNext()) {
            it2.next().onDataRangeChanged(i, i2);
        }
    }

    public final void onDataRangeInserted(int i, int i2) {
        Iterator<DataBufferObserver> it2 = this.zzaFw.iterator();
        while (it2.hasNext()) {
            it2.next().onDataRangeInserted(i, i2);
        }
    }

    public final void onDataRangeMoved(int i, int i2, int i3) {
        Iterator<DataBufferObserver> it2 = this.zzaFw.iterator();
        while (it2.hasNext()) {
            it2.next().onDataRangeMoved(i, i2, i3);
        }
    }

    public final void onDataRangeRemoved(int i, int i2) {
        Iterator<DataBufferObserver> it2 = this.zzaFw.iterator();
        while (it2.hasNext()) {
            it2.next().onDataRangeRemoved(i, i2);
        }
    }

    public final void removeObserver(DataBufferObserver dataBufferObserver) {
        this.zzaFw.remove(dataBufferObserver);
    }
}
