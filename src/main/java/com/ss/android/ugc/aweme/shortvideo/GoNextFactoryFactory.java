package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.StickerPoiUtilsKt;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.z;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.tools.a.g;
import com.tt.appbrandimpl.PublishExtra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class GoNextFactoryFactory implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65336a;

    /* renamed from: b  reason: collision with root package name */
    d f65337b;

    /* renamed from: c  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65338c;

    /* renamed from: d  reason: collision with root package name */
    ShortVideoContextViewModel f65339d = ((ShortVideoContextViewModel) ViewModelProviders.of(this.f65338c.getActivity()).get(ShortVideoContextViewModel.class));

    /* renamed from: e  reason: collision with root package name */
    long f65340e;

    /* renamed from: f  reason: collision with root package name */
    int f65341f;
    int g;

    private static void a(fh fhVar) {
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{fhVar2}, null, f65336a, true, 74136, new Class[]{fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fhVar2}, null, f65336a, true, 74136, new Class[]{fh.class}, Void.TYPE);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = fhVar2.m.iterator();
        while (it2.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it2.next();
            if (timeSpeedModelExtension.getBubbleTexts() != null) {
                linkedHashSet.addAll(timeSpeedModelExtension.getBubbleTexts());
            }
            if (timeSpeedModelExtension.getARTexts() != null) {
                linkedHashSet2.addAll(timeSpeedModelExtension.getARTexts());
            }
        }
        fhVar2.at.addAll(linkedHashSet);
        fhVar2.as.addAll(linkedHashSet2);
    }

    public GoNextFactoryFactory(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65338c = shortVideoRecordingOperationPanelFragment;
        this.f65338c.getLifecycle().addObserver(this);
    }

    private static String a(User user) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user}, null, f65336a, true, 74133, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f65336a, true, 74133, new Class[]{User.class}, String.class);
        }
        if (!a.b()) {
            str = user.getNickname();
        } else if (TextUtils.isEmpty(user.getUniqueId())) {
            str = user.getShortId();
        } else {
            str = user.getUniqueId();
        }
        return str;
    }

    public static Intent a(ShortVideoContextViewModel shortVideoContextViewModel, int i) {
        ShortVideoContextViewModel shortVideoContextViewModel2 = shortVideoContextViewModel;
        if (!PatchProxy.isSupport(new Object[]{shortVideoContextViewModel2, Integer.valueOf(i)}, null, f65336a, true, 74134, new Class[]{ShortVideoContextViewModel.class, Integer.TYPE}, Intent.class)) {
            return a(shortVideoContextViewModel2, i, null);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{shortVideoContextViewModel2, Integer.valueOf(i)}, null, f65336a, true, 74134, new Class[]{ShortVideoContextViewModel.class, Integer.TYPE}, Intent.class);
    }

    public static List<c> a(ArrayList<TimeSpeedModelExtension> arrayList, boolean z) {
        if (PatchProxy.isSupport(new Object[]{arrayList, Byte.valueOf(z ? (byte) 1 : 0)}, null, f65336a, true, 74137, new Class[]{ArrayList.class, Boolean.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{arrayList, Byte.valueOf(z)}, null, f65336a, true, 74137, new Class[]{ArrayList.class, Boolean.TYPE}, List.class);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ej.a().f67529b);
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(it2.next().getHashtag());
        }
        linkedHashSet.removeAll(Collections.singleton(null));
        if (z) {
            linkedHashSet.removeAll(ej.a().f67529b);
        }
        return new ArrayList(linkedHashSet);
    }

    public static void a(Context context, fh fhVar) {
        int i;
        int i2;
        String str;
        AVTextExtraStruct aVTextExtraStruct;
        Context context2 = context;
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{context2, fhVar2}, null, f65336a, true, 74132, new Class[]{Context.class, fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, fhVar2}, null, f65336a, true, 74132, new Class[]{Context.class, fh.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(fhVar2.H)) {
            if (fhVar.c()) {
                String str2 = "@" + a(fhVar2.E.reactionFromAuthor);
                String string = context2.getString(C0906R.string.bvg, new Object[]{str2});
                int indexOf = string.indexOf(str2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(gy.a(indexOf, str2.length() + indexOf, fhVar2.E.reactionFromAuthor.getUid()));
                fhVar2.I = arrayList;
                fhVar2.H = string;
            } else if (fhVar.b()) {
                String str3 = "";
                if (fhVar2.ab == 1) {
                    String a2 = a(fhVar2.x);
                    str = context2.getString(C0906R.string.iz, new Object[]{a2});
                    i2 = str.indexOf(a2) - 1;
                    i = i2 + 1 + a2.length();
                } else {
                    String str4 = "@" + a(fhVar2.x);
                    str = context2.getString(C0906R.string.a8_, new Object[]{str4});
                    if (str.endsWith(str4)) {
                        str = str + " ";
                    }
                    i2 = str.indexOf(str4);
                    i = i2 + str4.length();
                    str3 = fhVar2.y;
                }
                ArrayList arrayList2 = new ArrayList();
                if (str3 == null || fhVar2.x == null) {
                    aVTextExtraStruct = gy.a(i2, i, fhVar2.x.getUid());
                } else {
                    aVTextExtraStruct = gy.a(i2, i, fhVar2.x.getUid(), str3);
                }
                arrayList2.add(aVTextExtraStruct);
                fhVar2.I = arrayList2;
                fhVar2.H = str;
            } else {
                if (fhVar2.am != null && !TextUtils.isEmpty(fhVar2.am.getExtra())) {
                    PublishExtra publishExtra = (PublishExtra) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(fhVar2.am.getExtra(), PublishExtra.class);
                    if (publishExtra != null && !CollectionUtils.isEmpty(publishExtra.getVideoTopics())) {
                        StringBuilder sb = new StringBuilder();
                        for (String append : publishExtra.getVideoTopics()) {
                            sb.append("#");
                            sb.append(append);
                            sb.append(" ");
                        }
                        fhVar2.H = sb.toString();
                    }
                }
            }
        }
    }

    public static Intent a(ShortVideoContextViewModel shortVideoContextViewModel, int i, VideoRecordNewActivity videoRecordNewActivity) {
        com.ss.android.ugc.aweme.draft.a.d dVar;
        boolean z;
        ShortVideoContextViewModel shortVideoContextViewModel2 = shortVideoContextViewModel;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{shortVideoContextViewModel2, Integer.valueOf(i), videoRecordNewActivity}, null, f65336a, true, 74135, new Class[]{ShortVideoContextViewModel.class, Integer.TYPE, VideoRecordNewActivity.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{shortVideoContextViewModel2, Integer.valueOf(i), videoRecordNewActivity}, null, f65336a, true, 74135, new Class[]{ShortVideoContextViewModel.class, Integer.TYPE, VideoRecordNewActivity.class}, Intent.class);
        }
        fh fhVar = shortVideoContextViewModel2.f65401b;
        com.ss.android.ugc.aweme.shortvideo.a.d dVar2 = shortVideoContextViewModel2.f65401b.l;
        Intent intent = new Intent();
        intent.putExtra("workspace", dVar2);
        intent.putExtra("mp4", dVar2.c().getPath());
        if (!fhVar.a()) {
            intent.putExtra("wav", dVar2.d().getPath());
        } else {
            intent.putExtra("music_start", fhVar.g);
        }
        intent.putExtra("face_beauty", com.ss.android.ugc.aweme.port.in.a.L.b(e.a.BeautyModel));
        intent.putExtra("filter_id", 0);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", true);
        intent.putExtra("video_segment", RecordScene.timeSpeedModels2String(fhVar.m));
        intent.putExtra("hard_encode", fhVar.o);
        intent.putExtra("restore", fhVar.f67719b);
        intent.putExtra("camera", i);
        intent.putExtra("filter_lables", fhVar.O.toString());
        intent.putExtra("filter_ids", fhVar.P.toString());
        intent.putExtra("smooth_skin_labels", fhVar.Q.toString());
        intent.putExtra("smooth_reshape_labels", fhVar.R.toString());
        intent.putExtra("smooth_tanning_labels", fhVar.T.toString());
        intent.putExtra("smooth_eyes_labels", fhVar.S.toString());
        intent.putExtra("extra_aweme_speed", RecordScene.getSpeedStringByModel(fhVar.m));
        intent.putExtra("extra_is_change_speed", RecordScene.isChangeSpeed(fhVar.m));
        intent.putExtra("sticker_id", RecordScene.getStickerIdsByModel(fhVar.m));
        intent.putExtra("prop_source", RecordScene.getPropSourceByModel(fhVar.m));
        intent.putExtra("first_sticker_music_ids", RecordScene.getFirstStickerMusicIds(fhVar.m));
        intent.putExtra("shoot_way", fhVar.r);
        intent.putExtra("creation_id", fhVar.q);
        intent.putExtra("poi_struct_in_tools_line", fhVar.D);
        z findLastDoorplateLevelPoi = StickerPoiUtilsKt.findLastDoorplateLevelPoi(fhVar.m);
        if (findLastDoorplateLevelPoi == null) {
            dVar = null;
        } else {
            dVar = new com.ss.android.ugc.aweme.draft.a.d(findLastDoorplateLevelPoi);
        }
        intent.putExtra("default_select_sticker_poi", dVar);
        g.a(intent, r.b(fhVar), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.EDIT);
        intent.putExtra("draft_id", fhVar.v);
        intent.putExtra("max_duration", fhVar.f67720c);
        intent.putExtra("wav_form", fhVar.f67722e);
        intent.putExtra("video_width", fhVar.j);
        intent.putExtra("video_height", fhVar.k);
        intent.putExtra("origin", 1);
        intent.putExtra("challenge", (Serializable) a((ArrayList<TimeSpeedModelExtension>) fhVar.m, fhVar.K));
        intent.putExtra("video_title", fhVar.H);
        intent.putExtra("struct_list", (Serializable) fhVar.I);
        intent.putExtra("is_rivate", fhVar.J);
        intent.putExtra("duet_from", fhVar.y);
        intent.putExtra("duet_author", fhVar.x);
        intent.putExtra("shoot_mode", fhVar.N);
        intent.putExtra("duration_mode", fhVar.V);
        intent.putExtra("record_mode", fhVar.ab);
        intent.putExtra("record_game_score", fhVar.ac);
        intent.putExtra("reaction_params", fhVar.E);
        intent.putExtra("is_muted", fhVar.G);
        intent.putExtra("music_origin", fhVar.i);
        intent.putExtra("extract_model", fhVar.Y);
        intent.putExtra("micro_app_info", fhVar.am);
        if (videoRecordNewActivity == null || !fhVar.an) {
            z = false;
        } else {
            z = true;
        }
        intent.putExtra("enter_record_from_other_platform", z);
        if (fhVar.am == null) {
            z2 = true;
        }
        intent.putExtra("back_to_main_after_publish", z2);
        intent.putExtra("extra_import_compile_cost_time", fhVar.Z - fhVar.aa);
        intent.putExtra("extra_start_enter_edit_page", fhVar.aa);
        if (fhVar.ap != null) {
            intent.putExtra("story_festival_model", fhVar.ap);
        }
        a(fhVar);
        if (!j.a((Collection<T>) fhVar.as)) {
            intent.putStringArrayListExtra("extra_ar_text", fhVar.as);
        }
        if (!j.a((Collection<T>) fhVar.at)) {
            intent.putStringArrayListExtra("extra_sticker_text", fhVar.at);
        }
        intent.putExtra("av_et_parameter", fhVar.d());
        if (fhVar.aq != null) {
            intent.putExtra("extra_mention_user_model", fhVar.aq);
        }
        intent.putExtra("enter_from", fhVar.s);
        intent.putExtra("send_to_user_head", fhVar.ar);
        if (fhVar.av != null) {
            intent.putExtra("extra_draft_transform_model", fhVar.av);
        }
        if (fhVar.aw != null) {
            intent.putExtra("extra_ve_cher_effect_param", fhVar.aw);
        }
        return intent;
    }
}
