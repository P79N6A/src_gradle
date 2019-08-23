package com.ss.android.ugc.aweme.bridgeservice;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.discover.ui.DiscoverFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.festival.christmas.c.c;
import com.ss.android.ugc.aweme.festival.christmas.c.g;
import com.ss.android.ugc.aweme.festival.christmas.c.l;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.BindAccountView;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.profile.ui.bs;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.o;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.util.ArrayList;
import java.util.List;

public interface IBridgeService {

    public interface a {
        void a(ArrayList<String> arrayList);

        void b(ArrayList<String> arrayList);
    }

    void afterLogIn();

    void afterLogOut();

    void afterSwitchAccount();

    void checkContentDialogNeedShow(Context context);

    w checkShareContextWhenPublish(Object obj);

    void checkShowFiveStarDialog(Activity activity);

    void checkToTransformMusDraft();

    AwemeListFragment createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    AppCompatDialog createChristmasEcardDialog(AbsActivity absActivity, l lVar, Aweme aweme, c cVar, String str);

    ProfileListFragment createCollectGoodsFragment();

    ProfileListFragment createCollectPoiFragment();

    LinearLayout createFollowFeedEmptyHeadView(Activity activity, String str, h hVar);

    AmeBaseFragment createMyProfileFragment();

    AmeBaseFragment createPoiDetailFragment(com.ss.android.ugc.aweme.poi.model.l lVar);

    Fragment createPublishDialogFragment();

    com.ss.android.ugc.aweme.newfollow.a createRecommendListPresenter();

    AppCompatDialog createShareDonationDialog(Activity activity, g gVar, int i, com.ss.android.ugc.aweme.festival.christmas.b.a aVar, String str);

    h createThirdPartyAddFriendView(Activity activity);

    s createUploadSuccessPopupWindow(Activity activity);

    ProfileEditFragment createUserProfileEditFragment();

    AmeBaseFragment createUserProfileFragment();

    boolean disableSyncShareCookieHost();

    void enterMyFavorites(Activity activity);

    void enterPoiRankActivity(Context context, Bundle bundle);

    Class<? extends Activity> fillProfileActivityV2();

    void followOnInstagram(Context context, String str);

    void followOnYoutube(Context context, String str);

    Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2);

    String getAdvertisingIdOb();

    List<com.ss.android.ugc.aweme.account.util.a> getAfterLoginActions(@Nullable Bundle bundle);

    String getAndroidId();

    SQLiteDatabase getAppOpenReadDB();

    List<c.d> getDeeplinkCommands();

    com.ss.android.ugc.aweme.discover.base.c getDiscoverFragment(DiscoverFragment.a aVar, boolean z);

    String getDistanceBetweenLocations(Context context, double d2, double d3, double d4, double d5);

    Class<? extends Activity> getHeaderDetailActivity();

    boolean getInterestSelectShowed();

    String getLocalLanguage(Context context);

    Intent getMainActivityIntent(Context context);

    Fragment getNearbyFragment();

    Fragment getPoiTypeFeedsFragment();

    @LayoutRes
    int getPrivateAccountTipLayoutRes();

    String getReportUrl();

    Class<? extends Activity> getSettingActivityClass();

    o getSettingManager();

    com.ss.android.ugc.aweme.global.config.settings.a getSettingsWatcher();

    @Nullable
    Drawable getShareGuideAnimationIcon(Activity activity);

    @DrawableRes
    int getShareIconResource();

    List<Interceptor> getSpecialNetworkInterceptor(int i);

    Class<? extends AmeBaseActivity> getSubmitFeedbackActivity();

    Dialog getUserRetainLoadingDialog(Context context);

    void getUserSettings();

    int getVideoViewDownloadItemIcon();

    Intent getWebUriIntent(Context context, Uri uri);

    void goToPrivacyActivity(Context context);

    void handleOpenSdk(Intent intent, a aVar);

    boolean havePGCShow();

    void hideFestivalWidget(MainFragment mainFragment);

    void increaseViewedCount(boolean z);

    void initMiniAppInDeeplink(Context context, Uri uri);

    boolean isClientKeyValid(w wVar);

    boolean isFestivalWidgetVisible(MainFragment mainFragment);

    boolean isFocusOnVideoTime();

    boolean isFromOpenSdk(Intent intent);

    boolean isHaveLatestTab();

    int isInterestOrWelcomeShowing();

    boolean isNeedDetailBgCover();

    boolean isOutOfChina(double d2, double d3);

    boolean isStartWelcomeScreenActivity(Activity activity);

    boolean isThisMusicIsBaned(Music music);

    boolean isUploadContactsNoticeDialogShowing();

    boolean isUserRetainRefresh();

    boolean judgeIsPolarisUrl(String str);

    void jumpToH5(String str, Context context);

    void jumpToH5(String str, Context context, Intent intent);

    Class<? extends Activity> microAppActivity();

    boolean needCallbackOnActivityResumed(Activity activity);

    boolean needCheckCopyright();

    boolean needCheckPrivateAccountBeforePlay(User user);

    boolean needLiveInRecord();

    void onBackToOpenPlatform(Object obj);

    void onFeedStop();

    void onReturnThirdPlatformFailed(Activity activity, w wVar, String str, int i);

    void openAgreement(@NonNull Activity activity, @NonNull String str, boolean z, @NonNull String str2);

    void openDouPlus(Context context);

    void openLanguageTestDialog(Context context);

    void openPoiCouponScopeActivity(Context context, Bundle bundle);

    void openPoiFilterDetailActivity(Context context, Bundle bundle);

    void openWallet(Activity activity);

    void readTaskPlayerCycle(int i, boolean z);

    Dialog requestContactsPermissionAfterBindMobile(Context context, String str);

    void requestLocationPermissions(Activity activity, a.C0792a aVar);

    void setCustomStatusBarInLayout(Activity activity);

    void setHasActive();

    void setHasShowToutiaoLink(BindAccountView bindAccountView);

    void setStatusBar(Activity activity);

    void setStatusBar(Activity activity, View view);

    void showLinkAccountDialog(FragmentManager fragmentManager, String str, bs bsVar);

    Dialog showPrivacyDialog(Activity activity);

    Dialog showProtocolDialog(Activity activity);

    void startSameCityActivity(Context context);

    void switchToSignature(Activity activity);

    void trackAppsFlyerEvent(String str, String str2);

    boolean tryOpenPolarisPage(Context context, String str);

    void tryRefreshLocation(Context context);

    void trySetJumpToFissionH5(String str);

    void tryShowMoneyGrowthDialog(Context context);

    boolean tryStartShareScreenShotActivity(Context context, String str);

    void updateTTAbTest(AbTestModel abTestModel);

    void videoViewHolderBindDownloadWidget(@NonNull WidgetManager widgetManager);
}
