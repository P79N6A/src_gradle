package com.ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class DataCenter extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34352a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f34353b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, b<a>> f34354c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private LifecycleOwner f34355d;

    /* renamed from: e  reason: collision with root package name */
    private Thread f34356e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f34357f = new Handler(Looper.getMainLooper());

    public final <T> T a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34352a, false, 23781, new Class[]{String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2}, this, f34352a, false, 23781, new Class[]{String.class}, Object.class);
        }
        T t = this.f34353b.get(str2);
        if (t != null) {
            return t;
        }
        return null;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f34352a, false, 23793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34352a, false, 23793, new Class[0], Void.TYPE);
            return;
        }
        this.f34353b.clear();
        this.f34354c.clear();
        this.f34355d = null;
    }

    private b<a> b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34352a, false, 23790, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str}, this, f34352a, false, 23790, new Class[]{String.class}, b.class);
        }
        b<a> bVar = this.f34354c.get(str);
        if (bVar == null) {
            bVar = new b<>();
            if (this.f34353b.containsKey(str)) {
                bVar.setValue(new a(str, this.f34353b.get(str)));
            }
            this.f34354c.put(str, bVar);
        }
        return bVar;
    }

    @MainThread
    public final DataCenter a(Observer<a> observer) {
        if (PatchProxy.isSupport(new Object[]{observer}, this, f34352a, false, 23792, new Class[]{Observer.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{observer}, this, f34352a, false, 23792, new Class[]{Observer.class}, DataCenter.class);
        }
        for (b<a> removeObserver : this.f34354c.values()) {
            removeObserver.removeObserver(observer);
        }
        return this;
    }

    public static DataCenter a(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        ViewModelProvider viewModelProvider2 = viewModelProvider;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{viewModelProvider2, lifecycleOwner2}, null, f34352a, true, 23778, new Class[]{ViewModelProvider.class, LifecycleOwner.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{viewModelProvider2, lifecycleOwner2}, null, f34352a, true, 23778, new Class[]{ViewModelProvider.class, LifecycleOwner.class}, DataCenter.class);
        }
        DataCenter dataCenter = (DataCenter) viewModelProvider2.get(DataCenter.class);
        dataCenter.f34355d = lifecycleOwner2;
        return dataCenter;
    }

    @MainThread
    public final DataCenter b(String str, Observer<a> observer) {
        Observer<a> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{str, observer2}, this, f34352a, false, 23788, new Class[]{String.class, Observer.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, observer2}, this, f34352a, false, 23788, new Class[]{String.class, Observer.class}, DataCenter.class);
        }
        if (PatchProxy.isSupport(new Object[]{str, observer2, (byte) 0}, this, f34352a, false, 23789, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, observer2, (byte) 0}, this, f34352a, false, 23789, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class);
        } else if (TextUtils.isEmpty(str) || observer2 == null) {
            return this;
        } else {
            b(str).a(observer, false);
            return this;
        }
    }

    public final <T> T b(String str, T t) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, t}, this, f34352a, false, 23782, new Class[]{String.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, t}, this, f34352a, false, 23782, new Class[]{String.class, Object.class}, Object.class);
        } else if (!this.f34353b.containsKey(str2)) {
            return t;
        } else {
            return a(str);
        }
    }

    @MainThread
    public final DataCenter a(String str, Observer<a> observer) {
        String str2 = str;
        Observer<a> observer2 = observer;
        if (!PatchProxy.isSupport(new Object[]{str2, observer2}, this, f34352a, false, 23784, new Class[]{String.class, Observer.class}, DataCenter.class)) {
            return a(str2, observer2, false);
        }
        return (DataCenter) PatchProxy.accessDispatch(new Object[]{str2, observer2}, this, f34352a, false, 23784, new Class[]{String.class, Observer.class}, DataCenter.class);
    }

    public final DataCenter a(final String str, final Object obj) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f34352a, false, 23780, new Class[]{String.class, Object.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, obj}, this, f34352a, false, 23780, new Class[]{String.class, Object.class}, DataCenter.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f34352a, false, 23794, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34352a, false, 23794, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (this.f34356e == null) {
                this.f34356e = Looper.getMainLooper().getThread();
            }
            if (Thread.currentThread() == this.f34356e) {
                z = true;
            }
        }
        if (!z) {
            this.f34357f.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34358a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f34358a, false, 23796, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34358a, false, 23796, new Class[0], Void.TYPE);
                        return;
                    }
                    DataCenter.this.a(str, obj);
                }
            });
            return this;
        }
        this.f34353b.put(str, obj);
        MutableLiveData mutableLiveData = this.f34354c.get(str);
        if (mutableLiveData != null) {
            mutableLiveData.setValue(new a(str, obj));
        }
        return this;
    }

    @MainThread
    private DataCenter a(String str, Observer<a> observer, boolean z) {
        Observer<a> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{str, observer2, (byte) 0}, this, f34352a, false, 23785, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, observer2, (byte) 0}, this, f34352a, false, 23785, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class);
        } else if (TextUtils.isEmpty(str) || observer2 == null) {
            return this;
        } else {
            b(str).a(this.f34355d, observer, false);
            return this;
        }
    }
}
