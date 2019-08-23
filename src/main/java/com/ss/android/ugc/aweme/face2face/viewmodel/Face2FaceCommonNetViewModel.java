package com.ss.android.ugc.aweme.face2face.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;
import java.util.HashMap;
import java.util.Map;

public class Face2FaceCommonNetViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44102a;

    /* renamed from: b  reason: collision with root package name */
    private Map<q, MutableLiveData<a>> f44103b;

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f44102a, false, 39273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44102a, false, 39273, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f44103b = null;
    }

    @NonNull
    public final <T> LiveData<a<T>> a(q<T> qVar) {
        q<T> qVar2 = qVar;
        if (!PatchProxy.isSupport(new Object[]{qVar2}, this, f44102a, false, 39270, new Class[]{q.class}, LiveData.class)) {
            return a(qVar2, false);
        }
        return (LiveData) PatchProxy.accessDispatch(new Object[]{qVar2}, this, f44102a, false, 39270, new Class[]{q.class}, LiveData.class);
    }

    @NonNull
    private <T> LiveData<a<T>> a(q<T> qVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{qVar, (byte) 0}, this, f44102a, false, 39271, new Class[]{q.class, Boolean.TYPE}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{qVar, (byte) 0}, this, f44102a, false, 39271, new Class[]{q.class, Boolean.TYPE}, LiveData.class);
        }
        if (this.f44103b == null) {
            this.f44103b = new HashMap();
        }
        MutableLiveData mutableLiveData = this.f44103b.get(qVar);
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        a(qVar, mutableLiveData2);
        this.f44103b.put(qVar, mutableLiveData2);
        return mutableLiveData2;
    }

    private <T> void a(q<T> qVar, MutableLiveData<a<T>> mutableLiveData) {
        q<T> qVar2 = qVar;
        final MutableLiveData<a<T>> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{qVar2, mutableLiveData2}, this, f44102a, false, 39272, new Class[]{q.class, MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar2, mutableLiveData2}, this, f44102a, false, 39272, new Class[]{q.class, MutableLiveData.class}, Void.TYPE);
            return;
        }
        l.a(qVar2, new k<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44104a;

            public final void onFailure(@NonNull Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f44104a, false, 39275, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f44104a, false, 39275, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                mutableLiveData2.setValue(a.a(a.C0799a.ERROR, th2));
            }

            public final void onSuccess(@NonNull T t) {
                T t2 = t;
                if (PatchProxy.isSupport(new Object[]{t2}, this, f44104a, false, 39274, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t2}, this, f44104a, false, 39274, new Class[]{Object.class}, Void.TYPE);
                    return;
                }
                mutableLiveData2.setValue(a.a(a.C0799a.SUCCESS, t2));
            }
        }, com.ss.android.ugc.aweme.base.k.f34752b);
    }
}
