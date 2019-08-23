package com.bytedance.android.livesdk.feed.tab.b;

import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.q;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdk.feed.tab.a.b;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.List;

public class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14403a;

    /* renamed from: d  reason: collision with root package name */
    private static a f14404d;

    /* renamed from: b  reason: collision with root package name */
    j f14405b;

    /* renamed from: c  reason: collision with root package name */
    j f14406c;

    public final Observable<List<g>> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f14403a, false, 8910, new Class[0], Observable.class)) {
            return Observable.concat((ObservableSource<? extends T>) Observable.create(new b(this)), (ObservableSource<? extends T>) Observable.create(new c(this)));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f14403a, false, 8910, new Class[0], Observable.class);
    }

    public final Observable<List<g>> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f14403a, false, 8911, new Class[0], Observable.class)) {
            return this.f14406c.a().doOnNext(new d(this));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f14403a, false, 8911, new Class[0], Observable.class);
    }

    public final List<g> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f14403a, false, 8912, new Class[0], List.class)) {
            return this.f14405b.b();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f14403a, false, 8912, new Class[0], List.class);
    }

    public static a d() {
        if (PatchProxy.isSupport(new Object[0], null, f14403a, true, 8908, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f14403a, true, 8908, new Class[0], a.class);
        }
        if (f14404d == null) {
            f14404d = new a(new k(new b(), com.bytedance.android.livesdk.feed.b.b.b().getApplicationContext(), new q()), new m((FeedTabApi) d.a().d().a(FeedTabApi.class)));
        }
        return f14404d;
    }

    public final g a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f14403a, false, 8913, new Class[]{Long.TYPE}, g.class)) {
            return this.f14405b.a(j2);
        }
        return (g) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f14403a, false, 8913, new Class[]{Long.TYPE}, g.class);
    }

    public final boolean b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f14403a, false, 8915, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f14403a, false, 8915, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        g a2 = a(j);
        if (a2 == null || a2.j <= 0) {
            return false;
        }
        return true;
    }

    private a(j jVar, j jVar2) {
        this.f14405b = jVar;
        this.f14406c = jVar2;
    }
}
