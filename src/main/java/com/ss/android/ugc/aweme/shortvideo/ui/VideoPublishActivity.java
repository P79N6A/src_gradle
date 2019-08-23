package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.draft.a.d;
import com.ss.android.ugc.aweme.imported.FakeBoldTextView;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.bz;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.s;
import com.ss.android.ugc.aweme.shortvideo.f.b;
import com.ss.android.ugc.aweme.shortvideo.f.g;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.publish.f;
import com.ss.android.ugc.aweme.shortvideo.r;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.utils.ax;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;

public class VideoPublishActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70590a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    FakeBoldTextView f70591b;

    /* renamed from: c  reason: collision with root package name */
    TextView f70592c;

    /* renamed from: d  reason: collision with root package name */
    TextView f70593d;

    /* renamed from: e  reason: collision with root package name */
    public cb f70594e;

    /* renamed from: f  reason: collision with root package name */
    private VideoPublishFragment f70595f;
    private boolean g;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f70590a, false, 80411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80411, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70590a, false, 80412, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70590a, false, 80412, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f70590a, false, 80408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80408, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f70590a, false, 80407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80407, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f70590a, false, 80410, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("video_post_page");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80410, new Class[0], Analysis.class);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f70590a, false, 80406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80406, new Class[0], Void.TYPE);
        } else if (getIntent().getIntExtra("fromDraft", 0) == 0) {
            a();
            c();
        } else {
            b();
            c();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f70590a, false, 80401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80401, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void a() {
        b bVar;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        boolean z;
        int i;
        Class[] clsArr;
        Class<b> cls;
        b.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f70590a, false, 80404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80404, new Class[0], Void.TYPE);
            return;
        }
        VideoPublishFragment videoPublishFragment = (VideoPublishFragment) getSupportFragmentManager().findFragmentById(C0906R.id.aic);
        videoPublishFragment.b("enter_video_edit_page");
        videoPublishFragment.d();
        videoPublishFragment.f();
        cb cbVar = videoPublishFragment.n;
        String str = cbVar.title;
        List list = cbVar.structList;
        int i2 = cbVar.isPrivate;
        String str2 = cbVar.poiId;
        List list2 = cbVar.challenges;
        d dVar = cbVar.defaultSelectStickerPoi;
        if (PatchProxy.isSupport(new Object[]{cbVar}, null, b.f67633a, true, 77206, new Class[]{cb.class}, b.class)) {
            objArr = new Object[]{cbVar};
            aVar = null;
            changeQuickRedirect = b.f67633a;
            z = true;
            i = 77206;
            clsArr = new Class[]{cb.class};
            cls = b.class;
        } else {
            b.a aVar2 = b.f67634d;
            if (PatchProxy.isSupport(new Object[]{cbVar}, aVar2, b.a.f67637a, false, 77207, new Class[]{cb.class}, b.class)) {
                objArr = new Object[]{cbVar};
                changeQuickRedirect = b.a.f67637a;
                z = false;
                i = 77207;
                clsArr = new Class[]{cb.class};
                cls = b.class;
                aVar = aVar2;
            } else {
                Intrinsics.checkParameterIsNotNull(cbVar, "model");
                if (cbVar.isMvThemeVideoType()) {
                    bVar = new b(cbVar.mvCreateVideoData.videoCoverStartTime, cbVar.mvCreateVideoData.videoCoverImgPath);
                } else {
                    bVar = new b((int) (cbVar.mVideoCoverStartTm * 1000.0f), null, 2);
                }
                g gVar = new g(str, list, i2, str2, list2, dVar, bVar);
                gVar.g = cbVar.commentSetting;
                c.a().d(gVar);
            }
        }
        bVar = (b) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, z, i, clsArr, cls);
        g gVar2 = new g(str, list, i2, str2, list2, dVar, bVar);
        gVar2.g = cbVar.commentSetting;
        c.a().d(gVar2);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        String str2;
        Object obj;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f70590a, false, 80405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70590a, false, 80405, new Class[0], Void.TYPE);
            return;
        }
        bz.a(this.f70594e, null);
        VideoPublishFragment videoPublishFragment = (VideoPublishFragment) getSupportFragmentManager().findFragmentById(C0906R.id.aic);
        videoPublishFragment.b("enter_video_edit_page");
        videoPublishFragment.d();
        videoPublishFragment.f();
        cb cbVar = videoPublishFragment.n;
        Intent intent = new Intent();
        com.ss.android.ugc.aweme.shortvideo.a.d a2 = com.ss.android.ugc.aweme.shortvideo.a.c.f65441b.a(cbVar);
        intent.putExtra("creation_id", cbVar.creationId);
        intent.putExtra("workspace", a2);
        intent.putExtra("dir", ff.f67717f);
        intent.putExtra("face_beauty", cbVar.mFaceBeauty);
        intent.putExtra("face_beauty_open", cbVar.faceBeautyOpen);
        intent.putExtra("filter_id", cbVar.mSelectedId);
        intent.putExtra("camera", cbVar.mCameraPosition);
        intent.putExtra("filter_lables", cbVar.mCurFilterLabels);
        intent.putExtra("filter_ids", cbVar.mCurFilterIds);
        intent.putExtra("smooth_skin_labels", cbVar.mSmoothSkinLabels);
        intent.putExtra("smooth_reshape_labels", cbVar.mReshapeLabels);
        intent.putExtra("smooth_eyes_labels", cbVar.mEyesLabels);
        intent.putExtra("smooth_tanning_labels", cbVar.mTanningLabels);
        intent.putExtra("extra_aweme_speed", cbVar.videoSpeed);
        intent.putExtra("music_start", cbVar.mMusicStart);
        intent.putExtra("extra_music_end", cbVar.mMusicEnd);
        intent.putExtra("max_duration", cbVar.maxDuration);
        intent.putExtra("wav_form", cbVar.audioTrack);
        intent.putExtra("video_segment", cbVar.mVideoSegmentsDesc);
        if (cbVar.isMvThemeVideoType()) {
            str = "mv";
        } else {
            str = "video";
        }
        intent.putExtra("content_type", str);
        if (cbVar.mFromCut || cbVar.mFromMultiCut || cbVar.isMvThemeVideoType()) {
            str2 = "upload";
        } else {
            str2 = "shoot";
        }
        intent.putExtra("content_source", str2);
        intent.putExtra("default_select_sticker_poi", cbVar.defaultSelectStickerPoi);
        intent.putExtra("hard_encode", cbVar.mHardEncode);
        intent.putExtra("sticker_path", cbVar.mStickerPath);
        intent.putExtra("sticker_id", cbVar.mStickerID);
        intent.putExtra("first_sticker_music_ids", cbVar.mFirstStickerMusicIdsJson);
        intent.putExtra("draft_id", cbVar.draftId);
        boolean z2 = true;
        intent.putExtra("isFromDraft", true);
        intent.putExtra("videoCoverStartTm", cbVar.mVideoCoverStartTm);
        intent.putExtra("effectList", cbVar.mEffectList);
        StringBuilder sb = new StringBuilder("effect list from publish : ");
        if (cbVar.mEffectList != null) {
            obj = Integer.valueOf(cbVar.mEffectList.size());
        } else {
            obj = "null";
        }
        sb.append(obj);
        intent.putExtra("video_width", cbVar.mVideoWidth);
        intent.putExtra("video_height", cbVar.mVideoHeight);
        intent.putExtra("extra_video_canvas_width", cbVar.mVideoCanvasWidth);
        intent.putExtra("extra_video_canvas_height", cbVar.mVideoCanvasHeight);
        intent.putExtra("origin", cbVar.mOrigin);
        intent.putExtra("challenge", (Serializable) cbVar.challenges);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("video_title", cbVar.title);
        intent.putExtra("struct_list", (Serializable) cbVar.structList);
        intent.putExtra("is_rivate", cbVar.isPrivate);
        intent.putExtra("comment_setting", cbVar.commentSetting);
        intent.putExtra("poi_struct_in_tools_line", cbVar.poiId);
        intent.putExtra("duet_from", cbVar.getDuetFrom());
        intent.putExtra("duet_author", cbVar.getDuetAuthor());
        intent.putExtra("fromMultiCut", cbVar.mFromMultiCut);
        intent.putExtra("fromCut", cbVar.mFromCut);
        intent.putExtra("is_huawei_super_slow", cbVar.mIsHuaweiSuperSlow);
        intent.putExtra("shoot_mode", cbVar.mShootMode);
        intent.putExtra("duration_mode", cbVar.mDurationMode);
        intent.putExtra("upload_video_type", cbVar.mIsMultiVideo);
        intent.putExtra("record_mode", cbVar.recordMode);
        intent.putExtra("record_game_score", cbVar.gameScore);
        intent.putExtra("extra_auto_enhance_state", cbVar.autoEnhanceOn);
        intent.putExtra("extra_auto_enhance_type", cbVar.autoEnhanceType);
        intent.putExtra("time_effect", cbVar.mTimeEffect);
        intent.putExtra("reaction_params", cbVar.reactionParams);
        intent.putExtra("is_muted", cbVar.isMuted);
        intent.putExtra("music_volume", cbVar.musicVolume);
        intent.putExtra("voice_volume", cbVar.voiceVolume);
        if (cbVar.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", cbVar.veCherEffectParam);
        }
        if (cbVar.veAudioEffectParam != null) {
            intent.putExtra("extra_ve_audio_effect_param", cbVar.veAudioEffectParam);
        }
        com.ss.android.ugc.aweme.tools.a.g.a(intent, r.a((BaseShortVideoContext) cbVar), e.PUBLISH, e.EDIT);
        intent.putExtra("extract_model", cbVar.extractFramesModel);
        intent.putExtra("infosticker_model", cbVar.infoStickerModel);
        intent.putExtra("extra_auto_enhance_type", cbVar.autoEnhanceType);
        intent.putExtra("extra_auto_enhance_state", cbVar.autoEnhanceOn);
        if (a.M.b(a.C0682a.RecommentMusicByAIPolicy) != 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("key_mv_theme_data", cbVar.mvCreateVideoData);
        if (!z || cbVar == null || !TextUtils.isEmpty(cbVar.getDuetFrom()) || cbVar.getReactionParams() != null) {
            z2 = false;
        }
        if (z) {
            com.ss.android.ugc.aweme.port.in.a.i.f().a(cbVar.extractFramesModel, z2, cbVar.creationId);
            if (com.ss.android.ugc.aweme.shortvideo.music.b.a() == 2) {
                com.ss.android.ugc.aweme.port.in.a.i.d();
            }
            intent.setClass(this, AIMusicVEVideoPublishEditActivity.class);
        } else {
            intent.setClass(this, VEVideoPublishEditActivity.class);
        }
        intent.putExtra("extra_av_is_fast_import", cbVar.isFastImport);
        intent.putExtra("extra_av_enable_fast_import_resolution", cbVar.fastImportResolution);
        if (cbVar.previewConfigure != null) {
            intent.putExtra("extra_ve_preview_configure", cbVar.previewConfigure);
        }
        if (cbVar.draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", cbVar.draftEditTransferModel);
        }
        s.a(false);
        startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f70590a, false, 80400, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f70590a, false, 80400, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.en);
        this.f70591b = (FakeBoldTextView) findViewById(C0906R.id.title);
        this.f70592c = (TextView) findViewById(C0906R.id.iu);
        this.f70593d = (TextView) findViewById(C0906R.id.q2);
        this.f70594e = (cb) getIntent().getSerializableExtra("args");
        this.f70594e.challenges = (List) getIntent().getSerializableExtra("challenge");
        this.g = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        if (getIntent().getIntExtra("fromDraft", 0) == 0) {
            this.f70592c.setOnClickListener(new ax() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70596a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f70596a, false, 80416, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f70596a, false, 80416, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                    bz.a(VideoPublishActivity.this.f70594e, null);
                    VideoPublishActivity.this.a();
                    VideoPublishActivity.this.c();
                }
            });
        } else {
            this.f70592c.setText(C0906R.string.kt);
            this.f70592c.setOnClickListener(new ax() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70598a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f70598a, false, 80417, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f70598a, false, 80417, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                    VideoPublishActivity.this.b();
                    VideoPublishActivity.this.c();
                }
            });
            this.f70593d.setVisibility(0);
            this.f70593d.setOnClickListener(new ad(this));
            this.f70594e.mIsFromDraft = true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("args", this.f70594e);
        bundle2.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
        bundle2.putBoolean("enter_record_from_other_platform", this.g);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f70595f = (VideoPublishFragment) supportFragmentManager.findFragmentById(C0906R.id.aic);
        if (this.f70595f == null) {
            this.f70595f = new VideoPublishFragment();
            this.f70595f.setArguments(bundle2);
            supportFragmentManager.beginTransaction().add((int) C0906R.id.aic, (Fragment) this.f70595f).commit();
        }
        if (this.f70591b != null) {
            FakeBoldTextView fakeBoldTextView = this.f70591b;
            com.ss.android.ugc.aweme.shortvideo.publish.e eVar = new com.ss.android.ugc.aweme.shortvideo.publish.e(this.f70595f, this.f70594e);
            if (!PatchProxy.isSupport(new Object[0], eVar, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78235, new Class[0], Integer.TYPE)) {
                switch (f.f68928b[eVar.c().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        i = C0906R.string.c7d;
                        break;
                    default:
                        i = C0906R.string.cf7;
                        break;
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], eVar, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78235, new Class[0], Integer.TYPE)).intValue();
            }
            fakeBoldTextView.setText(i);
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f70594e.creationId).a("shoot_way", this.f70594e.mShootWay).a("draft_id", this.f70594e.draftId).a("filter_list", this.f70594e.mCurFilterLabels).a("filter_id_list", this.f70594e.mCurFilterIds);
        if (com.ss.android.ugc.aweme.property.f.a()) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("is_hardcode", str).a("bite_rate", String.valueOf(com.ss.android.ugc.aweme.property.f.e())).a("video_quality", com.ss.android.ugc.aweme.property.f.g());
        if (this.f70594e.getOriginal() == 0) {
            str2 = com.ss.android.ugc.aweme.property.f.i();
        } else {
            str2 = com.ss.android.ugc.aweme.property.f.h();
        }
        com.ss.android.ugc.aweme.app.d.d a4 = a3.a("resolution", str2).a("content_type", this.f70594e.getAvetParameter().getContentType());
        if (this.f70594e.autoEnhanceOn) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        com.ss.android.ugc.aweme.app.d.d a5 = a4.a("to_status", str3);
        if (this.f70594e.autoEnhanceType == 1) {
            str4 = "light";
        } else {
            str4 = "hdr";
        }
        com.ss.android.ugc.aweme.common.r.a("enter_video_post_page", (Map) a5.a("improve_method", str4).a("content_source", this.f70594e.getAvetParameter().getContentSource()).f34114b);
        com.ss.android.ugc.aweme.common.r.a("av_memory_log", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f70594e.creationId).a("enter_from", "publish").a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
        if (fc.a()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).statusBarDarkFont(com.ss.android.g.a.b()).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).fitsSystemWindows(true).statusBarDarkFont(com.ss.android.g.a.b()).init();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f70590a, false, 80409, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f70590a, false, 80409, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.f70595f != null && this.f70595f.isAdded()) {
            int i3 = i;
            int i4 = i2;
            this.f70595f.onActivityResult(i, i2, intent2);
        }
    }
}
