package com.ss.android.ugc.aweme.ag;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.a;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.b;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.ss.android.ugc.aweme.commercialize.im.f;
import com.ss.android.ugc.aweme.commercialize.loft.LoftActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity;
import com.ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;
import com.ss.android.ugc.aweme.live.LiveFeedActivity;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.miniapp.p;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import com.ss.android.ugc.aweme.music.ui.MusicListActivity;
import com.ss.android.ugc.aweme.plugin.ui.PluginListActivity;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.ui.AboutActivity;
import com.ss.android.ugc.aweme.setting.ui.PrivacyActivity;
import com.ss.android.ugc.aweme.setting.ui.TestSettingActivity;
import com.ss.android.ugc.aweme.wallet.ui.WalletActivity;
import com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity;

public final class g implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2585a;

    public final void a() {
        d dVar;
        d dVar2;
        if (PatchProxy.isSupport(new Object[0], this, f2585a, false, 70941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2585a, false, 70941, new Class[0], Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, f2585a, true, 70942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f2585a, true, 70942, new Class[0], Void.TYPE);
        } else {
            h.a("aweme://main", MainActivity.class);
            h.a().a("aweme://login", (d) new d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33248a;

                public final boolean a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f33248a, false, 70945, new Class[]{String.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f33248a, false, 70945, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                    }
                    e.a(AwemeAppData.p().f(), "h5", "");
                    return true;
                }

                public final boolean a(Activity activity, String str) {
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity2, str}, this, f33248a, false, 70943, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str}, this, f33248a, false, 70943, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
                    }
                    e.a(activity2, "h5", "");
                    return true;
                }

                public final boolean a(Activity activity, String str, View view) {
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity2, str, view}, this, f33248a, false, 70944, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str, view}, this, f33248a, false, 70944, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
                    }
                    e.a(activity2, "h5", "");
                    return true;
                }
            });
            h.a("aweme://setting", ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSettingActivityClass());
            h.a("aweme://test_setting", TestSettingActivity.class);
            h.a("aweme://profile_edit", ProfileEditActivity.class);
            h.a("aweme://about_activity", AboutActivity.class);
            h.a("aweme://challenge/create", CreateChallengeActivity.class);
            h.a("aweme://challenge/detail/:id", ChallengeDetailActivity.class);
            h.a("aweme://music/detail/?partnerMusicId&partnerName", MusicDetailActivity.class);
            h.a("aweme://music/detail/:id", MusicDetailActivity.class);
            h.a("aweme://assmusic/category/:cid", MusicDetailListActivity.class);
            h.a("aweme://music/category/:mc_id", MusicListActivity.class);
            h.a("aweme://user/profile/:uid", UserProfileActivity.class);
            h.a("aweme://search/trending", RankingListActivity.class);
            h.a("aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type/:enter_from", UserProfileActivity.class);
            h.a("aweme://aweme/detail/:id", DetailActivity.class);
            h.a("aweme://tuwen/detail/:id", DetailActivity.class);
            h.a("aweme://aweme/detaillist/:id", DetailActivity.class);
            h.a("aweme://webview/", CrossPlatformActivity.class);
            h.a("aweme://ame/webview/", CrossPlatformActivity.class);
            h.a("aweme://user/invite", AddFriendsActivity.class);
            h.a("aweme://pluginlist/", PluginListActivity.class);
            h.a("aweme://aweme/zhima/:type", ZhiMaInterActivity.class);
            h.a("aweme://reactnative/", CrossPlatformActivity.class);
            h.a("aweme://coupon/detail?coupon_id&code_id&enter_from", CouponDetailActivity.class);
            h.a("aweme://coupon", CouponListActivity.class);
            h.a("aweme://aweme/forward/:forward_id", ForwardDetailActivity.class);
            h.a("aweme://poi/detail/:id", PoiDetailActivity.class);
            h.a("aweme://poi/detail/", PoiDetailActivity.class);
            h.a("aweme://aweme/scan/", QRCodePermissionActivity.class);
            h.a("aweme://favorite", UserFavoritesActivity.class);
            h.a("aweme://search", SearchResultActivity.class);
            h.a("aweme://privacy/setting?source=", PrivacyActivity.class);
            h.a().a("aweme://teen_protection", (d) new b());
            h.a().a("aweme://privacy/setting/modify/", (d) new a());
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.commercialize.g.f38874a, true, 30263, new Class[0], d.class)) {
                dVar = (d) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.commercialize.g.f38874a, true, 30263, new Class[0], d.class);
            } else {
                ICommerceService a2 = com.ss.android.ugc.aweme.commercialize.g.a();
                if (a2 != null) {
                    dVar = a2.generateRegisterRouter();
                } else {
                    dVar = null;
                }
            }
            if (dVar != null) {
                h.a().a("aweme://goods/shop/", dVar);
                h.a().a("aweme://goods/seeding/", dVar);
                h.a().a("aweme://goods/ordershare/", dVar);
            }
            h.a().a("aweme://chatting/message", (d) f.f38915b);
            h.a("aweme://studio/task/create", ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
            h.a("aweme://hotlive/feed", LiveFeedActivity.class);
            h.a("sslocal://hotlive/feed", LiveFeedActivity.class);
            h a3 = h.a();
            if (PatchProxy.isSupport(new Object[0], null, c.f33238a, true, 70922, new Class[0], d.class)) {
                dVar2 = (d) PatchProxy.accessDispatch(new Object[0], null, c.f33238a, true, 70922, new Class[0], d.class);
            } else {
                dVar2 = new e(c.f33239b);
            }
            a3.a("aweme://aweme/challenge/detail/", dVar2);
            h.a("aweme://studio/create", ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
            h.a("aweme://discover/loft", LoftActivity.class);
            h.a("aweme://feedback_record", FeedbackActivity.class);
            h.a("aweme://wallet_index", WalletActivity.class);
            h.a().a("sslocal://microapp", (d) new p());
        }
    }
}
