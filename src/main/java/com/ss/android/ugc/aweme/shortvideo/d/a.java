package com.ss.android.ugc.aweme.shortvideo.d;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.common.ExternalAVConstants;
import com.ss.android.ugc.aweme.draft.a.h;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.ArrayList;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66731a;

    public static void a(String str, e eVar, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, eVar, Integer.valueOf(i)}, null, f66731a, true, 75266, new Class[]{String.class, e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, eVar, Integer.valueOf(i)}, null, f66731a, true, 75266, new Class[]{String.class, e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("music_path", str2);
        String str3 = "";
        if (eVar != null) {
            try {
                str3 = JSON.toJSONString(eVar);
            } catch (Exception e2) {
                Exception exc = e2;
                StringBuilder sb = new StringBuilder();
                if (eVar.getMusicWaveData() != null) {
                    for (float f2 : eVar.getMusicWaveData()) {
                        sb.append(f2 + ",");
                    }
                }
                ai.a("music id:" + eVar.getMusicId() + "; music name:" + eVar.getName() + "; music wave data:" + sb.toString());
                throw exc;
            }
        }
        edit.putString("music_model", str3);
        edit.putInt("music_start", i);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void a(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, f66731a, true, 75267, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList}, null, f66731a, true, 75267, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("segment_video", RecordScene.timeSpeedModels2String(arrayList));
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f66731a, true, 75268, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f66731a, true, 75268, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("filter_labels", str3);
        edit.putString("filter_ids", str4);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f66731a, true, 75270, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f66731a, true, 75270, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("creation_id", str2);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f66731a, true, 75273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f66731a, true, 75273, new Class[0], Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("music_path", "");
        edit.putString("music_model", "");
        edit.putInt("music_start", 0);
        edit.putInt("face_beauty", 0);
        edit.putString("segment_video", "");
        edit.putInt("hard_encode", 0);
        edit.putString("mp4_path", "");
        edit.putString("duet_video_path", "");
        edit.putString("duet_audio_path", "");
        edit.putString("creation_id", "");
        edit.putInt("record_mode", 0);
        edit.putString("poi_context", "");
        edit.putString("challenge", "");
        SharedPrefsEditorCompat.apply(edit);
    }

    public static RecordScene b() {
        if (PatchProxy.isSupport(new Object[0], null, f66731a, true, 75274, new Class[0], RecordScene.class)) {
            return (RecordScene) PatchProxy.accessDispatch(new Object[0], null, f66731a, true, 75274, new Class[0], RecordScene.class);
        }
        RecordScene recordScene = new RecordScene();
        SharedPreferences a2 = c.a(GlobalContext.getContext(), "publish", 0);
        recordScene.musicPath = a2.getString("music_path", "");
        recordScene.musicStart = a2.getInt("music_start", 0);
        recordScene.videoSegments = RecordScene.string2TimeSpeedModels(a2.getString("segment_video", ""));
        recordScene.faceBeauty = a2.getInt("face_beauty", 0);
        recordScene.hardEncode = a2.getInt("hard_encode", 0);
        recordScene.mp4Path = a2.getString("mp4_path", "");
        recordScene.maxDuration = a2.getLong("max_duration", ea.f66827f);
        recordScene.duetAudioPath = a2.getString("duet_audio_path", "");
        recordScene.duetVideoPath = a2.getString("duet_video_path", "");
        recordScene.shootMode = a2.getInt("shoot_mode", 0);
        recordScene.creationId = a2.getString("creation_id", UUID.randomUUID().toString());
        recordScene.recordMode = a2.getInt("record_mode", 0);
        recordScene.filterLabels = a2.getString("filter_labels", "");
        recordScene.filterIds = a2.getString("filter_ids", "");
        recordScene.poiContextStr = a2.getString("poi_context", "");
        recordScene.challengeStr = a2.getString("challenge", "");
        recordScene.reactionParams = RecordScene.string2ReactionParams(a2.getString("reaction", ""));
        recordScene.extractFramesModel = ExtractFramesModel.string2Model(a2.getString("shot_extract_frame", ""));
        recordScene.cherEffectParam = RecordScene.getCherEffectParam(a2.getString("ve_cher_effect_param", ""));
        try {
            recordScene.musicModel = ((h) ServiceManager.get().getService(h.class)).a(a2.getString("music_model", ""));
        } catch (Throwable unused) {
        }
        return recordScene;
    }

    public static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f66731a, true, 75265, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f66731a, true, 75265, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putInt("hard_encode", i);
        SharedPrefsEditorCompat.apply(edit);
    }

    private static ExtractFramesModel b(ExtractFramesModel extractFramesModel) {
        ExtractFramesModel extractFramesModel2 = extractFramesModel;
        if (PatchProxy.isSupport(new Object[]{extractFramesModel2}, null, f66731a, true, 75280, new Class[]{ExtractFramesModel.class}, ExtractFramesModel.class)) {
            return (ExtractFramesModel) PatchProxy.accessDispatch(new Object[]{extractFramesModel2}, null, f66731a, true, 75280, new Class[]{ExtractFramesModel.class}, ExtractFramesModel.class);
        }
        ExtractFramesModel extractFramesModel3 = new ExtractFramesModel(extractFramesModel2.extractType);
        extractFramesModel3.extractFramesDir = extractFramesModel2.extractFramesDir;
        if (extractFramesModel2.frames != null && !extractFramesModel2.frames.isEmpty()) {
            extractFramesModel3.frames.putAll(extractFramesModel2.frames);
        }
        if (extractFramesModel2.stickerFaces != null && !extractFramesModel2.stickerFaces.isEmpty()) {
            extractFramesModel3.stickerFaces.putAll(extractFramesModel2.stickerFaces);
        }
        return extractFramesModel3;
    }

    public static void c(@ExternalAVConstants.ShootMode int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f66731a, true, 75278, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f66731a, true, 75278, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putInt("shoot_mode", i);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f66731a, true, 75269, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f66731a, true, 75269, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putInt("face_beauty", i);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f66731a, true, 75275, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f66731a, true, 75275, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putLong("max_duration", j2);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void a(i iVar) {
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, null, f66731a, true, 75277, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, null, f66731a, true, 75277, new Class[]{i.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("reaction", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) iVar2));
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f66731a, true, 75271, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f66731a, true, 75271, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("poi_context", str2);
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void a(ExtractFramesModel extractFramesModel) {
        if (PatchProxy.isSupport(new Object[]{extractFramesModel}, null, f66731a, true, 75279, new Class[]{ExtractFramesModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{extractFramesModel}, null, f66731a, true, 75279, new Class[]{ExtractFramesModel.class}, Void.TYPE);
            return;
        }
        ExtractFramesModel b2 = b(extractFramesModel);
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("shot_extract_frame", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) b2));
        SharedPrefsEditorCompat.apply(edit);
    }

    public static void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f66731a, true, 75276, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f66731a, true, 75276, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
        edit.putString("duet_video_path", str3);
        edit.putString("duet_audio_path", str4);
        SharedPrefsEditorCompat.apply(edit);
    }
}
