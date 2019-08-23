package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.e.a;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

public class FeedTabViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14463a;

    /* renamed from: b  reason: collision with root package name */
    public BehaviorSubject<List<g>> f14464b = BehaviorSubject.create();

    /* renamed from: c  reason: collision with root package name */
    public PublishSubject<Integer> f14465c = PublishSubject.create();

    /* renamed from: d  reason: collision with root package name */
    k f14466d;

    /* renamed from: e  reason: collision with root package name */
    m<g> f14467e;

    /* renamed from: f  reason: collision with root package name */
    List<g> f14468f;
    int g = -1;
    long h = -1;
    public MutableLiveData<Integer> i = new MutableLiveData<>();

    public final List<g> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f14463a, false, 9009, new Class[0], List.class)) {
            return this.f14466d.c();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f14463a, false, 9009, new Class[0], List.class);
    }

    public FeedTabViewModel(k kVar, m<g> mVar, a aVar, com.bytedance.android.livesdk.feed.tab.a aVar2) {
        this.f14466d = kVar;
        this.f14467e = mVar;
        a(aVar.a().map(l.f14498b).filter(m.f14500b).subscribe(new o(this), p.f14505a));
        a(aVar2.a().subscribe(new q(this), r.f14508a));
        if (PatchProxy.isSupport(new Object[0], this, f14463a, false, 9011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14463a, false, 9011, new Class[0], Void.TYPE);
            return;
        }
        a(this.f14466d.b().subscribe());
    }
}
