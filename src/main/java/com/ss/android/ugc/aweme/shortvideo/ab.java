package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.d;
import com.ss.android.ugc.aweme.ao.a.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.e.f;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.a.a;
import com.ss.android.ugc.aweme.tools.ac;
import com.ss.android.ugc.aweme.tools.as;
import com.ss.android.ugc.aweme.tools.ay;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.aweme.tools.k;
import com.ss.android.ugc.aweme.tools.l;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65448a;

    /* renamed from: b  reason: collision with root package name */
    public final a f65449b;

    /* renamed from: c  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65450c;

    public ab(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, a aVar) {
        this.f65450c = shortVideoRecordingOperationPanelFragment;
        this.f65449b = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65448a, false, 73963, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65448a, false, 73963, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != k.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65451a;

                private Pair<String, String> a(JSONObject jSONObject) {
                    String str;
                    String str2;
                    JSONObject jSONObject2 = jSONObject;
                    if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f65451a, false, 73965, new Class[]{JSONObject.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f65451a, false, 73965, new Class[]{JSONObject.class}, Pair.class);
                    }
                    try {
                        str = jSONObject2.getString("shoot_way");
                        try {
                            str2 = jSONObject2.getString("creation_id");
                        } catch (JSONException unused) {
                            str2 = "";
                            return new Pair<>(str, str2);
                        }
                    } catch (JSONException unused2) {
                        str = "";
                        str2 = "";
                        return new Pair<>(str, str2);
                    }
                    return new Pair<>(str, str2);
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ Unit a(e eVar) {
                    boolean z;
                    long a2;
                    long j;
                    String str;
                    e eVar2 = eVar;
                    if (ab.this.f65449b != null) {
                        ab.this.f65449b.a(eVar2.f33633b, eVar2.f33634c, eVar2.f33635d, eVar2.f33636e);
                    }
                    ad adVar = new ad(eVar2, ab.this.f65450c);
                    if (PatchProxy.isSupport(new Object[0], adVar, ad.f65455a, false, 73967, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], adVar, ad.f65455a, false, 73967, new Class[0], Void.TYPE);
                    } else if (adVar.f65457c.f33633b.booleanValue()) {
                        if (PatchProxy.isSupport(new Object[0], adVar, ad.f65455a, false, 73968, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], adVar, ad.f65455a, false, 73968, new Class[0], Void.TYPE);
                        } else {
                            fh fhVar = adVar.f65458d.r().f65401b;
                            if (PatchProxy.isSupport(new Object[0], fhVar, fh.f67718a, false, 74580, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], fhVar, fh.f67718a, false, 74580, new Class[0], Void.TYPE);
                            } else {
                                fhVar.i = null;
                                if (fhVar.b()) {
                                    str = fhVar.A;
                                } else if (fhVar.c()) {
                                    str = fhVar.E.wavPath;
                                } else {
                                    str = null;
                                }
                                fhVar.f67723f = str;
                                if (!TextUtils.isEmpty(fhVar.f67723f)) {
                                    fhVar.l.a(new File(fhVar.f67723f));
                                } else {
                                    fhVar.l.f();
                                }
                                fi.a(fhVar);
                                fhVar.h = (int) fhVar.f67720c;
                                fhVar.f67722e = null;
                            }
                            ac acVar = new ac(fhVar.f67720c);
                            adVar.f65458d.q().a((Object) adVar, (bc) acVar);
                            adVar.f65458d.k().a((Object) adVar, (bc) acVar);
                            i iVar = new i();
                            adVar.f65458d.q().a((Object) adVar, (bc) iVar);
                            adVar.f65458d.k().a((Object) adVar, (bc) iVar);
                        }
                    } else if (!TextUtils.isEmpty(adVar.f65457c.f33636e)) {
                        if (PatchProxy.isSupport(new Object[0], adVar, ad.f65455a, false, 73969, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], adVar, ad.f65455a, false, 73969, new Class[0], Void.TYPE);
                        } else {
                            String str2 = adVar.f65457c.f33636e;
                            e eVar3 = adVar.f65457c.f33635d;
                            String str3 = adVar.f65457c.f33634c;
                            boolean z2 = adVar.f65458d.r().f65401b.V;
                            long a3 = new com.ss.android.ugc.aweme.shortvideo.e.i().a(str2);
                            if (!cz.a()) {
                                a2 = adVar.a(false, a3);
                                if (adVar.f65459e == null) {
                                    adVar.f65459e = (RecordToolbarViewModel) ViewModelProviders.of(adVar.f65458d.getActivity()).get(RecordToolbarViewModel.class);
                                }
                                adVar.f65459e.g.setValue(new ay(true, true));
                                adVar.f65458d.r().f65401b.V = false;
                            } else {
                                if (!f.a() || !z2) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                a2 = adVar.a(z, a3);
                            }
                            long j2 = a2;
                            adVar.f65458d.r().f65401b.i = str3;
                            adVar.f65458d.r().f65401b.f67723f = str2;
                            adVar.f65458d.r().f65401b.f67720c = j2;
                            if (adVar.f65458d instanceof PlanC) {
                                ((PlanC) adVar.f65458d).L = ej.a().b();
                            }
                            if (eVar3 != null) {
                                if (!(adVar.f65458d.getActivity() == null || !(adVar.f65458d.getActivity() instanceof VideoRecordNewActivity) || ((VideoRecordNewActivity) adVar.f65458d.getActivity()).o == null)) {
                                    ((VideoRecordNewActivity) adVar.f65458d.getActivity()).o.f66618e = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(eVar3);
                                }
                                if (adVar.f65458d != null) {
                                    adVar.f65458d.Z = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(eVar3);
                                }
                            }
                            if (com.ss.android.g.a.b()) {
                                j = j2;
                                if (PatchProxy.isSupport(new Object[]{0}, adVar, ad.f65455a, false, 73971, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{0}, adVar, ad.f65455a, false, 73971, new Class[]{Integer.TYPE}, Void.TYPE);
                                } else {
                                    adVar.f65458d.k().a((Object) adVar.f65458d, (bc) new as(0));
                                }
                            } else {
                                j = j2;
                            }
                            l lVar = new l(eVar3, str2);
                            adVar.f65458d.q().a((Object) adVar, (bc) lVar);
                            adVar.f65458d.k().a((Object) adVar, (bc) lVar);
                            if (adVar.f65458d instanceof PlanC) {
                                ((RecordTitleViewModel) com.ss.android.ugc.gamora.a.a.a(adVar.f65458d.getActivity()).get(RecordTitleViewModel.class)).f77610f.setValue(null);
                            }
                            ac acVar2 = new ac(j);
                            adVar.f65458d.q().a((Object) adVar, (bc) acVar2);
                            adVar.f65458d.k().a((Object) adVar, (bc) acVar2);
                        }
                    }
                    return null;
                }

                public final void a(Object obj, T t) {
                    Serializable serializable;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65451a, false, 73964, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65451a, false, 73964, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    JSONObject t2 = ab.this.f65450c.t();
                    r.onEvent(MobClick.obtain().setEventName("change_music").setLabelName("shoot_page").setJsonObject(t2));
                    Bundle bundle = new Bundle();
                    VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) ab.this.f65450c.getActivity();
                    if (videoRecordNewActivity == null || videoRecordNewActivity.F == null) {
                        if (videoRecordNewActivity != null && videoRecordNewActivity.f4034c != null && videoRecordNewActivity.f4034c.m != null && videoRecordNewActivity.f4034c.m.size() > 0) {
                            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) videoRecordNewActivity.f4034c.m.get(0);
                            if (timeSpeedModelExtension != null && !CollectionUtils.isEmpty(timeSpeedModelExtension.getStickerMusicIds())) {
                                bundle.putString("first_sticker_music_ids", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) timeSpeedModelExtension.getStickerMusicIds()));
                                bundle.putString("first_sticker_id", timeSpeedModelExtension.getStickerId());
                            }
                            if (!(timeSpeedModelExtension == null || timeSpeedModelExtension.getHashtag() == null)) {
                                bundle.putString("challenge", timeSpeedModelExtension.getHashtag().cid);
                            }
                        } else if (!(videoRecordNewActivity == null || videoRecordNewActivity.k == null || videoRecordNewActivity.k.g == null)) {
                            List<String> musicIds = videoRecordNewActivity.k.g.getMusicIds();
                            if (musicIds != null && musicIds.size() > 0) {
                                bundle.putString("first_sticker_music_ids", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) musicIds));
                                bundle.putString("first_sticker_id", videoRecordNewActivity.k.g.getStickerId());
                            }
                            if (!(videoRecordNewActivity.k == null || videoRecordNewActivity.k.x == null)) {
                                bundle.putString("challenge", videoRecordNewActivity.k.x.cid);
                            }
                        }
                    }
                    if (ej.a().f67529b.size() > 0) {
                        bundle.putString("challenge", ej.a().f67529b.get(0).cid);
                    }
                    if (videoRecordNewActivity == null) {
                        serializable = null;
                    } else {
                        serializable = videoRecordNewActivity.F;
                    }
                    bundle.putSerializable("sticker_music", serializable);
                    Pair<String, String> a2 = a(t2);
                    com.ss.android.ugc.aweme.port.in.a.i.a((Fragment) ab.this.f65450c, 110, d.h.a(ab.this.f65450c.getString(C0906R.string.rw), 2, true, bundle, (String) a2.first, (String) a2.second), (Function1<? super e, Unit>) new ac<Object,Unit>(this), (Function0<Unit>) null);
                }
            };
        }
    }
}
