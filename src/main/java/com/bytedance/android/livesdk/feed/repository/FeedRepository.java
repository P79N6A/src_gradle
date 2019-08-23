package com.bytedance.android.livesdk.feed.repository;

import android.arch.paging.PagedList;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.a.n;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.network.d;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.l;
import com.bytedance.android.livesdk.feed.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FeedRepository extends BaseFeedRepository implements IFeedRepository, com.bytedance.android.livesdk.feed.a {
    public static ChangeQuickRedirect h;
    protected final FeedApi i;
    protected final com.bytedance.android.live.core.a.a<c, Extra> j;
    protected IFeedRepository.a k;
    protected com.bytedance.android.livesdk.feed.d.a<b<FeedItem>, com.bytedance.android.livesdk.feed.d.b> l;
    protected PublishSubject<Object> m = PublishSubject.create();
    protected PublishSubject<String> n = PublishSubject.create();
    protected PublishSubject<List<ImageModel>> o = PublishSubject.create();
    protected PublishSubject<Pair<String, String>> p = PublishSubject.create();
    protected PublishSubject<String> q = PublishSubject.create();
    protected final com.bytedance.android.livesdk.feed.e.a r;
    protected b<FeedItem> s;
    protected int t = -1;
    protected final com.bytedance.android.live.core.a.a<Long, Integer> u;
    public g v;
    public a w;
    String x;
    private com.bytedance.android.livesdk.feed.c.a y;
    private p z;

    public static class a implements com.bytedance.android.live.core.paging.b.b<FeedItem> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14328a;

        /* renamed from: b  reason: collision with root package name */
        int f14329b;

        /* renamed from: c  reason: collision with root package name */
        public String f14330c;

        /* renamed from: d  reason: collision with root package name */
        String f14331d = "enter_auto";

        /* renamed from: e  reason: collision with root package name */
        String f14332e = "feed_loadmore";

        /* renamed from: f  reason: collision with root package name */
        C0101a f14333f;
        g g;
        PublishSubject<String> h;
        PublishSubject<String> i;
        long j;
        com.bytedance.android.livesdk.feed.a k;
        PublishSubject<List<ImageModel>> l;
        final CompositeDisposable m = new CompositeDisposable();
        private FeedApi n;
        private com.bytedance.android.livesdk.feed.e.a o;
        private com.bytedance.android.livesdk.feed.c.a p;
        private c q;
        private p r;

        /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a$a  reason: collision with other inner class name */
        interface C0101a {
            void a(List<FeedItem> list, boolean z);
        }

        private void a(Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f14328a, false, 8851, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f14328a, false, 8851, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            this.m.add(disposable2);
        }

        public final Observable<Pair<List<FeedItem>, Extra>> a(boolean z, Long l2, int i2) {
            Observable<com.bytedance.android.live.core.network.response.c<FeedItem>> observable;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), l2, Integer.valueOf(i2)}, this, f14328a, false, 8849, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), l2, Integer.valueOf(i2)}, this, f14328a, false, 8849, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class);
            }
            a(Observable.just(1).delay(3000, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new i(this), j.f14351b));
            if (z2) {
                this.k.a(a.C0099a.REFRESH, this.f14331d);
                if (this.j > 0) {
                    observable = this.n.feed(this.f14330c, 0, "push");
                } else {
                    if (((Boolean) com.bytedance.android.livesdk.feed.j.b.j.a()).booleanValue() && com.bytedance.android.livesdk.feed.b.b.c().a().c().equals("local_test")) {
                        this.f14331d = "feed_refresh_local_test";
                    }
                    observable = this.n.feed(this.f14330c, 0, this.f14331d);
                }
                this.h.onNext(this.f14331d);
            } else {
                this.k.a(a.C0099a.LOAD_MORE, this.f14332e);
                observable = this.n.feed(this.f14330c, l2.longValue(), this.f14332e);
                this.h.onNext(this.f14332e);
                this.i.onNext(this.f14332e);
            }
            return observable.map(new k(this, z)).doOnNext(new l(this)).doOnNext(new m(this)).doOnNext(n.f14360b).doOnNext(new o(this)).doOnError(new p(this, z));
        }

        a(String str, FeedApi feedApi, com.bytedance.android.livesdk.feed.e.a aVar, g gVar, PublishSubject<Pair<String, String>> publishSubject, com.bytedance.android.livesdk.feed.a aVar2, PublishSubject<String> publishSubject2, PublishSubject<String> publishSubject3, C0101a aVar3, com.bytedance.android.livesdk.feed.c.a aVar4, c cVar, PublishSubject<List<ImageModel>> publishSubject4, p pVar) {
            this.f14330c = str;
            this.n = feedApi;
            this.f14333f = aVar3;
            this.g = gVar;
            this.o = aVar;
            this.p = aVar4;
            this.q = cVar;
            this.h = publishSubject2;
            this.k = aVar2;
            this.i = publishSubject3;
            a(publishSubject.subscribe(new f(this), g.f14345a));
            this.l = publishSubject4;
            this.r = pVar;
        }
    }

    public final PublishSubject<Object> a() {
        return this.m;
    }

    public final Observable<String> b() {
        return this.n;
    }

    public final Observable<List<ImageModel>> c() {
        return this.o;
    }

    public final g e() {
        return this.v;
    }

    public final b<FeedItem> i() {
        return this.s;
    }

    public final com.bytedance.android.livesdk.feed.d.a<b<FeedItem>, com.bytedance.android.livesdk.feed.d.b> j() {
        return this.l;
    }

    private int k() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8833, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 8833, new Class[0], Integer.TYPE)).intValue();
        } else if (this.k == null || this.k.b() <= 0) {
            return 12;
        } else {
            return this.k.b();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 8842, new Class[0], Void.TYPE);
            return;
        }
        if (this.f1857c != null) {
            h();
            TextUtils.equals(this.x, "enter_auto");
            h();
        }
    }

    public final List<FeedItem> f() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 8838, new Class[0], List.class)) {
            return this.f1858d.a(h());
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, h, false, 8838, new Class[0], List.class);
    }

    public final c h() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8843, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, h, false, 8843, new Class[0], c.class);
        } else if (this.k != null) {
            return this.k.a();
        } else {
            throw new IllegalStateException("not call init() or params be null");
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 8836, new Class[0], Void.TYPE);
            return;
        }
        this.f1858d.b(h());
        if (this.w != null) {
            a aVar = this.w;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f14328a, false, 8852, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f14328a, false, 8852, new Class[0], Void.TYPE);
                return;
            }
            aVar.m.clear();
        }
    }

    public final void a(IFeedRepository.a aVar) {
        this.k = aVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) {
        boolean z2;
        if (dVar != null) {
            if (dVar.f7863b == d.a.SUCCESS) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.m != null) {
                this.m.onNext(i.f8107b);
            }
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, h, false, 8835, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, h, false, 8835, new Class[]{String.class}, Void.TYPE);
            return;
        }
        FeedItem c2 = c(str);
        if (c2 != null) {
            this.f1858d.a(h(), c2);
        }
        if (this.s != null) {
            this.s.h();
        }
    }

    public final FeedItem c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, h, false, 8837, new Class[]{String.class}, FeedItem.class)) {
            return (FeedItem) this.f1858d.a(h(), (n<V>) new e<V>(str2));
        }
        return (FeedItem) PatchProxy.accessDispatch(new Object[]{str2}, this, h, false, 8837, new Class[]{String.class}, FeedItem.class);
    }

    public final com.bytedance.android.livesdk.feed.d.a<b<FeedItem>, com.bytedance.android.livesdk.feed.d.b> a(String str) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{str}, this, h, false, 8831, new Class[]{String.class}, com.bytedance.android.livesdk.feed.d.a.class)) {
            return (com.bytedance.android.livesdk.feed.d.a) PatchProxy.accessDispatch(new Object[]{str}, this, h, false, 8831, new Class[]{String.class}, com.bytedance.android.livesdk.feed.d.a.class);
        }
        FeedApi feedApi = this.i;
        com.bytedance.android.livesdk.feed.e.a aVar = this.r;
        g gVar = this.v;
        PublishSubject<Pair<String, String>> publishSubject = this.p;
        PublishSubject<String> publishSubject2 = this.q;
        PublishSubject<String> publishSubject3 = this.n;
        c cVar = new c(this);
        com.bytedance.android.livesdk.feed.c.a aVar2 = this.y;
        c a2 = this.k.a();
        PublishSubject<List<ImageModel>> publishSubject4 = this.o;
        PublishSubject<List<ImageModel>> publishSubject5 = publishSubject4;
        a aVar3 = r0;
        a aVar4 = new a(str, feedApi, aVar, gVar, publishSubject, this, publishSubject2, publishSubject3, cVar, aVar2, a2, publishSubject5, this.z);
        this.w = aVar3;
        com.bytedance.android.live.core.paging.a.d a3 = new com.bytedance.android.live.core.paging.a.d().a((com.bytedance.android.live.core.paging.b.b<V>) this.w).a(this.k.a()).a(this.f1858d, this.j);
        PagedList.Config.Builder initialLoadSizeHint = new PagedList.Config.Builder().setEnablePlaceholders(false).setPageSize(k()).setInitialLoadSizeHint(k());
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8834, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 8834, new Class[0], Integer.TYPE)).intValue();
        } else if (this.k == null || this.k.c() <= 0) {
            i2 = 4;
        } else {
            i2 = this.k.c();
        }
        b<FeedItem> j2 = a3.a(initialLoadSizeHint.setPrefetchDistance(i2).build()).j();
        this.l = new com.bytedance.android.livesdk.feed.d.a<>(j2, new com.bytedance.android.livesdk.feed.d.b());
        this.s = j2;
        j2.c().observeForever(new d(this));
        return this.l;
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, h, false, 8841, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, h, false, 8841, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.p.onNext(new Pair(str3, str4));
    }

    public FeedRepository(g gVar, FeedApi feedApi, com.bytedance.android.live.core.a.a<c, Extra> aVar, com.bytedance.android.live.core.a.b<c, FeedItem> bVar, com.bytedance.android.live.core.a.a<Long, Integer> aVar2, com.bytedance.android.livesdk.feed.e.a aVar3, l lVar, com.bytedance.android.livesdk.feed.c.a aVar4) {
        super(gVar, null, bVar);
        this.v = gVar;
        this.i = feedApi;
        this.j = aVar;
        this.u = aVar2;
        this.r = aVar3;
        this.y = aVar4;
        Disposable subscribe = this.q.subscribe(new a(this), b.f14336a);
        if (PatchProxy.isSupport(new Object[]{subscribe}, this, BaseFeedRepository.f1855a, false, 8825, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{subscribe}, this, BaseFeedRepository.f1855a, false, 8825, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        this.f1856b.add(subscribe);
    }
}
