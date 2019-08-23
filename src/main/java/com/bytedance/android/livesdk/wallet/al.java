package com.bytedance.android.livesdk.wallet;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.bytedance.android.live.a.a.a.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.f.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.a.b;
import com.bytedance.android.livesdk.wallet.a.i;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.util.HashMap;
import java.util.List;

public final class al implements com.bytedance.android.live.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17947a;

    /* renamed from: b  reason: collision with root package name */
    public i f17948b = new i();

    /* renamed from: c  reason: collision with root package name */
    public Subject<Integer> f17949c = PublishSubject.create();

    public static class a implements h.b<com.bytedance.android.live.f.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17964a;

        @NonNull
        public final h.b.a<com.bytedance.android.live.f.a> a(h.b.a<com.bytedance.android.live.f.a> aVar) {
            h.b.a<com.bytedance.android.live.f.a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17964a, false, 14154, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new al()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17964a, false, 14154, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final String f() {
        return this.f17948b.f17895d;
    }

    public final List<b> g() {
        return this.f17948b.f17896e;
    }

    private boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f17947a, false, 14149, new Class[0], Boolean.TYPE)) {
            return TTLiveSDKContext.getHostService().k().c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17947a, false, 14149, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final Observable<Integer> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f17947a, false, 14137, new Class[0], Observable.class)) {
            return this.f17949c.observeOn(AndroidSchedulers.mainThread());
        }
        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f17947a, false, 14137, new Class[0], Observable.class);
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f17947a, false, 14139, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17947a, false, 14139, new Class[0], Integer.TYPE)).intValue();
        } else if (!i()) {
            return 0;
        } else {
            return this.f17948b.f17892a;
        }
    }

    public final long c() {
        if (PatchProxy.isSupport(new Object[0], this, f17947a, false, 14144, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17947a, false, 14144, new Class[0], Long.TYPE)).longValue();
        } else if (!i()) {
            return 0;
        } else {
            return (long) this.f17948b.f17894c;
        }
    }

    public final long d() {
        if (PatchProxy.isSupport(new Object[0], this, f17947a, false, 14145, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17947a, false, 14145, new Class[0], Long.TYPE)).longValue();
        } else if (!i()) {
            return 0;
        } else {
            return (long) this.f17948b.f17894c;
        }
    }

    public final int h() {
        if (PatchProxy.isSupport(new Object[0], this, f17947a, false, 14143, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17947a, false, 14143, new Class[0], Integer.TYPE)).intValue();
        } else if (!i()) {
            return 0;
        } else {
            return this.f17948b.f17893b;
        }
    }

    public al() {
        if (TTLiveSDKContext.getHostService().k().c() && ((n) j.q().k().a(n.class)) != null) {
            ac.e();
            TTLiveSDKContext.getHostService().f().b();
            TTLiveSDKContext.getHostService().f().c();
            String.valueOf(TTLiveSDKContext.getHostService().k().b());
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f17947a, false, 14147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17947a, false, 14147, new Class[0], Void.TYPE);
        } else if (i()) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            ((WalletApi) j.q().d().a(WalletApi.class)).getWalletInfo(TTLiveSDKContext.getHostService().k().a().getSecUid()).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new Consumer<d<i>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17950a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    d dVar = (d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f17950a, false, 14150, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f17950a, false, 14150, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    i iVar = (i) dVar.f7871b;
                    if (iVar != null) {
                        al.this.f17948b = iVar;
                    }
                    al.this.f17949c.onNext(Integer.valueOf(al.this.b()));
                    com.bytedance.android.livesdk.wallet.b.b.g(0, SystemClock.uptimeMillis() - uptimeMillis, null);
                }
            }, new Consumer<Throwable>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17953a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    int i;
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.isSupport(new Object[]{th}, this, f17953a, false, 14151, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f17953a, false, 14151, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("error_msg", th.getMessage());
                    if (th instanceof com.bytedance.android.live.a.a.a) {
                        i = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
                    } else {
                        i = -16;
                    }
                    hashMap.put("error_code", Integer.valueOf(i));
                    com.bytedance.android.livesdk.wallet.b.b.h(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                    com.bytedance.android.livesdk.wallet.b.b.g(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                }
            });
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f17947a, false, 14138, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f17947a, false, 14138, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i()) {
            this.f17948b.f17892a = i;
            this.f17949c.onNext(Integer.valueOf(b()));
        }
    }

    public final boolean b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f17947a, false, 14140, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f17947a, false, 14140, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i() && this.f17948b.f17892a >= i) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f17947a, false, 14142, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f17947a, false, 14142, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i()) {
            this.f17948b.f17893b = i;
            this.f17949c.onNext(Integer.valueOf(b()));
        }
    }

    public final void a(final a.C0065a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17947a, false, 14148, new Class[]{a.C0065a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f17947a, false, 14148, new Class[]{a.C0065a.class}, Void.TYPE);
        } else if (!i()) {
            com.bytedance.android.live.a.a.b.a aVar2 = new com.bytedance.android.live.a.a.b.a(-666);
            aVar2.setErrorMsg("user doesn't login");
            aVar.a((Throwable) aVar2);
        } else {
            final long uptimeMillis = SystemClock.uptimeMillis();
            ((WalletApi) j.q().d().a(WalletApi.class)).getWalletInfo(TTLiveSDKContext.getHostService().k().a().getSecUid()).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new Consumer<d<i>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17956a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    d dVar = (d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f17956a, false, 14152, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f17956a, false, 14152, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    if (dVar.f7871b != null) {
                        al.this.f17948b = (i) dVar.f7871b;
                        aVar.a(((i) dVar.f7871b).f17892a);
                        al.this.f17949c.onNext(Integer.valueOf(al.this.b()));
                    } else {
                        aVar.a((Throwable) new c());
                    }
                    com.bytedance.android.livesdk.wallet.b.b.g(0, SystemClock.uptimeMillis() - uptimeMillis, null);
                }
            }, new Consumer<Throwable>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17960a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    int i;
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.isSupport(new Object[]{th}, this, f17960a, false, 14153, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f17960a, false, 14153, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("error_msg", th.getMessage());
                    if (th instanceof com.bytedance.android.live.a.a.a) {
                        i = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
                    } else {
                        i = -16;
                    }
                    hashMap.put("error_code", Integer.valueOf(i));
                    com.bytedance.android.livesdk.wallet.b.b.h(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                    com.bytedance.android.livesdk.wallet.b.b.g(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                    aVar.a(th);
                }
            });
        }
    }

    public final boolean a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f17947a, false, 14141, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f17947a, false, 14141, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i() && ((long) this.f17948b.f17893b) >= j2) {
            return true;
        } else {
            return false;
        }
    }
}
