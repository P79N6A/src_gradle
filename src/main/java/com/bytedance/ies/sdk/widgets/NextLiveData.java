package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NextLiveData<T> extends MutableLiveData<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int mLatestVersion = -1;
    private Map<Observer, NextObserver> nextObserverMap = new HashMap();

    class NextObserver<T> implements Observer<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int initVersion;
        private boolean notifyWhenObserve;
        private Observer<T> observer;

        public void onChanged(@Nullable T t) {
            if (PatchProxy.isSupport(new Object[]{t}, this, changeQuickRedirect, false, 15189, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{t}, this, changeQuickRedirect, false, 15189, new Class[]{Object.class}, Void.TYPE);
            } else if (this.notifyWhenObserve || this.initVersion < NextLiveData.this.mLatestVersion) {
                this.observer.onChanged(t);
            }
        }

        NextObserver(int i, Observer<T> observer2, boolean z) {
            this.initVersion = i;
            this.observer = observer2;
            this.notifyWhenObserve = z;
        }
    }

    @MainThread
    public void observeForever(@NonNull Observer<T> observer) {
        Observer<T> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{observer2}, this, changeQuickRedirect, false, 15185, new Class[]{Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer2}, this, changeQuickRedirect, false, 15185, new Class[]{Observer.class}, Void.TYPE);
            return;
        }
        observeForever(observer2, false);
    }

    @MainThread
    public void setValue(@Nullable T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, changeQuickRedirect, false, 15188, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, changeQuickRedirect, false, 15188, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.mLatestVersion++;
        super.setValue(t);
    }

    public void removeObserver(@NonNull Observer<T> observer) {
        if (PatchProxy.isSupport(new Object[]{observer}, this, changeQuickRedirect, false, 15187, new Class[]{Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer}, this, changeQuickRedirect, false, 15187, new Class[]{Observer.class}, Void.TYPE);
            return;
        }
        NextObserver remove = this.nextObserverMap.remove(observer);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        super.removeObserver(observer);
        if (observer instanceof NextObserver) {
            Observer observer2 = null;
            Iterator<Map.Entry<Observer, NextObserver>> it2 = this.nextObserverMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry next = it2.next();
                if (observer.equals(next.getValue())) {
                    observer2 = (Observer) next.getKey();
                    break;
                }
            }
            if (observer2 != null) {
                this.nextObserverMap.remove(observer2);
            }
        }
    }

    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Observer<T> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, observer2}, this, changeQuickRedirect, false, 15183, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, observer2}, this, changeQuickRedirect, false, 15183, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE);
            return;
        }
        observe(lifecycleOwner2, observer2, false);
    }

    @MainThread
    public void observeForever(@NonNull Observer<T> observer, boolean z) {
        if (PatchProxy.isSupport(new Object[]{observer, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15186, new Class[]{Observer.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15186, new Class[]{Observer.class, Boolean.TYPE}, Void.TYPE);
        } else if (!this.nextObserverMap.containsKey(observer)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, observer, z);
            this.nextObserverMap.put(observer, nextObserver);
            super.observeForever(nextObserver);
        }
    }

    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer, boolean z) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Observer<T> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, observer2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15184, new Class[]{LifecycleOwner.class, Observer.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, observer2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15184, new Class[]{LifecycleOwner.class, Observer.class, Boolean.TYPE}, Void.TYPE);
        } else if (!this.nextObserverMap.containsKey(observer2)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, observer2, z);
            this.nextObserverMap.put(observer2, nextObserver);
            super.observe(lifecycleOwner, nextObserver);
        }
    }
}
