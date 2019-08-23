package com.bytedance.ies.sdk.widgets;

import android.annotation.SuppressLint;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class DataCenter extends ViewModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, Object> dataStore = new HashMap();
    private Handler handler = new Handler(Looper.getMainLooper());
    public LifecycleOwner lifecycleOwner;
    private Map<String, NextLiveData<KVData>> liveDataMap = new HashMap();
    private Thread mainThread;

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15169, new Class[0], Void.TYPE);
            return;
        }
        this.dataStore.clear();
        this.liveDataMap.clear();
        this.lifecycleOwner = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    @SuppressLint({"NewApi"})
    private boolean notMainThread() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15170, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15170, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mainThread == null) {
            this.mainThread = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != this.mainThread) {
            z = true;
        }
        return z;
    }

    @Deprecated
    public <T> T get(String str) {
        T t = this.dataStore.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    private NextLiveData<KVData> getLiveData(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 15166, new Class[]{String.class}, NextLiveData.class)) {
            return (NextLiveData) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 15166, new Class[]{String.class}, NextLiveData.class);
        }
        NextLiveData<KVData> nextLiveData = this.liveDataMap.get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (this.dataStore.containsKey(str)) {
                nextLiveData.setValue(new KVData(str, this.dataStore.get(str)));
            }
            this.liveDataMap.put(str, nextLiveData);
        }
        return nextLiveData;
    }

    public boolean has(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 15161, new Class[]{String.class}, Boolean.TYPE)) {
            return this.dataStore.containsKey(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 15161, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    /* renamed from: put */
    public DataCenter lambda$put$0$DataCenter(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 15157, new Class[]{Bundle.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 15157, new Class[]{Bundle.class}, DataCenter.class);
        } else if (notMainThread()) {
            this.handler.post(new DataCenter$$Lambda$0(this, bundle));
            return this;
        } else if (bundle == null) {
            return this;
        } else {
            for (String str : bundle.keySet()) {
                if (str != null) {
                    lambda$put$1$DataCenter(str, bundle.get(str));
                }
            }
            return this;
        }
    }

    @MainThread
    public DataCenter removeObserver(Observer<KVData> observer) {
        if (PatchProxy.isSupport(new Object[]{observer}, this, changeQuickRedirect, false, 15168, new Class[]{Observer.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{observer}, this, changeQuickRedirect, false, 15168, new Class[]{Observer.class}, DataCenter.class);
        } else if (observer == null) {
            return this;
        } else {
            for (NextLiveData<KVData> removeObserver : this.liveDataMap.values()) {
                removeObserver.removeObserver(observer);
            }
            return this;
        }
    }

    public static DataCenter create(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner2) {
        ViewModelProvider viewModelProvider2 = viewModelProvider;
        LifecycleOwner lifecycleOwner3 = lifecycleOwner2;
        if (PatchProxy.isSupport(new Object[]{viewModelProvider2, lifecycleOwner3}, null, changeQuickRedirect, true, 15156, new Class[]{ViewModelProvider.class, LifecycleOwner.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{viewModelProvider2, lifecycleOwner3}, null, changeQuickRedirect, true, 15156, new Class[]{ViewModelProvider.class, LifecycleOwner.class}, DataCenter.class);
        }
        DataCenter dataCenter = (DataCenter) viewModelProvider2.get(DataCenter.class);
        dataCenter.lifecycleOwner = lifecycleOwner3;
        return dataCenter;
    }

    static <T> T get(Object obj, T t) {
        Object obj2 = obj;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{obj2, t2}, null, changeQuickRedirect, true, 15160, new Class[]{Object.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj2, t2}, null, changeQuickRedirect, true, 15160, new Class[]{Object.class, Object.class}, Object.class);
        } else if (obj2 == null) {
            return null;
        } else {
            if (t2 == null || (((obj2 instanceof Number) && (t2 instanceof Number)) || t.getClass().isAssignableFrom(obj.getClass()))) {
                return obj2;
            }
            return t2;
        }
    }

    @MainThread
    public DataCenter observe(String str, Observer<KVData> observer) {
        String str2 = str;
        Observer<KVData> observer2 = observer;
        if (!PatchProxy.isSupport(new Object[]{str2, observer2}, this, changeQuickRedirect, false, 15162, new Class[]{String.class, Observer.class}, DataCenter.class)) {
            return observe(str2, observer2, false);
        }
        return (DataCenter) PatchProxy.accessDispatch(new Object[]{str2, observer2}, this, changeQuickRedirect, false, 15162, new Class[]{String.class, Observer.class}, DataCenter.class);
    }

    @MainThread
    public DataCenter observeForever(String str, Observer<KVData> observer) {
        String str2 = str;
        Observer<KVData> observer2 = observer;
        if (!PatchProxy.isSupport(new Object[]{str2, observer2}, this, changeQuickRedirect, false, 15164, new Class[]{String.class, Observer.class}, DataCenter.class)) {
            return observeForever(str2, observer2, false);
        }
        return (DataCenter) PatchProxy.accessDispatch(new Object[]{str2, observer2}, this, changeQuickRedirect, false, 15164, new Class[]{String.class, Observer.class}, DataCenter.class);
    }

    public <T> T get(String str, T t) {
        if (PatchProxy.isSupport(new Object[]{str, t}, this, changeQuickRedirect, false, 15159, new Class[]{String.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str, t}, this, changeQuickRedirect, false, 15159, new Class[]{String.class, Object.class}, Object.class);
        } else if (!this.dataStore.containsKey(str)) {
            return t;
        } else {
            return get(this.dataStore.get(str), t);
        }
    }

    /* renamed from: put */
    public DataCenter lambda$put$1$DataCenter(String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, changeQuickRedirect, false, 15158, new Class[]{String.class, Object.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, obj}, this, changeQuickRedirect, false, 15158, new Class[]{String.class, Object.class}, DataCenter.class);
        } else if (notMainThread()) {
            this.handler.post(new DataCenter$$Lambda$1(this, str, obj));
            return this;
        } else {
            this.dataStore.put(str, obj);
            MutableLiveData mutableLiveData = this.liveDataMap.get(str);
            if (mutableLiveData != null) {
                mutableLiveData.setValue(new KVData(str, obj));
            }
            return this;
        }
    }

    @MainThread
    public DataCenter removeObserver(String str, Observer<KVData> observer) {
        if (PatchProxy.isSupport(new Object[]{str, observer}, this, changeQuickRedirect, false, 15167, new Class[]{String.class, Observer.class}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, observer}, this, changeQuickRedirect, false, 15167, new Class[]{String.class, Observer.class}, DataCenter.class);
        } else if (TextUtils.isEmpty(str) || observer == null) {
            return this;
        } else {
            NextLiveData nextLiveData = this.liveDataMap.get(str);
            if (nextLiveData != null) {
                nextLiveData.removeObserver(observer);
            }
            return this;
        }
    }

    @MainThread
    public DataCenter observe(String str, Observer<KVData> observer, boolean z) {
        Observer<KVData> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{str, observer2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15163, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, observer2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15163, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class);
        } else if (TextUtils.isEmpty(str) || observer2 == null) {
            return this;
        } else {
            getLiveData(str).observe(this.lifecycleOwner, observer, z);
            return this;
        }
    }

    @MainThread
    public DataCenter observeForever(String str, Observer<KVData> observer, boolean z) {
        Observer<KVData> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{str, observer2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15165, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[]{str, observer2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15165, new Class[]{String.class, Observer.class, Boolean.TYPE}, DataCenter.class);
        } else if (TextUtils.isEmpty(str) || observer2 == null) {
            return this;
        } else {
            boolean z2 = z;
            getLiveData(str).observeForever(observer, z);
            return this;
        }
    }
}
