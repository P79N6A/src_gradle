package com.bytedance.android.livesdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.annotation.RestrictTo;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.bytedance.android.live.core.setting.m;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.v.e;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.c.a;
import com.bytedance.android.livesdkapi.c.a;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.android.livesdkapi.service.c;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.bytedance.ies.d.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

@Keep
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TTLiveSDKContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static e sHostServiceWrapper;
    private static final ConcurrentHashMap<Class, Object> sServices = new ConcurrentHashMap<>();

    static final /* synthetic */ boolean lambda$delayInit$1$TTLiveSDKContext() {
        return false;
    }

    public static e getHostService() {
        return sHostServiceWrapper;
    }

    public static String getLiveHostDomain() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 3025, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 3025, new Class[0], String.class);
        }
        return ((h) b.a(h.class)).b();
    }

    public static c getLiveService() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 3026, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 3026, new Class[0], c.class);
        }
        return (c) getServiceInternal(c.class);
    }

    @WorkerThread
    public static void initGiftResource() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 3032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 3032, new Class[0], Void.TYPE);
            return;
        }
        getLiveService().a(getHostService().a().a());
        Observable.create(dd.f13678b).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe();
    }

    @WorkerThread
    @SuppressLint({"CheckResult"})
    public static void delayInit() {
        Executor executor;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 3031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 3031, new Class[0], Void.TYPE);
            return;
        }
        b.a aVar = new b.a();
        SimpleThreadFactory simpleThreadFactory = new SimpleThreadFactory("live-work-threads", true);
        if (PatchProxy.isSupport(new Object[]{simpleThreadFactory}, null, df.f13681a, true, 3040, new Class[]{ThreadFactory.class}, ExecutorService.class)) {
            executor = (ExecutorService) PatchProxy.accessDispatch(new Object[]{simpleThreadFactory}, null, df.f13681a, true, 3040, new Class[]{ThreadFactory.class}, ExecutorService.class);
        } else {
            executor = com.ss.android.ugc.aweme.thread.h.c();
        }
        if (executor == null) {
            executor = com.bytedance.ies.d.a.b.f20246a;
        }
        aVar.f20254a = executor;
        com.bytedance.ies.d.a.b a2 = com.bytedance.ies.d.a.b.a();
        a2.f20250e = aVar.f20254a;
        com.bytedance.ies.d.a.b.f20248c = new Handler(Looper.getMainLooper());
        a2.f20249d = true;
        com.bytedance.android.livesdk.i18n.b a3 = com.bytedance.android.livesdk.i18n.b.a();
        Locale l = getHostService().a().l();
        if (PatchProxy.isSupport(new Object[]{l}, a3, com.bytedance.android.livesdk.i18n.b.f15584a, false, 10159, new Class[]{Locale.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{l}, a3, com.bytedance.android.livesdk.i18n.b.f15584a, false, 10159, new Class[]{Locale.class}, Void.TYPE);
        } else if (l != null) {
            String str = l.getLanguage() + "_" + l.getCountry().toLowerCase();
            if (!TextUtils.equals(str, a3.f15585b)) {
                if (a3.f15588e != null) {
                    I18nUpdateManager i18nUpdateManager = a3.f15588e;
                    if (PatchProxy.isSupport(new Object[0], i18nUpdateManager, I18nUpdateManager.f15569a, false, 10175, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], i18nUpdateManager, I18nUpdateManager.f15569a, false, 10175, new Class[0], Void.TYPE);
                    } else {
                        i18nUpdateManager.f15571c.removeCallbacksAndMessages(null);
                        if (i18nUpdateManager.i != null && !i18nUpdateManager.i.isDisposed()) {
                            i18nUpdateManager.i.dispose();
                        }
                        i18nUpdateManager.f15572d = null;
                    }
                }
                if (a3.g != null) {
                    com.bytedance.android.livesdk.i18n.c cVar = a3.g;
                    if (PatchProxy.isSupport(new Object[0], cVar, com.bytedance.android.livesdk.i18n.c.f15594a, false, 10166, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cVar, com.bytedance.android.livesdk.i18n.c.f15594a, false, 10166, new Class[0], Void.TYPE);
                    } else {
                        if (cVar.h != null && !cVar.h.isDisposed()) {
                            cVar.h.dispose();
                        }
                        if (cVar.i != null && !cVar.i.isDisposed()) {
                            cVar.i.dispose();
                        }
                        cVar.f15598e = null;
                    }
                }
                a3.f15587d.clear();
                a3.f15586c = 0;
                a3.g = new com.bytedance.android.livesdk.i18n.c(str, a3.h);
                a3.f15588e = new I18nUpdateManager(str, a3.f15589f);
                if (TextUtils.isEmpty(a3.f15585b)) {
                    a3.g.b();
                } else {
                    a3.f15588e.a(a3.f15586c);
                }
                a3.f15585b = str;
            }
        }
        com.bytedance.android.live.uikit.dialog.b.f8548c = dc.f13676b;
        j.q().h().c().a();
        j.q().h().f();
        j.q().e().a(true);
        j.q().h().g().a();
        if (!(ac.e() == null || ((a) j.q().k().a(a.class)) == null)) {
            ac.e();
        }
    }

    static final /* synthetic */ void lambda$initialize$0$TTLiveSDKContext(Throwable th) throws Exception {
        if (th == null) {
            th = new UnknownError("unknown error");
        }
        if (th.getStackTrace() != null) {
            th.getStackTrace();
        }
    }

    static <T> T getService(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, changeQuickRedirect, true, 3027, new Class[]{Class.class}, Object.class)) {
            return sServices.get(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, null, changeQuickRedirect, true, 3027, new Class[]{Class.class}, Object.class);
    }

    private static <T> T getServiceInternal(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, changeQuickRedirect, true, 3030, new Class[]{Class.class}, Object.class)) {
            return sServices.get(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, null, changeQuickRedirect, true, 3030, new Class[]{Class.class}, Object.class);
    }

    public static boolean initialize(com.bytedance.android.livesdkapi.service.b bVar) {
        com.bytedance.android.livesdk.v.c cVar;
        final com.bytedance.android.livesdkapi.service.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, changeQuickRedirect, true, 3024, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, null, changeQuickRedirect, true, 3024, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Boolean.TYPE)).booleanValue();
        }
        if (RxJavaPlugins.getErrorHandler() == null) {
            RxJavaPlugins.setErrorHandler(db.f13674b);
        }
        registerService(c.class, new com.bytedance.android.livesdk.s.e());
        registerService(com.bytedance.android.livesdkapi.service.b.class, bVar2);
        com.bytedance.android.live.base.a.a((com.bytedance.android.live.base.b.b) new com.bytedance.android.live.base.b.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8883a;

            public final <T> T a(Class<T> cls) {
                Class<T> cls2 = cls;
                if (PatchProxy.isSupport(new Object[]{cls2}, this, f8883a, false, 3036, new Class[]{Class.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{cls2}, this, f8883a, false, 3036, new Class[]{Class.class}, Object.class);
                } else if (cls2 == com.bytedance.android.live.base.b.c.class) {
                    return de.f13680b;
                } else {
                    if (cls2 == com.bytedance.android.live.base.b.a.class) {
                        return bVar2.d();
                    }
                    return TTLiveSDKContext.getService(cls);
                }
            }
        });
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, com.bytedance.android.livesdk.v.c.f17660a, true, 13195, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, com.bytedance.android.livesdk.v.c.class)) {
            cVar = (com.bytedance.android.livesdk.v.c) PatchProxy.accessDispatch(new Object[]{bVar2}, null, com.bytedance.android.livesdk.v.c.f17660a, true, 13195, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, com.bytedance.android.livesdk.v.c.class);
        } else {
            cVar = new com.bytedance.android.livesdk.v.c(bVar2);
        }
        sHostServiceWrapper = cVar;
        com.bytedance.android.livesdkapi.h.f18767b = new da();
        if ("local_test".equals(bVar.a().c())) {
            m.a(true);
        }
        com.bytedance.android.live.core.b.a(new com.bytedance.android.live.core.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8885a;

            public final Context a() {
                if (!PatchProxy.isSupport(new Object[0], this, f8885a, false, 3038, new Class[0], Context.class)) {
                    return bVar2.a().a();
                }
                return (Context) PatchProxy.accessDispatch(new Object[0], this, f8885a, false, 3038, new Class[0], Context.class);
            }
        });
        if (PatchProxy.isSupport(new Object[0], null, ao.f9024a, true, 2761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, ao.f9024a, true, 2761, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class) == null) {
            com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class, new a.C0131a());
        }
        return true;
    }

    public static <T> void registerService(Class<T> cls, T t) {
        Class<T> cls2 = cls;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{cls2, t2}, null, changeQuickRedirect, true, 3028, new Class[]{Class.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2, t2}, null, changeQuickRedirect, true, 3028, new Class[]{Class.class, Object.class}, Void.TYPE);
            return;
        }
        sServices.put(cls2, t2);
    }

    static <T> void unRegisterService(Class<T> cls, T t) {
        Class<T> cls2 = cls;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{cls2, t2}, null, changeQuickRedirect, true, 3029, new Class[]{Class.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2, t2}, null, changeQuickRedirect, true, 3029, new Class[]{Class.class, Object.class}, Void.TYPE);
            return;
        }
        sServices.remove(cls2, t2);
    }
}
