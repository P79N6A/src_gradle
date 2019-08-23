package com.ss.android.ugc.aweme.services.settings;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.gson.JsonObject;
import com.ss.android.ttve.nativePort.b;
import com.ss.android.ugc.aweme.port.a;

public interface IAVSettingsService {
    String SdkV4AuthKey();

    a<Boolean> bubbleGuideShown();

    boolean enableFeedbackLog();

    boolean enableFullScreen();

    boolean enableInstagramSilentShare();

    boolean enableMBlackPanel();

    boolean enablePhotoMovie();

    boolean enablePreUploadByUser();

    boolean enableReact();

    boolean enableSaveUploadVideo();

    boolean enableStickerDetailsEntrance();

    boolean enableUploadFallback();

    boolean enableUploadSyncIns();

    boolean enableUploadSyncInsStory();

    boolean enableUploadSyncTwitter();

    boolean enableVECutVideo();

    boolean forceAddVideoHead();

    String freeFLowCardUrl();

    int getEditPageMusicPanelOptimization();

    boolean getEditPagePrompt();

    int getFullScreenPlan();

    b.c getLibraryLoader(Application application);

    float getRecordBitrate();

    int getRecordQuality();

    boolean isEnableGetThumbsWithEffect();

    boolean isEnableUseVEGetThumbs();

    boolean isEnableVideoEditActivityUploadSpeedProbe();

    boolean isOpenMusicRecordWithSticker();

    boolean isOpenStickerRecordWithMusic();

    boolean needLoginBeforeRecord();

    long progressBarThreshold();

    int recommentMusicByAIPolicy();

    void setDefaultFilterForCamera(int i, int i2);

    void setEnablePreUploadByUser(boolean z);

    boolean shareVideo2GifEditable();

    a<Boolean> showLockNewYearStickerPopupImg();

    a<Boolean> showLockStickerPopupImg();

    boolean showMvThemeRecordMode();

    boolean showStickerCollection();

    void startTestABActivity(@NonNull Context context);

    void startTestSettingActivity(@NonNull Context context);

    void updateABTestModel(@NonNull JsonObject jsonObject);

    void updateServerSettings(com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar);

    boolean uploadOptimizeForPie();
}
