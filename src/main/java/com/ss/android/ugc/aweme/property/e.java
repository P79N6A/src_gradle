package com.ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.g;
import com.ss.android.ugc.aweme.q.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63284a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f63285b;

    /* renamed from: c  reason: collision with root package name */
    private g f63286c = new g(this.f63285b);

    public enum a implements g.a {
        PrivateAvailable("private_available", g.b.Boolean, Boolean.TRUE, true),
        AwemePrivate("aweme_private", g.b.Boolean, Boolean.FALSE, true),
        EffectBubbleShown("effect_bubble_shown", g.b.Boolean, Boolean.FALSE, true),
        POIBubbleShow("poi_bubble_show", g.b.Boolean, Boolean.FALSE, false),
        DraftBubbleShown("draft_bubble_shown", g.b.Boolean, Boolean.FALSE, true),
        FirstSetPrivate("first_set_private", g.b.Boolean, Boolean.FALSE, true),
        RecordGuideShown("record_guide_shown", g.b.Boolean, Boolean.FALSE, true),
        SwitchFilterGuideShown("switch_filter_guide_shown", g.b.Boolean, Boolean.FALSE, true),
        CountDownGuideShown("countdown_guide_shown", g.b.Boolean, Boolean.FALSE, true),
        LongVideoPermitted("long_video_permitted", g.b.Boolean, Boolean.FALSE, true),
        LongVideoThreshold("long_video_threshold", g.b.Long, 60000L, true),
        HardCode("hard_encode", g.b.Boolean, Boolean.FALSE, true),
        SyntheticHardCode("synthetic_hardcode", g.b.Boolean, Boolean.FALSE, true),
        VideoBitrate("video_bitrate", g.b.Float, Float.valueOf(1.0f), true),
        SyntheticVideoBitrate("synthetic_video_bitrate", g.b.Float, Float.valueOf(1.0f), true),
        RecordVideoQuality("record_video_quality", g.b.Integer, 18, true),
        SyntheticVideoQuality("synthetic_video_quality", g.b.Integer, 15, true),
        ForbidLocalWatermark("forbid_local_watermark", g.b.Boolean, Boolean.FALSE, true),
        ForbidLifeStoryLocalWatermark("forbid_story_local_watermark", g.b.Boolean, Boolean.FALSE, true),
        WatermarkHardcode("use_watermark_hardcode", g.b.Boolean, Boolean.FALSE, true),
        EnableUploadSyncTwitter("enable_upload_sync_twitter", g.b.Boolean, Boolean.TRUE, true),
        EnableUploadSyncIns("enable_upload_sync_ins", g.b.Boolean, Boolean.TRUE, true),
        EnableUploadSyncInsStory("enable_upload_sync_ins_story", g.b.Boolean, Boolean.TRUE, true),
        EnableUploadSyncLocal("enable_upload_sync_local", g.b.Boolean, Boolean.TRUE, true),
        EnableSyntheticFpsSet("enable_synthetic_fps_set", g.b.Boolean, Boolean.TRUE, true),
        RecordBitrateCategory("record_bitrate_category", g.b.String, "", true),
        RecordQualityCategory("record_quality_category", g.b.String, "", true),
        LastPublishFailed("last_publish_failed", g.b.Boolean, Boolean.FALSE, true),
        BackCameraFilter("back_camera_filter", g.b.Integer, 0, true),
        FrontCameraFilter("front_camera_filter", g.b.Integer, 0, true),
        DisableFilter("disable_filter", g.b.Boolean, Boolean.FALSE, true),
        BackCameraFilterV2("back_camera_filter_v2", g.b.Integer, 0, true),
        FrontCameraFilterV2("front_camera_filter_v2", g.b.Integer, 0, true),
        StoryBackCameraFilter("story_back_camera_filter", g.b.Integer, 0, true),
        StoryFrontCameraFilter("story_front_camera_filter", g.b.Integer, 0, true),
        CameraPosition("camera_position", g.b.Integer, 1, true),
        StoryCameraPosition("story_camera_position", g.b.Integer, 0, true),
        VideoCompose("video_compose", g.b.Integer, 70, true),
        VideoCommit("video_commit", g.b.Integer, 30, true),
        HttpTimeout("http_timeout", g.b.Long, 5000L, true),
        HttpRetryInterval("http_retry_interval", g.b.Long, 500L, true),
        ARStickerGuideTimes("ar_sticker_guide_times", g.b.Integer, 0, true),
        ARStickerFilterTimes("ar_sticker_filter_guide_times", g.b.Integer, 0, true),
        UseSenseTime("use_sensetime", g.b.Boolean, Boolean.TRUE, true),
        BodyDanceGuideTimes("body_dance_guide_times", g.b.Integer, 0, true),
        BeautyModel("beauty_model", g.b.Integer, 0, true),
        BeautificationMode("beautification_mode", g.b.Integer, 0, true),
        ProgressBarThreshold("progressbar_threshold", g.b.Long, 30000L, true),
        UseTTUploader("use_tt_uploader", g.b.Boolean, Boolean.TRUE, true),
        PublishPermissionShowDot("publish_permission_show_dot", g.b.Boolean, Boolean.FALSE, true),
        PublishPermissionDialogPrivate("publish_permission_dialog_private", g.b.Boolean, Boolean.TRUE, true),
        PublishPermissionDialogFriend("publish_permission_dialog_friend", g.b.Boolean, Boolean.TRUE, true),
        ShowFilterNewTag("show_filter_new_tag", g.b.Boolean, Boolean.TRUE, true),
        SmoothSkinIndex("smooth_skin_index", g.b.Integer, 3, true),
        ReshapeIndex("big_eyes_index", g.b.Integer, 3, true),
        FaceDetectInterval("face_detect_interval", g.b.Integer, 0, true),
        VideoSizeCategory("setting_video_size_category", g.b.String, "", true),
        ImportVideoSizeCategory("setting_upload_video_size_category", g.b.String, "", true),
        VideoSize("setting_video_size", g.b.String, "", true),
        BubbleGuideShown("setting_bubble_guide_shown", g.b.Boolean, Boolean.FALSE, true),
        EffectModelCopied("effect_model_copied", g.b.Boolean, Boolean.FALSE, true),
        ReshapeModelCopied("reshape_mode_copied", g.b.Boolean, Boolean.FALSE, true),
        AmericaRecordUploadGuideShow("america_record_upload_show", g.b.Boolean, Boolean.FALSE, true),
        BubbleFavoriteStickerShown("setting_bubble_guide_shown", g.b.Boolean, Boolean.FALSE, true),
        StickerCollectionFirst("setting_sticker_first", g.b.Boolean, Boolean.TRUE, true),
        StickerCollectionFirstShown("setting_sticker_first_shown", g.b.Boolean, Boolean.FALSE, true),
        SdkV4AuthKey("sdk_v4_auth_key", g.b.String, "", true),
        StorySdkV4AuthKey("story_sdk_v4_auth_key", g.b.String, "", true),
        SpeedPanelOpen("speed_panel_open", g.b.Boolean, Boolean.FALSE, true),
        EnableHuaweiSuperSlowMotion("enable_huawei_super_slow", g.b.Integer, 0, true),
        SyntheticVideoMaxRate("synthetic_video_maxrate", g.b.Long, 15000000L, true),
        SyntheticVideoPreset("synthetic_video_preset", g.b.Integer, 0, true),
        SyntheticVideoGop("synthetic_video_gop", g.b.Integer, 35, true),
        BitrateOfRecodeThreshold("bitrate_of_recode_threshold", g.b.Integer, 10000000, true),
        UploadOriginalAudioTrack("upload_origin_audio_track", g.b.Boolean, Boolean.FALSE, true),
        CloseUploadExtractFrames("close_vframe_upload", g.b.Integer, 0, true),
        AutoApplySticker("time_auto_apply_sticker", g.b.Long, 0L, true),
        RecordBitrateMode("record_bitrate_mode", g.b.Integer, 1, true),
        RecordHardwareProfile("record_open_high_profile", g.b.Integer, 1, true),
        UserSmoothSkinLevel("user_smooth_skin_level", g.b.Integer, -1, true),
        UserShapeLevel("user_shape_level", g.b.Integer, -1, true),
        UserBigEyeLevel("user_big_eye_level", g.b.Integer, -1, true),
        UserContourLevel("user_contour_level", g.b.Integer, -1, true),
        UserLipLevel("user_lip_level", g.b.Integer, -1, true),
        UserBlushLevel("user_blush_level", g.b.Integer, -1, true),
        UserChangeSkinLevel("user_change_smooth_skin_level", g.b.Boolean, Boolean.FALSE, true),
        UserChangeShapeLevel("user_change_shape_level", g.b.Boolean, Boolean.FALSE, true),
        UserChangeBigEyeLevel("user_change_big_eye_level", g.b.Boolean, Boolean.FALSE, true),
        UserChangeContourLevel("user_change_contour_level", g.b.Boolean, Boolean.FALSE, true),
        UserChangeLipLevel("user_change_lip_level", g.b.Boolean, Boolean.FALSE, true),
        UserChangeBlushLevel("user_change_blush_level", g.b.Boolean, Boolean.FALSE, true),
        MusNeedResetShapeLevel("mus_need_reset_shape_level", g.b.Boolean, Boolean.TRUE, true),
        LoadOldUserLevel("load_old_user_level", g.b.Boolean, Boolean.TRUE, true),
        UserUlikeSmoothSkinLevel("user_ulike_smooth_skin_level", g.b.Integer, -1, true),
        UserUlikeShapeLevel("user_ulike_shape_level", g.b.Integer, -1, true),
        UserUlikeBigEyeLevel("user_ulike_big_eye_level", g.b.Integer, -1, true),
        UserUlikeLipLevel("user_ulike_lip_level", g.b.Integer, -1, true),
        UserUlikeBlushLevel("user_ulike_blush_level", g.b.Integer, -1, true),
        ContourModelCopied("contour_mode_copied", g.b.Boolean, Boolean.FALSE, true),
        MakeupModelCopied("makeup_model_copied", g.b.Boolean, Boolean.FALSE, true),
        UlikeReshapeCopied("ulike_reshape_model_copied", g.b.Boolean, Boolean.FALSE, true),
        UlikeNewReshapeCopied("ulike_new_reshape_model_copied", g.b.Boolean, Boolean.FALSE, true),
        UlikeBeautyCopied("ulike_beauty_model_copied", g.b.Boolean, Boolean.FALSE, true),
        EffectShareCopied("effect_share_copied", g.b.Boolean, Boolean.FALSE, true),
        EffectResourceVersion("effect_resource_version", g.b.Integer, 0, true),
        UlikeSharpenDefaultValue("ulike_sharpen_default_value", g.b.Float, Float.valueOf(0.05f), true),
        UlikeSmoothDefaultValue("ulike_smooth_default_value", g.b.Float, Float.valueOf(0.6f), true),
        UlikeShapeDefaultValue("ulike_shape_default_value", g.b.Float, Float.valueOf(0.5f), true),
        UlikeEyesDefaultValue("ulike_eyes_default_value", g.b.Float, Float.valueOf(0.3f), true),
        UlikeLipDefaultValue("ulike_lip_default_value", g.b.Float, Float.valueOf(0.3f), true),
        UlikeBlusherDefaultValue("ulike_blusher_default_value", g.b.Float, Float.valueOf(0.3f), true),
        UlikeSmoothMaxValue("ulike_smooth_max_value", g.b.Float, Float.valueOf(0.8f), true),
        UlikeShapeMaxValue("ulike_shape_max_value", g.b.Float, Float.valueOf(0.8f), true),
        UlikeEyesMaxValue("ulike_eyes_max_value", g.b.Float, Float.valueOf(0.5f), true),
        EnableBeautyMakeup("enable_beauty_makeup", g.b.Boolean, Boolean.FALSE, true),
        EnableBeautySharpen("enable_beauty_sharpen", g.b.Boolean, Boolean.FALSE, true),
        MALE_PROB_THRESHOLD("male_prob_threshold", g.b.Float, Float.valueOf(0.8f), true),
        DurationMode("duration_mode", g.b.Boolean, Boolean.TRUE, true),
        RecordCameraType("record_camera_type", g.b.Integer, -1, true),
        InCamera2BlackList("in_camera2_black_list", g.b.Integer, 0, true),
        EnablePreUploadByUser("enable_pre_upload_by_user", g.b.Boolean, Boolean.TRUE, true),
        PreUploadMemoryLimit("pre_upload_memory_limit", g.b.Integer, 1600, true),
        RecordUseSuccessCameraType("record_use_success_camera_type", g.b.Integer, 0, true),
        RecordUseSuccessRecordProfile("record_use_success_hardware_profile", g.b.Integer, 1, true),
        ReactionTipShow("reaction_tip_show", g.b.Boolean, Boolean.FALSE, true),
        ReactionWindowChangeTipShow("reaction_window_change_tip_show", g.b.Boolean, Boolean.FALSE, true),
        RecordCameraCompatLevel("record_camera_compat_level", g.b.Integer, 1, true),
        CanReact("can_react", g.b.Boolean, Boolean.FALSE, true),
        DefaultMicrophoneState("react_mic_status", g.b.Integer, 1, true),
        InEvening("in_evening", g.b.Integer, 0, false),
        EnableSdkLog("enable_sdk_log", g.b.Boolean, Boolean.FALSE, false),
        UseLargeGestureDetectModel("enable_large_gesture_detect_model", g.b.Boolean, Boolean.TRUE, true),
        UseSmallGestureDetectModel("enable_small_gesture_detect_model", g.b.Boolean, Boolean.TRUE, true),
        UseLargeMattingModel("enable_large_matting_detect_model", g.b.Boolean, Boolean.FALSE, true),
        ReactDuetSettingCurrent("react_duet_setting", g.b.Integer, 2, true),
        ReactDuetSettingChanged("user_changed_setting", g.b.Boolean, Boolean.FALSE, true),
        ShowLockStickerPopupImg("show_lock_sticker_popup_img", g.b.Boolean, Boolean.TRUE, true),
        EnableWaterBgMask("enable_water_bg_mask", g.b.Boolean, Boolean.FALSE, true),
        CombinedShootModeTipShown("show_combine_shoot_mode_tip", g.b.Boolean, Boolean.TRUE, true),
        EnableCommerceUnlockStickerCollectTips("show_commerce_unlock_sticker_collect_tips", g.b.Boolean, Boolean.TRUE, true),
        ShowLockNewYearStickerPopupImg("new_year_show_lock_sticker_popup_img", g.b.Boolean, Boolean.TRUE, true),
        MusicCopyRightGranted("music_copyright_granted", g.b.Boolean, Boolean.FALSE, true),
        StoryImagePlayTime("story_image_play_time", g.b.Integer, 4000, true),
        ShowLastStoryFrame("show_last_story_frame", g.b.Boolean, Boolean.TRUE, true),
        MaxFansCount("max_fans_count", g.b.Integer, 0, true),
        WideCameraInfo("wide_camera_info", g.b.Integer, -1, true),
        CurrentWideMode("current_wide_mode", g.b.Integer, 0, true),
        DefaultWideMode("default_wide_mode", g.b.Boolean, Boolean.FALSE, true),
        ShakeFreeWhiteList("shake_free_white_list", g.b.Integer, -1, true),
        ShakeFreeDefaultMode("default_shake_free_mode", g.b.Boolean, Boolean.FALSE, true),
        CurrentShakeFreeMode("shake_free_mode", g.b.Integer, 0, true),
        ShutterSoundEnable("shutter_sound_enable", g.b.Boolean, Boolean.FALSE, true),
        FreeFLowCardUrl("free_flow_card_url_sticker", g.b.String, "", true),
        SpringEffectCacheController("life_effects_cold_req", g.b.Boolean, Boolean.TRUE, true),
        FolderInfo("folder_info", g.b.String, "", true),
        VideoDurationLimitMillisecond("video_duration_limit_ms", g.b.Long, 1000L, true),
        RecordTutorialLink("shoot_tutorial_link", g.b.String, "", true),
        EnableAutoRetryRecord("enable_auto_retry_record", g.b.Boolean, Boolean.TRUE, true),
        IsExportHqFrame("enable_hq_vframe", g.b.Boolean, Boolean.FALSE, true),
        SaveVideoDirectly("save_video_directly", g.b.Boolean, Boolean.FALSE, true),
        FilterColors("filter_colors", g.b.String, "", true),
        UlikeBeautyDownloadEnable("enable_camera_beautify_effect", g.b.Boolean, Boolean.FALSE, true),
        ModelFileTestEnv("model_file_test_env", g.b.Boolean, Boolean.FALSE, true),
        Enable1080pFastImport("enable_1080p_fast_import", g.b.Integer, 0, true),
        EnableVESingleGL("enable_ve_single_gl", g.b.Integer, 0, true),
        StickerArtistIconUrl("sticker_artist_icon_url", g.b.String, "", true),
        VEFastImportIgnoreRecode("ve_fast_import_ignore_recode", g.b.Boolean, Boolean.FALSE, true),
        EnableUseVeCover("use_ve_image", g.b.Boolean, Boolean.FALSE, true),
        EnableVeCoverEffect("enable_cover_effect", g.b.Boolean, Boolean.FALSE, true);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Object defVal;
        private final String key;
        private final boolean supportPersist;
        private final g.b type;

        public final Object checkDefValue(g.b bVar, Object obj) {
            if (!PatchProxy.isSupport(new Object[]{bVar, obj}, this, changeQuickRedirect, false, 70219, new Class[]{g.b.class, Object.class}, Object.class)) {
                return h.a(this, bVar, obj);
            }
            return PatchProxy.accessDispatch(new Object[]{bVar, obj}, this, changeQuickRedirect, false, 70219, new Class[]{g.b.class, Object.class}, Object.class);
        }

        public final Object defValue() {
            return this.defVal;
        }

        public final String key() {
            return this.key;
        }

        public final boolean supportPersist() {
            return this.supportPersist;
        }

        public final g.b type() {
            return this.type;
        }

        private a(String str, g.b bVar, Object obj, boolean z) {
            Object checkDefValue = checkDefValue(bVar, obj);
            this.key = str;
            this.type = bVar;
            this.defVal = checkDefValue;
            this.supportPersist = z;
        }
    }

    public final synchronized boolean a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63284a, false, 70204, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63284a, false, 70204, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }
        return this.f63286c.a(aVar);
    }

    public final synchronized void a(a aVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63284a, false, 70205, new Class[]{a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, f63284a, false, 70205, new Class[]{a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f63286c.a((g.a) aVar, z);
    }

    private synchronized void g(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63284a, false, 70215, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f63284a, false, 70215, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f63286c.g(aVar);
    }

    public final synchronized int b(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63284a, false, 70206, new Class[]{a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63284a, false, 70206, new Class[]{a.class}, Integer.TYPE)).intValue();
        }
        return this.f63286c.b(aVar);
    }

    public final synchronized long c(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63284a, false, 70208, new Class[]{a.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63284a, false, 70208, new Class[]{a.class}, Long.TYPE)).longValue();
        }
        return this.f63286c.c(aVar);
    }

    public final synchronized float d(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63284a, false, 70210, new Class[]{a.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63284a, false, 70210, new Class[]{a.class}, Float.TYPE)).floatValue();
        }
        return this.f63286c.d(aVar);
    }

    public final synchronized String e(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63284a, false, 70212, new Class[]{a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63284a, false, 70212, new Class[]{a.class}, String.class);
        }
        return this.f63286c.e(aVar);
    }

    public final synchronized boolean f(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63284a, false, 70214, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63284a, false, 70214, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }
        return this.f63286c.f(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        g(com.ss.android.ugc.aweme.property.e.a.SmoothSkinIndex);
        g(com.ss.android.ugc.aweme.property.e.a.ReshapeIndex);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        a(com.ss.android.ugc.aweme.property.e.a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        a(com.ss.android.ugc.aweme.property.e.a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        a(com.ss.android.ugc.aweme.property.e.a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        a(com.ss.android.ugc.aweme.property.e.a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0097 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0097 }
            r9 = 0
            r1[r9] = r2     // Catch:{ all -> 0x0097 }
            com.meituan.robust.ChangeQuickRedirect r3 = f63284a     // Catch:{ all -> 0x0097 }
            r4 = 0
            r5 = 70216(0x11248, float:9.8394E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0097 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0097 }
            r6[r9] = r2     // Catch:{ all -> 0x0097 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0097 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x003c
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0097 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0097 }
            r1[r9] = r0     // Catch:{ all -> 0x0097 }
            com.meituan.robust.ChangeQuickRedirect r3 = f63284a     // Catch:{ all -> 0x0097 }
            r4 = 0
            r5 = 70216(0x11248, float:9.8394E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0097 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0097 }
            r6[r9] = r0     // Catch:{ all -> 0x0097 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0097 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0097 }
            monitor-exit(r10)
            return
        L_0x003c:
            android.content.SharedPreferences r1 = r10.f63285b     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "_version_"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0056
            android.content.SharedPreferences r1 = r10.f63285b     // Catch:{ all -> 0x0097 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "_version_"
            r1.putInt(r2, r11)     // Catch:{ all -> 0x0097 }
            r1.apply()     // Catch:{ all -> 0x0097 }
            monitor-exit(r10)
            return
        L_0x0056:
            android.content.SharedPreferences r1 = r10.f63285b     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "_version_"
            int r1 = r1.getInt(r2, r9)     // Catch:{ all -> 0x0097 }
            if (r11 <= r1) goto L_0x006e
            android.content.SharedPreferences r2 = r10.f63285b     // Catch:{ all -> 0x0097 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = "_version_"
            r2.putInt(r3, r11)     // Catch:{ all -> 0x0097 }
            r2.apply()     // Catch:{ all -> 0x0097 }
        L_0x006e:
            switch(r1) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0077;
                case 3: goto L_0x0081;
                case 4: goto L_0x0086;
                case 5: goto L_0x008b;
                case 6: goto L_0x0090;
                default: goto L_0x0071;
            }     // Catch:{ all -> 0x0097 }
        L_0x0071:
            goto L_0x0095
        L_0x0072:
            com.ss.android.ugc.aweme.property.e$a r0 = com.ss.android.ugc.aweme.property.e.a.EffectModelCopied     // Catch:{ all -> 0x0097 }
            r10.a((com.ss.android.ugc.aweme.property.e.a) r0, (boolean) r9)     // Catch:{ all -> 0x0097 }
        L_0x0077:
            com.ss.android.ugc.aweme.property.e$a r0 = com.ss.android.ugc.aweme.property.e.a.SmoothSkinIndex     // Catch:{ all -> 0x0097 }
            r10.g(r0)     // Catch:{ all -> 0x0097 }
            com.ss.android.ugc.aweme.property.e$a r0 = com.ss.android.ugc.aweme.property.e.a.ReshapeIndex     // Catch:{ all -> 0x0097 }
            r10.g(r0)     // Catch:{ all -> 0x0097 }
        L_0x0081:
            com.ss.android.ugc.aweme.property.e$a r0 = com.ss.android.ugc.aweme.property.e.a.EffectModelCopied     // Catch:{ all -> 0x0097 }
            r10.a((com.ss.android.ugc.aweme.property.e.a) r0, (boolean) r9)     // Catch:{ all -> 0x0097 }
        L_0x0086:
            com.ss.android.ugc.aweme.property.e$a r0 = com.ss.android.ugc.aweme.property.e.a.EffectModelCopied     // Catch:{ all -> 0x0097 }
            r10.a((com.ss.android.ugc.aweme.property.e.a) r0, (boolean) r9)     // Catch:{ all -> 0x0097 }
        L_0x008b:
            com.ss.android.ugc.aweme.property.e$a r0 = com.ss.android.ugc.aweme.property.e.a.EffectModelCopied     // Catch:{ all -> 0x0097 }
            r10.a((com.ss.android.ugc.aweme.property.e.a) r0, (boolean) r9)     // Catch:{ all -> 0x0097 }
        L_0x0090:
            com.ss.android.ugc.aweme.property.e$a r0 = com.ss.android.ugc.aweme.property.e.a.EffectModelCopied     // Catch:{ all -> 0x0097 }
            r10.a((com.ss.android.ugc.aweme.property.e.a) r0, (boolean) r9)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r10)
            return
        L_0x0097:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.e.a(int):void");
    }

    public e(Context context, int i) {
        this.f63285b = c.a(context, "av_settings.xml", 0);
        a(7);
    }

    public final synchronized void a(a aVar, float f2) {
        if (PatchProxy.isSupport(new Object[]{aVar, Float.valueOf(f2)}, this, f63284a, false, 70211, new Class[]{a.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Float.valueOf(f2)}, this, f63284a, false, 70211, new Class[]{a.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f63286c.a((g.a) aVar, f2);
    }

    public final synchronized void a(a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f63284a, false, 70207, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f63284a, false, 70207, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f63286c.a((g.a) aVar, i);
    }

    public final synchronized void a(a aVar, long j) {
        a aVar2 = aVar;
        long j2 = j;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{aVar2, new Long(j2)}, this, f63284a, false, 70209, new Class[]{a.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2, new Long(j2)}, this, f63284a, false, 70209, new Class[]{a.class, Long.TYPE}, Void.TYPE);
                return;
            }
            this.f63286c.a((g.a) aVar, j2);
        }
    }

    public final synchronized void a(a aVar, String str) {
        if (PatchProxy.isSupport(new Object[]{aVar, str}, this, f63284a, false, 70213, new Class[]{a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, str}, this, f63284a, false, 70213, new Class[]{a.class, String.class}, Void.TYPE);
            return;
        }
        this.f63286c.a((g.a) aVar, str);
    }
}
