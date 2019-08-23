package com.ss.android.ugc.aweme.app.accountsdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.ApiNetworkServiceForAccount;
import com.ss.android.ugc.aweme.app.services.ad;
import com.ss.android.ugc.aweme.app.services.ae;
import com.ss.android.ugc.aweme.app.services.s;
import com.ss.android.ugc.aweme.app.services.t;
import com.ss.android.ugc.aweme.app.services.x;
import com.ss.android.ugc.aweme.app.services.y;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.main.h.p;
import com.ss.android.ugc.aweme.main.h.r;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.main.h.w;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/app/accountsdk/AccountNeedServiceProvider;", "Lcom/ss/android/ugc/aweme/AccountServiceProvider;", "()V", "getService", "Lcom/ss/android/ugc/aweme/framework/services/ServiceProvider;", "T", "clazz", "Ljava/lang/Class;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.ss.android.ugc.aweme.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33687a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/CurrentContextService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33688a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f33689b = new a();

        a() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33688a, false, 22975, new Class[0], com.ss.android.ugc.aweme.app.services.k.class)) {
                return new com.ss.android.ugc.aweme.app.services.k();
            }
            return (com.ss.android.ugc.aweme.app.services.k) PatchProxy.accessDispatch(new Object[0], this, f33688a, false, 22975, new Class[0], com.ss.android.ugc.aweme.app.services.k.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/CaptchaService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.b$b  reason: collision with other inner class name */
    static final class C0434b<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33690a;

        /* renamed from: b  reason: collision with root package name */
        public static final C0434b f33691b = new C0434b();

        C0434b() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33690a, false, 22976, new Class[0], com.ss.android.ugc.aweme.app.services.j.class)) {
                return new com.ss.android.ugc.aweme.app.services.j();
            }
            return (com.ss.android.ugc.aweme.app.services.j) PatchProxy.accessDispatch(new Object[0], this, f33690a, false, 22976, new Class[0], com.ss.android.ugc.aweme.app.services.j.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/PushLaunchPageAssistantService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33692a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f33693b = new c();

        c() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33692a, false, 22977, new Class[0], x.class)) {
                return new x();
            }
            return (x) PatchProxy.accessDispatch(new Object[0], this, f33692a, false, 22977, new Class[0], x.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/services/RetrofitService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33694a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f33695b = new d();

        d() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33694a, false, 22978, new Class[0], RetrofitService.class)) {
                return new RetrofitService();
            }
            return (RetrofitService) PatchProxy.accessDispatch(new Object[0], this, f33694a, false, 22978, new Class[0], RetrofitService.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/DownloadService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33696a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f33697b = new e();

        e() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33696a, false, 22979, new Class[0], com.ss.android.ugc.aweme.app.services.m.class)) {
                return new com.ss.android.ugc.aweme.app.services.m();
            }
            return (com.ss.android.ugc.aweme.app.services.m) PatchProxy.accessDispatch(new Object[0], this, f33696a, false, 22979, new Class[0], com.ss.android.ugc.aweme.app.services.m.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/AccountHelperService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33698a;

        /* renamed from: b  reason: collision with root package name */
        public static final f f33699b = new f();

        f() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33698a, false, 22980, new Class[0], com.ss.android.ugc.aweme.app.services.b.class)) {
                return new com.ss.android.ugc.aweme.app.services.b();
            }
            return (com.ss.android.ugc.aweme.app.services.b) PatchProxy.accessDispatch(new Object[0], this, f33698a, false, 22980, new Class[0], com.ss.android.ugc.aweme.app.services.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/WebViewTweakerService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33700a;

        /* renamed from: b  reason: collision with root package name */
        public static final g f33701b = new g();

        g() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33700a, false, 22981, new Class[0], ad.class)) {
                return new ad();
            }
            return (ad) PatchProxy.accessDispatch(new Object[0], this, f33700a, false, 22981, new Class[0], ad.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/WebviewService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33702a;

        /* renamed from: b  reason: collision with root package name */
        public static final h f33703b = new h();

        h() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33702a, false, 22982, new Class[0], ae.class)) {
                return new ae();
            }
            return (ae) PatchProxy.accessDispatch(new Object[0], this, f33702a, false, 22982, new Class[0], ae.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/RegionService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class i<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33704a;

        /* renamed from: b  reason: collision with root package name */
        public static final i f33705b = new i();

        i() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33704a, false, 22983, new Class[0], y.class)) {
                return new y();
            }
            return (y) PatchProxy.accessDispatch(new Object[0], this, f33704a, false, 22983, new Class[0], y.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/AntiSpamService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class j<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33706a;

        /* renamed from: b  reason: collision with root package name */
        public static final j f33707b = new j();

        j() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33706a, false, 22984, new Class[0], com.ss.android.ugc.aweme.app.services.c.class)) {
                return new com.ss.android.ugc.aweme.app.services.c();
            }
            return (com.ss.android.ugc.aweme.app.services.c) PatchProxy.accessDispatch(new Object[0], this, f33706a, false, 22984, new Class[0], com.ss.android.ugc.aweme.app.services.c.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/ApiNetworkServiceForAccount;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class k<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33708a;

        /* renamed from: b  reason: collision with root package name */
        public static final k f33709b = new k();

        k() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33708a, false, 22985, new Class[0], ApiNetworkServiceForAccount.class)) {
                return new ApiNetworkServiceForAccount();
            }
            return (ApiNetworkServiceForAccount) PatchProxy.accessDispatch(new Object[0], this, f33708a, false, 22985, new Class[0], ApiNetworkServiceForAccount.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/LiveProxyService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class l<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33710a;

        /* renamed from: b  reason: collision with root package name */
        public static final l f33711b = new l();

        l() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33710a, false, 22986, new Class[0], t.class)) {
                return new t();
            }
            return (t) PatchProxy.accessDispatch(new Object[0], this, f33710a, false, 22986, new Class[0], t.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/Feed0VVManagerService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class m<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33712a;

        /* renamed from: b  reason: collision with root package name */
        public static final m f33713b = new m();

        m() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33712a, false, 22987, new Class[0], com.ss.android.ugc.aweme.app.services.o.class)) {
                return new com.ss.android.ugc.aweme.app.services.o();
            }
            return (com.ss.android.ugc.aweme.app.services.o) PatchProxy.accessDispatch(new Object[0], this, f33712a, false, 22987, new Class[0], com.ss.android.ugc.aweme.app.services.o.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/LanguageService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class n<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33714a;

        /* renamed from: b  reason: collision with root package name */
        public static final n f33715b = new n();

        n() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33714a, false, 22988, new Class[0], s.class)) {
                return new s();
            }
            return (s) PatchProxy.accessDispatch(new Object[0], this, f33714a, false, 22988, new Class[0], s.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/services/AuthorizeService;", "T", "get"}, k = 3, mv = {1, 1, 15})
    static final class o<T> implements ServiceProvider<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33716a;

        /* renamed from: b  reason: collision with root package name */
        public static final o f33717b = new o();

        o() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f33716a, false, 22989, new Class[0], com.ss.android.ugc.aweme.app.services.d.class)) {
                return new com.ss.android.ugc.aweme.app.services.d();
            }
            return (com.ss.android.ugc.aweme.app.services.d) PatchProxy.accessDispatch(new Object[0], this, f33716a, false, 22989, new Class[0], com.ss.android.ugc.aweme.app.services.d.class);
        }
    }

    @Nullable
    public final <T> ServiceProvider<T> a(@NotNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f33687a, false, 22974, new Class[]{Class.class}, ServiceProvider.class)) {
            return (ServiceProvider) PatchProxy.accessDispatch(new Object[]{cls2}, this, f33687a, false, 22974, new Class[]{Class.class}, ServiceProvider.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "clazz");
        if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.i.class)) {
            a aVar = a.f33689b;
            if (aVar != null) {
                return aVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) v.class)) {
            h hVar = h.f33703b;
            if (hVar != null) {
                return hVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.s.class)) {
            i iVar = i.f33705b;
            if (iVar != null) {
                return iVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.d.class)) {
            j jVar = j.f33707b;
            if (jVar != null) {
                return jVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.e.class)) {
            k kVar = k.f33709b;
            if (kVar != null) {
                return kVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) p.class)) {
            l lVar = l.f33711b;
            if (lVar != null) {
                return lVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.l.class)) {
            m mVar = m.f33713b;
            if (mVar != null) {
                return mVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.o.class)) {
            n nVar = n.f33715b;
            if (nVar != null) {
                return nVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.f.class)) {
            o oVar = o.f33717b;
            if (oVar != null) {
                return oVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.h.class)) {
            C0434b bVar = C0434b.f33691b;
            if (bVar != null) {
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) r.class)) {
            c cVar = c.f33693b;
            if (cVar != null) {
                return cVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) IRetrofitService.class)) {
            d dVar = d.f33695b;
            if (dVar != null) {
                return dVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.k.class)) {
            e eVar = e.f33697b;
            if (eVar != null) {
                return eVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (Intrinsics.areEqual((Object) cls2, (Object) com.ss.android.ugc.aweme.main.h.b.class)) {
            f fVar = f.f33699b;
            if (fVar != null) {
                return fVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (!Intrinsics.areEqual((Object) cls2, (Object) w.class)) {
            return null;
        } else {
            g gVar = g.f33701b;
            if (gVar != null) {
                return gVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        }
    }
}
