package com.bytedance.android.livesdk.user;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.a.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.f;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.chatroom.event.v;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;

public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17465a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public i f17466b = new j();
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.android.livesdkapi.host.l f17467c;

    /* renamed from: d  reason: collision with root package name */
    public final PublishProcessor<com.bytedance.android.live.base.model.user.l> f17468d = PublishProcessor.create();

    /* renamed from: e  reason: collision with root package name */
    final PublishSubject<i> f17469e = PublishSubject.create();

    /* renamed from: f  reason: collision with root package name */
    final PublishSubject<a> f17470f = PublishSubject.create();
    public PublishSubject<i> g;
    @NonNull
    private com.bytedance.android.live.core.a.a<Long, i> h = new c();
    @NonNull
    private UserApi i;
    @NonNull
    private FollowApi j;
    private com.bytedance.android.livesdkapi.host.a.a k = new com.bytedance.android.livesdkapi.host.a.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17471a;

        public final void a(final i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f17471a, false, 13585, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f17471a, false, 13585, new Class[]{i.class}, Void.TYPE);
                return;
            }
            if (l.this.g != null) {
                l.this.f17466b = iVar;
                l.this.e().subscribe((SingleObserver<? super T>) new SingleObserver<i>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f17473a;

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(Disposable disposable) {
                    }

                    public final /* synthetic */ void onSuccess(Object obj) {
                        i iVar = (i) obj;
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f17473a, false, 13587, new Class[]{i.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{iVar}, this, f17473a, false, 13587, new Class[]{i.class}, Void.TYPE);
                            return;
                        }
                        if (l.this.g != null) {
                            l.this.g.onNext(iVar);
                            l.this.g.onComplete();
                            l.this.g = null;
                        }
                        v vVar = new v();
                        vVar.f10201a = true;
                        vVar.f10202b = iVar;
                        com.bytedance.android.livesdk.u.a.a().a((Object) vVar);
                        l.this.f17468d.onNext(new com.bytedance.android.live.base.model.user.l(i.a.Login, iVar));
                        l.this.b(iVar);
                    }
                });
            }
        }
    };

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f17465a, false, 13557, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f17465a, false, 13557, new Class[]{Integer.TYPE}, Void.TYPE);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f17465a, false, 13550, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f17465a, false, 13550, new Class[]{Boolean.TYPE}, Void.TYPE);
        }
    }

    @NonNull
    public final i a() {
        return this.f17466b;
    }

    @NonNull
    public final Flowable<com.bytedance.android.live.base.model.user.l> d() {
        return this.f17468d;
    }

    @NonNull
    public final Observable<i> f() {
        return this.f17469e;
    }

    @NonNull
    public final Observable<a> g() {
        return this.f17470f;
    }

    public final void a(i iVar) {
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f17465a, false, 13547, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f17465a, false, 13547, new Class[]{i.class}, Void.TYPE);
            return;
        }
        if (iVar2 != null) {
            this.h.a(Long.valueOf(iVar.getId()), iVar2);
        }
    }

    public final boolean a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f17465a, false, 13548, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar}, this, f17465a, false, 13548, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        hVar.getFunc();
        return false;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17465a, false, 13549, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f17465a, false, 13549, new Class[]{a.class}, Void.TYPE);
            return;
        }
        i iVar = (i) this.h.b(Long.valueOf(aVar.f18689a));
        if (iVar != null) {
            iVar.setFollowStatus(aVar.a());
        }
        this.f17470f.onNext(aVar);
    }

    public final String a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f17465a, false, 13553, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f17465a, false, 13553, new Class[]{Long.TYPE}, String.class);
        }
        i iVar = (i) this.h.b(Long.valueOf(j2));
        if (iVar != null) {
            return iVar.getSecUid();
        }
        return null;
    }

    public final void a(String str, DialogInterface.OnClickListener onClickListener, Context context, String str2, String str3, long j2, boolean z) {
        String str4 = str;
        Context context2 = context;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str4, onClickListener, context2, str2, str3, new Long(j3), (byte) 0}, this, f17465a, false, 13555, new Class[]{String.class, DialogInterface.OnClickListener.class, Context.class, String.class, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, onClickListener, context2, str2, str3, new Long(j3), (byte) 0}, this, f17465a, false, 13555, new Class[]{String.class, DialogInterface.OnClickListener.class, Context.class, String.class, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Object[] objArr = {str4, onClickListener, context2, str2, str3, new Long(j3), (byte) 0, (byte) 0, "", ""};
        if (PatchProxy.isSupport(objArr, this, f17465a, false, 13556, new Class[]{String.class, DialogInterface.OnClickListener.class, Context.class, String.class, String.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, onClickListener, context2, str2, str3, new Long(j3), (byte) 0, (byte) 0, "", ""}, this, f17465a, false, 13556, new Class[]{String.class, DialogInterface.OnClickListener.class, Context.class, String.class, String.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (context2 != null) {
            b.a aVar = new b.a(context2, C0906R.style.vc);
            b.a b2 = aVar.a((CharSequence) str4).b((int) C0906R.string.cpz, m.f17486b);
            n nVar = new n(str2, j2, str3, false, "", "", onClickListener);
            b2.a((int) C0906R.string.dg_, (DialogInterface.OnClickListener) nVar);
            b a2 = aVar.a();
            a2.show();
            f.a(a2);
        }
    }

    public final Single<User> a(HashMap<String, String> hashMap) {
        if (!PatchProxy.isSupport(new Object[]{hashMap}, this, f17465a, false, 13560, new Class[]{HashMap.class}, Single.class)) {
            return this.i.queryUser(hashMap).subscribeOn(Schedulers.io()).map(u.f17510b).doOnSuccess(new v(this)).observeOn(AndroidSchedulers.mainThread());
        }
        return (Single) PatchProxy.accessDispatch(new Object[]{hashMap}, this, f17465a, false, 13560, new Class[]{HashMap.class}, Single.class);
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f17465a, false, 13552, new Class[0], Long.TYPE)) {
            return this.f17466b.getId();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17465a, false, 13552, new Class[0], Long.TYPE)).longValue();
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f17465a, false, 13554, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17465a, false, 13554, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f17466b.getId() > 0) {
            z = true;
        }
        return z;
    }

    public final Single<i> e() {
        if (PatchProxy.isSupport(new Object[0], this, f17465a, false, 13561, new Class[0], Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[0], this, f17465a, false, 13561, new Class[0], Single.class);
        }
        long c2 = this.f17467c.c();
        return this.i.queryUser(c2, 2, a(c2)).subscribeOn(Schedulers.io()).map(w.f17514b).observeOn(AndroidSchedulers.mainThread()).doOnSuccess(new x(this));
    }

    public l(com.bytedance.android.livesdkapi.host.l lVar) {
        this.f17467c = lVar;
        b(lVar.b());
        this.i = (UserApi) j.q().d().a(UserApi.class);
        this.j = (FollowApi) j.q().d().a(FollowApi.class);
        lVar.a((com.bytedance.android.livesdkapi.depend.i.b) new o(this, lVar));
        lVar.a((com.bytedance.android.livesdkapi.depend.i.a) new p(this));
        e().subscribe((SingleObserver<? super T>) new g<Object>());
    }

    public final Observable<a> a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f17465a, false, 13564, new Class[]{b.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f17465a, false, 13564, new Class[]{b.class}, Observable.class);
        }
        return a(1, bVar2.f17429a, bVar2.f17435e);
    }

    public final Single<User> b(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f17465a, false, 13559, new Class[]{Long.TYPE}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f17465a, false, 13559, new Class[]{Long.TYPE}, Single.class);
        }
        return this.i.queryUser(j2, 2, a(j2)).subscribeOn(Schedulers.io()).map(s.f17506b).doOnSuccess(new t(this)).observeOn(AndroidSchedulers.mainThread());
    }

    @NonNull
    public final Observable<i> c(long j2) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f17465a, false, 13562, new Class[]{Long.TYPE}, Observable.class)) {
            return this.f17469e.filter(new y(j3));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f17465a, false, 13562, new Class[]{Long.TYPE}, Observable.class);
    }

    @NonNull
    public final Observable<a> d(long j2) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f17465a, false, 13563, new Class[]{Long.TYPE}, Observable.class)) {
            return this.f17470f.filter(new z(j3));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f17465a, false, 13563, new Class[]{Long.TYPE}, Observable.class);
    }

    public final void b(@Nullable i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f17465a, false, 13568, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f17465a, false, 13568, new Class[]{i.class}, Void.TYPE);
        } else if (iVar != null) {
            this.f17466b = iVar;
            this.f17468d.onNext(new com.bytedance.android.live.base.model.user.l(i.a.Update, iVar));
            this.h.a(Long.valueOf(iVar.getId()), iVar);
            this.f17469e.onNext(iVar);
        } else {
            this.f17466b = new j();
        }
    }

    public final Observable<a> a(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f17465a, false, 13566, new Class[]{d.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{dVar2}, this, f17465a, false, 13566, new Class[]{d.class}, Observable.class);
        }
        return a(1, dVar2.f17429a, dVar2.f17435e);
    }

    public final Observable<a> a(k kVar) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, f17465a, false, 13565, new Class[]{k.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{kVar2}, this, f17465a, false, 13565, new Class[]{k.class}, Observable.class);
        }
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, f17465a, false, 13569, new Class[]{a.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{kVar2}, this, f17465a, false, 13569, new Class[]{a.class}, Observable.class);
        }
        return Observable.create(new q(this, kVar2, kVar2));
    }

    public final Observable<i> a(Context context, i iVar) {
        Context context2 = context;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{context2, iVar2}, this, f17465a, false, 13558, new Class[]{Context.class, i.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{context2, iVar2}, this, f17465a, false, 13558, new Class[]{Context.class, i.class}, Observable.class);
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdkapi.f.a(1, "login"));
        }
        FragmentActivity fragmentActivity = null;
        if (context2 instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context2;
        } else if (context2 instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) contextWrapper.getBaseContext();
            }
        }
        if (fragmentActivity != null) {
            this.f17467c.a(fragmentActivity, this.k, iVar2.f17445b, iVar2.f17446c, iVar2.f17447d, iVar2.f17448e, iVar2.f17449f, iVar2.g);
            this.g = PublishSubject.create();
            return this.g.observeOn(AndroidSchedulers.mainThread());
        }
        throw new IllegalArgumentException("Argument \"context\" cannot be transformed to FragmentActivity in UserCenter.login() method. ");
    }

    public final Observable<a> a(int i2, long j2, long j3) {
        long j4;
        Observable<d<c>> observable;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j5), new Long(j6)}, this, f17465a, false, 13570, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j5), new Long(j6)}, this, f17465a, false, 13570, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Observable.class);
        }
        if (i2 == 1) {
            j4 = j5;
            observable = this.j.follow(i2, j2, j3, a().getSecUid(), a(j5));
        } else {
            j4 = j5;
            observable = this.j.unfollow(i2, a().getSecUid(), j2, a(j4), j3);
        }
        return observable.compose(com.bytedance.android.live.core.rxutils.i.a()).map(new r(this, j4));
    }
}
