package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.draft.a.a;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.draft.a.e;
import com.ss.android.ugc.aweme.draft.a.f;
import com.ss.android.ugc.aweme.draft.a.i;
import com.ss.android.ugc.aweme.draft.l;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.ah;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.r;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.File;
import java.util.List;

public final class cc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67163a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final String f67164b;

    public cc(@NonNull String str) {
        this.f67164b = str;
    }

    private static e b(cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f67163a, true, 76582, new Class[]{cb.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f67163a, true, 76582, new Class[]{cb.class}, e.class);
        } else if (cbVar2 == null || cbVar2.veCherEffectParam == null) {
            return null;
        } else {
            return new e(cbVar2.veCherEffectParam.getMatrix(), cbVar2.veCherEffectParam.getDuration(), cbVar2.veCherEffectParam.getSegUseCher());
        }
    }

    private static i c(cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f67163a, true, 76583, new Class[]{cb.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f67163a, true, 76583, new Class[]{cb.class}, i.class);
        } else if (cbVar2 == null || cbVar2.veAudioEffectParam == null) {
            return null;
        } else {
            i iVar = new i(cbVar2.veAudioEffectParam.getTrackType(), cbVar2.veAudioEffectParam.getTrackIndex(), cbVar2.veAudioEffectParam.getEffectPath(), cbVar2.veAudioEffectParam.getEffectTag(), cbVar2.veAudioEffectParam.getSeqIn(), cbVar2.veAudioEffectParam.getSeqOut());
            return iVar;
        }
    }

    private static AudioEffectParam d(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f67163a, true, 76581, new Class[]{c.class}, AudioEffectParam.class)) {
            return (AudioEffectParam) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f67163a, true, 76581, new Class[]{c.class}, AudioEffectParam.class);
        } else if (cVar2 == null || cVar2.T == null || cVar.R() == null) {
            return null;
        } else {
            i R = cVar.R();
            AudioEffectParam audioEffectParam = new AudioEffectParam(R.f43451b, R.f43452c, R.f43453d, R.f43454e, R.f43455f, R.g, null);
            return audioEffectParam;
        }
    }

    public final cb a(Intent intent) {
        float f2;
        float f3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f67163a, false, 76576, new Class[]{Intent.class}, cb.class)) {
            return (cb) PatchProxy.accessDispatch(new Object[]{intent2}, this, f67163a, false, 76576, new Class[]{Intent.class}, cb.class);
        }
        cb b2 = b(intent);
        if (b2.getDuetFrom() != null) {
            f2 = 1.0f;
        } else {
            f2 = intent2.getFloatExtra("music_volume", 0.5f);
        }
        b2.musicVolume = f2;
        if (b2.isMuted) {
            f3 = 0.0f;
        } else {
            f3 = intent2.getFloatExtra("voice_volume", 0.5f);
        }
        b2.voiceVolume = f3;
        return b2;
    }

    private void b(c cVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f67163a, false, 76578, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f67163a, false, 76578, new Class[]{c.class}, Void.TYPE);
            return;
        }
        File file = new File(cVar.f());
        if (!file.exists()) {
            i = -1;
        } else if (file.length() == 0) {
            i = -9;
        }
        if (i != 0 && !cVar.I()) {
            n.a("aweme_draft_load_fail_rate", 1, com.ss.android.ugc.aweme.app.d.c.a().a("owner", this.f67164b).a("validity", String.valueOf(i)).a("videoPath", file.getPath()).a("is_fast_import", Boolean.valueOf(cVar.M())).b());
        }
    }

    private static ah c(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f67163a, true, 76580, new Class[]{c.class}, ah.class)) {
            return (ah) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f67163a, true, 76580, new Class[]{c.class}, ah.class);
        } else if (cVar2 == null || cVar2.T == null || cVar.Q() == null) {
            return null;
        } else {
            e Q = cVar.Q();
            return new ah(Q.f43440b, Q.f43441c, Q.f43442d);
        }
    }

    public final c a(cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, this, f67163a, false, 76577, new Class[]{cb.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{cbVar2}, this, f67163a, false, 76577, new Class[]{cb.class}, c.class);
        }
        c cVar = new c();
        cVar.f(cbVar.getNewVersion());
        cVar.b(cbVar2.mPath);
        a aVar = new a();
        aVar.f43423a = cbVar2.title;
        aVar.f43425c = cbVar2.challenges;
        aVar.f43426d = cbVar.getVideoLength();
        aVar.f43424b = cbVar.getStructList();
        cVar.f43435c = aVar;
        cVar.j(com.ss.android.ugc.aweme.port.in.a.m.a(cbVar2.poiId));
        cVar.f43438f = ej.a().b();
        cVar.h = cbVar2.mMusicPath;
        cVar.m = cbVar2.mMusicStart;
        cVar.e(cbVar2.mMusicEnd);
        cVar.g(cbVar2.mMusicOrigin);
        cVar.i = cbVar2.mWavFile;
        cVar.l = cbVar.getFilterIndex();
        cVar.B = cbVar2.mFaceBeauty;
        cVar.t = cbVar2.mCameraPosition;
        cVar.s = cbVar2.mCurFilterLabels;
        cVar.a(cbVar2.mCurFilterIds);
        cVar.o = cbVar2.mOrigin;
        cVar.C = com.ss.android.ugc.aweme.port.in.a.x.d();
        cVar.E = cbVar2.mVideoSegmentsDesc;
        cVar.F = cbVar2.mHardEncode;
        cVar.I = cbVar2.mStickerID;
        cVar.a(cbVar2.defaultSelectStickerPoi);
        cVar.d(cbVar.getVideoCoverPath());
        cVar.u = cbVar2.faceBeautyOpen ? 1 : 0;
        cVar.p = cbVar2.mReversePath;
        cVar.y = cbVar2.isPrivate;
        cVar.g(cbVar2.commentSetting);
        cVar.A = cbVar2.maxDuration;
        cVar.r = cbVar2.audioTrack;
        cVar.q = cbVar2.videoSpeed;
        cVar.P = cbVar2.mVideoHeight;
        cVar.O = cbVar2.mVideoWidth;
        cVar.a(cbVar2.mOutVideoWidth);
        cVar.b(cbVar2.mOutVideoHeight);
        cVar.c(cbVar2.mVideoCanvasWidth);
        cVar.d(cbVar2.mVideoCanvasHeight);
        EffectListModel effectListModel = new EffectListModel();
        effectListModel.setEffectPointModels(cbVar2.mEffectList);
        cVar.z = effectListModel;
        cVar.n = cbVar.getEffect();
        cVar.G = cbVar.getSpecialPoints();
        cVar.f(cbVar2.mOutPutWavFile);
        cVar.a(cbVar2.mVideoCoverStartTm);
        cVar.Q = cbVar2.mDuetFrom;
        cVar.R = cbVar2.mSyncPlatforms;
        cVar.h(cbVar.getFrom());
        cVar.i(cbVar2.mShootMode);
        cVar.k(cbVar2.microAppId);
        cVar.a(cbVar2.microAppModel);
        cVar.h(cbVar2.creationId);
        cVar.l(cbVar2.draftId);
        cVar.i(cbVar2.mShootWay);
        cVar.f(cbVar2.autoEnhanceOn);
        cVar.n(cbVar2.autoEnhanceType);
        cVar.a(cbVar2.mDurationMode);
        cVar.b(cbVar2.mIsMultiVideo);
        cVar.a(cbVar2.reactionParams);
        cVar.c(cbVar2.isMuted);
        cVar.j(cbVar2.recordMode);
        cVar.k(cbVar2.gameScore);
        cVar.a(cbVar2.extractFramesModel);
        cVar.a(cbVar2.mSaveModel);
        cVar.a(cbVar2.infoStickerModel);
        cVar.m(cbVar2.videoType);
        cVar.a(cbVar2.texts);
        cVar.d(cbVar2.usePaint);
        cVar.a(cbVar2.socialModel);
        if (cbVar.getNewVersion() == 3) {
            cVar.k = (int) (cbVar2.musicVolume * 100.0f);
            cVar.j = (int) (cbVar2.voiceVolume * 100.0f);
        }
        g.a(r.a((BaseShortVideoContext) cbVar), r.a(cVar.T), com.ss.android.ugc.aweme.tools.a.e.PUBLISH, com.ss.android.ugc.aweme.tools.a.e.DRAFT);
        cVar.T.q = cbVar2.poiData;
        cVar.T.I = cbVar2.mFirstStickerMusicIdsJson;
        cVar.l(cbVar2.commerceData);
        if (cbVar2.previewConfigure != null) {
            cVar.a(cbVar2.previewConfigure.transform());
        }
        cVar.e(cbVar2.isFastImport);
        cVar.m(cbVar2.fastImportResolution);
        cVar.a(cbVar2.mvCreateVideoData);
        cVar.a(cbVar2.uploadMiscInfoStruct);
        if (cbVar2.draftEditTransferModel != null) {
            cVar.a(cbVar2.draftEditTransferModel.getCreateTime());
            cVar.f43437e = cbVar2.draftEditTransferModel.getPrimaryKey();
            if (cbVar2.draftEditTransferModel.getVideoSegmentsCopy() != null) {
                cVar.b(cbVar2.draftEditTransferModel.getVideoSegmentsCopy());
            }
        } else {
            cVar.a(System.currentTimeMillis());
        }
        cbVar2.draftEditTransferModel = new f(cVar.S(), cVar.O(), cVar.T());
        cVar.a(b(cbVar));
        cVar.a(c(cbVar));
        b(cVar);
        return cVar;
    }

    private cb b(Intent intent) {
        File file;
        String str;
        int i;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        float f2;
        float f3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f67163a, false, 76575, new Class[]{Intent.class}, cb.class)) {
            return (cb) PatchProxy.accessDispatch(new Object[]{intent2}, this, f67163a, false, 76575, new Class[]{Intent.class}, cb.class);
        }
        cb cbVar = new cb();
        cbVar.setAvetParameter(AVETParameterKt.generateAVETParam(intent));
        cbVar.previewConfigure = (VEPreviewConfigure) intent2.getParcelableExtra("extra_ve_preview_configure");
        cbVar.mWorkspace = (d) intent2.getParcelableExtra("workspace");
        if (cbVar.mWorkspace == null) {
            cbVar.mWorkspace = d.a();
        }
        d dVar = cbVar.mWorkspace;
        if (PatchProxy.isSupport(new Object[0], dVar, d.f65442a, false, 74947, new Class[0], File.class)) {
            file = (File) PatchProxy.accessDispatch(new Object[0], dVar, d.f65442a, false, 74947, new Class[0], File.class);
        } else {
            file = dVar.f65443b.d();
        }
        cbVar.mReversePath = file.getPath();
        cbVar.mFromCut = intent2.getBooleanExtra("fromCut", false);
        cbVar.mFromMultiCut = intent2.getBooleanExtra("fromMultiCut", false);
        String stringExtra = intent2.getStringExtra("extra_record_contact_video_path");
        String stringExtra2 = intent2.getStringExtra("extra_record_contact_audio_path");
        if (TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra)) {
            stringExtra = cbVar.mWorkspace.c().getPath();
            stringExtra2 = cbVar.mWorkspace.d().getPath();
        }
        cbVar.mPath = stringExtra;
        cbVar.mWavFile = stringExtra2;
        if (cbVar.previewConfigure != null && !cbVar.previewConfigure.getVideoSegments().isEmpty()) {
            VEVideoSegment vEVideoSegment = (VEVideoSegment) cbVar.previewConfigure.getVideoSegments().get(0);
            if (vEVideoSegment != null) {
                cbVar.mPath = vEVideoSegment.videoPath;
                cbVar.mWavFile = vEVideoSegment.audioPath;
            }
        }
        cbVar.mDir = intent2.getStringExtra("dir");
        if (TextUtils.isEmpty(cbVar.mDir)) {
            str = ff.f67717f;
        } else {
            str = cbVar.mDir;
        }
        cbVar.mDir = str;
        cbVar.mEncodedAudioOutputFile = cbVar.mWorkspace.k().getPath();
        cbVar.mParallelUploadOutputFile = cbVar.mWorkspace.l().getPath();
        cbVar.mFaceBeauty = intent2.getIntExtra("face_beauty", 0);
        cbVar.faceBeautyOpen = intent2.getBooleanExtra("face_beauty_open", false);
        cbVar.mSelectedId = intent2.getIntExtra("filter_id", 0);
        cbVar.mCameraPosition = intent2.getIntExtra("camera", 0);
        cbVar.mCurFilterLabels = intent2.getStringExtra("filter_lables");
        cbVar.mCurFilterIds = intent2.getStringExtra("filter_ids");
        cbVar.mSmoothSkinLabels = intent2.getStringExtra("smooth_skin_labels");
        cbVar.mReshapeLabels = intent2.getStringExtra("smooth_reshape_labels");
        cbVar.mTanningLabels = intent2.getStringExtra("smooth_tanning_labels");
        cbVar.mEyesLabels = intent2.getStringExtra("smooth_eyes_labels");
        cbVar.videoSpeed = intent2.getStringExtra("extra_aweme_speed");
        if (cbVar.mWorkspace.e() != null) {
            cbVar.mMusicPath = cbVar.mWorkspace.e().getPath();
            cbVar.mMusicStart = intent2.getIntExtra("music_start", 0);
            cbVar.mMusicEnd = intent2.getIntExtra("extra_music_end", 0);
        }
        cbVar.mOutputFile = cbVar.mWorkspace.j().getPath();
        if (intent2.getBooleanExtra("enable_music_path_check", true) && cbVar.mMusicPath == null) {
            ej.a().a((com.ss.android.ugc.aweme.shortvideo.e) null);
        }
        cbVar.maxDuration = intent2.getLongExtra("max_duration", ea.f66827f);
        cbVar.audioTrack = (UrlModel) intent2.getSerializableExtra("wav_form");
        if (!cbVar.mFromCut) {
            cbVar.mVideoSegmentsDesc = intent2.getStringExtra("video_segment");
        }
        cbVar.mHardEncode = intent2.getIntExtra("hard_encode", 0);
        cbVar.mStickerPath = intent2.getStringExtra("sticker_path");
        cbVar.mStickerID = intent2.getStringExtra("sticker_id");
        cbVar.defaultSelectStickerPoi = (com.ss.android.ugc.aweme.draft.a.d) intent2.getSerializableExtra("default_select_sticker_poi");
        cbVar.mPropSource = intent2.getStringExtra("prop_source");
        cbVar.mFirstStickerMusicIdsJson = intent2.getStringExtra("first_sticker_music_ids");
        cbVar.mRestoreType = intent2.getIntExtra("restore", 0);
        if (cbVar.mSelectedId == 0) {
            i = 1;
        } else {
            i = 0;
        }
        cbVar.mUseFilter = i;
        cbVar.mWillGoOnShortVideo = intent2.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", false);
        cbVar.mShootWay = intent2.getStringExtra("shoot_way");
        cbVar.mIsFromDraft = intent2.getBooleanExtra("isFromDraft", false);
        if (cbVar.mIsFromDraft) {
            cbVar.mVideoCanvasWidth = intent2.getIntExtra("extra_video_canvas_width", 0);
            cbVar.mVideoCanvasHeight = intent2.getIntExtra("extra_video_canvas_height", 0);
        }
        float f4 = 0.0f;
        cbVar.mVideoCoverStartTm = intent2.getFloatExtra("videoCoverStartTm", 0.0f);
        cbVar.generateVideoCoverPath();
        cbVar.mEffectList = intent2.getParcelableArrayListExtra("effectList");
        cbVar.mTimeEffect = (EffectPointModel) intent2.getParcelableExtra("time_effect");
        if (cbVar.getOriginal() == 0) {
            iVideoConfigService = com.ss.android.ugc.aweme.port.in.a.r;
        } else {
            iVideoConfigService = com.ss.android.ugc.aweme.port.in.a.q;
        }
        cbVar.mVideoWidth = intent2.getIntExtra("video_width", iVideoConfigService.getVideoWidth());
        if (cbVar.getOriginal() == 0) {
            iVideoConfigService2 = com.ss.android.ugc.aweme.port.in.a.r;
        } else {
            iVideoConfigService2 = com.ss.android.ugc.aweme.port.in.a.q;
        }
        cbVar.mVideoHeight = intent2.getIntExtra("video_height", iVideoConfigService2.getVideoHeight());
        cbVar.mOrigin = intent2.getIntExtra("origin", 0);
        cbVar.challenges = (List) intent2.getSerializableExtra("challenge");
        cbVar.mDuetFrom = intent2.getStringExtra("duet_from");
        cbVar.mDuetAuthor = (User) intent2.getSerializableExtra("duet_author");
        cbVar.mSyncPlatforms = intent2.getStringExtra("sync_platform");
        cbVar.mIsHuaweiSuperSlow = intent2.getBooleanExtra("is_huawei_super_slow", false);
        cbVar.mShootMode = intent2.getIntExtra("shoot_mode", 0);
        cbVar.creationId = intent2.getStringExtra("creation_id");
        cbVar.draftId = intent2.getIntExtra("draft_id", 0);
        if (cbVar.getWavFile() == null) {
            f2 = 0.0f;
        } else {
            f2 = 0.5f;
        }
        cbVar.voiceVolume = f2;
        if (cbVar.mDuetFrom != null) {
            f3 = 1.0f;
        } else if (cbVar.isMusic() > 0) {
            f3 = 0.5f;
        } else {
            f3 = 0.0f;
        }
        cbVar.musicVolume = f3;
        cbVar.title = intent2.getStringExtra("video_title");
        cbVar.isPrivate = intent2.getIntExtra("is_rivate", 0);
        cbVar.commentSetting = intent2.getIntExtra("comment_setting", 0);
        cbVar.structList = (List) intent2.getSerializableExtra("struct_list");
        cbVar.mDurationMode = intent2.getBooleanExtra("duration_mode", false);
        cbVar.mIsMultiVideo = intent2.getBooleanExtra("upload_video_type", false);
        cbVar.autoEnhanceType = intent2.getIntExtra("extra_auto_enhance_type", 0);
        cbVar.autoEnhanceOn = intent2.getBooleanExtra("extra_auto_enhance_state", false);
        cbVar.poiId = intent2.getStringExtra("poi_struct_in_tools_line");
        g.a(intent2, r.b((BaseShortVideoContext) cbVar));
        cbVar.reactionParams = (com.ss.android.ugc.aweme.shortvideo.i.i) intent2.getParcelableExtra("reaction_params");
        cbVar.isMuted = intent2.getBooleanExtra("is_muted", false);
        if (!cbVar.isMuted) {
            f4 = cbVar.voiceVolume;
        }
        cbVar.voiceVolume = f4;
        cbVar.recordMode = intent2.getIntExtra("record_mode", 0);
        cbVar.gameScore = intent2.getIntExtra("record_game_score", 0);
        cbVar.mMusicOrigin = intent2.getStringExtra("music_origin");
        cbVar.microAppId = intent2.getStringExtra("micro_app_id");
        cbVar.microAppModel = (q) intent2.getSerializableExtra("micro_app_info");
        cbVar.extractFramesModel = (ExtractFramesModel) intent2.getSerializableExtra("extract_model");
        cbVar.infoStickerModel = (com.ss.android.ugc.aweme.n.a) intent2.getParcelableExtra("infosticker_model");
        cbVar.md5 = intent2.getStringExtra("md5");
        cbVar.storyFestivalModel = (StoryFestivalModel) intent2.getParcelableExtra("story_festival_model");
        if (intent2.hasExtra("extra_import_video_info_list")) {
            cbVar.importInfoList = intent2.getParcelableArrayListExtra("extra_import_video_info_list");
        }
        cbVar.enterFrom = intent2.getStringExtra("enter_from");
        cbVar.sendToUserHead = (UrlModel) intent2.getSerializableExtra("send_to_user_head");
        cbVar.isFastImport = intent2.getBooleanExtra("extra_av_is_fast_import", false);
        cbVar.fastImportErrorCode = intent2.getIntExtra("extra_fast_import_error_code", -1);
        cbVar.fastImportResolution = intent2.getStringExtra("extra_av_enable_fast_import_resolution");
        if (intent2.hasExtra("extra_share_context")) {
            w wVar = (w) intent2.getSerializableExtra("extra_share_context");
            if (wVar != null) {
                wVar.mAppName = intent2.getStringExtra("extra_share_app_name");
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e eVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e();
            eVar.setShareContext(wVar);
            cbVar.mainBusinessData = com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().toJson((Object) eVar);
        }
        if (intent2.hasExtra("extra_mention_user_model")) {
            cbVar.mentionUserModel = (ExtraMentionUserModel) intent2.getSerializableExtra("extra_mention_user_model");
        }
        if (intent2.hasExtra("extra_ar_text")) {
            cbVar.arTextList = intent2.getStringArrayListExtra("extra_ar_text");
        }
        if (intent2.hasExtra("extra_sticker_text")) {
            cbVar.messageBubbleTexts = intent2.getStringArrayListExtra("extra_sticker_text");
        }
        if (intent2.hasExtra("extra_draft_transform_model")) {
            cbVar.draftEditTransferModel = (f) intent2.getParcelableExtra("extra_draft_transform_model");
        }
        if (intent2.hasExtra("av_upload_struct")) {
            cbVar.uploadMiscInfoStruct = (j) intent2.getSerializableExtra("av_upload_struct");
        }
        if (intent2.hasExtra("key_mv_theme_data")) {
            cbVar.mvCreateVideoData = (com.ss.android.ugc.aweme.x.a) intent2.getSerializableExtra("key_mv_theme_data");
            if (cbVar.mvCreateVideoData != null) {
                if (cbVar.mvCreateVideoData.mvType == 1) {
                    cbVar.videoEditorType = 3;
                } else {
                    cbVar.videoEditorType = 2;
                }
                cbVar.mVideoWidth = 720;
                cbVar.mVideoHeight = 1280;
            }
        }
        if (intent2.hasExtra("extra_ve_cher_effect_param")) {
            cbVar.veCherEffectParam = (ah) intent2.getParcelableExtra("extra_ve_cher_effect_param");
        }
        if (intent2.hasExtra("extra_ve_audio_effect_param")) {
            cbVar.veAudioEffectParam = (AudioEffectParam) intent2.getParcelableExtra("extra_ve_audio_effect_param");
        }
        return cbVar;
    }

    public final cb a(c cVar) {
        boolean z;
        boolean z2;
        String str;
        float f2;
        c cVar2 = cVar;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f67163a, false, 76579, new Class[]{c.class}, cb.class)) {
            return (cb) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f67163a, false, 76579, new Class[]{c.class}, cb.class);
        }
        cb cbVar = new cb();
        cbVar.mDir = fg.f67717f;
        if (cVar.I()) {
            cbVar.mvCreateVideoData = cVar.H();
            if (cbVar.mvCreateVideoData == null || cbVar.mvCreateVideoData.mvType != 1) {
                cbVar.videoEditorType = 2;
            } else {
                cbVar.videoEditorType = 3;
            }
            cbVar.uploadMiscInfoStruct = cVar.K();
        }
        if (cVar.L() != null) {
            cbVar.previewConfigure = new VEPreviewConfigure(cVar.L());
        }
        cbVar.isFastImport = cVar.M();
        cbVar.fastImportResolution = cVar.N();
        cbVar.mPath = cVar.f();
        cbVar.mWavFile = cVar2.i;
        if (cbVar.previewConfigure != null && !cbVar.previewConfigure.getVideoSegments().isEmpty()) {
            VEVideoSegment vEVideoSegment = (VEVideoSegment) cbVar.previewConfigure.getVideoSegments().get(0);
            if (vEVideoSegment != null) {
                cbVar.mPath = vEVideoSegment.videoPath;
                cbVar.mWavFile = vEVideoSegment.audioPath;
            }
        }
        cbVar.mOutputFile = new r().a(cbVar.mPath);
        cbVar.title = cVar2.f43435c.f43423a;
        cbVar.challenges = cVar2.f43435c.f43425c;
        cbVar.structList = cVar2.f43435c.f43424b;
        cbVar.musicId = com.ss.android.ugc.aweme.imported.e.a(cVar2.f43438f);
        cbVar.mMusicPath = cVar2.h;
        cbVar.mMusicStart = cVar2.m;
        cbVar.mMusicEnd = cVar.g();
        cbVar.mMusicOrigin = cVar.n();
        cbVar.mSelectedId = cVar2.l;
        cbVar.mFaceBeauty = cVar2.B;
        cbVar.mCameraPosition = cVar2.t;
        cbVar.mCurFilterLabels = cVar2.s;
        cbVar.mCurFilterIds = cVar.a();
        cbVar.mOrigin = cVar2.o;
        cbVar.mVideoSegmentsDesc = cVar2.E;
        cbVar.mHardEncode = cVar2.F;
        cbVar.mStickerID = cVar2.I;
        cbVar.defaultSelectStickerPoi = cVar.h();
        cbVar.mReversePath = cVar2.p;
        cbVar.isPrivate = cVar2.y;
        cbVar.commentSetting = cVar.k();
        cbVar.maxDuration = cVar2.A;
        cbVar.audioTrack = cVar2.r;
        cbVar.videoSpeed = cVar2.q;
        cbVar.commerceData = com.ss.android.ugc.aweme.port.in.a.n.a(cVar2);
        cbVar.mVideoLength = cVar2.f43435c.f43426d;
        if (cVar2.z != null) {
            cbVar.mEffectList = cVar2.z.getEffectPointModels();
        }
        int i = cVar2.n;
        if (i != 0) {
            cbVar.mTimeEffect = new EffectPointModel();
            cbVar.mTimeEffect.setKey(String.valueOf(i));
            cbVar.mTimeEffect.setEndPoint(cVar2.G);
        }
        cbVar.mOutPutWavFile = cVar2.M;
        cbVar.mVideoCoverStartTm = cVar2.N;
        cbVar.setVideoCoverPath(cVar.i());
        cbVar.mVideoWidth = cVar2.O;
        cbVar.mVideoHeight = cVar2.P;
        cbVar.mOutVideoWidth = cVar.b();
        cbVar.mOutVideoHeight = cVar.c();
        cbVar.mVideoCanvasWidth = cVar.d();
        cbVar.mVideoCanvasHeight = cVar.e();
        if (cVar2.f43438f != null && com.ss.android.ugc.aweme.port.in.a.v.c()) {
            cbVar.mId3Album = cVar2.f43438f.getAlbum();
            cbVar.mId3Author = cVar2.f43438f.getSinger();
            cbVar.mId3Title = cVar2.f43438f.getName();
            cbVar.mMusicType = com.ss.android.ugc.aweme.port.in.a.i.a(cVar2.f43438f.getMusicType()) ? 1 : 0;
        }
        cbVar.mDuetFrom = cVar2.Q;
        cbVar.mSyncPlatforms = cVar2.R;
        if (cVar.l() == 2) {
            z = true;
        } else {
            z = false;
        }
        cbVar.mIsHuaweiSuperSlow = z;
        if (cVar.l() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        cbVar.mFromMultiCut = z2;
        if (cVar.l() != 0) {
            z3 = false;
        }
        cbVar.mFromCut = z3;
        cbVar.mShootMode = cVar.m();
        cbVar.microAppId = cVar.A();
        cbVar.microAppModel = cVar.C();
        cbVar.microAppModel = cVar.C();
        cbVar.creationId = cVar.p();
        cbVar.draftId = cVar.q();
        float f3 = 0.5f;
        float f4 = 0.0f;
        if (cVar2.L == 3) {
            cbVar.voiceVolume = ((float) cVar2.j) / 100.0f;
            f3 = ((float) cVar2.k) / 100.0f;
        } else {
            if (cbVar.getWavFile() == null) {
                f2 = 0.0f;
            } else {
                f2 = 0.5f;
            }
            cbVar.voiceVolume = f2;
            if (cbVar.isMusic() <= 0) {
                f3 = 0.0f;
            }
        }
        cbVar.musicVolume = f3;
        cbVar.mShootWay = cVar.u();
        cbVar.autoEnhanceType = cVar.V();
        cbVar.autoEnhanceOn = cVar.U();
        cbVar.mDurationMode = cVar.o();
        cbVar.mIsMultiVideo = cVar.r();
        cbVar.setNewVersion(cVar2.L);
        cbVar.reactionParams = cVar.v();
        cbVar.isMuted = cVar.w();
        if (!cbVar.isMuted) {
            f4 = cbVar.voiceVolume;
        }
        cbVar.voiceVolume = f4;
        cbVar.recordMode = cVar.s();
        cbVar.gameScore = cVar.t();
        cbVar.extractFramesModel = cVar.x();
        cbVar.mSaveModel = cVar.y();
        cbVar.infoStickerModel = cVar.B();
        cbVar.poiId = cVar.z();
        cbVar.videoType = cVar.D();
        cbVar.usePaint = cVar.F();
        cbVar.texts = cVar.E();
        cbVar.socialModel = cVar.G();
        d a2 = com.ss.android.ugc.aweme.shortvideo.a.c.f65441b.a(cbVar);
        cbVar.mEncodedAudioOutputFile = a2.k().getPath();
        cbVar.mParallelUploadOutputFile = a2.l().getPath();
        g.a(r.b(cVar2.T), r.b((BaseShortVideoContext) cbVar), com.ss.android.ugc.aweme.tools.a.e.DRAFT, com.ss.android.ugc.aweme.tools.a.e.PUBLISH);
        if (cVar2.T == null) {
            str = null;
        } else {
            str = cVar2.T.I;
        }
        cbVar.mFirstStickerMusicIdsJson = str;
        cbVar.draftEditTransferModel = new f(l.a(cVar), cVar.O(), cVar.T());
        cbVar.veCherEffectParam = c(cVar);
        cbVar.veAudioEffectParam = d(cVar);
        return cbVar;
    }
}
