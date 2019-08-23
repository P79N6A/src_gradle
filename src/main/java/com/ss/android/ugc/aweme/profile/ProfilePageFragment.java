package com.ss.android.ugc.aweme.profile;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.feed.b.c;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.y;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.at;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.e;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.main.page.FeedEventTypeCallBack;
import com.ss.android.ugc.aweme.main.page.MainPageViewModel;
import com.ss.android.ugc.aweme.profile.ui.MyProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.a.a;
import com.ss.android.ugc.aweme.profile.ui.a.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.cl;
import org.json.JSONObject;

public class ProfilePageFragment extends CommonPageFragment implements AwemeChangeCallBack.a, FeedEventTypeCallBack.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61187a;

    /* renamed from: b  reason: collision with root package name */
    private b f61188b;

    /* renamed from: c  reason: collision with root package name */
    private a f61189c;

    /* renamed from: d  reason: collision with root package name */
    private CrossPlatformFragment f61190d;

    /* renamed from: e  reason: collision with root package name */
    private String f61191e = "";

    /* renamed from: f  reason: collision with root package name */
    private Aweme f61192f;
    private String g;
    private String h = "other_places";
    private boolean i;
    private boolean j = true;
    private String k;

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61187a, false, 67251, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61187a, false, 67251, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (n.b(this.f61192f)) {
                if (this.f61190d == null || z) {
                    if (i()) {
                        this.f61190d = null;
                    } else if (this.f61190d != null) {
                        a((Fragment) this.f61190d);
                        this.f61190d = null;
                    }
                    this.f61190d = g();
                    a(this.f61190d, "tag_fragment_page_ad");
                }
                this.f61191e = "page_ad";
                if (z) {
                }
            } else {
                if (i()) {
                    this.f61190d = null;
                } else if (this.f61190d != null && !b("page_ad")) {
                    a((Fragment) this.f61190d);
                    this.f61190d = null;
                }
                if (c(this.f61192f)) {
                    if (!b("page_my")) {
                        if (this.f61189c == null) {
                            this.f61189c = d();
                        }
                        a((AmeBaseFragment) this.f61189c, "tag_fragment_page_my");
                        this.f61191e = "page_my";
                    }
                    if (z) {
                    }
                } else {
                    if (!b("page_user")) {
                        if (this.f61188b == null) {
                            this.f61188b = e();
                        }
                        a((AmeBaseFragment) this.f61188b, "tag_fragment_page_user");
                        this.f61191e = "page_user";
                        b();
                    }
                    if (z) {
                        b(this.f61192f);
                    }
                }
            }
        }
    }

    private boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67250, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67250, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.j && (getContext() instanceof MainActivity)) {
            z = true;
        }
        return z;
    }

    private Bundle f() {
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67260, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67260, new Class[0], Bundle.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("profile_from", "feed_detail");
        bundle.putString("previous_page", "homepage_hot");
        return bundle;
    }

    private CrossPlatformFragment g() {
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67261, new Class[0], CrossPlatformFragment.class)) {
            return (CrossPlatformFragment) PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67261, new Class[0], CrossPlatformFragment.class);
        }
        CrossPlatformFragment h2 = h();
        h2.a(new m(this));
        return h2;
    }

    private static boolean i() {
        if (PatchProxy.isSupport(new Object[0], null, f61187a, true, 67266, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f61187a, true, 67266, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return g.b().aW().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    private a d() {
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67258, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67258, new Class[0], a.class);
        }
        a aVar = (a) getChildFragmentManager().findFragmentByTag("tag_fragment_page_my");
        if (com.ss.android.g.a.a()) {
            aVar = (a) ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createMyProfileFragment();
        }
        if (aVar == null) {
            aVar = new MyProfileFragment();
        }
        aVar.a(new at() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61193a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f61193a, false, 67269, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61193a, false, 67269, new Class[0], Void.TYPE);
                    return;
                }
                ProfilePageFragment.this.a();
            }
        });
        return aVar;
    }

    private b e() {
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67259, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67259, new Class[0], b.class);
        }
        AmeBaseFragment ameBaseFragment = (AmeBaseFragment) getChildFragmentManager().findFragmentByTag("tag_fragment_page_user");
        if (com.ss.android.g.a.a()) {
            ameBaseFragment = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createUserProfileFragment();
            if (ameBaseFragment != null) {
                ameBaseFragment.setArguments(f());
            }
        }
        if (ameBaseFragment == null) {
            ameBaseFragment = new UserProfileFragment();
            ameBaseFragment.setArguments(f());
        }
        b bVar = (b) ameBaseFragment;
        bVar.a((at) new at() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61195a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f61195a, false, 67270, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61195a, false, 67270, new Class[0], Void.TYPE);
                    return;
                }
                ProfilePageFragment.this.a();
            }
        });
        bVar.h(this.g);
        bVar.i(this.g);
        bVar.j("other_places");
        return bVar;
    }

    private void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67244, new Class[0], Void.TYPE);
            return;
        }
        if (this.f61188b == null) {
            this.f61188b = e();
            if (this.f61192f != null) {
                this.f61188b.i(this.f61192f.getAuthor());
            }
        }
        this.f61188b.g(this.k);
        this.f61188b.a(this.f61192f);
        this.f61188b.h(this.g);
        this.f61188b.i(this.g);
        this.f61188b.j(this.h);
        String q = aa.q(this.f61192f);
        String r = aa.r(this.f61192f);
        if (!TextUtils.isEmpty(q)) {
            this.f61188b.a(q, r);
        }
        b bVar = this.f61188b;
        if (this.f61192f != null) {
            str = this.f61192f.getAid();
        } else {
            str = "";
        }
        bVar.k(str);
        this.f61188b.I();
        if (getUserVisibleHint()) {
            this.f61188b.H();
        }
        this.h = "other_places";
        if (((AmeBaseFragment) getChildFragmentManager().findFragmentByTag("tag_fragment_page_user")) == null) {
            a((AmeBaseFragment) this.f61188b, "tag_fragment_page_user");
        }
        y.a(null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67263, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (PatchProxy.isSupport(new Object[]{activity, "page_home"}, null, cl.f75690a, true, 88382, new Class[]{FragmentActivity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, "page_home"}, null, cl.f75690a, true, 88382, new Class[]{FragmentActivity.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity, "page_home"}, null, MainPageViewModel.f54872a, true, 58151, new Class[]{FragmentActivity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, "page_home"}, null, MainPageViewModel.f54872a, true, 58151, new Class[]{FragmentActivity.class, String.class}, Void.TYPE);
            return;
        }
        ((MainPageViewModel) ViewModelProviders.of(activity).get(MainPageViewModel.class)).f54873b.setValue("page_home");
    }

    private CrossPlatformFragment h() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67262, new Class[0], CrossPlatformFragment.class)) {
            return (CrossPlatformFragment) PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67262, new Class[0], CrossPlatformFragment.class);
        }
        CrossPlatformFragment crossPlatformFragment = new CrossPlatformFragment();
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.WEB_URL, this.f61192f.getAwemeRawAd().getWebUrl());
        bundle.putBoolean("control_request_url", true);
        if (!TextUtils.isEmpty(this.f61192f.getAwemeRawAd().getSource())) {
            str = this.f61192f.getAwemeRawAd().getSource();
        } else {
            str = this.f61192f.getAwemeRawAd().getWebTitle();
        }
        bundle.putString("bundle_download_app_name", str);
        bundle.putBoolean("bundle_disable_download_dialog", this.f61192f.getAwemeRawAd().isDisableDownloadDialog());
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().c());
        bundle.putBoolean("use_ordinary_web", this.f61192f.getAwemeRawAd().isUseOrdinaryWeb());
        bundle.putBoolean("bundle_is_ad_fake", true);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("bundle_download_app_log_extra", this.f61192f.getAwemeRawAd().getLogExtra());
        bundle.putBoolean("show_report", this.f61192f.getAwemeRawAd().isReportEnable());
        bundle.putString("aweme_id", this.f61192f.getAid());
        Long creativeId = this.f61192f.getAwemeRawAd().getCreativeId();
        bundle.putLong("ad_id", this.f61192f.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", this.f61192f.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", this.f61192f.getAwemeRawAd().getSystemOrigin());
        bundle.putString("bundle_download_app_extra", String.valueOf(this.f61192f.getAwemeRawAd().getCreativeId()));
        String downloadUrl = this.f61192f.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", this.f61192f.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", this.f61192f.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(this.f61192f.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", this.f61192f.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", this.f61192f.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", this.f61192f.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", this.f61192f.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", this.f61192f.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", this.f61192f.getAwemeRawAd().getWebUrl());
        }
        String webTitle = this.f61192f.getAwemeRawAd().getWebTitle();
        if (com.ss.android.g.a.a() && TextUtils.isEmpty(webTitle)) {
            webTitle = " ";
        }
        bundle.putString("bundle_web_title", webTitle);
        String packageName = this.f61192f.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        JSONObject f2 = com.ss.android.ugc.aweme.commercialize.log.g.f(getContext(), this.f61192f, "");
        if (f2 == null) {
            str2 = "";
        } else {
            str2 = f2.toString();
        }
        bundle.putString("aweme_json_extra", str2);
        Long groupId = this.f61192f.getAwemeRawAd().getGroupId();
        if (!(groupId == null || groupId.longValue() == 0)) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (this.f61192f.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        c preloadData = this.f61192f.getAwemeRawAd().getPreloadData();
        if (preloadData != null) {
            bundle.putString("preload_site_id", preloadData.getSiteId());
        }
        bundle.putInt("preload_web_status", this.f61192f.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putInt("web_type", this.f61192f.getAwemeRawAd().getWebType());
        Context context = getContext();
        if (context == null || !this.f61192f.getAwemeRawAd().isUseDefaultColor()) {
            bundle.putInt("bundle_webview_background", -1);
        } else {
            bundle.putInt("bundle_webview_background", context.getResources().getColor(C0906R.color.a17));
        }
        crossPlatformFragment.setArguments(bundle);
        return crossPlatformFragment;
    }

    public void onEventTypeChange(String str) {
        this.g = str;
    }

    public final ProfilePageFragment b(boolean z) {
        this.i = z;
        if (z) {
            this.h = "main_head";
        }
        return this;
    }

    private void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f61187a, false, 67257, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f61187a, false, 67257, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.remove(fragment2);
        beginTransaction.commitAllowingStateLoss();
    }

    private void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f61187a, false, 67252, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f61187a, false, 67252, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (!(aweme == null || aweme.getAuthor() == null || getActivity() == null || getActivity().isFinishing())) {
            this.f61188b.n();
            this.f61188b.a(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
            this.f61188b.a(aweme);
            this.f61188b.i(aweme.getAuthor());
        }
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61187a, false, 67265, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61187a, false, 67265, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f61188b != null) {
            this.f61188b.f(z);
        }
    }

    private boolean c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f61187a, false, 67255, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f61187a, false, 67255, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !TextUtils.equals(d.a().getCurUserId(), aweme.getAuthorUid())) {
            return false;
        } else {
            return true;
        }
    }

    private boolean b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f61187a, false, 67254, new Class[]{String.class}, Boolean.TYPE)) {
            return TextUtils.equals(this.f61191e, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f61187a, false, 67254, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(Aweme aweme) {
        boolean z;
        int i2;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f61187a, false, 67248, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f61187a, false, 67248, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        boolean z2 = !TextUtils.equals(aa.m(this.f61192f), aa.m(aweme));
        if (aweme2 != null) {
            this.f61192f = aweme2;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f61187a, false, 67249, new Class[]{Aweme.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f61187a, false, 67249, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (c() && com.ss.android.ugc.aweme.commercialize.utils.c.Q(aweme)) {
                    AbTestManager a2 = AbTestManager.a();
                    if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 72032, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 72032, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        AbTestModel d2 = a2.d();
                        if (d2 != null) {
                            z = d2.awesomeSplashInitProfileDelayDisable;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                a(z2);
            } else {
                l lVar = new l(this, z2);
                if (c()) {
                    i2 = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
                } else {
                    i2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
                }
                com.ss.android.b.a.a.a.a(lVar, i2);
            }
            this.j = false;
        }
    }

    public void setUserVisibleHint(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61187a, false, 67240, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61187a, false, 67240, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        Aweme aweme = this.f61192f;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f61187a, false, 67253, new Class[]{Aweme.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{aweme}, this, f61187a, false, 67253, new Class[]{Aweme.class}, String.class);
        } else if (n.b(this.f61192f)) {
            str = "page_ad";
        } else if (c(this.f61192f)) {
            str = "page_my";
        } else {
            str = "page_user";
        }
        String str2 = str;
        char c2 = 65535;
        if (!z) {
            if (!PatchProxy.isSupport(new Object[]{str2}, this, f61187a, false, 67241, new Class[]{String.class}, Void.TYPE)) {
                c(false);
                int hashCode = str2.hashCode();
                if (hashCode != -803549229) {
                    if (hashCode != -803548836) {
                        if (hashCode == 883917691 && str2.equals("page_user")) {
                            c2 = 2;
                        }
                    } else if (str2.equals("page_my")) {
                        c2 = 1;
                    }
                } else if (str2.equals("page_ad")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        if (PatchProxy.isSupport(new Object[0], this, f61187a, false, 67247, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67247, new Class[0], Void.TYPE);
                            break;
                        } else {
                            if (this.f61190d != null) {
                                if (!(this.f61190d.f40673b == null || this.f61192f.getAwemeRawAd() == null)) {
                                    this.f61190d.f40673b.m();
                                }
                                e a2 = com.ss.android.ugc.aweme.main.base.d.a(getActivity());
                                if (a2 != null && !a2.a()) {
                                    a2.a(true);
                                }
                            }
                            return;
                        }
                    case 1:
                        if (this.f61189c instanceof MyProfileFragment) {
                            ((MyProfileFragment) this.f61189c).a(false);
                            return;
                        }
                        break;
                    case 2:
                        if (this.f61188b != null) {
                            this.f61188b.a(false);
                            break;
                        }
                        break;
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f61187a, false, 67241, new Class[]{String.class}, Void.TYPE);
            }
        } else {
            if (!PatchProxy.isSupport(new Object[]{str2}, this, f61187a, false, 67242, new Class[]{String.class}, Void.TYPE)) {
                if (isViewValid()) {
                    com.benchmark.bl.a.b().a(2);
                    c(true);
                    if (!PatchProxy.isSupport(new Object[]{str2}, this, f61187a, false, 67243, new Class[]{String.class}, Void.TYPE)) {
                        int hashCode2 = str2.hashCode();
                        if (hashCode2 != -803549229) {
                            if (hashCode2 != -803548836) {
                                if (hashCode2 == 883917691 && str2.equals("page_user")) {
                                    c2 = 2;
                                }
                            } else if (str2.equals("page_my")) {
                                c2 = 1;
                            }
                        } else if (str2.equals("page_ad")) {
                            c2 = 0;
                        }
                        switch (c2) {
                            case 0:
                                if (!PatchProxy.isSupport(new Object[0], this, f61187a, false, 67246, new Class[0], Void.TYPE)) {
                                    if (this.f61190d != null) {
                                        MixActivityContainer mixActivityContainer = this.f61190d.f40673b;
                                        if (!(mixActivityContainer == null || this.f61192f.getAwemeRawAd() == null)) {
                                            this.f61190d.f40673b.a(this.f61192f.getAwemeRawAd().getWebUrl());
                                            this.f61190d.f40673b.l();
                                            if (mixActivityContainer.getCrossPlatformParams().f40808d.v) {
                                                e a3 = com.ss.android.ugc.aweme.main.base.d.a(getActivity());
                                                if (a3 != null) {
                                                    a3.a(false);
                                                }
                                            }
                                        }
                                        com.ss.android.ugc.aweme.commercialize.log.g.j(getContext(), this.f61192f);
                                        y.a(this.f61192f);
                                        this.i = false;
                                        break;
                                    }
                                } else {
                                    PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67246, new Class[0], Void.TYPE);
                                    break;
                                }
                                break;
                            case 1:
                                if (!PatchProxy.isSupport(new Object[0], this, f61187a, false, 67245, new Class[0], Void.TYPE)) {
                                    if (this.f61189c instanceof MyProfileFragment) {
                                        ((MyProfileFragment) this.f61189c).a(true);
                                    }
                                    y.a(null);
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(new Object[0], this, f61187a, false, 67245, new Class[0], Void.TYPE);
                                    break;
                                }
                            case 2:
                                b();
                                if (this.f61188b != null) {
                                    this.f61188b.a(true);
                                    break;
                                }
                                break;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f61187a, false, 67243, new Class[]{String.class}, Void.TYPE);
                    }
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f61187a, false, 67242, new Class[]{String.class}, Void.TYPE);
            }
            if (com.ss.android.g.a.a()) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onFeedStop();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        if (r3.equals("page_my") != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f61187a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 67264(0x106c0, float:9.4257E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f61187a
            r13 = 0
            r14 = 67264(0x106c0, float:9.4257E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            r2 = r17
            java.lang.String r3 = r2.f61191e
            r4 = -1
            int r5 = r3.hashCode()
            r6 = -803549229(0xffffffffd01acfd3, float:-1.03892449E10)
            if (r5 == r6) goto L_0x0062
            r6 = -803548836(0xffffffffd01ad15c, float:-1.03896474E10)
            if (r5 == r6) goto L_0x0059
            r1 = 883917691(0x34af837b, float:3.2691955E-7)
            if (r5 == r1) goto L_0x004f
            goto L_0x006c
        L_0x004f:
            java.lang.String r1 = "page_user"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006c
            r1 = 2
            goto L_0x006d
        L_0x0059:
            java.lang.String r5 = "page_my"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x006c
            goto L_0x006d
        L_0x0062:
            java.lang.String r1 = "page_ad"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x006c
            r1 = 0
            goto L_0x006d
        L_0x006c:
            r1 = -1
        L_0x006d:
            switch(r1) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0079;
                case 2: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x007b
        L_0x0071:
            com.ss.android.ugc.aweme.profile.ui.a.b r1 = r17.e()
            r1.a((java.lang.String) r0)
            goto L_0x007b
        L_0x0079:
            return
        L_0x007a:
            return
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfilePageFragment.a(java.lang.String):void");
    }

    private void a(Fragment fragment, String str) {
        Fragment fragment2 = fragment;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragment2, str2}, this, f61187a, false, 67256, new Class[]{Fragment.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, str2}, this, f61187a, false, 67256, new Class[]{Fragment.class, String.class}, Void.TYPE);
            return;
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(C0906R.id.y9, fragment2, str2);
        beginTransaction.commitAllowingStateLoss();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f61187a, false, 67239, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f61187a, false, 67239, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        AwemeChangeCallBack.a(getActivity(), this, this);
        FragmentActivity activity = getActivity();
        if (PatchProxy.isSupport(new Object[]{activity, this, this}, null, FeedEventTypeCallBack.f54868a, true, 58149, new Class[]{FragmentActivity.class, LifecycleOwner.class, FeedEventTypeCallBack.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, this, this}, null, FeedEventTypeCallBack.f54868a, true, 58149, new Class[]{FragmentActivity.class, LifecycleOwner.class, FeedEventTypeCallBack.a.class}, Void.TYPE);
        } else {
            FeedEventTypeCallBack.a(activity).a(this, new Observer<String>(this) {

                /* renamed from: a */
                public static ChangeQuickRedirect f54870a;

                /* renamed from: b */
                final /* synthetic */ a f54871b;

                public final /* synthetic */ void onChanged(
/*
Method generation error in method: com.ss.android.ugc.aweme.main.page.FeedEventTypeCallBack.1.onChanged(java.lang.Object):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.main.page.FeedEventTypeCallBack.1.onChanged(java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            }, true);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.k = arguments.getString("related_gid", "");
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f61187a, false, 67238, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pe, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f61187a, false, 67238, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
