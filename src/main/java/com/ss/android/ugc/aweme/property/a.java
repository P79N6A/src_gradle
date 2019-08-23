package com.ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.property.g;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.shortvideo.publish.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63261a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f63262b;

    /* renamed from: c  reason: collision with root package name */
    private g f63263c = new g(this.f63262b);

    /* renamed from: com.ss.android.ugc.aweme.property.a$a  reason: collision with other inner class name */
    public enum C0682a implements g.a {
        UseNewEdit("use_new_edit", g.b.Boolean, Boolean.FALSE, true),
        OwnFaceDetect("own_face_detect", g.b.Boolean, Boolean.FALSE, true),
        PhotoEditEnabled("photo_edit_enabled", g.b.Boolean, Boolean.FALSE, true),
        RecordBitrateCategoryIndex("record_bitrate_category_index", g.b.Integer, 0, true),
        RecordQualityCategoryIndex("record_quality_category_index", g.b.Integer, 0, true),
        PrivatePrompt("private_prompt", g.b.Integer, 0, true),
        DisableMusicDetailRecordShowUpload("disable_music_detail_record_show_upload", g.b.Boolean, Boolean.FALSE, true),
        QuietlySynthetic("quietly_synthetic", g.b.Boolean, Boolean.FALSE, true),
        VideoSizeIndex("setting_video_size_index", g.b.Integer, 0, true),
        ImportVideoSizeIndex("setting_upload_video_size_index", g.b.Integer, 0, true),
        SmoothMax("smooth_max", g.b.Float, Float.valueOf(0.8f), true),
        SmoothDefault("smooth_default", g.b.Float, Float.valueOf(0.6f), true),
        ReshapeMax("reshape_max", g.b.Float, Float.valueOf(0.6f), true),
        ReshapeDefault("reshape_default", g.b.Float, Float.valueOf(0.36f), true),
        ContourMax("contour_max", g.b.Float, Float.valueOf(0.8f), true),
        ContourDefault("contour_default", g.b.Float, Float.valueOf(0.0f), true),
        ColorFilterPanel("color_filter_panel", g.b.Integer, 1, true),
        EnableReuseFaceSticker("enable_reuse_face_sticker", g.b.Boolean, Boolean.FALSE, true);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Object defVal;
        private final String key;
        private final boolean supportPersist;
        private final g.b type;
        private final i<?> valueRange;

        public final Object checkDefValue(g.b bVar, Object obj) {
            if (!PatchProxy.isSupport(new Object[]{bVar, obj}, this, changeQuickRedirect, false, 70193, new Class[]{g.b.class, Object.class}, Object.class)) {
                return h.a(this, bVar, obj);
            }
            return PatchProxy.accessDispatch(new Object[]{bVar, obj}, this, changeQuickRedirect, false, 70193, new Class[]{g.b.class, Object.class}, Object.class);
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

        @Nullable
        public final <T extends Comparable<T>> i<T> valueRange() {
            return this.valueRange;
        }

        static {
            i iVar;
            C0682a aVar = new C0682a("UseNewEdit", 0, "use_new_edit", g.b.Boolean, Boolean.FALSE, true);
            UseNewEdit = aVar;
            C0682a aVar2 = new C0682a("OwnFaceDetect", 1, "own_face_detect", g.b.Boolean, Boolean.FALSE, true);
            OwnFaceDetect = aVar2;
            C0682a aVar3 = new C0682a("PhotoEditEnabled", 2, "photo_edit_enabled", g.b.Boolean, Boolean.FALSE, true);
            PhotoEditEnabled = aVar3;
            C0682a aVar4 = new C0682a("RecordBitrateCategoryIndex", 3, "record_bitrate_category_index", g.b.Integer, 0, true);
            RecordBitrateCategoryIndex = aVar4;
            C0682a aVar5 = new C0682a("RecordQualityCategoryIndex", 4, "record_quality_category_index", g.b.Integer, 0, true);
            RecordQualityCategoryIndex = aVar5;
            C0682a aVar6 = new C0682a("PrivatePrompt", 5, "private_prompt", g.b.Integer, 0, true);
            PrivatePrompt = aVar6;
            C0682a aVar7 = new C0682a("DisableMusicDetailRecordShowUpload", 6, "disable_music_detail_record_show_upload", g.b.Boolean, Boolean.FALSE, true);
            DisableMusicDetailRecordShowUpload = aVar7;
            C0682a aVar8 = new C0682a("QuietlySynthetic", 7, "quietly_synthetic", g.b.Boolean, Boolean.FALSE, true);
            QuietlySynthetic = aVar8;
            C0682a aVar9 = new C0682a("VideoSizeIndex", 8, "setting_video_size_index", g.b.Integer, 0, true);
            VideoSizeIndex = aVar9;
            C0682a aVar10 = new C0682a("ImportVideoSizeIndex", 9, "setting_upload_video_size_index", g.b.Integer, 0, true);
            ImportVideoSizeIndex = aVar10;
            C0682a aVar11 = new C0682a("SmoothMax", 10, "smooth_max", g.b.Float, Float.valueOf(0.8f), true);
            SmoothMax = aVar11;
            C0682a aVar12 = new C0682a("SmoothDefault", 11, "smooth_default", g.b.Float, Float.valueOf(0.6f), true);
            SmoothDefault = aVar12;
            C0682a aVar13 = new C0682a("ReshapeMax", 12, "reshape_max", g.b.Float, Float.valueOf(0.6f), true);
            ReshapeMax = aVar13;
            C0682a aVar14 = new C0682a("ReshapeDefault", 13, "reshape_default", g.b.Float, Float.valueOf(0.36f), true);
            ReshapeDefault = aVar14;
            C0682a aVar15 = new C0682a("ContourMax", 14, "contour_max", g.b.Float, Float.valueOf(0.8f), true);
            ContourMax = aVar15;
            C0682a aVar16 = new C0682a("ContourDefault", 15, "contour_default", g.b.Float, Float.valueOf(0.0f), true);
            ContourDefault = aVar16;
            C0682a aVar17 = new C0682a("ColorFilterPanel", 16, "color_filter_panel", g.b.Integer, 1, true);
            ColorFilterPanel = aVar17;
            C0682a aVar18 = new C0682a("EnableReuseFaceSticker", 17, "enable_reuse_face_sticker", g.b.Boolean, Boolean.FALSE, true);
            EnableReuseFaceSticker = aVar18;
            g.b bVar = g.b.Integer;
            if (PatchProxy.isSupport(new Object[]{0, 1}, null, i.f63294a, true, 70265, new Class[]{Comparable.class, Comparable.class}, i.class)) {
                Object[] objArr = {0, 1};
                iVar = (i) PatchProxy.accessDispatch(objArr, null, i.f63294a, true, 70265, new Class[]{Comparable.class, Comparable.class}, i.class);
            } else {
                iVar = new i(0, 1);
            }
            C0682a aVar19 = new C0682a("PhotoMovieEnabled", 18, "enable_photomovie", bVar, 0, iVar, true);
            PhotoMovieEnabled = aVar19;
            C0682a aVar20 = new C0682a("NewEditPage", 19, "studio_editor_edit_page_new", g.b.Integer, 0, true);
            NewEditPage = aVar20;
            C0682a aVar21 = new C0682a("ShowAutoImproveButtonInEditPage", 20, "show_auto_improve_button", g.b.Integer, 0, true);
            ShowAutoImproveButtonInEditPage = aVar21;
            C0682a aVar22 = new C0682a("LightEnhanceBlackList", 21, "is_weak_light_enhance_black", g.b.Integer, 0, true);
            LightEnhanceBlackList = aVar22;
            C0682a aVar23 = new C0682a("CanShowPublishFriendGuide", 22, "can_show_publish_friend_guide", g.b.Boolean, Boolean.FALSE, true);
            CanShowPublishFriendGuide = aVar23;
            C0682a aVar24 = new C0682a("EyesMax", 23, "eyes_max", g.b.Float, Float.valueOf(0.6f), true);
            EyesMax = aVar24;
            C0682a aVar25 = new C0682a("EyesDefault", 24, "eyes_default", g.b.Float, Float.valueOf(0.6f), true);
            EyesDefault = aVar25;
            C0682a aVar26 = new C0682a("ShapeMax", 25, "shape_max", g.b.Float, Float.valueOf(0.6f), true);
            ShapeMax = aVar26;
            C0682a aVar27 = new C0682a("ShapeDefault", 26, "shape_default", g.b.Float, Float.valueOf(0.6f), true);
            ShapeDefault = aVar27;
            C0682a aVar28 = new C0682a("BeautificationIconStyle", 27, "beautification_icon_style", g.b.Integer, 0, true);
            BeautificationIconStyle = aVar28;
            C0682a aVar29 = new C0682a("SplitFilterBeauty", 28, "split_filter_beauty", g.b.Boolean, Boolean.FALSE, true);
            SplitFilterBeauty = aVar29;
            C0682a aVar30 = new C0682a("RearCamera", 29, "rear_camera", g.b.Boolean, Boolean.FALSE, true);
            RearCamera = aVar30;
            C0682a aVar31 = new C0682a("RecordHardwareProfile", 30, "record_hardware_profile", g.b.Integer, 1, true);
            RecordHardwareProfile = aVar31;
            C0682a aVar32 = new C0682a("EnableSaveUploadVideo", 31, "isSaveUploadVideo", g.b.Boolean, Boolean.FALSE, true);
            EnableSaveUploadVideo = aVar32;
            C0682a aVar33 = new C0682a("EnableInstagramSilentShare", 32, "isInstagramSilentShare", g.b.Boolean, Boolean.FALSE, true);
            EnableInstagramSilentShare = aVar33;
            C0682a aVar34 = new C0682a("EnableUploadFallback", 33, "enable_upload_fallback", g.b.Boolean, Boolean.FALSE, true);
            EnableUploadFallback = aVar34;
            C0682a aVar35 = new C0682a("UploadOptimizeForPie", 34, "upload_optimize_for_pie", g.b.Boolean, Boolean.TRUE, true);
            UploadOptimizeForPie = aVar35;
            C0682a aVar36 = new C0682a("UseContourSlider", 35, "use_contour_slider", g.b.Boolean, Boolean.FALSE, true);
            UseContourSlider = aVar36;
            C0682a aVar37 = new C0682a("AddTextInMusically", 36, "show_button_title_in_record_page", g.b.Boolean, Boolean.FALSE, true);
            AddTextInMusically = aVar37;
            C0682a aVar38 = new C0682a("EnableExposureOptimize", 37, "enable_exposure_optmize", g.b.Boolean, Boolean.TRUE, true);
            EnableExposureOptimize = aVar38;
            C0682a aVar39 = new C0682a("RecordCameraTypeAB", 38, "camera_type_ab", g.b.Integer, -1, true);
            RecordCameraTypeAB = aVar39;
            C0682a aVar40 = new C0682a("RecordCameraCompatLevelAB", 39, "record_camera_compat_level_ab", g.b.Integer, -1, true);
            RecordCameraCompatLevelAB = aVar40;
            C0682a aVar41 = new C0682a("UploadSpeedProbeSize", 40, "upload_speed_probe_size", g.b.Integer, 524288, true);
            UploadSpeedProbeSize = aVar41;
            C0682a aVar42 = new C0682a("UploadSpeedProbeMinGap", 41, "upload_speed_probe_min_gap", g.b.Integer, 300000, true);
            UploadSpeedProbeMinGap = aVar42;
            C0682a aVar43 = new C0682a("UploadSpeedProbeTimeOut", 42, "upload_speed_probe_time_out", g.b.Integer, 20000, true);
            UploadSpeedProbeTimeOut = aVar43;
            C0682a aVar44 = new C0682a("SyntheticVideoQuality", 43, "synthetic_video_quality", g.b.Integer, -1, true);
            SyntheticVideoQuality = aVar44;
            C0682a aVar45 = new C0682a("SyntheticVideoMaxRate", 44, "synthetic_video_maxrate", g.b.Long, -1L, true);
            SyntheticVideoMaxRate = aVar45;
            C0682a aVar46 = new C0682a("SyntheticVideoPreset", 45, "synthetic_video_preset", g.b.Integer, -1, true);
            SyntheticVideoPreset = aVar46;
            C0682a aVar47 = new C0682a("SyntheticVideoGop", 46, "synthetic_video_gop", g.b.Integer, -1, true);
            SyntheticVideoGop = aVar47;
            C0682a aVar48 = new C0682a("VideoBitrate", 47, "video_bitrate", g.b.Float, Float.valueOf(-1.0f), true);
            VideoBitrate = aVar48;
            C0682a aVar49 = new C0682a("SyntheticVideoBitrate", 48, "synthetic_video_bitrate", g.b.Float, Float.valueOf(-1.0f), true);
            SyntheticVideoBitrate = aVar49;
            C0682a aVar50 = new C0682a("ShareVideo2GifEditable", 49, "new_version_gif_share", g.b.Boolean, Boolean.TRUE, true);
            ShareVideo2GifEditable = aVar50;
            C0682a aVar51 = new C0682a("UseEffectCam", 50, "use_effectcam_key", g.b.Boolean, Boolean.FALSE, false);
            UseEffectCam = aVar51;
            C0682a aVar52 = new C0682a("LoadLibraryFromExternal", 51, "从/sdcard/加载so重启生效", g.b.Boolean, Boolean.FALSE, true);
            LoadLibraryFromExternal = aVar52;
            C0682a aVar53 = new C0682a("RecommentMusicByAIPolicy", 52, "recomment_music_by_ai_policy", g.b.Integer, 0, true);
            RecommentMusicByAIPolicy = aVar53;
            C0682a aVar54 = new C0682a("ShowVideoInfo", 53, "show_video_info", g.b.Boolean, Boolean.FALSE, false);
            ShowVideoInfo = aVar54;
            C0682a aVar55 = new C0682a("StickerDetailsEntranceEnable", 54, "sticker_details_entrance_enable", g.b.Boolean, Boolean.FALSE, true);
            StickerDetailsEntranceEnable = aVar55;
            C0682a aVar56 = new C0682a("UseVECompiler", 55, "use_ve_compiler", g.b.Integer, 0, false);
            UseVECompiler = aVar56;
            C0682a aVar57 = new C0682a("EnableOpenGl3", 56, "use_open_gl_three", g.b.Integer, 1, true);
            EnableOpenGl3 = aVar57;
            C0682a aVar58 = new C0682a("EnableEffectParallelFwk", 57, "enable_effect_parallel_fwk", g.b.Boolean, Boolean.FALSE, true);
            EnableEffectParallelFwk = aVar58;
            C0682a aVar59 = new C0682a("EnableInfoSticker", 58, "enable_infosticker", g.b.Boolean, Boolean.FALSE, true);
            EnableInfoSticker = aVar59;
            C0682a aVar60 = new C0682a("EnableParallelSynthesizeUpload", 59, "enable_parallel_synthesize_upload", g.b.Boolean, Boolean.TRUE, true);
            EnableParallelSynthesizeUpload = aVar60;
            C0682a aVar61 = new C0682a("EnablePreUpload", 60, "enable_pre_upload", g.b.Boolean, Boolean.FALSE, true);
            EnablePreUpload = aVar61;
            C0682a aVar62 = new C0682a("BeautyModeSwitch", 61, "beauty_mode_switch", g.b.Boolean, Boolean.FALSE, true);
            BeautyModeSwitch = aVar62;
            C0682a aVar63 = new C0682a("EffectPlatformUseTTNet", 62, "effect_platform_use_ttnet", g.b.Boolean, Boolean.FALSE, true);
            EffectPlatformUseTTNet = aVar63;
            C0682a aVar64 = new C0682a("NeedLoginInBeforeRecord", 63, "need_login_in_before_record", g.b.Boolean, Boolean.TRUE, true);
            NeedLoginInBeforeRecord = aVar64;
            C0682a aVar65 = new C0682a("EnableStickerCollection", 64, "show_sticker_collection", g.b.Boolean, Boolean.FALSE, true);
            EnableStickerCollection = aVar65;
            C0682a aVar66 = new C0682a("EnableSoftEncodeAcc", 65, "enable_soft_encode_acc", g.b.Boolean, Boolean.FALSE, true);
            EnableSoftEncodeAcc = aVar66;
            C0682a aVar67 = new C0682a("EnableFullScreenAdapt", 66, "enable_editor_screen_adaptation", g.b.Boolean, Boolean.FALSE, true);
            EnableFullScreenAdapt = aVar67;
            C0682a aVar68 = new C0682a("ForceAddVideoHead", 67, "force_add_video_head", g.b.Boolean, Boolean.FALSE, true);
            ForceAddVideoHead = aVar68;
            C0682a aVar69 = new C0682a("AmericaRecordOptim", 68, "america_record_optim_new", g.b.Integer, 0, true);
            AmericaRecordOptim = aVar69;
            C0682a aVar70 = new C0682a("UsingMixRecordButton", 69, "use_mix_record_button", g.b.Boolean, Boolean.TRUE, true);
            UsingMixRecordButton = aVar70;
            C0682a aVar71 = new C0682a("NeedRecode", 70, "need_recode", g.b.Boolean, Boolean.FALSE, true);
            NeedRecode = aVar71;
            C0682a aVar72 = new C0682a("StoryPreviewUsingSurfaceView", 71, "is_surface_view_story_preview", g.b.Boolean, Boolean.FALSE, true);
            StoryPreviewUsingSurfaceView = aVar72;
            C0682a aVar73 = new C0682a("EnableFeedbackLog", 72, "enable_feedback_log", g.b.Boolean, Boolean.FALSE, true);
            EnableFeedbackLog = aVar73;
            C0682a aVar74 = new C0682a("VeEditorANRDestroy", 73, "veeditor_anr_destroy", g.b.Boolean, Boolean.FALSE, true);
            VeEditorANRDestroy = aVar74;
            C0682a aVar75 = new C0682a("VideoRecordOpt", 74, "video_record_opt", g.b.Boolean, Boolean.FALSE, true);
            VideoRecordOpt = aVar75;
            C0682a aVar76 = new C0682a("VECutVideoEnable", 75, "enable_ve_cut_video", g.b.Boolean, Boolean.FALSE, true);
            VECutVideoEnable = aVar76;
            C0682a aVar77 = new C0682a("VideoSynthesisOpt", 76, "video_synthesis_opt", g.b.Boolean, Boolean.FALSE, true);
            VideoSynthesisOpt = aVar77;
            C0682a aVar78 = new C0682a("EffectExclusionPattern", 77, "effect_exclusion_pattern", g.b.String, "", true);
            EffectExclusionPattern = aVar78;
            C0682a aVar79 = new C0682a("VESynthesisSettings", 78, "ve_synthesis_settings", g.b.String, "", true);
            VESynthesisSettings = aVar79;
            C0682a aVar80 = new C0682a("VESynthesisSettingsByUploadSpeed", 79, "ve_synthesis_settings_by_upload_speed", g.b.String, "", true);
            VESynthesisSettingsByUploadSpeed = aVar80;
            C0682a aVar81 = new C0682a("VideoStopPlayOpt", 80, "video_stop_play_opt", g.b.Boolean, Boolean.FALSE, true);
            VideoStopPlayOpt = aVar81;
            C0682a aVar82 = new C0682a("EnableRecordTutorial", 81, "shoot_tutorial_switch", g.b.Boolean, Boolean.FALSE, true);
            EnableRecordTutorial = aVar82;
            C0682a aVar83 = new C0682a("LongVideoDefaultUseLong", 82, "default_enable_long_video", g.b.Boolean, Boolean.TRUE, false);
            LongVideoDefaultUseLong = aVar83;
            C0682a aVar84 = new C0682a("VideoLegalCheckInLocal", 83, "video_legal_check_in_local", g.b.Boolean, Boolean.TRUE, true);
            VideoLegalCheckInLocal = aVar84;
            C0682a aVar85 = new C0682a("LongDurationRecordAsTab", 84, "is_long_duration_record_as_tab", g.b.Boolean, Boolean.FALSE, true);
            LongDurationRecordAsTab = aVar85;
            C0682a aVar86 = new C0682a("RecordErrorSimulate", 85, "record_error_occur_simulate", g.b.Integer, -1, true);
            RecordErrorSimulate = aVar86;
            C0682a aVar87 = new C0682a("UseNewPublishShareDescription", 86, "is_publish_share_description", g.b.Boolean, Boolean.FALSE, true);
            UseNewPublishShareDescription = aVar87;
            C0682a aVar88 = new C0682a("EnableSearchGIF", 87, "enable_search_gif", g.b.Boolean, Boolean.FALSE, true);
            EnableSearchGIF = aVar88;
            C0682a aVar89 = new C0682a("VEExtractFramesAfterRender", 88, "ve_extract_frames_after_render", g.b.Boolean, Boolean.FALSE, true);
            VEExtractFramesAfterRender = aVar89;
            C0682a aVar90 = new C0682a("EnableVEFastImport", 89, "enable_ve_fast_import", g.b.Boolean, Boolean.FALSE, true);
            EnableVEFastImport = aVar90;
            C0682a aVar91 = new C0682a("FastImportFpsLimit", 90, "fast_import_fps_limit", g.b.Integer, 40, true);
            FastImportFpsLimit = aVar91;
            C0682a aVar92 = new C0682a("FastImportResolutionLimit", 91, "fast_import_resolution_limit", g.b.String, "720*1280", true);
            FastImportResolutionLimit = aVar92;
            C0682a aVar93 = new C0682a("FastImportGopLimit", 92, "fast_import_gop_limit", g.b.Integer, Integer.valueOf(PushConstants.WORK_RECEIVER_EVENTCORE_ERROR), true);
            FastImportGopLimit = aVar93;
            C0682a aVar94 = new C0682a("EnableSlimVECutProcessor", 93, "enable_slim_ve_cut_processor", g.b.Boolean, Boolean.TRUE, true);
            EnableSlimVECutProcessor = aVar94;
            C0682a aVar95 = new C0682a("CameraOptionFlagsOpt", 94, "camera_option_flags_opt", g.b.Boolean, Boolean.FALSE, true);
            CameraOptionFlagsOpt = aVar95;
            C0682a aVar96 = new C0682a("EnableVENewFrameworkVersion", 95, "enable_ve_new_framework_version", g.b.Boolean, Boolean.FALSE, true);
            EnableVENewFrameworkVersion = aVar96;
            C0682a aVar97 = new C0682a("DefaultPublishPrivacyType", 96, "default_publish_privacy_type", g.b.Integer, 0, true);
            DefaultPublishPrivacyType = aVar97;
            C0682a aVar98 = new C0682a(e.m, 97, "tt_publish_enhancement", g.b.Integer, 0, true);
            TTPublishEnhancement = aVar98;
            C0682a aVar99 = new C0682a("MvThemeRecordMode", 98, "mv_theme_mode_switch", g.b.Boolean, Boolean.FALSE, true);
            MvThemeRecordMode = aVar99;
            C0682a aVar100 = new C0682a("LiveMvTabOrder", 99, "publish_page_live_location", g.b.Integer, 0, true);
            LiveMvTabOrder = aVar100;
            C0682a aVar101 = new C0682a("OpenCameraFrameOptimize", 100, "open_camera_frame_optimize", g.b.Boolean, Boolean.FALSE, true);
            OpenCameraFrameOptimize = aVar101;
            C0682a aVar102 = new C0682a("OpenCameraFrameOptimizeSDK", BaseLoginOrRegisterActivity.o, "open_camera_frame_optimize_sdk", g.b.Boolean, Boolean.FALSE, true);
            OpenCameraFrameOptimizeSDK = aVar102;
            C0682a aVar103 = new C0682a("OpenCameraFrameOptimizePreLoadSo", 102, "open_camera_frame_optimize_pre_load_so", g.b.Boolean, Boolean.FALSE, true);
            OpenCameraFrameOptimizePreLoadSo = aVar103;
            C0682a aVar104 = new C0682a("EnableTextStickerInMain", 103, "enable_text_sticker_in_main", g.b.Boolean, Boolean.FALSE, true);
            EnableTextStickerInMain = aVar104;
            C0682a aVar105 = new C0682a("EnableVoiceConversion", 104, "studio_enable_editpage_voicechanger", g.b.Boolean, Boolean.FALSE, true);
            EnableVoiceConversion = aVar105;
            C0682a aVar106 = new C0682a("OpenStickerRecordWithMusic", 105, "open_sticker_record_with_music", g.b.Boolean, Boolean.FALSE, true);
            OpenStickerRecordWithMusic = aVar106;
            C0682a aVar107 = new C0682a("OpenMusicRecordWithSticker", 106, "open_music_record_with_sticker", g.b.Boolean, Boolean.FALSE, true);
            OpenMusicRecordWithSticker = aVar107;
            C0682a aVar108 = new C0682a("EnableVideoEditActivityUploadSpeedProbe", 107, "enable_video_edit_activity_upload_speed_probe", g.b.Boolean, Boolean.FALSE, true);
            EnableVideoEditActivityUploadSpeedProbe = aVar108;
            C0682a aVar109 = new C0682a("EnableMVThemePreUpload", 108, "enable_mv_theme_pre_upload", g.b.Boolean, Boolean.FALSE, true);
            EnableMVThemePreUpload = aVar109;
            C0682a aVar110 = new C0682a("EnableEffectNewEngine", 109, "enable_effect_new_engine", g.b.Boolean, Boolean.FALSE, true);
            EnableEffectNewEngine = aVar110;
            C0682a aVar111 = new C0682a("EnableTT265Decoder", 110, "enable_tt_265_decoder", g.b.Boolean, Boolean.FALSE, true);
            EnableTT265Decoder = aVar111;
            C0682a aVar112 = new C0682a("EnableEnhanceVolume", 111, "enable_enhance_volume", g.b.Boolean, Boolean.FALSE, true);
            EnableEnhanceVolume = aVar112;
            C0682a aVar113 = new C0682a("EditPageMusicPanelOptimization", SearchJediMixFeedAdapter.f42516e, "edit_page_music_panel_optimization", g.b.Integer, 0, true);
            EditPageMusicPanelOptimization = aVar113;
            C0682a aVar114 = new C0682a("VEConfigOptLevel", 113, "ve_sdk_config_level", g.b.Integer, 0, true);
            VEConfigOptLevel = aVar114;
            C0682a aVar115 = new C0682a("DuetFixNewPlan", 114, "enable_duet_fix_new_plan", g.b.Boolean, Boolean.TRUE, true);
            DuetFixNewPlan = aVar115;
            C0682a aVar116 = new C0682a("UlikeBeautyAbGroup", 115, "studio_recorder_beautify_effects_group", g.b.Integer, 0, true);
            UlikeBeautyAbGroup = aVar116;
            C0682a aVar117 = new C0682a("EnableSilentShareOptimize", 116, "enable_silent_share_optimize", g.b.Boolean, Boolean.TRUE, true);
            EnableSilentShareOptimize = aVar117;
            C0682a aVar118 = new C0682a("RemoveStoryStrategy", 117, "remove_story_strategy", g.b.Integer, 0, true);
            RemoveStoryStrategy = aVar118;
            C0682a aVar119 = new C0682a("EnableEditPageMemoryOpt", 118, "enable_edit_page_memory_opt", g.b.Boolean, Boolean.FALSE, true);
            EnableEditPageMemoryOpt = aVar119;
            C0682a aVar120 = new C0682a("EnableStoryCameraOpt", 119, "enable_story_camera_opt", g.b.Boolean, Boolean.FALSE, true);
            EnableStoryCameraOpt = aVar120;
            C0682a aVar121 = new C0682a("EnableEditPageMVMemoryOpt", 120, "enable_edit_page_mv_memory_opt", g.b.Boolean, Boolean.FALSE, true);
            EnableEditPageMVMemoryOpt = aVar121;
            C0682a aVar122 = new C0682a("RememberLastRecordDuration", 121, "remember_last_record_duration", g.b.Boolean, Boolean.FALSE, true);
            RememberLastRecordDuration = aVar122;
            C0682a aVar123 = new C0682a("EditPagePrompt", 122, "edit_page_prompt", g.b.Boolean, Boolean.FALSE, true);
            EditPagePrompt = aVar123;
            C0682a aVar124 = new C0682a("EnableUserVeRecoder", 123, "enable_use_ve_recoder", g.b.Boolean, Boolean.FALSE, true);
            EnableUserVeRecoder = aVar124;
            C0682a aVar125 = new C0682a("FilterDownloaderUseTTNet", 124, "filter_downloader_use_ttnet", g.b.Boolean, Boolean.FALSE, true);
            FilterDownloaderUseTTNet = aVar125;
            C0682a aVar126 = new C0682a("EnableMBlackPanel", 125, "enable_m_black_panel", g.b.Boolean, Boolean.FALSE, true);
            EnableMBlackPanel = aVar126;
            C0682a aVar127 = new C0682a("OpenSDKQAdaption", 126, "open_sdk_Q_adaption", g.b.Boolean, Boolean.TRUE, true);
            OpenSDKQAdaption = aVar127;
            C0682a aVar128 = new C0682a("SDKQAdaptionConfig", 127, "sdk_Q_adaption", g.b.Boolean, Boolean.FALSE, true);
            SDKQAdaptionConfig = aVar128;
            C0682a aVar129 = new C0682a("EnableEffectDiskCache", SearchJediMixFeedAdapter.f42517f, "use_effect_lru_cache", g.b.Boolean, Boolean.FALSE, true);
            EnableEffectDiskCache = aVar129;
            $VALUES = new C0682a[]{UseNewEdit, OwnFaceDetect, PhotoEditEnabled, RecordBitrateCategoryIndex, RecordQualityCategoryIndex, PrivatePrompt, DisableMusicDetailRecordShowUpload, QuietlySynthetic, VideoSizeIndex, ImportVideoSizeIndex, SmoothMax, SmoothDefault, ReshapeMax, ReshapeDefault, ContourMax, ContourDefault, ColorFilterPanel, EnableReuseFaceSticker, PhotoMovieEnabled, NewEditPage, ShowAutoImproveButtonInEditPage, LightEnhanceBlackList, CanShowPublishFriendGuide, EyesMax, EyesDefault, ShapeMax, ShapeDefault, BeautificationIconStyle, SplitFilterBeauty, RearCamera, RecordHardwareProfile, EnableSaveUploadVideo, EnableInstagramSilentShare, EnableUploadFallback, UploadOptimizeForPie, UseContourSlider, AddTextInMusically, EnableExposureOptimize, RecordCameraTypeAB, RecordCameraCompatLevelAB, UploadSpeedProbeSize, UploadSpeedProbeMinGap, UploadSpeedProbeTimeOut, SyntheticVideoQuality, SyntheticVideoMaxRate, SyntheticVideoPreset, SyntheticVideoGop, VideoBitrate, SyntheticVideoBitrate, ShareVideo2GifEditable, UseEffectCam, LoadLibraryFromExternal, RecommentMusicByAIPolicy, ShowVideoInfo, StickerDetailsEntranceEnable, UseVECompiler, EnableOpenGl3, EnableEffectParallelFwk, EnableInfoSticker, EnableParallelSynthesizeUpload, EnablePreUpload, BeautyModeSwitch, EffectPlatformUseTTNet, NeedLoginInBeforeRecord, EnableStickerCollection, EnableSoftEncodeAcc, EnableFullScreenAdapt, ForceAddVideoHead, AmericaRecordOptim, UsingMixRecordButton, NeedRecode, StoryPreviewUsingSurfaceView, EnableFeedbackLog, VeEditorANRDestroy, VideoRecordOpt, VECutVideoEnable, VideoSynthesisOpt, EffectExclusionPattern, VESynthesisSettings, VESynthesisSettingsByUploadSpeed, VideoStopPlayOpt, EnableRecordTutorial, LongVideoDefaultUseLong, VideoLegalCheckInLocal, LongDurationRecordAsTab, RecordErrorSimulate, UseNewPublishShareDescription, EnableSearchGIF, VEExtractFramesAfterRender, EnableVEFastImport, FastImportFpsLimit, FastImportResolutionLimit, FastImportGopLimit, EnableSlimVECutProcessor, CameraOptionFlagsOpt, EnableVENewFrameworkVersion, DefaultPublishPrivacyType, TTPublishEnhancement, MvThemeRecordMode, LiveMvTabOrder, OpenCameraFrameOptimize, OpenCameraFrameOptimizeSDK, OpenCameraFrameOptimizePreLoadSo, EnableTextStickerInMain, EnableVoiceConversion, OpenStickerRecordWithMusic, OpenMusicRecordWithSticker, EnableVideoEditActivityUploadSpeedProbe, EnableMVThemePreUpload, EnableEffectNewEngine, EnableTT265Decoder, EnableEnhanceVolume, EditPageMusicPanelOptimization, VEConfigOptLevel, DuetFixNewPlan, UlikeBeautyAbGroup, EnableSilentShareOptimize, RemoveStoryStrategy, EnableEditPageMemoryOpt, EnableStoryCameraOpt, EnableEditPageMVMemoryOpt, RememberLastRecordDuration, EditPagePrompt, EnableUserVeRecoder, FilterDownloaderUseTTNet, EnableMBlackPanel, OpenSDKQAdaption, SDKQAdaptionConfig, EnableEffectDiskCache};
        }

        private C0682a(String str, g.b bVar, Object obj, boolean z) {
            this(r9, r10, str, bVar, obj, null, z);
        }

        private C0682a(String str, g.b bVar, Object obj, i<?> iVar, boolean z) {
            Object checkDefValue = checkDefValue(bVar, obj);
            this.key = str;
            this.type = bVar;
            this.defVal = checkDefValue;
            this.valueRange = iVar;
            this.supportPersist = z;
        }
    }

    public final synchronized boolean a(C0682a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63261a, false, 70179, new Class[]{C0682a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63261a, false, 70179, new Class[]{C0682a.class}, Boolean.TYPE)).booleanValue();
        }
        return this.f63263c.a(aVar);
    }

    public a(Context context) {
        this.f63262b = c.a(context, "av_ab.xml", 0);
    }

    public final synchronized int b(C0682a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63261a, false, 70181, new Class[]{C0682a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63261a, false, 70181, new Class[]{C0682a.class}, Integer.TYPE)).intValue();
        }
        return this.f63263c.b(aVar);
    }

    public final synchronized long c(C0682a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63261a, false, 70183, new Class[]{C0682a.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63261a, false, 70183, new Class[]{C0682a.class}, Long.TYPE)).longValue();
        }
        return this.f63263c.c(aVar);
    }

    public final synchronized float d(C0682a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63261a, false, 70185, new Class[]{C0682a.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63261a, false, 70185, new Class[]{C0682a.class}, Float.TYPE)).floatValue();
        }
        return this.f63263c.d(aVar);
    }

    public final synchronized String e(C0682a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63261a, false, 70187, new Class[]{C0682a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, this, f63261a, false, 70187, new Class[]{C0682a.class}, String.class);
        }
        return this.f63263c.e(aVar);
    }

    public final synchronized void a(C0682a aVar, float f2) {
        if (PatchProxy.isSupport(new Object[]{aVar, Float.valueOf(f2)}, this, f63261a, false, 70186, new Class[]{C0682a.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Float.valueOf(f2)}, this, f63261a, false, 70186, new Class[]{C0682a.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f63263c.a((g.a) aVar, f2);
    }

    public final synchronized void a(C0682a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f63261a, false, 70182, new Class[]{C0682a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f63261a, false, 70182, new Class[]{C0682a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f63263c.a((g.a) aVar, i);
    }

    public final synchronized void a(C0682a aVar, long j) {
        C0682a aVar2 = aVar;
        long j2 = j;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{aVar2, new Long(j2)}, this, f63261a, false, 70184, new Class[]{C0682a.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2, new Long(j2)}, this, f63261a, false, 70184, new Class[]{C0682a.class, Long.TYPE}, Void.TYPE);
                return;
            }
            this.f63263c.a((g.a) aVar, j2);
        }
    }

    public final synchronized void a(C0682a aVar, String str) {
        if (PatchProxy.isSupport(new Object[]{aVar, str}, this, f63261a, false, 70188, new Class[]{C0682a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, str}, this, f63261a, false, 70188, new Class[]{C0682a.class, String.class}, Void.TYPE);
            return;
        }
        this.f63263c.a((g.a) aVar, str);
    }

    public final synchronized void a(C0682a aVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63261a, false, 70180, new Class[]{C0682a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, f63261a, false, 70180, new Class[]{C0682a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f63263c.a((g.a) aVar, z);
    }
}
