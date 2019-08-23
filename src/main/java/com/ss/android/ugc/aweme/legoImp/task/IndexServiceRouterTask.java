package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.commerce.c;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commerce.service.b.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.app.StoryInit;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;

public class IndexServiceRouterTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    static final /* synthetic */ ICommerceService lambda$initServiceManager$0$IndexServiceRouterTask() {
        ICommerceService iCommerceService = (ICommerceService) ServiceManager.get().getService(ICommerceService.class, true);
        if (iCommerceService != null) {
            iCommerceService.initCommerce(k.a(), new a("aweme.snssdk.com", "wx76fdd06dde311af3"), new c());
        }
        return iCommerceService;
    }

    @MeasureFunction
    private void initAccount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55268, new Class[0], Void.TYPE);
            return;
        }
        if (d.a().isLogin()) {
            AppLog.setUserId(Long.parseLong(d.a().getCurUserId()));
            AppLog.setSessionKey(d.a().getSessionKey());
        }
    }

    @MeasureFunction
    private void initServiceManager() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55267, new Class[0], Void.TYPE);
            return;
        }
        ServiceManager.get().bind(ICommerceService.class, c.f53148b).asSingleton();
        ServiceManager.get().bind(com.ss.android.ugc.aweme.story.api.c.class, d.f53150b).asSingleton();
        new StoryInit().init(k.a());
    }

    @MeasureFunction
    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55266, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55266, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("IndexServiceRouterTask");
        initServiceManager();
        initAccount();
        com.ss.android.ugc.aweme.lego.a.i.a().a(new SplashAdManagerPreloadTask()).a();
    }

    static final /* synthetic */ void lambda$null$1$IndexServiceRouterTask(Context context, User user, Bundle bundle) {
        c.a a2 = new c.a(context, user).c("live_cover").a("action_type", "click").d(bundle.getString("live.intent.extra.REQUEST_ID", "")).b(bundle.getString("enter_from", "")).a((Rect) bundle.getParcelable("story_live_source_rect"));
        if (AbTestManager.a().cm()) {
            a2.n = bundle.getLongArray("live.intent.extra.ENTER_ROOM_IDS");
        }
        com.ss.android.ugc.aweme.story.live.c.a().a(a2);
    }
}
