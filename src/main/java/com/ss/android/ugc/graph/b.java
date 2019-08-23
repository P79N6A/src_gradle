package com.ss.android.ugc.graph;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.conan.IConanService;
import com.ss.android.ugc.aweme.di.DaggerAppComponent;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.main.h.c;
import com.ss.android.ugc.aweme.main.h.g;
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
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.api.e;
import com.ss.android.ugc.aweme.story.api.f;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.pluginapi.a;

public final class b extends a {
    b() {
        put(DaggerAppComponent.class, this);
    }

    @Nullable
    public final <T> T load(@NonNull Object obj, Class<T> cls) {
        if (cls == Context.class) {
            return ((DaggerAppComponent) obj).context();
        }
        if (cls == a.class) {
            return ((DaggerAppComponent) obj).providePlugin();
        }
        if (cls == IWalletMainProxy.class) {
            return ((DaggerAppComponent) obj).provideIWalletMainProxy();
        }
        if (cls == IIapWalletProxy.class) {
            return ((DaggerAppComponent) obj).provideIIapWalletProxy();
        }
        if (cls == IWalletService.class) {
            return ((DaggerAppComponent) obj).provideIWalletService();
        }
        if (cls == IIMService.class) {
            return ((DaggerAppComponent) obj).provideIIMService();
        }
        if (cls == IDebugBoxService.class) {
            return ((DaggerAppComponent) obj).provideIDebugBoxService();
        }
        if (cls == IConanService.class) {
            return ((DaggerAppComponent) obj).provideIConanService();
        }
        if (cls == IMiniAppService.class) {
            return ((DaggerAppComponent) obj).provideIMiniAppService();
        }
        if (cls == IBridgeService.class) {
            return ((DaggerAppComponent) obj).getBridgeService();
        }
        if (cls == IAVService.class) {
            return ((DaggerAppComponent) obj).getAVServiceImpl();
        }
        if (cls == IPluginService.class) {
            return ((DaggerAppComponent) obj).getPluginService();
        }
        if (cls == I18nManagerService.class) {
            return ((DaggerAppComponent) obj).getI18nManagerServiceImpl();
        }
        if (cls == IPushApi.class) {
            return ((DaggerAppComponent) obj).getPushService();
        }
        if (cls == IRetrofitService.class) {
            return ((DaggerAppComponent) obj).getRetrofitService();
        }
        if (cls == IAVStoryService.class) {
            return ((DaggerAppComponent) obj).getAVStoryServiceImpl();
        }
        if (cls == IUserService.class) {
            return ((DaggerAppComponent) obj).getUserService();
        }
        if (cls == r.class) {
            return ((DaggerAppComponent) obj).getPushLaunchPageAssistantService();
        }
        if (cls == v.class) {
            return ((DaggerAppComponent) obj).getWebviewService();
        }
        if (cls == m.class) {
            return ((DaggerAppComponent) obj).getI18nService();
        }
        if (cls == g.class) {
            return ((DaggerAppComponent) obj).getAwemeService();
        }
        if (cls == s.class) {
            return ((DaggerAppComponent) obj).getRegionService();
        }
        if (cls == com.ss.android.ugc.aweme.main.h.a.a.class) {
            return ((DaggerAppComponent) obj).getPlayerService();
        }
        if (cls == d.class) {
            return ((DaggerAppComponent) obj).getProfileService();
        }
        if (cls == t.class) {
            return ((DaggerAppComponent) obj).getShotService();
        }
        if (cls == f.class) {
            return ((DaggerAppComponent) obj).getSettingService();
        }
        if (cls == e.class) {
            return ((DaggerAppComponent) obj).getReportService();
        }
        if (cls == com.ss.android.ugc.aweme.story.api.g.class) {
            return ((DaggerAppComponent) obj).getStoryDownloadService();
        }
        if (cls == o.class) {
            return ((DaggerAppComponent) obj).getLanguageService();
        }
        if (cls == com.ss.android.ugc.aweme.main.h.d.class) {
            return ((DaggerAppComponent) obj).getAntiSpamService();
        }
        if (cls == p.class) {
            return ((DaggerAppComponent) obj).getLiveProxyService();
        }
        if (cls == i.class) {
            return ((DaggerAppComponent) obj).getCurrentContextService();
        }
        if (cls == l.class) {
            return ((DaggerAppComponent) obj).getFeed0VVManagerService();
        }
        if (cls == k.class) {
            return ((DaggerAppComponent) obj).getDownloadService();
        }
        if (cls == h.class) {
            return ((DaggerAppComponent) obj).getCaptchaService();
        }
        if (cls == com.ss.android.ugc.aweme.main.h.f.class) {
            return ((DaggerAppComponent) obj).getAuthorizeService();
        }
        if (cls == com.ss.android.ugc.aweme.main.h.b.class) {
            return ((DaggerAppComponent) obj).getAccountHelperService();
        }
        if (cls == com.ss.android.ugc.aweme.main.h.a.class) {
            return ((DaggerAppComponent) obj).getAbService();
        }
        if (cls == j.class) {
            return ((DaggerAppComponent) obj).getDeleteAccountService();
        }
        if (cls == u.class) {
            return ((DaggerAppComponent) obj).getInviteUseListService();
        }
        if (cls == com.ss.android.ugc.aweme.story.api.b.class) {
            return ((DaggerAppComponent) obj).getDuoshanService();
        }
        if (cls == n.class) {
            return ((DaggerAppComponent) obj).getInteractStickerService();
        }
        if (cls == q.class) {
            return ((DaggerAppComponent) obj).getPoiMainService();
        }
        if (cls == com.ss.android.ugc.aweme.main.h.e.class) {
            return ((DaggerAppComponent) obj).getApiNetworkServiceForAccount();
        }
        if (cls == c.class) {
            return ((DaggerAppComponent) obj).getUserInfoUpadteAdapterService();
        }
        if (cls == w.class) {
            return ((DaggerAppComponent) obj).getWebViewTweakerService();
        }
        return null;
    }
}
