package android.arch.lifecycle;

import android.arch.core.internal.SafeIterableMap;
import android.support.annotation.CallSuper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;

public class MediatorLiveData<T> extends MutableLiveData<T> {
    private SafeIterableMap<LiveData<?>, Source<?>> mSources = new SafeIterableMap<>();

    static class Source<V> implements Observer<V> {
        final LiveData<V> mLiveData;
        final Observer<V> mObserver;
        int mVersion = -1;

        /* access modifiers changed from: package-private */
        public void plug() {
            this.mLiveData.observeForever(this);
        }

        /* access modifiers changed from: package-private */
        public void unplug() {
            this.mLiveData.removeObserver(this);
        }

        public void onChanged(@Nullable V v) {
            if (this.mVersion != this.mLiveData.getVersion()) {
                this.mVersion = this.mLiveData.getVersion();
                this.mObserver.onChanged(v);
            }
        }

        Source(LiveData<V> liveData, Observer<V> observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onActive() {
        Iterator it2 = this.mSources.iterator();
        while (it2.hasNext()) {
            ((Source) ((Map.Entry) it2.next()).getValue()).plug();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onInactive() {
        Iterator it2 = this.mSources.iterator();
        while (it2.hasNext()) {
            ((Source) ((Map.Entry) it2.next()).getValue()).unplug();
        }
    }

    @MainThread
    public <S> void removeSource(@NonNull LiveData<S> liveData) {
        Source source = (Source) this.mSources.remove(liveData);
        if (source != null) {
            source.unplug();
        }
    }

    @MainThread
    public <S> void addSource(@NonNull LiveData<S> liveData, @NonNull Observer<S> observer) {
        Source source = new Source(liveData, observer);
        Source source2 = (Source) this.mSources.putIfAbsent(liveData, source);
        if (source2 == null || source2.mObserver == observer) {
            if (source2 == null && hasActiveObservers()) {
                source.plug();
            }
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }
}
