package com.ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.filter.az;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.tools.a.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

public final class fi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67725a;

    private static void b(fh fhVar) {
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{fhVar2}, null, f67725a, true, 74591, new Class[]{fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fhVar2}, null, f67725a, true, 74591, new Class[]{fh.class}, Void.TYPE);
            return;
        }
        if (fhVar.a()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!fhVar2.l.e().exists()) {
                fhVar2.h = (int) fhVar2.f67720c;
                return;
            }
            try {
                a(mediaMetadataRetriever, fhVar2.l.e().getPath());
                fhVar2.h = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                fhVar2.h = (int) fhVar2.f67720c;
            }
        } else {
            fhVar2.h = (int) fhVar2.f67720c;
        }
    }

    @NonNull
    public static fh a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, f67725a, true, 74586, new Class[]{Bundle.class}, fh.class)) {
            return (fh) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f67725a, true, 74586, new Class[]{Bundle.class}, fh.class);
        }
        fh fhVar = new fh(0);
        fhVar.q = bundle2.getString("creation_id");
        fhVar.r = bundle2.getString("shoot_way");
        fhVar.s = bundle2.getString("enter_from");
        fhVar.t = bundle2.getString("enter_method");
        fhVar.u = bundle2.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
        fhVar.ar = (UrlModel) bundle2.getSerializable("send_to_user_head");
        fhVar.v = 0;
        fhVar.l = d.a();
        fhVar.j = a.q.getVideoWidth();
        fhVar.k = a.q.getVideoHeight();
        fhVar.m = new ft();
        fhVar.n = 0;
        fhVar.o = f.a() ? 1 : 0;
        fhVar.p = fk.a().a();
        return fhVar;
    }

    @NonNull
    private static fh b(Intent intent) {
        String str;
        boolean z;
        boolean z2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, null, f67725a, true, 74587, new Class[]{Intent.class}, fh.class)) {
            return (fh) PatchProxy.accessDispatch(new Object[]{intent2}, null, f67725a, true, 74587, new Class[]{Intent.class}, fh.class);
        }
        fh fhVar = new fh(0);
        fhVar.w = AVETParameterKt.generateAVETParam(intent);
        fhVar.q = intent2.getStringExtra("creation_id");
        fhVar.r = intent2.getStringExtra("shoot_way");
        fhVar.s = intent2.getStringExtra("enter_from");
        fhVar.v = 0;
        fhVar.l = d.a();
        fhVar.N = intent2.getIntExtra("shoot_mode", 0);
        fhVar.z = intent2.getStringExtra("duet_video_path");
        fhVar.A = intent2.getStringExtra("duet_audio_path");
        fhVar.y = intent2.getStringExtra("duet_from");
        fhVar.x = (User) intent2.getSerializableExtra("duet_author");
        fhVar.B = intent2.getIntExtra("duet_video_width", 0);
        fhVar.C = intent2.getIntExtra("duet_video_height", -1);
        fhVar.E = (i) intent2.getParcelableExtra("reaction_params");
        if (fhVar.b()) {
            str = fhVar.A;
        } else if (fhVar.c()) {
            str = fhVar.E.wavPath;
        } else {
            str = intent2.getStringExtra("path");
        }
        fhVar.f67723f = str;
        if (!TextUtils.isEmpty(fhVar.f67723f)) {
            fhVar.l.a(new File(fhVar.f67723f));
        }
        UrlModel a2 = a.i.a((Object) intent2.getSerializableExtra("music_model"));
        if (a2 != null) {
            fhVar.f67722e = a2;
        }
        fhVar.V = bg.a().a();
        if (a.L.b(e.a.DefaultMicrophoneState) == 3) {
            z = true;
        } else {
            z = false;
        }
        fhVar.G = z;
        a(fhVar);
        fhVar.g = intent2.getIntExtra("music_start", 0);
        fhVar.h = (int) fhVar.f67720c;
        fhVar.j = a.q.getVideoWidth();
        fhVar.k = a.q.getVideoHeight();
        fhVar.m = new ft();
        fhVar.n = 0;
        fhVar.o = f.a() ? 1 : 0;
        fhVar.p = fk.a().a();
        List<c> list = ej.a().f67529b;
        if (!Lists.notEmpty(list) || TextUtils.isEmpty(list.get(0).getStickerId())) {
            fhVar.M = intent2.getBooleanExtra("use_preset_sticker_at_first", false);
        } else {
            fhVar.L = list.get(0).getStickerId();
            fhVar.M = true;
        }
        if (TextUtils.isEmpty(fhVar.L)) {
            fhVar.L = intent2.getStringExtra("sticker_id");
        }
        fhVar.ad = (GameDuetResource) intent2.getParcelableExtra("duet_sticker_game");
        fhVar.D = intent2.getStringExtra("poi_struct_in_tools_line");
        fhVar.am = (q) intent2.getSerializableExtra("micro_app_info");
        if (intent2.getBooleanExtra("enter_record_from_other_platform", false) || fhVar.am != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        fhVar.an = z2;
        fhVar.ao = intent2.getBooleanExtra("to_live", false);
        if (intent2.hasExtra("extra_mention_uid") && intent2.hasExtra("extra_mention_user_name")) {
            fhVar.aq = ExtraMentionUserModel.Companion.newInstance(intent2.getStringExtra("extra_mention_uid"), intent2.getStringExtra("extra_mention_user_name"));
        }
        fhVar.W = true;
        g.a(intent2, r.a(fhVar));
        return fhVar;
    }

    @NonNull
    public static fh a(Intent intent) {
        int i;
        Intent intent2 = intent;
        boolean z = true;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{intent2}, null, f67725a, true, 74585, new Class[]{Intent.class}, fh.class)) {
            return (fh) PatchProxy.accessDispatch(new Object[]{intent2}, null, f67725a, true, 74585, new Class[]{Intent.class}, fh.class);
        }
        String str = null;
        switch (intent2.getIntExtra("restore", 0)) {
            case 0:
                return b(intent);
            case 1:
                if (PatchProxy.isSupport(new Object[]{intent2}, null, f67725a, true, 74589, new Class[]{Intent.class}, fh.class)) {
                    return (fh) PatchProxy.accessDispatch(new Object[]{intent2}, null, f67725a, true, 74589, new Class[]{Intent.class}, fh.class);
                }
                fh fhVar = new fh(1);
                fhVar.w = AVETParameterKt.generateAVETParam(intent);
                fhVar.r = intent2.getStringExtra("shoot_way");
                fhVar.l = (d) intent2.getParcelableExtra("workspace");
                if (fhVar.l.e() != null && bm.a(fhVar.l.e().getPath())) {
                    fhVar.f67723f = fhVar.l.e().toString();
                }
                cb cbVar = (cb) intent2.getSerializableExtra("video_edit_model");
                if (cbVar.mVideoWidth == 0) {
                    i = 540;
                } else {
                    i = cbVar.mVideoWidth;
                }
                fhVar.j = i;
                fhVar.k = cbVar.mVideoHeight;
                fhVar.N = cbVar.mShootMode;
                fhVar.V = cbVar.mDurationMode;
                fhVar.G = cbVar.isMuted;
                fhVar.q = cbVar.creationId;
                fhVar.v = cbVar.draftId;
                fhVar.d().setDraftId(cbVar.draftId);
                fhVar.d().setCreationId(cbVar.creationId);
                fhVar.O = az.from(cbVar.mCurFilterLabels);
                fhVar.P = az.from(cbVar.mCurFilterIds);
                RecordScene recordScene = ej.a().f67533f;
                if (recordScene == null || recordScene.isSegmentsNotValid()) {
                    fhVar.m = new ft();
                    fhVar.n = 0;
                    fhVar.o = f.a() ? 1 : 0;
                    fhVar.p = true;
                    com.ss.android.ugc.aweme.shortvideo.e.i iVar = new com.ss.android.ugc.aweme.shortvideo.e.i();
                    if (fhVar.a()) {
                        str = fhVar.l.e().getPath();
                    }
                    fhVar.f67720c = iVar.a(str);
                    fhVar.h = (int) fhVar.f67720c;
                } else {
                    fhVar.m = new ft(recordScene.videoSegments);
                    fhVar.n = (long) TimeSpeedModelExtension.calculateRealTime(fhVar.m);
                    fhVar.g = recordScene.musicStart;
                    fhVar.o = recordScene.hardEncode;
                    if (recordScene.faceBeauty > 0) {
                        z2 = true;
                    }
                    fhVar.p = z2;
                    fhVar.f67720c = recordScene.maxDuration;
                    b(fhVar);
                    fhVar.f67722e = recordScene.audioTrack;
                }
                fhVar.H = cbVar.title;
                fhVar.I = cbVar.structList;
                fhVar.i = cbVar.mMusicOrigin;
                fhVar.J = cbVar.isPrivate;
                fhVar.K = true;
                g.a(r.a((BaseShortVideoContext) cbVar), r.a(fhVar), com.ss.android.ugc.aweme.tools.a.e.DRAFT, com.ss.android.ugc.aweme.tools.a.e.RECORD);
                fhVar.Y = cbVar.extractFramesModel;
                fhVar.av = cbVar.draftEditTransferModel;
                if (intent2.hasExtra("extra_ve_cher_effect_param")) {
                    fhVar.aw = (ah) intent2.getParcelableExtra("extra_ve_cher_effect_param");
                }
                return fhVar;
            case 2:
                if (PatchProxy.isSupport(new Object[]{intent2}, null, f67725a, true, 74590, new Class[]{Intent.class}, fh.class)) {
                    return (fh) PatchProxy.accessDispatch(new Object[]{intent2}, null, f67725a, true, 74590, new Class[]{Intent.class}, fh.class);
                }
                fh fhVar2 = new fh(2);
                fhVar2.w = AVETParameterKt.generateAVETParam(intent);
                fhVar2.r = intent2.getStringExtra("shoot_way");
                fhVar2.l = d.a();
                fhVar2.v = 0;
                UrlModel a2 = a.i.a((Object) intent2.getSerializableExtra("music_model"));
                if (a2 != null) {
                    fhVar2.f67722e = a2;
                }
                fhVar2.j = a.q.getVideoWidth();
                fhVar2.k = a.q.getVideoHeight();
                RecordScene b2 = com.ss.android.ugc.aweme.shortvideo.d.a.b();
                fhVar2.V = a.L.a(e.a.DurationMode);
                if (b2 == null || b2.isSegmentsNotValid()) {
                    fhVar2.d().setCreationId(UUID.randomUUID().toString());
                    fhVar2.q = UUID.randomUUID().toString();
                    fhVar2.m = new ft();
                    fhVar2.n = 0;
                    fhVar2.o = f.a() ? 1 : 0;
                    fhVar2.p = true;
                    com.ss.android.ugc.aweme.shortvideo.e.i iVar2 = new com.ss.android.ugc.aweme.shortvideo.e.i();
                    if (fhVar2.a()) {
                        str = fhVar2.l.e().getPath();
                    }
                    fhVar2.f67720c = iVar2.a(str);
                    b(fhVar2);
                } else {
                    fhVar2.d().setCreationId(b2.creationId);
                    fhVar2.q = b2.creationId;
                    fhVar2.m = new ft(b2.videoSegments);
                    fhVar2.n = (long) TimeSpeedModelExtension.calculateRealTime(fhVar2.m);
                    fhVar2.f67723f = b2.musicPath;
                    if (!TextUtils.isEmpty(b2.musicPath)) {
                        fhVar2.l.a(new File(b2.musicPath));
                    }
                    fhVar2.g = b2.musicStart;
                    fhVar2.o = b2.hardEncode;
                    if (b2.faceBeauty <= 0) {
                        z = false;
                    }
                    fhVar2.p = z;
                    fhVar2.f67720c = b2.maxDuration;
                    b(fhVar2);
                    fhVar2.f67722e = b2.audioTrack;
                    ej.a().a(b2.musicModel);
                    fhVar2.E = b2.reactionParams;
                    fhVar2.Y = b2.extractFramesModel;
                    fhVar2.O = az.from(b2.filterLabels);
                    fhVar2.P = az.from(b2.filterIds);
                    fhVar2.D = b2.poiContextStr;
                    fhVar2.aw = b2.cherEffectParam;
                    ej.a().a(b2.getChallengeFromStr());
                }
                return fhVar2;
            default:
                return b(intent);
        }
    }

    public static void a(fh fhVar) {
        String str;
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{fhVar2}, null, f67725a, true, 74588, new Class[]{fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fhVar2}, null, f67725a, true, 74588, new Class[]{fh.class}, Void.TYPE);
            return;
        }
        if (fhVar.b()) {
            fhVar2.f67720c = new com.ss.android.ugc.aweme.shortvideo.e.e().a(fhVar2.A, fhVar2.z);
        } else if (fhVar.c()) {
            fhVar2.f67720c = new com.ss.android.ugc.aweme.shortvideo.e.e().a(fhVar2.E.wavPath, fhVar2.E.videoPath);
        } else {
            com.ss.android.ugc.aweme.shortvideo.e.i iVar = new com.ss.android.ugc.aweme.shortvideo.e.i();
            if (fhVar.a()) {
                str = fhVar2.l.e().getPath();
            } else {
                str = null;
            }
            fhVar2.f67720c = iVar.a(str);
        }
        ai.d("maxduration is " + fhVar2.f67720c);
    }

    private static void a(MediaMetadataRetriever mediaMetadataRetriever, String str) throws IllegalArgumentException {
        FileInputStream fileInputStream;
        Throwable th;
        Throwable th2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{mediaMetadataRetriever, str2}, null, f67725a, true, 74592, new Class[]{MediaMetadataRetriever.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaMetadataRetriever, str2}, null, f67725a, true, 74592, new Class[]{MediaMetadataRetriever.class, String.class}, Void.TYPE);
            return;
        } else if (str2 != null) {
            try {
                fileInputStream = new FileInputStream(str2);
                mediaMetadataRetriever.setDataSource(fileInputStream.getFD(), 0, 576460752303423487L);
                fileInputStream.close();
                return;
            } catch (FileNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IOException e3) {
                throw new IllegalArgumentException(e3);
            } catch (Throwable th3) {
                com.google.a.a.a.a.a.a.a(th, th3);
            }
        } else {
            throw new IllegalArgumentException("path == null");
        }
        throw th2;
    }
}
