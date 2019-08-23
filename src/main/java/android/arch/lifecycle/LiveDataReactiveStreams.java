package android.arch.lifecycle;

import android.arch.core.executor.ArchTaskExecutor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class LiveDataReactiveStreams {

    static final class LiveDataPublisher<T> implements b<T> {
        final LifecycleOwner mLifecycle;
        final LiveData<T> mLiveData;

        static final class LiveDataSubscription<T> implements Observer<T>, d {
            volatile boolean mCanceled;
            @Nullable
            T mLatest;
            final LifecycleOwner mLifecycle;
            final LiveData<T> mLiveData;
            boolean mObserving;
            long mRequested;
            final c<? super T> mSubscriber;

            public final void cancel() {
                if (!this.mCanceled) {
                    this.mCanceled = true;
                    ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                        public void run() {
                            if (LiveDataSubscription.this.mObserving) {
                                LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                                LiveDataSubscription.this.mObserving = false;
                            }
                            LiveDataSubscription.this.mLatest = null;
                        }
                    });
                }
            }

            public final void request(final long j) {
                if (!this.mCanceled) {
                    ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                        public void run() {
                            long j;
                            if (!LiveDataSubscription.this.mCanceled) {
                                if (j <= 0) {
                                    LiveDataSubscription.this.mCanceled = true;
                                    if (LiveDataSubscription.this.mObserving) {
                                        LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                                        LiveDataSubscription.this.mObserving = false;
                                    }
                                    LiveDataSubscription.this.mLatest = null;
                                    LiveDataSubscription.this.mSubscriber.onError(new IllegalArgumentException("Non-positive request"));
                                    return;
                                }
                                LiveDataSubscription liveDataSubscription = LiveDataSubscription.this;
                                if (LiveDataSubscription.this.mRequested + j >= LiveDataSubscription.this.mRequested) {
                                    j = LiveDataSubscription.this.mRequested + j;
                                } else {
                                    j = Long.MAX_VALUE;
                                }
                                liveDataSubscription.mRequested = j;
                                if (!LiveDataSubscription.this.mObserving) {
                                    LiveDataSubscription.this.mObserving = true;
                                    LiveDataSubscription.this.mLiveData.observe(LiveDataSubscription.this.mLifecycle, LiveDataSubscription.this);
                                    return;
                                }
                                if (LiveDataSubscription.this.mLatest != null) {
                                    LiveDataSubscription.this.onChanged(LiveDataSubscription.this.mLatest);
                                    LiveDataSubscription.this.mLatest = null;
                                }
                            }
                        }
                    });
                }
            }

            public final void onChanged(@Nullable T t) {
                if (!this.mCanceled) {
                    if (this.mRequested > 0) {
                        this.mLatest = null;
                        this.mSubscriber.onNext(t);
                        if (this.mRequested != Long.MAX_VALUE) {
                            this.mRequested--;
                        }
                    } else {
                        this.mLatest = t;
                    }
                }
            }

            LiveDataSubscription(c<? super T> cVar, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
                this.mSubscriber = cVar;
                this.mLifecycle = lifecycleOwner;
                this.mLiveData = liveData;
            }
        }

        public final void subscribe(c<? super T> cVar) {
            cVar.onSubscribe(new LiveDataSubscription(cVar, this.mLifecycle, this.mLiveData));
        }

        LiveDataPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.mLifecycle = lifecycleOwner;
            this.mLiveData = liveData;
        }
    }

    static class PublisherLiveData<T> extends LiveData<T> {
        private final b<T> mPublisher;
        final AtomicReference<LiveDataSubscriber> mSubscriber = new AtomicReference<>();

        final class LiveDataSubscriber extends AtomicReference<d> implements c<T> {
            public final void cancelSubscription() {
                d dVar = (d) get();
                if (dVar != null) {
                    dVar.cancel();
                }
            }

            public final void onComplete() {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
            }

            LiveDataSubscriber() {
            }

            public final void onNext(T t) {
                PublisherLiveData.this.postValue(t);
            }

            public final void onError(final Throwable th) {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() {
                    public void run() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
                    }
                });
            }

            public final void onSubscribe(d dVar) {
                if (compareAndSet(null, dVar)) {
                    dVar.request(Long.MAX_VALUE);
                } else {
                    dVar.cancel();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onActive() {
            super.onActive();
            LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
            this.mSubscriber.set(liveDataSubscriber);
            this.mPublisher.subscribe(liveDataSubscriber);
        }

        /* access modifiers changed from: protected */
        public void onInactive() {
            super.onInactive();
            LiveDataSubscriber andSet = this.mSubscriber.getAndSet(null);
            if (andSet != null) {
                andSet.cancelSubscription();
            }
        }

        PublisherLiveData(@NonNull b<T> bVar) {
            this.mPublisher = bVar;
        }
    }

    private LiveDataReactiveStreams() {
    }

    @NonNull
    public static <T> LiveData<T> fromPublisher(@NonNull b<T> bVar) {
        return new PublisherLiveData(bVar);
    }

    @NonNull
    public static <T> b<T> toPublisher(@NonNull LifecycleOwner lifecycleOwner, @NonNull LiveData<T> liveData) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }
}
