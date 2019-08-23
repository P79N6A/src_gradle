package com.ss.android.ugc.aweme.paginglibrary.java.model;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.PagedList;
import com.ss.android.ugc.aweme.paginglibrary.java.a;

public abstract class BasePageModel<Key, Value> extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public LiveData<PagedList<Value>> f58428a = Transformations.switchMap(this.f58431d, new Function<a<Value>, LiveData<PagedList<Value>>>() {
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((a) obj).f58424a;
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public LiveData<Object> f58429b = Transformations.switchMap(this.f58431d, new Function<a<Value>, LiveData<Object>>() {
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((a) obj).f58425b;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public LiveData<Object> f58430c = Transformations.switchMap(this.f58431d, new Function<a<Value>, LiveData<Object>>() {
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((a) obj).f58426c;
        }
    });

    /* renamed from: d  reason: collision with root package name */
    private MutableLiveData<a<Value>> f58431d = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.paginglibrary.java.a.a<Key, Value> f58432e = a();

    public abstract com.ss.android.ugc.aweme.paginglibrary.java.a.a<Key, Value> a();
}
