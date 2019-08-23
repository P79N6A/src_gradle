package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.app.e;
import com.ss.android.newmedia.k;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.main.HomeFragment;
import com.ss.android.ugc.aweme.main.base.HomeViewPager;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.profile.SlideSettingPageFragment;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;

public class PreloadInstanceTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    private void preloadInstance(Object obj) {
    }

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55293, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55293, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("PreloadInstanceTask");
        preloadInstance(context.getSystemService("audio"));
        preloadInstance(context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME));
        preloadInstance(context.getSystemService("sensor"));
        preloadInstance(AbTestManager.a().d());
        preloadInstance(e.a(context));
        preloadInstance(m.a());
        preloadInstance(c.a());
        try {
            preloadInstance(new ScrollableViewPager(context));
            preloadInstance(new SwipeRefreshLayout(context));
            preloadInstance(new DmtTextView(context));
            preloadInstance(new PluginService());
            preloadInstance(new HomeViewPager(context));
            preloadInstance(new FeedRecommendFragment());
        } catch (Throwable unused) {
        }
        preloadInstance(com.ss.android.ugc.aweme.o.f.class);
        preloadInstance(SplashActivity.class);
        preloadInstance(AmeBaseFragment.class);
        preloadInstance(HomeFragment.class);
        preloadInstance(ProfilePageFragment.class);
        preloadInstance(SlideSettingPageFragment.class);
        ServiceManager.get().getService(IAVServiceProxy.class);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).storyRecordService();
        ServiceManager.get().getService(ICommerceService.class, true);
        k.a();
        preloadInstance(b.a());
    }
}
