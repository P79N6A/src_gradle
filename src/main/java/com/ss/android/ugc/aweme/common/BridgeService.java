package com.ss.android.ugc.aweme.common;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amap.api.location.CoordinateConverter;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.activity.FillProfileActivity;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.antiaddic.c.b;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.app.z;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.activity.AmePresenterActivity;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commerce.collection.GoodsCollectFragment;
import com.ss.android.ugc.aweme.common.widget.MainTabStrip;
import com.ss.android.ugc.aweme.common.widget.c;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.ui.DiscoverFragment;
import com.ss.android.ugc.aweme.favorites.ui.PoiCollectListFragment;
import com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.ao;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.f;
import com.ss.android.ugc.aweme.feed.ui.PrivateDialog;
import com.ss.android.ugc.aweme.feed.ui.StaggeredNearByFragment;
import com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity;
import com.ss.android.ugc.aweme.festival.christmas.b.a;
import com.ss.android.ugc.aweme.festival.christmas.c.g;
import com.ss.android.ugc.aweme.festival.christmas.c.l;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.d.j;
import com.ss.android.ugc.aweme.friends.ui.FindFriendsJediFragment;
import com.ss.android.ugc.aweme.friends.ui.ThirdPartyAddFriendView;
import com.ss.android.ugc.aweme.friends.ui.y;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.m;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;
import com.ss.android.ugc.aweme.main.cb;
import com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.net.OKHttpSwitchInterceptor;
import com.ss.android.ugc.aweme.opensdk.share.a.a;
import com.ss.android.ugc.aweme.opensdk.share.base.DYImageObject;
import com.ss.android.ugc.aweme.opensdk.share.base.DYVideoObject;
import com.ss.android.ugc.aweme.opensdk.share.base.TikTokImageObject;
import com.ss.android.ugc.aweme.opensdk.share.base.TikTokVideoObject;
import com.ss.android.ugc.aweme.opensdk.share.share.Share;
import com.ss.android.ugc.aweme.poi.nearby.ui.PoiCouponScopeActivity;
import com.ss.android.ugc.aweme.poi.nearby.ui.PoiRankListActivity;
import com.ss.android.ugc.aweme.poi.nearby.ui.PoiSameCityActivity;
import com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFeedsFragment;
import com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFilterDetailActivity;
import com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment;
import com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.BindAccountView;
import com.ss.android.ugc.aweme.profile.ui.EditSelfBriefActivity;
import com.ss.android.ugc.aweme.profile.ui.MyProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.profile.ui.aa;
import com.ss.android.ugc.aweme.profile.ui.ab;
import com.ss.android.ugc.aweme.profile.ui.bs;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.AwemeSettingManager;
import com.ss.android.ugc.aweme.setting.e;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.o;
import com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity;
import com.ss.android.ugc.aweme.setting.ui.PrivacyActivity;
import com.ss.android.ugc.aweme.share.cr;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.share.score.DouyinPraiseDialog;
import com.ss.android.ugc.aweme.shortvideo.PublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.e.h;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

