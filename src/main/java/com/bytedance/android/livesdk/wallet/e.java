package com.bytedance.android.livesdk.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.f.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.RechargeDialog;
import com.bytedance.android.livesdk.wallet.a.a;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.bytedance.android.livesdk.wallet.b.a;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.n;
import com.bytedance.android.livesdkapi.host.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class e extends d<f> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f17981b;

    /* renamed from: c  reason: collision with root package name */
    protected Activity f17982c;

    /* renamed from: d  reason: collision with root package name */
    public String f17983d;

    /* renamed from: e  reason: collision with root package name */
    public String f17984e;

    /* renamed from: f  reason: collision with root package name */
    String f17985f;
    public String g;
    int h;
    private final k i;
    private final i j;
    private Disposable k;

    static class a implements Function<Observable<Throwable>, ObservableSource<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18042a;

        /* renamed from: b  reason: collision with root package name */
        int f18043b;

        private a() {
            this.f18043b = 1;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Observable observable = (Observable) obj;
            if (!PatchProxy.isSupport(new Object[]{observable}, this, f18042a, false, 13917, new Class[]{Observable.class}, ObservableSource.class)) {
                return observable.flatMap(new Function<Throwable, ObservableSource<?>>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f18044a;

                    public final /* synthetic */ Object apply(Object obj) throws Exception {
                        Throwable th = (Throwable) obj;
                        if (PatchProxy.isSupport(new Object[]{th}, this, f18044a, false, 13918, new Class[]{Throwable.class}, ObservableSource.class)) {
                            return (ObservableSource) PatchProxy.accessDispatch(new Object[]{th}, this, f18044a, false, 13918, new Class[]{Throwable.class}, ObservableSource.class);
                        }
                        int i = -1;
                        if (th instanceof com.bytedance.android.live.a.a.a.a) {
                            i = ((com.bytedance.android.live.a.a.a.a) th).getErrorCode();
                        }
                        if ((i != 3 && i != 4) || a.this.f18043b > 5) {
                            return Observable.error(th);
                        }
                        if (a.this.f18043b != 5) {
                            a.this.f18043b++;
                        }
                        return Observable.timer(1000, TimeUnit.MILLISECONDS);
                    }
                });
            }
            return (ObservableSource) PatchProxy.accessDispatch(new Object[]{observable}, this, f18042a, false, 13917, new Class[]{Observable.class}, ObservableSource.class);
        }
    }

    public final void a(c cVar, com.bytedance.android.livesdkapi.depend.model.a aVar, r rVar) {
        final c cVar2 = cVar;
        final com.bytedance.android.livesdkapi.depend.model.a aVar2 = aVar;
        final r rVar2 = rVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, aVar2, rVar2}, this, f17981b, false, 13886, new Class[]{c.class, com.bytedance.android.livesdkapi.depend.model.a.class, r.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, aVar2, rVar2}, this, f17981b, false, 13886, new Class[]{c.class, com.bytedance.android.livesdkapi.depend.model.a.class, r.class}, Void.TYPE);
            return;
        }
        AnonymousClass10 r0 = new n.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17988a;

            public final void a(r rVar, Throwable th) {
                Exception exc;
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{rVar, th2}, this, f17988a, false, 13909, new Class[]{r.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{rVar, th2}, this, f17988a, false, 13909, new Class[]{r.class, Throwable.class}, Void.TYPE);
                    return;
                }
                if (e.this.b() != null) {
                    f fVar = (f) e.this.b();
                    if (th2 instanceof Exception) {
                        exc = (Exception) th2;
                    } else {
                        exc = new Exception(th2);
                    }
                    fVar.b(exc, 0);
                }
                String str = "-15";
                if (th2 instanceof com.bytedance.android.live.a.a.a) {
                    str = String.valueOf(((com.bytedance.android.live.a.a.a) th2).getErrorCode());
                }
                String str2 = str;
                e.this.a(1, cVar2.f18695a, aVar2.f18678a, rVar, str2, th.getMessage());
            }

            public final void a(r rVar, String str, String str2, String str3) {
                Observable observable;
                HashMap hashMap;
                r rVar2 = rVar;
                String str4 = str2;
                String str5 = str3;
                if (PatchProxy.isSupport(new Object[]{rVar2, str, str4, str5}, this, f17988a, false, 13908, new Class[]{r.class, String.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{rVar2, str, str4, str5}, this, f17988a, false, 13908, new Class[]{r.class, String.class, String.class, String.class}, Void.TYPE);
                } else if ((rVar2 == r.WEIXIN && TextUtils.equals(PushConstants.PUSH_TYPE_NOTIFY, str4)) || (rVar2 == r.ALIPAY && TextUtils.equals("9000", str4))) {
                    String str6 = "";
                    if (rVar2 == r.WEIXIN) {
                        str6 = "wxpay";
                    } else if (rVar2 == r.ALIPAY) {
                        str6 = "alipay";
                    }
                    String str7 = str6;
                    e eVar = e.this;
                    c cVar = cVar2;
                    int a2 = aVar2.a();
                    Object[] objArr = {cVar, str4, Integer.valueOf(a2), str7};
                    if (PatchProxy.isSupport(objArr, eVar, e.f17981b, false, 13890, new Class[]{c.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
                        Object[] objArr2 = {cVar, str4, Integer.valueOf(a2), str7};
                        Object[] objArr3 = objArr2;
                        e eVar2 = eVar;
                        PatchProxy.accessDispatch(objArr3, eVar2, e.f17981b, false, 13890, new Class[]{c.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
                    } else if (!TextUtils.isEmpty(cVar.f18695a)) {
                        if (eVar.b() != null) {
                            ((f) eVar.b()).a((int) C0906R.string.dgp);
                        }
                        a aVar = new a((byte) 0);
                        if (e.a() == 2) {
                            WalletApi walletApi = (WalletApi) j.q().d().a(WalletApi.class);
                            if (PatchProxy.isSupport(new Object[]{cVar, str4}, eVar, e.f17981b, false, 13891, new Class[]{c.class, String.class}, HashMap.class)) {
                                Object[] objArr4 = {cVar, str4};
                                e eVar3 = eVar;
                                hashMap = (HashMap) PatchProxy.accessDispatch(objArr4, eVar3, e.f17981b, false, 13891, new Class[]{c.class, String.class}, HashMap.class);
                            } else {
                                hashMap = new HashMap();
                                hashMap.put("OrderId", cVar.f18695a);
                                hashMap.put("ChannelParam", str4);
                                hashMap.put("ChannelId", cVar.f18700f);
                                TTLiveSDKContext.getHostService().a();
                                hashMap.put("AppId", "1128");
                            }
                            observable = ((b) walletApi.getOrderStatus(hashMap).compose(i.a()).map(new Function<com.bytedance.android.live.core.network.response.b<com.bytedance.android.livesdk.wallet.a.e, Extra>, com.bytedance.android.livesdk.wallet.a.a>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18009a;

                                public final /* synthetic */ Object apply(Object obj) throws Exception {
                                    com.bytedance.android.live.core.network.response.b bVar = (com.bytedance.android.live.core.network.response.b) obj;
                                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f18009a, false, 13899, new Class[]{com.bytedance.android.live.core.network.response.b.class}, com.bytedance.android.livesdk.wallet.a.a.class)) {
                                        return (com.bytedance.android.livesdk.wallet.a.a) PatchProxy.accessDispatch(new Object[]{bVar}, this, f18009a, false, 13899, new Class[]{com.bytedance.android.live.core.network.response.b.class}, com.bytedance.android.livesdk.wallet.a.a.class);
                                    }
                                    e eVar = e.this;
                                    if (PatchProxy.isSupport(new Object[]{bVar}, eVar, e.f17981b, false, 13896, new Class[]{com.bytedance.android.live.core.network.response.b.class}, com.bytedance.android.livesdk.wallet.a.a.class)) {
                                        return (com.bytedance.android.livesdk.wallet.a.a) PatchProxy.accessDispatch(new Object[]{bVar}, eVar, e.f17981b, false, 13896, new Class[]{com.bytedance.android.live.core.network.response.b.class}, com.bytedance.android.livesdk.wallet.a.a.class);
                                    }
                                    com.bytedance.android.livesdk.wallet.a.a aVar = new com.bytedance.android.livesdk.wallet.a.a();
                                    a.C0126a aVar2 = new a.C0126a();
                                    aVar2.f17864b = ((com.bytedance.android.livesdk.wallet.a.e) bVar.f7871b).f17878a;
                                    aVar.f7870a = bVar.f7870a;
                                    aVar.f7872c = new a.b();
                                    aVar.f7871b = aVar2;
                                    return aVar;
                                }
                            }).doOnNext(new Consumer<com.bytedance.android.livesdk.wallet.a.a>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18007a;

                                public final /* synthetic */ void accept(Object obj) throws Exception {
                                    com.bytedance.android.livesdk.wallet.a.a aVar = (com.bytedance.android.livesdk.wallet.a.a) obj;
                                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f18007a, false, 13916, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f18007a, false, 13916, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
                                    } else if (aVar.a() != 5) {
                                        throw new com.bytedance.android.live.a.a.a.a(aVar.a(), new RuntimeException("query status was fail"));
                                    }
                                }
                            }).as(com.bytedance.android.livesdk.utils.b.c.a())).a((Function<Observable<Throwable>, ObservableSource<?>>) aVar);
                        } else {
                            observable = ((WalletApi) j.q().d().a(WalletApi.class)).queryOrder(cVar.f18695a).compose(i.a()).doOnNext(new Consumer<com.bytedance.android.livesdk.wallet.a.a>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18011a;

                                public final /* synthetic */ void accept(Object obj) throws Exception {
                                    com.bytedance.android.livesdk.wallet.a.a aVar = (com.bytedance.android.livesdk.wallet.a.a) obj;
                                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f18011a, false, 13900, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f18011a, false, 13900, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
                                    } else if (aVar.a() != 1) {
                                        throw new com.bytedance.android.live.a.a.a.a(aVar.a(), new RuntimeException("query status was fail"));
                                    }
                                }
                            });
                        }
                        Observable observable2 = observable;
                        AnonymousClass4 r1 = new Consumer<com.bytedance.android.livesdk.wallet.a.a>(aVar, cVar, a2, str7) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f18013a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ a f18014b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ c f18015c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ int f18016d;

                            /* renamed from: e  reason: collision with root package name */
                            final /* synthetic */ String f18017e;

                            public final /* synthetic */ void accept(Object obj) throws Exception {
                                int i;
                                com.bytedance.android.livesdk.wallet.a.a aVar = (com.bytedance.android.livesdk.wallet.a.a) obj;
                                if (PatchProxy.isSupport(new Object[]{aVar}, this, f18013a, false, 13901, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f18013a, false, 13901, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
                                    return;
                                }
                                if (e.this.b() != null) {
                                    ((f) e.this.b()).c();
                                }
                                e.this.a(0, this.f18014b.f18043b, this.f18015c, (Throwable) null, this.f18016d);
                                if (e.this.b() != null) {
                                    ((f) e.this.b()).a(this.f18016d, aVar);
                                } else {
                                    j.q().n().e();
                                }
                                e eVar = e.this;
                                String valueOf = String.valueOf(this.f18016d);
                                String str = this.f18017e;
                                if (PatchProxy.isSupport(new Object[]{valueOf, str}, eVar, e.f17981b, false, 13892, new Class[]{String.class, String.class}, Void.TYPE)) {
                                    e eVar2 = eVar;
                                    PatchProxy.accessDispatch(new Object[]{valueOf, str}, eVar2, e.f17981b, false, 13892, new Class[]{String.class, String.class}, Void.TYPE);
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("money", valueOf);
                                hashMap.put("pay_method", str);
                                hashMap.put("charge_reason", eVar.f17983d);
                                hashMap.put("request_page", eVar.f17984e);
                                hashMap.put("flame_from", eVar.f17985f);
                                if (TTLiveSDKContext.getHostService().k().a().getPayScores() > 0) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                                hashMap.put("is_first_recharge", String.valueOf(i));
                                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                if (eVar.h == 1) {
                                    hashMap.put("panel_type", "first_recharge");
                                } else if (eVar.h == 2) {
                                    hashMap.put("panel_type", "small_heart");
                                } else {
                                    hashMap.put("panel_type", "normal");
                                }
                                com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_success", hashMap, com.bytedance.android.livesdk.j.c.j.class, Room.class);
                            }

                            {
                                this.f18014b = r2;
                                this.f18015c = r3;
                                this.f18016d = r4;
                                this.f18017e = r5;
                            }
                        };
                        observable2.subscribe(r1, new Consumer<Throwable>(aVar, cVar, a2) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f18019a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ a f18020b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ c f18021c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ int f18022d;

                            public final /* synthetic */ void accept(Object obj) throws Exception {
                                Exception exc;
                                Throwable th = (Throwable) obj;
                                if (PatchProxy.isSupport(new Object[]{th}, this, f18019a, false, 13902, new Class[]{Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{th}, this, f18019a, false, 13902, new Class[]{Throwable.class}, Void.TYPE);
                                    return;
                                }
                                e.this.a(1, this.f18020b.f18043b, this.f18021c, th, this.f18022d);
                                if (e.this.b() != null) {
                                    ((f) e.this.b()).c();
                                }
                                if (e.this.b() != null) {
                                    f fVar = (f) e.this.b();
                                    if (th instanceof Exception) {
                                        exc = (Exception) th;
                                    } else {
                                        exc = new Exception(th);
                                    }
                                    fVar.b(exc, 0);
                                }
                            }

                            {
                                this.f18020b = r2;
                                this.f18021c = r3;
                                this.f18022d = r4;
                            }
                        });
                    }
                    e.this.a(0, cVar2.f18695a, aVar2.f18678a, rVar, PushConstants.PUSH_TYPE_NOTIFY, str3);
                } else if ((rVar2 != r.WEIXIN || !TextUtils.equals(str4, "-2")) && (rVar2 != r.ALIPAY || !TextUtils.equals(str4, "6001"))) {
                    if (e.this.b() != null) {
                        ((f) e.this.b()).b(new Exception(str5), 0);
                    }
                    e.this.a(1, cVar2.f18695a, aVar2.f18678a, rVar, str2, str3);
                } else {
                    if (e.this.b() != null) {
                        ((f) e.this.b()).d();
                    }
                    e.this.a(2, cVar2.f18695a, aVar2.f18678a, rVar, str2, str3);
                }
            }
        };
        if (cVar2.f18696b != r.ALIPAY) {
            if (cVar2.f18696b == r.WEIXIN) {
                TTLiveSDKContext.getHostService().f().a((Context) this.f17982c, cVar2, (n.a) r0);
            }
        } else if (this.f17982c != null) {
            TTLiveSDKContext.getHostService().f().a(this.f17982c, cVar2, (n.a) r0);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f17981b, false, 13897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17981b, false, 13897, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        j.q().k().a(n.class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f17981b, false, 13884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17981b, false, 13884, new Class[0], Void.TYPE);
            return;
        }
        if (b() != null) {
            ((f) b()).a();
        }
        this.i.a().subscribe(new Consumer<com.bytedance.android.livesdkapi.depend.model.b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17986a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.livesdkapi.depend.model.b bVar = (com.bytedance.android.livesdkapi.depend.model.b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f17986a, false, 13898, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f17986a, false, 13898, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.class}, Void.TYPE);
                    return;
                }
                if (e.this.b() != null) {
                    ((f) e.this.b()).b();
                    ((f) e.this.b()).a(bVar);
                }
            }
        }, new Consumer<Throwable>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18030a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Exception exc;
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f18030a, false, 13905, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f18030a, false, 13905, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                if (th instanceof Exception) {
                    exc = (Exception) th;
                } else {
                    exc = new Exception(th);
                }
                if (e.this.b() != null) {
                    ((f) e.this.b()).b();
                    ((f) e.this.b()).a(exc, 0);
                }
            }
        });
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar, r rVar) {
        com.bytedance.android.livesdkapi.depend.model.a aVar2 = aVar;
        r rVar2 = rVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, rVar2}, this, f17981b, false, 13885, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class, r.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, rVar2}, this, f17981b, false, 13885, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class, r.class}, Void.TYPE);
            return;
        }
        if (b() != null) {
            ((f) b()).a((int) C0906R.string.cui);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Observable a2 = this.j.a(aVar2.f18678a, rVar2);
        final long j2 = uptimeMillis;
        final r rVar3 = rVar;
        final com.bytedance.android.livesdkapi.depend.model.a aVar3 = aVar;
        AnonymousClass8 r0 = new Consumer<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18032a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f18032a, false, 13906, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f18032a, false, 13906, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                if (e.this.b() != null) {
                    ((f) e.this.b()).c();
                    e.this.b();
                }
                e.this.a(j2, 0, rVar3, aVar3.f18678a, (Throwable) null);
                e.this.a(cVar, aVar3, rVar3);
            }
        };
        AnonymousClass9 r02 = new Consumer<Throwable>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18037a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Exception exc;
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f18037a, false, 13907, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f18037a, false, 13907, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                if (e.this.b() != null) {
                    ((f) e.this.b()).c();
                    f fVar = (f) e.this.b();
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception(th);
                    }
                    fVar.a(exc);
                }
                e.this.a(j2, 1, rVar3, aVar3.f18678a, th);
            }
        };
        a2.subscribe(r0, r02);
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar, boolean z, RechargeDialog.a aVar2) {
        final com.bytedance.android.livesdkapi.depend.model.a aVar3 = aVar;
        final RechargeDialog.a aVar4 = aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar3, Byte.valueOf(z ? (byte) 1 : 0), aVar4}, this, f17981b, false, 13887, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class, Boolean.TYPE, RechargeDialog.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar3, Byte.valueOf(z), aVar4}, this, f17981b, false, 13887, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class, Boolean.TYPE, RechargeDialog.a.class}, Void.TYPE);
            return;
        }
        final n nVar = (n) j.q().k().a(n.class);
        if (nVar != null) {
            new Object() {
            };
            TTLiveSDKContext.getHostService().l().b("https://hotsoon.snssdk.com");
            int i2 = this.f17982c.getResources().getConfiguration().orientation;
            ac.a((int) C0906R.string.cue, Integer.valueOf(aVar.a()));
            TTLiveSDKContext.getHostService().f().b();
            TTLiveSDKContext.getHostService().f().c();
            if (this.k != null && !this.k.isDisposed()) {
                this.k.dispose();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            Observable compose = ((WalletApi) j.q().d().a(WalletApi.class)).createPreOrder(aVar3.f18678a, 0, 0, "cny").compose(i.a());
            final long j2 = uptimeMillis;
            final com.bytedance.android.livesdkapi.depend.model.a aVar5 = aVar;
            final n nVar2 = nVar;
            AnonymousClass12 r0 = new Consumer<d<com.bytedance.android.livesdkapi.depend.model.c.a>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17997a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    d dVar = (d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f17997a, false, 13914, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f17997a, false, 13914, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    e.this.a(j2, 0, r.CJ, aVar5.f18678a, (Throwable) null);
                    com.bytedance.android.livesdkapi.depend.model.c.a aVar = (com.bytedance.android.livesdkapi.depend.model.c.a) dVar.f7871b;
                    e.this.g = aVar.f18701a;
                    JSONObject jSONObject = new JSONObject(aVar.f18702b);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject.optString(next));
                    }
                }
            };
            AnonymousClass13 r02 = new Consumer<Throwable>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18002a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Exception exc;
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.isSupport(new Object[]{th}, this, f18002a, false, 13915, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f18002a, false, 13915, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception(th);
                    }
                    e.this.a(j2, 1, r.CJ, aVar5.f18678a, th);
                    ((f) e.this.b()).a(exc);
                }
            };
            this.k = compose.subscribe(r0, r02);
        }
    }

    public e(Activity activity, k kVar, String str, String str2, int i2) {
        this(activity, kVar, str, str2, i2, "");
    }

    public final void a(int i2, int i3, c cVar, @Nullable Throwable th, int i4) {
        final int i5;
        int i6 = i2;
        c cVar2 = cVar;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), cVar2, th2, Integer.valueOf(i4)}, this, f17981b, false, 13895, new Class[]{Integer.TYPE, Integer.TYPE, c.class, Throwable.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), cVar2, th2, Integer.valueOf(i4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f17981b, false, 13895, new Class[]{Integer.TYPE, Integer.TYPE, c.class, Throwable.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("times", Integer.valueOf(i3));
        hashMap.put("order_id", cVar2.f18695a);
        hashMap.put("channel_id", cVar2.f18700f);
        String str = "";
        if (th2 instanceof com.bytedance.android.live.a.a.a) {
            i5 = ((com.bytedance.android.live.a.a.a) th2).getErrorCode();
        } else {
            i5 = -14;
        }
        if (th2 != null) {
            str = th.getMessage();
        }
        if (i6 == 0) {
            com.bytedance.android.livesdk.wallet.b.b.a(20, i6, 0, hashMap);
            final JSONObject jSONObject = new JSONObject();
            final int b2 = j.q().n().b();
            com.bytedance.android.live.f.a n = j.q().n();
            final int i7 = i4;
            AnonymousClass6 r5 = new a.C0065a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18024a;

                public final void a(Throwable th) {
                    Throwable th2 = th;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{th2}, this, f18024a, false, 13904, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th2}, this, f18024a, false, 13904, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (th2 instanceof com.bytedance.android.live.a.a.a) {
                        i = ((com.bytedance.android.live.a.a.a) th2).getErrorCode();
                    }
                    com.bytedance.android.livesdk.wallet.b.a.a(a.C0127a.WALLET, String.valueOf(i), th.getMessage(), jSONObject);
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18024a, false, 13903, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18024a, false, 13903, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i7 + b2 != i) {
                        try {
                            jSONObject.put("pre_diamond", String.valueOf(b2));
                            jSONObject.put("new_diamond", String.valueOf(i));
                            jSONObject.put("charge_diamond", String.valueOf(i7));
                        } catch (JSONException unused) {
                        }
                        com.bytedance.android.livesdk.wallet.b.a.a(a.C0127a.WALLET, String.valueOf(i5), "balance not match", jSONObject);
                    } else if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.livesdk.wallet.b.a.f17974a, true, 14217, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.livesdk.wallet.b.a.f17974a, true, 14217, new Class[0], Void.TYPE);
                    } else {
                        com.bytedance.android.livesdk.wallet.b.a.a(0);
                    }
                }
            };
            n.a((a.C0065a) r5);
            return;
        }
        hashMap.put("error_code", Integer.valueOf(i5));
        hashMap.put("error_msg", str);
        com.bytedance.android.livesdk.wallet.b.b.a(20, i6, 0, hashMap);
        com.bytedance.android.livesdk.wallet.b.b.b(20, i6, 0, hashMap);
        com.bytedance.android.livesdk.wallet.b.a.a(a.C0127a.CHECK_ORDER, String.valueOf(i5), str, new JSONObject());
    }

    public final void a(long j2, int i2, r rVar, long j3, @Nullable Throwable th) {
        long j4 = j2;
        int i3 = i2;
        long j5 = j3;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), Integer.valueOf(i2), rVar, new Long(j5), th2}, this, f17981b, false, 13893, new Class[]{Long.TYPE, Integer.TYPE, r.class, Long.TYPE, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), Integer.valueOf(i2), rVar, new Long(j5), th2}, this, f17981b, false, 13893, new Class[]{Long.TYPE, Integer.TYPE, r.class, Long.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j4;
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", Long.valueOf(j3));
        hashMap.put("channel", rVar.getValue());
        if (i3 == 0) {
            com.bytedance.android.livesdk.wallet.b.b.e(i3, uptimeMillis, hashMap);
            com.bytedance.android.livesdk.wallet.b.b.a(0, i3, uptimeMillis, hashMap);
            return;
        }
        int i4 = -14;
        String str = "";
        if (th2 instanceof com.bytedance.android.live.a.a.a) {
            i4 = ((com.bytedance.android.live.a.a.a) th2).getErrorCode();
        }
        if (th2 != null) {
            str = th.getMessage();
        }
        hashMap.put("error_code", Integer.valueOf(i4));
        hashMap.put("error_msg", str);
        com.bytedance.android.livesdk.wallet.b.b.e(i3, uptimeMillis, hashMap);
        com.bytedance.android.livesdk.wallet.b.b.f(i3, uptimeMillis, hashMap);
        com.bytedance.android.livesdk.wallet.b.a.a(a.C0127a.CREATE_ORDER, String.valueOf(i4), str, null);
    }

    public e(Activity activity, k kVar, String str, String str2, int i2, String str3) {
        this.f17982c = activity;
        this.i = kVar;
        this.j = new j();
        this.f17983d = str;
        this.f17984e = str2;
        this.f17985f = str3;
        this.h = i2;
        if (((Integer) LiveSettingKeys.TTLIVE_PAY_TYPE.a()).intValue() == 1 && ((n) j.q().k().a(n.class)) != null) {
            TTLiveSDKContext.getHostService().f().b();
            TTLiveSDKContext.getHostService().f().c();
            String.valueOf(TTLiveSDKContext.getHostService().k().b());
        }
    }

    public final void a(int i2, String str, long j2, r rVar, String str2, String str3) {
        a.C0127a aVar;
        int i3 = i2;
        String str4 = str;
        long j3 = j2;
        r rVar2 = rVar;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str4, new Long(j3), rVar2, str5, str6}, this, f17981b, false, 13894, new Class[]{Integer.TYPE, String.class, Long.TYPE, r.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str4, new Long(j3), rVar2, str5, str6}, this, f17981b, false, 13894, new Class[]{Integer.TYPE, String.class, Long.TYPE, r.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", Long.valueOf(j2));
        hashMap.put("order_id", str4);
        hashMap.put("error_code", str5);
        hashMap.put("error_msg", str6);
        hashMap.put("channel", rVar.getValue());
        if (i3 == 0) {
            com.bytedance.android.livesdk.wallet.b.b.a(10, i3, 0, hashMap);
            return;
        }
        com.bytedance.android.livesdk.wallet.b.b.a(10, i3, 0, hashMap);
        com.bytedance.android.livesdk.wallet.b.b.b(10, i3, 0, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detail_code", str5);
        } catch (JSONException unused) {
        }
        if (rVar2 == r.WEIXIN) {
            aVar = a.C0127a.WECHAT_PAY;
        } else {
            aVar = a.C0127a.ALI_PAY;
        }
        com.bytedance.android.livesdk.wallet.b.a.a(aVar, String.valueOf(i2), str6, jSONObject);
    }
}
