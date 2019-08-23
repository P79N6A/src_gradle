package com.bytedance.android.live.core.paging.a;

import android.arch.lifecycle.MutableLiveData;
import com.bytedance.android.live.core.network.d;
import io.reactivex.subjects.PublishSubject;

public interface a<V> {
    MutableLiveData<d> a();

    MutableLiveData<d> b();

    MutableLiveData<Boolean> c();

    MutableLiveData<Boolean> d();

    PublishSubject<Object> e();

    PublishSubject<Object> f();

    PublishSubject<Object> g();

    MutableLiveData<Integer> h();
}