public class BridgeService implements IBridgeService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private c mLiveServiceAdapter;

    public void addExtraPlayCommonParam(i iVar) {
    }

    public void addOneCard(int i) {
    }

    public void addSupportLanguageItems() {
    }

    public void bindUserTermsOfPrivacy(Context context, TextView textView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z) {
    }

    public boolean canAwemePlay(Aweme aweme) {
        return false;
    }

    public void changeStatusBarMainTab(Activity activity, String str) {
    }

    public void checkContentDialogNeedShow(Context context) {
    }

    public boolean checkMessageNotification(Fragment fragment) {
        return false;
    }

    public void checkToCleanNoneUsedFiles() {
    }

    public void checkToTransformMusDraft() {
    }

    public boolean checkVersionMusical() {
        return false;
    }

    public void clearTabStatus() {
    }

    public AppCompatDialog createChristmasEcardDialog(AbsActivity absActivity, l lVar, Aweme aweme, com.ss.android.ugc.aweme.festival.christmas.c.c cVar, String str) {
        return null;
    }

    public AmeBaseFragment createMyProfileFragment() {
        return null;
    }

    public Fragment createOneLoginStartFragment(OneLoginPhoneBean oneLoginPhoneBean, long j) {
        return null;
    }

    public AppCompatDialog createShareDonationDialog(Activity activity, g gVar, int i, a aVar, String str) {
        return null;
    }

    public ProfileEditFragment createUserProfileEditFragment() {
        return null;
    }

    public AmeBaseFragment createUserProfileFragment() {
        return null;
    }

    public boolean disableSyncShareCookieHost() {
        return true;
    }

    public void dismissLoginDialog(Dialog dialog) {
    }

    public void endOneLogin() {
    }

    public void followOnInstagram(Context context, String str) {
    }

    public void followOnYoutube(Context context, String str) {
    }

    public String getAdvertisingIdOb() {
        return "";
    }

    public String getAndroidId() {
        return "";
    }

    public String getBlockedUserOpInfoString(User user, Context context) {
        return null;
    }

    public Class<? extends AmePresenterActivity> getChooseLanguageActivityClass() {
        return null;
    }

    public int getDefaultShareIcon() {
        return 2130838974;
    }

    public int getGoogleIcon() {
        return 0;
    }

    public Class<? extends Activity> getHeaderDetailActivity() {
        return null;
    }

    public d getInterestSelectRequest() {
        return null;
    }

    public boolean getInterestSelectShowed() {
        return false;
    }

    public Intent getInviteUserListActivityIntent(Activity activity, int i) {
        return null;
    }

    public int getLayoutId(int i) {
        return 0;
    }

    public String getLocalLanguage(Context context) {
        return "";
    }

    public Class<? extends Activity> getManagerMyAccountActivity() {
        return null;
    }

    public h getMaxDurationResolver() {
        return null;
    }

    public Class<? extends AmeBaseFragment> getMessageFragmentClass() {
        return null;
    }

    public Class<?> getMyProfileFragmentClass() {
        return null;
    }

    public Class<? extends Activity> getPrivacySettingActivity() {
        return null;
    }

    public int getPrivateAccountTipLayoutRes() {
        return 0;
    }

    public String getReportUrl() {
        return null;
    }

    public aa getRocketHelper() {
        return null;
    }

    public int getShareIconResource() {
        return 2130838974;
    }

    public Dialog getUserRetainLoadingDialog(Context context) {
        return null;
    }

    public void getUserSettings() {
    }

    public Class getVerifyActivity() {
        return null;
    }

    public PrivateDialog getVideoPrivateDialog(Activity activity, com.ss.android.ugc.aweme.feed.f.aa<ar> aaVar, String str, int i) {
        return null;
    }

    public int getVideoViewDownloadItemIcon() {
        return -1;
    }

    public void handleNav(MainTabStrip mainTabStrip) {
    }

    public boolean havePGCShow() {
        return false;
    }

    public void hideFestivalWidget(MainFragment mainFragment) {
    }

    public void increaseViewedCount(boolean z) {
    }

    public void initOneLogin(Context context, String str, com.ss.android.ugc.aweme.login.ui.a<OneLoginPhoneBean> aVar) {
    }

    public void initOtherReferences(View view) {
    }

    public boolean isAutoSmsFilledEnable() {
        return false;
    }

    public boolean isFestivalWidgetVisible(MainFragment mainFragment) {
        return false;
    }

    public boolean isFocusOnVideoTime() {
        return false;
    }

    public boolean isForceEnableColorFilter() {
        return false;
    }

    public boolean isHaveLatestTab() {
        return false;
    }

    public int isInterestOrWelcomeShowing() {
        return 0;
    }

    public boolean isKakaoShareAvailable(Context context) {
        return false;
    }

    public boolean isLineShareAvailable(Context context) {
        return false;
    }

    public boolean isNeedAddChallengeNameToDesc() {
        return false;
    }

    public boolean isNeedContactsFriends(boolean z) {
        return false;
    }

    public boolean isNeedDetailBgCover() {
        return false;
    }

    public boolean isNeedLightStatusBar() {
        return false;
    }

    public boolean isNeedReplacePushPath() {
        return false;
    }

    public boolean isNeedToastExceptionMsg(int i) {
        return false;
    }

    public boolean isStartWelcomeScreenActivity(Activity activity) {
        return false;
    }

    public boolean isThisMusicIsBaned(Music music) {
        return false;
    }

    public boolean isUserRetainRefresh() {
        return false;
    }

    public boolean isVideoCoverFrameDarkColor() {
        return false;
    }

    public boolean judgeIsPolarisUrl(String str) {
        return false;
    }

    public boolean needCheckCopyright() {
        return false;
    }

    public boolean needCheckPrivateAccountBeforePlay(User user) {
        return false;
    }

    public boolean needCompatWithMusAudio() {
        return false;
    }

    public boolean needForceDirectShoot() {
        return false;
    }

    public void observeActivityRpInfo(LifecycleOwner lifecycleOwner, ab abVar) {
    }

    public String obtainUserRetainInterestListString() {
        return "";
    }

    public void onFeedStop() {
    }

    public void onMainTabChanged(TabChangeManager tabChangeManager, String str) {
    }

    public void onWillApplicationCreate(Application application) {
    }

    public void openAgreement(@NonNull Activity activity, @NonNull String str, boolean z, @NonNull String str2) {
    }

    public void openLanguageTestDialog(Context context) {
    }

    public void openSettingFragment(Context context) {
    }

    public void openWallet(Activity activity) {
    }

    public void pushOrNoticeShowLinkAccountDialog(FragmentManager fragmentManager, String str) {
    }

    public void readTaskPlayerCycle(int i, boolean z) {
    }

    public void rememberTabStatus(int i) {
    }

    public void requestLocationPermissions(Activity activity, a.C0792a aVar) {
    }

    public Class<? extends Activity> selectCountryActivity() {
        return null;
    }

    public void setCustomStatusBarInLayout(Activity activity) {
    }

    public void setIsUserRetainRefresh(boolean z) {
    }

    public void setLoadingStatusTextColor(Context context, c.a aVar) {
    }

    public void setStatusBar(Activity activity) {
    }

    public void setStatusBar(Activity activity, View view) {
    }

    public void shareToVK(Activity activity, IShareService.ShareStruct shareStruct) {
    }

    public boolean shouldShowUserRetainDialog(MainFragment mainFragment, String str) {
        return false;
    }

    public void showFestivalWidgetIfNeed(MainFragment mainFragment) {
    }

    public void showLinkAccountDialog(FragmentManager fragmentManager, String str, bs bsVar) {
    }

    public void showUserRetainDialog(Context context, String str) {
    }

    public void smartLandTab(@NonNull MainTabStrip mainTabStrip) {
    }

    public void startFeedsDetectTask(int i) {
    }

    public void trackAppsFlyerEvent(String str, String str2) {
    }

    public boolean tryOpenPolarisPage(Context context, String str) {
        return false;
    }

    public void tryRefreshLocation(Context context) {
    }

    public void trySetJumpToFissionH5(String str) {
    }

    public void tryShowMoneyGrowthDialog(Context context) {
    }

    public boolean tryStartShareScreenShotActivity(Context context, String str) {
        return false;
    }

    public boolean tryStartWelcomeScreenOrInterestSelectActivity(Activity activity) {
        return false;
    }

    public void tryToShowPromoteProgram(Activity activity) {
    }

    public void updateTTAbTest(AbTestModel abTestModel) {
    }

    public void videoViewHolderBindDownloadWidget(@NonNull WidgetManager widgetManager) {
    }

    public Class<? extends Activity> fillProfileActivityV2() {
        return FillProfileActivity.class;
    }

    public Class<? extends Activity> getMainActivity() {
        return MainActivity.class;
    }

    public Class<? extends Activity> getSettingActivityClass() {
        return DouYinSettingNewVersionActivity.class;
    }

    public Class<? extends AmeBaseActivity> getSubmitFeedbackActivity() {
        return SubmitFeedbackActivity.class;
    }

    public boolean isUploadContactsNoticeDialogShowing() {
        return cb.f54699d;
    }

    public Class<? extends Activity> microAppActivity() {
        return RecentlyUsedMicroAppActivity.class;
    }

    private void syncPushSetting() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33244, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.setting.serverpush.a.f64018e.a(null, false);
    }

    public void afterLogOut() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33243, new Class[0], Void.TYPE);
            return;
        }
        ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).reset();
    }

    public void afterSwitchAccount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33242, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33242, new Class[0], Void.TYPE);
            return;
        }
        ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).reset();
        syncPushSetting();
    }

    public Fragment createAddFriendsFragment() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33246, new Class[0], Fragment.class)) {
            return new FindFriendsJediFragment();
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33246, new Class[0], Fragment.class);
    }

    public ProfileListFragment createCollectGoodsFragment() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33217, new Class[0], ProfileListFragment.class)) {
            return new GoodsCollectFragment();
        }
        return (ProfileListFragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33217, new Class[0], ProfileListFragment.class);
    }

    public ProfileListFragment createCollectPoiFragment() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33216, new Class[0], ProfileListFragment.class)) {
            return new PoiCollectListFragment();
        }
        return (ProfileListFragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33216, new Class[0], ProfileListFragment.class);
    }

    public Fragment createPublishDialogFragment() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33214, new Class[0], Fragment.class)) {
            return new PublishDialogFragment();
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33214, new Class[0], Fragment.class);
    }

    public com.ss.android.ugc.aweme.newfollow.a createRecommendListPresenter() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33247, new Class[0], com.ss.android.ugc.aweme.newfollow.a.class)) {
            return new j();
        }
        return (com.ss.android.ugc.aweme.newfollow.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33247, new Class[0], com.ss.android.ugc.aweme.newfollow.a.class);
    }

    public SQLiteDatabase getAppOpenReadDB() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33263, new Class[0], SQLiteDatabase.class)) {
            return com.ss.android.ugc.aweme.share.score.a.a().f65265c;
        }
        return (SQLiteDatabase) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33263, new Class[0], SQLiteDatabase.class);
    }

    public SQLiteDatabase getAppOpenWriteDB() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33264, new Class[0], SQLiteDatabase.class)) {
            return com.ss.android.ugc.aweme.share.score.a.a().f65264b;
        }
        return (SQLiteDatabase) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33264, new Class[0], SQLiteDatabase.class);
    }

    public Fragment getNearbyFragment() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33223, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33223, new Class[0], Fragment.class);
        }
        AbTestManager.a();
        return new StaggeredNearByFragment();
    }

    public Fragment getPoiTypeFeedsFragment() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33224, new Class[0], Fragment.class)) {
            return new PoiTypeFeedsFragment();
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33224, new Class[0], Fragment.class);
    }

    public o getSettingManager() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33225, new Class[0], o.class)) {
            return new AwemeSettingManager();
        }
        return (o) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33225, new Class[0], o.class);
    }

    public com.ss.android.ugc.aweme.global.config.settings.a getSettingsWatcher() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33226, new Class[0], com.ss.android.ugc.aweme.global.config.settings.a.class)) {
            return new e();
        }
        return (com.ss.android.ugc.aweme.global.config.settings.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33226, new Class[0], com.ss.android.ugc.aweme.global.config.settings.a.class);
    }

    public List<Object> getShareItemOrderBeans() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33260, new Class[0], List.class)) {
            return f.a().f46050c;
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33260, new Class[0], List.class);
    }

    public void setHasActive() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33254, new Class[0], Void.TYPE);
            return;
        }
        try {
            com.ss.android.common.applog.c.a().b();
        } catch (Exception unused) {
        }
    }

    public void afterLogIn() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33241, new Class[0], Void.TYPE);
            return;
        }
        syncPushSetting();
        if (PatchProxy.isSupport(new Object[0], null, b.f33381a, true, 22104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, b.f33381a, true, 22104, new Class[0], Void.TYPE);
        } else {
            x.a().ah().a(0L);
        }
    }

    public boolean needLiveInRecord() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33221, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33221, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mLiveServiceAdapter == null) {
            this.mLiveServiceAdapter = new com.ss.android.ugc.aweme.story.live.c();
        }
        if (this.mLiveServiceAdapter.c() && com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            z = true;
        }
        return z;
    }

    public List<c.d> getDeeplinkCommands() {
        List list;
        List list2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33258, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33258, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        z.b bVar = z.f34309d;
        if (PatchProxy.isSupport(new Object[0], bVar, z.b.f34311a, false, 22469, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], bVar, z.b.f34311a, false, 22469, new Class[0], List.class);
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new z.i());
            arrayList2.add(new z.s());
            arrayList2.add(new z.j());
            arrayList2.add(new z.p());
            arrayList2.add(new z.q());
            arrayList2.add(new z.d());
            arrayList2.add(new z.r());
            arrayList2.add(new z.a());
            arrayList2.add(new z.n());
            arrayList2.add(new z.e());
            arrayList2.add(new z.c());
            arrayList2.add(new z.o());
            arrayList2.add(new z.f());
            arrayList2.add(new z.l());
            arrayList2.add(new z.m());
            arrayList2.add(new z.g());
            arrayList2.add(new z.h());
            arrayList2.add(new z.k());
            list = arrayList2;
        }
        arrayList.addAll(list);
        c.e eVar = com.ss.android.ugc.aweme.app.c.f33977c;
        if (PatchProxy.isSupport(new Object[0], eVar, c.e.f34073a, false, 22163, new Class[0], List.class)) {
            list2 = (List) PatchProxy.accessDispatch(new Object[0], eVar, c.e.f34073a, false, 22163, new Class[0], List.class);
        } else {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new c.m());
            arrayList3.add(new c.j());
            arrayList3.add(new c.t());
            arrayList3.add(new c.f());
            arrayList3.add(new c.z());
            arrayList3.add(new c.aa());
            arrayList3.add(new c.ac());
            arrayList3.add(new c.a());
            arrayList3.add(new c.o());
            arrayList3.add(new c.p());
            arrayList3.add(new c.v());
            arrayList3.add(new c.C0439c());
            arrayList3.add(new c.r());
            arrayList3.add(new c.y());
            arrayList3.add(new c.w());
            arrayList3.add(new c.k());
            arrayList3.add(new c.l());
            arrayList3.add(new c.q());
            arrayList3.add(new c.g());
            arrayList3.add(new c.i());
            arrayList3.add(new c.u());
            arrayList3.add(new c.s());
            arrayList3.add(new c.ad());
            arrayList3.add(new c.h());
            arrayList3.add(new c.b());
            arrayList3.add(new c.ab());
            arrayList3.add(new c.x());
            arrayList3.add(new c.n());
            list2 = arrayList3;
        }
        arrayList.addAll(list2);
        return arrayList;
    }

    public boolean needCallbackOnActivityResumed(Activity activity) {
        return activity instanceof MainActivity;
    }

    static final /* synthetic */ Object lambda$initMiniAppInDeeplink$6$BridgeService(Context context) throws Exception {
        try {
            JSONObject jSONObject = com.ss.android.ugc.aweme.miniapp_api.a.a().f55981f;
            if (jSONObject != null) {
                ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).logExcitingVideoAd(context, "open_url_appback", jSONObject.optLong("creative_id"), jSONObject.optString("log_extra"));
                com.ss.android.ugc.aweme.miniapp_api.a.a().f55981f = null;
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        return null;
    }

    public w checkShareContextWhenPublish(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 33252, new Class[]{Object.class}, w.class)) {
            return com.ss.android.ugc.aweme.opensdk.share.share.a.a(obj);
        }
        return (w) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 33252, new Class[]{Object.class}, w.class);
    }

    public w createShareContext(Intent intent) {
        if (!PatchProxy.isSupport(new Object[]{intent}, this, changeQuickRedirect, false, 33255, new Class[]{Intent.class}, w.class)) {
            return com.ss.android.ugc.aweme.opensdk.share.share.a.a(intent);
        }
        return (w) PatchProxy.accessDispatch(new Object[]{intent}, this, changeQuickRedirect, false, 33255, new Class[]{Intent.class}, w.class);
    }

    public s createUploadSuccessPopupWindow(Activity activity) {
        Activity activity2 = activity;
        if (!PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33234, new Class[]{Activity.class}, s.class)) {
            return new cr(activity2);
        }
        return (s) PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33234, new Class[]{Activity.class}, s.class);
    }

    public boolean isClientKeyValid(w wVar) {
        if (!PatchProxy.isSupport(new Object[]{wVar}, this, changeQuickRedirect, false, 33256, new Class[]{w.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.opensdk.share.share.a.a((c) wVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{wVar}, this, changeQuickRedirect, false, 33256, new Class[]{w.class}, Boolean.TYPE)).booleanValue();
    }

    public void setHasShowToutiaoLink(BindAccountView bindAccountView) {
        BindAccountView bindAccountView2 = bindAccountView;
        if (PatchProxy.isSupport(new Object[]{bindAccountView2}, this, changeQuickRedirect, false, 33220, new Class[]{BindAccountView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bindAccountView2}, this, changeQuickRedirect, false, 33220, new Class[]{BindAccountView.class}, Void.TYPE);
            return;
        }
        bindAccountView2.setShowTouTiaoLink(false);
    }

    public void checkShowFiveStarDialog(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33206, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33206, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2}, null, DouyinPraiseDialog.f65246a, true, 73653, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, DouyinPraiseDialog.f65246a, true, 73653, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (!DouyinPraiseDialog.f65247b) {
            DouyinPraiseDialog.f65247b = true;
            a.i.a((Callable<TResult>) new Callable<Boolean>(activity2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65260a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Context f65261b;

                public final /* synthetic */ Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f65260a, false, 73668, new Class[0], Boolean.class)) {
                        return Boolean.valueOf(DouyinPraiseDialog.a(this.f65261b));
                    }
                    return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f65260a, false, 73668, new Class[0], Boolean.class);
                }

                {
                    this.f65261b = r1;
                }
            }).a((a.g<TResult, TContinuationResult>) new a.g<Boolean, Void>(activity2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65258a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Context f65259b;

                {
                    this.f65259b = r1;
                }

                public final /* synthetic */ Object then(a.i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f65258a, false, 73667, new Class[]{a.i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f65258a, false, 73667, new Class[]{a.i.class}, Void.class);
                    }
                    if (((Boolean) iVar.e()).booleanValue()) {
                        new DouyinPraiseDialog(this.f65259b).show();
                    }
                    DouyinPraiseDialog.f65247b = false;
                    return null;
                }
            }, a.i.f1052b);
        }
    }

    public void enterMyFavorites(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33231, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33231, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2}, null, UserFavoritesActivity.f44345b, true, 39653, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, UserFavoritesActivity.f44345b, true, 39653, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        activity2.startActivity(new Intent(activity2, UserFavoritesActivity.class));
    }

    public List<com.ss.android.ugc.aweme.account.util.a> getAfterLoginActions(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 33238, new Class[]{Bundle.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 33238, new Class[]{Bundle.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(bundle2));
        arrayList.add(new e(bundle2));
        arrayList.add(new f(bundle2));
        arrayList.add(new g(bundle2));
        return arrayList;
    }

    public Intent getMainActivityIntent(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 33239, new Class[]{Context.class}, Intent.class)) {
            return new Intent(context2, MainActivity.class);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 33239, new Class[]{Context.class}, Intent.class);
    }

    @Nullable
    public Drawable getShareGuideAnimationIcon(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33230, new Class[]{Activity.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33230, new Class[]{Activity.class}, Drawable.class);
        }
        com.douyin.baseshare.a shareChannel = ((IShareService) ServiceManager.get().getService(IShareService.class)).getShareChannel(activity2, ao.b());
        if (shareChannel == null) {
            return null;
        }
        return shareChannel.e();
    }

    public List<Interceptor> getSpecialNetworkInterceptor(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 33229, new Class[]{Integer.TYPE}, List.class)) {
            return new ArrayList();
        }
        return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 33229, new Class[]{Integer.TYPE}, List.class);
    }

    public void goToPrivacyActivity(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 33227, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 33227, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, PrivacyActivity.class));
    }

    public boolean isFromOpenSdk(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, changeQuickRedirect, false, 33250, new Class[]{Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2}, this, changeQuickRedirect, false, 33250, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(intent2.getStringExtra("_aweme_open_sdk_params_client_key"))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isInMyProfilePage(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 33236, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 33236, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 instanceof MainActivity) {
            return ((MainActivity) context2).getCurFragment() instanceof MyProfileFragment;
        } else {
            return false;
        }
    }

    public void onBackToOpenPlatform(Object obj) {
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 33253, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 33253, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        final w a2 = com.ss.android.ugc.aweme.opensdk.share.share.a.a(obj);
        if (com.ss.android.ugc.aweme.opensdk.share.share.a.a((c) a2)) {
            final Activity e2 = p.a().e();
            if (e2 != null) {
                if (TextUtils.isEmpty(a2.mAppName)) {
                    str = e2.getString(C0906R.string.cj7);
                } else {
                    str = a2.mAppName;
                }
                new com.ss.android.ugc.aweme.opensdk.share.a.a(e2, str, "share success", new a.C0657a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f40147a;

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f40147a, false, 33273, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f40147a, false, 33273, new Class[0], Void.TYPE);
                            return;
                        }
                        Intent intent = new Intent();
                        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                        e2.sendBroadcast(intent);
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f40147a, false, 33272, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f40147a, false, 33272, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.opensdk.share.e eVar = new com.ss.android.ugc.aweme.opensdk.share.e(e2, a2);
                        if (PatchProxy.isSupport(new Object[0], eVar, com.ss.android.ugc.aweme.opensdk.share.e.f58395a, false, 63405, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], eVar, com.ss.android.ugc.aweme.opensdk.share.e.f58395a, false, 63405, new Class[0], Void.TYPE);
                        } else if (eVar.f58397c != null) {
                            Share.Response response = new Share.Response();
                            response.errorCode = 0;
                            response.state = eVar.f58397c.mState;
                            eVar.f58396b.a((com.bytedance.sdk.account.b.c.a) eVar.f58397c, (com.bytedance.sdk.account.b.c.b) response);
                        }
                        r.a("return_to_launch_app", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("launch_from", a2.mClientKey).f34114b);
                    }
                }).show();
            }
        }
    }

    public Dialog showPrivacyDialog(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33219, new Class[]{Activity.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33219, new Class[]{Activity.class}, Dialog.class);
        }
        Intent intent = new Intent(activity2, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtras(bundle);
        intent.setData(Uri.parse("https://www.douyin.com/falcon/douyin_falcon/privacy_agreement/"));
        activity2.startActivity(intent);
        ag.i().h();
        return null;
    }

    public Dialog showProtocolDialog(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33218, new Class[]{Activity.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33218, new Class[]{Activity.class}, Dialog.class);
        }
        Intent intent = new Intent(activity2, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtras(bundle);
        intent.setData(Uri.parse("https://www.douyin.com/falcon/douyin_falcon/user_agreement/"));
        activity2.startActivity(intent);
        return null;
    }

    public void startSameCityActivity(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 33245, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 33245, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, PoiSameCityActivity.class));
    }

    public void switchToSignature(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33215, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33215, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2}, null, EditSelfBriefActivity.f61794a, true, 67960, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, EditSelfBriefActivity.f61794a, true, 67960, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (activity2 != null) {
            activity2.startActivity(new Intent(activity2, EditSelfBriefActivity.class));
        }
    }

    public AmeBaseFragment createPoiDetailFragment(com.ss.android.ugc.aweme.poi.model.l lVar) {
        com.ss.android.ugc.aweme.poi.model.l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{lVar2}, this, changeQuickRedirect, false, 33207, new Class[]{com.ss.android.ugc.aweme.poi.model.l.class}, AmeBaseFragment.class)) {
            return (AmeBaseFragment) PatchProxy.accessDispatch(new Object[]{lVar2}, this, changeQuickRedirect, false, 33207, new Class[]{com.ss.android.ugc.aweme.poi.model.l.class}, AmeBaseFragment.class);
        }
        Class<PoiDetailWithoutMapFragment> cls = PoiDetailWithoutMapFragment.class;
        try {
            if (PatchProxy.isSupport(new Object[]{lVar2, cls}, null, AbsPoiAwemeFeedFragment.f3749a, true, 65848, new Class[]{com.ss.android.ugc.aweme.poi.model.l.class, Class.class}, AbsPoiAwemeFeedFragment.class)) {
                return (AbsPoiAwemeFeedFragment) PatchProxy.accessDispatch(new Object[]{lVar2, cls}, null, AbsPoiAwemeFeedFragment.f3749a, true, 65848, new Class[]{com.ss.android.ugc.aweme.poi.model.l.class, Class.class}, AbsPoiAwemeFeedFragment.class);
            }
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("poi_bundle", lVar2);
            bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "poi_page");
            AbsPoiAwemeFeedFragment newInstance = cls.newInstance();
            newInstance.setArguments(bundle);
            return newInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public void openDouPlus(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 33208, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 33208, new Class[]{Context.class}, Void.TYPE);
        } else if (context2 != null) {
            r.a("enter_dou_plus_hot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/douyin_falcon/dou_plus/order_list/?hide_status_bar=0&status_bar_color=ffffff"));
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", false);
            intent.putExtra("status_bar_color", "FFFFFF");
            intent.putExtra("status_font_dark", true);
            intent.putExtra("bundle_webview_background", context.getResources().getColor(C0906R.color.ao4));
            context2.startActivity(intent);
        }
    }

    public com.ss.android.ugc.aweme.profile.h createThirdPartyAddFriendView(Activity activity) {
        Object accessDispatch;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 33249, new Class[]{Activity.class}, com.ss.android.ugc.aweme.profile.h.class)) {
            return (com.ss.android.ugc.aweme.profile.h) PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 33249, new Class[]{Activity.class}, com.ss.android.ugc.aweme.profile.h.class);
        }
        if (PatchProxy.isSupport(new Object[]{activity2}, null, y.f49480a, true, 47276, new Class[]{Activity.class}, ThirdPartyAddFriendView.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{activity2}, null, y.f49480a, true, 47276, new Class[]{Activity.class}, ThirdPartyAddFriendView.class);
        } else {
            y.a aVar = y.f49483d;
            if (PatchProxy.isSupport(new Object[]{activity2}, aVar, y.a.f49484a, false, 47278, new Class[]{Activity.class}, ThirdPartyAddFriendView.class)) {
                Object[] objArr = {activity2};
                y.a aVar2 = aVar;
                accessDispatch = PatchProxy.accessDispatch(objArr, aVar2, y.a.f49484a, false, 47278, new Class[]{Activity.class}, ThirdPartyAddFriendView.class);
            } else {
                Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
                View findViewById = LayoutInflater.from(activity2).inflate(C0906R.layout.ky, null, false).findViewById(C0906R.id.d2f);
                if (findViewById != null) {
                    ThirdPartyAddFriendView thirdPartyAddFriendView = (ThirdPartyAddFriendView) findViewById;
                    if (PatchProxy.isSupport(new Object[]{(byte) 0}, thirdPartyAddFriendView, ThirdPartyAddFriendView.f49381a, false, 47511, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        ThirdPartyAddFriendView thirdPartyAddFriendView2 = thirdPartyAddFriendView;
                        PatchProxy.accessDispatch(new Object[]{(byte) 0}, thirdPartyAddFriendView2, ThirdPartyAddFriendView.f49381a, false, 47511, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        thirdPartyAddFriendView.f49385e.setVisibility(8);
                    }
                    thirdPartyAddFriendView.setAddContactsFriendsClickListener(new y.a.C0587a(activity2));
                    thirdPartyAddFriendView.setAddWeChatFriendsClickListener(new y.a.b(activity2));
                    thirdPartyAddFriendView.setAddQQFriendsClickListener(new y.a.c(activity2));
                    return thirdPartyAddFriendView;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.ui.ThirdPartyAddFriendView");
            }
        }
        return (ThirdPartyAddFriendView) accessDispatch;
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$0$BridgeService(@Nullable Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (!com.ss.android.ugc.aweme.account.util.h.a("enter_from_login_ui_routine")) {
            com.ss.android.ugc.aweme.app.accountsdk.a.a.a(bundle);
        }
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$5$BridgeService(@Nullable Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle.getBoolean("need_restart", false)) {
            new Handler().postDelayed(new i(bundle), 500);
        } else {
            com.ss.android.ugc.aweme.app.accountsdk.a.a.a(bundle);
        }
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$2$BridgeService(@Nullable Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        Activity e2 = p.a().e();
        User curUser = com.ss.android.ugc.aweme.account.c.d().getCurUser();
        String string = bundle.getString("platform");
        if (e2 == null || "mobile".equalsIgnoreCase(string) || curUser == null || bundle.getBoolean("block_bind_phone", false) || curUser.isPhoneBinded() || bundle.getBoolean("only_login", false) || !AbTestManager.a().d().isdBindPhoneAfterThirdPartyLogin()) {
            com.ss.android.ugc.aweme.app.accountsdk.a.a.a(bundle);
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean(com.ss.android.ugc.aweme.account.login.f.f32228e, true);
        m keepCallback = com.ss.android.ugc.aweme.account.c.c().keepCallback();
        keepCallback.bindMobile(e2, "third_party_" + string, bundle3, new j(bundle));
    }

    public void addSpecialNetworkInterceptor(OkHttpClient.Builder builder, int i) {
        OkHttpClient.Builder builder2 = builder;
        if (PatchProxy.isSupport(new Object[]{builder2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33228, new Class[]{OkHttpClient.Builder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{builder2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33228, new Class[]{OkHttpClient.Builder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.g.a.a()) {
            builder2.addNetworkInterceptor(new OKHttpSwitchInterceptor());
            builder2.addInterceptor(new OKHttpSwitchInterceptor());
        }
    }

    public void enterPoiRankActivity(Context context, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, bundle2}, this, changeQuickRedirect, false, 33209, new Class[]{Context.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bundle2}, this, changeQuickRedirect, false, 33209, new Class[]{Context.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PoiRankListActivity.class);
        intent.putExtras(bundle2);
        context2.startActivity(intent);
    }

    public com.ss.android.ugc.aweme.discover.base.c getDiscoverFragment(DiscoverFragment.a aVar, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 33240, new Class[]{DiscoverFragment.a.class, Boolean.TYPE}, com.ss.android.ugc.aweme.discover.base.c.class)) {
            return DiscoverFragment.a(aVar, z);
        }
        return (com.ss.android.ugc.aweme.discover.base.c) PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 33240, new Class[]{DiscoverFragment.a.class, Boolean.TYPE}, com.ss.android.ugc.aweme.discover.base.c.class);
    }

    public Intent getWebUriIntent(Context context, Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (!PatchProxy.isSupport(new Object[]{context2, uri2}, this, changeQuickRedirect, false, 33235, new Class[]{Context.class, Uri.class}, Intent.class)) {
            return com.ss.android.ugc.aweme.app.f.f34171e.a(context2, uri2);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context2, uri2}, this, changeQuickRedirect, false, 33235, new Class[]{Context.class, Uri.class}, Intent.class);
    }

    public boolean isOutOfChina(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, changeQuickRedirect, false, 33213, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, changeQuickRedirect, false, 33213, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!CoordinateConverter.isAMapDataAvailable(d2, d3)) {
            return true;
        } else {
            return false;
        }
    }

    public void jumpToH5(String str, Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str, context2}, this, changeQuickRedirect, false, 33261, new Class[]{String.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, context2}, this, changeQuickRedirect, false, 33261, new Class[]{String.class, Context.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        context2.startActivity(intent);
    }

    public void openPoiCouponScopeActivity(Context context, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, bundle2}, this, changeQuickRedirect, false, 33211, new Class[]{Context.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bundle2}, this, changeQuickRedirect, false, 33211, new Class[]{Context.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PoiCouponScopeActivity.class);
        intent.putExtras(bundle2);
        context2.startActivity(intent);
    }

    public void openPoiFilterDetailActivity(Context context, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, bundle2}, this, changeQuickRedirect, false, 33210, new Class[]{Context.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bundle2}, this, changeQuickRedirect, false, 33210, new Class[]{Context.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PoiTypeFilterDetailActivity.class);
        intent.putExtras(bundle2);
        context2.startActivity(intent);
    }

    public Dialog requestContactsPermissionAfterBindMobile(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, changeQuickRedirect, false, 33233, new Class[]{Context.class, String.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, changeQuickRedirect, false, 33233, new Class[]{Context.class, String.class}, Dialog.class);
        } else if (cb.a()) {
            return new cb(context2, str2);
        } else {
            return null;
        }
    }

    public void handleOpenSdk(Intent intent, IBridgeService.a aVar) {
        IBridgeService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{intent, aVar2}, this, changeQuickRedirect, false, 33251, new Class[]{Intent.class, IBridgeService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent, aVar2}, this, changeQuickRedirect, false, 33251, new Class[]{Intent.class, IBridgeService.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.opensdk.share.base.a a2 = com.ss.android.ugc.aweme.opensdk.share.c.a(intent);
        if (a2 != null) {
            if (a2 instanceof DYVideoObject) {
                ArrayList<String> arrayList = ((DYVideoObject) a2).mVideoPaths;
                if (arrayList != null) {
                    aVar2.a(arrayList);
                } else {
                    return;
                }
            } else if (a2 instanceof DYImageObject) {
                ArrayList<String> arrayList2 = ((DYImageObject) a2).mImagePaths;
                if (arrayList2 != null) {
                    aVar2.b(arrayList2);
                } else {
                    return;
                }
            }
            if (a2 instanceof TikTokVideoObject) {
                ArrayList<String> arrayList3 = ((TikTokVideoObject) a2).mVideoPaths;
                if (arrayList3 != null) {
                    aVar2.a(arrayList3);
                    return;
                }
                return;
            }
            if (a2 instanceof TikTokImageObject) {
                ArrayList<String> arrayList4 = ((TikTokImageObject) a2).mImagePaths;
                if (arrayList4 != null) {
                    aVar2.b(arrayList4);
                }
            }
        }
    }

    public void initMiniAppInDeeplink(Context context, Uri uri) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, uri}, this, changeQuickRedirect, false, 33259, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri}, this, changeQuickRedirect, false, 33259, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("snssdk1128://mini_app", uri.toString())) {
            a.i.a((Callable<TResult>) new h<TResult>(context2), (Executor) a.i.f1051a);
        }
        if (!TextUtils.equals("snssdk1128://mini_app", uri.toString())) {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.commercialize.utils.y.f39839a, true, 32518, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.commercialize.utils.y.f39839a, true, 32518, new Class[0], Void.TYPE);
                return;
            }
            Aweme aweme = com.ss.android.ugc.aweme.commercialize.utils.y.f39840b;
            if (aweme != null) {
                Context a2 = com.ss.android.ugc.aweme.base.utils.d.a();
                if (PatchProxy.isSupport(new Object[]{a2, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31543, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{a2, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31543, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.commercialize.log.g.a(a2, "landing_ad", "landing_open_url_appback", aweme, com.ss.android.ugc.aweme.commercialize.log.g.f(a2, aweme, "raw ad landing_open_url_appback"));
            }
        }
    }

    public Dialog showMobileProtocolDialog(Activity activity, boolean z) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 33237, new Class[]{Activity.class, Boolean.TYPE}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{activity2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 33237, new Class[]{Activity.class, Boolean.TYPE}, Dialog.class);
        }
        Intent intent = new Intent(activity2, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtras(bundle);
        if (z) {
            intent.setData(Uri.parse("https://wap.cmpassport.com/resources/html/contract.html"));
        } else {
            intent.setData(Uri.parse("https://e.189.cn/sdk/agreement/detail.do?hidetop=true"));
        }
        activity2.startActivity(intent);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.ss.android.ugc.aweme.mobile.a.b$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void lambda$getAfterLoginActions$3$BridgeService(@android.support.annotation.Nullable android.os.Bundle r19, android.os.Bundle r20) {
        /*
            if (r20 != 0) goto L_0x0005
            r0 = r19
            goto L_0x0007
        L_0x0005:
            r0 = r20
        L_0x0007:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.c.d()
            boolean r1 = r1.isNewUser()
            if (r1 == 0) goto L_0x010e
            java.lang.String r1 = "show_fill_detail"
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x010e
            com.ss.android.ugc.aweme.app.p r1 = com.ss.android.ugc.aweme.app.p.a()
            android.app.Activity r1 = r1.e()
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r1
            r4[r2] = r0
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.mobile.f.f56101a
            r7 = 1
            r8 = 59700(0xe934, float:8.3658E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r10 = android.app.Activity.class
            r9[r11] = r10
            java.lang.Class<android.os.Bundle> r10 = android.os.Bundle.class
            r9[r2] = r10
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0063
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r11] = r1
            r12[r2] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.mobile.f.f56101a
            r15 = 1
            r16 = 59700(0xe934, float:8.3658E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r0[r2] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0111
        L_0x0063:
            if (r1 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.mobile.a.b$a r1 = com.ss.android.ugc.aweme.mobile.a.b.a.a((android.app.Activity) r1)
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r4 = r4.T()
            if (r4 != r2) goto L_0x007c
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r4 = com.ss.android.ugc.aweme.bridgeservice.a.a()
            java.lang.Class r4 = r4.fillProfileActivityV2()
            goto L_0x007e
        L_0x007c:
            java.lang.Class<com.ss.android.ugc.aweme.mobile.EditProfileActivityV2> r4 = com.ss.android.ugc.aweme.mobile.EditProfileActivityV2.class
        L_0x007e:
            com.ss.android.ugc.aweme.mobile.a.b$a r1 = r1.a((java.lang.Class<? extends android.app.Activity>) r4)
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.mobile.a.b.a.f56081a
            r15 = 0
            r16 = 59725(0xe94d, float:8.3693E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.mobile.a.b$a> r18 = com.ss.android.ugc.aweme.mobile.a.b.a.class
            r13 = r1
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x00c1
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.mobile.a.b.a.f56081a
            r15 = 0
            r16 = 59725(0xe94d, float:8.3693E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.mobile.a.b$a> r18 = com.ss.android.ugc.aweme.mobile.a.b.a.class
            r13 = r1
            r17 = r4
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.mobile.a.b$a r1 = (com.ss.android.ugc.aweme.mobile.a.b.a) r1
            goto L_0x00c3
        L_0x00c1:
            r1.f56082b = r3
        L_0x00c3:
            java.lang.String r12 = "login_action_bundle"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r12
            r4[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.mobile.a.b.a.f56081a
            r7 = 0
            r8 = 59728(0xe950, float:8.3697E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r9[r2] = r5
            java.lang.Class<com.ss.android.ugc.aweme.mobile.a.b$a> r10 = com.ss.android.ugc.aweme.mobile.a.b.a.class
            r5 = r1
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0105
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r12
            r4[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.mobile.a.b.a.f56081a
            r7 = 0
            r8 = 59728(0xe950, float:8.3697E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r9[r11] = r0
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r9[r2] = r0
            java.lang.Class<com.ss.android.ugc.aweme.mobile.a.b$a> r10 = com.ss.android.ugc.aweme.mobile.a.b.a.class
            r5 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            r1 = r0
            com.ss.android.ugc.aweme.mobile.a.b$a r1 = (com.ss.android.ugc.aweme.mobile.a.b.a) r1
            goto L_0x010a
        L_0x0105:
            android.os.Bundle r2 = r1.f56083c
            r2.putBundle(r12, r0)
        L_0x010a:
            r1.a()
        L_0x010d:
            return
        L_0x010e:
            com.ss.android.ugc.aweme.app.accountsdk.a.a.a(r0)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.BridgeService.lambda$getAfterLoginActions$3$BridgeService(android.os.Bundle, android.os.Bundle):void");
    }

    public void jumpToH5(String str, Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{str, context, intent}, this, changeQuickRedirect, false, 33262, new Class[]{String.class, Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, context, intent}, this, changeQuickRedirect, false, 33262, new Class[]{String.class, Context.class, Intent.class}, Void.TYPE);
            return;
        }
        context.startActivity(intent);
    }

    public LinearLayout createFollowFeedEmptyHeadView(Activity activity, String str, com.ss.android.ugc.aweme.profile.h hVar) {
        Object accessDispatch;
        Activity activity2 = activity;
        String str2 = str;
        com.ss.android.ugc.aweme.profile.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, hVar2}, this, changeQuickRedirect, false, 33248, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.profile.h.class}, LinearLayout.class)) {
            return (LinearLayout) PatchProxy.accessDispatch(new Object[]{activity2, str2, hVar2}, this, changeQuickRedirect, false, 33248, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.profile.h.class}, LinearLayout.class);
        }
        if (PatchProxy.isSupport(new Object[]{activity2, str2, hVar2}, null, y.f49480a, true, 47275, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.profile.h.class}, LinearLayout.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{activity2, str2, hVar2}, null, y.f49480a, true, 47275, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.profile.h.class}, LinearLayout.class);
        } else {
            y.a aVar = y.f49483d;
            if (PatchProxy.isSupport(new Object[]{activity2, str2, hVar2}, aVar, y.a.f49484a, false, 47277, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.profile.h.class}, LinearLayout.class)) {
                accessDispatch = PatchProxy.accessDispatch(new Object[]{activity2, str2, hVar2}, aVar, y.a.f49484a, false, 47277, new Class[]{Activity.class, String.class, com.ss.android.ugc.aweme.profile.h.class}, LinearLayout.class);
            } else {
                Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
                Intrinsics.checkParameterIsNotNull(str2, "mTabType");
                Intrinsics.checkParameterIsNotNull(hVar2, "addFriendView");
                Context context = activity2;
                View inflate = LayoutInflater.from(context).inflate(C0906R.layout.ml, null, false);
                if (inflate != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    TextView textView = (TextView) linearLayout.findViewById(C0906R.id.a9v);
                    CharSequence charSequence = str2;
                    if (TextUtils.equals(charSequence, "extra_follow_type_friend")) {
                        textView.setText(C0906R.string.bhc);
                    } else if (TextUtils.equals(charSequence, "extra_follow_type_follow")) {
                        textView.setText(C0906R.string.bha);
                    }
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    linearLayout2.addView(linearLayout);
                    ViewParent parent = ((ThirdPartyAddFriendView) hVar2).getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView((View) hVar2);
                    }
                    linearLayout2.addView((View) hVar2);
                    return linearLayout2;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        }
        return (LinearLayout) accessDispatch;
    }

    static final /* synthetic */ void lambda$null$1$BridgeService(Bundle bundle, int i, int i2, Object obj) {
        bundle.putBoolean("show_fill_detail", false);
        com.ss.android.ugc.aweme.app.accountsdk.a.a.a(bundle);
    }

    public void onReturnThirdPlatformFailed(Activity activity, w wVar, String str, int i) {
        Activity activity2;
        w wVar2 = wVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity, wVar2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33257, new Class[]{Activity.class, w.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, wVar2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33257, new Class[]{Activity.class, w.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (activity == null) {
            activity2 = p.a().e();
        } else {
            activity2 = activity;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) activity2, (int) C0906R.string.bt4, 0).a();
        new com.ss.android.ugc.aweme.opensdk.share.e(activity2, wVar2).a(str2, i);
    }

    public Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2) {
        Context context2 = context;
        String str3 = str2;
        if (!PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2), str, str3}, this, changeQuickRedirect, false, 33222, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Intent.class)) {
            return FindFriendsJediFragment.a(context2, i, i2, str3);
        }
        Object[] objArr = {context2, Integer.valueOf(i), Integer.valueOf(i2), str, str3};
        return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 33222, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Intent.class);
    }

    public String getDistanceBetweenLocations(Context context, double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{context, Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 33212, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, changeQuickRedirect, false, 33212, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class);
        }
        double[] a2 = com.ss.android.ugc.aweme.poi.e.c.a(d2, d3);
        double d6 = a2[0];
        double d7 = a2[1];
        if (!PatchProxy.isSupport(new Object[]{context, Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d4), Double.valueOf(d5)}, null, com.ss.android.ugc.aweme.poi.e.c.f59776a, true, 66792, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class)) {
            return com.ss.android.ugc.aweme.poi.e.c.a(context, d6, d7, d4, d5);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context, Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d4), Double.valueOf(d5)}, null, com.ss.android.ugc.aweme.poi.e.c.f59776a, true, 66792, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class);
    }

    public AwemeListFragment createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 33232, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, AwemeListFragment.class)) {
            return AwemeListFragment.a(i, i2, str, str2, z, z2);
        }
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2, Byte.valueOf(z), Byte.valueOf(z2)};
        return (AwemeListFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 33232, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, AwemeListFragment.class);
    }
}
