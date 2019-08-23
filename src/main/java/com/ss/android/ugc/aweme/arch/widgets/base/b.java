package com.ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class b<T> extends MutableLiveData<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34378a;

    /* renamed from: d  reason: collision with root package name */
    private static Handler f34379d = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public int f34380b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Map<Observer, a<T>> f34381c = new HashMap();

    class a<R> implements Observer<R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34385a;

        /* renamed from: c  reason: collision with root package name */
        private int f34387c;

        /* renamed from: d  reason: collision with root package name */
        private Observer<R> f34388d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f34389e;

        public final void onChanged(@Nullable R r) {
            if (PatchProxy.isSupport(new Object[]{r}, this, f34385a, false, 23811, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r}, this, f34385a, false, 23811, new Class[]{Object.class}, Void.TYPE);
            } else if (this.f34389e || this.f34387c < b.this.f34380b) {
                this.f34388d.onChanged(r);
            }
        }

        a(int i, Observer<R> observer, boolean z) {
            this.f34387c = i;
            this.f34388d = observer;
            this.f34389e = z;
        }
    }

    @MainThread
    public void observeForever(@NonNull Observer<T> observer) {
        Observer<T> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{observer2}, this, f34378a, false, 23805, new Class[]{Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer2}, this, f34378a, false, 23805, new Class[]{Observer.class}, Void.TYPE);
            return;
        }
        a(observer2, false);
    }

    @MainThread
    public void setValue(@Nullable T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f34378a, false, 23808, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f34378a, false, 23808, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f34380b++;
        super.setValue(t);
    }

    public void postValue(@Nullable T t) {
        final T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f34378a, false, 23809, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f34378a, false, 23809, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        f34379d.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34382a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f34382a, false, 23810, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34382a, false, 23810, new Class[0], Void.TYPE);
                    return;
                }
                b.this.setValue(t2);
            }
        });
    }

    public void removeObserver(@NonNull Observer<T> observer) {
        if (PatchProxy.isSupport(new Object[]{observer}, this, f34378a, false, 23807, new Class[]{Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer}, this, f34378a, false, 23807, new Class[]{Observer.class}, Void.TYPE);
            return;
        }
        a remove = this.f34381c.remove(observer);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        if (observer instanceof a) {
            Observer observer2 = null;
            Iterator<Map.Entry<Observer, a<T>>> it2 = this.f34381c.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry next = it2.next();
                if (observer.equals(next.getValue())) {
                    observer2 = (Observer) next.getKey();
                    super.removeObserver(observer);
                    break;
                }
            }
            if (observer2 != null) {
                this.f34381c.remove(observer2);
            }
        }
    }

    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Observer<T> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, observer2}, this, f34378a, false, 23803, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, observer2}, this, f34378a, false, 23803, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE);
            return;
        }
        a(lifecycleOwner2, observer2, false);
    }

    @MainThread
    public final void a(@NonNull Observer<T> observer, boolean z) {
        if (PatchProxy.isSupport(new Object[]{observer, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34378a, false, 23806, new Class[]{Observer.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer, Byte.valueOf(z)}, this, f34378a, false, 23806, new Class[]{Observer.class, Boolean.TYPE}, Void.TYPE);
        } else if (!this.f34381c.containsKey(observer)) {
            a aVar = new a(this.f34380b, observer, z);
            this.f34381c.put(observer, aVar);
            super.observeForever(aVar);
        }
    }

    @MainThread
    public final void a(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer, boolean z) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Observer<T> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, observer2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34378a, false, 23804, new Class[]{LifecycleOwner.class, Observer.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, observer2, Byte.valueOf(z)}, this, f34378a, false, 23804, new Class[]{LifecycleOwner.class, Observer.class, Boolean.TYPE}, Void.TYPE);
        } else if (!this.f34381c.containsKey(observer2)) {
            a aVar = new a(this.f34380b, observer2, z);
            this.f34381c.put(observer2, aVar);
            super.observe(lifecycleOwner, aVar);
        }
    }
}
