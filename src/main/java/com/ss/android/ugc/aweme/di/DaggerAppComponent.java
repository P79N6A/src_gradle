package com.ss.android.ugc.aweme.di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.google.common.collect.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.host.HostApplication;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.conan.IConanService;
import com.ss.android.ugc.aweme.di.AppComponent;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.main.h.b;
import com.ss.android.ugc.aweme.main.h.c;
import com.ss.android.ugc.aweme.main.h.d;
import com.ss.android.ugc.aweme.main.h.h;
import com.ss.android.ugc.aweme.main.h.i;
import com.ss.android.ugc.aweme.main.h.j;
import com.ss.android.ugc.aweme.main.h.k;
import com.ss.android.ugc.aweme.main.h.l;
import com.ss.android.ugc.aweme.main.h.m;
import com.ss.android.ugc.aweme.main.h.n;
import com.ss.android.ugc.aweme.main.h.o;
import com.ss.android.ugc.aweme.main.h.p;
import com.ss.android.ugc.aweme.main.h.q;
import com.ss.android.ugc.aweme.main.h.r;
import com.ss.android.ugc.aweme.main.h.s;
import com.ss.android.ugc.aweme.main.h.t;
import com.ss.android.ugc.aweme.main.h.u;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.main.h.w;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.api.e;
import com.ss.android.ugc.aweme.story.api.f;
import com.ss.android.ugc.aweme.story.api.g;
import com.ss.android.ugc.awemepushapi.IPushApi;
import dagger.android.a;
import java.util.Map;

