package com.ss.android.ugc.aweme.story.base.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.c.a.a;

public class BaseListViewModel<T> extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72126a;

    /* renamed from: b  reason: collision with root package name */
    protected MutableLiveData<T> f72127b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<a> f72128c = new MutableLiveData<>();

    public void a() {
    }

    public void b() {
    }

    public final MutableLiveData<T> c() {
        if (PatchProxy.isSupport(new Object[0], this, f72126a, false, 82699, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f72126a, false, 82699, new Class[0], MutableLiveData.class);
        }
        if (this.f72127b == null) {
            this.f72127b = new MutableLiveData<>();
        }
        return this.f72127b;
    }

    public final T d() {
        if (PatchProxy.isSupport(new Object[0], this, f72126a, false, 82700, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f72126a, false, 82700, new Class[0], Object.class);
        } else if (this.f72127b == null) {
            return null;
        } else {
            return this.f72127b.getValue();
        }
    }
}
