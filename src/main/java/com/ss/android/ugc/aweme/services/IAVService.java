package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bef.effectsdk.b;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.gson.Gson;
import com.ss.android.common.AppContext;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.filter.ar;
import com.ss.android.ugc.aweme.framework.services.IPromptService;
import com.ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.mediachoose.k;
import com.ss.android.ugc.aweme.music.b.a;
import com.ss.android.ugc.aweme.port.in.r;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.ss.android.ugc.aweme.services.photo.IPhotoService;
import com.ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.IUnLockStickerManagerService;
import com.ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.ss.android.ugc.aweme.services.story.IStorySettingService;
import com.ss.android.ugc.aweme.services.upload.ITTUploaderConfigService;
import com.ss.android.ugc.aweme.services.upload.IUploadService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.IRecordActivityService;
import com.ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.ss.android.ugc.aweme.services.video.IVideoModelCoverService;
import com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.services.videoprocess.IVideoProcessorsService;
import com.ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.dk;
import com.ss.android.ugc.aweme.shortvideo.e.h;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;
import java.util.Map;

@Keep
public interface IAVService {

    public interface IFetchInteractionStickerIdListener {
        void failed();

        void success(List<String> list);
    }

    public interface IFetchResourcesListener {
        void onFailed(Exception exc);

        void onSuccess(String[] strArr);
    }

    public interface IPermissionModule {
        void onSaveInstanceState(Bundle bundle);

        void receivePermissionResult(Intent intent);

        void restoreSavedInstanceState(Bundle bundle);

        void setupByActivity(dk dkVar);
    }

    public interface IPermissionSettingItem {
        View asView();

        DmtTextView getPrivateHint();

        ImageView getPrivateIcon();

        void setPermission(int i);
    }

    public interface MusicWaveDataListener {
        void onFinish(Object obj);
    }

    String addEffectChannelIfNeeded(AppContext appContext, String str);

    IAVSettingsService avSettingsService();

    String chooseMediaActivityName();

    boolean containsRecordPage();

    FaceStickerBean convertEffect2FaceStickerBean(Effect effect);

    IVideoChoose convertVideoChoose(Fragment fragment);

    String createMainBusinessContextJson(w wVar);

    h createMaxDurationResolver();

    Fragment createMediaChooseFragment(@Nullable c cVar, int i, boolean z, a aVar, k kVar);

    com.ss.android.ugc.aweme.views.k createMusLiveView(Context context);

    IPermissionModule createPermissionModule(Activity activity, IPermissionSettingItem iPermissionSettingItem, int i);

    IPermissionSettingItem createPermissionSettingItem(Context context);

    IVideoChoose createVideoChooseFragment(IVideoChoose.Callback callback);

    String[] createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3);

    String detectIsFromEditOrStory(Context context);

    IDraftService draftService();

    IEffectService effectService();

    int[] extractVideoFileInfo(String str);

    void fetchResourcesNeededByRequirements(String[] strArr, IFetchResourcesListener iFetchResourcesListener);

    void fetchWhiteListStickerIdsForInteraction(IFetchInteractionStickerIdListener iFetchInteractionStickerIdListener);

    List<String> gatherFilesToBeUploaded(Context context);

    f getAvMusicWaveBean(String str, boolean z, MusicWaveDataListener musicWaveDataListener);

    r getCommerceService();

    String getEffectSDKVersion();

    File getExternalFaceCacheDir();

    String getFilterFaceReshapeDir();

    ar getFilterService();

    com.ss.android.ugc.aweme.port.in.w getLiveService();

    File getLrcExternalCacheDir();

    w getMainBusinessContextShareContext(String str);

    Class<?> getMediaChooseFragmentClass();

    int getMediaChooserMaxVideoDuration();

    int getMediaChooserMinVideoDuration();

    List<com.ss.android.ugc.aweme.music.b.a.a> getMediaLoaderImages(Context context);

    Object getMusicWaveBean(String str, int i, boolean z, boolean z2, long j, MusicWaveDataListener musicWaveDataListener);

    int getMusicWaveBeanRemainProgress(int i);

    IPublishService getPublishService();

    Class<? extends Activity> getRecordPermissionActivity();

    ISDKService getSDKService();

    Class<?> getShortVideoContextClass();

    String getShortVideoContextMainBusinessData(Object obj);

    IStickerUtilsService getStickerUtilsService();

    float getStoryEditAlpha();

    Map getTrickyMapByActivity(Context context);

    Typeface getTypefaceByFontName(String str);

    IUploadService getUploadService();

    boolean getUsingOnline();

    String getVESDKVersion();

    void getVideoCover(String str, int i, OnGetVideoCoverCallback onGetVideoCoverCallback);

    IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context);

    IVideoRecordEntranceService getVideoRecordEntranceService();

    void hookVESDKSO();

    void initAIMusicSettings(String str);

    void initVideoImportConfig();

    void initVideoRecordConfig();

    boolean isLongVideoPermitted();

    boolean isRecording();

    boolean isShortVideoContextViewModelDurationEmppy(FragmentActivity fragmentActivity);

    void loadVESDKSO();

    boolean needLoginBeforeRecord();

    Fragment newVideoChooseFragmentInstance(int i, int i2, int i3, @Nullable c cVar, k kVar);

    void openAVSchemaTestActivity(Context context);

    IPhotoMovieService photoMovieService();

    IPhotoProcessService photoProcessService();

    IPhotoService photoService();

    void prefetchTypeface(Context context);

    IPromptService promptService();

    Gson provideAvGson();

    b provideResourceFinder();

    IAVPublishService publishService();

    IRecordActivityService recordActivityService();

    Void requestReactDuetSettings(String str, String str2, String str3) throws Exception;

    void setFontTypeList(List<com.ss.android.ugc.aweme.story.shootvideo.textfont.c> list);

    void setLongVideoPermitted(boolean z);

    void setUsingOnline(boolean z);

    IShortVideoConfig shortVideoConfig();

    void startCutMultiVideoActivity(Context context, Intent intent);

    void startCutMultiVideoActivityForResult(Activity activity, Intent intent, int i);

    void startStoryEditActivity(Activity activity, Intent intent);

    void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, boolean z2, boolean z3);

    void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup);

    void startToolPermissionActivity(Activity activity, Intent intent);

    void startVideoEditActivity(Context context, Intent intent, int i);

    IStoryRecordService storyRecordService();

    IStorySettingService storySettingService();

    ITTUploaderConfigService ttUploaderConfigService();

    void turnStoryRecordPage(Intent intent);

    IUnLockStickerManagerService unLockStickerManagerService();

    void updateNewPermission();

    IVideo2GifService video2GifService();

    IVideoCoverService videoCoverService();

    IVideoModelCoverService videoModelCoverService();

    IVideoProcessorsService videoProcessorsService();

    IWaterMarkService waIWaterMarkService();
}
