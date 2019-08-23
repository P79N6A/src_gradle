package com.ss.android.ugc.aweme.utils;

import a.i;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.geckoclient.a.a;
import com.bytedance.ies.geckoclient.a.c;
import com.bytedance.ies.geckoclient.d.b;
import com.bytedance.ies.geckoclient.f;
import com.bytedance.ies.geckoclient.h;
import com.bytedance.ies.geckoclient.model.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.applog.z;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.setting.o;
import com.ss.android.ugc.aweme.web.e;
import com.ss.android.ugc.aweme.web.l;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class bs {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75631a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile long f75632b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f75633c;

    /* renamed from: d  reason: collision with root package name */
    private static Set<String> f75634d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private static AtomicBoolean f75635e = new AtomicBoolean(false);

    private static Map<String, String> a() {
        if (PatchProxy.isSupport(new Object[0], null, f75631a, true, 88332, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], null, f75631a, true, 88332, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("channel", a.b().f3304b);
        hashMap.put("iid", z.b());
        return hashMap;
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75631a, true, 88334, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f75631a, true, 88334, new Class[]{String.class}, Void.TYPE);
        } else if (!f75633c || SystemClock.elapsedRealtime() - f75632b >= 3600000) {
            if (((Set) SharePrefCache.inst().getGeckoChannels().c()).isEmpty()) {
                o.a().a((o.a) new bv(str2));
            } else {
                c(str);
            }
            f75633c = true;
            f75632b = SystemClock.elapsedRealtime();
        }
    }

    static void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f75631a, true, 88335, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f75631a, true, 88335, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str);
        i.a(bw.f75645b).a(bx.f75647b, (Executor) i.f1051a);
    }

    static final /* synthetic */ Void a(i iVar) throws Exception {
        if (iVar.b()) {
            f fVar = (f) iVar.e();
            if (fVar != null) {
                if (PatchProxy.isSupport(new Object[]{fVar}, null, f75631a, true, 88336, new Class[]{f.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fVar}, null, f75631a, true, 88336, new Class[]{f.class}, Void.TYPE);
                } else {
                    List<d> b2 = fVar.b();
                    if (b2.size() != 0) {
                        for (d next : b2) {
                            if (next != null && !TextUtils.isEmpty(next.f20792d)) {
                                String str = fVar.f20737b + next.f20792d;
                                if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                                    try {
                                        Field declaredField = d.class.getDeclaredField("version");
                                        declaredField.setAccessible(true);
                                        declaredField.set(next, 0);
                                    } catch (Exception | IllegalAccessException | NoSuchFieldException unused) {
                                    }
                                    fVar.b(next);
                                }
                            }
                        }
                    }
                }
                fVar.a(new String[0]);
            }
        }
        return null;
    }

    @SuppressLint({"AnonymousInnerClass"})
    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75631a, true, 88333, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f75631a, true, 88333, new Class[]{String.class}, Void.TYPE);
        } else if (!f75635e.get()) {
            synchronized (bs.class) {
                com.ss.android.ugc.aweme.web.d dVar = new com.ss.android.ugc.aweme.web.d();
                if (!f75635e.get()) {
                    ServiceManager.get().bind(f.class, new bt(str2, dVar)).asSingleton();
                    if (!com.ss.android.g.a.a()) {
                        ServiceManager.get().bind(com.ss.android.ugc.aweme.web.d.class, new bu(str2, dVar)).asSingleton();
                    }
                    f75635e.set(true);
                }
            }
        }
    }

    public static void a(List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f75631a, true, 88331, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, f75631a, true, 88331, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            f75634d.addAll(list2);
        }
    }

    static final /* synthetic */ com.ss.android.ugc.aweme.web.d a(String str, com.ss.android.ugc.aweme.web.d dVar) {
        int i;
        c cVar;
        com.ss.android.ugc.aweme.web.d dVar2 = dVar;
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        String g = l.c().g();
        String d2 = l.c().d();
        if (com.ss.android.ugc.aweme.g.a.a()) {
            f.a();
        }
        try {
            i = g.b().s().getAdLandingPagePreloadCacheCount().intValue();
        } catch (com.bytedance.ies.a unused) {
            i = 20;
        }
        try {
            f.a a2 = f.a(GlobalContext.getContext(), g, str, serverDeviceId, d2, "live_gecko", 1128).a(l.c().e()).a((h) new e()).a((b) new com.ss.android.ugc.aweme.l.b()).a((com.bytedance.ies.geckoclient.f.a) new com.ss.android.ugc.aweme.l.a()).b(60, TimeUnit.SECONDS).a(60, TimeUnit.SECONDS).a(a());
            a.C0189a aVar = new a.C0189a();
            aVar.f20703a = i;
            a.C0189a a3 = aVar.a(com.bytedance.ies.geckoclient.a.b.f20708c);
            com.ss.android.ugc.aweme.commercialize.feed.b.a aVar2 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38813e;
            aVar2.getClass();
            if (PatchProxy.isSupport(new Object[]{aVar2}, null, by.f75648a, true, 88342, new Class[]{com.ss.android.ugc.aweme.commercialize.feed.b.a.class}, c.class)) {
                cVar = (c) PatchProxy.accessDispatch(new Object[]{aVar2}, null, by.f75648a, true, 88342, new Class[]{com.ss.android.ugc.aweme.commercialize.feed.b.a.class}, c.class);
            } else {
                cVar = new by(aVar2);
            }
            a3.f20705c = cVar;
            dVar2.a(g, a2.a(a3.a()).a());
            return dVar2;
        } catch (Exception unused2) {
            return null;
        }
    }

    static final /* synthetic */ f b(String str, com.ss.android.ugc.aweme.web.d dVar) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(f75634d);
        hashSet.addAll((Collection) SharePrefCache.inst().getGeckoChannels().c());
        if (hashSet.isEmpty()) {
            return null;
        }
        hashSet.addAll(com.bytedance.android.livesdkapi.e.c.f18753b);
        try {
            hashSet.addAll(g.b().s().getAdLandingPagePreloadCommonChannel());
        } catch (com.bytedance.ies.a unused) {
        }
        String f2 = l.c().f();
        String d2 = l.c().d();
        if (com.ss.android.ugc.aweme.g.a.a()) {
            f.a();
        }
        try {
            f.a a2 = f.a(GlobalContext.getContext(), f2, str, serverDeviceId, d2, "live_gecko", 1128).a(l.c().e()).a((h) new e()).a((b) new com.ss.android.ugc.aweme.l.b()).a((com.bytedance.ies.geckoclient.f.a) new com.ss.android.ugc.aweme.l.a()).b(60, TimeUnit.SECONDS).a(60, TimeUnit.SECONDS).a(a()).a(new a.C0189a().a(com.bytedance.ies.geckoclient.a.b.f20706a).a());
            a2.a(new d("rn_base_android"));
            a2.a(new d("rn_snapshot"));
            a2.a(new d("poi_resource"));
            for (String dVar2 : hashSet) {
                a2.a(new d(dVar2));
            }
            f a3 = a2.a();
            dVar.a(f2, a3);
            return a3;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.fe.b.e.f44417b.a("warning", e2);
            return null;
        }
    }
}
