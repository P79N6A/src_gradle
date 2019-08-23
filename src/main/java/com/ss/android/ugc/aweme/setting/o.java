package com.ss.android.ugc.aweme.setting;

import a.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.business.Business;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.utils.s;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.link.f;
import com.ss.android.ugc.aweme.commercialize.utils.p;
import com.ss.android.ugc.aweme.feed.ar;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.c.h;
import com.ss.android.ugc.aweme.profile.model.UrlModelWrap;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.bs;
import com.ss.android.ugc.aweme.video.c;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

@Deprecated
public abstract class o implements WeakHandler.IHandler, g {

    /* renamed from: a  reason: collision with root package name */
    private static o f63992a = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSettingManager();

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63993c;

    /* renamed from: d  reason: collision with root package name */
    protected SettingApi f63994d = ((SettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SettingApi.class));

    /* renamed from: e  reason: collision with root package name */
    protected WeakHandler f63995e = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: f  reason: collision with root package name */
    public AwemeSettings.GlobalTips f63996f;
    public boolean g;
    public String h;
    protected List<a> i = new ArrayList();

    public interface a {
        void a(AwemeSettings awemeSettings);
    }

    public static o a() {
        return f63992a;
    }

    public final void a(final AwemeSettings awemeSettings) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{awemeSettings}, this, f63993c, false, 72069, new Class[]{AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettings}, this, f63993c, false, 72069, new Class[]{AwemeSettings.class}, Void.TYPE);
        } else if (awemeSettings != null) {
            i.a((Callable<TResult>) new q<TResult>(this, awemeSettings));
            n.a(awemeSettings.syncToTT);
            n.a(awemeSettings.enablePassportService);
            n.b(awemeSettings.enableEmailLogin);
            SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
            a(edit, awemeSettings);
            SharePrefCache.inst().getDeviceMonitor().b(edit, Boolean.valueOf(awemeSettings.deviceMonitor));
            SharePrefCache.inst().getLiveSkylightShowAnimation().b(edit, Boolean.valueOf(awemeSettings.liveSkylightShowAnimation));
            SharePrefCache.inst().getIsUseTongdunSdk().b(edit, Boolean.valueOf(awemeSettings.isUseTongdunSdk));
            SharePrefCache.inst().getIsUseBackRefresh().b(edit, Boolean.valueOf(awemeSettings.isUseBackRefresh));
            SharePrefCache.inst().getShowTimeLineTab().b(edit, Boolean.valueOf(awemeSettings.isShowTimeLineTab()));
            SharePrefCache.inst().getHttpRetryCount().b(edit, Integer.valueOf(awemeSettings.httpRetryCount));
            if (awemeSettings.sp != null && !TextUtils.isEmpty(awemeSettings.sp.estr)) {
                SharePrefCache.inst().getEstr().b(edit, awemeSettings.sp.estr);
            }
            SharePrefCache.inst().getTTRoute().b(edit, Boolean.valueOf(awemeSettings.ttRoute));
            SharePrefCache.inst().getTTRegion().b(edit, Boolean.valueOf(awemeSettings.ttRegion));
            SharePrefCache.inst().getVideoPreload().b(edit, Boolean.valueOf(awemeSettings.getNeedPreLoad()));
            SharePrefCache.inst().getAdDisplayTimemit().b(edit, Integer.valueOf(awemeSettings.adDisplayTime));
            SharePrefCache.inst().getHardEncode().b(edit, Integer.valueOf(awemeSettings.useHardcode));
            SharePrefCache.inst().getIsShowNearBy().b(edit, Boolean.valueOf(awemeSettings.isShowNearByTab));
            SharePrefCache.inst().getShiledMusicSDK().b(edit, Boolean.valueOf(awemeSettings.shieldMusicSDK));
            SharePrefCache.inst().getNewAnchorShowBubble().b(edit, Boolean.valueOf(awemeSettings.newAnchorShowBubble));
            SharePrefCache.inst().getUseSyntheticHardcode().b(edit, Integer.valueOf(awemeSettings.useSyntheticHardcode));
            SharePrefCache.inst().getIsChangeFollowTab().b(edit, Boolean.valueOf(awemeSettings.isChangeFollowTab()));
            SharePrefCache.inst().getLiveDefaultBitrate().b(edit, Integer.valueOf(awemeSettings.liveDefaultBitrate));
            SharePrefCache.inst().getLiveMaxBitrate().b(edit, Integer.valueOf(awemeSettings.liveMaxBitrate));
            SharePrefCache.inst().getLiveMinBitrate().b(edit, Integer.valueOf(awemeSettings.liveMinBitrate));
            x.a().D().b(edit, Integer.valueOf(awemeSettings.picQrcodeRecognitionSwitch));
            x.a().E().b(edit, Boolean.valueOf(awemeSettings.selfSeeWaterMarkSwitch));
            x.a().F().b(edit, Boolean.valueOf(awemeSettings.enableEmailLogin));
            x.a().G().b(edit, Boolean.valueOf(awemeSettings.enablePassportService));
            x.a().am().a(awemeSettings.selfProfileLandingTabs);
            x.a().an().a(awemeSettings.otherProfileLandingTabs);
            SharePrefCache.inst().getBeautyModelItem().b(edit, Integer.valueOf(awemeSettings.beautyModel));
            x.a().M().b(edit, Boolean.valueOf(awemeSettings.canDuet));
            SharePrefCache.inst().isOb().b(edit, Boolean.valueOf(awemeSettings.isOb));
            SharePrefCache.inst().isNpthEnable().b(edit, Boolean.valueOf(awemeSettings.isNpthEnable));
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "enable_home_scan_qrcode", awemeSettings.enableHomeScanQrCode);
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "awe_network_x_token_disabled", awemeSettings.aweNetworkXTokenDisabled);
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "enable_fancy_qrcode", awemeSettings.enableFancyQrcode);
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "enable_read_fancy_qrcode", awemeSettings.enableReadFancyQrcode);
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "enable_share_qrcode_h5_as_image", awemeSettings.getSharePictureDirect());
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "disable_iid_in_share_url", awemeSettings.disableIidInShareUrl);
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "disable_ucode_in_share_url", awemeSettings.disableUCodeInShareUrl);
            SharePrefCache.inst().getSearchTabIndex().b(edit, awemeSettings.getSearchTabIndex());
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "i18n_third_login_strategy", (Object) awemeSettings.i18nThridLoginSetting);
            b.b().a(com.ss.android.ugc.aweme.app.i.a().getContext(), "enable_twitter_new_key_secret", awemeSettings.enableTwitterNewKeySecret);
            if (awemeSettings.verifyExceed > 0) {
                SharePrefCache.inst().getVerifyExceed().b(edit, Integer.valueOf(awemeSettings.verifyExceed));
            }
            SharePrefCache.inst().getOriginalMusicianEntry().b(edit, Boolean.valueOf(awemeSettings.showOriginalMusicianEntry));
            SharePrefCache.inst().getMusicianShowType().b(edit, Integer.valueOf(awemeSettings.musicianShowType));
            SharePrefCache.inst().getAtFriendsShowType().b(edit, Integer.valueOf(awemeSettings.atFriendsShowType));
            SharePrefCache.inst().getOriginalMusiciaShareStyle().b(edit, Boolean.valueOf(awemeSettings.originalMusicianShare));
            SharePrefCache.inst().getOrginalMusicianUrl().b(edit, awemeSettings.orginalMusicianUrl);
            SharePrefCache.inst().getStickerArtlistUrl().b(edit, awemeSettings.stickerArtistUrl);
            SharePrefCache.inst().getStickerArtEntry().b(edit, Boolean.valueOf(awemeSettings.stickerArtistEntry));
            SharePrefCache.inst().getUseNewDouyinSaftyCenter().b(edit, Integer.valueOf(awemeSettings.useNewDouyinSaftyCenter));
            SharePrefCache.inst().getJsActlogUrl().b(edit, awemeSettings.jsActLogUrl);
            SharePrefCache.inst().getSyncTT().b(edit, Integer.valueOf(awemeSettings.syncToTT));
            SharePrefCache.inst().getSyncToTTUrl().b(edit, awemeSettings.syncToTTUrl);
            SharePrefCache.inst().getCanIm().b(edit, Integer.valueOf(awemeSettings.canIm));
            SharePrefCache.inst().getCanImSendPic().b(edit, Integer.valueOf(awemeSettings.canImSendPic));
            SharePrefCache.inst().getIsForceHttps().b(edit, Integer.valueOf(awemeSettings.isForceHttps));
            SharePrefCache.inst().getShowInteractionStickers().b(edit, Boolean.valueOf(awemeSettings.showInteractionStickers));
            SharePrefCache.inst().getRemoveFollowerSwitch().b(edit, Boolean.valueOf(awemeSettings.removeFollowerSwitch));
            if (awemeSettings.publishSyncDuoshanAllConfig != null) {
                if (awemeSettings.publishSyncDuoshanAllConfig.f73641a != null) {
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintTitle().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73641a.f73643a);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintContent().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73641a.f73644b);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Str().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73641a.f73645c);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Url().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73641a.f73646d);
                }
                if (awemeSettings.publishSyncDuoshanAllConfig.f73642b != null) {
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintTitle().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73642b.f73643a);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintContent().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73642b.f73644b);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Str().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73642b.f73645c);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Url().b(edit, awemeSettings.publishSyncDuoshanAllConfig.f73642b.f73646d);
                }
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).setFontTypeList(awemeSettings.storyFontDataList);
            SharePrefCache.inst().getStoryInfoStickerMaxCount().b(edit, Integer.valueOf(awemeSettings.infoStickerMaxCount));
            SharePrefCache.inst().getStoryTextStickerMaxCount().b(edit, Integer.valueOf(awemeSettings.textStickerMaxCount));
            if (awemeSettings.shareUrlWhiteList != null) {
                x.a().k().b(edit, new HashSet(Arrays.asList(awemeSettings.shareUrlWhiteList.getLongWhiteList())));
                x.a().u().b(edit, new HashSet(Arrays.asList(awemeSettings.shareUrlWhiteList.getShortWhiteList())));
            }
            if (awemeSettings.ttplayerBufferDuration > 0) {
                x.a().S().b(edit, Integer.valueOf(awemeSettings.ttplayerBufferDuration));
            }
            if (awemeSettings.share_h5_url_whitelist != null) {
                x.a().v().b(edit, new HashSet(awemeSettings.share_h5_url_whitelist));
            }
            x.a().T().b(edit, Integer.valueOf(awemeSettings.enableIJKHardwarePlayer));
            NetworkUtils.setIsForceHttps(awemeSettings.isForceHttps);
            SharePrefCache.inst().getImCommentForwardEnabledItem().b(edit, Boolean.valueOf(awemeSettings.imCommentForwardEnabled));
            com.ss.android.ugc.aweme.ug.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63997a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f63997a, false, 72073, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f63997a, false, 72073, new Class[0], Void.TYPE);
                        return;
                    }
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).initVideoRecordConfig();
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).initVideoImportConfig();
                }
            });
            SharePrefCache.inst().getDownloadForbiddenToast().b(edit, awemeSettings.downloadForbiddenToast);
            x.a().U().b(edit, awemeSettings.downloadCheckStatus);
            AwemeSettings.ShowCreatorLicense showCreatorLicense = awemeSettings.showCreatorLicense;
            if (showCreatorLicense != null) {
                SharePrefCache.inst().getPromoteDialogShouldShow().b(edit, Boolean.valueOf(showCreatorLicense.show != 0));
                SharePrefCache.inst().getPromoteDialogPopupTimesLimit().b(edit, Integer.valueOf(showCreatorLicense.timeLimit));
                SharePrefCache.inst().getPromoteDialogPopupPopupTitle().b(edit, showCreatorLicense.title);
                SharePrefCache.inst().getPromoteDialogPopupPopupMsg().b(edit, showCreatorLicense.msg);
                SharePrefCache.inst().getPromoteDialogPopupPopupContent().b(edit, showCreatorLicense.content);
                SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().b(edit, showCreatorLicense.linkText);
                SharePrefCache.inst().getPromoteDialogPopupPopupUrl().b(edit, showCreatorLicense.url);
                SharePrefCache.inst().getPromoteDialogPopupClickType().b(edit, Integer.valueOf(showCreatorLicense.clickType));
            }
            x.a().y().a(Integer.valueOf(awemeSettings.privatePermission));
            x.a().al().a(awemeSettings.getDislikeReasons());
            SharePrefCache.inst().getPrivacyDownloadSetting().b(edit, Integer.valueOf(awemeSettings.enablePrivacyDownloadSetting));
            SharePrefCache.inst().getIsShowAllowDownloadTipSetting().b(edit, Boolean.valueOf(awemeSettings.showAllowDownloadTip));
            SharePrefCache.inst().getIsUseTTnet().b(edit, Boolean.valueOf(awemeSettings.isUseTTnet));
            SharePrefCache.inst().getShowHashTagBg().b(edit, Integer.valueOf(awemeSettings.showHashTagBg));
            SharePrefCache.inst().getCanCreateInsights().b(edit, Boolean.valueOf(awemeSettings.canInsights));
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63999a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f63999a, false, 72074, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f63999a, false, 72074, new Class[0], Void.TYPE);
                        return;
                    }
                    o.this.b(awemeSettings);
                }
            });
            AwemeSettings.GeckoConfig geckoConfig = awemeSettings.mGeckoConfig;
            if (geckoConfig != null && !CollectionUtils.isEmpty(geckoConfig.mInitChannels)) {
                bs.a(geckoConfig.mInitChannels);
                SharePrefCache.inst().getGeckoChannels().b(edit, new HashSet(geckoConfig.mInitChannels));
                SharePrefCache.inst().getUseNewPackageNow().b(edit, Boolean.valueOf(geckoConfig.useNewPackageNow));
                if (geckoConfig.rnContextCreateTimeOut > 0) {
                    SharePrefCache.inst().getRnContextCreateTimeout().b(edit, Integer.valueOf(geckoConfig.rnContextCreateTimeOut));
                }
                SharePrefCache.inst().getRnPreloadContextOn().b(edit, Boolean.valueOf(geckoConfig.rnPreloadContextOn));
                SharePrefCache.inst().getRnSnapshotOn().b(edit, Boolean.valueOf(geckoConfig.rnSnapShotOn));
            }
            for (a aVar : new CopyOnWriteArrayList(this.i)) {
                if (aVar != null) {
                    aVar.a(awemeSettings);
                }
            }
            this.i.clear();
            x.a().z().b(edit, Boolean.valueOf(awemeSettings.splashImageCenter));
            x.a().A().b(edit, Boolean.valueOf(awemeSettings.splashVideoCenter));
            x.a().B().b(edit, Boolean.valueOf(awemeSettings.splashSupportTimeOut));
            SharePrefCache.inst().getDownloadMicroApp().b(edit, Integer.valueOf(awemeSettings.downloadMicroApp));
            x.a().Y().b(edit, Boolean.valueOf(awemeSettings.avatarDecorationEnabled));
            SharePrefCache.inst().getFollowNoticeCloseTime().b(edit, Long.valueOf(awemeSettings.noticeCloseTime));
            SharePrefCache.inst().getMiniAppLabelTitle().b(edit, awemeSettings.labTitle);
            SharePrefCache.inst().getPrivacyReminderH5Url().b(edit, awemeSettings.privacyReminder);
            AwemeSettings.HotSearchDisplay hotSearchDisplay = awemeSettings.hotSearchDisplay;
            if (hotSearchDisplay != null) {
                SharePrefCache.inst().getNormalGuideDisplayTimes().b(edit, Integer.valueOf(hotSearchDisplay.normalGuideDisplayTimes));
                SharePrefCache.inst().getNormalGuideDisplayTimeIntervals().b(edit, Long.valueOf(hotSearchDisplay.normalGuideDisplayTimeIntervals * 1000));
                SharePrefCache.inst().getOperationGuideDisplayTimes().b(edit, Integer.valueOf(hotSearchDisplay.operationGuideDisplayTimes));
                SharePrefCache.inst().getOperationGuideDisplayTimeIntervals().b(edit, Long.valueOf(hotSearchDisplay.operationGuideDisplayTimeIntervals * 1000));
            }
            AwemeSettings.PushPrePermissionView pushPrePermissionView = awemeSettings.pushPrePermissionView;
            if (pushPrePermissionView != null) {
                SharePrefCache.inst().getRequestNotificationTitle().b(edit, pushPrePermissionView.toastTitle);
                SharePrefCache.inst().getRequestNotificationText().b(edit, pushPrePermissionView.toastText);
            }
            SharePrefCache.inst().getNoticeCountLatency().b(edit, Integer.valueOf(awemeSettings.noticeCountLatency));
            SharePrefCache.inst().getFriendTabAvatarDuation().b(edit, Integer.valueOf(awemeSettings.friendTabAvatarDuration));
            com.ss.android.ugc.aweme.wallet.a.a(awemeSettings.walletConfig);
            com.ss.android.ugc.aweme.setting.b.a.a(awemeSettings.hateFulConfig);
            c.a(awemeSettings.hashTagRegex);
            SharePrefCache.inst().getEnableProfileActivityLink().b(edit, Boolean.valueOf(awemeSettings.enableProfileActivity));
            SharePrefCache.inst().getEnableFace2Face().b(edit, Boolean.valueOf(awemeSettings.enableFace2Face));
            com.ss.android.ugc.aweme.commercialize.link.a.a(awemeSettings);
            f.a(awemeSettings);
            p.a(awemeSettings);
            SharePrefCache.inst().getEableUltraResolution().b(edit, Boolean.valueOf(awemeSettings.enableUltraResolution));
            SharePrefCache.inst().isInUltraResBlackList().b(edit, Boolean.valueOf(awemeSettings.inUltraResBlackList));
            SharePrefCache.inst().getEnableAntiAliasing().b(edit, Boolean.valueOf(awemeSettings.enableAntiAliasing));
            SharePrefCache.inst().getUltraResolutionLevel().b(edit, Integer.valueOf(awemeSettings.ultraResolutionLevel));
            SharePrefCache.inst().getX2cSwitch().b(edit, Integer.valueOf(awemeSettings.x2cSwitch));
            x.a().ad().b(edit, awemeSettings.dmtJsBridgeWhiteList);
            AwemeSettings.UserCacheSetting userCacheSetting = awemeSettings.userCacheSetting;
            if (userCacheSetting != null) {
                SharePrefCache.inst().getIsEnableCacheUserList().b(edit, Boolean.valueOf(userCacheSetting.enableUserCache == 1));
                an<Boolean> isEnableCacheUserInsert = SharePrefCache.inst().getIsEnableCacheUserInsert();
                if (userCacheSetting.enableCacheUserInsert != 1) {
                    z = false;
                }
                isEnableCacheUserInsert.b(edit, Boolean.valueOf(z));
                SharePrefCache.inst().getFetchUserCacheIntervals().b(edit, Long.valueOf(userCacheSetting.fetchUserCacheIntervals));
            }
            if (awemeSettings.assistantSettings != null) {
                x.a().O().b(edit, awemeSettings.assistantSettings.f63859a);
            }
            b.b().a((Context) k.a(), "user_prefer_settings", (Object) awemeSettings.userPrefer);
            ar.a(awemeSettings.userPrefer);
            b.b().a((Context) k.a(), "aweme_gecko_offline_host_prefix", (Object) awemeSettings.geckoOfflineHostPrefix);
            b.b().a((Context) k.a(), "tencent_sdk_disabled", awemeSettings.tencentSdkDisabled);
            edit.apply();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Context context) throws Exception {
        try {
            String b2 = b.b().b((Context) k.a(), "last_setting_version", "");
            if (context == null) {
                return this.f63994d.queryRawSetting(0, b2).get();
            }
            return this.f63994d.queryRawSetting(s.b(context), b2).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public final void b(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f63993c, false, 72066, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f63993c, false, 72066, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a(obj);
    }

    @MeasureFunction
    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f63993c, false, 72068, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f63993c, false, 72068, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        a(message2.obj);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63993c, false, 72063, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63993c, false, 72063, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i2, null);
    }

    @Business.Main
    public final void b(AwemeSettings awemeSettings) {
        AwemeSettings awemeSettings2 = awemeSettings;
        if (PatchProxy.isSupport(new Object[]{awemeSettings2}, this, f63993c, false, 72070, new Class[]{AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettings2}, this, f63993c, false, 72070, new Class[]{AwemeSettings.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(awemeSettings2.defaultCoverUrls)) {
            HashSet hashSet = new HashSet();
            try {
                int i2 = 0;
                for (UrlModel urlModelWrap : awemeSettings2.defaultCoverUrls) {
                    int i3 = i2 + 1;
                    hashSet.add(new UrlModelWrap(i2, urlModelWrap).toJsonString());
                    i2 = i3;
                }
            } catch (Exception unused) {
            }
            com.ss.android.ugc.aweme.base.sharedpref.f b2 = e.b();
            if (PatchProxy.isSupport(new Object[]{"default_profile_cover_url", hashSet}, b2, com.ss.android.ugc.aweme.base.sharedpref.f.f34885a, false, 24900, new Class[]{String.class, Set.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.base.sharedpref.f fVar = b2;
                PatchProxy.accessDispatch(new Object[]{"default_profile_cover_url", hashSet}, fVar, com.ss.android.ugc.aweme.base.sharedpref.f.f34885a, false, 24900, new Class[]{String.class, Set.class}, Void.TYPE);
                return;
            }
            b2.a().putStringSet("default_profile_cover_url", hashSet).apply();
        }
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f63993c, false, 72061, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f63993c, false, 72061, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.i.add(aVar2);
    }

    public void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f63993c, false, 72067, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f63993c, false, 72067, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.g = true;
        if (!(obj instanceof Exception) && (obj instanceof AwemeSettings)) {
            AwemeSettings awemeSettings = (AwemeSettings) obj;
            if (awemeSettings.globalTips != null) {
                this.f63996f = awemeSettings.globalTips;
                e.e().b("place_holder", this.f63996f.search_tips);
            }
            b.b().a((Context) k.a(), "is_setting_cache", true);
            a(awemeSettings);
            bg.a(new h());
            com.ss.android.ugc.aweme.zhima.c.a().a(awemeSettings);
        }
    }

    public void a(int i2, Context context) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), context}, this, f63993c, false, 72064, new Class[]{Integer.TYPE, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), context}, this, f63993c, false, 72064, new Class[]{Integer.TYPE, Context.class}, Void.TYPE);
            return;
        }
        u.a();
        com.ss.android.ugc.aweme.base.m.a().a(this.f63995e, new p(this, context), 0);
    }
}
