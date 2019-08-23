package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.LiveData;
import android.arch.paging.PagedList;
import com.bytedance.android.live.core.network.d;

public interface b<T> {
    LiveData<PagedList<T>> a();

    void a(int i);

    void a(T t);

    int b(T t);

    LiveData<d> b();

    LiveData<d> c();

    LiveData<Boolean> d();

    LiveData<Boolean> e();

    void f();

    void g();

    void h();

    LiveData<Integer> i();
}
