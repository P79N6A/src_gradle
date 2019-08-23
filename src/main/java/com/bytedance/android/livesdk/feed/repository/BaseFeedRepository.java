package com.bytedance.android.livesdk.feed.repository;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.l;
import com.bytedance.android.livesdk.feed.r;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subjects.PublishSubject;

public abstract class BaseFeedRepository implements ItemRepository<FeedItem>, com.bytedance.android.livesdk.feed.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1855a;

    /* renamed from: b  reason: collision with root package name */
    final CompositeDisposable f1856b = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    protected l f1857c;

    /* renamed from: d  reason: collision with root package name */
    protected final b<c, FeedItem> f1858d;

    /* renamed from: e  reason: collision with root package name */
    public PublishSubject<a> f1859e = PublishSubject.create();

    /* renamed from: f  reason: collision with root package name */
    public PublishSubject<a> f1860f = PublishSubject.create();
    protected com.bytedance.android.live.core.paging.b<FeedItem> g;
    private g h;
    private r i;

    public enum a {
        START,
        SUCCESS,
        FAIL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public abstract c h();

    public com.bytedance.android.live.core.paging.b<FeedItem> i() {
        return this.g;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void registerFeedRepository() {
        if (PatchProxy.isSupport(new Object[0], this, f1855a, false, 8821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1855a, false, 8821, new Class[0], Void.TYPE);
        } else if (h() != null) {
            this.h.a(h(), (ItemRepository) this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void unRegisterFeedRepository() {
        if (PatchProxy.isSupport(new Object[0], this, f1855a, false, 8822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1855a, false, 8822, new Class[0], Void.TYPE);
            return;
        }
        if (this.h.b(h(), this)) {
            g();
            this.f1856b.clear();
        }
    }

    public final void a(LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, this, f1855a, false, 8824, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, this, f1855a, false, 8824, new Class[]{LifecycleOwner.class}, Void.TYPE);
        } else if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    public final void a(a.C0099a aVar, String str) {
        if (PatchProxy.isSupport(new Object[]{aVar, str}, this, f1855a, false, 8826, new Class[]{a.C0099a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, str}, this, f1855a, false, 8826, new Class[]{a.C0099a.class, String.class}, Void.TYPE);
            return;
        }
        this.i = new r();
        this.i.a();
        if (aVar == a.C0099a.REFRESH) {
            this.f1859e.onNext(a.START);
            if (this.f1857c != null) {
                h();
                TextUtils.equals(str, "enter_auto");
            }
        } else if (aVar == a.C0099a.LOAD_MORE) {
            this.f1860f.onNext(a.START);
            if (this.i != null) {
                this.i.a();
            }
            if (this.f1857c != null) {
                h();
            }
        }
    }

    public BaseFeedRepository(g gVar, l lVar, b<c, FeedItem> bVar) {
        this.h = gVar;
        this.f1857c = lVar;
        this.f1858d = bVar;
    }

    public final void a(a.C0099a aVar, String str, Extra extra) {
        a.C0099a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, extra}, this, f1855a, false, 8827, new Class[]{a.C0099a.class, String.class, Extra.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, extra}, this, f1855a, false, 8827, new Class[]{a.C0099a.class, String.class, Extra.class}, Void.TYPE);
            return;
        }
        if (aVar2 == a.C0099a.REFRESH) {
            this.f1859e.onNext(a.SUCCESS);
            if (this.f1857c != null) {
                h();
                TextUtils.equals(str2, "enter_auto");
            }
            if (this.i != null) {
                this.i.a("refresh");
            }
        } else if (aVar2 == a.C0099a.LOAD_MORE) {
            this.f1860f.onNext(a.SUCCESS);
            if (this.f1857c != null) {
                h();
            }
            if (this.i != null) {
                this.i.a("load_more");
            }
        }
    }

    public final void a(a.C0099a aVar, String str, Throwable th) {
        a.C0099a aVar2 = aVar;
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, th2}, this, f1855a, false, 8828, new Class[]{a.C0099a.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, th2}, this, f1855a, false, 8828, new Class[]{a.C0099a.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (aVar2 == a.C0099a.REFRESH) {
            this.f1859e.onNext(a.FAIL);
            if (this.f1857c != null) {
                h();
                TextUtils.equals(str2, "enter_auto");
            }
            if (this.i != null && NetworkUtils.isNetworkAvailable(h.d())) {
                this.i.a("refresh", th2);
            }
        } else if (aVar2 == a.C0099a.LOAD_MORE) {
            this.f1860f.onNext(a.FAIL);
            if (this.f1857c != null) {
                h();
            }
            if (this.i != null && NetworkUtils.isNetworkAvailable(h.d())) {
                this.i.a("load_more", th2);
            }
        }
    }
}