public final class DaggerAppComponent implements AppComponent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private javax.inject.a<f> A;
    private javax.inject.a<e> B;
    private javax.inject.a<g> C;
    private javax.inject.a<o> D;
    private javax.inject.a<d> E;
    private javax.inject.a<p> F;
    private javax.inject.a<i> G;
    private javax.inject.a<l> H;
    private javax.inject.a<k> I;
    private javax.inject.a<h> J;
    private javax.inject.a<com.ss.android.ugc.aweme.main.h.f> K;
    private javax.inject.a<b> L;
    private javax.inject.a<com.ss.android.ugc.aweme.main.h.a> M;
    private javax.inject.a<j> N;
    private javax.inject.a<u> O;
    private javax.inject.a<com.ss.android.ugc.aweme.story.api.b> P;
    private javax.inject.a<n> Q;
    private javax.inject.a<q> R;
    private javax.inject.a<com.ss.android.ugc.aweme.main.h.e> S;
    private javax.inject.a<c> T;
    private javax.inject.a<w> U;
    private ar V;

    /* renamed from: a  reason: collision with root package name */
    private an f3016a;

    /* renamed from: b  reason: collision with root package name */
    private javax.inject.a<com.ss.android.ugc.pluginapi.a> f3017b;

    /* renamed from: c  reason: collision with root package name */
    private javax.inject.a<IWalletMainProxy> f3018c;

    /* renamed from: d  reason: collision with root package name */
    private javax.inject.a<IIapWalletProxy> f3019d;

    /* renamed from: e  reason: collision with root package name */
    private javax.inject.a<IWalletService> f3020e;

    /* renamed from: f  reason: collision with root package name */
    private ap f3021f;
    private javax.inject.a<IIMService> g;
    private javax.inject.a<IDebugBoxService> h;
    private javax.inject.a<IConanService> i;
    private javax.inject.a<IMiniAppService> j;
    private javax.inject.a<IBridgeService> k;
    private javax.inject.a<IAVService> l;
    private javax.inject.a<IPluginService> m;
    private javax.inject.a<I18nManagerService> n;
    private javax.inject.a<IPushApi> o;
    private javax.inject.a<IRetrofitService> p;
    private javax.inject.a<IAVStoryService> q;
    private javax.inject.a<IUserService> r;
    private javax.inject.a<r> s;
    private javax.inject.a<v> t;
    private javax.inject.a<m> u;
    private javax.inject.a<com.ss.android.ugc.aweme.main.h.g> v;
    private javax.inject.a<s> w;
    private javax.inject.a<com.ss.android.ugc.aweme.main.h.a.a> x;
    private javax.inject.a<com.ss.android.ugc.aweme.story.api.d> y;
    private javax.inject.a<t> z;

    static final class a implements AppComponent.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41378a;

        /* renamed from: b  reason: collision with root package name */
        public an f41379b;

        /* renamed from: c  reason: collision with root package name */
        private Application f41380c;

        private a() {
        }

        public final AppComponent a() {
            if (PatchProxy.isSupport(new Object[0], this, f41378a, false, 35388, new Class[0], AppComponent.class)) {
                return (AppComponent) PatchProxy.accessDispatch(new Object[0], this, f41378a, false, 35388, new Class[0], AppComponent.class);
            } else if (this.f41379b == null) {
                throw new IllegalStateException(an.class.getCanonicalName() + " must be set");
            } else if (this.f41380c != null) {
                return new DaggerAppComponent(this, (byte) 0);
            } else {
                throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ AppComponent.a a(Application application) {
            if (PatchProxy.isSupport(new Object[]{application}, this, f41378a, false, 35389, new Class[]{Application.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{application}, this, f41378a, false, 35389, new Class[]{Application.class}, a.class);
            }
            this.f41380c = (Application) dagger.internal.e.a(application);
            return this;
        }

        public final /* synthetic */ AppComponent.a a(an anVar) {
            if (PatchProxy.isSupport(new Object[]{anVar}, this, f41378a, false, 35390, new Class[]{an.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{anVar}, this, f41378a, false, 35390, new Class[]{an.class}, a.class);
            }
            this.f41379b = (an) dagger.internal.e.a(anVar);
            return this;
        }
    }

    private Map<String, javax.inject.a<a.C0872a<? extends Activity>>> a() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35336, new Class[0], Map.class)) {
            return ak.of("dummy", this.V);
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35336, new Class[0], Map.class);
    }

    public static AppComponent.a builder() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 35335, new Class[0], AppComponent.a.class)) {
            return (AppComponent.a) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 35335, new Class[0], AppComponent.a.class);
        }
        return new a((byte) 0);
    }

    public final Context context() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35340, new Class[0], Context.class)) {
            return aq.a(this.f3016a);
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35340, new Class[0], Context.class);
    }

    public final IAVService getAVServiceImpl() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35350, new Class[0], IAVService.class)) {
            return (IAVService) this.l.get();
        }
        return (IAVService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35350, new Class[0], IAVService.class);
    }

    public final IAVStoryService getAVStoryServiceImpl() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35355, new Class[0], IAVStoryService.class)) {
            return (IAVStoryService) this.q.get();
        }
        return (IAVStoryService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35355, new Class[0], IAVStoryService.class);
    }

    public final com.ss.android.ugc.aweme.main.h.a getAbService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35377, new Class[0], com.ss.android.ugc.aweme.main.h.a.class)) {
            return (com.ss.android.ugc.aweme.main.h.a) this.M.get();
        }
        return (com.ss.android.ugc.aweme.main.h.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35377, new Class[0], com.ss.android.ugc.aweme.main.h.a.class);
    }

    public final b getAccountHelperService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35376, new Class[0], b.class)) {
            return (b) this.L.get();
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35376, new Class[0], b.class);
    }

    public final d getAntiSpamService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35369, new Class[0], d.class)) {
            return (d) this.E.get();
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35369, new Class[0], d.class);
    }

    public final com.ss.android.ugc.aweme.main.h.e getApiNetworkServiceForAccount() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35383, new Class[0], com.ss.android.ugc.aweme.main.h.e.class)) {
            return (com.ss.android.ugc.aweme.main.h.e) this.S.get();
        }
        return (com.ss.android.ugc.aweme.main.h.e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35383, new Class[0], com.ss.android.ugc.aweme.main.h.e.class);
    }

    public final com.ss.android.ugc.aweme.main.h.f getAuthorizeService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35375, new Class[0], com.ss.android.ugc.aweme.main.h.f.class)) {
            return (com.ss.android.ugc.aweme.main.h.f) this.K.get();
        }
        return (com.ss.android.ugc.aweme.main.h.f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35375, new Class[0], com.ss.android.ugc.aweme.main.h.f.class);
    }

    public final com.ss.android.ugc.aweme.main.h.g getAwemeService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35360, new Class[0], com.ss.android.ugc.aweme.main.h.g.class)) {
            return (com.ss.android.ugc.aweme.main.h.g) this.v.get();
        }
        return (com.ss.android.ugc.aweme.main.h.g) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35360, new Class[0], com.ss.android.ugc.aweme.main.h.g.class);
    }

    public final IBridgeService getBridgeService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35349, new Class[0], IBridgeService.class)) {
            return (IBridgeService) this.k.get();
        }
        return (IBridgeService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35349, new Class[0], IBridgeService.class);
    }

    public final h getCaptchaService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35374, new Class[0], h.class)) {
            return (h) this.J.get();
        }
        return (h) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35374, new Class[0], h.class);
    }

    public final i getCurrentContextService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35371, new Class[0], i.class)) {
            return (i) this.G.get();
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35371, new Class[0], i.class);
    }

    public final j getDeleteAccountService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35378, new Class[0], j.class)) {
            return (j) this.N.get();
        }
        return (j) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35378, new Class[0], j.class);
    }

    public final k getDownloadService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35373, new Class[0], k.class)) {
            return (k) this.I.get();
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35373, new Class[0], k.class);
    }

    public final com.ss.android.ugc.aweme.story.api.b getDuoshanService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35380, new Class[0], com.ss.android.ugc.aweme.story.api.b.class)) {
            return (com.ss.android.ugc.aweme.story.api.b) this.P.get();
        }
        return (com.ss.android.ugc.aweme.story.api.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35380, new Class[0], com.ss.android.ugc.aweme.story.api.b.class);
    }

    public final l getFeed0VVManagerService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35372, new Class[0], l.class)) {
            return (l) this.H.get();
        }
        return (l) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35372, new Class[0], l.class);
    }

    public final I18nManagerService getI18nManagerServiceImpl() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35352, new Class[0], I18nManagerService.class)) {
            return (I18nManagerService) this.n.get();
        }
        return (I18nManagerService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35352, new Class[0], I18nManagerService.class);
    }

    public final m getI18nService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35359, new Class[0], m.class)) {
            return (m) this.u.get();
        }
        return (m) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35359, new Class[0], m.class);
    }

    public final n getInteractStickerService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35381, new Class[0], n.class)) {
            return (n) this.Q.get();
        }
        return (n) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35381, new Class[0], n.class);
    }

    public final u getInviteUseListService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35379, new Class[0], u.class)) {
            return (u) this.O.get();
        }
        return (u) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35379, new Class[0], u.class);
    }

    public final o getLanguageService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35368, new Class[0], o.class)) {
            return (o) this.D.get();
        }
        return (o) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35368, new Class[0], o.class);
    }

    public final p getLiveProxyService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35370, new Class[0], p.class)) {
            return (p) this.F.get();
        }
        return (p) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35370, new Class[0], p.class);
    }

    public final com.ss.android.ugc.aweme.main.h.a.a getPlayerService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35362, new Class[0], com.ss.android.ugc.aweme.main.h.a.a.class)) {
            return (com.ss.android.ugc.aweme.main.h.a.a) this.x.get();
        }
        return (com.ss.android.ugc.aweme.main.h.a.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35362, new Class[0], com.ss.android.ugc.aweme.main.h.a.a.class);
    }

    public final IPluginService getPluginService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35351, new Class[0], IPluginService.class)) {
            return (IPluginService) this.m.get();
        }
        return (IPluginService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35351, new Class[0], IPluginService.class);
    }

    public final q getPoiMainService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35382, new Class[0], q.class)) {
            return (q) this.R.get();
        }
        return (q) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35382, new Class[0], q.class);
    }

    public final com.ss.android.ugc.aweme.story.api.d getProfileService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35363, new Class[0], com.ss.android.ugc.aweme.story.api.d.class)) {
            return (com.ss.android.ugc.aweme.story.api.d) this.y.get();
        }
        return (com.ss.android.ugc.aweme.story.api.d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35363, new Class[0], com.ss.android.ugc.aweme.story.api.d.class);
    }

    public final r getPushLaunchPageAssistantService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35357, new Class[0], r.class)) {
            return (r) this.s.get();
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35357, new Class[0], r.class);
    }

    public final IPushApi getPushService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35353, new Class[0], IPushApi.class)) {
            return (IPushApi) this.o.get();
        }
        return (IPushApi) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35353, new Class[0], IPushApi.class);
    }

    public final s getRegionService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35361, new Class[0], s.class)) {
            return (s) this.w.get();
        }
        return (s) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35361, new Class[0], s.class);
    }

    public final e getReportService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35366, new Class[0], e.class)) {
            return (e) this.B.get();
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35366, new Class[0], e.class);
    }

    public final IRetrofitService getRetrofitService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35354, new Class[0], IRetrofitService.class)) {
            return (IRetrofitService) this.p.get();
        }
        return (IRetrofitService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35354, new Class[0], IRetrofitService.class);
    }

    public final f getSettingService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35365, new Class[0], f.class)) {
            return (f) this.A.get();
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35365, new Class[0], f.class);
    }

    public final t getShotService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35364, new Class[0], t.class)) {
            return (t) this.z.get();
        }
        return (t) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35364, new Class[0], t.class);
    }

    public final g getStoryDownloadService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35367, new Class[0], g.class)) {
            return (g) this.C.get();
        }
        return (g) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35367, new Class[0], g.class);
    }

    public final c getUserInfoUpadteAdapterService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35384, new Class[0], c.class)) {
            return (c) this.T.get();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35384, new Class[0], c.class);
    }

    public final IUserService getUserService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35356, new Class[0], IUserService.class)) {
            return (IUserService) this.r.get();
        }
        return (IUserService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35356, new Class[0], IUserService.class);
    }

    public final w getWebViewTweakerService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35385, new Class[0], w.class)) {
            return (w) this.U.get();
        }
        return (w) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35385, new Class[0], w.class);
    }

    public final v getWebviewService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35358, new Class[0], v.class)) {
            return (v) this.t.get();
        }
        return (v) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35358, new Class[0], v.class);
    }

    public final IConanService provideIConanService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35347, new Class[0], IConanService.class)) {
            return (IConanService) this.i.get();
        }
        return (IConanService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35347, new Class[0], IConanService.class);
    }

    public final IDebugBoxService provideIDebugBoxService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35346, new Class[0], IDebugBoxService.class)) {
            return (IDebugBoxService) this.h.get();
        }
        return (IDebugBoxService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35346, new Class[0], IDebugBoxService.class);
    }

    public final IIMService provideIIMService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35345, new Class[0], IIMService.class)) {
            return (IIMService) this.g.get();
        }
        return (IIMService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35345, new Class[0], IIMService.class);
    }

    public final IIapWalletProxy provideIIapWalletProxy() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35343, new Class[0], IIapWalletProxy.class)) {
            return (IIapWalletProxy) this.f3019d.get();
        }
        return (IIapWalletProxy) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35343, new Class[0], IIapWalletProxy.class);
    }

    public final IMiniAppService provideIMiniAppService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35348, new Class[0], IMiniAppService.class)) {
            return (IMiniAppService) this.j.get();
        }
        return (IMiniAppService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35348, new Class[0], IMiniAppService.class);
    }

    public final IWalletMainProxy provideIWalletMainProxy() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35342, new Class[0], IWalletMainProxy.class)) {
            return (IWalletMainProxy) this.f3018c.get();
        }
        return (IWalletMainProxy) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35342, new Class[0], IWalletMainProxy.class);
    }

    public final IWalletService provideIWalletService() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35344, new Class[0], IWalletService.class)) {
            return (IWalletService) this.f3020e.get();
        }
        return (IWalletService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35344, new Class[0], IWalletService.class);
    }

    public final com.ss.android.ugc.pluginapi.a providePlugin() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35341, new Class[0], com.ss.android.ugc.pluginapi.a.class)) {
            return (com.ss.android.ugc.pluginapi.a) this.f3017b.get();
        }
        return (com.ss.android.ugc.pluginapi.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35341, new Class[0], com.ss.android.ugc.pluginapi.a.class);
    }

    public final void inject(HostApplication hostApplication) {
        dagger.android.b<Activity> bVar;
        com.ss.android.ugc.dagger.android.compat.a aVar;
        HostApplication hostApplication2 = hostApplication;
        if (PatchProxy.isSupport(new Object[]{hostApplication2}, this, changeQuickRedirect, false, 35386, new Class[]{HostApplication.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hostApplication2}, this, changeQuickRedirect, false, 35386, new Class[]{HostApplication.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{hostApplication2}, this, changeQuickRedirect, false, 35387, new Class[]{HostApplication.class}, HostApplication.class)) {
            HostApplication hostApplication3 = (HostApplication) PatchProxy.accessDispatch(new Object[]{hostApplication2}, this, changeQuickRedirect, false, 35387, new Class[]{HostApplication.class}, HostApplication.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35337, new Class[0], dagger.android.b.class)) {
                bVar = (dagger.android.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35337, new Class[0], dagger.android.b.class);
            } else {
                bVar = new dagger.android.b<>(ak.of(), ak.of(), ak.of(), a());
            }
            hostApplication2.j = bVar;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35338, new Class[0], com.ss.android.ugc.dagger.android.compat.a.class)) {
                aVar = (com.ss.android.ugc.dagger.android.compat.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35338, new Class[0], com.ss.android.ugc.dagger.android.compat.a.class);
            } else {
                aVar = new com.ss.android.ugc.dagger.android.compat.a(a());
            }
            hostApplication2.k = aVar;
        }
    }

    private DaggerAppComponent(a aVar) {
        ap apVar;
        aw awVar;
        ar arVar;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 35339, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 35339, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f3016a = aVar2.f41379b;
        this.f3017b = dagger.internal.b.a(com.ss.android.ugc.pluginimpl.a.a.f77786a);
        this.f3018c = dagger.internal.b.a(bb.f41431b);
        this.f3019d = dagger.internal.b.a(ba.f41429b);
        this.f3020e = dagger.internal.b.a(bc.f41433b);
        an anVar = aVar2.f41379b;
        if (PatchProxy.isSupport(new Object[]{anVar}, null, ap.f41409a, true, 35325, new Class[]{an.class}, ap.class)) {
            apVar = (ap) PatchProxy.accessDispatch(new Object[]{anVar}, null, ap.f41409a, true, 35325, new Class[]{an.class}, ap.class);
        } else {
            apVar = new ap(anVar);
        }
        this.f3021f = apVar;
        ap apVar2 = this.f3021f;
        if (PatchProxy.isSupport(new Object[]{apVar2}, null, aw.f41421a, true, 35403, new Class[]{javax.inject.a.class}, aw.class)) {
            awVar = (aw) PatchProxy.accessDispatch(new Object[]{apVar2}, null, aw.f41421a, true, 35403, new Class[]{javax.inject.a.class}, aw.class);
        } else {
            awVar = new aw(apVar2);
        }
        this.g = dagger.internal.b.a(awVar);
        this.h = dagger.internal.b.a(au.f41419b);
        this.i = dagger.internal.b.a(at.f41417b);
        this.j = dagger.internal.b.a(ay.f41425b);
        this.k = dagger.internal.b.a(k.f41451b);
        this.l = dagger.internal.b.a(c.f41435b);
        this.m = dagger.internal.b.a(y.f41479b);
        this.n = dagger.internal.b.a(r.f41465b);
        this.o = dagger.internal.b.a(ac.f41386b);
        this.p = dagger.internal.b.a(af.f41392b);
        this.q = dagger.internal.b.a(d.f41437b);
        this.r = dagger.internal.b.a(ak.f41402b);
        this.s = dagger.internal.b.a(ab.f41384b);
        this.t = dagger.internal.b.a(am.f41406b);
        this.u = dagger.internal.b.a(s.f41467b);
        this.v = dagger.internal.b.a(j.f41449b);
        this.w = dagger.internal.b.a(ad.f41388b);
        this.x = dagger.internal.b.a(x.f41477b);
        this.y = dagger.internal.b.a(aa.f41382b);
        this.z = dagger.internal.b.a(ah.f41396b);
        this.A = dagger.internal.b.a(ag.f41394b);
        this.B = dagger.internal.b.a(ae.f41390b);
        this.C = dagger.internal.b.a(ai.f41398b);
        this.D = dagger.internal.b.a(v.f41473b);
        this.E = dagger.internal.b.a(g.f41443b);
        this.F = dagger.internal.b.a(w.f41475b);
        this.G = dagger.internal.b.a(m.f41455b);
        this.H = dagger.internal.b.a(q.f41463b);
        this.I = dagger.internal.b.a(o.f41459b);
        this.J = dagger.internal.b.a(l.f41453b);
        this.K = dagger.internal.b.a(i.f41447b);
        this.L = dagger.internal.b.a(f.f41441b);
        this.M = dagger.internal.b.a(e.f41439b);
        this.N = dagger.internal.b.a(n.f41457b);
        this.O = dagger.internal.b.a(u.f41471b);
        this.P = dagger.internal.b.a(p.f41461b);
        this.Q = dagger.internal.b.a(t.f41469b);
        this.R = dagger.internal.b.a(z.f41481b);
        this.S = dagger.internal.b.a(h.f41445b);
        this.T = dagger.internal.b.a(aj.f41400b);
        this.U = dagger.internal.b.a(al.f41404b);
        an anVar2 = aVar2.f41379b;
        if (PatchProxy.isSupport(new Object[]{anVar2}, null, ar.f41413a, true, 35333, new Class[]{an.class}, ar.class)) {
            arVar = (ar) PatchProxy.accessDispatch(new Object[]{anVar2}, null, ar.f41413a, true, 35333, new Class[]{an.class}, ar.class);
        } else {
            arVar = new ar(anVar2);
        }
        this.V = arVar;
    }

    /* synthetic */ DaggerAppComponent(a aVar, byte b2) {
        this(aVar);
    }
}
