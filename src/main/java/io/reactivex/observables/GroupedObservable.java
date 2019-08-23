package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;

public abstract class GroupedObservable<K, T> extends Observable<T> {
    final K key;

    @Nullable
    public K getKey() {
        return this.key;
    }

    protected GroupedObservable(@Nullable K k) {
        this.key = k;
    }
}
